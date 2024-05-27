package com.luchavor.datamodel.artifact.network.observation.observedfile;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import com.luchavor.datamodel.artifact.network.session.connection.Connection;

public interface ObservedFile {
	public UUID getId();
	public void setId(UUID id);
	// observation fields
	public LocalDateTime getTimestamp();
	public void setTimestamp(LocalDateTime timestamp);
	public String getFuid();
	public void setFuid(String fuid);
	public String getOriginatorIp();
	public void setOriginatorIp(String originatorIp);
	public String getResponderIp();
	public void setResponderIp(String responderIp);
	public Integer getOriginatorPort();
	public void setOriginatorPort(Integer originatorPort);
	public Integer getResponderPort();
	public void setResponderPort(Integer responderPort);
	public String getCuid();
	public void setCuid(String cuid);
	public Connection getConnection();
	public void setConnection(Connection connection);
	public String getSource();
	public void setSource(String source);
	public Integer getDepth();
	public void setDepth(Integer depth);
	public List<String> getAnalyzers();
	public void setAnalyzers(List<String> analyzers);
	public String getMimeType();
	public void setMimeType(String mimeType);
	public String getFilename();
	public void setFilename(String filename);
	public Double getDuration();
	public void setDuration(Double duration);
	public Boolean getLocalOriginationFlag();
	public void setLocalOriginationFlag(Boolean localOriginationFlag);
	public Boolean getFromOriginatorFlag();
	public void setFromOriginatorFlag(Boolean fromOriginatorFlag);
	public Integer getBytesSeen();
	public void setBytesSeen(Integer bytesSeen);
	public Integer getTotalFileBytes();
	public void setTotalFileBytes(Integer totalFileBytes);
	public Integer getMissingBytes();
	public void setMissingBytes(Integer missingBytes);
	public Integer getOverflowBytes();
	public void setOverflowBytes(Integer overflowBytes);
	public Boolean getTimedOutFlag();
	public void setTimedOutFlag(Boolean timedOutFlag);
	public String getParentFuid();
	public void setParentFuid(String parentFuid);
	public String getMd5Hash();
	public void setMd5Hash(String md5Hash);
	public String getSha1Hash();
	public void setSha1Hash(String sha1Hash);
	public String getSha256Hash();
	public void setSha256Hash(String sha256Hash);
	public String getExtractedFilename();
	public void setExtractedFilename(String extractedFilename);
	public Boolean getExtractedFileCutoffFlag();
	public void setExtractedFileCutoffFlag(Boolean extractedFileCutoffFlag);
	public Integer getExtractedFileSize();
	public void setExtractedFileSize(Integer extractedFileSize);	
}