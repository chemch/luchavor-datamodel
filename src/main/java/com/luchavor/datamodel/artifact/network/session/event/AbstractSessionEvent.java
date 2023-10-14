package com.luchavor.datamodel.artifact.network.session.event;

import java.time.LocalDateTime;
import java.util.UUID;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractSessionEvent {
	/* neo4j id */
	@Id @GeneratedValue 
	private UUID id;
	// event attributes
	private LocalDateTime timestamp;
	private String cuid;
	private String originatorIp;
	private Integer originatorPort;
	private String responderIp;
	private Integer responderPort;
	
}