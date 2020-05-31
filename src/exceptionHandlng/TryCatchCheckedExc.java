package exceptionHandlng;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryCatchCheckedExc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, j=1, k=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		i = 8;
		try {
		j = Integer.parseInt(br.readLine());
		k=i/j;
		}
		catch(IOException e){
			
			System.out.println(e + "Some IO Error");
			
		}
	}

}
