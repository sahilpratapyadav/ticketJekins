package com.example.rest.service;

import com.example.rest.model.Passenger;
import com.example.rest.model.Ticket;

public interface TicketService {
	
	public Ticket bookedTicket(Passenger passenger);

}
