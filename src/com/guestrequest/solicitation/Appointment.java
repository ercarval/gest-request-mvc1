package com.guestrequest.solicitation;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.guestrequest.identity.User;
import com.guestrequest.solicitation.aggregate.AppointmentType;
import com.guestrequest.solicitation.aggregate.DateRange;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Getter @Setter @AllArgsConstructor @EqualsAndHashCode(of="id")
public class Appointment implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Embedded
	private DateRange range;
	
	@ManyToOne()
	@JoinColumn(name="requester_id")
	private User requester;
	
	
	@JoinColumn(name="approver_id")
	private User approver;
	
	
	@Enumerated(EnumType.STRING)
	private AppointmentType type;
	
	private String description;
	
	@OneToMany(mappedBy="appointment")	
	private List<Guest> guests;
	
	public Appointment() {
	}

	
	
	
}
