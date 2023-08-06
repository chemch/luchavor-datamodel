package com.luchavor.datamodel.artifact.network.session.state;

import java.util.UUID;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import com.luchavor.datamodel.artifact.network.session.Session;
import lombok.Data;

@Data
@Node("ClosedSessionState")
public class ClosedSessionState implements SessionState {
	/* neo4j id */
	@Id @GeneratedValue 
	private UUID id;
	
	Session session;
	
	// transition calc
	public void calculateSessionState() {
		session.setCurrentSessionState(session.getClosedSessionState());
	}
}