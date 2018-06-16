package practice;

public class Aarray {


	
	int a[] = new int[12];
	
public void run() {
	a[0] = 31;
	a[1]= 28;
	a[2]= 31;
	a[3]= 30;
	a[4]= 31;
	a[5]= 30;
	a[6]= 31;
	a[7]= 31;
	a[8]= 30;
	a[9]= 31;
	a[10]= 30;
	a[11]= 31;
	
		for (int i=0; i<a.length;i++)
		{
		System.out.println("days are:"+a[i]);	
		}
	
}	

	public static void main(String[] args) 
	{
				
				Aarray obj = new Aarray();	
				obj.run();

	}

}


