package com.luchavor.datamodel.detection.zeeknotification;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.luchavor.datamodel.artifact.network.common.NetworkProtocolType;
import com.luchavor.datamodel.util.FieldTypeConverter;

@SpringBootTest
@ActiveProfiles("test")
public class ZeekNotificationTests {
	public List<ZeekNotification> getZeekNotificationList1() {
		// test list object
		List<ZeekNotification> notificationList = new ArrayList<>();
		// test object
		ZeekNotification notification = new ZeekNotificationImpl();
		// populate object attributes
		notification.setTimestamp(FieldTypeConverter.convertDoubleEpochTimestamp(1691285797.49421));
		notification.setUid("CVzFFz1ifCByG4iax7");
		notification.setOriginatorIp("10.3.12.101");
		notification.setOriginatorPort(49780);
		notification.setResponderIp("185.141.24.57");
		notification.setResponderPort(443);
		notification.setFuid("FcPDzs24YZnJ62pTf");
		notification.setFileMimeType(null);
		notification.setFileDescription(null);
		notification.setProtocol(NetworkProtocolType.TCP);
		notification.setNotificationCategory("SSL::Invalid_Server_Cert");
		notification.setDetail("SSL certificate validation failed with (self signed certificate)");
		notification.setSubDetail("C=US,O=My Company Name LTD.,CN=domain.com");
		notification.setSourceIp("10.3.12.101");
		notification.setDestinationIp("185.141.24.57");
		notification.setPort(443);
		notification.setOccurenceCount(null);
		notification.setPeerDescription(null);
		notification.setAction("Notice::ACTION_LOG");
		notification.setEmailDestination(null);
		notification.setSuppressForSetting(3600);
		notification.setRemoteLocationCity(null);
		notification.setRemoteLocationCountryCode(null);
		notification.setRemoteLocationLattitude(null);
		notification.setRemoteLocationLongitude(null);
		notification.setRemoteLocationRegion(null);
		notificationList.add(notification);
		// return value
		return(notificationList);
	}
	
	@Test
    void shouldNotBeNull() throws Exception {
		ZeekNotification notification = getZeekNotificationList1().get(0);
		// confirm object is not null
		assertNotNull(notification);
	}
}