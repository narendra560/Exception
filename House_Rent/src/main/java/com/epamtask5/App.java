package com.epamtask5;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App extends CostOfHouse {
	Scanner s=new Scanner(System.in);
	private static final Logger LOGGER = LogManager.getLogger(App.class);
	void App()
	{
		LOGGER.info("Enter the area of site in square feet");
		float area=s.nextFloat();
		LOGGER.info("Enter the choice if you need fully automated home\n1.YES\n2.NO");
		int choice=s.nextInt();
		if (choice==2)
		{
			LOGGER.info("select the type of house you need\n1.Standard material\n2.Above Standard material\n3.High Standard material");
			int choice1=s.nextInt();
			if (choice1<1 && choice1>3)
			{
				LOGGER.info("Enter valid choice");
			}
			else
			{
				LOGGER.info("cost of house construction : "+find_cost_house(choice1,area));
			}
		}
		else if(choice==1)
		{
			LOGGER.info("cost of house construction : "+find_cost_house(4,area));
		}
		else
		{
			LOGGER.info("Enter valid choice");
		}
	}
	public static void main(String args[])
	{
		App obj1=new App();
		obj1.App();
	}
}
