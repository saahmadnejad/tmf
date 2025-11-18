package com.tmforum.alarm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tmforum.alarm.model.ClearAlarm;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ClearAlarmStateChangeEventPayload generic structure
 */

@Schema(name = "ClearAlarmStateChangeEventPayload", description = "ClearAlarmStateChangeEventPayload generic structure")

public class ClearAlarmStateChangeEventPayload {

  private ClearAlarm clearAlarm;

  public ClearAlarmStateChangeEventPayload clearAlarm(ClearAlarm clearAlarm) {
    this.clearAlarm = clearAlarm;
    return this;
  }

  /**
   * Get clearAlarm
   * @return clearAlarm
   */
  @Valid 
  @Schema(name = "clearAlarm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clearAlarm")
  public ClearAlarm getClearAlarm() {
    return clearAlarm;
  }

  public void setClearAlarm(ClearAlarm clearAlarm) {
    this.clearAlarm = clearAlarm;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClearAlarmStateChangeEventPayload clearAlarmStateChangeEventPayload = (ClearAlarmStateChangeEventPayload) o;
    return Objects.equals(this.clearAlarm, clearAlarmStateChangeEventPayload.clearAlarm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clearAlarm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClearAlarmStateChangeEventPayload {\n");
    sb.append("    clearAlarm: ").append(toIndentedString(clearAlarm)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

