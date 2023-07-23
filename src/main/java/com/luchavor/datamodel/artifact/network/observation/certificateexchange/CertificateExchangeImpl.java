package com.luchavor.datamodel.artifact.network.observation.certificateexchange;

import java.time.LocalDateTime;
import java.util.UUID;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import lombok.Data;

@Data
@Node("CertificateExchange")
public class CertificateExchangeImpl implements CertificateExchange {
	/* neo4j id */
	@Id @GeneratedValue 
	private UUID id;
	// observation attributes
	private LocalDateTime timestamp;
	private String fingerprint;
	private Integer certificateVersion;
	private String certificateSerial;
	private String certificateSubject;
	private String certificateIssuer;
	private LocalDateTime certificateValidFrom;
	private LocalDateTime certificateValidTo;
	private String certificateKeyAlgorithm;
	private String certificateSigningAlgorithm;
	private String certificateKeyType;
	private Integer certificateKeyLength;
	private Integer certificateExponent;
	private String certificateCurve;
	private String sansDns;
	private String sansUri;
	private String sansEmail;
	private String sansIp;
	private Boolean basicConstraintsFlag;
	private Integer basicConstraintsPathLength;
	private Boolean hostCertificateFlag;
	private Boolean clientCertificateFlag;
}