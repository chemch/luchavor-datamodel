package com.luchavor.datamodel.artifact.network.observation.certificate;

import java.time.LocalDateTime;
import java.util.UUID;

public interface Certificate {
	public UUID getId();
	public void setId(UUID id);
	// observation fields
	public LocalDateTime getTimestamp();
	public void setTimestamp(LocalDateTime timestamp);
	public String getHostIp();
	public void setHostIp(String hostIp);
	public Integer getPort();
	public void setPort(Integer port);
	public String getSubject();
	public void setSubject(String subject);
	public String getIssuerSubject();
	public void setIssuerSubject(String issuerSubject);
	public String getSerial();
	public void setSerial(String serial);
}