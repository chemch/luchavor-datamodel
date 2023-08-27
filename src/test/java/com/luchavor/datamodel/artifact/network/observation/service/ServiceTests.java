package com.luchavor.datamodel.artifact.network.observation.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Collections;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import com.luchavor.datamodel.artifact.network.common.NetworkProtocolType;
import com.luchavor.datamodel.artifact.network.observation.observedservice.ObservedService;
import com.luchavor.datamodel.artifact.network.observation.observedservice.ObservedServiceImpl;
import com.luchavor.datamodel.util.FieldTypeConverter;

@SpringBootTest
@ActiveProfiles("test")
public class ServiceTests {
	public ObservedService getService1() {
		// test object
		ObservedService observedService = new ObservedServiceImpl();
		// populate object
		observedService.setTimestamp(FieldTypeConverter.convertDoubleEpochTimestamp(1689560080.32542));
		observedService.setHostIp("10.0.0.158");
		observedService.setNetworkProtocolType(NetworkProtocolType.UDP);
		observedService.setPort(53);
		observedService.setServices(Collections.singletonList("DNS"));
		// return value
		return(observedService);
	}
	
	@Test
    void shouldNotBeNull() throws Exception {
		ObservedService observation = getService1();
		// confirm object is not null
		assertNotNull(observation);
	}
}