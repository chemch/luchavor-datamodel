package com.luchavor.datamodel.artifact.network.observation.executable;

import java.time.LocalDateTime;
import java.util.UUID;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import lombok.Data;

@Data
@Node("Executable")
public class ExecutableImpl implements Executable {
	/* neo4j id */
	@Id @GeneratedValue 
	private UUID id;
	// observation attributes
	private LocalDateTime timestamp;
	private String uid;
	private String compileArchitecture;
	private LocalDateTime compileTimestamp;
	private String operatingSystem;
	private String subSystem;
	private Boolean executableFlag;
	private Boolean x64Flag;
	private Boolean aslrFlag;
	private Boolean depSupportFlag;
	private Boolean codeIntegrityFlag;
	private Boolean structuredExceptionHandlingFlag;
	private Boolean importTableFlag;
	private Boolean exportTableFlag;
	private Boolean certificateTableFlag;
	private Boolean debugTableFlag;
	private String sections;
}