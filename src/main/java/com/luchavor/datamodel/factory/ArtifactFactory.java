package com.luchavor.datamodel.factory;

import org.springframework.stereotype.Component;

import com.luchavor.datamodel.artifact.Artifact;
import com.luchavor.datamodel.artifact.ArtifactImpl;
import com.luchavor.datamodel.artifact.ArtifactSubType;
import com.luchavor.datamodel.artifact.ArtifactType;
import com.luchavor.datamodel.artifact.network.observation.observedhost.ObservedHost;

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
		return artifact;
	}
}