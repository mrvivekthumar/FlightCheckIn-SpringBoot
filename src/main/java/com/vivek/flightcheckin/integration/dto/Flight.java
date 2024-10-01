package com.vivek.flightcheckin.integration.dto;


public class Flight {
	
	private Long id;
	
//	@Column(name = "flight_number")
    private String flightNumber;

//    @Column(name = "operating_airlines")
    private String operatingAirlines;

//    @Column(name = "departure_city")
    private String departureCity;

//    @Column(name = "arrival_city")
    private String arrivalCity;
    
//    @Column(name = "date_of_departure")
    private String dateOfDeparture;

//    @Column(name = "estimated_departure_time")
    private String estimatedDepartureTime;
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

    public String getDateOfDeparture() {
		return dateOfDeparture;
	}

	public void setDateOfDeparture(String dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}

	public String getEstimatedDepartureTime() {
		return estimatedDepartureTime;
	}

	public void setEstimatedDepartureTime(String estimatedDepartureTime) {
		this.estimatedDepartureTime = estimatedDepartureTime;
	}


    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOperatingAirlines() {
        return operatingAirlines;
    }

    public void setOperatingAirlines(String operatingAirlines) {
        this.operatingAirlines = operatingAirlines;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }


	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", operatingAirlines=" + operatingAirlines + ", departureCity="
				+ departureCity + ", arrivalCity=" + arrivalCity + ", dateOfDeparture=" + dateOfDeparture
				+ ", estimatedDepartureTime=" + estimatedDepartureTime + "]";
	}

}
