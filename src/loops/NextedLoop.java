package loops;

public class NextedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				
				System.out.print(j+ " ");
			}
			
			System.out.println();
		}

		//1, 1 2, 1 2 3
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				
				System.out.print(j+ " ");
			}
			
			System.out.println();
		}
		
		//5, 5 4, 5 4 3.....
		for(int i=5; i>=1; i--) {
			for(int j=5; j>=i; j--) {
				
				System.out.print(j+ " ");
			}
			
			System.out.println();
		}
		
		//5, 4 4, 3 3 3.....
				for(int i=5; i>=1; i--) {
					for(int j=5; j>=i; j--) {
						
						System.out.print(i+ " ");
					}
					
					System.out.println();
				}


	}

}
