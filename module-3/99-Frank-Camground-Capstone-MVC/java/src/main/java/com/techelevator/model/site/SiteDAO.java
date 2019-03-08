package com.techelevator.model.site;

import java.time.LocalDate;
import java.util.List;

public interface SiteDAO {
	public List<Site> getAllSites();
	public List<Site> searchSitesById(long id);
	public List<Site> searchAvailableReservation(long campgroundId,
												LocalDate fromDate,
												LocalDate toDate,
												long numOccupants,
												boolean isAccessible,
												boolean hasUtilities,
												long maxRvLength);
	

}
