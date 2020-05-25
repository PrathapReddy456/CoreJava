package basics;

class Calc{
	
	int num1;
	int num2;
	int result;

	public void perform(){
		
		result= num1 + num2;
		
	}
	
}
public class ObjectsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calc obj = new Calc();
		
		obj.num1 = 4;
		obj.num2 = 5;
		obj.perform();
		System.out.println(obj.result);
		
	}

}
