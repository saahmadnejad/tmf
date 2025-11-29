package io.donbee.tmf.alarm.common.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * UnGroupAlarmStateChangeEventPayload generic structure
 */

@Schema(name = "UnGroupAlarmStateChangeEventPayload", description = "UnGroupAlarmStateChangeEventPayload generic structure")

public class UnGroupAlarmStateChangeEventPayload {

  private UnGroupAlarm unGroupAlarm;

  public UnGroupAlarmStateChangeEventPayload unGroupAlarm(UnGroupAlarm unGroupAlarm) {
    this.unGroupAlarm = unGroupAlarm;
    return this;
  }

  /**
   * Get unGroupAlarm
   * @return unGroupAlarm
   */
  @Valid 
  @Schema(name = "unGroupAlarm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unGroupAlarm")
  public UnGroupAlarm getUnGroupAlarm() {
    return unGroupAlarm;
  }

  public void setUnGroupAlarm(UnGroupAlarm unGroupAlarm) {
    this.unGroupAlarm = unGroupAlarm;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnGroupAlarmStateChangeEventPayload unGroupAlarmStateChangeEventPayload = (UnGroupAlarmStateChangeEventPayload) o;
    return Objects.equals(this.unGroupAlarm, unGroupAlarmStateChangeEventPayload.unGroupAlarm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unGroupAlarm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnGroupAlarmStateChangeEventPayload {\n");
    sb.append("    unGroupAlarm: ").append(toIndentedString(unGroupAlarm)).append("\n");
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

