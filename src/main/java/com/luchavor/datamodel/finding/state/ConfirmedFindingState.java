package com.luchavor.datamodel.finding.state;

import com.luchavor.datamodel.finding.Finding;

import lombok.Data;

@Data
public class ConfirmedFindingState<F, D, I, A> implements FindingState {
	Finding<F, D, I, A> finding;
	
	// finding transition calc
	public void calculateFindingState() {
		finding.setCurrentFindingState(finding.getConfirmedFindingState());
	}
}