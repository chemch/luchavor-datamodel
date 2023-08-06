package com.luchavor.datamodel.artifact.network.session.ntp;

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
@Node("NtpEvent")
public class NtpEventImpl extends AbstractSessionEvent implements NtpEvent {
	// static event type
	private SessionEventType sessionEventType = SessionEventType.NTP;
	private Integer version;
	private Integer mode;
	private Integer stratum;
	private Integer poll;
	private Double precision;
	private Double rootDelay;
	private Double rootDispersion;
	private String referenceId;
	private LocalDateTime referenceTime;	
	private LocalDateTime clientRequestTime;
	private LocalDateTime serverRequestTime;
	private LocalDateTime serverResponseTime;
	private Integer extensionCount;
}