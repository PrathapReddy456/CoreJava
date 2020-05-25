package loops;

public class WhileDoWhileLoop {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		int  i = 2;
	
		//While
		while(i<=5) {
			System.out.println("Hello");
			i++;
		}
		
		//Do While
		
		do {
			
			System.out.println("Hello");
			i++;
		
		}while(i<=5);
		
		
		char ch; int x = 97;
		
		do {
			ch= (char)x;
			System.out.println(ch + "");
			if(x/10 ==0)
				break;
			++x;
		
		}while(x<=100);	
	
	}

}
