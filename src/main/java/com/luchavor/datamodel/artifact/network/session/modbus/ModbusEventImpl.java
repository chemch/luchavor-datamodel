package com.luchavor.datamodel.artifact.network.session.modbus;

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
@Node("ModbusEvent")
public class ModbusEventImpl extends AbstractSessionEvent implements ModbusEvent {
	// static event type
	private SessionEventType sessionEventType = SessionEventType.MODBUS;
	private String function;
	private Integer transactionId;
	private Integer unit;
	private PduType pduType;
}