package com.luchavor.datamodel.util.converter;

import com.luchavor.datamodel.event.connection.ConnectionEvent;
import com.luchavor.datamodel.event.connection.ConnectionEventAdapter;

public class ConnectionEventConverter {
	// converter to convert TechniqueItem to AttackTechnique
	public ConnectionEvent toConnectionEvent( ConnectionEventAdapter adapter ) {
		ConnectionEvent converted = new ConnectionEvent();
		// add converted attributes
		converted.setTimestamp(adapter.getTimestamp());
		converted.setUid(adapter.getUid());
		converted.setOriginatorIp(adapter.getOriginatorIp());
		converted.setOriginatorPort(adapter.getOriginatorPort());
		converted.setResponderIp(adapter.getResponderIp());
		converted.setResponderPort(adapter.getResponderPort());
		converted.setProtocol(adapter.getProtocol());
		converted.setService(adapter.getService());
		converted.setDuration(adapter.getDuration());
		converted.setOriginatorPayloadByteCount(adapter.getOriginatorPayloadByteCount());
		converted.setResponderPayloadByteCount(adapter.getResponderPayloadByteCount());
		converted.setConnectionState(adapter.getConnectionState());
		converted.setLocalOriginatorFlag(adapter.getLocalOriginatorFlag());
		converted.setLocalResponderFlag(adapter.getLocalResponderFlag());
		converted.setMissedByteCount(adapter.getMissedByteCount());
		converted.setStateHistory(adapter.getStateHistory());
		converted.setOriginatorPacketCount(adapter.getOriginatorPacketCount());
		converted.setOriginatorTotalByteCount(adapter.getOriginatorTotalByteCount());
		converted.setResponderPacketCount(adapter.getResponderPacketCount());
		converted.setResponderTotalByteCount(adapter.getResponderTotalByteCount());
		converted.setParentTunnelUid(adapter.getParentTunnelUid());
		converted.setVlan(adapter.getVlan());
		converted.setInnerVlan(adapter.getInnerVlan());
		converted.setOriginatorMacAddress(adapter.getOriginatorMacAddress());
		converted.setResponderMacAddress(adapter.getResponderMacAddress());
		// return adapter converted connection event
		return converted;
	}
}