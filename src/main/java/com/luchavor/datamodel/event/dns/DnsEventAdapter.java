package com.luchavor.datamodel.event.dns;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.TimeZone;

import com.luchavor.datamodel.common.Protocol;
import com.luchavor.datamodel.event.EventType;
import com.luchavor.datamodel.util.transform.event.EventTransformer;

public class DnsEventAdapter implements Dns {
	private EventTransformer eventTransformer = new EventTransformer();
	private DnsEventImport dnsEventImport;
	
	// constructor w/ only dns event import object
	public DnsEventAdapter(DnsEventImport dnsEventImport) {
		this.dnsEventImport = dnsEventImport;
	}

	public EventType getEventType() {
		return(dnsEventImport.getEventType());
	}

	public void setEventType(EventType eventType) {
		throw new UnsupportedOperationException();
	}
	
	public LocalDateTime getTimestamp() {
		// convert to long
		long unixTimestamp = Double.valueOf(dnsEventImport.getTimestamp()).longValue();
		// convert seconds to milliseconds		
		LocalDateTime rv = LocalDateTime.ofInstant(Instant.ofEpochSecond(unixTimestamp), TimeZone.getDefault().toZoneId());  
		// return value
		return( rv );
	}

	public void setTimestamp(LocalDateTime timestamp) {
		throw new UnsupportedOperationException();
	}

	public String getUid() {
		return dnsEventImport.getUid();
	}

	public void setUid(String uid) {
		throw new UnsupportedOperationException();		
	}

	public String getOriginatorIp() {
		String sanitized = eventTransformer.sanitize(dnsEventImport.getOriginatorIp());
		return(sanitized == null ? null : sanitized);
	}

	public void setOriginatorIp(String originatorIp) {
		throw new UnsupportedOperationException();		
	}

	public Integer getOriginatorPort() {
		String sanitized = eventTransformer.sanitize(dnsEventImport.getOriginatorPort());
		return(sanitized == null ? null : Integer.parseInt(sanitized));
	}

	public void setOriginatorPort(Integer originatorPort) {
		throw new UnsupportedOperationException();		
	}

	public String getResponderIp() {
		String sanitized = eventTransformer.sanitize(dnsEventImport.getResponderIp());
		return(sanitized == null ? null : sanitized);
	}

	public void setResponderIp(String responderIp) {
		throw new UnsupportedOperationException();		
	}

	public Integer getResponderPort() {
		String sanitized = eventTransformer.sanitize(dnsEventImport.getResponderPort());
		return(sanitized == null ? null : Integer.parseInt(sanitized));
	}

	public void setResponderPort(Integer responderPort) {
		throw new UnsupportedOperationException();		
	}

	public Protocol getProtocol() {
		return(Protocol.valueOf(dnsEventImport.getProtocol().toUpperCase()));
	}

	public void setProtocol(Protocol protocol) {
		throw new UnsupportedOperationException();		
	}

	@Override
	public Integer getTransactionId() {
		String sanitized = eventTransformer.sanitize(dnsEventImport.getTransactionId());
		return(sanitized == null ? null : Integer.parseInt(sanitized));
	}

	@Override
	public void setTransactionId(Integer transactionId) {
		throw new UnsupportedOperationException();	
	}

	@Override
	public Double getRoundTripTime() {
		String sanitized = eventTransformer.sanitize(dnsEventImport.getRoundTripTime());
		return(sanitized == null ? null : Double.parseDouble(sanitized));
	}

	@Override
	public void setRoundTripTime(Double roundTripTime) {
		throw new UnsupportedOperationException();	
	}

	@Override
	public String getQuery() {
		String sanitized = eventTransformer.sanitize(dnsEventImport.getQuery());
		return(sanitized == null ? null : sanitized);
	}

	@Override
	public void setQuery(String query) {
		throw new UnsupportedOperationException();	
	}

	@Override
	public Integer getQclass() {
		String sanitized = eventTransformer.sanitize(dnsEventImport.getQclass());
		return(sanitized == null ? null : Integer.parseInt(sanitized));
	}

	@Override
	public void setQclass(Integer qclass) {
		throw new UnsupportedOperationException();	
	}

	@Override
	public String getQclassName() {
		String sanitized = eventTransformer.sanitize(dnsEventImport.getQclassName());
		return(sanitized == null ? null : sanitized);
	}

	@Override
	public void setQclassName(String qclassName) {
		throw new UnsupportedOperationException();	
	}

	@Override
	public Integer getQtype() {
		String sanitized = eventTransformer.sanitize(dnsEventImport.getQtype());
		return(sanitized == null ? null : Integer.parseInt(sanitized));
	}

	@Override
	public void setQtype(Integer qtype) {
		throw new UnsupportedOperationException();	
	}

	@Override
	public String getQtypeName() {
		String sanitized = eventTransformer.sanitize(dnsEventImport.getQtypeName());
		return(sanitized == null ? null : sanitized);
	}

	@Override
	public void setQtypeName(String qtypeName) {
		throw new UnsupportedOperationException();	
	}

	@Override
	public Integer getRcode() {
		String sanitized = eventTransformer.sanitize(dnsEventImport.getRcode());
		return(sanitized == null ? null : Integer.parseInt(sanitized));
	}

	@Override
	public void setRcode(Integer rcode) {
		throw new UnsupportedOperationException();	
	}

	@Override
	public String getRcodeName() {
		String sanitized = eventTransformer.sanitize(dnsEventImport.getRcodeName());
		return(sanitized == null ? null : sanitized);
	}

	@Override
	public void setRcodeName(String rcodeName) {
		throw new UnsupportedOperationException();	
	}

	@Override
	public Boolean getAuthoritativeAnswerFlag() {
		Boolean sanitized = eventTransformer.toBoolean(dnsEventImport.getAuthoritativeAnswerFlag());
		return(sanitized == null ? null : sanitized);
	}

	@Override
	public void setAuthoritativeAnswerFlag(Boolean flag) {
		throw new UnsupportedOperationException();	
	}

	@Override
	public Boolean getTruncationFlag() {
		Boolean sanitized = eventTransformer.toBoolean(dnsEventImport.getTruncationFlag());
		return(sanitized == null ? null : sanitized);
	}

	@Override
	public void setTruncationFlag(Boolean flag) {
		throw new UnsupportedOperationException();	
	}

	@Override
	public Boolean getRecursionDesiredFlag() {
		Boolean sanitized = eventTransformer.toBoolean(dnsEventImport.getRecursionDesiredFlag());
		return(sanitized == null ? null : sanitized);
	}

	@Override
	public void setRecursionDesiredFlag(Boolean flag) {
		throw new UnsupportedOperationException();	
	}

	@Override
	public Boolean getRecursionAvailableFlag() {
		Boolean sanitized = eventTransformer.toBoolean(dnsEventImport.getRecursionAvailableFlag());
		return(sanitized == null ? null : sanitized);
	}

	@Override
	public void setRecursionAvailableFlag(Boolean flag) {
		throw new UnsupportedOperationException();	
	}

	@Override
	public Boolean getDnssecFlag() {
		Boolean sanitized = eventTransformer.toBoolean(dnsEventImport.getDnssecFlag());
		return(sanitized == null ? null : sanitized);
	}

	@Override
	public void setDnssecFlag(Boolean flag) {
		throw new UnsupportedOperationException();	
	}

	@Override
	public String[] getAnswers() {
		// get raw answers
		String[] answers = dnsEventImport.getAnswers().split(",");
		// return null for arrays with only -
		if( answers.length == 1 && eventTransformer.sanitize(answers[0]) == null ) {
			return( null );
		}
		// return value
		return(answers);
	}

	@Override
	public void setAnswers(String[] answers) {
		throw new UnsupportedOperationException();	
	}

	@Override
	public String[] getTtls() {
		// get raw values
		String[] values = dnsEventImport.getTtls().split(",");
		// return null for arrays with only -
		if( values.length == 1 && eventTransformer.sanitize(values[0]) == null ) {
			return( null );
		}
		// return converted values
		return(values);
	}

	@Override
	public void setTtls(String[] ttls) {
		throw new UnsupportedOperationException();	
	}

	@Override
	public Boolean getRejectedFlag() {
		Boolean sanitized = eventTransformer.toBoolean(dnsEventImport.getRejectedFlag());
		return(sanitized == null ? null : sanitized);
	}

	@Override
	public void setRejectedFlag(Boolean flag) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getAuthoritativeResponses() {
		String sanitized = eventTransformer.sanitize(dnsEventImport.getAuthoritativeResponses());
		return(sanitized == null ? null : sanitized);
	}

	@Override
	public void setAuthoritativeResponses(String responses) {
		throw new UnsupportedOperationException();	
	}

	@Override
	public String getAdditionalResponses() {
		String sanitized = eventTransformer.sanitize(dnsEventImport.getAdditionalResponses());
		return(sanitized == null ? null : sanitized);
	}

	@Override
	public void setAdditionalResponses(String responses) {
		throw new UnsupportedOperationException();	
	}

	@Override
	public String getOriginalQuery() {
		String sanitized = eventTransformer.sanitize(dnsEventImport.getOriginalQuery());
		return(sanitized == null ? null : sanitized);
	}

	@Override
	public void setOriginalQuery(String query) {
		throw new UnsupportedOperationException();	
	}
}