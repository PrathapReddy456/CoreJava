package loops;

import java.util.Random;

public class EnhanceForLoop {
	
	//When we would like to get all elements without index

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int values[] = {5,7,8,9,10};
		for(int i: values) {
			System.out.println(i);
		}
	
	//Enhance For Loop Using Random Class.	
		
		Random r = new Random();
		int a [] = new int[50];
		for(int i=0; i<a.length;i++) {
			a[i]=r.nextInt(50);
		}
		
		for(int i: a) {
			System.out.println(i);
		}

	}

}

