package com.luchavor.datamodel.detection;

import java.util.List;
import java.util.UUID;

import com.luchavor.datamodel.artifact.Artifact;
import com.luchavor.datamodel.detection.state.DetectionState;
import com.luchavor.datamodel.inference.Inference;

public interface Detection<D, I, A> {
	// neo4j id
	public UUID getId();
	public void setId(UUID uuid);

	// detection type
	public DetectionType getDetectionType();
	public void setDetectionType(DetectionType detectionType);
	
	// varying detection type
	public D getValue();
	public void setValue(D value);
	
	// based inference(s)
	public List<Inference<I, A>> getInferences();
	public void setInferences(List<Inference<I, A>> inferences);
	
	// based artifact(s)
	public List<Artifact<A>> getArtifacts();
	public void setArtifacts(List<Artifact<A>> artifacts);
	
	// current detection state
	public DetectionState getCurrentDetectionState();
	public void setCurrentDetectionState(DetectionState detectionState);
	
	// detection state options
	public DetectionState getClosedDetectionState();
	public DetectionState getOpenDetectionState();
}