package com.luchavor.datamodel.inference;

import java.util.List;
import java.util.UUID;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;

import com.luchavor.datamodel.artifact.Artifact;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InferenceImpl<I, A> implements Inference<I, A> {
	/* neo4j id */
	@Id @GeneratedValue 
	private UUID id;
	
	private InferenceType inferenceType;
	private I value;
	
	// composite attribute components
	private List<Artifact<A>> artifacts;
}