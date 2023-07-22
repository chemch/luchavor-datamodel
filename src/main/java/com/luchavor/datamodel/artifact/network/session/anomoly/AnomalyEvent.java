package com.luchavor.datamodel.artifact.network.session.anomoly;

import com.luchavor.datamodel.artifact.network.session.event.SessionEvent;
import com.luchavor.datamodel.artifact.network.session.event.SessionEventType;

public interface AnomalyEvent extends SessionEvent {
	public SessionEventType getSessionEventType();
	public void setSessionEventType(SessionEventType sessionEventType);
	public String getName();
	public void setName(String name);
	public String getDetails();
	public void setDetails(String details);
	public Boolean getNoticeFlag();
	public void setNoticeFlag(Boolean noticeFlag);
	public String getPeer();
	public void setPeer(String peer);
	public String getService();
	public void setService(String service);
}