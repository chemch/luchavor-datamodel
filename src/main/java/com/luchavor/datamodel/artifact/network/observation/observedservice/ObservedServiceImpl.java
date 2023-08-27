package com.luchavor.datamodel.artifact.network.observation.observedservice;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import com.luchavor.datamodel.artifact.network.common.NetworkProtocolType;

import lombok.Data;

@Data
@Node("ObservedService")
public class ObservedServiceImpl implements ObservedService {
	/* neo4j id */
	@Id @GeneratedValue 
	private UUID id;
	// observation attributes
	private LocalDateTime timestamp;
	private String hostIp;
	private Integer port;
	private NetworkProtocolType networkProtocolType;
	private List<String> services;
}