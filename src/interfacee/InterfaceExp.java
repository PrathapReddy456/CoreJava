package interfacee;

interface Abc{
	
	void show();
}

interface Aabc{
	
	void eat();
}

interface Abcd extends Abc, Aabc{
	
	void play();
}


class Abcimpl implements Abc, Abcd{
	public void show() {
		
		System.out.println("Show for");
	}
	
	public void play() {
			
			System.out.println("play for");
		}
	
	public void eat() {
		
		System.out.println("eat");
	}
}



public class InterfaceExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Object Creation for class
		Abcimpl aimp = new Abcimpl();
		aimp.play();
		
		// Without class run interface by anonymous class
		
		Abc obj1 = new Abc() {
			public void show() {
				System.out.println("Show");
			}
		};
		
		obj1.show();
	
	
	//Above code with Functional Interface by Java 8 (Lambda Expressions)

	Abc obj2 = () -> System.out.println("Shown");
		obj2.show();
	}
}
