package com.luchavor.datamodel.factory;

import org.springframework.stereotype.Component;

import com.luchavor.datamodel.artifact.Artifact;
import com.luchavor.datamodel.artifact.ArtifactImpl;
import com.luchavor.datamodel.artifact.ArtifactSubType;
import com.luchavor.datamodel.artifact.ArtifactType;
import com.luchavor.datamodel.artifact.network.observation.observedhost.ObservedHost;
import com.luchavor.datamodel.artifact.network.observation.observedservice.ObservedService;

@Component
public class ArtifactFactory {
	public Artifact<ObservedHost> create(ObservedHost observedHost) {
		// create artifact
		Artifact<ObservedHost> artifact = new ArtifactImpl<ObservedHost>();
		// populate general attributes
		artifact.setArtifactType(ArtifactType.NETWORK);
		artifact.setArtifactSubType(ArtifactSubType.OBSERVATION);
		// set artifact value
		artifact.setValue(observedHost);
		// update artifact state
		artifact.setCurrentArtifactState(artifact.getCompleteArtifactState());
		return artifact;
	}
	
	public Artifact<ObservedService> create(ObservedService observedService) {
		// create artifact
		Artifact<ObservedService> artifact = new ArtifactImpl<ObservedService>();
		// populate general attributes
		artifact.setArtifactType(ArtifactType.NETWORK);
		artifact.setArtifactSubType(ArtifactSubType.OBSERVATION);
		// set artifact value
		artifact.setValue(observedService);
		// update artifact state
		artifact.setCurrentArtifactState(artifact.getCompleteArtifactState());
		return artifact;
	}
}