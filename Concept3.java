package simplegraphconcepts;

public class Concept3 {

	private final int CONSTANT_VAR=20;
	private Concept2 conceptCircle[];
	private int adjCircles[][];
	private int circleTracker;
	private Concept1 concept1;
	
	public Concept3() {
		conceptCircle=new Concept2[CONSTANT_VAR];
		adjCircles= new int[CONSTANT_VAR][CONSTANT_VAR];
		circleTracker=0;
		for(int i=0;i<CONSTANT_VAR;i++)
			for(int j=0;j<CONSTANT_VAR;j++)
				adjCircles[i][j]=0;
		concept1=new Concept1();		
	}
	
	public void addConcept3(char circlecontent) {
		conceptCircle[circleTracker++]=new Concept2(circlecontent);
	}
	
	public void connectCircle(int i, int j) {
		adjCircles[i][j]=1;
		adjCircles[j][i]=1;
	}

	
	public void displayCircleContent(int i) {
		System.out.print(conceptCircle[i].circlecontent);
	}
	public void conceptforfind() {
		conceptCircle[0].circleConnected=true;
		displayCircleContent(0);
		concept1.conceptualPush(0);
		while(!concept1.isEmpty()) {
			int z=getUnconnectedCircles(concept1.conceptualpeek());
			if(z==-1) 
				concept1.conceptualRemove();
			
			else {
				conceptCircle[z].circleConnected=true;
				displayCircleContent(z);
				concept1.conceptualPush(z);
			}
				
		}
		for(int j=0;j < circleTracker;j++)
			conceptCircle[j].circleConnected=false;
		
	}
	
	
	
	public int getUnconnectedCircles(int i) {
		for(int j=0;j<circleTracker;j++)
			if(adjCircles[i][j]==1 && conceptCircle[j].circleConnected==false)
				return j;
		return -1;
	
	}
	
}
