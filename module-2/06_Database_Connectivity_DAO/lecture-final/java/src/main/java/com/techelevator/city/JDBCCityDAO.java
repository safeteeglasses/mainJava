package com.techelevator.city;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

<<<<<<< HEAD
public class JDBCCityDAO implements CityDAO {   // implement the interface for the City table

	private JdbcTemplate myJdbcTemplate;        // Define a Jdbctemplate object for the DAO
	
	public JDBCCityDAO(DataSource aDataSource) {              // constructor for DAO - receive a datasource when instantiated
		this.myJdbcTemplate = new JdbcTemplate(aDataSource);  // instantiate a JdbcTemplate object and assignng class reference
	}

	@Override
	public void save(City newCity) {  // Receive a City object and return nothing
		                              // Add the City object to the data base
		String sqlInsertCity = "INSERT INTO city(id, name, countrycode, district, population) " +
							   "VALUES(?, ?, ?, ?, ?)";
		newCity.setId(getNextCityId());
		myJdbcTemplate.update(sqlInsertCity, newCity.getId(),         // Replace the 1st ? with the value returned by getId() - Id in the City passed
										     newCity.getName(),       // Replace the 2nd ? with the value returned by getName() - Name in the City passed
										     newCity.getCountryCode(),// Replace the 3rd ? with the value returned by getCountryCode() - CountryCode in the City passed
										     newCity.getDistrict(),   // Replace the 4th ? with the value returned by getDistrict() - District in the City passed
										     newCity.getPopulation());// Replace the 5th ? with the value returned by getPopulation() - Population in the City passed
	}
	
	@Override
	public City findCityById(long id) {  // receive a long and return a City object or null if nothing was found
		City theCity = null;  // City object to be returned
		
		String sqlFindCityById = "SELECT id, name, countrycode, district, population "+
							       "FROM city "+
							      "WHERE id = ?";
		
		SqlRowSet results = myJdbcTemplate.queryForRowSet(sqlFindCityById, id);  // run the SELECT replace ? with value passed
		
		if(results.next()) {                  // if there was a result from the most recent SQL statement
			theCity = mapRowToCity(results);  // pass the results to mapRowToCity() and assign the return object what comes back
		}
		return theCity;   // return the object created in this method which is  the City found or null
=======
public class JDBCCityDAO implements CityDAO {

	private JdbcTemplate myJdbcTemplate;
	
	public JDBCCityDAO(DataSource aDataSource) {
		this.myJdbcTemplate = new JdbcTemplate(aDataSource);
	}

	@Override
	public void save(City newCity) {
		String sqlInsertCity = "INSERT INTO city(id, name, countrycode, district, population) " +
							   "VALUES(?, ?, ?, ?, ?)";
		newCity.setId(getNextCityId());
		myJdbcTemplate.update(sqlInsertCity, newCity.getId(),
										  newCity.getName(),
										  newCity.getCountryCode(),
										  newCity.getDistrict(),
										  newCity.getPopulation());
	}
	
	@Override
	public City findCityById(long id) {
		City theCity = null;
		String sqlFindCityById = "SELECT id, name, countrycode, district, population "+
							   "FROM city "+
							   "WHERE id = ?";
		SqlRowSet results = myJdbcTemplate.queryForRowSet(sqlFindCityById, id);
		if(results.next()) {
			theCity = mapRowToCity(results);
		}
		return theCity;
>>>>>>> 4437c41410d2a2815f4e3c4c5393cee74360d89e
	}

	@Override
	public List<City> findCityByCountryCode(String countryCode) {
		ArrayList<City> cities = new ArrayList<>();
		String sqlFindCityByCountryCode = "SELECT id, name, countrycode, district, population "+
										   "FROM city "+
										   "WHERE countrycode = ?";
		SqlRowSet results = myJdbcTemplate.queryForRowSet(sqlFindCityByCountryCode, countryCode);
		while(results.next()) {
			City theCity = mapRowToCity(results);
			cities.add(theCity);
		}
		return cities;
	}

	@Override
	public List<City> findCityByDistrict(String district) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
<<<<<<< HEAD
	public void update(City city) {  // receive a City object and update the database with the values in that object
		
		String theUpdate = "UPDATE city "         +  // created the SQL UPDATE statement
		                   " SET name        = ? "+  // to use the values in the object
		                   "	,countryCode = ? "+  // passed
		                   "    ,district    = ? "+ 
		                   "	,population  = ? "+
		                   " WHERE id        = ? ";
		
		myJdbcTemplate.update(theUpdate              // Run the Update statement
				             ,city.getName()         // Replace the 1st ? with the name from object passed
				             ,city.getCountryCode()  // Replace the 2nd ? with the name from object passed
				             ,city.getDistrict()     // Replace the 3rd ? with the name from object passed
				             ,city.getPopulation()   // Replace the 4th ? with the name from object passed
				             ,city.getId  ()         // Replace the 5th ? with the name from object passed
				             );
=======
	public void update(City city) {
		// TODO Auto-generated method stub
		
>>>>>>> 4437c41410d2a2815f4e3c4c5393cee74360d89e
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

	private long getNextCityId() {
		SqlRowSet nextIdResult = myJdbcTemplate.queryForRowSet("SELECT nextval('seq_city_id')");
		if(nextIdResult.next()) {
			return nextIdResult.getLong(1);
		} else {
			throw new RuntimeException("Something went wrong while getting an id for the new city");
		}
	}

<<<<<<< HEAD
	private City mapRowToCity(SqlRowSet results) {  // create an object of t he class and assign the results from the SQL statement
		City theCity;               // Define an object to return
		theCity = new City();       // Instantiate object to return (run ctor)
		theCity.setId(results.getLong("id"));                      // Get the Id from the result and assign to object
		theCity.setName(results.getString("name"));				   // Get the Name from the result and assign to object
		theCity.setCountryCode(results.getString("countrycode"));  // Get the CountryName from the result and assign to object
		theCity.setDistrict(results.getString("district"));        // Get the District from the result and assign to object
		theCity.setPopulation(results.getInt("population"));       // Get the Population from the result and assign to object
		return theCity;             // Return te object with the results
=======
	private City mapRowToCity(SqlRowSet results) {
		City theCity;
		theCity = new City();
		theCity.setId(results.getLong("id"));
		theCity.setName(results.getString("name"));
		theCity.setCountryCode(results.getString("countrycode"));
		theCity.setDistrict(results.getString("district"));
		theCity.setPopulation(results.getInt("population"));
		return theCity;
>>>>>>> 4437c41410d2a2815f4e3c4c5393cee74360d89e
	}
}
