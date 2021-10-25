package ass_1;

public class Geology implements Chain{
    
    private  Chain nextInChain;
	
	@Override
	public void setNextChain(Chain nextChain) {
		
		nextInChain = nextChain;
		
	}

	@Override
	public void calculate(Numbers request) {
		
		if(request.getPhysice() >=6){
			
			System.out.print("Geology & Mining\n");
			
		} 
			
			nextInChain.calculate(request);
			
		
	}

	
	
}

