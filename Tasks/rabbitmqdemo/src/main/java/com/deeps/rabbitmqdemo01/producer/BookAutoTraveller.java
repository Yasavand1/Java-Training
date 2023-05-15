package com.deeps.rabbitmqdemo01.producer;

import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deeps.rabbitmqdemo01.config.MessagingConfig;
import com.deeps.rabbitmqdemo01.dto.BookStatus;
import com.deeps.rabbitmqdemo01.dto.Booking;

@RestController
@RequestMapping("/bookvehicle")
public class BookAutoTraveller {
	
	@Autowired
	private RabbitTemplate template;
	
	@PostMapping("/{vehicletype}")
	
	public String bookvehicle(@RequestBody Booking booking,@PathVariable String vehicletype) {
		
		
	        booking.setBookingId(UUID.randomUUID().toString());
	        BookStatus bookStatus = new BookStatus(booking, "PROCESS", "Booking placed succesfully in " + vehicletype);
	        template.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.ROUTING_KEY, bookStatus);
	        return "Success !!";
	    }
	}


