package basics;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter A number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean NumberisPrime = true;
		
		for(int i=2; i<Math.sqrt(n); i++) {
			
			if(n%i==0) {
				NumberisPrime = false;
				break;
			}
				
		}
		
		if(NumberisPrime) {
			System.out.println(n + "Is Prime");
		}else {
			System.out.println(n + "Is not Prime");
		}
		
		
		

	}

}
