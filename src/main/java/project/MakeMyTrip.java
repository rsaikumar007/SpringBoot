package project;

public class MakeMyTrip {
	Travel travel;
	
	public MakeMyTrip() {
		super();
		System.out.println("Are You Planning For A Trip!!!");
		System.out.println("MakeMyTrip is an Indian online travel company");
		System.out.println("Choose your Trip to Travel Through:-");
	}

	public Travel getTravel() {
		return travel;
	}

	public void setTravel(Travel travel) {
		this.travel = travel;
	}

	@Override
	public String toString() {
		return "MakeMyTrip [travel=" + travel + "]";
	}
	
}
