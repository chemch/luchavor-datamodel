package com.luchavor.datamodel.artifact.network.session.ntp;

import java.time.LocalDateTime;

import com.luchavor.datamodel.artifact.network.session.event.SessionEvent;
import com.luchavor.datamodel.artifact.network.session.event.SessionEventType;

public interface NtpEvent extends SessionEvent {
	public SessionEventType getSessionEventType();
	public void setSessionEventType(SessionEventType sessionEventType);
	public Integer getVersion();
	public void setVersion(Integer version);
	public Integer getMode();
	public void setMode(Integer mode);
	public Integer getStratum();
	public void setStratum(Integer stratum);
	public Integer getPoll();
	public void setPoll(Integer poll);
	public Double getPrecision();
	public void setPrecision(Double precision);
	public Double getRootDelay();
	public void setRootDelay(Double rootDelay);
	public Double getRootDispersion();
	public void setRootDispersion(Double rootDispersion);
	public String getReferenceId();
	public void setReferenceId(String referenceId);
	public LocalDateTime getReferenceTime();
	public void setReferenceTime(LocalDateTime referenceTime);
	public LocalDateTime getClientRequestTime();
	public void setClientRequestTime(LocalDateTime clientRequestTime);
	public LocalDateTime getServerRequestTime();
	public void setServerRequestTime(LocalDateTime serverRequestTime);
	public LocalDateTime getServerResponseTime();
	public void setServerResponseTime(LocalDateTime serverResponseTime);
	public Integer getExtensionCount();
	public void setExtensionCount(Integer extensionCount);
}