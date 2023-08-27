package com.luchavor.datamodel.artifact.network.observation.file;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.luchavor.datamodel.artifact.network.observation.observedfile.ObservedFile;
import com.luchavor.datamodel.artifact.network.observation.observedfile.ObservedFileImpl;
import com.luchavor.datamodel.util.FieldTypeConverter;

@SpringBootTest
@ActiveProfiles("test")
public class FileTests {
	public ObservedFile getFile1() {
		// test object
		ObservedFile observedFile = new ObservedFileImpl();
		// populate object
		observedFile.setTimestamp(FieldTypeConverter.convertDoubleEpochTimestamp(1375292987.31677));
		observedFile.setFuid("FHmtE03rjmRKqx1gsg");
		observedFile.setOriginatorIp("188.120.236.219");
		observedFile.setResponderIp("192.168.204.150");
		observedFile.setCuid("CuPZdb20YkExv2uM6i");
		observedFile.setSource("HTTP");
		observedFile.setDepth(0);
		observedFile.setAnalyzers(null);
		observedFile.setMimeType("text/html");
		observedFile.setFilename(null);
		observedFile.setDuration(0.0);
		observedFile.setLocalOriginationFlag(null);
		observedFile.setFromOriginatorFlag(false);
		observedFile.setBytesSeen(342);
		observedFile.setTotalFileBytes(342);
		observedFile.setMissingBytes(0);
		observedFile.setOverflowBytes(0);
		observedFile.setTimedOutFlag(false);
		observedFile.setParentFuid(null);
		observedFile.setMd5Hash(null);
		observedFile.setSha1Hash(null);
		observedFile.setSha256Hash(null);
		observedFile.setExtractedFilename(null);
		observedFile.setExtractedFileCutoffFlag(null);
		observedFile.setExtractedFileSize(null);
		return(observedFile);
	}
	
	@Test
    void shouldNotBeNull() throws Exception {
		ObservedFile observation = getFile1();
		// confirm object is not null
		assertNotNull(observation);
	}
}