package com.luchavor.datamodel.artifact.network.session;

import java.util.List;
import java.util.UUID;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;

import com.luchavor.datamodel.artifact.network.session.connection.Connection;
import com.luchavor.datamodel.artifact.network.session.dns.DnsEvent;
import com.luchavor.datamodel.artifact.network.session.http.HttpEvent;
import com.luchavor.datamodel.artifact.network.session.kerberos.KerberosEvent;
import com.luchavor.datamodel.artifact.network.session.ntlm.NtlmEvent;
import com.luchavor.datamodel.artifact.network.session.rpc.RpcEvent;
import com.luchavor.datamodel.artifact.network.session.smb.SmbEvent;
import com.luchavor.datamodel.artifact.network.session.ssl.SslEvent;
import com.luchavor.datamodel.artifact.network.session.state.ClosedSessionState;
import com.luchavor.datamodel.artifact.network.session.state.OpenSessionState;
import com.luchavor.datamodel.artifact.network.session.state.SessionState;

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
	private List<KerberosEvent> kerberosEvents;
	private List<NtlmEvent> ntlmEvents;
	private List<SslEvent> sslEvents;
	private List<RpcEvent> rpcEvents;
	private List<SmbEvent> smbEvents;
	
	// artifact state options
	private SessionState closedSessionState = new ClosedSessionState();
	private SessionState openSessionState = new OpenSessionState();
	
	// current session state (initialized to open)
	private SessionState currentSessionState = openSessionState;
	
	// session state transition calc
	public void calculateSessionState() {
		currentSessionState.calcualteSessionState();
	}
}