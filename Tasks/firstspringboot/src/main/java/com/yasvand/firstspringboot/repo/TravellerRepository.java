package com.yasvand.firstspringboot.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yasvand.firstspringboot.entity.Traveller;

@Repository
public interface TravellerRepository extends CrudRepository<Traveller, Long>{
	public Traveller findByTravellerName(String travellerName);
    public Traveller findByTravellerId(Long travelcode);
	public Traveller deleteByTravellerId(Long travelcode);
	
	}


