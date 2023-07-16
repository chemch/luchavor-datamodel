package com.luchavor.datamodel.artifact;

import java.util.UUID;

import com.luchavor.datamodel.artifact.state.ArtifactState;

public interface Artifact<A> {
	// neo4j id
	public UUID getId();
	public void setId(UUID uuid);
	
	// artifact type
	public ArtifactType getArtifactType();
	public void setArtifactType(ArtifactType artifactType);
	
	// artifact type
	public ArtifactSubType getArtifactSubType();
	public void setArtifactSubType(ArtifactSubType artifactSubType);
	
	// varying artifact type
	public A getValue();
	public void setValue(A value);
	
	// current artifact state
	public ArtifactState getCurrentArtifactState();
	public void setCurrentArtifactState(ArtifactState artifactState);
	
	// artifact state options
	public ArtifactState getCompleteArtifactState();
	public ArtifactState getPartialArtifactState();
	public ArtifactState getEmptyArtifactState();
}