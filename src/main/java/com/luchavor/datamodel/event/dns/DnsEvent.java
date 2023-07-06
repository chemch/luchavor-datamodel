package com.luchavor.datamodel.event.dns;

import java.time.LocalDateTime;
import com.luchavor.datamodel.common.Protocol;
import com.luchavor.datamodel.event.EventType;
import lombok.Data;

@Data
public class DnsEvent implements Dns {
	private EventType eventType = EventType.DNS;
	private LocalDateTime timestamp;
	private String uid;
	private String originatorIp;
	private Integer originatorPort;
	private String responderIp;
	private Integer responderPort;
	private Protocol protocol;
	private Integer transactionId;
	private Double roundTripTime;
	private String query;
	private Integer qclass;
	private String qclassName;
	private Integer qtype;
	private String qtypeName;
	private Integer rcode;
	private String rcodeName;
	private Boolean authoritativeAnswerFlag;
	private Boolean truncationFlag;
	private Boolean recursionDesiredFlag;
	private Boolean recursionAvailableFlag;
	private Boolean dnssecFlag;
	private String[] answers;
	private String[] ttls;
	private Boolean rejectedFlag;
	private String authoritativeResponses;
	private String additionalResponses;
	private String originalQuery;
}