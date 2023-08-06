package com.luchavor.datamodel.detection.zeeknotification;

import java.time.LocalDateTime;
import java.util.UUID;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import com.luchavor.datamodel.artifact.network.common.NetworkProtocolType;

import lombok.Data;

@Data
@Node("ZeekNotification")
public class ZeekNotificationImpl implements ZeekNotification {
	/* neo4j id */
	@Id @GeneratedValue 
	private UUID id;
	// behavior attributes
	private LocalDateTime timestamp;
	private String uid;
	private String originatorIp;
	private Integer originatorPort;
	private String responderIp;
	private Integer responderPort;
	private String fuid;
	private String fileMimeType;
	private String fileDescription;
	private NetworkProtocolType protocol;
	private String notificationCategory;
	private String detail;
	private String subDetail; 
	private String sourceIp;
	private String destinationIp;
	private Integer port;
	private Integer occurenceCount;
	private String peerDescription;
	private String action;
	private String emailDestination;
	private Integer suppressForSetting;
	private String remoteLocationCountryCode;
	private String remoteLocationRegion;
	private String remoteLocationCity;
	private Double remoteLocationLattitude;
	private Double remoteLocationLongitude;	
}