import java.util.Scanner;
class q7
{
	public static void main(String args[])
	{
		int n;
		int status = 1;
		int num = 3;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value of n = ");
		n = s.nextInt();
		System.out.print("Prime numbers upto "+n+" are : ");
		if (n >= 1)
			System.out.print(2);
		System.out.print(" ");
		while(n >= num)
		{
			for (int j = 2;j <= Math.sqrt(num);j++)
			{
				if (num%j == 0)
				{
					status = 0;
					break;
				}
			}
			if(status != 0)
				System.out.print(num+" ");
			status = 1;
			num++;
		}         
	}
}