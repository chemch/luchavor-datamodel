package com.luchavor.datamodel.artifact.network.observation.software;

import java.time.LocalDateTime;
import java.util.UUID;

public interface Software {
	public UUID getId();
	public void setId(UUID id);
	public LocalDateTime getTimestamp();
	public void setTimestamp(LocalDateTime timestamp);
	public String getHostIp();
	public void setHostIp(String hostIp);
	public Integer getPort();
	public void setPort(Integer port);
	public String getType();
	public void setType(String type);
	public String getName();
	public void setName(String name);
	public Integer getMajorVersion();
	public void setMajorVersion(Integer majorVersion);
	public Integer getMinorVersion();
	public void setMinorVersion(Integer minorVersion);
	public Integer getMinor2Version();
	public void setMinor2Version(Integer minor2Version);
	public Integer getMinor3Version();
	public void setMinor3Version(Integer minor3Version);
	public String getAdditionalVersionInfo();
	public void setAdditionalVersionInfo(String additionalVersionInfo);
	public String getUnparsedVersion();
	public void setUnparsedVersion(String unparsedVersion);
	public String getUrl();
	public void setUrl(String url);
}