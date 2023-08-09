package com.luchavor.datamodel.finding.state;

import java.util.UUID;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import com.luchavor.datamodel.finding.Finding;

import lombok.Data;

@Data
@Node("ConfirmedFindingState")
public class ConfirmedFindingState implements FindingState {
	/* neo4j id */
	@Id @GeneratedValue 
	private UUID id;
	
	Finding<?> finding;
	
	// finding transition calc
	public void calculateFindingState() {
		finding.setCurrentFindingState(finding.getConfirmedFindingState());
	}
}