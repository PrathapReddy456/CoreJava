package basics;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long l = 52786; // 8 bytes
		int i = 5; //4 bytes --> 32 bits
		short s =5; //2 bytes --> 16 bits > -32768 to 32767
		byte b = 5; // 1 byte --> 8 bits > -128 to 127

	
	char c = 'A';
	c= 66;
	
	
	double d1 = 5; //implicit conversation; it automatically takes 5.0
	
	int k = (int)5.6; //type casting ; automatically it remove .6 and prints 5
	}

}
