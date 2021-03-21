package org.simplilearn.training;

public class Passenger {
	private String source;
	private String destination;
	private String passengers;
	private String date;
	private String time;
	public Passenger(String source, String destination, String passengers, String date, String time) {
		super();
		this.source = source;
		this.destination = destination;
		this.passengers = passengers;
		this.date = date;
		this.time = time;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getPassengers() {
		return passengers;
	}
	public void setPassengers(String passengers) {
		this.passengers = passengers;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	

}
