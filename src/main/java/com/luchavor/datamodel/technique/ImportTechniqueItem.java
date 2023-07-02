package com.luchavor.datamodel.technique;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class ImportTechniqueItem  extends AbstractTechnique {
	private TechniqueType type;
}