package com.luchavor.datamodel.artifact.network.observation.certificateexchange;

import java.time.LocalDateTime;
import java.util.UUID;

public interface CertificateExchange {
	public UUID getId();
	public void setId(UUID id);
	// observation fields
	public LocalDateTime getTimestamp();
	public void setTimestamp(LocalDateTime timestamp);
	public String getFingerprint();
	public void setFingerprint(String fingerprint);
	public Integer getCertificateVersion();
	public void setCertificateVersion(Integer certificateVersion);
	public String getCertificateSerial();
	public void setCertificateSerial(String certificateSerial);
	public String getCertificateSubject();
	public void setCertificateSubject(String certificateSubject);
	public String getCertificateIssuer();
	public void setCertificateIssuer(String certificateIssuer);
	public LocalDateTime getCertificateValidFrom();
	public void setCertificateValidFrom(LocalDateTime certificateValidFrom);
	public LocalDateTime getCertificateValidTo();
	public void setCertificateValidTo(LocalDateTime certificateValidTo);
	public String getCertificateKeyAlgorithm();
	public void setCertificateKeyAlgorithm(String certificateKeyAlgorithm);
	public String getCertificateSigningAlgorithm();
	public void setCertificateSigningAlgorithm(String certificateSigningAlgorithm);
	public String getCertificateKeyType();
	public void setCertificateKeyType(String certificateKeyType);
	public Integer getCertificateKeyLength();
	public void setCertificateKeyLength(Integer certificateKeyLength);
	public Integer getCertificateExponent();
	public void setCertificateExponent(Integer certificateExponent);
	public String getCertificateCurve();
	public void setCertificateCurve(String certificateCurve);
	public String getSansDns();
	public void setSansDns(String sansDns);
	public String getSansUri();
	public void setSansUri(String sansUri);
	public String getSansEmail();
	public void setSansEmail(String sansEmail);
	public String getSansIp();
	public void setSansIp(String sansIp);
	public Boolean getBasicConstraintsFlag();
	public void setBasicConstraintsFlag(Boolean basicConstraintsFlag);
	public Integer getBasicConstraintsPathLength();
	public void setBasicConstraintsPathLength(Integer basicConstraintsPathLength);
	public Boolean getHostCertificateFlag();
	public void setHostCertificateFlag(Boolean hostCertificateFlag);
	public Boolean getClientCertificateFlag();
	public void setClientCertificateFlag(Boolean clientCertificateFlag);
}