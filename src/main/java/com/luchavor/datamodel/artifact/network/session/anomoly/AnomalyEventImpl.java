package com.luchavor.datamodel.artifact.network.session.anomoly;

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
@Node("AnomalyEvent")
public class AnomalyEventImpl extends AbstractSessionEvent implements AnomalyEvent {
	// static session event type
	private SessionEventType sessionEventType = SessionEventType.ANOMALY;
	// event attributes
	private String name;
	private String details;
	private Boolean noticeFlag;
	private String peer;
	private String service;
}