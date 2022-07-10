package com.example.rest.service;

import org.springframework.stereotype.Service;

import com.example.rest.model.Passenger;
import com.example.rest.model.Ticket;
@Service
public class TicketServiceImpl  implements TicketService{

	@Override
	public Ticket bookedTicket(Passenger passenger) {
		// TODO Auto-generated method stub
		Ticket ticket =new Ticket();
		ticket.setTicketNum(1);
		
		ticket.setPrice(450.00);
		ticket.setTicketStatus("booked");
		ticket.setFrom("vns");
		ticket.setJdate(passenger.getJdate());
		ticket.setTo(passenger.getTo());
		ticket.setTo(passenger.getFrom());
		ticket.setPhno(passenger.getPhno());
		ticket.setEmail(passenger.getEmail());
		ticket.setName(passenger.getName());
		ticket.setTrainNum(passenger.getTrainNum());
		
		return ticket;
	}

}
