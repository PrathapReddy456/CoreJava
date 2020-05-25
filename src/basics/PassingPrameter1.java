package basics;

public class PassingPrameter1 {
	public void paramtr(int a, int b)
	{
		
		int c = a+b;
		
		System.out.println("addition is "+c);
				
	}
	
	public static void main(String [] args) {
		
	
	PassingPrameter1 obj = new PassingPrameter1();
	
	obj.paramtr(20,30);
	
}
}




