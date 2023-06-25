package com.luchavor.datamodel.technique;

public class SingleTechnique extends TechniqueBase {
	
	// custom print
	public void print() {
		System.out.print(this.toString());
	}
	
	@Override
	public String toString() {
		return "mitreId: " + this.getMitreId() + ", tactic: " + this.getTactic() + ", name: " + this.getName() + ", description: " + this.getDescription();
	}
}