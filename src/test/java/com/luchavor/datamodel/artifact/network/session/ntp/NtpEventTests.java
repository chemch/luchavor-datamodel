package com.luchavor.datamodel.artifact.network.session.ntp;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.luchavor.datamodel.util.transform.attribute.AttributeTypeTransformer;

@SpringBootTest
@ActiveProfiles("test")
public class NtpEventTests {
	public List<NtpEvent> getNtpEventList1() {
		// test list object
		List<NtpEvent> events = new ArrayList<>();
		// test object
		NtpEvent event = new NtpEventImpl();
		// populate object attributes
		event.setTimestamp(AttributeTypeTransformer.convertDoubleEpochTimestamp(1690078090.31059));
		event.setUid("ClyixZ19R6GZ2iCwKg");
		event.setOriginatorIp("192.168.89.2");
		event.setOriginatorPort(123);
		event.setResponderIp("17.253.34.253");
		event.setResponderPort(123);
		event.setVersion(4);
		event.setMode(3);
		event.setStratum(2);
		event.setPoll(64);
		event.setPrecision(.000001);
		event.setRootDelay(.038971);
		event.setRootDispersion(.040054);
		event.setReferenceId("17.253.34.253");
		event.setReferenceTime(AttributeTypeTransformer.convertDoubleEpochTimestamp(1445491954.00041));
		event.setClientRequestTime(AttributeTypeTransformer.convertDoubleEpochTimestamp(0.0));
		event.setServerRequestTime(AttributeTypeTransformer.convertDoubleEpochTimestamp(0.0));
		event.setServerResponseTime(AttributeTypeTransformer.convertDoubleEpochTimestamp(1445495620.52686));
		event.setExtensionCount(0);
		// add events to list
		events.add(event);
		// return value
		return(events);
	}
	
	@Test
    void shouldNotBeNull() throws Exception {
		NtpEvent event = getNtpEventList1().get(0);
		// confirm object is not null
		assertNotNull(event);
	}
}