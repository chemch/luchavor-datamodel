package com.luchavor.datamodel.technique;

import java.util.UUID;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class TechniqueItem extends AbstractTechnique {
	// neo4j id
	@Id @GeneratedValue private UUID id;
	
	// custom print
	public void print() {
		System.out.print(this.toString());
	}
	
	@Override
	public String toString() {
		return "mitreId: " + this.getMitreId() + ", tactic: " + this.getTactic() + ", name: " + this.getName() + ", description: " + this.getDescription();
	}
}