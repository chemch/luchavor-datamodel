package com.luchavor.datamodel.finding;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import com.luchavor.datamodel.artifact.Artifact;
import com.luchavor.datamodel.artifact.ArtifactTests;
import com.luchavor.datamodel.detection.Detection;
import com.luchavor.datamodel.detection.DetectionTests;
import com.luchavor.datamodel.inference.Inference;
import com.luchavor.datamodel.inference.InferenceTests;
import com.luchavor.datamodel.technique.AttackTechnique;
import com.luchavor.datamodel.technique.AttackTechniqueTests;

@SpringBootTest
@ActiveProfiles("test")
public class FindingTests {
	private DetectionTests detectionTests = new DetectionTests();
	private ArtifactTests artifactTests = new ArtifactTests();
	private InferenceTests inferenceTests = new InferenceTests();
	private AttackTechniqueTests attackTechniqueTests = new AttackTechniqueTests();
	
	public Finding<AttackTechnique> getFinding1() {
		// test object
		Finding<AttackTechnique> rv = new FindingImpl<AttackTechnique>();
		// populate general attributes
		rv.setFindingType(FindingType.EXFIL);
		// set artifact list (of 2 items)
		List<Artifact<?>> artifactList = new ArrayList<>();
    	artifactList.add(artifactTests.getArtifact1());
    	artifactList.add(artifactTests.getArtifact2());
    	rv.setArtifacts(artifactList);
    	// set inferences
    	List<Inference<?>> inferenceList = new ArrayList<>();
    	inferenceList.add(inferenceTests.getInference1());
    	rv.setInferences(inferenceList);
    	// set detections
    	List<Detection<?>> detectionList = new ArrayList<>();
    	detectionList.add(detectionTests.getDetection1());
    	rv.setDetections(detectionList);
    	// set value (inferred host)
    	rv.setValue(attackTechniqueTests.getAttackTechnique1());
		// return value
		return rv;
	}
	
	@Test
    void shouldNotBeNull() throws Exception {
		Finding<?> rv = getFinding1();
		// confirm object is not null
		assertNotNull(rv);
	}
}