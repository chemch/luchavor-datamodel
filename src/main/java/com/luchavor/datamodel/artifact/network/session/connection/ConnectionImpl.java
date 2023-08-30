package com.luchavor.datamodel.artifact.network.session.connection;

import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

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
@Node("Connection")
public class ConnectionImpl extends AbstractSessionEvent implements Connection {
	// static event type
	private SessionEventType sessionEventType = SessionEventType.CONNECTION;
	@Property("ObservedService")
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
	private String communityId;
	private NetworkProtocolType networkProtocolType;
}