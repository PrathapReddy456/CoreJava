package Comexm;

public class Examm {
	
	// Creating add method without parameters
	public void add() 
	{
		System.out.println("value of add");
		
	}
	
	// Here overloaded add method with an int parameter
	
	public void add(int i)
	{
  int  j = 10;
  
  int k = i+j;
   
   System.out.println("Value of i is "+k);
    
}

	// Here over loaded  add method with two parameters
	
	public void add(double i, int m)
	{
		double n = i+m;
		
		System.out.println("Value of n is " +n);
	
	}
	
	public static void main(String[] args) {
		
		Examm obj = new Examm();
		
		obj.add();
		obj.add(20);
		obj.add(2.45, 3);
		
	}

}
