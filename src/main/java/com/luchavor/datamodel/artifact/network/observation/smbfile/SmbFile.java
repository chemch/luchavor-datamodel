package com.luchavor.datamodel.artifact.network.observation.smbfile;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.UUID;

public interface SmbFile {
	// neo4j id
	public UUID getId();
	public void setId(UUID uuid);
	
	// unix timestamp
	public LocalDateTime getTimestamp();
	public void setTimestamp(LocalDateTime timestamp);
	
	// uid
	public String getUid();
	public void setUid(String uid);
	
	// originator ip
	public String getOriginatorIp();
	public void setOriginatorIp(String originatorIp);
	
	// originator port
	public Integer getOriginatorPort();
	public void setOriginatorPort(Integer originatorPort);
	
	// responder ip
	public String getResponderIp();
	public void setResponderIp(String responderIp);
	
	// responder port
	public Integer getResponderPort();
	public void setResponderPort(Integer responderPort);
	
	// actoin
	public String getAction();
	public void setAction(String action);
	
	// file name
	public String getName();
	public void setName(String name);
	
	// file size
	public Integer getSize();
	public void setSize(Integer size);
	
	// previous name
	public String getPreviousName();
	public void setPreviousName(String previousName);
	
	// modified time
	public LocalTime getModifiedTime();
	public void setModifiedTime(LocalTime modifiedTime);
	
	// accessed time
	public LocalTime getAccessedTime();
	public void setAccessedTime(LocalTime accessedTime);
	
	// created time
	public LocalTime getCreatedTime();
	public void setCreatedTime(LocalTime createdTime);
	
	// changed time
	public LocalTime getChangedTime();
	public void setChangedTime(LocalTime changedTime);
}