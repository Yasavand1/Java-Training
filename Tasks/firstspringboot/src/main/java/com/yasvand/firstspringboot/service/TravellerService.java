package com.yasvand.firstspringboot.service;

import com.yasvand.firstspringboot.entity.ForeignTour;
import com.yasvand.firstspringboot.entity.LocalTour;
import com.yasvand.firstspringboot.entity.Traveller;
import java.util.List;
import java.util.Optional;

public interface TravellerService {
	public Traveller addTraveller(Traveller traveller);
	public LocalTour saveLocalTourRequest(LocalTour localTour);
	public ForeignTour saveForeignTourRequest(ForeignTour foreignTour);
	public List<Traveller> listAllTravellers();
	public Traveller searchByTravellerName(String tname);
	public Optional <Traveller> searchByTravellerId(Long tid);
	public void deleteById(Long tid);
}
