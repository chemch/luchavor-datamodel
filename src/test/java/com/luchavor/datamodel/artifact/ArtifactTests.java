package com.luchavor.datamodel.artifact;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.luchavor.datamodel.artifact.Artifact;
import com.luchavor.datamodel.artifact.ArtifactImpl;
import com.luchavor.datamodel.artifact.ArtifactSubType;
import com.luchavor.datamodel.artifact.ArtifactType;
import com.luchavor.datamodel.artifact.network.observation.executable.Executable;
import com.luchavor.datamodel.artifact.network.observation.executable.ExecutableTests;
import com.luchavor.datamodel.artifact.network.observation.file.File;
import com.luchavor.datamodel.artifact.network.observation.file.FileTests;
import com.luchavor.datamodel.artifact.network.observation.host.Host;
import com.luchavor.datamodel.artifact.network.observation.host.HostTests;
import com.luchavor.datamodel.artifact.network.observation.service.Service;
import com.luchavor.datamodel.artifact.network.observation.service.ServiceTests;
import com.luchavor.datamodel.artifact.network.observation.smbfile.SmbFile;
import com.luchavor.datamodel.artifact.network.observation.smbfile.SmbFileTests;
import com.luchavor.datamodel.artifact.network.session.Session;
import com.luchavor.datamodel.artifact.network.session.SessionTests;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class ArtifactTests {
	private SessionTests sessionTests = new SessionTests();
	private HostTests hostTests = new HostTests();
	private ServiceTests serviceTests = new ServiceTests();
	private ExecutableTests executableTests = new ExecutableTests();
	private FileTests fileTests = new FileTests();
	private SmbFileTests smbFileTests = new SmbFileTests();
	
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
	
	public Artifact<Host> getArtifact6() {
		// test object
		Artifact<Host> artifact = new ArtifactImpl<Host>();
		// populate general attributes
		artifact.setArtifactType(ArtifactType.NETWORK);
		artifact.setArtifactSubType(ArtifactSubType.OBSERVATION);
		// set artifact value
		Host host = hostTests.getHost1();
		artifact.setValue(host);
		// return value
		return artifact;
	}
	
	public Artifact<Service> getArtifact7() {
		// test object
		Artifact<Service> artifact = new ArtifactImpl<Service>();
		// populate general attributes
		artifact.setArtifactType(ArtifactType.NETWORK);
		artifact.setArtifactSubType(ArtifactSubType.OBSERVATION);
		// set artifact value
		Service service = serviceTests.getService1();
		artifact.setValue(service);
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
	
	public Artifact<File> getArtifact11() {
		// test object
		Artifact<File> artifact = new ArtifactImpl<File>();
		// populate general attributes
		artifact.setArtifactType(ArtifactType.NETWORK);
		artifact.setArtifactSubType(ArtifactSubType.OBSERVATION);
		// set artifact value
		File observation = fileTests.getFile1();
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
	
	@Test
    void shouldNotBeNull() throws Exception {
		Artifact<?> artifact = getArtifact1();
		// confirm object is not null
		assertNotNull(artifact);
	}
}