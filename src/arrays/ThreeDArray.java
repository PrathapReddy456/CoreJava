package arrays;

public class ThreeDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c[][][] = new int[4][4][4];
			
				for(int i=0; i<4; i++) {
					
					for(int j=0; j<4; j++) {
						
						for(int k=0; k<4; k++) {
							
							System.out.print(" "+c[i][j][k]);
							
						}
						
					}
					
				}
				
				//Using Enhance For Loop
				
				for(int i[][]:c) 
				{
					for(int j[]:i) 
					{
						for(int k:j) 
						{
							System.out.print(" "+k);
						}
					}
				}
	}

}
