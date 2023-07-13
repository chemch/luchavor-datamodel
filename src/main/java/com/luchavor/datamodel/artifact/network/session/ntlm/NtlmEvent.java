package com.luchavor.datamodel.artifact.network.session.ntlm;

import com.luchavor.datamodel.artifact.network.session.event.SessionEvent;

public interface NtlmEvent extends SessionEvent {
	public String getUsername();
	public void setUsername(String username);
	public String getHostname();
	public void setHostname(String hostname);
	public String getDomainName();
	public void setDomainName(String domainName);
	public String getServerNetbiosName();
	public void setServerNetbiosName(String serverNetbiosName);
	public String getServerDnsName();
	public void setServerDnsName(String serverDnsName);
	public String getServerTreeName();
	public void setServerTreeName(String serverTreeName);
	public Boolean getSuccessFlag();
	public void setSuccessFlag(Boolean successFlag);
}