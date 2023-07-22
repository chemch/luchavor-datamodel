package com.luchavor.datamodel.artifact.state;

import java.util.UUID;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import com.luchavor.datamodel.artifact.Artifact;
import lombok.Data;

@Data
@Node("CompleteArtifactState")
public class CompleteArtifactState<A> implements ArtifactState {
	/* neo4j id */
	@Id @GeneratedValue 
	private UUID id;
	
	Artifact<A> artifact;
	
	// artifact transition calc
	public void calculateArtifactState() {
		artifact.setCurrentArtifactState(artifact.getCompleteArtifactState());
	}
}