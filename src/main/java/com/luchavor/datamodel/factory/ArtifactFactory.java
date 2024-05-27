package com.luchavor.datamodel.factory;

import org.springframework.stereotype.Component;

import com.luchavor.datamodel.artifact.Artifact;
import com.luchavor.datamodel.artifact.ArtifactImpl;
import com.luchavor.datamodel.artifact.ArtifactSubType;
import com.luchavor.datamodel.artifact.ArtifactType;
import com.luchavor.datamodel.artifact.network.observation.observedfile.ObservedFile;
import com.luchavor.datamodel.artifact.network.observation.observedhost.ObservedHost;
import com.luchavor.datamodel.artifact.network.observation.observedservice.ObservedService;
import com.luchavor.datamodel.artifact.network.observation.software.Software;
import com.luchavor.datamodel.artifact.network.session.Session;
import com.luchavor.datamodel.artifact.network.session.SessionImpl;
import com.luchavor.datamodel.artifact.network.session.connection.Connection;
import com.luchavor.datamodel.artifact.network.session.modbus.ModbusEvent;

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
		artifact.calculateArtifactStateType();
		return artifact;
	}
	
	public Artifact<ModbusEvent> create(ModbusEvent modbusEvent) {
		// create artifact
		Artifact<ModbusEvent> artifact = new ArtifactImpl<ModbusEvent>();
		// populate general attributes
		artifact.setArtifactType(ArtifactType.NETWORK);
		artifact.setArtifactSubType(ArtifactSubType.SESSION);
		// set artifact value
		artifact.setValue(modbusEvent);
		// update artifact state
		artifact.calculateArtifactStateType();
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
		artifact.calculateArtifactStateType();
		return artifact;
	}
	
	public Artifact<ObservedFile> create(ObservedFile observedFile) {
		// create artifact
		Artifact<ObservedFile> artifact = new ArtifactImpl<ObservedFile>();
		// populate general attributes
		artifact.setArtifactType(ArtifactType.NETWORK);
		artifact.setArtifactSubType(ArtifactSubType.OBSERVATION);
		// set artifact value
		artifact.setValue(observedFile);
		// update artifact state
		artifact.calculateArtifactStateType();
		return artifact;
	}
	
	public Artifact<Software> create(Software software) {
		// create artifact
		Artifact<Software> artifact = new ArtifactImpl<Software>();
		// populate general attributes
		artifact.setArtifactType(ArtifactType.NETWORK);
		artifact.setArtifactSubType(ArtifactSubType.OBSERVATION);
		// set artifact value
		artifact.setValue(software);
		// update artifact state
		artifact.calculateArtifactStateType();
		return artifact;
	}
	
	public Artifact<Session> create(Connection connection) {
		// create session
		Session session = new SessionImpl();
		// set connection on session
		session.setConnection(connection);
		// create artifact
		Artifact<Session> artifact = new ArtifactImpl<Session>();
		// populate general attributes
		artifact.setArtifactType(ArtifactType.NETWORK);
		artifact.setArtifactSubType(ArtifactSubType.SESSION);
		// set artifact value
		artifact.setValue(session);
		// update artifact state
		artifact.calculateArtifactStateType();
		return artifact;
	}
	
	public Artifact<Session> create(Session session) {
		// create artifact
		Artifact<Session> artifact = new ArtifactImpl<Session>();
		// populate general attributes
		artifact.setArtifactType(ArtifactType.NETWORK);
		artifact.setArtifactSubType(ArtifactSubType.SESSION);
		// set artifact value
		artifact.setValue(session);
		// update artifact state
		artifact.calculateArtifactStateType();
		return artifact;
	}
}