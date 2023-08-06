package com.luchavor.datamodel.inference.inferredHost;

import java.util.UUID;

public interface InferredHost {
	public UUID getId();
	public void setId(UUID id);
	// host fields;
	public String getHostIp();
	public void setHostIp(String hostIp);
	public String getHostName();
	public void setHostName(String hostName);
	public String getMacAddress();
	public void setMacAddress(String macAddress);
}