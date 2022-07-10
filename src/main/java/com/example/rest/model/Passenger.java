package com.example.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Passenger {
	private String name;
	private String  email;
	private  Long phno;
	private String to;
	private String from;
	private String jdate;
	private Long trainNum;
	
	

}
