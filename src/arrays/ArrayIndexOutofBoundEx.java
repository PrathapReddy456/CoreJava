package arrays;

public class ArrayIndexOutofBoundEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[5];
		a[0] = 2;
		a[1] = 3;
		a[2] = 4;
		a[3] = 5;
		a[4] = 6;
		
		try {
		System.out.println(a[6]);
		}
		catch(Exception e){
			System.out.println("Give Index Value With In Array boundary");
			
		}

	}

}
