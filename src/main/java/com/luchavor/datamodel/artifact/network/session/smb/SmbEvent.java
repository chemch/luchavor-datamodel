package com.luchavor.datamodel.artifact.network.session.smb;

import java.time.LocalTime;
import com.luchavor.datamodel.artifact.network.session.event.SessionEvent;

public interface SmbEvent extends SessionEvent {
	public SmbEventType getSmbEventType();
	public void setSmbEventType(SmbEventType smbEventType);
	public String getPath();
	public void setPath(String path);
	public String getService();
	public void setService(String service);
	public String getNativeFileSystem();
	public void setNativeFileSystem(String nativeFileSystem);
	public String getShareType();
	public void setShareType(String shareType);
	public String getFileId();
	public void setFileId(String fileId);
	public String getAction();
	public void setAction(String action);
	public String getName();
	public void setName(String name);
	public Integer getSize();
	public void setSize(Integer size);
	public String getPreviousName();
	public void setPreviousName(String previousName);
	public LocalTime getModifiedTime();
	public void setModifiedTime(LocalTime modifiedTime);
	public LocalTime getAccessedTime();
	public void setAccessedTime(LocalTime accessedTime);
	public LocalTime getCreatedTime();
	public void setCreatedTime(LocalTime createdTime);
	public LocalTime getChangedTime();
	public void setChangedTime(LocalTime changedTime);
}