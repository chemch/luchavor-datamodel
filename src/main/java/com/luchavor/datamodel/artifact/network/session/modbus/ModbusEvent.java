package com.luchavor.datamodel.artifact.network.session.modbus;

import com.luchavor.datamodel.artifact.network.session.event.SessionEvent;

public interface ModbusEvent extends SessionEvent {
	public String getFunction();
	public void setFunction(String function);
	public String getException();
	public void setException(String exception);
}