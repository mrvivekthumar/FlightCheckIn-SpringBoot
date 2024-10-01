<%@ page import="com.vivek.flightcheckin.integration.dto.Reservation"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Reservation Details</title>
</head>
<body>
<h2>Flight Details:</h2>

<%
    Reservation reservation = (Reservation) request.getAttribute("reservation");

    if (reservation != null) {
%>
    Airlines: <%= reservation.getFlight().getOperatingAirlines() %><br/>
    Flight no: <%= reservation.getFlight().getFlightNumber() %><br/>
    Departure City: <%= reservation.getFlight().getDepartureCity() %><br/>
    Arrival City: <%= reservation.getFlight().getArrivalCity() %><br/>
    Date of Departure: <%= reservation.getFlight().getDateOfDeparture() %><br/>
    Estimated Departure Time: <%= reservation.getFlight().getEstimatedDepartureTime() %><br/>

    <h2>Passenger Details:</h2>

    First Name: <%= reservation.getPassenger().getFirstname() %><br/>
    Last Name: <%= reservation.getPassenger().getLastname() %><br/>
    Email: <%= reservation.getPassenger().getEmail() %><br/>
    Phone: <%= reservation.getPassenger().getPhone() %><br/>

    <form action="completeCheckIn" method="post">
        Enter the number of bags you want to check in: <input type="text" name="numberOfBags"/><br/>
        <input type="hidden" value="<%= reservation.getId() %>" name="reservationId"/>
        <input type="submit" value="Check In"/>
    </form>
<%
    } else {
%>
    <p>No reservation details available.</p>
<%
    }
%>

</body>
</html>
