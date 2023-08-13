package com.luchavor.datamodel.artifact.test;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestArtifact {
	@JsonProperty("testName")
	private String name;
}