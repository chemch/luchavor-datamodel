package com.luchavor.datamodel.finding.state;

import com.luchavor.datamodel.finding.Finding;
import lombok.Data;

@Data
public class RefutedFindingState<F> implements FindingState {
	Finding<F> finding;
	
	// finding transition calc
	public void calculateFindingState() {
		finding.setCurrentFindingState(finding.getRefutedFindingState());
	}
}