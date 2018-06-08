//print the pattern
class Cool
{
	void fun()
	{
		
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		
	}
}
public class Assign3 {

	public static void main(String[] args) {
		
		Cool obj=new Cool();
		obj.fun();
		
	}
}
