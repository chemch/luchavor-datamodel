package com.luchavor.datamodel.event;

import java.time.LocalDateTime;

import com.luchavor.datamodel.technique.AbstractTechnique;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractEvent implements Event {
	private LocalDateTime timestamp;
	private EventType eventType;
}