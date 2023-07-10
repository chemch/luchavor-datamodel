package com.luchavor.datamodel.artifact;

import java.util.UUID;

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
}