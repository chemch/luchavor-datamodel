package com.luchavor.datamodel.detection;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import com.luchavor.datamodel.artifact.Artifact;
import com.luchavor.datamodel.artifact.ArtifactTests;
import com.luchavor.datamodel.artifact.network.session.Session;
import com.luchavor.datamodel.artifact.network.session.ssl.SslEvent;

@SpringBootTest
@ActiveProfiles("test")
public class DetectionTests {
	private ArtifactTests artifactTests = new ArtifactTests();
	public Detection<SslEvent, SslEvent, SslEvent> getDetection1() {
		// test artifact object and list
		List<Artifact<Session>> artifactList = new ArrayList<Artifact<Session>>();
		Artifact<Session> artifact = artifactTests.getArtifact21();
		artifactList.add(artifact);
		// populate attributes
		// Artifact<Session> artifact = new ArtifactImpl<Session>();
		Detection<SslEvent, SslEvent, SslEvent> detection = new DetectionImpl<SslEvent, SslEvent, SslEvent>();
		// set artifact value
		detection.setDetectionType(DetectionType.BEHAVIOR);
		// set value
		//detection.setValue(sslEventTests.getSslEventList1().get(0));
		// return value
		return detection;
	}
	
	@Test
    void shouldNotBeNull() throws Exception {
		Detection<?, ?, ?> detection1 = getDetection1();
		// confirm object is not null
		assertNotNull(detection1);
	}
}