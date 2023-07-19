package com.luchavor.datamodel.artifact.network.observation.service;

import java.time.LocalDateTime;
import java.util.UUID;

import com.luchavor.datamodel.artifact.network.common.NetworkProtocolType;

public interface Service {
	public UUID getId();
	public void setId(UUID id);
	public LocalDateTime getTimestamp();
	public void setTimestamp(LocalDateTime timestamp);
	public String getHostIp();
	public void setHostIp(String hostIp);
	public Integer getPort();
	public void setPort(Integer port);
	public NetworkProtocolType getNetworkProtocolType();
	public void setNetworkProtocolType(NetworkProtocolType networkProtocolType);
	public String getService();
	public void setService(String service);
}
