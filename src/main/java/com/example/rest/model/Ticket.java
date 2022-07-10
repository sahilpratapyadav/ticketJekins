package com.example.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Ticket {
	private  int ticketNum ;
	private String jdate;
	private String  email;
	private double price;
	private String ticketStatus;
	private String from;
	private String to;
	private String name;
	private  Long  trainNum;
	private  Long phno;

}
