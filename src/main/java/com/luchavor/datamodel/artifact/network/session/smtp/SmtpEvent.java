package com.luchavor.datamodel.artifact.network.session.smtp;

import com.luchavor.datamodel.artifact.network.session.event.SessionEvent;
import com.luchavor.datamodel.artifact.network.session.event.SessionEventType;

public interface SmtpEvent extends SessionEvent {
	public SessionEventType getSessionEventType();
	public void setSessionEventType(SessionEventType sessionEventType);
	public Integer getTransactionDepth();
	public void setTransactionDepth(Integer transactionDepth);
	public String getHelo();
	public void setHelo(String helo);
	public String getMailFrom();
	public void setMailFrom(String mailFrom);
	public String getReceiptTo();
	public void setReceiptTo(String receiptTo);
	public String getDateHeader();
	public void setDateHeader(String dateHeader);
	public String getFrom();
	public void setFrom(String from);
	public String getTo();
	public void setTo(String to);
	public String getCc();
	public void setCc(String cc);
	public String getReplyTo();
	public void setReplyTo(String replyTo);
	public String getMsgId();
	public void setMsgId(String msgId);
	public String getInReplyTo();
	public void setInReplyTo(String inReplyTo);
	public String getSubject();
	public void setSubject(String subject);
	public String getXOriginatingIp();
	public void setXOriginatingIp(String xOriginatingIp);
	public String getFirstReceived();
	public void setFirstReceived(String firstReceived);
	public String getSecondReceived();
	public void setSecondReceived(String secondReceived);
	public String getLastReply();
	public void setLastReply(String lastReply);
	public String getPath();
	public void setPath(String path);
	public String getUserAgent();
	public void setUserAgent(String userAgent);
	public Boolean getTlsFlag();
	public void setTlsFlag(Boolean tlsFlag);
	public String getFuids();
	public void setFuids(String fuids);
	public Boolean getIsWebmailFlag();
	public void setIsWebmailFlag(Boolean isWebmailFlag);	
}