package project;

public class TravelByFlight implements Travel {
	 String TravelBy;
	 
	 
	 public TravelByFlight() {
		 super();
		 System.out.println("Travel by Flight");
		 System.out.println("<---< Hyderabad to Visakhapatnam >---> ");
	 }

	
	public String getTravelBy() {
		return TravelBy;
	}


	public void setTravelBy(String travelBy) {
		TravelBy = travelBy;
	}


	@Override
	public String Journey() {
		// TODO Auto-generated method stub
		return "Journey : Traveling By Flight takes 4hours";
	}

	@Override
	public double Cost() {
		// TODO Auto-generated method stub
		return 3600.0;
	}


	@Override
	public String toString() {
		return "TravelByFlight [TravelBy=" + TravelBy + "]";
	}
	
	
}
