package com.luchavor.datamodel.event;

public interface Event {
	
	// model is either ATT&CK or D3FEND model
	public String getModel();
	public void setModel(String model);
}