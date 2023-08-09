package com.luchavor.datamodel.finding;

import java.util.List;
import java.util.UUID;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import com.luchavor.datamodel.artifact.Artifact;
import com.luchavor.datamodel.detection.Detection;
import com.luchavor.datamodel.finding.state.ConfirmedFindingState;
import com.luchavor.datamodel.finding.state.FindingState;
import com.luchavor.datamodel.finding.state.PotentialFindingState;
import com.luchavor.datamodel.finding.state.RefutedFindingState;
import com.luchavor.datamodel.inference.Inference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Node("Finding")
public class FindingImpl<F> implements Finding<F> {
	/* neo4j id */
	@Id @GeneratedValue 
	private UUID id;
	
	private FindingType findingType;
	@Relationship(type = "IS_A")
	private F value;

	// composite attribute components
	@Relationship(type = "DERIVES_FROM")
	private List<Detection<?>> detections;
	@Relationship(type = "DERIVES_FROM")
	private List<Inference<?>> inferences;
	@Relationship(type = "DERIVES_FROM")
	private List<Artifact<?>> artifacts;
	
	// finding state options
	@Relationship(type = "CAN_BE")
	private FindingState confirmedFindingState = new ConfirmedFindingState();
	@Relationship(type = "CAN_BE")
	private FindingState potentialFindingState = new PotentialFindingState();
	@Relationship(type = "CAN_BE")
	private FindingState refutedFindingState = new RefutedFindingState();
		
	// current finding state (initialized to potential)
	@Relationship(type = "IS_CURRENTLY")
	private FindingState currentFindingState = potentialFindingState;
		
	// finding state transition calc
	public void calculateFindingState() {
		currentFindingState.calculateFindingState();
	}
}