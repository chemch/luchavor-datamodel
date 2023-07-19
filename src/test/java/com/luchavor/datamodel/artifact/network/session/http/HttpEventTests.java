package com.luchavor.datamodel.artifact.network.session.http;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.luchavor.datamodel.artifact.network.session.http.HttpEvent;
import com.luchavor.datamodel.artifact.network.session.http.HttpEventImpl;
import com.luchavor.datamodel.util.DataTypeConverter;

@SpringBootTest
@ActiveProfiles("test")
public class HttpEventTests {
	public List<HttpEvent> getHttpEventList1() {
		// test list object
		List<HttpEvent> events = new ArrayList<>();
		// test object
		HttpEvent event = new HttpEventImpl();
		// populate object attributes
		event.setTimestamp(DataTypeConverter.convertDoubleEpochTimestamp(1689644622.66883));
		event.setUid("C4iJPc2hxZsJ39nz0f");
		event.setOriginatorIp("10.0.0.158");
		event.setOriginatorPort(49558);
		event.setResponderIp("91.199.212.52");
		event.setResponderPort(80);
		event.setTransactionDepth(1);
		event.setMethod("GET");
		event.setHost("crt.sectigo.com");
		event.setUri("/SectigoRSADomainValidationSecureServerCA.crt");
		event.setReferrer(null);
		event.setVersion(1.1);
		event.setUserAgent("Microsoft-CryptoAPI/10.0");
		event.setOriginHeader(null);
		event.setRequestBodyLength(0);
		event.setResponseBodyLength(1559);
		event.setStatusCode(200);
		event.setInfoCode(null);
		event.setInfoMessage(null);
		event.setTags("(empty)");
		event.setUsername(null);
		event.setPassword(null);
		event.setProxyHeaders(null);
		event.setOriginatorFuids(null);
		event.setOriginatorFilenames(null);
		event.setOriginatorMimeTypes(null);
		event.setResponderFuids("F3y8xr3Vtwem393Gn1");
		event.setResponderFilenames(null);
		event.setResponderMimeTypes(null);		
		// add events to list
		events.add(event);
		// return value
		return(events);
	}
	
	@Test
    void shouldNotBeNull() throws Exception {
		HttpEvent event1 = getHttpEventList1().get(0);
		// confirm object is not null
		assertNotNull(event1);
	}
}