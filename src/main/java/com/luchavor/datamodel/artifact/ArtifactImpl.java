package com.luchavor.datamodel.artifact;

import java.util.UUID;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;

import com.luchavor.datamodel.artifact.state.ArtifactState;
import com.luchavor.datamodel.artifact.state.CompleteArtifactState;
import com.luchavor.datamodel.artifact.state.EmptyArtifactState;
import com.luchavor.datamodel.artifact.state.PartialArtifactState;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArtifactImpl<A> implements Artifact<A> {
	/* neo4j id */
	@Id @GeneratedValue 
	private UUID id;
	
	// artifact attributes
	private ArtifactType artifactType;
	private ArtifactSubType artifactSubType;
	private A value;
	
	// artifact state options
	private ArtifactState completeArtifactState = new CompleteArtifactState<>();
	private ArtifactState partialArtifactState = new PartialArtifactState<>();
	private ArtifactState emptyArtifactState = new EmptyArtifactState<>();
	
	// current artifact state (initialized to empty)
	private ArtifactState currentArtifactState = emptyArtifactState;
	
	// artifact state transition calc
	public void calculateArtifactState() {
		currentArtifactState.calculateArtifactState();
	}
}