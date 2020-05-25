package basics;

public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A obj1 = new A();
		B obj2 = new B(5);
	}

}

//Super Method:

class A{
	
	public A() {
		System.out.println("In Con A");
	}
	
	public A(int i) {
		System.out.println("In Con A Int");
	}
}

class B extends A{
	
	public B() {
		System.out.println("In Con B");
	}
	
	public B(int i) {
		super(i);
		System.out.println("In Con B Int");
	}
	
}

//Super Variable:

class c{
	int i =5;
}
class d extends c{
	
	int i =4;
	public void show() {
		System.out.println(super.i);
	}
}