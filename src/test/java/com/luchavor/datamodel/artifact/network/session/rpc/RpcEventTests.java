package com.luchavor.datamodel.artifact.network.session.rpc;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import com.luchavor.datamodel.util.DataTypeConverter;

@SpringBootTest
@ActiveProfiles("test")
public class RpcEventTests {
	public List<RpcEvent> getRpcEventList1() {
		// test list object
		List<RpcEvent> events = new ArrayList<>();
		// test object
		RpcEvent event = new RpcEventImpl();
		// populate object attributes
		event.setTimestamp(DataTypeConverter.convertDoubleEpochTimestamp(1689721214.20644));
		event.setUid("CLvWgY387H4Byeno68");
		event.setOriginatorIp("10.0.0.158");
		event.setOriginatorPort(49532);
		event.setResponderIp("10.0.0.10");
		event.setResponderPort(445);
		event.setRoundTripTime(0.000002);
		event.setNamedPipe("\\pipe\\lsass");
		event.setEndpoint("samr");
		event.setOperation("SamrConnect5");
		// add events to list
		events.add(event);
		// return value
		return(events);
	}
	
	@Test
    void shouldNotBeNull() throws Exception {
		RpcEvent event = getRpcEventList1().get(0);
		// confirm object is not null
		assertNotNull(event);
	}
}