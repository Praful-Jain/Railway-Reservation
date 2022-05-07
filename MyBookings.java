package reservation;

import java.util.List;

public class MyBookings {
	
	private int pnr;
	private Train bookedTrain;
	private List<Passenger> pList;
	
	public MyBookings(int pnr, Train bookedTrain, List<Passenger> pList) {
		super();
		this.pnr = pnr;
		this.bookedTrain = bookedTrain;
		this.pList = pList;
	}
	public int getPnr() {
		return pnr;
	}
	public void setPnr(int pnr) {
		this.pnr = pnr;
	}
	public Train getBookedTrain() {
		return bookedTrain;
	}
	public void setBookedTrain(Train bookedTrain) {
		this.bookedTrain = bookedTrain;
	}
	public List<Passenger> getpList() {
		return pList;
	}
	public void setpList(List<Passenger> pList) {
		this.pList = pList;
	}
	
	
}
