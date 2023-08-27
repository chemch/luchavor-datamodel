package com.luchavor.datamodel.artifact.network.session.smb;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.luchavor.datamodel.util.FieldTypeConverter;

@SpringBootTest
@ActiveProfiles("test")
public class SmbEventTests {
	public List<SmbEvent> getSmbEventList1() {
		// test list object
		List<SmbEvent> events = new ArrayList<>();
		// test object
		SmbEvent event = new SmbEventImpl();
		// populate object attributes
		event.setTimestamp(FieldTypeConverter.convertDoubleEpochTimestamp(1689819179.07213));
		event.setCuid("CyJElO1nOpPVk0oH6f");
		event.setOriginatorIp("10.0.0.158");
		event.setOriginatorPort(49524);
		event.setResponderIp("10.0.0.10");
		event.setResponderPort(139);
		event.setPath("\\\\BACKANDFORTH-DC\\IPC$");
		event.setService("IPC");
		event.setNativeFileSystem(null);
		event.setShareType("PIPE");
		// add events to list
		events.add(event);
		// return value
		return(events);
	}
	
	@Test
    void shouldNotBeNull() throws Exception {
		SmbEvent event = getSmbEventList1().get(0);
		// confirm object is not null
		assertNotNull(event);
	}
}