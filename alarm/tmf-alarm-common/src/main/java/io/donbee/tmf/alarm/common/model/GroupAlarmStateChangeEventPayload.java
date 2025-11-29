package io.donbee.tmf.alarm.common.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * GroupAlarmStateChangeEventPayload generic structure
 */

@Schema(name = "GroupAlarmStateChangeEventPayload", description = "GroupAlarmStateChangeEventPayload generic structure")

public class GroupAlarmStateChangeEventPayload {

  private GroupAlarm groupAlarm;

  public GroupAlarmStateChangeEventPayload groupAlarm(GroupAlarm groupAlarm) {
    this.groupAlarm = groupAlarm;
    return this;
  }

  /**
   * Get groupAlarm
   * @return groupAlarm
   */
  @Valid 
  @Schema(name = "groupAlarm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groupAlarm")
  public GroupAlarm getGroupAlarm() {
    return groupAlarm;
  }

  public void setGroupAlarm(GroupAlarm groupAlarm) {
    this.groupAlarm = groupAlarm;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupAlarmStateChangeEventPayload groupAlarmStateChangeEventPayload = (GroupAlarmStateChangeEventPayload) o;
    return Objects.equals(this.groupAlarm, groupAlarmStateChangeEventPayload.groupAlarm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupAlarm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupAlarmStateChangeEventPayload {\n");
    sb.append("    groupAlarm: ").append(toIndentedString(groupAlarm)).append("\n");
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

