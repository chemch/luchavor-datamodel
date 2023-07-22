package com.luchavor.datamodel.artifact.network.observation.software;

import java.time.LocalDateTime;
import java.util.UUID;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import lombok.Data;

@Data
@Node("Software")
public class SoftwareImpl implements Software {
	/* neo4j id */
	@Id @GeneratedValue 
	private UUID id;
	// observation attributes
	private LocalDateTime timestamp;
	private String hostIp;
	private Integer port;
	private String type;
	private String name;
	private Integer majorVersion;
	private Integer minorVersion;
	private Integer minor2Version;
	private Integer minor3Version;
	private String additionalVersionInfo;
	private String unparsedVersion;
	private String url;	
}