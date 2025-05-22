//The number is divided by 3,9,27,81
class Prog1
{
	public static void main(String[] args)
	{
		for (int i=1;i<=100;i++ )
		{
			if(i%3==0 || i%9==0 ||i%27==0 || i%81==0)
				System.out.println(i);
		}
	}
}