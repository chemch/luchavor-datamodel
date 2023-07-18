package com.luchavor.datamodel.util;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DataTypeConverter {
	public static LocalDateTime convertEpochTimestamp(Double timestamp) {
		Long longTimestamp = Math.round(timestamp);
		LocalDateTime convertedTimestamp = Instant.ofEpochMilli(longTimestamp).atZone(ZoneId.systemDefault()).toLocalDateTime();
		return convertedTimestamp;
	}
}