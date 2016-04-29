package com.guestrequest.solicitation;

import java.io.Serializable;
import java.util.List;

import com.guestrequest.identity.User;
import com.guestrequest.solicitation.aggregate.AppointmentType;
import com.guestrequest.solicitation.aggregate.DateRange;

public class Appointment implements Serializable {

	private Long id;
	
	private DateRange range;
	
	private User requester;
	
	private User approver;
	
	private AppointmentType type;
	
	private String description;
	
	private List<Guest> guests;
	
	
	
	
}
