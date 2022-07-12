package com.example.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.rest.model.Passenger;
import com.example.rest.model.Ticket;
import com.example.rest.service.TicketServiceImpl;

@Controller
public class TicketRestController {
	@Autowired
	//1

	int i=0;

	int k=5;


	int m=9;

	//sahil is prsent in feature branch contente merge to main branch


	// statsh changed not completed
    // int t=10 from feature branch
	
	
	//no confilcted

	private TicketServiceImpl serv;

	@GetMapping(value = "/ticket", consumes = { "application/json", "application/xml" }, produces = {
			"application/xml" }

	)
	public ResponseEntity<Ticket> getticket(@RequestBody Passenger passenger) {
		Ticket bookedTicket = serv.bookedTicket(passenger);

		return new ResponseEntity<>(bookedTicket, HttpStatus.OK);

	}

}
