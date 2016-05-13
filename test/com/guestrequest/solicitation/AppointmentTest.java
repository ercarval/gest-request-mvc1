package com.guestrequest.solicitation;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import com.guestrequest.identity.User;
import com.guestrequest.solicitation.aggregate.DateRange;

import junit.framework.Assert;


public class AppointmentTest {

	
	@Test
	public void createNewAppointmentTest () {
		
		Date today = new Date();
		
		Appointment appointment = new Appointment();
		
	
		assertNotNull( "Todo Appointment tem que ter um Range"
				, appointment.getRange());
		
		appointment.setDescription("Vo la .. blz");
		appointment.setRange(
					new DateRange(today, new Date())  );
		appointment.setRequester( new User ());
		appointment.setApprover( new User ());
		
		
	}
	
}
