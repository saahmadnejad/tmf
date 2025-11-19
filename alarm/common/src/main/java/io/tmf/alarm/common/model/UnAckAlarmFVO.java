package io.tmf.alarm.common.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.tmf.alarm.common.model.AlarmRefOrValue;
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
 * UnAckAlarmFVO
 */



public class UnAckAlarmFVO {

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

  private String ackSystemId;

  private String ackUserId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime ackTime;

  @Valid
  private List<@Valid AlarmRefOrValue> alarmPattern = new ArrayList<>();

  @Valid
  private List<@Valid AlarmRefOrValue> unAckedAlarm = new ArrayList<>();

  public UnAckAlarmFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UnAckAlarmFVO(String atType, String ackSystemId, String ackUserId, List<@Valid AlarmRefOrValue> alarmPattern) {
    this.atType = atType;
    this.ackSystemId = ackSystemId;
    this.ackUserId = ackUserId;
    this.alarmPattern = alarmPattern;
  }

  public UnAckAlarmFVO atType(String atType) {
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

  public UnAckAlarmFVO atBaseType(String atBaseType) {
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

  public UnAckAlarmFVO atSchemaLocation(String atSchemaLocation) {
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

  public UnAckAlarmFVO href(String href) {
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

  public UnAckAlarmFVO id(String id) {
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

  public UnAckAlarmFVO state(StateEnum state) {
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

  public UnAckAlarmFVO ackSystemId(String ackSystemId) {
    this.ackSystemId = ackSystemId;
    return this;
  }

  /**
   * Name of the unacknowledging system
   * @return ackSystemId
   */
  @NotNull 
  @Schema(name = "ackSystemId", description = "Name of the unacknowledging system", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ackSystemId")
  public String getAckSystemId() {
    return ackSystemId;
  }

  public void setAckSystemId(String ackSystemId) {
    this.ackSystemId = ackSystemId;
  }

  public UnAckAlarmFVO ackUserId(String ackUserId) {
    this.ackUserId = ackUserId;
    return this;
  }

  /**
   * Name of the unacknowledging user
   * @return ackUserId
   */
  @NotNull 
  @Schema(name = "ackUserId", description = "Name of the unacknowledging user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ackUserId")
  public String getAckUserId() {
    return ackUserId;
  }

  public void setAckUserId(String ackUserId) {
    this.ackUserId = ackUserId;
  }

  public UnAckAlarmFVO ackTime(OffsetDateTime ackTime) {
    this.ackTime = ackTime;
    return this;
  }

  /**
   * Time of the unacknowledgement
   * @return ackTime
   */
  @Valid 
  @Schema(name = "ackTime", description = "Time of the unacknowledgement", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ackTime")
  public OffsetDateTime getAckTime() {
    return ackTime;
  }

  public void setAckTime(OffsetDateTime ackTime) {
    this.ackTime = ackTime;
  }

  public UnAckAlarmFVO alarmPattern(List<@Valid AlarmRefOrValue> alarmPattern) {
    this.alarmPattern = alarmPattern;
    return this;
  }

  public UnAckAlarmFVO addAlarmPatternItem(AlarmRefOrValue alarmPatternItem) {
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

  public UnAckAlarmFVO unAckedAlarm(List<@Valid AlarmRefOrValue> unAckedAlarm) {
    this.unAckedAlarm = unAckedAlarm;
    return this;
  }

  public UnAckAlarmFVO addUnAckedAlarmItem(AlarmRefOrValue unAckedAlarmItem) {
    if (this.unAckedAlarm == null) {
      this.unAckedAlarm = new ArrayList<>();
    }
    this.unAckedAlarm.add(unAckedAlarmItem);
    return this;
  }

  /**
   * The successfully unacknowledged alarms
   * @return unAckedAlarm
   */
  @Valid 
  @Schema(name = "unAckedAlarm", description = "The successfully unacknowledged alarms", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unAckedAlarm")
  public List<@Valid AlarmRefOrValue> getUnAckedAlarm() {
    return unAckedAlarm;
  }

  public void setUnAckedAlarm(List<@Valid AlarmRefOrValue> unAckedAlarm) {
    this.unAckedAlarm = unAckedAlarm;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnAckAlarmFVO unAckAlarmFVO = (UnAckAlarmFVO) o;
    return Objects.equals(this.atType, unAckAlarmFVO.atType) &&
        Objects.equals(this.atBaseType, unAckAlarmFVO.atBaseType) &&
        Objects.equals(this.atSchemaLocation, unAckAlarmFVO.atSchemaLocation) &&
        Objects.equals(this.href, unAckAlarmFVO.href) &&
        Objects.equals(this.id, unAckAlarmFVO.id) &&
        Objects.equals(this.state, unAckAlarmFVO.state) &&
        Objects.equals(this.ackSystemId, unAckAlarmFVO.ackSystemId) &&
        Objects.equals(this.ackUserId, unAckAlarmFVO.ackUserId) &&
        Objects.equals(this.ackTime, unAckAlarmFVO.ackTime) &&
        Objects.equals(this.alarmPattern, unAckAlarmFVO.alarmPattern) &&
        Objects.equals(this.unAckedAlarm, unAckAlarmFVO.unAckedAlarm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, href, id, state, ackSystemId, ackUserId, ackTime, alarmPattern, unAckedAlarm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnAckAlarmFVO {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    ackSystemId: ").append(toIndentedString(ackSystemId)).append("\n");
    sb.append("    ackUserId: ").append(toIndentedString(ackUserId)).append("\n");
    sb.append("    ackTime: ").append(toIndentedString(ackTime)).append("\n");
    sb.append("    alarmPattern: ").append(toIndentedString(alarmPattern)).append("\n");
    sb.append("    unAckedAlarm: ").append(toIndentedString(unAckedAlarm)).append("\n");
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

