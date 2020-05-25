package basics;

import java.io.IOException;
import java.util.*;

public class InputScanner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter a: ");
		System.out.println("Enter b: ");
		Scanner sc = new Scanner(System.in);
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		int Sum = no1+no2;
		System.out.println("Sum Of Two Numbers:: " + Sum);

	
	//ReadMethod
		
		int i = System.in.read();
		//To get exact value use Char otherwise it gives ASCII value
		//Char print only 1 char at a time
		
		System.out.println((char)i);
	
	//Use Scanner(Above)/ BufferReader to more advance
	
	}

}
