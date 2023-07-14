package com.luchavor.datamodel.artifact.network.session.rpc;

import com.luchavor.datamodel.artifact.network.session.event.SessionEvent;

public interface RpcEvent extends SessionEvent {
	// round trip time
	public Double getRoundTripTime();
	public void setRoundTripTime(Double roundTripTime);
	// named pipe
	public String getNamedPipe();
	public void setNamedPipe(String namedPipe);
	// endpoint
	public String getEndpoint();
	public void setEndpoint(String endpoint);
	// operation
	public String getOperation();
	public void setOperation(String operation);
}