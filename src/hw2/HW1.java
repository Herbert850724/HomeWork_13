package hw2;

public class HW1 
{
	public static void main (String[] args)
	{
		System.out.println("第一題");
		int sum =0;
		for(int a=0;a<=1000;a +=2)
		{
			sum += a;
			
		}
		System.out.println(sum);
		System.out.println("第二題");
		int sum2 =1;
		for(int a=2;a<=10;a++)
		{
			sum2 *=a;
		}
		System.out.println(sum2);
		System.out.println("第三題");
		int sum3 = 1;
		int c = 2;
		while(c<=10)
		{
			
			sum3 *= c;
			c++;
		}
		System.out.println(sum3);
		System.out.println("第四題");
		int d = 0;
		for(int i=1;i<=19;i += 2)
		{
			d += i;
			System.out.print(d+" ");
		}
		System.out.println();
		System.out.println("第五題");
		for(int b=10;b>=1;b--)
		{
			for(int i =1;i<=b;i++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("第六題");
		char sum6 ='\u0041';
		for(int j =1;j<=6;j++)
		{
			for(int k=1;k<=j;k++)
			{
				System.out.print(sum6);
			}
			sum6++;
			System.out.println();
			
			}
			for(int i=1;i<50;i++)
			{
				if( i%10!=4 && i/10 != 4)
				{
					System.out.print(i+" ");  
				}
				
	
			}
		
		
		
		
	}
		
}
