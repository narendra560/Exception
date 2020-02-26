package com.epam.app;

public class Interest {
	float simple_interest(float princpal_amount,int years,float rate_of_interest)
	{
		return (princpal_amount*years*rate_of_interest)/100;
	}
	float compound_interest(float principal_amount,int times_calc,int years,float rate_of_interest)
	{
		return principal_amount*power((1+(rate_of_interest/times_calc)),times_calc*years);
	}
	float power(float n,int f)
	{
		float k=1;
		for(int i=0;i<f;i++)
		{
			k=k*n;
		}
		return k;
	}
}
