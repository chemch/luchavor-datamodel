package com.luchavor.datamodel.artifact.state;

import com.luchavor.datamodel.artifact.Artifact;
import lombok.Data;

@Data
public class CompleteArtifactState<A> implements ArtifactState {
	Artifact<A> artifact;
	
	// artifact transition calc
	public void calculateArtifactState() {
		artifact.setCurrentArtifactState(artifact.getCompleteArtifactState());
	}
}