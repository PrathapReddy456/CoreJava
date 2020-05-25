package encasulation;

public class EncapExmp2 {

	public static void main(String[] args) 
	{
		
		EncapExmp1 obj= new EncapExmp1();
		
		obj.setEmpid(1004);
		
		obj.setEmpname("Prathap");
		
		obj.setEmpdept("Computer Science");
		
		
		System.out.println("Id is : " +obj.getEmpid());
		
		System.out.println("Name is : " +obj.getEmpname());
		
		System.out.println("Dept is : " +obj.getEmpdept());
		
		
		
		

	}

}
