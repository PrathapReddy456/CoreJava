package basics;

import java.util.ArrayList;

public class WrapperClass {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 6;
		
		Integer in = new Integer(i); //Boxing
		Integer ini = i; //Auto Boxing
		
		int j = in.intValue(); //UnBoxing
		int jj = in; //Auto UnBoxing;

		
		//We use this in ArrayList
		
		ArrayList<Integer> intg = new ArrayList<Integer>();
		intg.add(6);
		intg.add(8);
		
	}

}
