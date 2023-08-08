package com.luchavor.datamodel.inference;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import com.luchavor.datamodel.artifact.Artifact;
import com.luchavor.datamodel.artifact.ArtifactTests;
import com.luchavor.datamodel.inference.inferredHost.InferredHost;
import com.luchavor.datamodel.inference.inferredhost.InferredHostTests;

@SpringBootTest
@ActiveProfiles("test")
public class InferenceTests {
	private InferredHostTests inferredHostTests = new InferredHostTests();
	private ArtifactTests artifactTests = new ArtifactTests();
	
	public Inference<InferredHost> getInference1() {
		// test object
		Inference<InferredHost> rv = new InferenceImpl<InferredHost>();
		// populate general attributes
		rv.setInferenceType(InferenceType.DIRECT);
		// set artifact list (of 2 items)
		List<Artifact<?>> artifactList = new ArrayList<>();
    	artifactList.add(artifactTests.getArtifact1());
    	artifactList.add(artifactTests.getArtifact2());
    	rv.setArtifacts(artifactList);
    	// set value (inferred host)
    	rv.setValue(inferredHostTests.getInferredHost1());
		// return value
		return rv;
	}
	
	@Test
    void shouldNotBeNull() throws Exception {
		Inference<?> inference = getInference1();
		// confirm object is not null
		assertNotNull(inference);
	}
}