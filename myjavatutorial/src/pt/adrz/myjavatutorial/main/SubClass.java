package pt.adrz.myjavatutorial.main;

public class SubClass extends MainClass{
	private int 	subField01;
	protected int 	shadowedVar;
	
	public void subTask() {
		shadowedVar = 20;
		super.shadowedVar = 200.20;
	}
}
