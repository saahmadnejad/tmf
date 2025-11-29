package io.donbee.tmf.alarm.common.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * AlarmCreateEventPayload generic structure
 */

@Schema(name = "AlarmCreateEventPayload", description = "AlarmCreateEventPayload generic structure")

public class AlarmCreateEventPayload {

  private Alarm alarm;

  public AlarmCreateEventPayload alarm(Alarm alarm) {
    this.alarm = alarm;
    return this;
  }

  /**
   * Get alarm
   * @return alarm
   */
  @Valid 
  @Schema(name = "alarm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alarm")
  public Alarm getAlarm() {
    return alarm;
  }

  public void setAlarm(Alarm alarm) {
    this.alarm = alarm;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlarmCreateEventPayload alarmCreateEventPayload = (AlarmCreateEventPayload) o;
    return Objects.equals(this.alarm, alarmCreateEventPayload.alarm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alarm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlarmCreateEventPayload {\n");
    sb.append("    alarm: ").append(toIndentedString(alarm)).append("\n");
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

