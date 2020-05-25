package loops;

public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Continue..> It break particular Iteration
		for(int i=1; i<=10; i++) {
			
			if(i==7)
			{
				continue;
			}
			System.out.println("Vlaue of I "+i);
		}
		
		//Break --> It completely Break the loop
		
		for(int j=1; j<=10; j++) {
			
			if(j >= 2)
			{
				break;
			}
			System.out.println("Vlaue of J  "+j);
		}

	}

}
