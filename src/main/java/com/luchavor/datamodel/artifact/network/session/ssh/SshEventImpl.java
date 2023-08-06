package com.luchavor.datamodel.artifact.network.session.ssh;

import org.springframework.data.neo4j.core.schema.Node;
import com.luchavor.datamodel.artifact.network.session.event.AbstractSessionEvent;
import com.luchavor.datamodel.artifact.network.session.event.SessionEventType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Node("SshEvent")
public class SshEventImpl extends AbstractSessionEvent implements SshEvent {
	// static event type
	private SessionEventType sessionEventType = SessionEventType.SSH;
	private Integer version;
	private Boolean authenticationSuccessFlag;
	private Integer authenticationAttemptCount;
	private String direction;
	private String client;
	private String server;
	private String cipherAlgorithm;
	private String macAlgorithm;
	private String compressionAlgorithm;
	private String keyExchangeAlgorithm;
	private String hostKeyExchangeAlgorithm;
	private String hostKey;
	private String remoteLocationCountryCode;
	private String remoteLocationRegion;
	private String remoteLocationCity;
	private Double remoteLocationLattitude;
	private Double remoteLocationLongitude;
}