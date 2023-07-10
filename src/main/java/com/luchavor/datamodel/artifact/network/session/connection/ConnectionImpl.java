package com.luchavor.datamodel.artifact.network.session.connection;

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
@Node("Connection")
public class ConnectionImpl implements Connection {
	/* neo4j id */
	@Id @GeneratedValue 
	private UUID id;
	// static session event type
	private SessionEventType sessionEventType = SessionEventType.CONNECTION;
	// event attributes
	private LocalDateTime timestamp;
	private String uid;
	private String originatorIp;
	private Integer originatorPort;
	private String responderIp;
	private Integer responderPort;
	private SessionEventProtocol sessionEventProtocol;
	private String service;
	private Double duration;
	private Integer originatorPayloadByteCount;
	private Integer responderPayloadByteCount;
	private String connectionState;
	private Boolean localOriginatorFlag;
	private Boolean localResponderFlag;
	private Integer missedByteCount;
	private String stateHistory;
	private Integer originatorPacketCount;
	private Integer originatorTotalByteCount;
	private Integer responderPacketCount;
	private Integer responderTotalByteCount;
	private String parentTunnelUid;
	private Integer vlan;
	private Integer innerVlan;
	private String originatorMacAddress;
	private String responderMacAddress;
	private String speculativeService;
}