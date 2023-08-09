package com.luchavor.datamodel.technique;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class AttackTechniqueTests {	
	
	public AttackTechnique getAttackTechnique1() {
		AttackTechnique attackTechnique = new AttackTechnique();
		attackTechnique.setDescription("Test");
		return attackTechnique;
	}
	
	@Test
    void shouldNotBeNull() throws Exception {
		AttackTechnique technique1 = getAttackTechnique1();
		// confirm object is not null
		assertNotNull(technique1);
	}
}