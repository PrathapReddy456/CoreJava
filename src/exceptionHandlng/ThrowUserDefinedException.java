package exceptionHandlng;

public class ThrowUserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int i = 5;
	
	try {
	if(i<10) {
		
		throw new Exception();
	}
	
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
	}

}
