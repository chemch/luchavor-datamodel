package com.luchavor.datamodel.event.dns;

import com.luchavor.datamodel.event.EventType;
import lombok.Data;

@Data
public class DnsEventImport {
	private EventType eventType = EventType.DNS;
	private String timestamp;
	private String uid;
	private String originatorIp;
	private String originatorPort;
	private String responderIp;
	private String responderPort;
	private String protocol;
	private String transactionId;
	private String roundTripTime;
	private String query;
	private String qclass;
	private String qclassName;
	private String qtype;
	private String qtypeName;
	private String rcode;
	private String rcodeName;
	private String authoritativeAnswerFlag;
	private String truncationFlag;
	private String recursionDesiredFlag;
	private String recursionAvailableFlag;
	private String dnssecFlag;
	private String answers;
	private String ttls;
	private String rejectedFlag;
	private String authoritativeResponses;
	private String additionalResponses;
	private String originalQuery;
}