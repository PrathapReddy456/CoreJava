package basics;


class Calcc{
	
	int num1;
	int num2;
	int result;

	public void perform(int num1, int num2){
		
		this.num1 = num1;
		this.num2 = num2;
		this.result= num1 + num2;
		
	}
	
}

public class ThisKeyword {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calcc obj = new Calcc();
		
		obj.num1 = 4;
		obj.num2 = 5;
		obj.perform(4,5);
		System.out.println(obj.result);
		
		
	}

}
