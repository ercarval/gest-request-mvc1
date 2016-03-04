package com.guestrequest.shared.datasource;

import org.springframework.stereotype.Component;

@Component
public class MegaDataSource {
	
	private String name;
	
	public MegaDataSource() {
		name = "Mega DataSource";
		System.out.println("MegaDataSource instanciada ... !!! ");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MegaDataSource [name=" + name + "]";
	}
	
	

}
