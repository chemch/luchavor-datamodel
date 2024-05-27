package com.luchavor.datamodel.artifact.network.observation.observedfile;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import com.luchavor.datamodel.artifact.network.session.connection.Connection;

import lombok.Data;

@Data
@Node("ObservedFile")
public class ObservedFileImpl implements ObservedFile {
	/* neo4j id */
	@Id @GeneratedValue 
	private UUID id;
	// observation attributes
	private LocalDateTime timestamp;
	private String fuid;
	private String originatorIp;
	private String responderIp;
	private Integer originatorPort;
	private Integer responderPort;
	private String cuid;
	@Relationship(type = "VIA")
	private Connection connection;
	private String source;
	private Integer depth;
	private List<String> analyzers;
	private String mimeType;
	private String filename;
	private Double duration;
	private Boolean localOriginationFlag;
	private Boolean fromOriginatorFlag;
	private Integer bytesSeen;
	private Integer totalFileBytes;
	private Integer missingBytes;
	private Integer overflowBytes;
	private Boolean timedOutFlag;
	private String parentFuid;
	private String md5Hash;
	private String sha1Hash;
	private String sha256Hash;
	private String extractedFilename;
	private Boolean extractedFileCutoffFlag;
	private Integer extractedFileSize;
}