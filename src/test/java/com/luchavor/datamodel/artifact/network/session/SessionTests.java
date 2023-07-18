package com.luchavor.datamodel.artifact.network.session;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.luchavor.datamodel.artifact.network.session.connection.ConnectionTests;
import com.luchavor.datamodel.artifact.network.session.dns.DnsEventTests;
import com.luchavor.datamodel.artifact.network.session.http.HttpEventTests;

public class SessionTests {
	private ConnectionTests connectionTests = new ConnectionTests();
	private DnsEventTests dnsEventTests = new DnsEventTests();
	private HttpEventTests httpEventTests = new HttpEventTests();
	
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
	
	@Test
    void shouldNotBeNull() throws Exception {
		Session session1 = getSession1();
		// confirm object is not null
		assertNotNull(session1);
	}
}