package arrays;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	int a[][] = new int[3][3];
		
		int b[][] = {
				{11,12,13},
				{18,19,20},
				{43,44,45}
		};
		
	//With Regular Forloop
//		for(int i=0; i<3; i++) {
//			
//			for(int j=0; j<3; j++) {
//				
//				System.out.print(b[i][j]+ " ");
//			}
//			
//			System.out.println(" ");
//		}
		
	//With Enhance For Loop
		
		for(int i[] : b) {
			for(int j: i) { 
				System.out.print(j+ " ");
			}
			
			System.out.println(" ");
		}

	}

}
