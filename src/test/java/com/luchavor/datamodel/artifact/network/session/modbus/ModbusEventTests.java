package com.luchavor.datamodel.artifact.network.session.modbus;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.luchavor.datamodel.util.FieldTypeConverter;

@SpringBootTest
@ActiveProfiles("test")
public class ModbusEventTests {
	public List<ModbusEvent> getModbusEventList1() {
		// test list object
		List<ModbusEvent> events = new ArrayList<>();
		// test object
		ModbusEvent event = new ModbusEventImpl();
		// populate object attributes
		event.setTimestamp(FieldTypeConverter.convertDoubleEpochTimestamp(1690042948.71936));
		event.setUid("CoWJh84cqPEHQjFhi8");
		event.setOriginatorIp("192.168.2.44");
		event.setOriginatorPort(58606);
		event.setResponderIp("192.168.88.61");
		event.setResponderPort(502);
		event.setFunction("unkown-171");
		event.setException(null);
		// add events to list
		events.add(event);
		// return value
		return(events);
	}
	
	@Test
    void shouldNotBeNull() throws Exception {
		ModbusEvent event = getModbusEventList1().get(0);
		// confirm object is not null
		assertNotNull(event);
	}
}