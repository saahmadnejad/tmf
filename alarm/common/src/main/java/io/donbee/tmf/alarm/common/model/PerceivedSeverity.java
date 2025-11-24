package io.donbee.tmf.alarm.common.model;

import com.fasterxml.jackson.annotation.JsonValue;


import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Lists the possible severities that can be allocated to an Alarm. The values are consistent with ITU-T Recommendation X.733. Once an alarm has been cleared, its perceived severity is set to 'cleared' and can no longer be set.
 */


public enum PerceivedSeverity {
  
  CRITICAL("critical"),
  
  MAJOR("major"),
  
  MINOR("minor"),
  
  WARNING("warning"),
  
  INDETERMINATE("indeterminate"),
  
  CLEARED("cleared");

  private String value;

  PerceivedSeverity(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PerceivedSeverity fromValue(String value) {
    for (PerceivedSeverity b : PerceivedSeverity.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

