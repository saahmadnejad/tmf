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
 * UnGroupAlarm
 */



public class UnGroupAlarm {

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

  private String sourceSystemId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime alarmChangedTime;

  private AlarmRefOrValue parentAlarm;

  @Valid
  private List<@Valid AlarmRefOrValue> correlatedAlarm = new ArrayList<>();

  @Valid
  private List<@Valid AlarmRefOrValue> unGroupedAlarm = new ArrayList<>();

  public UnGroupAlarm() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UnGroupAlarm(String atType) {
    this.atType = atType;
  }

  public UnGroupAlarm atType(String atType) {
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

  public UnGroupAlarm atBaseType(String atBaseType) {
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

  public UnGroupAlarm atSchemaLocation(String atSchemaLocation) {
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

  public UnGroupAlarm href(String href) {
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

  public UnGroupAlarm id(String id) {
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

  public UnGroupAlarm state(StateEnum state) {
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

  public UnGroupAlarm sourceSystemId(String sourceSystemId) {
    this.sourceSystemId = sourceSystemId;
    return this;
  }

  /**
   * Source system identifier
   * @return sourceSystemId
   */
  
  @Schema(name = "sourceSystemId", description = "Source system identifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sourceSystemId")
  public String getSourceSystemId() {
    return sourceSystemId;
  }

  public void setSourceSystemId(String sourceSystemId) {
    this.sourceSystemId = sourceSystemId;
  }

  public UnGroupAlarm alarmChangedTime(OffsetDateTime alarmChangedTime) {
    this.alarmChangedTime = alarmChangedTime;
    return this;
  }

  /**
   * Time of the uncorrelation
   * @return alarmChangedTime
   */
  @Valid 
  @Schema(name = "alarmChangedTime", description = "Time of the uncorrelation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alarmChangedTime")
  public OffsetDateTime getAlarmChangedTime() {
    return alarmChangedTime;
  }

  public void setAlarmChangedTime(OffsetDateTime alarmChangedTime) {
    this.alarmChangedTime = alarmChangedTime;
  }

  public UnGroupAlarm parentAlarm(AlarmRefOrValue parentAlarm) {
    this.parentAlarm = parentAlarm;
    return this;
  }

  /**
   * Get parentAlarm
   * @return parentAlarm
   */
  @Valid 
  @Schema(name = "parentAlarm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parentAlarm")
  public AlarmRefOrValue getParentAlarm() {
    return parentAlarm;
  }

  public void setParentAlarm(AlarmRefOrValue parentAlarm) {
    this.parentAlarm = parentAlarm;
  }

  public UnGroupAlarm correlatedAlarm(List<@Valid AlarmRefOrValue> correlatedAlarm) {
    this.correlatedAlarm = correlatedAlarm;
    return this;
  }

  public UnGroupAlarm addCorrelatedAlarmItem(AlarmRefOrValue correlatedAlarmItem) {
    if (this.correlatedAlarm == null) {
      this.correlatedAlarm = new ArrayList<>();
    }
    this.correlatedAlarm.add(correlatedAlarmItem);
    return this;
  }

  /**
   * Correlated alarms
   * @return correlatedAlarm
   */
  @Valid 
  @Schema(name = "correlatedAlarm", description = "Correlated alarms", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("correlatedAlarm")
  public List<@Valid AlarmRefOrValue> getCorrelatedAlarm() {
    return correlatedAlarm;
  }

  public void setCorrelatedAlarm(List<@Valid AlarmRefOrValue> correlatedAlarm) {
    this.correlatedAlarm = correlatedAlarm;
  }

  public UnGroupAlarm unGroupedAlarm(List<@Valid AlarmRefOrValue> unGroupedAlarm) {
    this.unGroupedAlarm = unGroupedAlarm;
    return this;
  }

  public UnGroupAlarm addUnGroupedAlarmItem(AlarmRefOrValue unGroupedAlarmItem) {
    if (this.unGroupedAlarm == null) {
      this.unGroupedAlarm = new ArrayList<>();
    }
    this.unGroupedAlarm.add(unGroupedAlarmItem);
    return this;
  }

  /**
   * The successfully uncorrelated alarms
   * @return unGroupedAlarm
   */
  @Valid 
  @Schema(name = "unGroupedAlarm", description = "The successfully uncorrelated alarms", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unGroupedAlarm")
  public List<@Valid AlarmRefOrValue> getUnGroupedAlarm() {
    return unGroupedAlarm;
  }

  public void setUnGroupedAlarm(List<@Valid AlarmRefOrValue> unGroupedAlarm) {
    this.unGroupedAlarm = unGroupedAlarm;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnGroupAlarm unGroupAlarm = (UnGroupAlarm) o;
    return Objects.equals(this.atType, unGroupAlarm.atType) &&
        Objects.equals(this.atBaseType, unGroupAlarm.atBaseType) &&
        Objects.equals(this.atSchemaLocation, unGroupAlarm.atSchemaLocation) &&
        Objects.equals(this.href, unGroupAlarm.href) &&
        Objects.equals(this.id, unGroupAlarm.id) &&
        Objects.equals(this.state, unGroupAlarm.state) &&
        Objects.equals(this.sourceSystemId, unGroupAlarm.sourceSystemId) &&
        Objects.equals(this.alarmChangedTime, unGroupAlarm.alarmChangedTime) &&
        Objects.equals(this.parentAlarm, unGroupAlarm.parentAlarm) &&
        Objects.equals(this.correlatedAlarm, unGroupAlarm.correlatedAlarm) &&
        Objects.equals(this.unGroupedAlarm, unGroupAlarm.unGroupedAlarm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, href, id, state, sourceSystemId, alarmChangedTime, parentAlarm, correlatedAlarm, unGroupedAlarm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnGroupAlarm {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    sourceSystemId: ").append(toIndentedString(sourceSystemId)).append("\n");
    sb.append("    alarmChangedTime: ").append(toIndentedString(alarmChangedTime)).append("\n");
    sb.append("    parentAlarm: ").append(toIndentedString(parentAlarm)).append("\n");
    sb.append("    correlatedAlarm: ").append(toIndentedString(correlatedAlarm)).append("\n");
    sb.append("    unGroupedAlarm: ").append(toIndentedString(unGroupedAlarm)).append("\n");
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

