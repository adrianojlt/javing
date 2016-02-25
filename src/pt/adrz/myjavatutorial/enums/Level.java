package pt.adrz.myjavatutorial.enums;

public enum Level {
	
	HIPER(6), MEGA(5), SUPER(4), NORMAL(3);
	
	private final int level;

	private Level(int level) {
		this.level = level;
	}
	
	public int getLevelCode() {
		return this.level;
	}
}
