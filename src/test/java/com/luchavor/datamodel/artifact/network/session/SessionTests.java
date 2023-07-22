package com.luchavor.datamodel.artifact.network.session;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.luchavor.datamodel.artifact.network.session.anomaly.AnomalyEventTests;
import com.luchavor.datamodel.artifact.network.session.connection.ConnectionTests;
import com.luchavor.datamodel.artifact.network.session.dns.DnsEventTests;
import com.luchavor.datamodel.artifact.network.session.http.HttpEventTests;
import com.luchavor.datamodel.artifact.network.session.kerberos.KerberosEventTests;
import com.luchavor.datamodel.artifact.network.session.ntlm.NtlmEventTests;
import com.luchavor.datamodel.artifact.network.session.rpc.RpcEventTests;
import com.luchavor.datamodel.artifact.network.session.smb.SmbEventTests;
import com.luchavor.datamodel.artifact.network.session.ssl.SslEventTests;

public class SessionTests {
	private ConnectionTests connectionTests = new ConnectionTests();
	private DnsEventTests dnsEventTests = new DnsEventTests();
	private HttpEventTests httpEventTests = new HttpEventTests();
	private KerberosEventTests kerberosEventTests = new KerberosEventTests();
	private NtlmEventTests ntlmEventTests = new NtlmEventTests();
	private RpcEventTests rpcEventTests = new RpcEventTests();
	private SslEventTests sslEventTests = new SslEventTests();
	private SmbEventTests smbEventTests = new SmbEventTests();
	private AnomalyEventTests anomalyEventTests = new AnomalyEventTests();
	
	public Session getSession1() {
		// test object
		Session session = new SessionImpl();
		// populate attributes
		session.setConnection(connectionTests.getTestConnection1());
		session.setDnsEvents(dnsEventTests.getDnsEventList1());
		// return value
		return session;
	}
	
	public Session getSession2() {
		// test object
		Session session = new SessionImpl();
		// populate attributes
		session.setConnection(connectionTests.getTestConnection2());
		session.setHttpEvents(httpEventTests.getHttpEventList1());
		// return value
		return session;
	}
	
	public Session getSession3() {
		// test object
		Session session = new SessionImpl();
		// populate attributes
		session.setConnection(connectionTests.getTestConnection3());
		session.setKerberosEvents(kerberosEventTests.getKerberosEventList1());
		// return value
		return session;
	}
	
	public Session getSession4() {
		// test object
		Session session = new SessionImpl();
		// populate attributes
		session.setConnection(connectionTests.getTestConnection4());
		session.setNtlmEvents(ntlmEventTests.getNtlmEventList1());
		// return value
		return session;
	}
	
	public Session getSession5() {
		// test object
		Session session = new SessionImpl();
		// populate attributes
		session.setConnection(connectionTests.getTestConnection5());
		session.setRpcEvents(rpcEventTests.getRpcEventList1());
		// return value
		return session;
	}
	
	public Session getSession6() {
		// test object
		Session session = new SessionImpl();
		// populate attributes
		session.setConnection(connectionTests.getTestConnection6());
		session.setSslEvents(sslEventTests.getSslEventList1());
		// return value
		return session;
	}
	
	public Session getSession7() {
		// test object
		Session session = new SessionImpl();
		// populate attributes
		session.setConnection(connectionTests.getTestConnection7());
		session.setSmbEvents(smbEventTests.getSmbEventList1());
		// return value
		return session;
	}
	
	public Session getSession8() {
		// test object
		Session session = new SessionImpl();
		// populate attributes
		session.setConnection(connectionTests.getTestConnection8());
		session.setAnomalyEvents(anomalyEventTests.getAnomalyEventList1());
		// return value
		return session;
	}
	
	@Test
    void shouldNotBeNull() throws Exception {
		Session session1 = getSession1();
		// confirm object is not null
		assertNotNull(session1);
	}
}