package io.donbee.tmf.alarm.common.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ClearAlarmCreateEventPayload generic structure
 */

@Schema(name = "ClearAlarmCreateEventPayload", description = "ClearAlarmCreateEventPayload generic structure")

public class ClearAlarmCreateEventPayload {

  private ClearAlarm clearAlarm;

  public ClearAlarmCreateEventPayload clearAlarm(ClearAlarm clearAlarm) {
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
    ClearAlarmCreateEventPayload clearAlarmCreateEventPayload = (ClearAlarmCreateEventPayload) o;
    return Objects.equals(this.clearAlarm, clearAlarmCreateEventPayload.clearAlarm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clearAlarm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClearAlarmCreateEventPayload {\n");
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

