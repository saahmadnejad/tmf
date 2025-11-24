package io.donbee.tmf.alarm.common.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * AckAlarm
 */



public class AckAlarm {

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

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime ackTime;

  private String ackUserId;

  @Valid
  private List<@Valid AlarmRefOrValue> ackedAlarm = new ArrayList<>();

  @Valid
  private List<@Valid AlarmRefOrValue> alarmPattern = new ArrayList<>();

  public AckAlarm() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AckAlarm(String atType) {
    this.atType = atType;
  }

  public AckAlarm atType(String atType) {
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

  public AckAlarm atBaseType(String atBaseType) {
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

  public AckAlarm atSchemaLocation(String atSchemaLocation) {
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

  public AckAlarm href(String href) {
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

  public AckAlarm id(String id) {
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

  public AckAlarm state(StateEnum state) {
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

  public AckAlarm ackSystemId(String ackSystemId) {
    this.ackSystemId = ackSystemId;
    return this;
  }

  /**
   * Name of the acknowledging system
   * @return ackSystemId
   */
  
  @Schema(name = "ackSystemId", description = "Name of the acknowledging system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ackSystemId")
  public String getAckSystemId() {
    return ackSystemId;
  }

  public void setAckSystemId(String ackSystemId) {
    this.ackSystemId = ackSystemId;
  }

  public AckAlarm ackTime(OffsetDateTime ackTime) {
    this.ackTime = ackTime;
    return this;
  }

  /**
   * Time of the acknowledgement
   * @return ackTime
   */
  @Valid 
  @Schema(name = "ackTime", description = "Time of the acknowledgement", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ackTime")
  public OffsetDateTime getAckTime() {
    return ackTime;
  }

  public void setAckTime(OffsetDateTime ackTime) {
    this.ackTime = ackTime;
  }

  public AckAlarm ackUserId(String ackUserId) {
    this.ackUserId = ackUserId;
    return this;
  }

  /**
   * Name of the acknowledging user
   * @return ackUserId
   */
  
  @Schema(name = "ackUserId", description = "Name of the acknowledging user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ackUserId")
  public String getAckUserId() {
    return ackUserId;
  }

  public void setAckUserId(String ackUserId) {
    this.ackUserId = ackUserId;
  }

  public AckAlarm ackedAlarm(List<@Valid AlarmRefOrValue> ackedAlarm) {
    this.ackedAlarm = ackedAlarm;
    return this;
  }

  public AckAlarm addAckedAlarmItem(AlarmRefOrValue ackedAlarmItem) {
    if (this.ackedAlarm == null) {
      this.ackedAlarm = new ArrayList<>();
    }
    this.ackedAlarm.add(ackedAlarmItem);
    return this;
  }

  /**
   * The successfully acknowledged alarms
   * @return ackedAlarm
   */
  @Valid 
  @Schema(name = "ackedAlarm", description = "The successfully acknowledged alarms", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ackedAlarm")
  public List<@Valid AlarmRefOrValue> getAckedAlarm() {
    return ackedAlarm;
  }

  public void setAckedAlarm(List<@Valid AlarmRefOrValue> ackedAlarm) {
    this.ackedAlarm = ackedAlarm;
  }

  public AckAlarm alarmPattern(List<@Valid AlarmRefOrValue> alarmPattern) {
    this.alarmPattern = alarmPattern;
    return this;
  }

  public AckAlarm addAlarmPatternItem(AlarmRefOrValue alarmPatternItem) {
    if (this.alarmPattern == null) {
      this.alarmPattern = new ArrayList<>();
    }
    this.alarmPattern.add(alarmPatternItem);
    return this;
  }

  /**
   * Alarm patterns to match target alarms. An alarm will match if all of the attributes in any of the patterns compare equal to those attributes of the alarm.
   * @return alarmPattern
   */
  @Valid 
  @Schema(name = "alarmPattern", description = "Alarm patterns to match target alarms. An alarm will match if all of the attributes in any of the patterns compare equal to those attributes of the alarm.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alarmPattern")
  public List<@Valid AlarmRefOrValue> getAlarmPattern() {
    return alarmPattern;
  }

  public void setAlarmPattern(List<@Valid AlarmRefOrValue> alarmPattern) {
    this.alarmPattern = alarmPattern;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AckAlarm ackAlarm = (AckAlarm) o;
    return Objects.equals(this.atType, ackAlarm.atType) &&
        Objects.equals(this.atBaseType, ackAlarm.atBaseType) &&
        Objects.equals(this.atSchemaLocation, ackAlarm.atSchemaLocation) &&
        Objects.equals(this.href, ackAlarm.href) &&
        Objects.equals(this.id, ackAlarm.id) &&
        Objects.equals(this.state, ackAlarm.state) &&
        Objects.equals(this.ackSystemId, ackAlarm.ackSystemId) &&
        Objects.equals(this.ackTime, ackAlarm.ackTime) &&
        Objects.equals(this.ackUserId, ackAlarm.ackUserId) &&
        Objects.equals(this.ackedAlarm, ackAlarm.ackedAlarm) &&
        Objects.equals(this.alarmPattern, ackAlarm.alarmPattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, href, id, state, ackSystemId, ackTime, ackUserId, ackedAlarm, alarmPattern);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AckAlarm {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    ackSystemId: ").append(toIndentedString(ackSystemId)).append("\n");
    sb.append("    ackTime: ").append(toIndentedString(ackTime)).append("\n");
    sb.append("    ackUserId: ").append(toIndentedString(ackUserId)).append("\n");
    sb.append("    ackedAlarm: ").append(toIndentedString(ackedAlarm)).append("\n");
    sb.append("    alarmPattern: ").append(toIndentedString(alarmPattern)).append("\n");
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

