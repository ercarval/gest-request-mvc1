package com.guestrequest.solicitation.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.guestrequest.solicitation.Appointment;

@Repository
public class AppointmentRepository {
	
	@PersistenceContext
	private EntityManager em;

	@Transactional
	public Appointment save(Appointment appointment) {
		if (appointment.getId() == null) {
			em.persist(appointment);
		} else {
			em.merge(appointment);
		}
		return appointment;
	}

	@Transactional(readOnly = true)
	public Appointment findOne(Long id) {
		return em.find(Appointment.class, id);
	}

	@Transactional
	public void remove(Long id) {
		em.remove(id);
	}

}
