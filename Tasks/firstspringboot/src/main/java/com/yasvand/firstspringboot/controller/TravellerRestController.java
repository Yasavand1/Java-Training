package com.yasvand.firstspringboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yasvand.firstspringboot.entity.ForeignTour;
import com.yasvand.firstspringboot.entity.LocalTour;
import com.yasvand.firstspringboot.entity.Traveller;
import com.yasvand.firstspringboot.repo.TravellerRepository;
import com.yasvand.firstspringboot.service.TravellerService;
import java.util.List;
import java.util.Optional;





@RestController
public class TravellerRestController {
	
	@Autowired
	TravellerService travellerservice;
	
	@Autowired
	TravellerRepository travellerRepository;
	
	@GetMapping("/welcome")
	public String helloAppln() {
		return "Welcome Traveller";
	}
	
	@PostMapping("/addtraveller")	
	public Traveller addTraveller(@RequestBody Traveller traveller) {
		//traveller.setTravellerPwd(new BCryptPasswordEncoder().encode(traveller.getTravellerPwd()));
		return travellerservice.addTraveller(traveller);
	}
	
	@PreAuthorize("hasAuthority('DC')")
	@PostMapping("/requestlocaltour")
	public LocalTour saveLocalTourRequest(@RequestBody LocalTour localTour) {
		return travellerservice.saveLocalTourRequest(localTour);
	}

	@PreAuthorize("hasAuthority('FC')")
	@PostMapping("/requestforeigntour")
	public ForeignTour saveForeignTourRequest(@RequestBody ForeignTour foreignTour) {
		System.out.println("****** From Controller Foreign ******" + foreignTour);
		return travellerservice.saveForeignTourRequest(foreignTour);
	}
	
	@GetMapping("/listtravellers")
	public List<Traveller> listAllTravellers() {
   return travellerservice.listAllTravellers();
	}
	
	@GetMapping("/findbytid/{tid}")
	public Optional<Traveller> searchByTravellerId(@PathVariable Long tid){
		return travellerservice.searchByTravellerId(tid);
	}
	
	@GetMapping("/findbytname/{tname}")
	public Traveller searchByTravellerName(@PathVariable String tname){
		return travellerservice.searchByTravellerName(tname);
	}
	
	@DeleteMapping("/deletetraveller/{tid}")  
	public void deleteTraveller(@PathVariable("tid") Long tid){   
		travellerservice.deleteById(tid);  
	}  
	
	@GetMapping("/login")	
	public ResponseEntity<Traveller> loginrest(@RequestParam(value = "username", required = false) String username,
			@RequestParam(value = "password", required = false) String password) {
		System.out.println("*******This is a login rest controller ***********");
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		Traveller traveller = travellerRepository.findByTravellerName(auth.getName());
		System.out.println("After Login__________________"
				+ "send back to Angular or postman as response__________________" + traveller);
		return ResponseEntity.ok(traveller);
	}
	
	

}
