package com.luchavor.datamodel.artifact.network.observation.certificate;

import java.time.LocalDateTime;
import java.util.UUID;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import lombok.Data;

@Data
@Node("Certificate")
public class CertificateImpl implements Certificate {
	/* neo4j id */
	@Id @GeneratedValue 
	private UUID id;
	// observation attributes
	private LocalDateTime timestamp;
	private String hostIp;
	private Integer port;
	private String subject;
	private String issuerSubject;
	private String serial;
}