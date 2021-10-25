package ass_1;

public class Math implements Chain{
    
    private  Chain nextInChain;
	
	@Override
	public void setNextChain(Chain nextChain) {
		
		nextInChain = nextChain;
		
	}

	@Override
	public void calculate(Numbers request) {
		
		if(request.getMath() >= 6){
			
			System.out.print("Math\n");
			
		} 
			
			nextInChain.calculate(request);
			

		
	}

	
	
}

