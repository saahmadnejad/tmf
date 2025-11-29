package io.donbee.tmf.alarm.common.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * CommentAlarmStateChangeEventPayload generic structure
 */

@Schema(name = "CommentAlarmStateChangeEventPayload", description = "CommentAlarmStateChangeEventPayload generic structure")

public class CommentAlarmStateChangeEventPayload {

  private CommentAlarm commentAlarm;

  public CommentAlarmStateChangeEventPayload commentAlarm(CommentAlarm commentAlarm) {
    this.commentAlarm = commentAlarm;
    return this;
  }

  /**
   * Get commentAlarm
   * @return commentAlarm
   */
  @Valid 
  @Schema(name = "commentAlarm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("commentAlarm")
  public CommentAlarm getCommentAlarm() {
    return commentAlarm;
  }

  public void setCommentAlarm(CommentAlarm commentAlarm) {
    this.commentAlarm = commentAlarm;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommentAlarmStateChangeEventPayload commentAlarmStateChangeEventPayload = (CommentAlarmStateChangeEventPayload) o;
    return Objects.equals(this.commentAlarm, commentAlarmStateChangeEventPayload.commentAlarm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commentAlarm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentAlarmStateChangeEventPayload {\n");
    sb.append("    commentAlarm: ").append(toIndentedString(commentAlarm)).append("\n");
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

