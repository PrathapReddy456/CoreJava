package conditions;

public class TernaryOperator {
	
	// TernaryOperator--> condition?exprs1:exprs2
	
	public static void main(String args[]) {
	
	int i = 7;
	int j = 0;
	
//Using If else
	if(i>=8)
		j=1;
	else
		j=2;
	
//Using Ternary
	
		j=i>=8?1:2;
	
	}
	

}
