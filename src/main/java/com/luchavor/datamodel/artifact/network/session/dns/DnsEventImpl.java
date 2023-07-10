package com.luchavor.datamodel.artifact.network.session.dns;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import com.luchavor.datamodel.artifact.network.session.event.SessionEventProtocol;
import com.luchavor.datamodel.artifact.network.session.event.SessionEventType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Node("DnsEvent")
public class DnsEventImpl implements DnsEvent {
	/* neo4j id */
	@Id @GeneratedValue 
	private UUID id;
	// static session event type
	private SessionEventType sessionEventType = SessionEventType.DNS;
	// event attributes
	private LocalDateTime timestamp;
	private String uid;
	private String originatorIp;
	private Integer originatorPort;
	private String responderIp;
	private Integer responderPort;
	private SessionEventProtocol sessionEventProtocol;
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