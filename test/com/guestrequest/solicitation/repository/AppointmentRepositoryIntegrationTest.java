package com.guestrequest.solicitation.repository;

import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.guestrequest.identity.User;
import com.guestrequest.solicitation.Appointment;
import com.guestrequest.solicitation.aggregate.DateRange;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="file:WebContent/WEB-INF/application-context-db.xml")
public class AppointmentRepositoryIntegrationTest {

	@Autowired
	private AppointmentRepository repository;
	
	@Test
	public void createNewAppointment() {
		
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
