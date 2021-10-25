package ass_1;

import java.util.Scanner;

public class Test {
	
	    public static void main(String[] args){
			
			// Here I define all of the objects in the chain
			
			Chain cseChain = new Cse();
			Chain mathChain = new Math();
			Chain chemChain = new Chemistry();
			Chain phyChain = new Physice();

			Chain geoChain = new Geology();
			Chain statChain = new Statistics();
			Chain soilChain = new Soil();
			Chain botanyChain = new Botany();

			Chain costalChain = new Costal();
			Chain biochemChain = new Biochemistry();
			
			
			// Here I tell each object where to forward the
			// data if it can't process the request
			
			cseChain.setNextChain(mathChain);
			mathChain.setNextChain(chemChain);
			chemChain.setNextChain(phyChain);

			phyChain.setNextChain(geoChain);
			geoChain.setNextChain(statChain);
			statChain.setNextChain(soilChain);

			soilChain.setNextChain(botanyChain);
			botanyChain.setNextChain(costalChain);
			costalChain.setNextChain(biochemChain);
			
			// Define the data in the Numbers Object
			// and send it to the first Object in the chain

				Scanner scanner= new Scanner(System.in);    
				System.out.print("Enter Physice number- ");  
				int phy= scanner.nextInt();  
				System.out.print("Enter Chemistry number- ");  
				int chem= scanner.nextInt();  
				System.out.print("Enter Math number- ");  
				int matH= scanner.nextInt();  
				System.out.print("Enter Biology number- ");  
				int biology= scanner.nextInt();  
				System.out.print("Enter ICT number- ");
				int ict= scanner.nextInt();   
				scanner.close(); 
			
			Numbers request = new Numbers(phy,chem,matH,biology,ict);
			
			cseChain.calculate(request);
			
		}

	}



