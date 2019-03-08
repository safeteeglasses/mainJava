package com.techelevator.model.site;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class JDBCSiteDAO implements SiteDAO {
	
	private JdbcTemplate jdbcTemplate;
@Autowired
	public JDBCSiteDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Site> getAllSites() {
		List<Site> siteList = new ArrayList<>();
		String sqlGetSites = "SELECT * FROM site";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetSites);
		while (results.next()) {
			siteList.add(mapRowToSite(results));
		}
		return siteList;
	}

	@Override
	public List<Site> searchSitesById(long id) {
		List<Site> siteList = new ArrayList<>();
		String sqlGetSiteById = "SELECT * FROM site WHERE site_id = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetSiteById, id);
		while (results.next()) {
			siteList.add(mapRowToSite(results));
		}
		return siteList;
	}
	
	@Override
	public List<Site> searchAvailableReservation(long campgroundId, LocalDate fromDate, LocalDate toDate, long numOccupants, boolean isAccessible, boolean hasUtilities, long maxRvLength) {
		List<Site> availableReservations = new ArrayList<Site>();
		String sqlSearchAvailableReservations = "SELECT * " + 
				"FROM site s " + 
				"WHERE campground_id = ? " + 
				"AND max_occupancy >= ?" +
				"AND accessible = ?" +
				"AND utilities = ?" +
				"AND max_rv_length >= ?" +
				"AND NOT EXISTS ( " + 
				"SELECT site_id " + 
				"        FROM reservation r " + 
				"        WHERE (from_date BETWEEN ? AND ? " + 
				"        OR to_date BETWEEN ? AND ?) " + 
				"        AND r.site_id = s.site_id" + 
				") " + 
				"LIMIT 5" + 
				";";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSearchAvailableReservations,
														campgroundId,
														numOccupants,
														isAccessible,
														hasUtilities,
														maxRvLength,
														fromDate,
														toDate,
														fromDate,
														toDate);
		while (results.next()) {
			availableReservations.add(mapRowToSite(results));
		}
		
		return availableReservations;
	}

	private Site mapRowToSite(SqlRowSet results) {
		Site site = new Site();
		site.setSiteId(results.getLong("site_id"));
		site.setCampgroundId(results.getLong("campground_id"));
		site.setSiteNumber(results.getLong("site_number"));
		site.setMaxOccupancy(results.getLong("max_occupancy"));
		site.setAccessible(results.getBoolean("accessible"));
		site.setMaxRvLength(results.getLong("max_rv_length"));
		site.setUtilites(results.getBoolean("utilities"));
		return site;
	}
}
