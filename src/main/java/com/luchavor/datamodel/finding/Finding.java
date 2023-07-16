package com.luchavor.datamodel.finding;

import java.util.List;
import java.util.UUID;

import com.luchavor.datamodel.artifact.Artifact;
import com.luchavor.datamodel.detection.Detection;
import com.luchavor.datamodel.finding.state.FindingState;
import com.luchavor.datamodel.inference.Inference;

public interface Finding<F, D, I, A> {
	// neo4j id
	public UUID getId();
	public void setId(UUID uuid);

	// finding type
	public FindingType getFindingType();
	public void setFindingType(FindingType findingType);
	
	// varying finding type
	public F getValue();
	public void setValue(F value);
	
	// based detections(s)
	public List<Detection<D, I, A>> getDetections();
	public void setDetections(List<Detection<D, I, A>> detections);
	
	// based inference(s)
	public List<Inference<I, A>> getInferences();
	public void setInferences(List<Inference<I, A>> inferences);
	
	// based artifact(s)
	public List<Artifact<A>> getArtifacts();
	public void setArtifacts(List<Artifact<A>> artifacts);
	
	// current finding state
	public FindingState getCurrentFindingState();
	public void setCurrentFindingState(FindingState findingState);
		
	// finding state options
	public FindingState getConfirmedFindingState();
	public FindingState getPotentialFindingState();
	public FindingState getRefutedFindingState();
}