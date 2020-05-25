package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderExp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a Number");
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in);
		
		int n = Integer.parseInt(br.readLine());
		System.out.println(n);

	}

}
