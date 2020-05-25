package basics;

public class PolindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 456;
		int t = n;
		int r;
		int s =0;
		
		while(n>0) {
			
			r = n/10;
			n = n/10;
			s = s*10+r;
			System.out.println(s);
		}
		
		
		if(t ==n) {
			System.out.println("This is an Palindrome "+ t  +s);
		}else {
			
			System.out.println("This is not a Palindrome "+ t +s);
		}

	}

}
