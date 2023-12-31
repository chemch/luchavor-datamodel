package com.luchavor.datamodel.artifact.network.session;

import java.util.List;
import java.util.UUID;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import com.luchavor.datamodel.artifact.network.session.anomaly.AnomalyEvent;
import com.luchavor.datamodel.artifact.network.session.connection.Connection;
import com.luchavor.datamodel.artifact.network.session.dns.DnsEvent;
import com.luchavor.datamodel.artifact.network.session.ftp.FtpEvent;
import com.luchavor.datamodel.artifact.network.session.http.HttpEvent;
import com.luchavor.datamodel.artifact.network.session.kerberos.KerberosEvent;
import com.luchavor.datamodel.artifact.network.session.modbus.ModbusEvent;
import com.luchavor.datamodel.artifact.network.session.ntlm.NtlmEvent;
import com.luchavor.datamodel.artifact.network.session.ntp.NtpEvent;
import com.luchavor.datamodel.artifact.network.session.rpc.RpcEvent;
import com.luchavor.datamodel.artifact.network.session.smb.SmbEvent;
import com.luchavor.datamodel.artifact.network.session.smtp.SmtpEvent;
import com.luchavor.datamodel.artifact.network.session.ssh.SshEvent;
import com.luchavor.datamodel.artifact.network.session.ssl.SslEvent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Node("Session")
public class SessionImpl implements Session {
	/* neo4j id */
	@Id @GeneratedValue 
	private UUID id;
	
	@Relationship(type = "INCLUDES")
	private Connection connection;
	
	// optional detection events (defaults to empty list)
	@Relationship(type = "INCLUDES")
	private List<DnsEvent> dnsEvents;
	@Relationship(type = "INCLUDES")
	private List<HttpEvent> httpEvents;
	@Relationship(type = "INCLUDES")
	private List<KerberosEvent> kerberosEvents;
	@Relationship(type = "INCLUDES")
	private List<NtlmEvent> ntlmEvents;
	@Relationship(type = "INCLUDES")
	private List<SslEvent> sslEvents;
	@Relationship(type = "INCLUDES")
	private List<RpcEvent> rpcEvents;
	@Relationship(type = "INCLUDES")
	private List<SmbEvent> smbEvents;
	@Relationship(type = "INCLUDES")
	private List<AnomalyEvent> anomalyEvents;
	@Relationship(type = "INCLUDES")
	private List<ModbusEvent> modbusEvents;
	@Relationship(type = "INCLUDES")
	private List<NtpEvent> ntpEvents;
	@Relationship(type = "INCLUDES")
	private List<SshEvent> sshEvents;
	@Relationship(type = "INCLUDES")
	private List<SmtpEvent> smtpEvents;
	@Relationship(type = "INCLUDES")
	private List<FtpEvent> ftpEvents;
	
	// current state (initialized to open)
	private SessionStateType sessionStateType = SessionStateType.OPEN;
	
	// state transition calc
	public void calculateSessionStateType() {
		//
	}
}