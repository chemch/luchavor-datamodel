package com.luchavor.datamodel.artifact.network.observation.executable;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.luchavor.datamodel.util.transform.attribute.AttributeTypeTransformer;

@SpringBootTest
@ActiveProfiles("test")
public class ExecutableTests {
	public Executable getExecutable1() {
		// test object
		Executable executable = new ExecutableImpl();
		// populate object
		executable.setTimestamp(AttributeTypeTransformer.convertDoubleEpochTimestamp(1375293001.58677));
		executable.setUid("Fjmi0s24VCZQAR8xrj");
		executable.setCompileArchitecture("I386");
		executable.setCompileTimestamp(AttributeTypeTransformer.convertDoubleEpochTimestamp(1390123581.0));
		executable.setOperatingSystem("unknown-13.6");
		executable.setSubSystem("WINDOWS_GUI");
		executable.setExecutableFlag(true);
		executable.setX64Flag(false);
		executable.setAslrFlag(false);
		executable.setDepSupportFlag(false);
		executable.setCodeIntegrityFlag(false);
		executable.setStructuredExceptionHandlingFlag(true);
		executable.setImportTableFlag(true);
		executable.setExportTableFlag(true);
		executable.setCertificateTableFlag(false);
		executable.setDebugTableFlag(false);
		executable.setSections(".text,.mem21,.data,.mem09,.mem87,.reloc,.rsrc");
		// return value
		return(executable);
	}
	
	@Test
    void shouldNotBeNull() throws Exception {
		Executable observation = getExecutable1();
		// confirm object is not null
		assertNotNull(observation);
	}
}