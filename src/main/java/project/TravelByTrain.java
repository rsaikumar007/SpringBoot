package project;

public class TravelByTrain implements Travel {
	 String TravelBy;
	
	 
	 public TravelByTrain() {
		 super();
		 System.out.println("Travel By Train");
		 
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
		return "Journey : Travelling By Train takes 8hours";

	
	}
	@Override
	public double Cost() {
		// TODO Auto-generated method stub
		return 700.0;
	}



	@Override
	public String toString() {
		return "TravelByTrain [TravelBy=" + TravelBy + "]";
	}


	

}
