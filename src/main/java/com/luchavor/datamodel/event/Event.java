package com.luchavor.datamodel.event;

public interface Event {
	// model is either ATTACK or DEFEND model
	public String getModel();
	public void setModel(String model);
}