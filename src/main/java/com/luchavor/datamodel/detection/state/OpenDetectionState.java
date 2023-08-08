package com.luchavor.datamodel.detection.state;

import java.util.UUID;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import com.luchavor.datamodel.detection.Detection;

import lombok.Data;

@Data
@Node("OpenDetectionState")
public class OpenDetectionState implements DetectionState {
	/* neo4j id */
	@Id @GeneratedValue 
	private UUID id;
	
	Detection<?> detection;
	
	// detection transition calc
	public void calculateDetectionState() {
		detection.setCurrentDetectionState(detection.getOpenDetectionState());
	}
}