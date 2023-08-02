package com.luchavor.datamodel.artifact.network.session.ftp;

import com.luchavor.datamodel.artifact.network.session.event.SessionEvent;
import com.luchavor.datamodel.artifact.network.session.event.SessionEventType;

public interface FtpEvent extends SessionEvent {
	public SessionEventType getSessionEventType();
	public void setSessionEventType(SessionEventType sessionEventType);
	public String getUser();
	public void setUser(String user);
	public String getPassword();
	public void setPassword(String password);
	public String getCommand();
	public void setCommand(String command);
	public String getArgument();
	public void setArgument(String argument);
	public String getMimeType();
	public void setMimeType(String mimeType);
	public Integer getFileSize();
	public void setFileSize(Integer fileSize);
	public Integer getReplyCode();
	public void setReplyCode(Integer replyCode);
	public String getReplyMessage();
	public void setReplyMessage(String replyMessage);
	public Boolean getDataChannelPassiveFlag();
	public void setDataChannelPassiveFlag(Boolean dataChannelPassiveFlag);
	public String getDataChannelOriginatorIp();
	public void setDataChannelOriginatorIp(String dataChannelOriginatorIp);
	public String getDataChannelResponderIp();
	public void setDataChannelResponderIp(String dataChannelResponderIp);
	public String getDataChannelResponderPort();
	public void setDataChannelResponderPort(String dataChannelResponderPort);
	public String getFuid();
	public void setFuid(String fuid);
}