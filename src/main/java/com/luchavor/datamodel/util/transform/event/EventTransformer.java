package com.luchavor.datamodel.util.transform.event;

public class EventTransformer {
	
	public Boolean toBoolean(String value) {
		// sanitize value
		String converted = sanitize(value);
		// create rv
		Boolean rv;
		// check for specified true or false values
		switch(converted) {
			case "T":  // true
				rv = true;
				break;
			case "1":  // true
				rv = true;
				break;
			// false identifiers
			case "F":  // false
				rv = false;
				break;
			case "0":  // false
				rv = false;
				break;
			default: // default to using existing value
				rv = null;
				break;
		}
		// return value
		return(rv);
	}
	
	public String sanitize(String value) {
		// make a copy
		String rv = value;
		// perform cleaning actions
		rv = transformNull(rv);
		// return value
		return(rv);
	}
	
	private String transformNull(String value) {
		String rv;
		// check for specified null values
		switch(value) {
			case "-":  // translate - to null
				rv = null;
				break;
			default: // default to using existing value
				rv = value;
				break;
		}
		// return value
		return(rv);
	}
}