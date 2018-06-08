import java.util.Scanner;
class n
{
	void fun(float a,float b,float c)
	{
		if(a>b && a>c)
			System.out.println(a+" is big");
					if(b>a && b>c)
						System.out.println(b+" is big");
							if(c>a && c>b)
									System.out.println(c+" is big");
	}
}

public class Assign4{

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		n obj=new n();
		System.out.println("Enter 3 numbers");
		float a=input.nextFloat();
		float b=input.nextFloat();
		float c=input.nextFloat();
		
		obj.fun(a,b,c);
		
		
	}
	
	}