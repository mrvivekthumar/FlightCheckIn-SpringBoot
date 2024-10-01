package com.vivek.flightcheckin.integration.dto;

import java.sql.Timestamp;

public class Reservation {
	private Long id;
	
//	@Column(name = "checked_in")
    private boolean checkedIn;

//    @Column(name = "number_of_bags")
    private int numberOfBags;

//    @OneToOne
    private Passenger passenger;

//    @OneToOne
    private Flight flight; 


//    @Column(name = "created_at")
    private Timestamp created;

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(Boolean checkedIn) {
        this.checkedIn = checkedIn;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public void setNumberOfBags(int numberOfBags) {
        this.numberOfBags = numberOfBags;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public Timestamp getCreated() {
		return created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

}
