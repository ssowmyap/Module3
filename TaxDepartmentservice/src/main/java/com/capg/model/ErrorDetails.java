package com.capg.model;

import java.util.Date;

public class ErrorDetails {
		  private long timestamp;
		  private String message;
		  private String details;

		  public long getTimestamp() {
			return timestamp;
		}

		public void setTimestamp(long timestamp) {
			this.timestamp = timestamp;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getDetails() {
			return details;
		}

		public void setDetails(String details) {
			this.details = details;
		}

		public ErrorDetails(long timestamp, String message, String details) {
		    super();
		    this.timestamp = timestamp;
		    this.message = message;
		    this.details = details;
		  }
}


