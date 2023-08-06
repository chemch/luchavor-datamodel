package com.luchavor.datamodel.artifact.network.session.smtp;

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
@Node("SmtpEvent")
public class SmtpEventImpl extends AbstractSessionEvent implements SmtpEvent {
	// static event type
	private SessionEventType sessionEventType = SessionEventType.SMTP;
	private Integer transactionDepth;
	private String helo;
	private String mailFrom;
	private String receiptTo;
	private String dateHeader;
	private String from;
	private String to;
	private String cc;
	private String replyTo;
	private String msgId;
	private String inReplyTo;
	private String subject;
	private String xOriginatingIp;
	private String firstReceived;
	private String secondReceived;
	private String lastReply;
	private String path;
	private String userAgent;
	private Boolean tlsFlag;
	private String fuids;
	private Boolean isWebmailFlag;
}