package com.luchavor.datamodel.artifact.state;

import java.util.UUID;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import com.luchavor.datamodel.artifact.Artifact;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Node("PartialArtifactState")
public class PartialArtifactState<A> implements ArtifactState {
	/* neo4j id */
	@Id @GeneratedValue 
	private UUID id;
	
	@Relationship(type = "INCLUDES")
	Artifact<A> artifact;
	
	public PartialArtifactState(Artifact<A> artifact) {
		this.artifact = (Artifact<A>) artifact;
	}
	
	// artifact transition calc
	public void calculateArtifactState() {
		if( artifact != null && artifact.getArtifactType() != null && artifact.getArtifactSubType() != null && artifact.getValue() != null) {
			artifact.setCurrentArtifactState(artifact.getCompleteArtifactState());
		} else {
			artifact.setCurrentArtifactState(artifact.getPartialArtifactState());
		}
	}
}