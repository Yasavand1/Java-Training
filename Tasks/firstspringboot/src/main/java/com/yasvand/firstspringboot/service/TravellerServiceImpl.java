package com.yasvand.firstspringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yasvand.firstspringboot.entity.ForeignTour;
import com.yasvand.firstspringboot.entity.LocalTour;
import com.yasvand.firstspringboot.entity.Traveller;
import com.yasvand.firstspringboot.repo.ForeignTourRepository;
import com.yasvand.firstspringboot.repo.LocalTourRepository;
import com.yasvand.firstspringboot.repo.TravellerRepository;
import java.util.List;
import java.util.Optional;

@Service
public class TravellerServiceImpl implements TravellerService{
	
	@Autowired
	TravellerRepository travellerRepository;
    @Autowired
	private LocalTourRepository localTourRepository;
	@Autowired
	private ForeignTourRepository foreignTourRepository;
	@Override
	public Traveller addTraveller(Traveller traveller) {
		return travellerRepository.save(traveller);
	}
	@Override
	public LocalTour saveLocalTourRequest(LocalTour localTour) {

		Traveller traveller = localTour.getTrtourist();
		localTour.setTrtourist(traveller);
		return localTourRepository.save(localTour);
	}

	@Override
	public ForeignTour saveForeignTourRequest(ForeignTour foreignTour) {
		System.out.println("-----------foreign Tour -------" +foreignTour);
		Traveller traveller = foreignTour.getTrtourist();
		foreignTour.setTrtourist(traveller);
		return foreignTourRepository.save(foreignTour);
	}
	
	@Override
	public List<Traveller> listAllTravellers() {

		return (List<Traveller>) travellerRepository.findAll();
	}
	
	@Override
	public Optional<Traveller> searchByTravellerId(Long tid) {
		return travellerRepository.findById(tid);
	}
	
	@Override
	public Traveller searchByTravellerName(String tname) {
		return travellerRepository.findByTravellerName(tname);
	}
	 
	@Override
	public void deleteById(Long tid) {
	travellerRepository.deleteById(tid); 
		
	} 
	
	

}
