package com.luchavor.datamodel.artifact.network.observation.executable;

import java.time.LocalDateTime;
import java.util.UUID;

public interface Executable {
	public UUID getId();
	public void setId(UUID id);
	// observation fields
	public LocalDateTime getTimestamp();
	public void setTimestamp(LocalDateTime timestamp);
	public String getUid();
	public void setUid(String uid);
	public String getCompileArchitecture();
	public void setCompileArchitecture(String compileArchitecture);
	public LocalDateTime getCompileTimestamp();
	public void setCompileTimestamp(LocalDateTime compileTimestamp);
	public String getOperatingSystem();
	public void setOperatingSystem(String operatingSystem); 
	public String getSubSystem();
	public void setSubSystem(String subSystem); 
	public Boolean getExecutableFlag();
	public void setExecutableFlag(Boolean executableFlag); 
	public Boolean getX64Flag();
	public void setX64Flag(Boolean x64Flag); 
	public Boolean getAslrFlag();
	public void setAslrFlag(Boolean aslrFlag); 
	public Boolean getDepSupportFlag();
	public void setDepSupportFlag(Boolean depSupportFlag);
	public Boolean getCodeIntegrityFlag();
	public void setCodeIntegrityFlag(Boolean codeIntegrityFlag); 
	public Boolean getStructuredExceptionHandlingFlag();
	public void setStructuredExceptionHandlingFlag(Boolean structuredExceptionHandlingFlag); 
	public Boolean getImportTableFlag();
	public void setImportTableFlag(Boolean importTableFlag); 
	public Boolean getExportTableFlag();
	public void setExportTableFlag(Boolean exportTableFlag); 
	public Boolean getCertificateTableFlag();
	public void setCertificateTableFlag(Boolean certificateTableFlag); 
	public Boolean getDebugTableFlag();
	public void setDebugTableFlag(Boolean debugTableFlag); 
	public String getSections();
	public void setSections(String sections);
}