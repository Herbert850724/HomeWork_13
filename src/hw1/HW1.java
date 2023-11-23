package hw1;

public class HW1 
{
	public static void main(String[]args)
	{
		//第一題
		int a=12,b=6;
		int add = a+b , mult=a*b;
		System.out.println("第一題");
		System.out.println("12+6="+add);
		System.out.println("12*6="+mult);
		//第二題
		int total = 200;
		int c = 200/12;
		int d = 200%12;
		System.out.println("第二題");
		System.out.println("一共是"+c+"打"+d+"顆");
		//第三題
		int alltime = 256559,daysec = 24*60*60,hoursec = 60*60,minsec=60;
		int day = alltime/daysec;
		int hour = (alltime-day*daysec)/hoursec;
		int minute = (alltime-day*daysec-hour*hoursec)/minsec;
		int second=alltime%60;
		System.out.println("第三題");
		System.out.println(day+"天"+hour+"小時"+minute+"分"+second+"秒");
		//第四題
		final float pi = 3.1415f;
		int r = 5;
		System.out.println("第四題");
		System.out.println("面積:"+r*r*pi);
		System.out.println("周長:"+2*r*pi);
		//第五題
		int input =1500000;
		float rate = 0.02f;
		double all = input*Math.pow(1.02, 10);
		System.out.println("第五題");
		System.out.println(all+"元");
		//第六題
		System.out.println("第六題");
		System.out.println(5+5);
		//數字五加五
		System.out.println(5+'5');
		//數字五加上萬國碼五轉會誠實進位為53
		System.out.println(5+"5");
		//五加上字串五
		
				
	}
}


