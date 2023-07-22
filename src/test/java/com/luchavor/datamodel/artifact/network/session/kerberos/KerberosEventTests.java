package com.luchavor.datamodel.artifact.network.session.kerberos;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.luchavor.datamodel.util.transform.attribute.AttributeTypeTransformer;

@SpringBootTest
@ActiveProfiles("test")
public class KerberosEventTests {
	public List<KerberosEvent> getKerberosEventList1() {
		// test list object
		List<KerberosEvent> events = new ArrayList<>();
		// test object
		KerberosEvent event = new KerberosEventImpl();
		// populate object attributes
		event.setTimestamp(AttributeTypeTransformer.convertDoubleEpochTimestamp(1689646377.46308));
		event.setUid("C8YskB4y2XSn9o9KF7");
		event.setOriginatorIp("10.0.0.158");
		event.setOriginatorPort(49533);
		event.setResponderIp("10.0.0.10");
		event.setResponderPort(88);
		event.setRequestType("TGS");
		event.setClient("lorelei.gauthier/BACKANDFORTH.NET");
		event.setService("cifs/BACKANDFORTH-DC.backandforth.net");
		event.setSuccessFlag(true);
		event.setErrorMessage(null);
		event.setFrom(null);
		event.setTill(AttributeTypeTransformer.convertLongEpochTimestamp((long) 2136422885));
		event.setCipher("aes256-cts-hmac-sha1-96");
		event.setForwardableFlag(true);
		event.setRenewableFlag(true);
		event.setClientCertificateSubject(null);
		event.setClientCertificateFuid(null);
		event.setServerCertificateSubject(null);
		event.setServerCertificateFuid(null);
		// add events to list
		events.add(event);
		// return value
		return(events);
	}
	
	@Test
    void shouldNotBeNull() throws Exception {
		KerberosEvent event = getKerberosEventList1().get(0);
		// confirm object is not null
		assertNotNull(event);
	}
}