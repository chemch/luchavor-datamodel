package com.luchavor.datamodel.artifact.network.session.smtp;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.luchavor.datamodel.util.FieldTypeConverter;

@SpringBootTest
@ActiveProfiles("test")
public class SmtpEventTests {
	public List<SmtpEvent> getSmtpEventList1() {
		// test list object
		List<SmtpEvent> events = new ArrayList<>();
		// test object
		SmtpEvent event = new SmtpEventImpl();
		// populate object attributes
		event.setTimestamp(FieldTypeConverter.convertDoubleEpochTimestamp(1690325509.19939));
		event.setCuid("COcRZA48xSZuGRwaR3");
		event.setOriginatorIp("10.10.1.4");
		event.setOriginatorPort(1470);
		event.setResponderIp("74.53.140.153");
		event.setResponderPort(25);
		event.setTransactionDepth(1);
		event.setHelo("GP");
		event.setMailFrom("gurpartap@patriots.in");
		event.setReceiptTo("raj_deol2002in@yahoo.co.in");
		event.setDateHeader("Mon, 5 Oct 2009 11:36:07 +0530");
		event.setFrom("Gurpartap Singh <gurpartap@patriots.in>");
		event.setTo("<raj_deol2002in@yahoo.co.in>");
		event.setCc(null);
		event.setReplyTo(null);
		event.setMsgId("<000301ca4581$ef9e57f0$cedb07d0$@in>");
		event.setInReplyTo(null);
		event.setSubject("SMTP");
		event.setXOriginatingIp(null);
		event.setFirstReceived(null);
		event.setSecondReceived(null);
		event.setLastReply("250 OK id=1Mugho-0003Dg-Un");
		event.setPath("74.53.140.153,10.10.1.4");
		event.setUserAgent("Microsoft Office Outlook 12.0");
		event.setTlsFlag(false);
		event.setFuids("FDr0wGqPZgxd8Czu2,FuWGVh485tuGqSEqZa,FSQM8Y2JS8OMpgu8Ee");
		event.setIsWebmailFlag(false);
		// add events to list
		events.add(event);
		// return value
		return(events);
	}
	
	@Test
    void shouldNotBeNull() throws Exception {
		SmtpEvent event = getSmtpEventList1().get(0);
		// confirm object is not null
		assertNotNull(event);
	}
}