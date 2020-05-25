package strngcls;

import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String FName, LName;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 strings");
		FName = sc.nextLine();
		LName = sc.nextLine();
		
		//Step1
		int Flen = FName.length();
		int Llen = LName.length();
		
		//Step2
		
		String FUp = FName.toUpperCase();
		String LUp = LName.toUpperCase();
		
		//Step3
		System.out.println(Flen +"  "+Llen);
		String FullName = FName.concat(LName);  //(FName +" "+ LName); 
		System.out.println(FullName);
		


	}

}
