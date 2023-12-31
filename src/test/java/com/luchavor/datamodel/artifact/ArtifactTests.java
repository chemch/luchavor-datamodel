package com.luchavor.datamodel.artifact;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import com.luchavor.datamodel.artifact.network.observation.certificate.Certificate;
import com.luchavor.datamodel.artifact.network.observation.certificate.CertificateTests;
import com.luchavor.datamodel.artifact.network.observation.certificateexchange.CertificateExchange;
import com.luchavor.datamodel.artifact.network.observation.certificateexchange.CertificateExchangeTests;
import com.luchavor.datamodel.artifact.network.observation.executable.Executable;
import com.luchavor.datamodel.artifact.network.observation.executable.ExecutableTests;
import com.luchavor.datamodel.artifact.network.observation.file.FileTests;
import com.luchavor.datamodel.artifact.network.observation.observedfile.ObservedFile;
import com.luchavor.datamodel.artifact.network.observation.observedhost.ObservedHostTests;
import com.luchavor.datamodel.artifact.network.observation.observedservice.ObservedService;
import com.luchavor.datamodel.artifact.network.observation.observedhost.ObservedHost;
import com.luchavor.datamodel.artifact.network.observation.service.ServiceTests;
import com.luchavor.datamodel.artifact.network.observation.smbfile.SmbFile;
import com.luchavor.datamodel.artifact.network.observation.smbfile.SmbFileTests;
import com.luchavor.datamodel.artifact.network.observation.software.Software;
import com.luchavor.datamodel.artifact.network.observation.software.SoftwareTests;
import com.luchavor.datamodel.artifact.network.session.Session;
import com.luchavor.datamodel.artifact.network.session.SessionTests;

@SpringBootTest
@ActiveProfiles("test")
public class ArtifactTests {
	private SessionTests sessionTests = new SessionTests();
	private ObservedHostTests observedHostTests = new ObservedHostTests();
	private ServiceTests serviceTests = new ServiceTests();
	private ExecutableTests executableTests = new ExecutableTests();
	private FileTests fileTests = new FileTests();
	private SmbFileTests smbFileTests = new SmbFileTests();
	private SoftwareTests softwareTests = new SoftwareTests();
	private CertificateTests certificateTests = new CertificateTests();
	private CertificateExchangeTests certificateExchangeTests = new CertificateExchangeTests();
	
	public Artifact<Session> getArtifact1() {
		// test object
		Artifact<Session> artifact = new ArtifactImpl<Session>();
		// populate general attributes
		artifact.setArtifactType(ArtifactType.NETWORK);
		artifact.setArtifactSubType(ArtifactSubType.SESSION);
		// set artifact value
		Session session = sessionTests.getSession1();
		artifact.setValue(session);
		// return value
		return artifact;
	}
	
	public Artifact<Session> getArtifact2() {
		// test object
		Artifact<Session> artifact = new ArtifactImpl<Session>();
		// populate general attributes
		artifact.setArtifactType(ArtifactType.NETWORK);
		artifact.setArtifactSubType(ArtifactSubType.SESSION);
		// set artifact value
		Session session = sessionTests.getSession2();
		artifact.setValue(session);
		// return value
		return artifact;
	}
	
	public Artifact<Session> getArtifact3() {
		// test object
		Artifact<Session> artifact = new ArtifactImpl<Session>();
		// populate general attributes
		artifact.setArtifactType(ArtifactType.NETWORK);
		artifact.setArtifactSubType(ArtifactSubType.SESSION);
		// set artifact value
		Session session = sessionTests.getSession3();
		artifact.setValue(session);
		// return value
		return artifact;
	}
	
	public Artifact<Session> getArtifact4() {
		// test object
		Artifact<Session> artifact = new ArtifactImpl<Session>();
		// populate general attributes
		artifact.setArtifactType(ArtifactType.NETWORK);
		artifact.setArtifactSubType(ArtifactSubType.SESSION);
		// set artifact value
		Session session = sessionTests.getSession4();
		artifact.setValue(session);
		// return value
		return artifact;
	}
	
	public Artifact<Session> getArtifact5() {
		// test object
		Artifact<Session> artifact = new ArtifactImpl<Session>();
		// populate general attributes
		artifact.setArtifactType(ArtifactType.NETWORK);
		artifact.setArtifactSubType(ArtifactSubType.SESSION);
		// set artifact value
		Session session = sessionTests.getSession5();
		artifact.setValue(session);
		// return value
		return artifact;
	}
	
	public Artifact<ObservedHost> getArtifact6() {
		// test object
		Artifact<ObservedHost> artifact = new ArtifactImpl<ObservedHost>();
		// populate general attributes
		artifact.setArtifactType(ArtifactType.NETWORK);
		artifact.setArtifactSubType(ArtifactSubType.OBSERVATION);
		// set artifact value
		ObservedHost observedHost = observedHostTests.getHost1();
		artifact.setValue(observedHost);
		// return value
		return artifact;
	}
	
	public Artifact<ObservedService> getArtifact7() {
		// test object
		Artifact<ObservedService> artifact = new ArtifactImpl<ObservedService>();
		// populate general attributes
		artifact.setArtifactType(ArtifactType.NETWORK);
		artifact.setArtifactSubType(ArtifactSubType.OBSERVATION);
		// set artifact value
		ObservedService observedService = serviceTests.getService1();
		artifact.setValue(observedService);
		// return value
		return artifact;
	}
	
	public Artifact<Session> getArtifact8() {
		// test object
		Artifact<Session> artifact = new ArtifactImpl<Session>();
		// populate general attributes
		artifact.setArtifactType(ArtifactType.NETWORK);
		artifact.setArtifactSubType(ArtifactSubType.SESSION);
		// set artifact value
		Session session = sessionTests.getSession7();
		artifact.setValue(session);
		// return value
		return artifact;
	}
	
	public Artifact<Session> getArtifact9() {
		// test object
		Artifact<Session> artifact = new ArtifactImpl<Session>();
		// populate general attributes
		artifact.setArtifactType(ArtifactType.NETWORK);
		artifact.setArtifactSubType(ArtifactSubType.SESSION);
		// set artifact value
		Session session = sessionTests.getSession6();
		artifact.setValue(session);
		// return value
		return artifact;
	}
	
	public Artifact<Executable> getArtifact10() {
		// test object
		Artifact<Executable> artifact = new ArtifactImpl<Executable>();
		// populate general attributes
		artifact.setArtifactType(ArtifactType.NETWORK);
		artifact.setArtifactSubType(ArtifactSubType.OBSERVATION);
		// set artifact value
		Executable observation = executableTests.getExecutable1();
		artifact.setValue(observation);
		// return value
		return artifact;
	}
	
	public Artifact<ObservedFile> getArtifact11() {
		// test object
		Artifact<ObservedFile> artifact = new ArtifactImpl<ObservedFile>();
		// populate general attributes
		artifact.setArtifactType(ArtifactType.NETWORK);
		artifact.setArtifactSubType(ArtifactSubType.OBSERVATION);
		// set artifact value
		ObservedFile observation = fileTests.getFile1();
		artifact.setValue(observation);
		// return value
		return artifact;
	}
	
	public Artifact<SmbFile> getArtifact12() {
		// test object
		Artifact<SmbFile> artifact = new ArtifactImpl<SmbFile>();
		// populate general attributes
		artifact.setArtifactType(ArtifactType.NETWORK);
		artifact.setArtifactSubType(ArtifactSubType.OBSERVATION);
		// set artifact value
		SmbFile observation = smbFileTests.getSmbFile1();
		artifact.setValue(observation);
		// return value
		return artifact;
	}
	
	public Artifact<Software> getArtifact13() {
		// test object
		Artifact<Software> artifact = new ArtifactImpl<Software>();
		// populate general attributes
		artifact.setArtifactType(ArtifactType.NETWORK);
		artifact.setArtifactSubType(ArtifactSubType.OBSERVATION);
		// set artifact value
		Software observation = softwareTests.getSoftware1();
		artifact.setValue(observation);
		// return value
		return artifact;
	}
	
	public Artifact<Certificate> getArtifact14() {
		// test object
		Artifact<Certificate> artifact = new ArtifactImpl<Certificate>();
		// populate general attributes
		artifact.setArtifactType(ArtifactType.NETWORK);
		artifact.setArtifactSubType(ArtifactSubType.OBSERVATION);
		// set artifact value
		Certificate observation = certificateTests.getCertificate1();
		artifact.setValue(observation);
		// return value
		return artifact;
	}
	
	public Artifact<Session> getArtifact15() {
		// test object
		Artifact<Session> artifact = new ArtifactImpl<Session>();
		// populate general attributes
		artifact.setArtifactType(ArtifactType.NETWORK);
		artifact.setArtifactSubType(ArtifactSubType.SESSION);
		// set artifact value
		Session session = sessionTests.getSession8();
		artifact.setValue(session);
		// return value
		return artifact;
	}
	
	public Artifact<Session> getArtifact16() {
		// test object
		Artifact<Session> artifact = new ArtifactImpl<Session>();
		// populate general attributes
		artifact.setArtifactType(ArtifactType.NETWORK);
		artifact.setArtifactSubType(ArtifactSubType.SESSION);
		// set artifact value
		Session session = sessionTests.getSession9();
		artifact.setValue(session);
		// return value
		return artifact;
	}
	
	public Artifact<Session> getArtifact17() {
		// test object
		Artifact<Session> artifact = new ArtifactImpl<Session>();
		// populate general attributes
		artifact.setArtifactType(ArtifactType.NETWORK);
		artifact.setArtifactSubType(ArtifactSubType.SESSION);
		// set artifact value
		Session session = sessionTests.getSession10();
		artifact.setValue(session);
		// return value
		return artifact;
	}
	
	public Artifact<CertificateExchange> getArtifact18() {
		// test object
		Artifact<CertificateExchange> artifact = new ArtifactImpl<CertificateExchange>();
		// populate general attributes
		artifact.setArtifactType(ArtifactType.NETWORK);
		artifact.setArtifactSubType(ArtifactSubType.OBSERVATION);
		// set artifact value
		CertificateExchange observation = certificateExchangeTests.getCertificateExchange1();
		artifact.setValue(observation);
		// return value
		return artifact;
	}
	
	public Artifact<Session> getArtifact19() {
		// test object
		Artifact<Session> artifact = new ArtifactImpl<Session>();
		// populate general attributes
		artifact.setArtifactType(ArtifactType.NETWORK);
		artifact.setArtifactSubType(ArtifactSubType.SESSION);
		// set artifact value
		Session session = sessionTests.getSession11();
		artifact.setValue(session);
		// return value
		return artifact;
	}
	
	public Artifact<Session> getArtifact20() {
		// test object
		Artifact<Session> artifact = new ArtifactImpl<Session>();
		// populate general attributes
		artifact.setArtifactType(ArtifactType.NETWORK);
		artifact.setArtifactSubType(ArtifactSubType.SESSION);
		// set artifact value
		Session session = sessionTests.getSession12();
		artifact.setValue(session);
		// return value
		return artifact;
	}
	
	public Artifact<Session> getArtifact21() {
		// test object
		Artifact<Session> artifact = new ArtifactImpl<Session>();
		// populate general attributes
		artifact.setArtifactType(ArtifactType.NETWORK);
		artifact.setArtifactSubType(ArtifactSubType.SESSION);
		// set artifact value
		Session session = sessionTests.getSession13();
		artifact.setValue(session);
		// return value
		return artifact;
	}
	
	@Test
    void shouldNotBeNull() throws Exception {
		Artifact<?> artifact = getArtifact1();
		// confirm object is not null
		assertNotNull(artifact);
	}
}