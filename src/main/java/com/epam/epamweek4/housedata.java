package com.epam.epamweek4;
import java.util.Scanner;
public class housedata
{
			public static float calculate_construction_cost(int i,float area,char fullyautomatedhouse)
			{
				switch(i) {
					case 1:return 1200*area;break;
					case 2:return 1500*area;break;
					case 3:
						if(fullyautomatedhouse=='y')
							return 25000*area;
						return 1800*area;
						break;
				}
			}
			public static String readInput()
			{
				Scanner input=new Scanner(System.in);
				System.out.println("enter material standard , total area ,y if you want fully automated house n otherwise");
				String str=input.nextLine();
				input.close();
				return str;
			}
			public static void display(float f)
			{
			System.out.println(f);
			}

	
}
