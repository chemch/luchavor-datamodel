package com.luchavor.datamodel.artifact.network.session.dns;

import org.springframework.data.neo4j.core.schema.Node;

import com.luchavor.datamodel.artifact.network.common.NetworkProtocolType;
import com.luchavor.datamodel.artifact.network.session.event.AbstractSessionEvent;
import com.luchavor.datamodel.artifact.network.session.event.SessionEventType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Node("DnsEvent")
public class DnsEventImpl extends AbstractSessionEvent implements DnsEvent {
	// static event type
	private SessionEventType sessionEventType = SessionEventType.DNS;
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
	private NetworkProtocolType networkProtocolType;
}