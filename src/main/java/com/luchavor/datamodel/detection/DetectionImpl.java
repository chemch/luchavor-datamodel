package com.luchavor.datamodel.detection;

import java.util.List;
import java.util.UUID;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;

import com.luchavor.datamodel.artifact.Artifact;
import com.luchavor.datamodel.inference.Inference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetectionImpl<D, I, A> implements Detection<D, I, A> {
	/* neo4j id */
	@Id @GeneratedValue 
	private UUID id;
	
	private DetectionType detectionType;
	private D value;
	
	// composite attribute components
	private List<Inference<I, A>> inferences;
	private List<Artifact<A>> artifacts;
}