package com.luchavor.datamodel.artifact.network.session.ssh;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.luchavor.datamodel.util.FieldTypeConverter;

@SpringBootTest
@ActiveProfiles("test")
public class SshEventTests {
	public List<SshEvent> getSshEventList1() {
		// test list object
		List<SshEvent> events = new ArrayList<>();
		// test object
		SshEvent event = new SshEventImpl();
		// populate object attributes
		event.setTimestamp(FieldTypeConverter.convertDoubleEpochTimestamp(1690078090.43959));
		event.setCuid("Cix45G4aiWaMWAwDHl");
		event.setOriginatorIp("192.168.2.137");
		event.setOriginatorPort(51397);
		event.setResponderIp("192.168.88.60");
		event.setResponderPort(22);
		event.setVersion(null);
		event.setAuthenticationSuccessFlag(null);
		event.setAuthenticationAttemptCount(0);
		event.setDirection(null);
		event.setClient(null);
		event.setServer("SSH-2.0-moxa_1.0");
		event.setCipherAlgorithm(null);
		event.setMacAlgorithm(null);
		event.setCompressionAlgorithm(null);
		event.setKeyExchangeAlgorithm(null);
		event.setHostKeyExchangeAlgorithm(null);
		event.setHostKey(null);
		event.setRemoteLocationCountryCode(null);
		event.setRemoteLocationRegion(null);
		event.setRemoteLocationCity(null);
		event.setRemoteLocationLattitude(null);
		event.setRemoteLocationLongitude(null);
		// add events to list
		events.add(event);
		// return value
		return(events);
	}
	
	@Test
    void shouldNotBeNull() throws Exception {
		SshEvent event = getSshEventList1().get(0);
		// confirm object is not null
		assertNotNull(event);
	}
}