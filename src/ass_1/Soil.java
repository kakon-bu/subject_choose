package ass_1;

public class Soil implements Chain{
    
    private  Chain nextInChain;
	
	@Override
	public void setNextChain(Chain nextChain) {
		
		nextInChain = nextChain;
		
	}

	@Override
	public void calculate(Numbers request) {
		
		if(request.getchemistry() >= 6){
			
			System.out.print("Soil & Environment Science\n");
			
		}
			
			nextInChain.calculate(request);
			
		
	}

	
	
}

