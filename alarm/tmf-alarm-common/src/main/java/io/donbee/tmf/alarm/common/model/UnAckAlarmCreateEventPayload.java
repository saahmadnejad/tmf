package io.donbee.tmf.alarm.common.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * UnAckAlarmCreateEventPayload generic structure
 */

@Schema(name = "UnAckAlarmCreateEventPayload", description = "UnAckAlarmCreateEventPayload generic structure")

public class UnAckAlarmCreateEventPayload {

  private UnAckAlarm unAckAlarm;

  public UnAckAlarmCreateEventPayload unAckAlarm(UnAckAlarm unAckAlarm) {
    this.unAckAlarm = unAckAlarm;
    return this;
  }

  /**
   * Get unAckAlarm
   * @return unAckAlarm
   */
  @Valid 
  @Schema(name = "unAckAlarm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unAckAlarm")
  public UnAckAlarm getUnAckAlarm() {
    return unAckAlarm;
  }

  public void setUnAckAlarm(UnAckAlarm unAckAlarm) {
    this.unAckAlarm = unAckAlarm;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnAckAlarmCreateEventPayload unAckAlarmCreateEventPayload = (UnAckAlarmCreateEventPayload) o;
    return Objects.equals(this.unAckAlarm, unAckAlarmCreateEventPayload.unAckAlarm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unAckAlarm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnAckAlarmCreateEventPayload {\n");
    sb.append("    unAckAlarm: ").append(toIndentedString(unAckAlarm)).append("\n");
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

