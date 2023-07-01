package com.luchavor.datamodel.event;

import java.time.LocalDateTime;

public interface Event {
	// unix timestamp
	public LocalDateTime getTimestamp();
	public void setTimestamp(LocalDateTime timestamp);
}