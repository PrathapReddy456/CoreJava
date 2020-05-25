package basics;

public class PassingPrameter2 {
	
	public int paramtr(int a, int b)
	{
		int c = a+b;
		
		return c;
	}
	

	public static void main(String[] args)
	{
	
		PassingPrameter2 obj = new PassingPrameter2();
		
		int sum = obj.paramtr(20, 18);
		
		System.out.println("otput is "+sum);
		
	}

}



