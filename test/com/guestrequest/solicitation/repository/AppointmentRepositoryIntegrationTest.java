package com.guestrequest.solicitation.repository;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.guestrequest.identity.Login;
import com.guestrequest.identity.User;
import com.guestrequest.identity.repository.UserRepository;
import com.guestrequest.solicitation.Appointment;
import com.guestrequest.solicitation.aggregate.DateRange;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations="file:WebContent/WEB-INF/application-context.xml")
public class AppointmentRepositoryIntegrationTest {

	@Autowired
	private AppointmentRepository repository;
	
	@Autowired
	private UserRepository userReposity;
	
	@Test
	public void createNewAppointment() {
		
		Date today = new Date();
		
		User requester = new User ("bisso","bisso@bisso"
				,new Login("bisso","admin"));
		
		User approver = new User ("bisso approver","bisso@bisso"
				,new Login("bissoapp","admin"));
		
		userReposity.create(approver);
		userReposity.create(requester);
		
		assertNotNull(approver.getId());
		assertNotNull(requester.getId());
		
		Appointment appointment = new Appointment();
		
	
		assertNotNull( "Todo Appointment tem que ter um Range"
				, appointment.getRange());
		
		appointment.setDescription("Vo la .. blz");
		appointment.setRange( new DateRange(today, new Date())  );
		
		appointment.setRequester( requester );
		appointment.setApprover(approver );
		
		repository.save(appointment);
		
		assertNotNull(appointment.getId());
		
		Long id = appointment.getId();
		
		Appointment storedAppointment = repository.findOne(id);
		
		assertEquals(appointment, storedAppointment);
		
	}
	
	
}
