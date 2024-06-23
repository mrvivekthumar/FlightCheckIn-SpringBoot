package com.vivek.flightcheckin.integration;

import org.springframework.web.client.RestTemplate;

import com.vivek.flightcheckin.integration.dto.Reservation;
import com.vivek.flightcheckin.integration.dto.ReservationUpdateRequest;

public class ReservationRestClientImpl implements ReservationRestClient {

	@Override
	public Reservation findReservation(Long id) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.getForObject("http://localhost:8080/flightReservation/reservation/"+id, Reservation.class);
		return reservation;
	}

	@Override
	public Reservation updateReservation(ReservationUpdateRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
