package com.luchavor.datamodel.technique;

import com.luchavor.datamodel.mitre.ModelType;
import com.luchavor.datamodel.mitre.SubModelType;

public interface Technique {
	
	// model is either ATTACK or DEFEND model
	public ModelType getModel();
	public void setModel(ModelType model);
	
	// sub model is ICS or Mobile for ATTACK
	public SubModelType getSubModel();
	public void setSubModel(SubModelType subModel);

	// mitre id is either t code for ATTACK or D3 id for DEFEND
	public String getMitreId();
	public void setMitreId(String id);

	// tactic getters and setters
	public String getTactic();
	public void setTactic(String tactic);
	
	// technique name
	public String getName();
	public void setName( String name );
	
	// technique description
	public String getDescription();
	public void setDescription( String description );
	
	// parent mitre id is either t code for ATT&CK or D3 id for D3FEND
	public String getParentMitreId();
	public void setParentMitreId(String id);
	
	// tree level is the level in the tree where this technique sits 
	public int getTreeLevel();
	public void setTreeLevel(int level);

	/* functionality implemented by both single and composity independently */
	public void print();
	
	/* functionality implemented by composite only */
	public void add(Technique technique);
	public void remove(Technique technique);
	public Technique getChild(int i);
}