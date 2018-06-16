package Examples3;

public class Pssingpara2 {
	
	public int paramtr(int a, int b)
	{
		int c = a+b;
		
		return c;
	}
	

	public static void main(String[] args)
	{
	
		Pssingpara2 obj = new Pssingpara2();
		
		int sum = obj.paramtr(20, 18);
		
		System.out.println("otput is "+sum);
		
	}

}
