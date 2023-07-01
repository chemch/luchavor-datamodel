package com.luchavor.datamodel.event;

import java.net.InetAddress;

import com.luchavor.datamodel.common.Protocol;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class Connection extends AbstractEvent {
	// connection event
	private EventType eventType = EventType.CONNECTION;
	// connection event attributes
	private String uid;
	private InetAddress originatorIp;
	private int originatorPort;
	private InetAddress responderIp;
	private int responderPort;
	private Protocol protocol;
	private String service;
	private double duration;
	private int originatorPayloadByteCount;
	private int responderPayloadByteCount;
	private String connectionState;
	private boolean localOriginationFlag;
	private boolean localResponderFlag;
	private int missedByteCount;
	private String StateHistory;
	private int originatorPacketCount;
	private int originatorTotalByteCount;
	private int responderPacketCount;
	private int responderTotalByteCount;
	private String parentTunnelUid;
	private int vlan;
	private int innerVlan;
	private String originatorMacAddress;
	private String responderMacAddress;
}