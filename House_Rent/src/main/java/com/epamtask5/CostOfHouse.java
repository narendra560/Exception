package com.epamtask5;
public class CostOfHouse {
	float find_cost_house(int choice,float area)
	{
		if (choice==4)
		{
			return 2500*area;
		}
		else
		{
			return 300*(choice+3)*area;
		}
	
	}

}
