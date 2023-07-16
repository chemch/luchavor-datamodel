package com.luchavor.datamodel.artifact.network.session.connection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import com.luchavor.datamodel.artifact.network.session.event.SessionEventProtocolType;

@SpringBootTest
@ActiveProfiles("test")
public class ConnectionTests {
	// test connection objects
	Connection connection0 = new ConnectionImpl();
	Connection connection1 = new ConnectionImpl();
	
	public void populateConnection1() {
		// populate connection 1
		connection1.setTimestamp(convertEpochToLdt(1688180033.933094));
		connection1.setUid("ChotX932QgJFTfQAFh");
		connection1.setOriginatorIp("172.23.250.132");
		connection1.setOriginatorPort(8);
		connection1.setResponderIp("8.8.8.8");
		connection1.setResponderPort(0);
		connection1.setSessionEventProtocolType(SessionEventProtocolType.ICMP);
		connection1.setService(null);
		connection1.setDuration(7.035834);
		connection1.setOriginatorPayloadByteCount(448);
		connection1.setResponderPayloadByteCount(448);
		connection1.setConnectionState("OTH");
		connection1.setLocalOriginatorFlag(false);
		connection1.setLocalResponderFlag(true);
		connection1.setMissedByteCount(0);
		connection1.setStateHistory(null);
		connection1.setOriginatorPacketCount(8);
		connection1.setOriginatorTotalByteCount(672);
		connection1.setResponderPacketCount(8);
		connection1.setResponderTotalByteCount(672);
		connection1.setParentTunnelUid(null);
		connection1.setVlan(null);
		connection1.setInnerVlan(null);
		connection1.setOriginatorMacAddress("00:15:5d:6d:43:4a");
		connection1.setResponderMacAddress("00:15:5d:6e:11:3b");
		connection1.setSpeculativeService(null);
	}
	
	private LocalDateTime convertEpochToLdt(Double timestamp) {
		Long longTimestamp = Math.round(timestamp);
		LocalDateTime convertedTimestamp = Instant.ofEpochMilli(longTimestamp).atZone(ZoneId.systemDefault()).toLocalDateTime();
		return convertedTimestamp;
	}
	
	@Test
    void shouldBeWellFormed() throws Exception {
		// populate connection 1
		populateConnection1();
		// examine said connection
		assertNotNull(connection1);
	}
}