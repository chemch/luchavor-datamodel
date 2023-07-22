package com.luchavor.datamodel.artifact.network.observation.software;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import com.luchavor.datamodel.util.transform.attribute.AttributeTypeTransformer;

@SpringBootTest
@ActiveProfiles("test")
public class SoftwareTests {
	public Software getSoftware1() {
		// test object
		Software observation = new SoftwareImpl();
		// populate object
		observation.setTimestamp(AttributeTypeTransformer.convertDoubleEpochTimestamp(1689901417.36315));
		observation.setHostIp("172.23.250.132");
		observation.setType("HTTP::BROWSER");
		observation.setName("Debian APT-HTTP");
		observation.setMajorVersion(1);
		observation.setMinorVersion(3);
		observation.setMinor2Version(null);
		observation.setMinor3Version(null);
		observation.setAdditionalVersionInfo("2.4.9");
		observation.setUnparsedVersion("Debian APT-HTTP/1.3 (2.4.9) non-interactive");
		observation.setUrl(null);
		// return value
		return(observation);
	}
	
	@Test
    void shouldNotBeNull() throws Exception {
		Software observation = getSoftware1();
		// confirm object is not null
		assertNotNull(observation);
	}
}