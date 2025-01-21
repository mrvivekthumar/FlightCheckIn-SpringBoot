package com.vivek.flightcheckin.integration.dto;

public class ReservationUpdateRequest extends AbstractEntity {

	private Boolean checkedIn;
	private int numOfBags;

	public Boolean getCheckedIn() {
		return checkedIn;
	}

	public void setCheckedIn(Boolean checkedIn) {
		this.checkedIn = checkedIn;
	}

	public int getNumOfBags() {
		return numOfBags;
	}

	public void setNumOfBags(int numOfBags) {
		this.numOfBags = numOfBags;
	}
}
