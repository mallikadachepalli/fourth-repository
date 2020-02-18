package com.epam.epamweek4;
public class estimatecost 
{
    public static void main( String[] args )
    {
    	String material_standard;
    	char fully_automated_home;
    	float area;
        String expr=housedata.readInput();
        String in[]=expr.split(" ");
        material_standard=(in[0]);
        area=Float.parseFloat(in[1]);
        fully_automated_home=in[2].charAt(0);
        if(material_standard.equals("standardmaterials"))
        housedata.display(housedata.calculate_construction_cost(1,area,fully_automated_home));
        else if(material_standard.equals("above standard materials"))
housedata.display(housedata.calculate_construction_cost(2,area,fully_automated_home));
		
else
	 housedata.display(housedata.calculate_construction_cost(3,area,fully_automated_home));
    }
}