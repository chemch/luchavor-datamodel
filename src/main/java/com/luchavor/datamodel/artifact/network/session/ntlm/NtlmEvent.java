package com.luchavor.datamodel.artifact.network.session.ntlm;

import com.luchavor.datamodel.artifact.network.session.event.SessionEvent;

public interface NtlmEvent extends SessionEvent {
	// username
	public String getUsername();
	public void setUsername(String username);
	// hostname
	public String getHostname();
	public void setHostname(String hostname);
	// domain name
	public String getDomainName();
	public void setDomainName(String domainName);
	// server netbios name
	public String getServerNetbiosName();
	public void setServerNetbiosName(String serverNetbiosName);
	// server dns name
	public String getServerDnsName();
	public void setServerDnsName(String serverDnsName);
	// server tree name
	public String getServerTreeName();
	public void setServerTreeName(String serverTreeName);
	// success flag
	public Boolean getSuccessFlag();
	public void setSuccessFlag(Boolean successFlag);
}