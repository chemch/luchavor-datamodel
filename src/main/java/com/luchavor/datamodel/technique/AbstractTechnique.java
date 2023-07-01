package com.luchavor.datamodel.technique;

import com.luchavor.datamodel.mitre.ModelType;
import com.luchavor.datamodel.mitre.SubModelType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractTechnique implements Technique {
	
	/* functionality implemented by both the the same way */
	private ModelType model;
	private SubModelType subModel;
	private String mitreId; // t code for offensive techniques and d3 id for defensive techniques
	private String tactic;
	private String name;
	private String description;
	private String parentMitreId;
	private int treeLevel;

	/* functionality implemented by both independently */
	public void print() {
		throw new UnsupportedOperationException();
	}
	
	/* functionality implemented by composite only */
	public void add(Technique techniqueBase) {
		throw new UnsupportedOperationException();
	}
	
	public void remove(Technique techniqueBase) {
		throw new UnsupportedOperationException();
	}
	
	public Technique getChild(int i) {
		throw new UnsupportedOperationException();
	}
}