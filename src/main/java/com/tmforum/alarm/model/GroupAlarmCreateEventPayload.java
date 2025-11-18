package com.tmforum.alarm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tmforum.alarm.model.GroupAlarm;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * GroupAlarmCreateEventPayload generic structure
 */

@Schema(name = "GroupAlarmCreateEventPayload", description = "GroupAlarmCreateEventPayload generic structure")

public class GroupAlarmCreateEventPayload {

  private GroupAlarm groupAlarm;

  public GroupAlarmCreateEventPayload groupAlarm(GroupAlarm groupAlarm) {
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
    GroupAlarmCreateEventPayload groupAlarmCreateEventPayload = (GroupAlarmCreateEventPayload) o;
    return Objects.equals(this.groupAlarm, groupAlarmCreateEventPayload.groupAlarm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupAlarm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupAlarmCreateEventPayload {\n");
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

