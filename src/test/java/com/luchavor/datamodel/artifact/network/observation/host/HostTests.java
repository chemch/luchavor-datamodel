package com.luchavor.datamodel.artifact.network.observation.host;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import com.luchavor.datamodel.util.DataTypeConverter;

@SpringBootTest
@ActiveProfiles("test")
public class HostTests {
	public Host getHost1() {
		// test object
		Host host = new HostImpl();
		// populate object
		host.setTimestamp(DataTypeConverter.convertDoubleEpochTimestamp(1689560080.32542));
		host.setHostIp("10.0.0.158");
		// return value
		return(host);
	}
}