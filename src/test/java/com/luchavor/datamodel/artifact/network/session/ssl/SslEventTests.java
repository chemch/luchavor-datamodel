package com.luchavor.datamodel.artifact.network.session.ssl;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.luchavor.datamodel.artifact.network.session.ssl.SslEvent;
import com.luchavor.datamodel.artifact.network.session.ssl.SslEventImpl;
import com.luchavor.datamodel.util.DataTypeConverter;

@SpringBootTest
@ActiveProfiles("test")
public class SslEventTests {
	public List<SslEvent> getSslEventList1() {
		// test list object
		List<SslEvent> events = new ArrayList<>();
		// test object
		SslEvent event = new SslEventImpl();
		// populate object attributes
		event.setTimestamp(DataTypeConverter.convertDoubleEpochTimestamp(1689733348.6635));
		event.setUid("C9Mt4e1b7pjoRIC55k");
		event.setOriginatorIp("10.0.0.158");
		event.setOriginatorPort(49525);
		event.setResponderIp("87.120.8.98");
		event.setResponderPort(443);
		event.setVersion("TLSv12");
		event.setCipher("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
		event.setCurve("x25519");
		event.setServerName("baeswea.com");
		event.setResumedFlag(false);
		event.setLastAlert(null);
		event.setNextProtocol(null);
		event.setEstablishedFlag(true);
		event.setHistory("CsxknGIti");
		event.setCertificateChain("506ce582d14985d5e7ba9236a05f874118c2a34d26688e4c5905764ad766376b");
		event.setCertificateChainFingerprint("(empty)");
		event.setSniMatchFlag(false);
		event.setValidationStatus("self signed certificate");
		// add events to list
		events.add(event);
		// return value
		return(events);
	}
	
	@Test
    void shouldNotBeNull() throws Exception {
		SslEvent event = getSslEventList1().get(0);
		// confirm object is not null
		assertNotNull(event);
	}
}