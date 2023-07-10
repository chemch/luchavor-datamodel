package com.luchavor.datamodel.artifact.network.session.connection;

import com.luchavor.datamodel.artifact.network.session.event.SessionEvent;

public interface Connection extends SessionEvent {
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
	// speculative service
	public String getSpeculativeService();
	public void setSpeculativeService(String service);
}