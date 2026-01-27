package abhi;
 
import java.util.Scanner;
	
	public class Weather {
		public static void main(String[] args)
		{
	Scanner sc=new Scanner(System.in);
	
	System.out.print("City:");
	String city=sc.next();
	System.out.print("Temperature:");
	float temp=sc.nextFloat();
	
	if(temp>30)
	{
        System.out.println("City: " +city);
        System.out.println("Temperature: " +temp+ "°C");
        System.out.println("Condition: Hot Day");
    }
	else
    {
        System.out.println("City: " +city);
        System.out.println("Temperature: " +temp+ "°C");
        System.out.println("Condition: Normal Day");
    }
	WeatherRecord result=new WeatherRecord();
	result=null;
}
}
	class WeatherRecord {
	}