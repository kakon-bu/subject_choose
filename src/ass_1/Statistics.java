package ass_1;


public class Statistics implements Chain {
	    
	    private  Chain nextInChain;
		
		@Override
		public void setNextChain(Chain nextChain) {
			
			nextInChain = nextChain;
			
		}

		@Override
		public void calculate(Numbers request) {
			
				
				System.out.print("Statistics\n");
				nextInChain.calculate(request);
			
		}	
		
	}



