package activity1;
import java.util.*;

public class activity01 {
	private static Scanner s;

	public static void main(String ar[])
	{
		s = new Scanner(System.in);
		int[] a=new int[15];
		int i;
		System.out.println("Enter the 15 values=");
		for(i=0;i<15;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<15;i++)
		{
			if(a[i]%3==0)
			{
				System.out.println(a[i]+"is divisible by 3");
			}
			else
			{
				System.out.println(a[i]+"is not divisible by 3");
			}
		}
	}

}
