//palindrome or not
import java.util.Scanner;
class de
{
	int fun(int a)
	{
		int r,sum=0;
		int b=a;
		while(b>0)
		{
			r=b%10;
			sum=sum*10+r;
			b=b/10;
		}
		
		
		
		return sum;
	}
	
}
public class Assig5 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		de obj=new de();
		System.out.println("Enter the number");
		int a=input.nextInt();
	
		int r=obj.fun(a);
		if(r==a)
		System.out.println("Palindrome");
		else
			System.out.println("Not palindrome");
		
	}
	
	}