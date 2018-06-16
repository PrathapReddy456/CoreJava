package interfface;

public class Scintfcal implements Calcy 
{

	int j= x; 
	
	public void sin()
	{
		System.out.println("The sin is there");
	}


	public void cos()
	{
		System.out.println("The cos is there");
	}
	
	public void add() 
	{
		System.out.println("it adds");
	}

	public void sub() 
	{
		System.out.println("it subs");
	}


	public void mul() 
	{
		
		System.out.println("it multpls");
	}



public static void main(String[] args)
{

	Scintfcal obj = new Scintfcal();
	
	obj.sin();
	
	obj.cos();
	
	obj.add();
	
	obj.mul();
	
	obj.sub();
}
}