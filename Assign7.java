import java.util.Scanner;
class hello
{
	void fun(int a)
	{ int b,rem;//,sum=0;
		b=a;
		while(b>0)
		{
			rem=b%10;
			b=b/10;
			System.out.print(rem);
		}
	
	}
	
}

public class Assign7 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		hello obj=new hello();
		int a=input.nextInt();
	
		obj.fun(a);
		
		
	}
	
	}