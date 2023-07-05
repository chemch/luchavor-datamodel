package com.luchavor.datamodel.event;

import java.time.LocalDateTime;

import com.luchavor.datamodel.common.Protocol;

public interface Event {
	// event type (enum) (always set to CONNECTION for this event)
		public EventType getEventType();
		public void setEventType(EventType eventType);
		// unix timestamp
		public LocalDateTime getTimestamp();
		public void setTimestamp(LocalDateTime timestamp);
		//uid
		public String getUid();
		public void setUid(String uid);
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
		// protocol (enum)
		public Protocol getProtocol();
		public void setProtocol(Protocol protocol);
}