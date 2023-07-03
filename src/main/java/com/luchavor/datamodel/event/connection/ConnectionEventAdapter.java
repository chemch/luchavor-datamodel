package com.luchavor.datamodel.event.connection;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.TimeZone;
import com.luchavor.datamodel.common.Protocol;
import com.luchavor.datamodel.event.EventType;
import com.luchavor.datamodel.util.transform.event.EventTransformer;

public class ConnectionEventAdapter implements Connection {	
	private EventTransformer eventTransformer = new EventTransformer();
	private ConnectionEventImport connectionEventImport;
	
	// constructor w/ only connection event import object
	public ConnectionEventAdapter(ConnectionEventImport connectionEventImport) {
		this.connectionEventImport = connectionEventImport;
	}

	public EventType getEventType() {
		return(connectionEventImport.getEventType());
	}

	public void setEventType(EventType eventType) {
		throw new UnsupportedOperationException();
	}
	
	public LocalDateTime getTimestamp() {
		// convert to long
		long unixTimestamp = Double.valueOf(connectionEventImport.getTimestamp()).longValue();
		// convert seconds to milliseconds		
		LocalDateTime rv = LocalDateTime.ofInstant(Instant.ofEpochSecond(unixTimestamp), TimeZone.getDefault().toZoneId());  
		// return value
		return( rv );
	}

	public void setTimestamp(LocalDateTime timestamp) {
		throw new UnsupportedOperationException();
	}

	public String getUid() {
		return connectionEventImport.getUid();
	}

	public void setUid(String uid) {
		throw new UnsupportedOperationException();		
	}

	public String getOriginatorIp() {
		String sanitized = eventTransformer.sanitize(connectionEventImport.getOriginatorIp());
		return(sanitized == null ? null : sanitized);
	}

	public void setOriginatorIp(String originatorIp) {
		throw new UnsupportedOperationException();		
	}

	public Integer getOriginatorPort() {
		String sanitized = eventTransformer.sanitize(connectionEventImport.getOriginatorPort());
		return(sanitized == null ? null : Integer.parseInt(sanitized));
	}

	public void setOriginatorPort(Integer originatorPort) {
		throw new UnsupportedOperationException();		
	}

	public String getResponderIp() {
		String sanitized = eventTransformer.sanitize(connectionEventImport.getResponderIp());
		return(sanitized == null ? null : sanitized);
	}

	public void setResponderIp(String responderIp) {
		throw new UnsupportedOperationException();		
	}

	public Integer getResponderPort() {
		String sanitized = eventTransformer.sanitize(connectionEventImport.getResponderPort());
		return(sanitized == null ? null : Integer.parseInt(sanitized));
	}

	public void setResponderPort(Integer responderPort) {
		throw new UnsupportedOperationException();		
	}

	public Protocol getProtocol() {
		return(Protocol.valueOf(connectionEventImport.getProtocol().toUpperCase()));
	}

	public void setProtocol(Protocol protocol) {
		throw new UnsupportedOperationException();		
	}

	public String getService() {
		String sanitized = eventTransformer.sanitize(connectionEventImport.getService());
		return(sanitized == null ? null : sanitized);
	}

	public void setService(String service) {
		throw new UnsupportedOperationException();		
	}

	public Double getDuration() {
		String sanitized = eventTransformer.sanitize(connectionEventImport.getDuration());
		return(sanitized == null ? null : Double.parseDouble(sanitized));
	}

	public void setDuration(Double duration) {
		throw new UnsupportedOperationException();		
	}

	public Integer getOriginatorPayloadByteCount() {
		String sanitized = eventTransformer.sanitize(connectionEventImport.getOriginatorPayloadByteCount());
		return(sanitized == null ? null : Integer.parseInt(sanitized));
	}

	public void setOriginatorPayloadByteCount(Integer originatorPayloadByteCount) {
		throw new UnsupportedOperationException();		
	}

	public Integer getResponderPayloadByteCount() {
		String sanitized = eventTransformer.sanitize(connectionEventImport.getResponderPayloadByteCount());
		return(sanitized == null ? null : Integer.parseInt(sanitized));
	}

	public void setResponderPayloadByteCount(Integer responderPayloadByteCount) {
		throw new UnsupportedOperationException();		
	}

	public String getConnectionState() {
		return connectionEventImport.getConnectionState();
	}

	public void setConnectionState(String connectionState) {
		throw new UnsupportedOperationException();
	}

	public Boolean getLocalOriginatorFlag() {
		Boolean sanitized = eventTransformer.toBoolean(connectionEventImport.getLocalOriginatorFlag());
		return(sanitized == null ? null : sanitized);
	}

	public void setLocalOriginatorFlag(Boolean localOriginatorFlag) {
		throw new UnsupportedOperationException();		
	}

	public Boolean getLocalResponderFlag() {
		Boolean sanitized = eventTransformer.toBoolean(connectionEventImport.getLocalResponderFlag());
		return(sanitized == null ? null : sanitized);
	}

	public void setLocalResponderFlag(Boolean localResponderFlag) {
		throw new UnsupportedOperationException();		
	}

	public Integer getMissedByteCount() {
		String sanitized = eventTransformer.sanitize(connectionEventImport.getMissedByteCount());
		return(sanitized == null ? null : Integer.parseInt(sanitized));
	}

	public void setMissedByteCount(Integer missedByteCount) {
		throw new UnsupportedOperationException();		
	}

	public String getStateHistory() {
		return(eventTransformer.sanitize(connectionEventImport.getStateHistory()));
	}

	public void setStateHistory(String stateHistory) {
		throw new UnsupportedOperationException();		
	}

	public Integer getOriginatorPacketCount() {
		String sanitized = eventTransformer.sanitize(connectionEventImport.getOriginatorPacketCount());
		return(sanitized == null ?null : Integer.parseInt(sanitized));
	}

	public void setOriginatorPacketCount(Integer originatorPacketCount) {
		throw new UnsupportedOperationException();		
	}

	public Integer getOriginatorTotalByteCount() {
		String sanitized = eventTransformer.sanitize(connectionEventImport.getOriginatorTotalByteCount());
		return(sanitized == null ? null : Integer.parseInt(sanitized));
	}

	public void setOriginatorTotalByteCount(Integer originatorTotalByteCount) {
		throw new UnsupportedOperationException();		
	}

	public Integer getResponderPacketCount() {
		String sanitized = eventTransformer.sanitize(connectionEventImport.getResponderPacketCount());
		return(sanitized == null ? null : Integer.parseInt(sanitized));
	}

	public void setResponderPacketCount(Integer responderPacketCount) {
		throw new UnsupportedOperationException();		
	}

	public Integer getResponderTotalByteCount() {
		String sanitized = eventTransformer.sanitize(connectionEventImport.getResponderTotalByteCount());
		return(sanitized == null ? null : Integer.parseInt(sanitized));
	}

	public void setResponderTotalByteCount(Integer responderTotalByteCount) {
		throw new UnsupportedOperationException();
	}

	public String getParentTunnelUid() {
		String sanitized = eventTransformer.sanitize(connectionEventImport.getParentTunnelUid());
		return(sanitized == null ? null : sanitized);
	}

	public void setParentTunnelUid(String parentTunnelUid) {
		throw new UnsupportedOperationException();
	}

	public Integer getVlan() {
		String sanitized = eventTransformer.sanitize(connectionEventImport.getVlan());
		return(sanitized == null ? null : Integer.parseInt(sanitized));
	}

	public void setVlan(Integer vlan) {
		throw new UnsupportedOperationException();
	}

	public Integer getInnerVlan() {
		String sanitized = eventTransformer.sanitize(connectionEventImport.getInnerVlan());
		return(sanitized == null ? null : Integer.parseInt(sanitized));
	}

	public void setInnerVlan(Integer innerVlan) {
		throw new UnsupportedOperationException();
	}

	public String getOriginatorMacAddress() {
		return(connectionEventImport.getOriginatorMacAddress());
	}

	public void setOriginatorMacAddress(String originatorMacAddress) {
		throw new UnsupportedOperationException();
	}

	public String getResponderMacAddress() {
		return(connectionEventImport.getResponderMacAddress());
	}

	public void setResponderMacAddress(String responderMacAddress) {
		throw new UnsupportedOperationException();
	}
}