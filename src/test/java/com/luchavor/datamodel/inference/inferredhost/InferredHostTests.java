package com.luchavor.datamodel.inference.inferredhost;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.luchavor.datamodel.inference.inferredHost.InferredHost;
import com.luchavor.datamodel.inference.inferredHost.InferredHostImpl;
import com.luchavor.datamodel.util.transform.attribute.AttributeTypeTransformer;

@SpringBootTest
@ActiveProfiles("test")
public class InferredHostTests {
	public List<InferredHost> getInferredHostList1() {
		// test list object
		List<InferredHost> rv = new ArrayList<>();
		// test object
		InferredHost host = new InferredHostImpl();
		// populate object attributes
		host.setHostIp("192.168.1.1");
		host.setHostName("myPc");
		host.setMacAddress("20:e5:2a:b6:93:f1");
		// add values to list
		rv.add(host);
		// return value
		return(rv);
	}
	
	@Test
    void shouldNotBeNull() throws Exception {
		InferredHost host1 = getInferredHostList1().get(0);
		// confirm object is not null
		assertNotNull(host1);
	}
}