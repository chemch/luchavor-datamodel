package com.luchavor.datamodel.detection.zeeknotification;

import java.time.LocalDateTime;
import java.util.UUID;

import com.luchavor.datamodel.artifact.network.common.NetworkProtocolType;

public interface ZeekNotification {
	public UUID getId();
	public void setId(UUID uuid);
	public LocalDateTime getTimestamp();
	public void setTimestamp(LocalDateTime timestamp);
	public String getUid();
	public void setUid(String uid);
	public String getOriginatorIp();
	public void setOriginatorIp(String originatorIp);
	public Integer getOriginatorPort();
	public void setOriginatorPort(Integer originatorPort);
	public String getResponderIp();
	public void setResponderIp(String responderIp);
	public Integer getResponderPort();
	public void setResponderPort(Integer responderPort);
	public String getFuid();
	public void setFuid(String fuid);
	public String getFileMimeType();
	public void setFileMimeType(String fileMimeType);
	public String getFileDescription();
	public void setFileDescription(String fileDescription);
	public NetworkProtocolType getProtocol();
	public void setProtocol(NetworkProtocolType protocol);
	public String getNotificationCategory();
	public void setNotificationCategory(String notificationCategory);
	public String getDetail();
	public void setDetail(String detail);
	public String getSubDetail();
	public void setSubDetail(String subDetail);
	public String getSourceIp();
	public void setSourceIp(String sourceIp);
	public String getDestinationIp();
	public void setDestinationIp(String destinationIp);
	public Integer getPort();
	public void setPort(Integer port);
	public Integer getOccurenceCount();
	public void setOccurenceCount(Integer occurenceCount);
	public String getPeerDescription();
	public void setPeerDescription(String peerDescription);
	public String getAction();
	public void setAction(String action);
	public String getEmailDestination();
	public void setEmailDestination(String emailDestination);
	public Integer getSuppressForSetting();
	public void setSuppressForSetting(Integer suppressForSetting);
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