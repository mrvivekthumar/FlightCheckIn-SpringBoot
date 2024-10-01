package com.vivek.flightcheckin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vivek.flightcheckin.integration.ReservationRestClient;
import com.vivek.flightcheckin.integration.dto.Reservation;
import com.vivek.flightcheckin.integration.dto.ReservationUpdateRequest;

@Controller
public class CheckInController {

	@Autowired
	private ReservationRestClient restClient;

	@GetMapping("/showCheckin")
	public String showStartCheckin() {
		return "startCheckIn";
	}

	@PostMapping("/startCheckIn")
	public String startCheckIn(@RequestParam("reservationId") Long reservationId, ModelMap modelMap) {
		Reservation reservation = restClient.findReservation(reservationId);
		modelMap.addAttribute("reservation", reservation);
		System.out.println("Reservation found: " + reservation);
		return "displayReservationDetails";
	}

	// POST request to complete the check-in process
	@PostMapping("/completeCheckIn")
	public String completeCheckIn(@RequestParam("reservationId") Long reservationId,
			@RequestParam("numberOfBags") int numberOfBags) {
		// Update reservation details with checked-in information
		ReservationUpdateRequest updateRequest = new ReservationUpdateRequest();
		updateRequest.setId(reservationId);
		updateRequest.setCheckedIn(true);
		updateRequest.setNumOfBags(numberOfBags);
		restClient.updateReservation(updateRequest);

		return "checkInConfirmation"; // points to checkInConfirmation.jsp
	}
}
