package com.luchavor.datamodel.event.connection;

import java.time.LocalDateTime;
import com.luchavor.datamodel.common.Protocol;
import com.luchavor.datamodel.event.EventType;

public interface Connection {
	// event type (enum) (always set to CONNECTION for this event)
	public EventType getEventType();
	public void setEventType(EventType eventType);
	// unix timestamp
	public LocalDateTime getTimestamp();
	public void setTimestamp(LocalDateTime timestamp);
	//uid
	public String getUid();
	public void setUid(String uid);
	// originator ip
	public String getOriginatorIp();
	public void setOriginatorIp(String originatorIp);
	// originator port
	public Integer getOriginatorPort();
	public void setOriginatorPort(Integer originatorPort);
	// responder ip
	public String getResponderIp();
	public void setResponderIp(String responderIp);
	// responder port
	public Integer getResponderPort();
	public void setResponderPort(Integer responderPort);
	// protol (enum)
	public Protocol getProtocol();
	public void setProtocol(Protocol protocol);
	// service
	public String getService();
	public void setService(String service);
	// duration
	public Double getDuration();
	public void setDuration(Double duration);
	// originator payload byte count
	public Integer getOriginatorPayloadByteCount();
	public void setOriginatorPayloadByteCount(Integer originatorPayloadByteCount);
	// responder payload byte count
	public Integer getResponderPayloadByteCount();
	public void setResponderPayloadByteCount(Integer responderPayloadByteCount);
	// connection state
	public String getConnectionState();
	public void setConnectionState(String connectionState);
	// local originator flag
	public Boolean getLocalOriginatorFlag();
	public void setLocalOriginatorFlag(Boolean localOriginatorFlag);
	// local responder flag 
	public Boolean getLocalResponderFlag();
	public void setLocalResponderFlag(Boolean localResponderFlag);
	// missed byte count
	public Integer getMissedByteCount();
	public void setMissedByteCount(Integer missedByteCount);
	// state history
	public String getStateHistory();
	public void setStateHistory(String stateHistory);
	// originator packet count
	public Integer getOriginatorPacketCount();
	public void setOriginatorPacketCount(Integer originatorPacketCount);
	// originator total byte count
	public Integer getOriginatorTotalByteCount();
	public void setOriginatorTotalByteCount(Integer originatorTotalByteCount);
	// responder packet count
	public Integer getResponderPacketCount();
	public void setResponderPacketCount(Integer responderPacketCount);
	// responder total byte count
	public Integer getResponderTotalByteCount();
	public void setResponderTotalByteCount(Integer responderTotalByteCount);
	// parent tunnel uid
	public String getParentTunnelUid();
	public void setParentTunnelUid(String parentTunnelUid);
	// vlan
	public Integer getVlan();
	public void setVlan(Integer vlan);
	// inner vlan
	public Integer getInnerVlan();
	public void setInnerVlan(Integer innerVlan);
	// orignator mac 
	public String getOriginatorMacAddress();
	public void setOriginatorMacAddress(String originatorMacAddress);
	// responder mac 
	public String getResponderMacAddress();
	public void setResponderMacAddress(String responderMacAddress);
}