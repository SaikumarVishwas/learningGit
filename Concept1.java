package simplegraphconcepts;

public class Concept1 {
	private final int CONSTANT_VAR=20;
	private int[] concept1;
	private int firstvaluetracker;
	
	public Concept1() {
		concept1 = new int[CONSTANT_VAR];
		firstvaluetracker=-1;
	}
	
	public void conceptualPush(int conceptcontent) {
		concept1[++firstvaluetracker]=conceptcontent;
	}
	
	public int conceptualRemove() {
		return concept1[firstvaluetracker--];
	}
	
	public int conceptualpeek() {
		return concept1[firstvaluetracker];
	}
		public boolean isEmpty() {
		return (firstvaluetracker == -1);
	}
	
}
	

