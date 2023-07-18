package com.luchavor.datamodel.artifact;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import com.luchavor.datamodel.artifact.network.session.Session;
import com.luchavor.datamodel.artifact.network.session.SessionTests;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class ArtifactTests {
	private SessionTests sessionTests = new SessionTests();
	
	public Artifact<Session> getArtifact1() {
		// test object
		Artifact<Session> artifact = new ArtifactImpl<Session>();
		// populate general attributes
		artifact.setArtifactType(ArtifactType.NETWORK);
		artifact.setArtifactSubType(ArtifactSubType.SESSION);
		// set artifact value
		Session session = sessionTests.getSession1();
		artifact.setValue(session);
		// return value
		return artifact;
	}
	
	public Artifact<Session> getArtifact2() {
		// test object
		Artifact<Session> artifact = new ArtifactImpl<Session>();
		// populate general attributes
		artifact.setArtifactType(ArtifactType.NETWORK);
		artifact.setArtifactSubType(ArtifactSubType.SESSION);
		// set artifact value
		Session session = sessionTests.getSession2();
		artifact.setValue(session);
		// return value
		return artifact;
	}
	
	@Test
    void shouldNotBeNull() throws Exception {
		Artifact<?> artifact = getArtifact1();
		// confirm object is not null
		assertNotNull(artifact);
	}
}