//package com.luchavor.datamodel.detection;
//
//import java.util.List;
//import java.util.UUID;
//
//import org.springframework.data.neo4j.core.schema.GeneratedValue;
//import org.springframework.data.neo4j.core.schema.Id;
//import org.springframework.data.neo4j.core.schema.Node;
//import org.springframework.data.neo4j.core.schema.Relationship;
//
//import com.luchavor.datamodel.artifact.Artifact;
//import com.luchavor.datamodel.detection.state.ClosedDetectionState;
//import com.luchavor.datamodel.detection.state.DetectionState;
//import com.luchavor.datamodel.detection.state.OpenDetectionState;
//import com.luchavor.datamodel.inference.Inference;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Node("Detection")
//public class DetectionImpl<D, I, A> implements Detection<D, I, A> {
//	/* neo4j id */
//	@Id @GeneratedValue 
//	private UUID id;
//	
//	private DetectionType detectionType;
//	private D value;
//	
//	// composite attribute components
//	private List<Inference<I, A>> inferences;
//	private List<Artifact<A>> artifacts;
//	
//	// artifact state options
//	@Relationship(type = "CAN_BE")
//	private DetectionState closedDetectionState = new ClosedDetectionState();
//	@Relationship(type = "CAN_BE")
//	private DetectionState openDetectionState = new OpenDetectionState();
//		
//	// current state (initialized to open)
//	@Relationship(type = "IS_CURRENTLY")
//	private DetectionState currentDetectionState = openDetectionState;
//		
//	// state transition calc
//	public void calculateSessionState() {
//		currentDetectionState.calculateDetectionState();
//	}
//}