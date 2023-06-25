package com.luchavor.datamodel.technique;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
public class CompositeTechnique extends TechniqueBase {

	private List<Technique> techniques = new ArrayList<Technique>();
	
	// custom print
	public void print() {
		// print the composites to string
		System.out.print(this.toString());
		System.out.print("\nChildren:\n");
		// then print the childrens to string
		for (Technique technique : techniques) {
			technique.print();
		}
	}
	
	public void add(Technique technique) {
		techniques.add(technique);
	}
	
	public void remove(Technique technique) {
		techniques.remove(technique);
	}
	
	public Technique getChild(int i) {
		return techniques.get(i);
	}
	
	@Override
	public String toString() {
		return "mitreId: " + this.getMitreId() + ", tactic: " + this.getTactic() + ", name: " + this.getName() + ", description: " + this.getDescription();
	}
}