//package com.luchavor.datamodel.detection;
//
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.ActiveProfiles;
//import com.luchavor.datamodel.artifact.Artifact;
//import com.luchavor.datamodel.artifact.ArtifactTests;
//import com.luchavor.datamodel.artifact.network.session.Session;
//import com.luchavor.datamodel.artifact.network.session.ssl.SslEvent;
//import com.luchavor.datamodel.detection.zeeknotification.ZeekNotification;
//import com.luchavor.datamodel.detection.zeeknotification.ZeekNotificationTests;
//
//@SpringBootTest
//@AutoConfigureMockMvc
//@ActiveProfiles("test")
//public class DetectionTests {
//	private ArtifactTests artifactTests = new ArtifactTests();
//	private ZeekNotificationTests zeekNotificationTests = new ZeekNotificationTests();
//	
//	public Detection<ZeekNotification, ?, Session> getDetection1() {
//		// test artifact object and list
//		List<Artifact<Session>> artifactList = new ArrayList<Artifact<Session>>();
//		Artifact<Session> artifact = artifactTests.getArtifact21();
//		artifactList.add(artifact);
//		// populate attributes
//		Detection<ZeekNotification, ?, Session> detection = new DetectionImpl<>();
//		// set artifact value
//		detection.setDetectionType(DetectionType.BEHAVIOR);
//		// set artifacts
//		detection.setArtifacts(artifactList);
//		// set value
//		ZeekNotification zeekNotification = zeekNotificationTests.getZeekNotificationList1().get(0); 
//		detection.setValue(zeekNotification);
//		// return value
//		return detection;
//	}
//	
//	@Test
//    void shouldNotBeNull() throws Exception {
//		Detection<?, ?, ?> detection1 = getDetection1();
//		// confirm object is not null
//		assertNotNull(detection1);
//	}
//}