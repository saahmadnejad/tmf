package io.donbee.tmf.alarm.common.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * AckAlarmCreateEventPayload generic structure
 */

@Schema(name = "AckAlarmCreateEventPayload", description = "AckAlarmCreateEventPayload generic structure")

public class AckAlarmCreateEventPayload {

  private AckAlarm ackAlarm;

  public AckAlarmCreateEventPayload ackAlarm(AckAlarm ackAlarm) {
    this.ackAlarm = ackAlarm;
    return this;
  }

  /**
   * Get ackAlarm
   * @return ackAlarm
   */
  @Valid 
  @Schema(name = "ackAlarm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ackAlarm")
  public AckAlarm getAckAlarm() {
    return ackAlarm;
  }

  public void setAckAlarm(AckAlarm ackAlarm) {
    this.ackAlarm = ackAlarm;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AckAlarmCreateEventPayload ackAlarmCreateEventPayload = (AckAlarmCreateEventPayload) o;
    return Objects.equals(this.ackAlarm, ackAlarmCreateEventPayload.ackAlarm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ackAlarm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AckAlarmCreateEventPayload {\n");
    sb.append("    ackAlarm: ").append(toIndentedString(ackAlarm)).append("\n");
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

