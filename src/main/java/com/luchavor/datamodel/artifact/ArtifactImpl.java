package com.luchavor.datamodel.artifact;

import java.util.UUID;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Node("Artifact")
public class ArtifactImpl<A> implements Artifact<A> {
	/* neo4j id */
	@Id @GeneratedValue 
	private UUID id;
	
	// artifact attributes
	private ArtifactType artifactType;
	private ArtifactSubType artifactSubType;
	@Relationship(type = "IS_A")
	private A value;
	
	// artifact state
	private ArtifactStateType artifactStateType = ArtifactStateType.EMPTY;
	
	// artifact state type transition calc
	public void calculateArtifactStateType() {
		if( getArtifactType() != null && getArtifactSubType() != null && getValue() != null) {
			setArtifactStateType(ArtifactStateType.COMPLETE);
		} else {
			setArtifactStateType(ArtifactStateType.PARTIAL);
		}
	}
}