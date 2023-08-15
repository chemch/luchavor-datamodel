package com.luchavor.datamodel.artifact.network.observation.file;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.luchavor.datamodel.util.FieldTypeConverter;

@SpringBootTest
@ActiveProfiles("test")
public class FileTests {
	public File getFile1() {
		// test object
		File file = new FileImpl();
		// populate object
		file.setTimestamp(FieldTypeConverter.convertDoubleEpochTimestamp(1375292987.31677));
		file.setUid("FHmtE03rjmRKqx1gsg");
		file.setTransmitHosts("188.120.236.219");
		file.setReceiveHosts("192.168.204.150");
		file.setConnectionUids("CuPZdb20YkExv2uM6i");
		file.setSource("HTTP");
		file.setDepth(0);
		file.setAnalyzers("(empty)");
		file.setMimeType("text/html");
		file.setFilename(null);
		file.setDuration(0.0);
		file.setLocalOriginationFlag(null);
		file.setFromOriginatorFlag(false);
		file.setBytesSeen(342);
		file.setTotalFileBytes(342);
		file.setMissingBytes(0);
		file.setOverflowBytes(0);
		file.setTimedOutFlag(false);
		file.setParentUid(null);
		file.setMd5Hash(null);
		file.setSha1Hash(null);
		file.setSha256Hash(null);
		file.setExtractedFilename(null);
		file.setExtractedFileCutoffFlag(null);
		file.setExtractedFileSize(null);
		return(file);
	}
	
	@Test
    void shouldNotBeNull() throws Exception {
		File observation = getFile1();
		// confirm object is not null
		assertNotNull(observation);
	}
}