package basics;

class Emp{
	int id;
	int age;
	static String Ceo;
	
// Static block execute first then objects, and executes only 1 for class. And it's values same for all.
static{
	Ceo="Java";
}

//We can use constructor like below when we would like to assign same values for all objects, Constructor executes for each object in class.	
public Emp(){
	id = 8;
	age = 20;
}

public void show() {
	
	System.out.println(id + "  " + age + " "+ Ceo);
}

	
}
public class StaticExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp emp1 = new Emp();
		Emp emp2 = new Emp();
		
//We can use like below when we would like to assign diff values
//		emp1.id= 9;
//		emp2.id =10;
//		emp1.age = 20;
//		emp2.age=30;
//		emp1.Ceo ="Test";
		
		emp1.show();
		emp2.show();

	}

}
