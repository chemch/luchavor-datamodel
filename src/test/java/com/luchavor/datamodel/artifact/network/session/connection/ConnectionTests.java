package com.luchavor.datamodel.artifact.network.session.connection;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.luchavor.datamodel.artifact.network.common.NetworkProtocolType;
import com.luchavor.datamodel.util.transform.attribute.AttributeTypeTransformer;

@SpringBootTest
@ActiveProfiles("test")
public class ConnectionTests {
	public Connection getTestConnection1() {
		// test connection object
		Connection connection = new ConnectionImpl();
		// populate connection
		connection.setTimestamp(AttributeTypeTransformer.convertDoubleEpochTimestamp(1689560080.32542));
		connection.setUid("Cn4DGr4nzlVfRjIZe7");
		connection.setOriginatorIp("172.23.250.132");
		connection.setOriginatorPort(36651);
		connection.setResponderIp("172.23.240.1");
		connection.setResponderPort(53);
		connection.setNetworkProtocolType(NetworkProtocolType.UDP);
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
		// populate connection
		connection.setTimestamp(AttributeTypeTransformer.convertDoubleEpochTimestamp(1689644622.66883));
		connection.setUid("C4iJPc2hxZsJ39nz0f");
		connection.setOriginatorIp("10.0.0.158");
		connection.setOriginatorPort(49558);
		connection.setResponderIp("91.199.212.52");
		connection.setResponderPort(80);
		connection.setNetworkProtocolType(NetworkProtocolType.TCP);
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
	
	public Connection getTestConnection3() {
		// test connection object
		Connection connection = new ConnectionImpl();
		// populate connection
		connection.setTimestamp(AttributeTypeTransformer.convertDoubleEpochTimestamp(1689646377.46308));
		connection.setUid("C8YskB4y2XSn9o9KF7");
		connection.setOriginatorIp("10.0.0.158");
		connection.setOriginatorPort(49533);
		connection.setResponderIp("10.0.0.10");
		connection.setResponderPort(88);
		connection.setNetworkProtocolType(NetworkProtocolType.TCP);
		connection.setService("krb_tcp");
		connection.setDuration(0.00002);
		connection.setOriginatorPayloadByteCount(1885);
		connection.setResponderPayloadByteCount(1825);
		connection.setConnectionState("RSTR");
		connection.setLocalOriginatorFlag(true);
		connection.setLocalResponderFlag(false);
		connection.setMissedByteCount(0);
		connection.setStateHistory("ShADadFr");
		connection.setOriginatorPacketCount(6);
		connection.setOriginatorTotalByteCount(213);
		connection.setResponderPacketCount(6);
		connection.setResponderTotalByteCount(2077);
		connection.setParentTunnelUid(null);
		connection.setVlan(null);
		connection.setInnerVlan(null);
		connection.setOriginatorMacAddress("08:d4:0c:bd:7d:a2");
		connection.setResponderMacAddress("18:03:73:21:54:f1");
		connection.setSpeculativeService(null);
		// return value
		return(connection);
	}
	
	public Connection getTestConnection4() {
		// test connection object
		Connection connection = new ConnectionImpl();
		// populate connection
		connection.setTimestamp(AttributeTypeTransformer.convertDoubleEpochTimestamp(1689721214.20921));
		connection.setUid("Cy7bMR3IwANa9ZEUb");
		connection.setOriginatorIp("10.0.0.158");
		connection.setOriginatorPort(49536);
		connection.setResponderIp("10.0.0.10");
		connection.setResponderPort(139);
		connection.setNetworkProtocolType(NetworkProtocolType.TCP);
		connection.setService("smb,ntlm,gssapi");
		connection.setDuration(0.000156);
		connection.setOriginatorPayloadByteCount(1017);
		connection.setResponderPayloadByteCount(1219);
		connection.setConnectionState("SF");
		connection.setLocalOriginatorFlag(true);
		connection.setLocalResponderFlag(true);
		connection.setMissedByteCount(0);
		connection.setStateHistory("ShDdAFf");
		connection.setOriginatorPacketCount(13);
		connection.setOriginatorTotalByteCount(1561);
		connection.setResponderPacketCount(11);
		connection.setResponderTotalByteCount(1671);
		connection.setParentTunnelUid(null);
		connection.setVlan(null);
		connection.setInnerVlan(null);
		connection.setOriginatorMacAddress("08:d4:0c:bd:7d:a2");
		connection.setResponderMacAddress("18:03:73:21:54:f1");
		connection.setSpeculativeService(null);
		// return value
		return(connection);
	}
	
	public Connection getTestConnection5() {
		// test connection object
		Connection connection = new ConnectionImpl();
		// populate connection
		connection.setTimestamp(AttributeTypeTransformer.convertDoubleEpochTimestamp(1689721214.20644));
		connection.setUid("CLvWgY387H4Byeno68");
		connection.setOriginatorIp("10.0.0.158");
		connection.setOriginatorPort(49532);
		connection.setResponderIp("10.0.0.10");
		connection.setResponderPort(445);
		connection.setNetworkProtocolType(NetworkProtocolType.TCP);
		connection.setService("dce_rpc,krb,smb");
		connection.setDuration(.002611);
		connection.setOriginatorPayloadByteCount(10264);
		connection.setResponderPayloadByteCount(6913);
		connection.setConnectionState("RSTO");
		connection.setLocalOriginatorFlag(true);
		connection.setLocalResponderFlag(true);
		connection.setMissedByteCount(0);
		connection.setStateHistory("ShADdaR");
		connection.setOriginatorPacketCount(45);
		connection.setOriginatorTotalByteCount(12088);
		connection.setResponderPacketCount(40);
		connection.setResponderTotalByteCount(8525);
		connection.setParentTunnelUid(null);
		connection.setVlan(null);
		connection.setInnerVlan(null);
		connection.setOriginatorMacAddress("08:d4:0c:bd:7d:a2");
		connection.setResponderMacAddress("18:03:73:21:54:f1");
		connection.setSpeculativeService(null);
		// return value
		return(connection);
	}
	
	public Connection getTestConnection6() {
		// test connection object
		Connection connection = new ConnectionImpl();
		// populate connection
		connection.setTimestamp(AttributeTypeTransformer.convertDoubleEpochTimestamp(1689733348.6635));
		connection.setUid("C9Mt4e1b7pjoRIC55k");
		connection.setOriginatorIp("10.0.0.158");
		connection.setOriginatorPort(49525);
		connection.setResponderIp("87.120.8.98");
		connection.setResponderPort(443);
		connection.setNetworkProtocolType(NetworkProtocolType.TCP);
		connection.setService("ssl");
		connection.setDuration(.023268);
		connection.setOriginatorPayloadByteCount(1171);
		connection.setResponderPayloadByteCount(1907504);
		connection.setConnectionState("SF");
		connection.setLocalOriginatorFlag(true);
		connection.setLocalResponderFlag(false);
		connection.setMissedByteCount(15268);
		connection.setStateHistory("ShADadgttFf");
		connection.setOriginatorPacketCount(519);
		connection.setOriginatorTotalByteCount(23279);
		connection.setResponderPacketCount(1372);
		connection.setResponderTotalByteCount(19471285);
		connection.setParentTunnelUid(null);
		connection.setVlan(null);
		connection.setInnerVlan(null);
		connection.setOriginatorMacAddress("08:d4:0c:bd:7d:a2");
		connection.setResponderMacAddress("00:35:1a:64:79:e2");
		connection.setSpeculativeService(null);
		// return value
		return(connection);
	}
	
	public Connection getTestConnection7() {
		// test connection object
		Connection connection = new ConnectionImpl();
		// populate connection
		connection.setTimestamp(AttributeTypeTransformer.convertDoubleEpochTimestamp(1689819179.07213));
		connection.setUid("CyJElO1nOpPVk0oH6f");
		connection.setOriginatorIp("10.0.0.158");
		connection.setOriginatorPort(49524);
		connection.setResponderIp("10.0.0.10");
		connection.setResponderPort(139);
		connection.setNetworkProtocolType(NetworkProtocolType.TCP);
		connection.setService("smb,ntlm,gssapi");
		connection.setDuration(.021095);
		connection.setOriginatorPayloadByteCount(1497);
		connection.setResponderPayloadByteCount(1491);
		connection.setConnectionState("SF");
		connection.setLocalOriginatorFlag(true);
		connection.setLocalResponderFlag(true);
		connection.setMissedByteCount(0);
		connection.setStateHistory("ShDdAFf");
		connection.setOriginatorPacketCount(19);
		connection.setOriginatorTotalByteCount(2305);
		connection.setResponderPacketCount(15);
		connection.setResponderTotalByteCount(2103);
		connection.setParentTunnelUid(null);
		connection.setVlan(null);
		connection.setInnerVlan(null);
		connection.setOriginatorMacAddress("08:d4:0c:bd:7d:a2");
		connection.setResponderMacAddress("18:03:73:21:54:f1");
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
