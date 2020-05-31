package exceptionHandlng;

import arrays.ArrayIndexOutofBoundEx;

public class TrycatchUnChkedEx {
	
	    public static void main(String a[]){
	    	
	    	//Arthametic Exception
	        try{
	            for(int i=5;i>=0;i--){
	            	
	                System.out.println(10/i);
	            }
	        } catch(ArithmeticException ex){
	            System.out.println("Exception Message: "+ex.getMessage());
	           // ex.printStackTrace();
	        }
	        System.out.println("After for loop...");
	        
	        //ArrayOutofbound Exception
	        
	        int b[] = new int[4];
	        try {
	        for(int c=0; c<=4; c++) {
	        	
	        	b[c]= c+1;
	        }
	        }
	        catch(ArrayIndexOutOfBoundsException e) {
	        	System.out.println(e + "Values Should be in");
	        }
	        catch(Exception ee) { //if we get unknown other than above and always keep this in last
	        	
	        	System.out.println("Unknown Exception" + ee);
	        }
	        
	    }
	}