package com.luchavor.datamodel.inference;

import java.util.List;
import java.util.UUID;

import com.luchavor.datamodel.artifact.Artifact;

public interface Inference<I, A> {
	// neo4j id
	public UUID getId();
	public void setId(UUID uuid);

	// inference type
	public InferenceType getInferenceType();
	public void setInferenceType(InferenceType inferenceType);
	
	// varying inference type
	public I getValue();
	public void setValue(I value);
	
	// based artifact(s)
	public List<Artifact<A>> getArtifacts();
	public void setArtifacts(List<Artifact<A>> artifacts);
}