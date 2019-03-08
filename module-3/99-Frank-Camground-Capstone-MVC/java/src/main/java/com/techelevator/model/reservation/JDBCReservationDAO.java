package com.techelevator.model.reservation;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class JDBCReservationDAO implements ReservationDAO {

	private JdbcTemplate jdbcTemplate;
	
@Autowired
	public JDBCReservationDAO(DataSource datasource) {
		this.jdbcTemplate = new JdbcTemplate(datasource);
	}

	@Override
	public List<Reservation> getAllReservations() {
		List<Reservation> res = new ArrayList<>();
		String sqlGetReservations = "SELECT * FROM reservation";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetReservations);
		while (results.next()) {
			res.add(mapRowToReservation(results));
		}
		return res;
	}

	@Override
	public Reservation searchReservationsById(long id) {
		Reservation res = new Reservation();
		String sqlGetResById = "SELECT * FROM reservation WHERE reservation_id = ? ";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetResById, id);
		while (results.next()) {
			res = mapRowToReservation(results);
		}
		return res;
	}
	
	@Override
	public Reservation searchReservationsByName(String name) {
		Reservation res = new Reservation();
		String sqlGetResByName = "SELECT * FROM reservation WHERE name = ? ";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetResByName, name);
		while (results.next()) {
			res = mapRowToReservation(results);
		}
		return res;
	}

	@Override
	public void saveReservation(Reservation newReservation) {
		String sqlSaveRes = "INSERT INTO reservation (site_id, name, from_date, to_date, create_date) VALUES (?, ?, ? ,? , now())";
		jdbcTemplate.update(sqlSaveRes
				, newReservation.getSiteId()
				, newReservation.getName()
				, newReservation.getFromDate()
				, newReservation.getToDate());
		newReservation.setReservationId(getNextReservationId());
	}

	@Override
	public void deleteReservation(Reservation deleteReservation) {
		String sqlDeleteRes = "DELETE from reservation where reservation_id = ?;";
		jdbcTemplate.update(sqlDeleteRes, deleteReservation.getReservationId());
	}
	
	@Override
	public int getMaxReservationId() {
		String sqlMaxResId = "SELECT MAX(reservation_id) from reservation";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sqlMaxResId);
		result.next();
		int n = result.getInt(1);
		return n;
	}

	private Reservation mapRowToReservation(SqlRowSet results) {
		Reservation res = new Reservation();
		res.setReservationId(results.getLong("reservation_id"));
		res.setSiteId(results.getLong("site_id"));
		res.setName(results.getString("name"));
		res.setFromDate(results.getDate("from_date").toLocalDate());
		res.setToDate(results.getDate("to_date").toLocalDate());
		res.setCreateDate(results.getDate("create_date").toLocalDate());
		return res;
	}

	
	private long getNextReservationId() {
		SqlRowSet nextIdResult = jdbcTemplate.queryForRowSet("SELECT nextval('reservation_reservation_id_seq')");
		if(nextIdResult.next()) {
			return nextIdResult.getLong(1);
		} else {
			throw new RuntimeException("Something went wrong while getting an id for the new resevation ID");

		}
	}
}
