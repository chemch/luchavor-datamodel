package com.luchavor.datamodel.artifact.network.session.http;

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
public class HttpEventImpl extends AbstractSessionEvent implements HttpEvent {
	// static session event type
	private SessionEventType sessionEventType = SessionEventType.HTTP;
	private Integer transactionDepth;
	private String method;
	private String host;
	private String uri;
	private String referrer;
	private Double version;
	private String userAgent;
	private String originHeader;
	private Integer requestBodyLength;
	private Integer responseBodyLength;
	private Integer statusCode;
	private String statusMessage;
	private Integer infoCode;
	private String infoMessage;
	private String tags;
	private String username;
	private String password;
	private String proxyHeaders;
	private String originatorFuids;
	private String originatorFilenames;
	private String originatorMimeTypes;
	private String responderFuids;
	private String responderFilenames;
	private String responderMimeTypes;	
}