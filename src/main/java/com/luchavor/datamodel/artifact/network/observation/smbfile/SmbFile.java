package com.luchavor.datamodel.artifact.network.observation.smbfile;

import java.time.LocalDateTime;
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
	
	// action
	public String getAction();
	public void setAction(String action);
	
	// path
	public String getPath();
	public void setPath(String path);
	
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
	public LocalDateTime getModifiedTime();
	public void setModifiedTime(LocalDateTime modifiedTime);
	
	// accessed time
	public LocalDateTime getAccessedTime();
	public void setAccessedTime(LocalDateTime accessedTime);
	
	// created time
	public LocalDateTime getCreatedTime();
	public void setCreatedTime(LocalDateTime createdTime);
	
	// changed time
	public LocalDateTime getChangedTime();
	public void setChangedTime(LocalDateTime changedTime);
}