package com.luchavor.datamodel.inference;

import java.util.List;
import java.util.UUID;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import com.luchavor.datamodel.artifact.Artifact;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Node("Inference")
public class InferenceImpl<I> implements Inference<I> {
	/* neo4j id */
	@Id @GeneratedValue 
	private UUID id;
	
	private InferenceType inferenceType;
	@Relationship(type = "IS_A")
	private I value;
	
	// composite attribute components
	@Relationship(type = "DERIVES_FROM")
	private List<Artifact<?>> artifacts;
}