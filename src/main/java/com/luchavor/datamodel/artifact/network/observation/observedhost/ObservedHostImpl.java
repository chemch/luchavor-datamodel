package com.luchavor.datamodel.artifact.network.observation.observedhost;

import java.time.LocalDateTime;
import java.util.UUID;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Node("ObservedHost")
public class ObservedHostImpl implements ObservedHost {
	/* neo4j id */
	@Id @GeneratedValue 
	private UUID id;
	// observation attributes
	@JsonProperty("ts")
	private LocalDateTime timestamp;
	@JsonProperty("host")
	private String hostIp;	
}