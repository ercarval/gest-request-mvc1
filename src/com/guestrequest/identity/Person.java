package com.guestrequest.identity;

import java.io.Serializable;

public abstract class Person implements Serializable {
	
	private Long id;
	
	private String name;
	
	private Contact contact;
	
	private String document;

	public Person() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", document=" + document + "]";
	}

	
	
}
