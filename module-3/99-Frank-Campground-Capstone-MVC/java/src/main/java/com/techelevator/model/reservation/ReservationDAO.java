package com.techelevator.model.reservation;

import java.util.List;

public interface ReservationDAO {
	public List<Reservation> getAllReservations();
	public Reservation searchReservationsById(long id);
	public Reservation searchReservationsByName(String name);
	public int getMaxReservationId();
	public void saveReservation(Reservation newReservation);
	public void deleteReservation(Reservation deleteReservation);

}
