import java.util.Scanner;
class class1
{
	
	void fun(int ab) {
		if(ab%4 == 0)
	    {
	        if(ab%100 == 0)
	        	{
	            
	        		if (ab%400 == 0)
	        			System.out.println("leap year");
	        		else
	            	System.out.println("not a leap year");
	        	}
	        else
	        	System.out.println("leap year");
	    }
	    else
	    	System.out.println("not a leap year");
	}
	
	
}


public class Assign2 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		class1 obj =new class1();
		int a=input.nextInt();
	obj.fun(a);
		
	}
	
	}