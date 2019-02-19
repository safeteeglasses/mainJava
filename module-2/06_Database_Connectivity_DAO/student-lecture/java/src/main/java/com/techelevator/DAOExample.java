package com.techelevator;

import org.apache.commons.dbcp2.BasicDataSource;

import com.techelevator.city.City;
import com.techelevator.city.CityDAO;
import com.techelevator.city.JDBCCityDAO;

public class DAOExample {

	public static void main(String[] args) {
	
		BasicDataSource worldDataSource = new BasicDataSource();
		worldDataSource.setUrl("jdbc:postgresql://localhost:5432/world");
		worldDataSource.setUsername("postgres");
		worldDataSource.setPassword("postgres1");
// Use the DAO created for City table to access\/Update the City table data
		CityDAO dao = new JDBCCityDAO(worldDataSource); // Instantiate a CityDao object
														// access to City DAO stuff
		City smallville = new City();
		smallville.setCountryCode("USA");
		smallville.setDistrict("KS");
		smallville.setName("Smallville");
		smallville.setPopulation(42080);
		
		dao.save(smallville);
		
		City theCity = dao.findCityById(smallville.getId());
		System.out.println("Id: " + theCity.getId() + " " + smallville.getName());
		
	}

}
