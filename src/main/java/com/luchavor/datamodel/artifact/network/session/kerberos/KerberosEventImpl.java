package com.luchavor.datamodel.artifact.network.session.kerberos;

import java.time.LocalDateTime;

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
@Node("NtlmEvent")
public class KerberosEventImpl extends AbstractSessionEvent implements KerberosEvent {
	// static session event type
	private SessionEventType sessionEventType = SessionEventType.KERBEROS;
	private String requestType;
	private String client;
	private String service;
	private Boolean successFlag;
	private String errorMessage;
	private LocalDateTime from;
	private LocalDateTime till;
	private String cipher;
	private Boolean forwardableFlag;
	private Boolean renewableFlag;
	private String clientCertificateSubject;
	private String clientCertificateFuid;
	private String serverCertificateSubject;
	private String serverCertificateFuid;
}