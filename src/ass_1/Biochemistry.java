package ass_1;

public class Biochemistry implements Chain{
    private  Chain nextInChain;
	
	@Override
	public void setNextChain(Chain nextChain) {
		
		nextInChain = nextChain;
		
	}

	@Override
	public void calculate(Numbers request) {
		
		if(request.getBiology() > 5){
			
			System.out.print("Bio-Chemistry\n");
            
			
		}
			
		nextInChain.calculate(request);
		
	}

	
	
}
