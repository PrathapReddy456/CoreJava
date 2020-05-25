package basics;

public class VarArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VarArgs obj = new VarArgs();
		obj.vararg(5,7,9);

	}
	
	public void vararg(int... a) {
		for(int i:a) {
			System.out.println(i);
		}
		
	}

}
