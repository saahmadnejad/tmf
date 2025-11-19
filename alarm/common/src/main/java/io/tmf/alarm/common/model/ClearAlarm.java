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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ClearAlarm
 */



public class ClearAlarm {

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

  private String clearSystemId;

  private String clearUserId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime alarmClearedTime;

  @Valid
  private List<@Valid AlarmRefOrValue> alarmPattern = new ArrayList<>();

  @Valid
  private List<@Valid AlarmRefOrValue> clearedAlarm = new ArrayList<>();

  public ClearAlarm() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ClearAlarm(String atType) {
    this.atType = atType;
  }

  public ClearAlarm atType(String atType) {
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

  public ClearAlarm atBaseType(String atBaseType) {
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

  public ClearAlarm atSchemaLocation(String atSchemaLocation) {
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

  public ClearAlarm href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Hyperlink reference
   * @return href
   */
  
  @Schema(name = "href", description = "Hyperlink reference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public ClearAlarm id(String id) {
    this.id = id;
    return this;
  }

  /**
   * unique identifier
   * @return id
   */
  
  @Schema(name = "id", description = "unique identifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ClearAlarm state(StateEnum state) {
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

  public ClearAlarm clearSystemId(String clearSystemId) {
    this.clearSystemId = clearSystemId;
    return this;
  }

  /**
   * Name of the clearing system
   * @return clearSystemId
   */
  
  @Schema(name = "clearSystemId", description = "Name of the clearing system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clearSystemId")
  public String getClearSystemId() {
    return clearSystemId;
  }

  public void setClearSystemId(String clearSystemId) {
    this.clearSystemId = clearSystemId;
  }

  public ClearAlarm clearUserId(String clearUserId) {
    this.clearUserId = clearUserId;
    return this;
  }

  /**
   * Name of the clearing user
   * @return clearUserId
   */
  
  @Schema(name = "clearUserId", description = "Name of the clearing user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clearUserId")
  public String getClearUserId() {
    return clearUserId;
  }

  public void setClearUserId(String clearUserId) {
    this.clearUserId = clearUserId;
  }

  public ClearAlarm alarmClearedTime(OffsetDateTime alarmClearedTime) {
    this.alarmClearedTime = alarmClearedTime;
    return this;
  }

  /**
   * Time of the alarm clearing
   * @return alarmClearedTime
   */
  @Valid 
  @Schema(name = "alarmClearedTime", description = "Time of the alarm clearing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alarmClearedTime")
  public OffsetDateTime getAlarmClearedTime() {
    return alarmClearedTime;
  }

  public void setAlarmClearedTime(OffsetDateTime alarmClearedTime) {
    this.alarmClearedTime = alarmClearedTime;
  }

  public ClearAlarm alarmPattern(List<@Valid AlarmRefOrValue> alarmPattern) {
    this.alarmPattern = alarmPattern;
    return this;
  }

  public ClearAlarm addAlarmPatternItem(AlarmRefOrValue alarmPatternItem) {
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

  public ClearAlarm clearedAlarm(List<@Valid AlarmRefOrValue> clearedAlarm) {
    this.clearedAlarm = clearedAlarm;
    return this;
  }

  public ClearAlarm addClearedAlarmItem(AlarmRefOrValue clearedAlarmItem) {
    if (this.clearedAlarm == null) {
      this.clearedAlarm = new ArrayList<>();
    }
    this.clearedAlarm.add(clearedAlarmItem);
    return this;
  }

  /**
   * The successfully cleared alarms
   * @return clearedAlarm
   */
  @Valid 
  @Schema(name = "clearedAlarm", description = "The successfully cleared alarms", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clearedAlarm")
  public List<@Valid AlarmRefOrValue> getClearedAlarm() {
    return clearedAlarm;
  }

  public void setClearedAlarm(List<@Valid AlarmRefOrValue> clearedAlarm) {
    this.clearedAlarm = clearedAlarm;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClearAlarm clearAlarm = (ClearAlarm) o;
    return Objects.equals(this.atType, clearAlarm.atType) &&
        Objects.equals(this.atBaseType, clearAlarm.atBaseType) &&
        Objects.equals(this.atSchemaLocation, clearAlarm.atSchemaLocation) &&
        Objects.equals(this.href, clearAlarm.href) &&
        Objects.equals(this.id, clearAlarm.id) &&
        Objects.equals(this.state, clearAlarm.state) &&
        Objects.equals(this.clearSystemId, clearAlarm.clearSystemId) &&
        Objects.equals(this.clearUserId, clearAlarm.clearUserId) &&
        Objects.equals(this.alarmClearedTime, clearAlarm.alarmClearedTime) &&
        Objects.equals(this.alarmPattern, clearAlarm.alarmPattern) &&
        Objects.equals(this.clearedAlarm, clearAlarm.clearedAlarm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, href, id, state, clearSystemId, clearUserId, alarmClearedTime, alarmPattern, clearedAlarm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClearAlarm {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    clearSystemId: ").append(toIndentedString(clearSystemId)).append("\n");
    sb.append("    clearUserId: ").append(toIndentedString(clearUserId)).append("\n");
    sb.append("    alarmClearedTime: ").append(toIndentedString(alarmClearedTime)).append("\n");
    sb.append("    alarmPattern: ").append(toIndentedString(alarmPattern)).append("\n");
    sb.append("    clearedAlarm: ").append(toIndentedString(clearedAlarm)).append("\n");
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

