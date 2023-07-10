package com.luchavor.datamodel.artifact.network.session.http;

import com.luchavor.datamodel.artifact.network.session.event.SessionEvent;

public interface HttpEvent extends SessionEvent {
	// transaction depth
	public Integer getTransactionDepth();
	public void setTransactionDepth(Integer transactionDepth);
	// method
	public String getMethod();
	public void setMethod(String method);
	// host
	public String getHost();
	public void setHost(String host);
	// uri
	public String getUri();
	public void setUri(String uri);
	// referrer
	public String getReferrer();
	public void setReferrer(String referrer);
	// version
	public Double getVersion();
	public void setVersion(Double version);
	// user agent
	public String getUserAgent();
	public void setUserAgent(String userAgent);
	// origin header
	public String getOriginHeader();
	public void setOriginHeader(String originHeader);
	// request body length
	public Integer getRequestBodyLength();
	public void setRequestBodyLength(Integer requestBodyLength);
	// response body length
	public Integer getResponseBodyLength();
	public void setResponseBodyLength(Integer respondeBodyLength);
	// status code
	public Integer getStatusCode();
	public void setStatusCode(Integer statusCode);
	// status message
	public String getStatusMessage();
	public void setStatusMessage(String statusMessage);
	// info code
	public Integer getInfoCode();
	public void setInfoCode(Integer infoCode);
	// info message
	public String getInfoMessage();
	public void setInfoMessage(String infoMessage);
	// tags
	public String getTags();
	public void setTags(String tags);
	// username
	public String getUsername();
	public void setUsername(String username);
	// password
	public String getPassword();
	public void setPassword(String password);
	// proxy headers
	public String getProxyHeaders();
	public void setProxyHeaders(String proxyHeaders);
	// originator fuids
	public String getOriginatorFuids();
	public void setOriginatorFuids(String originatorFuids);
	// originator filenames
	public String getOriginatorFilenames();
	public void setOriginatorFilenames(String originatorFilenames);
	// originator mime types
	public String getOriginatorMimeTypes();
	public void setOriginatorMimeTypes(String originatorMimeTypes);
	// responder fuids
	public String getResponderFuids();
	public void setResponderFuids(String responderFuids);
	// responder filenames
	public String getResponderFilenames();
	public void setResponderFilenames(String responderFilenames);
	// responder mime types
	public String getResponderMimeTypes();
	public void setResponderMimeTypes(String responderMimeTypes);
}