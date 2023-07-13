package com.luchavor.datamodel.artifact.network.session.kerberos;

import java.time.LocalDateTime;
import com.luchavor.datamodel.artifact.network.session.event.SessionEvent;

public interface KerberosEvent extends SessionEvent {
	// request type
	public String getRequestType();
	public void setRequestType(String requestType);
	// client
	public String getClient();
	public void setClient(String client);
	// service
	public String getService();
	public void setService(String service);
	// success flag
	public Boolean getSuccessFlag();
	public void setSuccessFlag(Boolean successFlag);
	// error message
	public String getErrorMessage();
	public void setErrorMessage(String errorMessage);
	// from
	public LocalDateTime getFrom();
	public void setFrom(LocalDateTime from);
	// till
	public LocalDateTime getTill();
	public void setTill(LocalDateTime till);
	// cipher
	public String getCipher();
	public void setCipher(String cipher);
	// forwardable flag
	public Boolean getForwardableFlag();
	public void setForwardableFlag(Boolean forwardableFlag);
	// renewable flag
	public Boolean getRenewableFlag();
	public void setRenewableFlag(Boolean renewableFlag);
	// client certificate subject
	public String getClientCertificateSubject();
	public void setClientCertificateSubject(String clientCertificateSubject);
	// client certificate fuid
	public String getClientCertificateFuid();
	public void setClientCertificateFuid(String clientCertificateFuid);
	// server certificate subject
	public String getServerCertificateSubject();
	public void setServerCertificateSubject(String serverCertificateSubject);
	// server certificate fuid
	public String getServerCertificateFuid();
	public void setServerCertificateFuid(String serverCertificateFuid);
}