package com.luchavor.datamodel.artifact.network.observation.observedhost;

import java.time.LocalDateTime;
import java.util.UUID;

public interface ObservedHost {
	public UUID getId();
	public void setId(UUID id);
	public LocalDateTime getTimestamp();
	public void setTimestamp(LocalDateTime timestamp);
	public String getHostIp();
	public void setHostIp(String hostIp);
}