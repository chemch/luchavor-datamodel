package com.luchavor.datamodel.artifact.network.observation.smbfile;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import com.luchavor.datamodel.artifact.network.observation.smbfile.SmbFile;
import com.luchavor.datamodel.artifact.network.observation.smbfile.SmbFileImpl;
import com.luchavor.datamodel.artifact.network.session.ssl.SslEvent;
import com.luchavor.datamodel.util.transform.attribute.AttributeTypeTransformer;

@SpringBootTest
@ActiveProfiles("test")
public class SmbFileTests {
	public SmbFile getSmbFile1() {
		// test object
		SmbFile observation = new SmbFileImpl();
		// populate object
		observation.setTimestamp(AttributeTypeTransformer.convertDoubleEpochTimestamp(1689214299.92754));
		observation.setUid("Cr6xU22NsYJR7VJSi8");
		observation.setOriginatorIp("10.0.0.158");
		observation.setOriginatorPort(49621);
		observation.setResponderIp("10.0.0.10");
		observation.setResponderPort(445);
		observation.setUid(null);
		observation.setAction("SMB::FILE_OPEN");
		observation.setPath("\\\\BACKANDFORTH-DC.backandforth.net\\sysvol");
		observation.setName("backandforth.net\\Policies\\{31B2F340-016D-11D2-945F-00C04FB984F9}\\gpt.ini");
		observation.setSize(22);
		observation.setModifiedTime(AttributeTypeTransformer.convertDoubleEpochTimestamp(1639069591.2315));
		observation.setAccessedTime(AttributeTypeTransformer.convertDoubleEpochTimestamp(1639069591.2315));
		observation.setCreatedTime(AttributeTypeTransformer.convertDoubleEpochTimestamp(1639069258.66145));
		observation.setChangedTime(AttributeTypeTransformer.convertDoubleEpochTimestamp(1639069591.2315));
		// return value
		return(observation);
	}
	
	@Test
    void shouldNotBeNull() throws Exception {
		SmbFile observation = getSmbFile1();
		// confirm object is not null
		assertNotNull(observation);
	}
}