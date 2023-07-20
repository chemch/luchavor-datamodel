package com.test.luchavor.datamodel.util;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DataTypeConverter {
	public static LocalDateTime convertDoubleEpochTimestamp(Double timestamp) {
		Long longTimestamp = Math.round(timestamp);
		return convertLongEpochTimestamp(longTimestamp);
	}
	
	public static LocalDateTime convertLongEpochTimestamp(Long longTimestamp) {
		LocalDateTime convertedTimestamp = Instant.ofEpochMilli(longTimestamp).atZone(ZoneId.systemDefault()).toLocalDateTime();
		return convertedTimestamp;
	}
}