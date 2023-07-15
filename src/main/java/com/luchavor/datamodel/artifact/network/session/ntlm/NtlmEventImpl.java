package com.luchavor.datamodel.artifact.network.session.ntlm;

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
@Node("SmbEvent")
public class NtlmEventImpl extends AbstractSessionEvent implements NtlmEvent {
	// static session event type
	private SessionEventType sessionEventType = SessionEventType.NTLM;
	private String username;
	private String hostname;
	private String domainName;
	private String serverNetbiosName;
	private String serverDnsName;
	private String serverTreeName;
	private Boolean successFlag;
}