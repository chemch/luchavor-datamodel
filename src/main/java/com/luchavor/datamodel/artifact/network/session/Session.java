package com.luchavor.datamodel.artifact.network.session;

import java.util.List;
import java.util.UUID;

import com.luchavor.datamodel.artifact.network.session.connection.Connection;
import com.luchavor.datamodel.artifact.network.session.dns.DnsEvent;
import com.luchavor.datamodel.artifact.network.session.http.HttpEvent;

public interface Session {
	// neo4j id
	public UUID getId();
	public void setId(UUID uuid);
	
	public Connection getConnection();
	public void setConnection(Connection connection);
	
	public List<DnsEvent> getDnsEvents();
	public void setDnsEvents(List<DnsEvent> dnsEvents);
	
	public List<HttpEvent> getHttpEvents();
	public void setHttpEvents(List<HttpEvent> httpEvents);
}