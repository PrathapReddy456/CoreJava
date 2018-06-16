package inheritencee;

public class Employee extends College {
	
	String Name = "Thrmal";
	
	String Subject1 = " Signals";
	
	String Subject2 = "Wirless";
	
	
	public void Name()
	
	{
		System.out.println("Employee Name is" +Name);
		
	}

	
	public void Subject1()
	
	{
		System.out.println("Employee Subject1 is " +Subject1);
	}
	
	public void Subject2()
	
	{
		System.out.println("Employee Subject2 is " +Subject2);
	}
	

	public static void main(String[] args) 
	{
		
		Employee obj1= new Employee();
		
		obj1.Subject2();
		
		obj1.Deprt1();
		
		
	}


}
