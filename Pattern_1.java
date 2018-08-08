package program;

import java.util.Scanner;

public class Pattern_1 
{

	public static void main(String[] args)
	{
		int n,s=1,i,j;
		Scanner nu=new Scanner(System.in);
		System.out.println("enter the number of rows");
		n=nu.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(s+" ");
				s++;
			}
			System.out.println();
		}
	}

}
