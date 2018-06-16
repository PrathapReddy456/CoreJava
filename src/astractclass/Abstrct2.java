package astractclass;

 class Abstrct2 extends Abstrct1 // concrete Class
 {


	public void dance() 
	{
		
		System.out.println("Abstrct2 can dance");
	}

	
	public void swim() 
	{

	
		System.out.println("Abstrct2 can swim");
}
	
	public static void main(String[] args)
	{
	
		Abstrct2 obj =  new Abstrct2();
		
		obj.Sing();
		obj.dance();
		obj.swim();
		
 }
	
}