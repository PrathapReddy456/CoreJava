package interfacee;

interface empty{
	
}

public class MarkerInterface implements empty {
	
	public void show() {
		System.out.println("It's show");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarkerInterface obj = new MarkerInterface();
		if(obj instanceof empty) {
			obj.show();
		}
		else {
			System.out.println("Nothing Imp");
		}
	}

}
