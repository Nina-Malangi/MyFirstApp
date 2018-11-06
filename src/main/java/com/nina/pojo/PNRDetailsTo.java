package com.nina.pojo;

import java.util.List;

public class PNRDetailsTo {
	private String pnrNumber;
	private List<PassengerTO> passengers;
	private List<TicketDetailsTo> ticketNumber;
	public String getPnrNumber() {
		return pnrNumber;
	}
	public void setPnrNumber(String pnrNumber) {
		this.pnrNumber = pnrNumber;
	}
	public List<PassengerTO> getPassengers() {
		return passengers;
	}
	public void setPassengers(List<PassengerTO> passengers) {
		this.passengers = passengers;
	}
	public List<TicketDetailsTo> getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(List<TicketDetailsTo> ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	
	
	

}
