package com.luchavor.datamodel.finding;

import java.util.List;
import java.util.UUID;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;

import com.luchavor.datamodel.artifact.Artifact;
import com.luchavor.datamodel.detection.Detection;
import com.luchavor.datamodel.inference.Inference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FindingImpl<F, D, I, A> implements Finding<F, D, I, A> {
	/* neo4j id */
	@Id @GeneratedValue 
	private UUID id;
	
	private FindingType findingType;
	private F value;

	// composite attribute components
	private List<Detection<D, I, A>> detections;
	private List<Inference<I, A>> inferences;
	private List<Artifact<A>> artifacts;
}