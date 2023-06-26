package com.luchavor.datamodel.technique;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InputTechnique {
	private String model;
	private String mitreId;
	private String tactic;
	private String name;
	private String description;
	private String parentMitreId;
	private String treeLevel;
	private String type;
}