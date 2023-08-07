package com.luchavor.datamodel.inference.inferredHost;

import java.util.UUID;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Node("InferredHost")
public class InferredHostImpl implements InferredHost {
	/* neo4j id */
	@Id @GeneratedValue 
	private UUID id;
	// attributes
	private String hostIp;
	private String hostName;
	private String macAddress;
}