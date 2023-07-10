package com.luchavor.datamodel.technique;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class TechniqueImpl extends AbstractTechnique {	
	
	@Override
	public String toString() {
		return "mitreId: " + this.getMitreId() + ", tactic: " + this.getTactic() + ", name: " + this.getName() + ", description: " + this.getDescription();
	}
}