package com.luchavor.datamodel.techniquegroup;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.neo4j.core.schema.Relationship;
import com.luchavor.datamodel.technique.AbstractTechnique;
import com.luchavor.datamodel.technique.Technique;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
public class TechniqueGroupImpl extends AbstractTechnique {
		
	// neo4j list of child techniques
	@Relationship(type = "CONTAINS")
	private List<Technique> techniques = new ArrayList<Technique>();
	
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