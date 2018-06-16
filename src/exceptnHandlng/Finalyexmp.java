package exceptnHandlng;

public class Finalyexmp {
	
	int i= 10;
	
	int j = 0;

	public static void main(String[] args) {
		examp1();
	}

	public static void examp1()
	{
		try {
			
			System.out.println("try blck");
			
			throw new RuntimeException ("exapmp");
		}
		
		catch(Exception e)
		{
		
		System.out.println("catch blck");
		}
		
		finally
		{
			System.out.println("finally excuted");
		}
	}
}
