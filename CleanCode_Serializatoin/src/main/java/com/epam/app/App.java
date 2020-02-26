package com.epam.app;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App extends Interest
{
	Scanner scan=new Scanner(System.in);
	
	private static final Logger LOGGER = LogManager.getLogger(App.class);
	
    App()
	{
		LOGGER.info("Enter the type of interest you want\n1.SIMPLE INTEREST\n2.COMPOUND INTEREST");
		int type=scan.nextInt();
		if(type==1)
		{
			simple_Interest();
		}
		else if(type==2)
		{
			compound_Interest();
		}
		else
			LOGGER.info("Please select a valid option...!");
	}
	void simple_Interest()
	{
		LOGGER.info("Enter the principal amount");
		float principal_amount=scan.nextFloat();
		LOGGER.info("Enter number of years");
		int years=scan.nextInt();
		LOGGER.info("Enter rate of Interest");
		float rate_of_interest=scan.nextFloat();
		LOGGER.info("Simple interest is "+simple_interest(principal_amount,years,rate_of_interest));
	}
	void compound_Interest()
	{
		LOGGER.info("Enter the principal amount");
		float principal_amount=scan.nextFloat();
		LOGGER.info("Enter number of times to be calculated");
		int times_calc=scan.nextInt();
		LOGGER.info("Enter number of years");
		int years=scan.nextInt();
		LOGGER.info("Enter rate of interest");
		float rate_of_interest=scan.nextFloat();
		LOGGER.info("Compound interest is "+compound_interest(principal_amount,times_calc,years,rate_of_interest));
	}

    public static void main( String[] args )
    {
    	App object_1=new App();
    }
}