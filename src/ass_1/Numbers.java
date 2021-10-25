package ass_1;

public class Numbers {
    
    private int physicsNumber;
	private int chemistryNumber;
	private int mathNumber;
	private int biologyNumber;
	private int ictNumber;
	
	//private String calculationWanted;
	
	public Numbers(int physicsNumber, int chemistryNumber, int mathNumber, int biologyNumber, int ictNumber){
		
		this.physicsNumber = physicsNumber;
		this.chemistryNumber = chemistryNumber;
		this.mathNumber = mathNumber;
		this.biologyNumber = biologyNumber;
		this.ictNumber = ictNumber;
		//calculationWanted = calcWanted;
		
	}
	
	public int getPhysice(){ return physicsNumber; }
	public int getchemistry(){ return chemistryNumber; }
	public int getMath(){ return mathNumber; }
	public int getBiology(){ return biologyNumber; }
	public int getIct(){ return ictNumber; }
	
}

