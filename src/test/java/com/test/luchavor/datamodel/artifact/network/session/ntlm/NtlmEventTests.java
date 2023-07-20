package com.test.luchavor.datamodel.artifact.network.session.ntlm;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.luchavor.datamodel.artifact.network.session.ntlm.NtlmEvent;
import com.luchavor.datamodel.artifact.network.session.ntlm.NtlmEventImpl;
import com.test.luchavor.datamodel.util.DataTypeConverter;

@SpringBootTest
@ActiveProfiles("test")
public class NtlmEventTests {
	public List<NtlmEvent> getNtlmEventList1() {
		// test list object
		List<NtlmEvent> events = new ArrayList<>();
		// test object
		NtlmEvent event = new NtlmEventImpl();
		// populate object attributes
		event.setTimestamp(DataTypeConverter.convertDoubleEpochTimestamp(1689721214.20921));
		event.setUid("Cy7bMR3IwANa9ZEUb");
		event.setOriginatorIp("10.0.0.158");
		event.setOriginatorPort(49536);
		event.setResponderIp("10.0.0.10");
		event.setResponderPort(139);
		event.setUsername(null);
		event.setHostname("DESKTOP-N9EDHDR");
		event.setDomainName(null);
		event.setServerNetbiosName("BACKANDFORTH-DC");
		event.setServerDnsName("BACKANDFORTH-DC.backandforth.net");
		event.setServerTreeName("backandforth.net");
		event.setSuccessFlag(true);
		// add events to list
		events.add(event);
		// return value
		return(events);
	}
	
	@Test
    void shouldNotBeNull() throws Exception {
		NtlmEvent event = getNtlmEventList1().get(0);
		// confirm object is not null
		assertNotNull(event);
	}
}