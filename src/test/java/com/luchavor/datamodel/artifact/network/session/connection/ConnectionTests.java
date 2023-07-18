package com.luchavor.datamodel.artifact.network.session.connection;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import com.luchavor.datamodel.artifact.network.session.event.SessionEventProtocolType;
import com.luchavor.datamodel.util.DataTypeConverter;

@SpringBootTest
@ActiveProfiles("test")
public class ConnectionTests {
	public Connection getTestConnection1() {
		// test connection object
		Connection connection = new ConnectionImpl();
		// populate connection 1
		connection.setTimestamp(DataTypeConverter.convertEpochTimestamp(1689560080.32542));
		connection.setUid("Cn4DGr4nzlVfRjIZe7");
		connection.setOriginatorIp("172.23.250.132");
		connection.setOriginatorPort(36651);
		connection.setResponderIp("172.23.240.1");
		connection.setResponderPort(53);
		connection.setSessionEventProtocolType(SessionEventProtocolType.UDP);
		connection.setService("dns");
		connection.setDuration(null);
		connection.setOriginatorPayloadByteCount(null);
		connection.setResponderPayloadByteCount(null);
		connection.setConnectionState("S0");
		connection.setLocalOriginatorFlag(true);
		connection.setLocalResponderFlag(true);
		connection.setMissedByteCount(0);
		connection.setStateHistory("D");
		connection.setOriginatorPacketCount(1);
		connection.setOriginatorTotalByteCount(73);
		connection.setResponderPacketCount(0);
		connection.setResponderTotalByteCount(0);
		connection.setParentTunnelUid(null);
		connection.setVlan(null);
		connection.setInnerVlan(null);
		connection.setOriginatorMacAddress("00:15:5d:a0:69:5c");
		connection.setResponderMacAddress("00:15:5d:a0:6f:58");
		connection.setSpeculativeService(null);
		// return value
		return(connection);
	}
	
	public Connection getTestConnection2() {
		// test connection object
		Connection connection = new ConnectionImpl();
		// populate connection 1
		connection.setTimestamp(DataTypeConverter.convertEpochTimestamp(1689644622.66883));
		connection.setUid("C4iJPc2hxZsJ39nz0f");
		connection.setOriginatorIp("10.0.0.158");
		connection.setOriginatorPort(49558);
		connection.setResponderIp("91.199.212.52");
		connection.setResponderPort(80);
		connection.setSessionEventProtocolType(SessionEventProtocolType.TCP);
		connection.setService("http");
		connection.setDuration(0.002057);
		connection.setOriginatorPayloadByteCount(160);
		connection.setResponderPayloadByteCount(1935);
		connection.setConnectionState("SF");
		connection.setLocalOriginatorFlag(true);
		connection.setLocalResponderFlag(false);
		connection.setMissedByteCount(0);
		connection.setStateHistory("ShADadfF");
		connection.setOriginatorPacketCount(6);
		connection.setOriginatorTotalByteCount(412);
		connection.setResponderPacketCount(6);
		connection.setResponderTotalByteCount(2187);
		connection.setParentTunnelUid(null);
		connection.setVlan(null);
		connection.setInnerVlan(null);
		connection.setOriginatorMacAddress("08:d4:0c:bd:7d:a2");
		connection.setResponderMacAddress("00:35:1a:64:79:e2");
		connection.setSpeculativeService(null);
		// return value
		return(connection);
	}
	
	@Test
    void shouldNotBeNull() throws Exception {
		Connection connection1 = getTestConnection1();
		// examine connection
		assertNotNull(connection1);
	}
}
