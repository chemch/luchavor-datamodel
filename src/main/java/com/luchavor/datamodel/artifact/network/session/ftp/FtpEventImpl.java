package com.luchavor.datamodel.artifact.network.session.ftp;

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
@Node("FtpEvent")
public class FtpEventImpl extends AbstractSessionEvent implements FtpEvent {
	// static event type
	private SessionEventType sessionEventType = SessionEventType.FTP;
	private String user;
	private String password;
	private String command;
	private String argument;
	private String mimeType;
	private Integer fileSize;
	private Integer replyCode;
	private String replyMessage;
	private Boolean dataChannelPassiveFlag;
	private String dataChannelOriginatorIp;
	private String dataChannelResponderIp;
	private String dataChannelResponderPort;
	private String fuid;
}    