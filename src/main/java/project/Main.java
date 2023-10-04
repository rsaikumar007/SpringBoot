package project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext appcon=new  ClassPathXmlApplicationContext("Spring.config.xml");
		
		TravelByTrain tbt=appcon.getBean("TravelByTrain",TravelByTrain.class);
		System.out.println(tbt.Journey());
		System.out.println("Cost = "+tbt.Cost());
		
		TravelByBus tbb=appcon.getBean("TravelByBus",TravelByBus.class);
		System.out.println(tbb.Journey());
		System.out.println("Cost = "+tbb.Cost());
		
		TravelByFlight tbf=appcon.getBean("TravelByFlight",TravelByFlight.class);
		System.out.println(tbf.Journey());
		System.out.println("Cost = "+tbf.Cost());

	}

}
