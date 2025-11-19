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
 * UnGroupAlarmFVO
 */



public class UnGroupAlarmFVO {

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

  public UnGroupAlarmFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UnGroupAlarmFVO(String atType, String sourceSystemId, OffsetDateTime alarmChangedTime, AlarmRefOrValue parentAlarm, List<@Valid AlarmRefOrValue> correlatedAlarm) {
    this.atType = atType;
    this.sourceSystemId = sourceSystemId;
    this.alarmChangedTime = alarmChangedTime;
    this.parentAlarm = parentAlarm;
    this.correlatedAlarm = correlatedAlarm;
  }

  public UnGroupAlarmFVO atType(String atType) {
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

  public UnGroupAlarmFVO atBaseType(String atBaseType) {
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

  public UnGroupAlarmFVO atSchemaLocation(String atSchemaLocation) {
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

  public UnGroupAlarmFVO href(String href) {
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

  public UnGroupAlarmFVO id(String id) {
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

  public UnGroupAlarmFVO state(StateEnum state) {
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

  public UnGroupAlarmFVO sourceSystemId(String sourceSystemId) {
    this.sourceSystemId = sourceSystemId;
    return this;
  }

  /**
   * Source system identifier
   * @return sourceSystemId
   */
  @NotNull 
  @Schema(name = "sourceSystemId", description = "Source system identifier", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sourceSystemId")
  public String getSourceSystemId() {
    return sourceSystemId;
  }

  public void setSourceSystemId(String sourceSystemId) {
    this.sourceSystemId = sourceSystemId;
  }

  public UnGroupAlarmFVO alarmChangedTime(OffsetDateTime alarmChangedTime) {
    this.alarmChangedTime = alarmChangedTime;
    return this;
  }

  /**
   * Time of the uncorrelation
   * @return alarmChangedTime
   */
  @NotNull @Valid 
  @Schema(name = "alarmChangedTime", description = "Time of the uncorrelation", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("alarmChangedTime")
  public OffsetDateTime getAlarmChangedTime() {
    return alarmChangedTime;
  }

  public void setAlarmChangedTime(OffsetDateTime alarmChangedTime) {
    this.alarmChangedTime = alarmChangedTime;
  }

  public UnGroupAlarmFVO parentAlarm(AlarmRefOrValue parentAlarm) {
    this.parentAlarm = parentAlarm;
    return this;
  }

  /**
   * Get parentAlarm
   * @return parentAlarm
   */
  @NotNull @Valid 
  @Schema(name = "parentAlarm", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("parentAlarm")
  public AlarmRefOrValue getParentAlarm() {
    return parentAlarm;
  }

  public void setParentAlarm(AlarmRefOrValue parentAlarm) {
    this.parentAlarm = parentAlarm;
  }

  public UnGroupAlarmFVO correlatedAlarm(List<@Valid AlarmRefOrValue> correlatedAlarm) {
    this.correlatedAlarm = correlatedAlarm;
    return this;
  }

  public UnGroupAlarmFVO addCorrelatedAlarmItem(AlarmRefOrValue correlatedAlarmItem) {
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
  @NotNull @Valid 
  @Schema(name = "correlatedAlarm", description = "Correlated alarms", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("correlatedAlarm")
  public List<@Valid AlarmRefOrValue> getCorrelatedAlarm() {
    return correlatedAlarm;
  }

  public void setCorrelatedAlarm(List<@Valid AlarmRefOrValue> correlatedAlarm) {
    this.correlatedAlarm = correlatedAlarm;
  }

  public UnGroupAlarmFVO unGroupedAlarm(List<@Valid AlarmRefOrValue> unGroupedAlarm) {
    this.unGroupedAlarm = unGroupedAlarm;
    return this;
  }

  public UnGroupAlarmFVO addUnGroupedAlarmItem(AlarmRefOrValue unGroupedAlarmItem) {
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
    UnGroupAlarmFVO unGroupAlarmFVO = (UnGroupAlarmFVO) o;
    return Objects.equals(this.atType, unGroupAlarmFVO.atType) &&
        Objects.equals(this.atBaseType, unGroupAlarmFVO.atBaseType) &&
        Objects.equals(this.atSchemaLocation, unGroupAlarmFVO.atSchemaLocation) &&
        Objects.equals(this.href, unGroupAlarmFVO.href) &&
        Objects.equals(this.id, unGroupAlarmFVO.id) &&
        Objects.equals(this.state, unGroupAlarmFVO.state) &&
        Objects.equals(this.sourceSystemId, unGroupAlarmFVO.sourceSystemId) &&
        Objects.equals(this.alarmChangedTime, unGroupAlarmFVO.alarmChangedTime) &&
        Objects.equals(this.parentAlarm, unGroupAlarmFVO.parentAlarm) &&
        Objects.equals(this.correlatedAlarm, unGroupAlarmFVO.correlatedAlarm) &&
        Objects.equals(this.unGroupedAlarm, unGroupAlarmFVO.unGroupedAlarm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, href, id, state, sourceSystemId, alarmChangedTime, parentAlarm, correlatedAlarm, unGroupedAlarm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnGroupAlarmFVO {\n");
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

