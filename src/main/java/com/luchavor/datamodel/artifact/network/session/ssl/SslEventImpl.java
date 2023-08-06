package com.luchavor.datamodel.artifact.network.session.ssl;

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
@Node("SslEvent")
public class SslEventImpl extends AbstractSessionEvent implements SslEvent {
	// static event type
	private SessionEventType sessionEventType = SessionEventType.SSL;
	private String version;
	private String cipher;
	private String curve;
	private String serverName;
	private Boolean resumedFlag;
	private String lastAlert;
	private String nextProtocol;
	private Boolean establishedFlag;
	private String history;
	private String certificateChain;
	private String certificateChainFingerprint;
	private Boolean sniMatchFlag;
	private String validationStatus;
}