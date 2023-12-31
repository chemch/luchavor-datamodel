package com.luchavor.datamodel.artifact.network.observation.smbfile;

import java.time.LocalDateTime;
import java.util.UUID;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import lombok.Data;

@Data
@Node("SmbFile")
public class SmbFileImpl implements SmbFile {
	/* neo4j id */
	@Id @GeneratedValue 
	private UUID id;
	// smb file attributes
	private LocalDateTime timestamp;
	private String uid;
	private String originatorIp;
	private Integer originatorPort;
	private String responderIp;
	private Integer responderPort;
	private String action;
	private String path;
	private String name;
	private Integer size;
	private String previousName;
	private LocalDateTime modifiedTime;
	private LocalDateTime accessedTime;
	private LocalDateTime createdTime;
	private LocalDateTime changedTime;
}