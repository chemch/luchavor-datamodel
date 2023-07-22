package com.luchavor.datamodel.artifact.network.observation.host;

import java.time.LocalDateTime;
import java.util.UUID;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import lombok.Data;

@Data
@Node("Host")
public class HostImpl implements Host {
	/* neo4j id */
	@Id @GeneratedValue 
	private UUID id;
	// observation attributes
	private LocalDateTime timestamp;
	private String hostIp;
}