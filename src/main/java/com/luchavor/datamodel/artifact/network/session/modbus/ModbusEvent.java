package com.luchavor.datamodel.artifact.network.session.modbus;

import com.luchavor.datamodel.artifact.network.session.event.SessionEvent;

public interface ModbusEvent extends SessionEvent {
	public String getFunction();
	public void setFunction(String function);
	public Integer getTransactionId();
	public void setTransactionId(Integer transactionId);
	public Integer getUnit();
	public void setUnit(Integer unit);
	public PduType getPduType();
	public void setPduType(PduType pduType);
}