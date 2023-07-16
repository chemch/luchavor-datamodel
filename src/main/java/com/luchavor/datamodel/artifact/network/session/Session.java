package com.luchavor.datamodel.artifact.network.session;

import java.util.List;
import java.util.UUID;

import com.luchavor.datamodel.artifact.network.session.connection.Connection;
import com.luchavor.datamodel.artifact.network.session.dns.DnsEvent;
import com.luchavor.datamodel.artifact.network.session.http.HttpEvent;
import com.luchavor.datamodel.artifact.network.session.state.SessionState;

public interface Session {
	// neo4j id
	public UUID getId();
	public void setId(UUID uuid);
	
	// connection
	public Connection getConnection();
	public void setConnection(Connection connection);
	
	// dns events
	public List<DnsEvent> getDnsEvents();
	public void setDnsEvents(List<DnsEvent> dnsEvents);
	
	// http events
	public List<HttpEvent> getHttpEvents();
	public void setHttpEvents(List<HttpEvent> httpEvents);
	
	// current session state
	public SessionState getCurrentSessionState();
	public void setCurrentSessionState(SessionState sessionState);
	
	// session state options
	public SessionState getClosedSessionState();
	public SessionState getOpenSessionState();
}