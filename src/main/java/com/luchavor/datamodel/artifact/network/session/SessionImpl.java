package com.luchavor.datamodel.artifact.network.session;

import java.util.List;
import java.util.UUID;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;

import com.luchavor.datamodel.artifact.network.session.connection.Connection;
import com.luchavor.datamodel.artifact.network.session.dns.DnsEvent;
import com.luchavor.datamodel.artifact.network.session.http.HttpEvent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SessionImpl implements Session {
	/* neo4j id */
	@Id @GeneratedValue 
	private UUID id;
	
	private Connection connection;
	
	// optional session events (defaults to empty list)
	private List<DnsEvent> dnsEvents;
	private List<HttpEvent> httpEvents;
}