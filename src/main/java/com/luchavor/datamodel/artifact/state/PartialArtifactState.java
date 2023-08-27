package com.luchavor.datamodel.artifact.state;

import java.util.UUID;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import com.luchavor.datamodel.artifact.Artifact;

import lombok.Data;

@Data
@Node("PartialArtifactState")
public class PartialArtifactState<A> implements ArtifactState {
	/* neo4j id */
	@Id @GeneratedValue 
	private UUID id;
	
	Artifact<A> artifact;
	
	// artifact transition calc
	public void calculateArtifactState() {
		if( artifact.getArtifactType() != null && artifact.getArtifactSubType() != null && artifact.getValue() != null) {
			artifact.setCurrentArtifactState(artifact.getCompleteArtifactState());
		} else {
			artifact.setCurrentArtifactState(artifact.getPartialArtifactState());
		}
	}
}