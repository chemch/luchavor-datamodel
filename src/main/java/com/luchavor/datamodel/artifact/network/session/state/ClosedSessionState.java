package com.luchavor.datamodel.artifact.network.session.state;

import java.util.UUID;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;

import com.luchavor.datamodel.artifact.network.session.Session;
import lombok.Data;

@Data
public class ClosedSessionState implements SessionState {
	/* neo4j id */
	@Id @GeneratedValue 
	private UUID id;
	
	Session session;
	
	// session transition calc
	public void calcualteSessionState() {
		session.setCurrentSessionState(session.getClosedSessionState());
	}
}