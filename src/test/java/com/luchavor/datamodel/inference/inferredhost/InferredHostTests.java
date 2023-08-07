package com.luchavor.datamodel.inference.inferredhost;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import com.luchavor.datamodel.inference.inferredHost.InferredHost;
import com.luchavor.datamodel.inference.inferredHost.InferredHostImpl;

@SpringBootTest
@ActiveProfiles("test")
public class InferredHostTests {
	public InferredHost getInferredHost1() {
		InferredHost host = new InferredHostImpl();
		// populate object attributes
		host.setHostIp("192.168.1.1");
		host.setHostName("myPc");
		host.setMacAddress("20:e5:2a:b6:93:f1");
		return(host);
	}
	
	@Test
    void shouldNotBeNull() throws Exception {
		InferredHost host1 = getInferredHost1();
		// confirm object is not null
		assertNotNull(host1);
	}
}