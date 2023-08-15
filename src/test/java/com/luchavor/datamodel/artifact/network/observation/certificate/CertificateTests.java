package com.luchavor.datamodel.artifact.network.observation.certificate;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.luchavor.datamodel.util.FieldTypeConverter;

@SpringBootTest
@ActiveProfiles("test")
public class CertificateTests {
	public Certificate getCertificate1() {
		// test object
		Certificate certificate = new CertificateImpl();
		// populate object
		certificate.setTimestamp(FieldTypeConverter.convertDoubleEpochTimestamp(1689904487.80656));
		certificate.setHostIp("192.168.88.60");
		certificate.setPort(443);
		certificate.setSubject("L=Taipei,SN=Taiwan,C=TW,OU=IEI,O=Moxa Networking Co.\\, Ltd.,CN=192.168.88.60");
		certificate.setIssuerSubject("emailAddress=support@moxanet.com,CN=Moxa Networking Co.\\, Ltd.,OU=Moxa Networking,O=Moxa Networking Co.\\, Ltd.,L=Taipei,ST=Taiwan,C=TW");
		certificate.setSerial("979B5045D2C377F1");
		// return value
		return(certificate);
	}
	
	@Test
    void shouldNotBeNull() throws Exception {
		Certificate observation = getCertificate1();
		// confirm object is not null
		assertNotNull(observation);
	}
}