package com.luchavor.datamodel.artifact.network.session.state;

import com.luchavor.datamodel.artifact.network.session.Session;
import lombok.Data;

@Data
public class OpenSessionState implements SessionState {
	Session session;
	
	// session transition calc
	public void calcualteSessionState() {
		session.setCurrentSessionState(session.getOpenSessionState());
	}
}