package com.test.luchavor.datamodel.artifact.network.observation.service;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import com.luchavor.datamodel.artifact.network.common.NetworkProtocolType;
import com.luchavor.datamodel.artifact.network.observation.service.Service;
import com.luchavor.datamodel.artifact.network.observation.service.ServiceImpl;
import com.test.luchavor.datamodel.util.DataTypeConverter;

@SpringBootTest
@ActiveProfiles("test")
public class ServiceTests {
	public Service getService1() {
		// test object
		Service service = new ServiceImpl();
		// populate object
		service.setTimestamp(DataTypeConverter.convertDoubleEpochTimestamp(1689560080.32542));
		service.setHostIp("10.0.0.158");
		service.setNetworkProtocolType(NetworkProtocolType.UDP);
		service.setPort(53);
		service.setService("DNS");
		// return value
		return(service);
	}
}