package com.luchavor.datamodel.artifact.network.observation.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import com.luchavor.datamodel.artifact.network.common.NetworkProtocolType;
import com.luchavor.datamodel.util.transform.attribute.AttributeTypeTransformer;

@SpringBootTest
@ActiveProfiles("test")
public class ServiceTests {
	public Service getService1() {
		// test object
		Service service = new ServiceImpl();
		// populate object
		service.setTimestamp(AttributeTypeTransformer.convertDoubleEpochTimestamp(1689560080.32542));
		service.setHostIp("10.0.0.158");
		service.setNetworkProtocolType(NetworkProtocolType.UDP);
		service.setPort(53);
		service.setService("DNS");
		// return value
		return(service);
	}
	
	@Test
    void shouldNotBeNull() throws Exception {
		Service observation = getService1();
		// confirm object is not null
		assertNotNull(observation);
	}
}