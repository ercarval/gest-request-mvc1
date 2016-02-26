package com.guestrequest.shared.datasource;

public class MegaDataSource {
	
	private String name;
	
	public MegaDataSource() {
		name = "Mega DataSource";
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
