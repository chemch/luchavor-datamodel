package com.luchavor.datamodel.artifact.network.session;

import java.util.List;
import java.util.UUID;

import com.luchavor.datamodel.artifact.network.session.anomoly.AnomalyEvent;
import com.luchavor.datamodel.artifact.network.session.connection.Connection;
import com.luchavor.datamodel.artifact.network.session.dns.DnsEvent;
import com.luchavor.datamodel.artifact.network.session.http.HttpEvent;
import com.luchavor.datamodel.artifact.network.session.kerberos.KerberosEvent;
import com.luchavor.datamodel.artifact.network.session.modbus.ModbusEvent;
import com.luchavor.datamodel.artifact.network.session.ntlm.NtlmEvent;
import com.luchavor.datamodel.artifact.network.session.rpc.RpcEvent;
import com.luchavor.datamodel.artifact.network.session.smb.SmbEvent;
import com.luchavor.datamodel.artifact.network.session.ssl.SslEvent;
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
	
	// kerberos events
	public List<KerberosEvent> getKerberosEvents();
	public void setKerberosEvents(List<KerberosEvent> kerberosEvents);
	
	// smb events
	public List<SmbEvent> getSmbEvents();
	public void setSmbEvents(List<SmbEvent> smbEvents);
	
	// ssl events
	public List<SslEvent> getSslEvents();
	public void setSslEvents(List<SslEvent> sslEvents);
	
	// rpc events
	public List<RpcEvent> getRpcEvents();
	public void setRpcEvents(List<RpcEvent> rpcEvents);
	
	// ntlm events
	public List<NtlmEvent> getNtlmEvents();
	public void setNtlmEvents(List<NtlmEvent> ntlmEvents);
	
	// anomaly events
	public List<AnomalyEvent> getAnomalyEvents();
	public void setAnomalyEvents(List<AnomalyEvent> anomalyEvents);
	
	// modbus events
	public List<ModbusEvent> getModbusEvents();
	public void setModbusEvents(List<ModbusEvent> modbusEvents);
	
	// current session state
	public SessionState getCurrentSessionState();
	public void setCurrentSessionState(SessionState sessionState);
	
	// session state options
	public SessionState getClosedSessionState();
	public SessionState getOpenSessionState();
}