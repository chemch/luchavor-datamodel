package com.luchavor.datamodel.util.converter;

import com.luchavor.datamodel.event.dns.Dns;
import com.luchavor.datamodel.event.dns.DnsEvent;
import com.luchavor.datamodel.event.dns.DnsEventAdapter;

public class DnsEventConverter {
	public Dns toDnsEvent( DnsEventAdapter adapter ) {
		Dns converted = new DnsEvent();
		// add converted attributes
		converted.setTimestamp(adapter.getTimestamp());
		converted.setUid(adapter.getUid());
		converted.setOriginatorIp(adapter.getOriginatorIp());
		converted.setOriginatorPort(adapter.getOriginatorPort());
		converted.setResponderIp(adapter.getResponderIp());
		converted.setResponderPort(adapter.getResponderPort());
		converted.setProtocol(adapter.getProtocol());
		converted.setTransactionId(adapter.getTransactionId());
		converted.setRoundTripTime(adapter.getRoundTripTime());
		converted.setQuery(adapter.getQuery());
		converted.setQclass(adapter.getQclass());
		converted.setQclassName(adapter.getQclassName());
		converted.setQtype(adapter.getQtype());
		converted.setQtypeName(adapter.getQtypeName());
		converted.setRcode(adapter.getRcode());
		converted.setRcodeName(adapter.getRcodeName());
		converted.setAuthoritativeAnswerFlag(adapter.getAuthoritativeAnswerFlag());
		converted.setTruncationFlag(adapter.getTruncationFlag());
		converted.setRecursionDesiredFlag(adapter.getRecursionDesiredFlag());
		converted.setRecursionAvailableFlag(adapter.getRecursionAvailableFlag());
		converted.setDnssecFlag(adapter.getDnssecFlag());
		converted.setAnswers(adapter.getAnswers());
		converted.setTtls(adapter.getTtls());
		converted.setRejectedFlag(adapter.getRejectedFlag());
		converted.setAuthoritativeResponses(adapter.getAuthoritativeResponses());
		converted.setAdditionalResponses(adapter.getAdditionalResponses());
		converted.setOriginalQuery(adapter.getOriginalQuery());
		// return adapter converted event
		return converted;
	}
}