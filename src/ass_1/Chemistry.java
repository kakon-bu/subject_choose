package ass_1;

public class Chemistry implements Chain{
    
    private  Chain nextInChain;
	
	@Override
	public void setNextChain(Chain nextChain) {
		
		nextInChain = nextChain;
		
	}

	@Override
	public void calculate(Numbers request) {
		
		if(request.getchemistry() > 5){
			
			System.out.print("Chemistry\n");
			
		}
			
			nextInChain.calculate(request);
		
		
	}

	
	
}

