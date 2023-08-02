package com.luchavor.datamodel.artifact.network.session.ssh;

import com.luchavor.datamodel.artifact.network.session.event.SessionEvent;
import com.luchavor.datamodel.artifact.network.session.event.SessionEventType;

public interface SshEvent extends SessionEvent {
	public SessionEventType getSessionEventType();
	public void setSessionEventType(SessionEventType sessionEventType);
	public Integer getVersion();
	public void setVersion(Integer version);
	public Boolean getAuthenticationSuccessFlag();
	public void setAuthenticationSuccessFlag(Boolean authenticationSuccessFlag);
	public Integer getAuthenticationAttemptCount();
	public void setAuthenticationAttemptCount(Integer authenticationAttemptCount);
	public String getDirection();
	public void setDirection(String direction);
	public String getClient();
	public void setClient(String client);
	public String getServer();
	public void setServer(String server);
	public String getCipherAlgorithm();
	public void setCipherAlgorithm(String cipherAlgorithm);
	public String getMacAlgorithm();
	public void setMacAlgorithm(String macAlgorithm);
	public String getCompressionAlgorithm();
	public void setCompressionAlgorithm(String compressionAlgorithm);
	public String getKeyExchangeAlgorithm();
	public void setKeyExchangeAlgorithm(String keyExchangeAlgorithm);
	public String getHostKeyExchangeAlgorithm();
	public void setHostKeyExchangeAlgorithm(String hostKeyExchangeAlgorithm);
	public String getHostKey();
	public void setHostKey(String hostKey);
	public String getRemoteLocationCountryCode();
	public void setRemoteLocationCountryCode(String remoteLocationCountryCode);
	public String getRemoteLocationRegion();
	public void setRemoteLocationRegion(String remoteLocationRegion);
	public String getRemoteLocationCity();
	public void setRemoteLocationCity(String remoteLocationCity);
	public Double getRemoteLocationLattitude();
	public void setRemoteLocationLattitude(Double remoteLocationLattitude);
	public Double getRemoteLocationLongitude();
	public void setRemoteLocationLongitude(Double remoteLocationLongitude);
}