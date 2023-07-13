package com.luchavor.datamodel.artifact.network.session.ssl;

import com.luchavor.datamodel.artifact.network.session.event.SessionEvent;

public interface SslEvent extends SessionEvent {
	// version
	public String getVersion();
	public void setVersion(String version);
	// cipher
	public String getCipher();
	public void setCipher(String cipher);
	// curve
	public String getCurve();
	public void setCurve(String curve);
	// server name
	public String getServerName();
	public void setServerName(String serverName);
	// resumed flag
	public Boolean getResumedFlag();
	public void setResumedFlag(Boolean resumedFlag);
	// last alert
	public String getLastAlert();
	public void setLastAlert(String lastAlert);
	// next protocol
	public String getNextProtocol();
	public void setNextProtocol(String nextProtocol);
	// established flag
	public Boolean getEstablishedFlag();
	public void setEstablishedFlag(Boolean establishedFlag);
	// ssl history
	public String getHistory();
	public void setHistory(String history);
	// certificate chain
	public String getCertificateChain();
	public void setCertificateChain(String certificateChain);
	// certificate chain fingerprint
	public String getCertificateChainFingerprint();
	public void setCertificateChainFingerprint(String certificateChainFingerprint);
	// sni match flag
	public Boolean getSniMatchFlag();
	public void setSniMatchFlag(Boolean sniMatchFlag);
}