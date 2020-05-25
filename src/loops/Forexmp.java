package loops;

public class Forexmp {
	
	int i;
	
	public void Even() {
		

			for( i=0; i<=10; i++) {
				
				System.out.println("" +i );
			}

			for( i=0; i<=10; i++)

			
			if ( i % 2 == 0)
			{
			
			
			System.out.println("even number" +i);
			}
			
			else if (i % 2 == 1)
			
			{
				
				System.out.println("odd numbers"+i);
			
			
		}
	}

	public static void main(String[] args) {
		
		Forexmp obj= new Forexmp();
		
		obj.Even();
	}

	}


