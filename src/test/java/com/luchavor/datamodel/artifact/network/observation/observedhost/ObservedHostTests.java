package com.luchavor.datamodel.artifact.network.observation.observedhost;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.luchavor.datamodel.util.FieldTypeConverter;

@SpringBootTest
@ActiveProfiles("test")
public class ObservedHostTests {
	public ObservedHost getHost1() {
		// test object
		ObservedHost observedHost = new ObservedHostImpl();
		// populate object
		observedHost.setTimestamp(FieldTypeConverter.convertDoubleEpochTimestamp(1689560080.32542));
		observedHost.setHostIp("10.0.0.158");
		// return value
		return(observedHost);
	}
	
	@Test
    void shouldNotBeNull() throws Exception {
		ObservedHost observation = getHost1();
		// confirm object is not null
		assertNotNull(observation);
	}
}