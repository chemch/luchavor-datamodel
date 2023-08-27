package com.luchavor.datamodel.artifact.network.session.anomaly;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.luchavor.datamodel.util.FieldTypeConverter;

@SpringBootTest
@ActiveProfiles("test")
public class AnomalyEventTests {
	public List<AnomalyEvent> getAnomalyEventList1() {
		// test dns list object
		List<AnomalyEvent> events = new ArrayList<>();
		// test object
		AnomalyEvent event = new AnomalyEventImpl();
		// populate object attributes
		event.setTimestamp(FieldTypeConverter.convertDoubleEpochTimestamp(1690042947.719));
		event.setCuid("CqtsDY2fXL2T0z5iX2");
		event.setOriginatorIp("192.168.2.137");
		event.setOriginatorPort(38410);
		event.setResponderIp("192.168.88.30");
		event.setResponderPort(5001);
		event.setName("invalid_http_09_request_method");
		event.setDetails("OPTIONS");
		event.setNoticeFlag(false);
		event.setPeer("zeek");
		event.setService("HTTP");
		// add events to list
		events.add(event);
		// return value
		return(events);
	}
	
	@Test
    void shouldNotBeNull() throws Exception {
		AnomalyEvent event1 = getAnomalyEventList1().get(0);
		// confirm object is not null
		assertNotNull(event1);
	}
}