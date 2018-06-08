import java.util.Scanner;
class cl
{
  int fun(int a)
	{int ab=a;
	  int r=1;
	   for(int i=2;i<=ab/2;i++)
       {
		   if(ab%i==0)
       		{
       			r=0;
                   break;
       		}
       }
	  
	  
	  return r;
		
	}
}
public class Assi6 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		cl obj=new cl();
		System.out.println("Enter a number");
		int a=input.nextInt();
	
	int r=obj.fun(a);
	if(a==1 || a==0)
		System.out.println(a+" is neither prime nor composite");
	else if(r==1)
			System.out.println(a+" is prime");
		else
			System.out.println(a+" is not prime");
		
	}
	
	}