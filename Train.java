package reservation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Train {
	private int tNo;
	private String tName;
	private String fromStation;
	private String toStation;
	private int seats;
	private int fare;
	private LocalDate doj;		//LocalDate is a class from Java8 present in java.time package
								//Represents a date-- (yyyy-MM-dd)
	
	//Parametarized constructor of Train class
	public Train(int tNo, String tName, String fromStation, String toStation, int seats, int fare, LocalDate doj) {
		super();
		this.tNo = tNo;
		this.tName = tName;
		this.fromStation = fromStation;
		this.toStation = toStation;
		this.seats = seats;
		this.fare = fare;
		this.doj = doj;
	}

	//Getters-Setters
	
	public int gettNo() {
		return tNo;
	}

	public void settNo(int tNo) {
		this.tNo = tNo;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public String getFromStation() {
		return fromStation;
	}

	public void setFromStation(String fromStation) {
		this.fromStation = fromStation;
	}

	public String getToStation() {
		return toStation;
	}

	public void setToStation(String toStation) {
		this.toStation = toStation;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	public LocalDate getDoj() {
		//Formatter for displaying and parsing date-time objects
		/*DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String d = doj.format(formatter);*/
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	
	
	
}
