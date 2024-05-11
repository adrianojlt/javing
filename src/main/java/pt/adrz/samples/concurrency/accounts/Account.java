package pt.adrz.samples.concurrency.accounts;

public class Account {

	int balance = 100;

	public Account(int balance) {
		this.balance = balance;
	}

	public synchronized void deposit(int amount) {
		balance += amount;
	}

	public synchronized boolean withdraw(int amount) {

		if (balance >= amount) {

			balance -= amount;
			return true;
		}

		return false;
	}

	public synchronized boolean transfer(Account destination, int amount) {

		if (balance >= amount) {

			balance -= amount;

			synchronized (destination) {
				destination.balance += amount;
			};

			return true;
		}

		return false;
	}

	public int getBalance() {
		return balance;
	}
}
