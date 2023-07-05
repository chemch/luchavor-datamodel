package com.luchavor.datamodel.event.connection;

import com.luchavor.datamodel.event.EventType;
import lombok.Data;

@Data
public class ConnectionImport {
	private EventType eventType = EventType.CONNECTION;
	private String timestamp; 
	private String uid;
	private String originatorIp;
	private String originatorPort;
	private String responderIp;
	private String responderPort;
	private String protocol;
	private String service;
	private String duration;
	private String originatorPayloadByteCount;
	private String responderPayloadByteCount;
	private String connectionState;
	private String localOriginatorFlag;
	private String localResponderFlag;
	private String missedByteCount;
	private String stateHistory;
	private String originatorPacketCount;
	private String originatorTotalByteCount;
	private String responderPacketCount;
	private String responderTotalByteCount;
	private String parentTunnelUid;
	private String vlan;
	private String innerVlan;
	private String originatorMacAddress;
	private String responderMacAddress;
	private String speculativeService;
}