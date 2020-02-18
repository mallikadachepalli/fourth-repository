package com.epam.epamweek4;
public class App 
{
    public static void main( String[] args )
    {
    	//Scanner s=new Scanner(System.in);
    	float principal_amt,rate,simple_interest;
    	int time;
        String expr=calculateinterest.readInput();
        String in[]=expr.split(" ");
        principal_amt=Float.parseFloat(in[0]);
        rate=Float.parseFloat(in[1]);
        simple_interest=Float.parseFloat(in[2]);
        time=Integer.parseInt(in[3]);
        calculateinterest.display(calculateinterest.calculate_si(principal_amt,rate,simple_interest,time));
        calculateinterest.display(calculateinterest.calculate_ci(principal_amt,rate,simple_interest,time));
    }
}