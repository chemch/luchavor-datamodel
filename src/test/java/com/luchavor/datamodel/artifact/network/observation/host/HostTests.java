package com.luchavor.datamodel.artifact.network.observation.host;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.luchavor.datamodel.util.transform.attribute.AttributeTypeTransformer;

@SpringBootTest
@ActiveProfiles("test")
public class HostTests {
	public Host getHost1() {
		// test object
		Host host = new HostImpl();
		// populate object
		host.setTimestamp(AttributeTypeTransformer.convertDoubleEpochTimestamp(1689560080.32542));
		host.setHostIp("10.0.0.158");
		// return value
		return(host);
	}
	
	@Test
    void shouldNotBeNull() throws Exception {
		Host observation = getHost1();
		// confirm object is not null
		assertNotNull(observation);
	}
}