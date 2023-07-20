package com.luchavor.datamodel.artifact.network.session.smb;

import com.luchavor.datamodel.artifact.network.session.event.SessionEvent;

public interface SmbEvent extends SessionEvent {
	public String getPath();
	public void setPath(String path);
	public String getService();
	public void setService(String service);
	public String getNativeFileSystem();
	public void setNativeFileSystem(String nativeFileSystem);
	public String getShareType();
	public void setShareType(String shareType);
}