package com.luchavor.datamodel.artifact.network.observation.file;

import java.time.LocalDateTime;
import java.util.UUID;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import lombok.Data;

@Data
@Node("File")
public class FileImpl implements File {
	/* neo4j id */
	@Id @GeneratedValue 
	private UUID id;
	// observation attributes
	private LocalDateTime timestamp;
	private String uid;
	private String transmitHosts;
	private String receiveHosts;
	private String connectionUids;
	private String source;
	private Integer depth;
	private String analyzers;
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
	private String parentUid;
	private String md5Hash;
	private String sha1Hash;
	private String sha256Hash;
	private String extractedFilename;
	private Boolean extractedFileCutoffFlag;
	private Integer extractedFileSize;
}