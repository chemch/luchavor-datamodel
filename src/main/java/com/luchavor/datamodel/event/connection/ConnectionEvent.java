package com.luchavor.datamodel.event.connection;

import java.time.LocalDateTime;
import com.luchavor.datamodel.common.Protocol;
import com.luchavor.datamodel.event.EventType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ConnectionEvent implements Connection {
	private EventType eventType = EventType.CONNECTION;
	private LocalDateTime timestamp;
	private String uid;
	private String originatorIp;
	private Integer originatorPort;
	private String responderIp;
	private Integer responderPort;
	private Protocol protocol;
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
}