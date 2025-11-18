package com.tmforum.alarm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tmforum.alarm.model.AlarmRefOrValue;
import com.tmforum.alarm.model.Comment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CommentAlarm
 */



public class CommentAlarm {

  private String atType;

  private String atBaseType;

  private String atSchemaLocation;

  private String href;

  private String id;

  /**
   * Current state of the operation task
   */
  public enum StateEnum {
    ACKNOWLEDGED("acknowledged"),
    
    TERMINATED_WITH_ERROR("terminatedWithError"),
    
    IN_PROGRESS("inProgress"),
    
    DONE("done"),
    
    CANCEL("cancel"),
    
    CANCELED("canceled");

    private String value;

    StateEnum(String value) {
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
    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StateEnum state;

  private Comment comment;

  @Valid
  private List<@Valid AlarmRefOrValue> alarmPattern = new ArrayList<>();

  @Valid
  private List<@Valid AlarmRefOrValue> commentedAlarm = new ArrayList<>();

  public CommentAlarm() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CommentAlarm(String atType) {
    this.atType = atType;
  }

  public CommentAlarm atType(String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return atType
   */
  @NotNull 
  @Schema(name = "@type", description = "When sub-classing, this defines the sub-class Extensible name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("@type")
  public String getAtType() {
    return atType;
  }

  public void setAtType(String atType) {
    this.atType = atType;
  }

  public CommentAlarm atBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return atBaseType
   */
  
  @Schema(name = "@baseType", description = "When sub-classing, this defines the super-class", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@baseType")
  public String getAtBaseType() {
    return atBaseType;
  }

  public void setAtBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
  }

  public CommentAlarm atSchemaLocation(String atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return atSchemaLocation
   */
  
  @Schema(name = "@schemaLocation", description = "A URI to a JSON-Schema file that defines additional attributes and relationships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@schemaLocation")
  public String getAtSchemaLocation() {
    return atSchemaLocation;
  }

  public void setAtSchemaLocation(String atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
  }

  public CommentAlarm href(String href) {
    this.href = href;
    return this;
  }

  /**
   * A reference to the task
   * @return href
   */
  
  @Schema(name = "href", description = "A reference to the task", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public CommentAlarm id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier of the task
   * @return id
   */
  
  @Schema(name = "id", description = "The identifier of the task", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CommentAlarm state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * Current state of the operation task
   * @return state
   */
  
  @Schema(name = "state", description = "Current state of the operation task", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public CommentAlarm comment(Comment comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
   */
  @Valid 
  @Schema(name = "comment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comment")
  public Comment getComment() {
    return comment;
  }

  public void setComment(Comment comment) {
    this.comment = comment;
  }

  public CommentAlarm alarmPattern(List<@Valid AlarmRefOrValue> alarmPattern) {
    this.alarmPattern = alarmPattern;
    return this;
  }

  public CommentAlarm addAlarmPatternItem(AlarmRefOrValue alarmPatternItem) {
    if (this.alarmPattern == null) {
      this.alarmPattern = new ArrayList<>();
    }
    this.alarmPattern.add(alarmPatternItem);
    return this;
  }

  /**
   * Alarm patterns to match target alarms. An alarm will match if all of the sttributes in any of the patterns compare equal to those attributes of the alarm.
   * @return alarmPattern
   */
  @Valid 
  @Schema(name = "alarmPattern", description = "Alarm patterns to match target alarms. An alarm will match if all of the sttributes in any of the patterns compare equal to those attributes of the alarm.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alarmPattern")
  public List<@Valid AlarmRefOrValue> getAlarmPattern() {
    return alarmPattern;
  }

  public void setAlarmPattern(List<@Valid AlarmRefOrValue> alarmPattern) {
    this.alarmPattern = alarmPattern;
  }

  public CommentAlarm commentedAlarm(List<@Valid AlarmRefOrValue> commentedAlarm) {
    this.commentedAlarm = commentedAlarm;
    return this;
  }

  public CommentAlarm addCommentedAlarmItem(AlarmRefOrValue commentedAlarmItem) {
    if (this.commentedAlarm == null) {
      this.commentedAlarm = new ArrayList<>();
    }
    this.commentedAlarm.add(commentedAlarmItem);
    return this;
  }

  /**
   * The successfully commented alarms
   * @return commentedAlarm
   */
  @Valid 
  @Schema(name = "commentedAlarm", description = "The successfully commented alarms", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("commentedAlarm")
  public List<@Valid AlarmRefOrValue> getCommentedAlarm() {
    return commentedAlarm;
  }

  public void setCommentedAlarm(List<@Valid AlarmRefOrValue> commentedAlarm) {
    this.commentedAlarm = commentedAlarm;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommentAlarm commentAlarm = (CommentAlarm) o;
    return Objects.equals(this.atType, commentAlarm.atType) &&
        Objects.equals(this.atBaseType, commentAlarm.atBaseType) &&
        Objects.equals(this.atSchemaLocation, commentAlarm.atSchemaLocation) &&
        Objects.equals(this.href, commentAlarm.href) &&
        Objects.equals(this.id, commentAlarm.id) &&
        Objects.equals(this.state, commentAlarm.state) &&
        Objects.equals(this.comment, commentAlarm.comment) &&
        Objects.equals(this.alarmPattern, commentAlarm.alarmPattern) &&
        Objects.equals(this.commentedAlarm, commentAlarm.commentedAlarm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, href, id, state, comment, alarmPattern, commentedAlarm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentAlarm {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    alarmPattern: ").append(toIndentedString(alarmPattern)).append("\n");
    sb.append("    commentedAlarm: ").append(toIndentedString(commentedAlarm)).append("\n");
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

