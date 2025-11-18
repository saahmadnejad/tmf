package com.tmforum.alarm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * ClearAlarmFVO
 */



public class ClearAlarmFVO {

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

  public ClearAlarmFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ClearAlarmFVO(String atType, String clearSystemId, String clearUserId, OffsetDateTime alarmClearedTime, List<@Valid AlarmRefOrValue> alarmPattern) {
    this.atType = atType;
    this.clearSystemId = clearSystemId;
    this.clearUserId = clearUserId;
    this.alarmClearedTime = alarmClearedTime;
    this.alarmPattern = alarmPattern;
  }

  public ClearAlarmFVO atType(String atType) {
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

  public ClearAlarmFVO atBaseType(String atBaseType) {
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

  public ClearAlarmFVO atSchemaLocation(String atSchemaLocation) {
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

  public ClearAlarmFVO href(String href) {
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

  public ClearAlarmFVO id(String id) {
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

  public ClearAlarmFVO state(StateEnum state) {
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

  public ClearAlarmFVO clearSystemId(String clearSystemId) {
    this.clearSystemId = clearSystemId;
    return this;
  }

  /**
   * Name of the clearing system
   * @return clearSystemId
   */
  @NotNull 
  @Schema(name = "clearSystemId", description = "Name of the clearing system", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("clearSystemId")
  public String getClearSystemId() {
    return clearSystemId;
  }

  public void setClearSystemId(String clearSystemId) {
    this.clearSystemId = clearSystemId;
  }

  public ClearAlarmFVO clearUserId(String clearUserId) {
    this.clearUserId = clearUserId;
    return this;
  }

  /**
   * Name of the clearing user
   * @return clearUserId
   */
  @NotNull 
  @Schema(name = "clearUserId", description = "Name of the clearing user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("clearUserId")
  public String getClearUserId() {
    return clearUserId;
  }

  public void setClearUserId(String clearUserId) {
    this.clearUserId = clearUserId;
  }

  public ClearAlarmFVO alarmClearedTime(OffsetDateTime alarmClearedTime) {
    this.alarmClearedTime = alarmClearedTime;
    return this;
  }

  /**
   * Time of the alarm clearing
   * @return alarmClearedTime
   */
  @NotNull @Valid 
  @Schema(name = "alarmClearedTime", description = "Time of the alarm clearing", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("alarmClearedTime")
  public OffsetDateTime getAlarmClearedTime() {
    return alarmClearedTime;
  }

  public void setAlarmClearedTime(OffsetDateTime alarmClearedTime) {
    this.alarmClearedTime = alarmClearedTime;
  }

  public ClearAlarmFVO alarmPattern(List<@Valid AlarmRefOrValue> alarmPattern) {
    this.alarmPattern = alarmPattern;
    return this;
  }

  public ClearAlarmFVO addAlarmPatternItem(AlarmRefOrValue alarmPatternItem) {
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
  @NotNull @Valid 
  @Schema(name = "alarmPattern", description = "Alarm patterns to match target alarms. An alarm will match if all of the sttributes in any of the patterns compare equal to those attributes of the alarm.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("alarmPattern")
  public List<@Valid AlarmRefOrValue> getAlarmPattern() {
    return alarmPattern;
  }

  public void setAlarmPattern(List<@Valid AlarmRefOrValue> alarmPattern) {
    this.alarmPattern = alarmPattern;
  }

  public ClearAlarmFVO clearedAlarm(List<@Valid AlarmRefOrValue> clearedAlarm) {
    this.clearedAlarm = clearedAlarm;
    return this;
  }

  public ClearAlarmFVO addClearedAlarmItem(AlarmRefOrValue clearedAlarmItem) {
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
    ClearAlarmFVO clearAlarmFVO = (ClearAlarmFVO) o;
    return Objects.equals(this.atType, clearAlarmFVO.atType) &&
        Objects.equals(this.atBaseType, clearAlarmFVO.atBaseType) &&
        Objects.equals(this.atSchemaLocation, clearAlarmFVO.atSchemaLocation) &&
        Objects.equals(this.href, clearAlarmFVO.href) &&
        Objects.equals(this.id, clearAlarmFVO.id) &&
        Objects.equals(this.state, clearAlarmFVO.state) &&
        Objects.equals(this.clearSystemId, clearAlarmFVO.clearSystemId) &&
        Objects.equals(this.clearUserId, clearAlarmFVO.clearUserId) &&
        Objects.equals(this.alarmClearedTime, clearAlarmFVO.alarmClearedTime) &&
        Objects.equals(this.alarmPattern, clearAlarmFVO.alarmPattern) &&
        Objects.equals(this.clearedAlarm, clearAlarmFVO.clearedAlarm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, href, id, state, clearSystemId, clearUserId, alarmClearedTime, alarmPattern, clearedAlarm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClearAlarmFVO {\n");
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

