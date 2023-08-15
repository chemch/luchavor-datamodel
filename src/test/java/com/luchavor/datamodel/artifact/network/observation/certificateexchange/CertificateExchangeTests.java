package com.luchavor.datamodel.artifact.network.observation.certificateexchange;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.luchavor.datamodel.util.FieldTypeConverter;

@SpringBootTest
@ActiveProfiles("test")
public class CertificateExchangeTests {
	public CertificateExchange getCertificateExchange1() {
		// test object
		CertificateExchange exchange = new CertificateExchangeImpl();
		// populate object
		exchange.setTimestamp(FieldTypeConverter.convertDoubleEpochTimestamp(1691336734.0));
		exchange.setCertificateKeyAlgorithm("rsaEncryption");
		exchange.setCertificateSigningAlgorithm("sha256WithRSAEncryption");
		exchange.setCertificateKeyLength(2048);
		exchange.setCertificateExponent(65537);
		exchange.setCertificateCurve(null);
		exchange.setSansDns("motd.ubuntu.com");
		exchange.setSansUri(null);
		exchange.setSansIp(null);
		exchange.setBasicConstraintsFlag(false);
		exchange.setBasicConstraintsPathLength(null);
		exchange.setHostCertificateFlag(true);
		exchange.setClientCertificateFlag(false);
		// return value
		return(exchange);
	}
	
	@Test
    void shouldNotBeNull() throws Exception {
		CertificateExchange observation = getCertificateExchange1();
		// confirm object is not null
		assertNotNull(observation);
	}
}