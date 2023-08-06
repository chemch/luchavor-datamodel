package com.luchavor.datamodel.inference;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.luchavor.datamodel.artifact.Artifact;
import com.luchavor.datamodel.artifact.ArtifactTests;
import com.luchavor.datamodel.artifact.network.session.Session;
import com.luchavor.datamodel.inference.inferredHost.InferredHost;
import com.luchavor.datamodel.inference.inferredhost.InferredHostTests;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class InferenceTests {
	private InferredHostTests inferredHostTests = new InferredHostTests();
	private ArtifactTests artifactTests = new ArtifactTests();
	
	public Inference<InferredHost, Session> getInference1() {
		// test object
		Inference<InferredHost, Session> rv = new InferenceImpl<InferredHost, Session>();
		// populate general attributes
		rv.setInferenceType(InferenceType.DIRECT);
		// set artifact list value
		List<Artifact<Session>> artifactList = new ArrayList<>();
		artifactList.add(artifactTests.getArtifact1());
		rv.setArtifacts(artifactList);
		// set inference value
		rv.setValue(inferredHostTests.getInferredHostList1().get(0));
		// return value
		return rv;
	}
	
	@Test
    void shouldNotBeNull() throws Exception {
		Inference<?, ?> artifact = getInference1();
		// confirm object is not null
		assertNotNull(artifact);
	}
}