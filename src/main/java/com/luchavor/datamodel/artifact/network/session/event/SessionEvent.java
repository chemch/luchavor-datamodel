package com.luchavor.datamodel.artifact.network.session.event;

import java.time.LocalDateTime;
import java.util.UUID;

public interface SessionEvent {
	// neo4j id
	public UUID getId();
	public void setId(UUID uuid);
	
	// event type (enum)
	public SessionEventType getSessionEventType();
	public void setSessionEventType(SessionEventType type);
	
	// unix timestamp
	public LocalDateTime getTimestamp();
	public void setTimestamp(LocalDateTime timestamp);
	
	//uid
	public String getCuid();
	public void setCuid(String uid);
	
	// originator ip
	public String getOriginatorIp();
	public void setOriginatorIp(String originatorIp);
	
	// originator port
	public Integer getOriginatorPort();
	public void setOriginatorPort(Integer originatorPort);
	
	// responder ip
	public String getResponderIp();
	public void setResponderIp(String responderIp);
	
	// responder port
	public Integer getResponderPort();
	public void setResponderPort(Integer responderPort);
}