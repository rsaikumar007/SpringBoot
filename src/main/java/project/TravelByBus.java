package project;

public class TravelByBus implements Travel {
	
	String TravelBy;
	 
	 public TravelByBus() {
		 super();
		 System.out.println("Travel By Bus ");
		 
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
		return "Journey : Travelling by Bus takes 10 hours";
	}


	@Override
	public double Cost() {
		// TODO Auto-generated method stub
		return 1000.0;
	}


	@Override
	public String toString() {
		return "TravelByBus [TravelBy=" + TravelBy + "]";
	}
	
}
