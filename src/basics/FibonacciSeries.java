package basics;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 1, b=1;
		int c=0;
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.print("1 1 ");
		while(c<=n) {
			 c = a+b;
			 if(c>=n) 
				break;
			 System.out.print(c + "  ");
			 a=b;
			 b=c;
			
		}
		
		
	}

}
