package com.luchavor.datamodel.artifact.network.session.dns;

import com.luchavor.datamodel.artifact.network.session.event.SessionEvent;

public interface DnsEvent extends SessionEvent {
	// transaction id
	public Integer getTransactionId();
	public void setTransactionId(Integer transactionId);
	// round trip time
	public Double getRoundTripTime();
	public void setRoundTripTime(Double roundTripTime);
	// query
	public String getQuery();
	public void setQuery(String query);
	// query class
	public Integer getQclass();
	public void setQclass(Integer qclass);
	// query class name
	public String getQclassName();
	public void setQclassName(String qclassName);
	// query type
	public Integer getQtype();
	public void setQtype(Integer qtype);
	// query type name
	public String getQtypeName();
	public void setQtypeName(String qtypeName);
	// response code
	public Integer getRcode();
	public void setRcode(Integer rcode);
	// responde code name
	public String getRcodeName();
	public void setRcodeName(String rcodeName);
	// authoritative flag
	public Boolean getAuthoritativeAnswerFlag();
	public void setAuthoritativeAnswerFlag(Boolean flag);
	// truncation flag
	public Boolean getTruncationFlag();
	public void setTruncationFlag(Boolean flag);
	// recursion desired flag
	public Boolean getRecursionDesiredFlag();
	public void setRecursionDesiredFlag(Boolean flag);
	// recursion available flag
	public Boolean getRecursionAvailableFlag();
	public void setRecursionAvailableFlag(Boolean flag);
	// dnssec flag (defaults to 0 when dnssec not in use)
	public Boolean getDnssecFlag();
	public void setDnssecFlag(Boolean flag);
	// query answer array
	public String[] getAnswers();
	public void setAnswers(String[] answers);
	// ttls for answers
	public String[] getTtls();
	public void setTtls(String[] ttls);
	// rejected flag
	public Boolean getRejectedFlag();
	public void setRejectedFlag(Boolean flag);
	// authoritative response array
	public String getAuthoritativeResponses();
	public void setAuthoritativeResponses(String responses);
	// additiona response array
	public String getAdditionalResponses();
	public void setAdditionalResponses(String responses);
	// original query
	public String getOriginalQuery();
	public void setOriginalQuery(String query);
}