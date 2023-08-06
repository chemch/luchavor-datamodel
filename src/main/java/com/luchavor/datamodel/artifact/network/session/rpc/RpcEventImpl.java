package com.luchavor.datamodel.artifact.network.session.rpc;

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
@Node("RpcEvent")
public class RpcEventImpl extends AbstractSessionEvent implements RpcEvent {
	// static event type
	private SessionEventType sessionEventType = SessionEventType.RPC;
	private Double roundTripTime;
	private String namedPipe;
	private String endpoint;
	private String operation;
}