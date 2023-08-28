package com.luchavor.datamodel.artifact;

import java.util.UUID;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import com.luchavor.datamodel.artifact.state.ArtifactState;
import com.luchavor.datamodel.artifact.state.CompleteArtifactState;
import com.luchavor.datamodel.artifact.state.PartialArtifactState;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Node("Artifact")
public class ArtifactImpl<A> implements Artifact<A> {
	/* neo4j id */
	@Id @GeneratedValue 
	private UUID id;
	
	// artifact attributes
	private ArtifactType artifactType;
	private ArtifactSubType artifactSubType;
	@Relationship(type = "IS_A")
	private A value;
	
	// artifact state options
	@Relationship(type = "CAN_BE")
	private ArtifactState completeArtifactState = new CompleteArtifactState<>(this);
	@Relationship(type = "CAN_BE")
	private ArtifactState partialArtifactState = new PartialArtifactState<>(this);
	
	// current artifact state (initialized to empty)
	@Relationship(type = "IS_CURRENTLY")
	private ArtifactState currentArtifactState = partialArtifactState;
	
	// artifact state transition calc
	public void calculateArtifactState() {
		currentArtifactState.calculateArtifactState();
	}
}