package ass_1;

public class Cse implements Chain{
    private  Chain nextInChain;
	
	// Defines the next Object to receive the
	// data if this one can't use it
	
	public void setNextChain(Chain nextChain) {
		
		nextInChain = nextChain;
		
	}

	// Tries to calculate the data, or passes it
	// to the Object defined in method setNextChain()
	
	public void calculate(Numbers request) {
		
		if(request.getPhysice() >=6 || request.getMath()>=6){
			
			System.out.print("\n \n ----------------------------");
			System.out.print("Subject you can  Choose ");
			System.out.print("-------------------------------\n \n");
			System.out.print("Computer Science & Engineering\n");
			
		} else{
			nextInChain.calculate(request);
		}
			
			
	}
   
}

