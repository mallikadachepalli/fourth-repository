package com.epam.epamweek4;
import java.util.Scanner;
public class calculateinterest
{
		public static float calculate_si(float principal_amt,float rate,float simple_interest,int time)
		{
			return (principal_amt*rate*simple_interest)/time;
		}
		public static float calculate_ci(float principal_amt,float rate,float simple_interest,int time)
		{
			float ci=principal_amt*((float)Math.pow((1+rate/100),time));
			return ci;
		}
		public static String readInput()
		{
			Scanner input=new Scanner(System.in);
			System.out.println("enter principal amount , rate ,simpleinterest,time in a line");
			String str=input.nextLine();
			input.close();
			return str;
		}
		public static void display(float f)
		{
		System.out.println(f);
		}
}
