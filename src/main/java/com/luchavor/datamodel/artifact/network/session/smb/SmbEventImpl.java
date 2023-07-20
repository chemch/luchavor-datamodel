package com.luchavor.datamodel.artifact.network.session.smb;

import java.time.LocalTime;

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
public class SmbEventImpl extends AbstractSessionEvent implements SmbEvent {
	// static session event type
	private SessionEventType sessionEventType = SessionEventType.SMB;
	// smb mapping event attributes
	private String path;
	private String service;
	private String nativeFileSystem;
	private String shareType;
	private String fileId;
	private String action;
	private String name;
	private Integer size;
	private String previousName;
	private LocalTime modifiedTime;
	private LocalTime accessedTime;
	private LocalTime createdTime;
	private LocalTime changedTime;
}	