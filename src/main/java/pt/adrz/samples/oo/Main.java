package pt.adrz.samples.oo;

public class Main {

	public static void main(String[] args) {
		
		Cenas cenas = new Cenas();

		System.out.println(cenas.nome);
		//Coisas coisas = new Coisas(cenas);
		//coisas.change();
		change(cenas);
		System.out.println(cenas.nome);

		
	}
	
	public static void change(Cenas cenas) {
		cenas = new Cenas();
		cenas.nome = "asdf";
	}
}

class Cenas {
	public String nome = "Alex";
	
}

class Coisas {
	private Cenas cenas;

	public Coisas(String name) {
		cenas = new Cenas();
		cenas.nome = "asdf";
	}

	public Coisas(Cenas cenas) {
		this.cenas = cenas;
	}
	
	public void change() {
		cenas.nome = new String("martinho0");
	}
}


