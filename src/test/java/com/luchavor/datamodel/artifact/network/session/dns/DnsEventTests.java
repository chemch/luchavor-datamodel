package com.luchavor.datamodel.artifact.network.session.dns;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.luchavor.datamodel.artifact.network.common.NetworkProtocolType;
import com.luchavor.datamodel.util.DataTypeConverter;

@SpringBootTest
@ActiveProfiles("test")
public class DnsEventTests {
	public List<DnsEvent> getDnsEventList1() {
		// test dns list object
		List<DnsEvent> dnsEvents = new ArrayList<>();
		// test dns object
		DnsEvent event = new DnsEventImpl();
		// populate object attributes
		event.setTimestamp(DataTypeConverter.convertDoubleEpochTimestamp(1689560080.32542));
		event.setUid("Cn4DGr4nzlVfRjIZe7");
		event.setOriginatorIp("172.23.250.132");
		event.setOriginatorPort(36651);
		event.setResponderIp("172.23.240.1");
		event.setResponderPort(53);
		event.setNetworkProtocolType(NetworkProtocolType.UDP);
		event.setTransactionId(63055);
		event.setRoundTripTime(null);
		event.setQuery("132.250.23.172.in-addr.arpa");
		event.setQclass(1);
		event.setQclassName("C_INTERNET");
		event.setQtype(12);
		event.setQtypeName("PTR");
		event.setRcode(null);
		event.setRcodeName(null);
		event.setAuthoritativeAnswerFlag(false);
		event.setTruncationFlag(false);
		event.setRecursionDesiredFlag(true);
		event.setRecursionAvailableFlag(false);
		event.setDnssecFlag(false);
		event.setAnswers(null);
		event.setTtls(null);
		event.setRejectedFlag(false);
		event.setAuthoritativeResponses(null);
		event.setAdditionalResponses(null);
		event.setOriginalQuery("132.250.23.172.in-addr.arpa");
		// add events to list
		dnsEvents.add(event);
		// return value
		return(dnsEvents);
	}
	
	@Test
    void shouldNotBeNull() throws Exception {
		DnsEvent dnsEvent1 = getDnsEventList1().get(0);
		// confirm object is not null
		assertNotNull(dnsEvent1);
	}
}