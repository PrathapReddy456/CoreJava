package basics;
class Outer{
	int a;
	
	public void outershow() {
		
		
	}

//Member Class
class Inner1{ //Outer$Inner.class
	int b;
	
	public void innerShow(String ab) {
		System.out.println(ab);
		
	}
}

//Static Class:
static class Inner2{ //Outer$Inner.class
	int c;
	
	public void innerShow2(String st) {
		System.out.println(st);
		
	}
}
}

public class InnerClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer oc = new Outer();
		//To create objects of Member inner class have to use outer class
			Outer.Inner1 ic =  oc.new Inner1();
			ic.innerShow("Name");
		
		//To create objects of Member inner class have to use outer class
			Outer.Inner2 ic2 =  new Outer.Inner2();
			ic2.innerShow2("Name");

	}

}
