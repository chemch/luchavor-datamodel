package com.luchavor.datamodel.artifact;

import java.util.UUID;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArtifactImpl<A> implements Artifact<A> {
	/* neo4j id */
	@Id @GeneratedValue 
	private UUID id;
	
	private ArtifactType artifactType;
	private ArtifactSubType artifactSubType;
	private A value;
}