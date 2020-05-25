package interfacee;

interface colg{
	
	//In Java 8, we can implements methods in Interface by default
	default void sports() {
		
		System.out.println("Test SPorts");
	}
	
}

interface school{
	
	void tution(); 
	
	default void sports() {
		
		System.out.println("Test SPorts");
	}
}

interface playschool{ 
		
	//We can use lambda expression like below to implement
		 void games();
}

interface Office{ 
	
	 default void torcher() {
		 System.out.println("Trcher interface");
	 }
}


class university  implements colg, school{
	
	
	public void tution() {
			
			System.out.println("For tution");
		}
	// WHen we have same method in both interfaces, we have to implement (OverRide) method in Class again
	
	public void sports() {
		
		System.out.println("sports");
	}
	
	
	//We have same method in Interface, to show class high power
	public void torcher() {
		 System.out.println("Trcher class");
	 }
}



public class Java8Interface extends university implements  Office{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	//Functional Interface by Java 8 (Lambda Expressions) without separate implementation, when we have single statement

		playschool obj2 = () -> System.out.println("Games");
		obj2.games();
		
	// When we have same method implementation in Class and Interface., high priority goes to class
		
		Java8Interface obj8 = new Java8Interface();
		obj8.torcher();
	}
}
