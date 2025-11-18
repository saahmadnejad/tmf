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
import com.tmforum.alarm.model.AlarmRef;
import com.tmforum.alarm.model.AlarmType;
import com.tmforum.alarm.model.AlarmedObjectRef;
import com.tmforum.alarm.model.Comment;
import com.tmforum.alarm.model.CrossedThresholdInformation;
import com.tmforum.alarm.model.PerceivedSeverity;
import com.tmforum.alarm.model.RelatedPlaceFVO;
import com.tmforum.alarm.model.ServiceRef;
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
 * AlarmFVO
 */



public class AlarmFVO {

  private String atType;

  private String atBaseType;

  private String atSchemaLocation;

  private String href;

  private String id;

  private String externalAlarmId;

  /**
   * Defines the alarm state during its life cycle (raised, updated, cleared).
   */
  public enum StateEnum {
    RAISED("raised"),
    
    UPDATED("updated"),
    
    CLEARED("cleared");

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

  private AlarmType alarmType;

  private PerceivedSeverity perceivedSeverity;

  private String probableCause;

  private String specificProblem;

  private String alarmedObjectType;

  private AlarmedObjectRef alarmedObject;

  private String reportingSystemId;

  private String sourceSystemId;

  private String alarmDetails;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime alarmRaisedTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime alarmChangedTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime alarmClearedTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime alarmReportingTime;

  /**
   * Provides the Acknowledgement State of the alarm (unacknowledged, acknowledged).
   */
  public enum AckStateEnum {
    UNACKNOWLEDGED("unacknowledged"),
    
    ACKNOWLEDGED("acknowledged");

    private String value;

    AckStateEnum(String value) {
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
    public static AckStateEnum fromValue(String value) {
      for (AckStateEnum b : AckStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private AckStateEnum ackState;

  private String ackSystemId;

  private String ackUserId;

  @Valid
  private List<@Valid ServiceRef> affectedService = new ArrayList<>();

  private Boolean alarmEscalation;

  private String clearSystemId;

  private String clearUserId;

  @Valid
  private List<Comment> comment = new ArrayList<>();

  @Valid
  private List<@Valid AlarmRef> correlatedAlarm = new ArrayList<>();

  private CrossedThresholdInformation crossedThresholdInformation;

  private Boolean isRootCause;

  @Valid
  private List<@Valid AlarmRef> parentAlarm = new ArrayList<>();

  /**
   * Indicates that the Managed Object (related to this alarm) is in planned outage (in planned maintenance, or out-of-service). 
   */
  public enum PlannedOutageIndicatorEnum {
    IN_SERVICE("InService"),
    
    OUT_OF_SERVICE("OutOfService");

    private String value;

    PlannedOutageIndicatorEnum(String value) {
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
    public static PlannedOutageIndicatorEnum fromValue(String value) {
      for (PlannedOutageIndicatorEnum b : PlannedOutageIndicatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private PlannedOutageIndicatorEnum plannedOutageIndicator;

  private String proposedRepairedActions;

  private Boolean serviceAffecting;

  @Valid
  private List<RelatedPlaceFVO> place = new ArrayList<>();

  public AlarmFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AlarmFVO(String atType, StateEnum state, AlarmType alarmType, PerceivedSeverity perceivedSeverity, String probableCause, AlarmedObjectRef alarmedObject, String sourceSystemId, OffsetDateTime alarmRaisedTime) {
    this.atType = atType;
    this.state = state;
    this.alarmType = alarmType;
    this.perceivedSeverity = perceivedSeverity;
    this.probableCause = probableCause;
    this.alarmedObject = alarmedObject;
    this.sourceSystemId = sourceSystemId;
    this.alarmRaisedTime = alarmRaisedTime;
  }

  public AlarmFVO atType(String atType) {
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

  public AlarmFVO atBaseType(String atBaseType) {
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

  public AlarmFVO atSchemaLocation(String atSchemaLocation) {
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

  public AlarmFVO href(String href) {
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

  public AlarmFVO id(String id) {
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

  public AlarmFVO externalAlarmId(String externalAlarmId) {
    this.externalAlarmId = externalAlarmId;
    return this;
  }

  /**
   * An identifier of the alarm in the source system.
   * @return externalAlarmId
   */
  
  @Schema(name = "externalAlarmId", description = "An identifier of the alarm in the source system.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalAlarmId")
  public String getExternalAlarmId() {
    return externalAlarmId;
  }

  public void setExternalAlarmId(String externalAlarmId) {
    this.externalAlarmId = externalAlarmId;
  }

  public AlarmFVO state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * Defines the alarm state during its life cycle (raised, updated, cleared).
   * @return state
   */
  @NotNull 
  @Schema(name = "state", description = "Defines the alarm state during its life cycle (raised, updated, cleared).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public AlarmFVO alarmType(AlarmType alarmType) {
    this.alarmType = alarmType;
    return this;
  }

  /**
   * Get alarmType
   * @return alarmType
   */
  @NotNull @Valid 
  @Schema(name = "alarmType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("alarmType")
  public AlarmType getAlarmType() {
    return alarmType;
  }

  public void setAlarmType(AlarmType alarmType) {
    this.alarmType = alarmType;
  }

  public AlarmFVO perceivedSeverity(PerceivedSeverity perceivedSeverity) {
    this.perceivedSeverity = perceivedSeverity;
    return this;
  }

  /**
   * Get perceivedSeverity
   * @return perceivedSeverity
   */
  @NotNull @Valid 
  @Schema(name = "perceivedSeverity", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("perceivedSeverity")
  public PerceivedSeverity getPerceivedSeverity() {
    return perceivedSeverity;
  }

  public void setPerceivedSeverity(PerceivedSeverity perceivedSeverity) {
    this.perceivedSeverity = perceivedSeverity;
  }

  public AlarmFVO probableCause(String probableCause) {
    this.probableCause = probableCause;
    return this;
  }

  /**
   * Provides the probable cause of the alarm. The values are consistent with ITU-T Recommendation X.733 or 3GPP TS 32.111-2 Annex B.
   * @return probableCause
   */
  @NotNull 
  @Schema(name = "probableCause", description = "Provides the probable cause of the alarm. The values are consistent with ITU-T Recommendation X.733 or 3GPP TS 32.111-2 Annex B.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("probableCause")
  public String getProbableCause() {
    return probableCause;
  }

  public void setProbableCause(String probableCause) {
    this.probableCause = probableCause;
  }

  public AlarmFVO specificProblem(String specificProblem) {
    this.specificProblem = specificProblem;
    return this;
  }

  /**
   * Provides more specific information about the alarm.
   * @return specificProblem
   */
  
  @Schema(name = "specificProblem", description = "Provides more specific information about the alarm.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("specificProblem")
  public String getSpecificProblem() {
    return specificProblem;
  }

  public void setSpecificProblem(String specificProblem) {
    this.specificProblem = specificProblem;
  }

  public AlarmFVO alarmedObjectType(String alarmedObjectType) {
    this.alarmedObjectType = alarmedObjectType;
    return this;
  }

  /**
   * The type (class) of the managed object associated with the event.
   * @return alarmedObjectType
   */
  
  @Schema(name = "alarmedObjectType", description = "The type (class) of the managed object associated with the event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alarmedObjectType")
  public String getAlarmedObjectType() {
    return alarmedObjectType;
  }

  public void setAlarmedObjectType(String alarmedObjectType) {
    this.alarmedObjectType = alarmedObjectType;
  }

  public AlarmFVO alarmedObject(AlarmedObjectRef alarmedObject) {
    this.alarmedObject = alarmedObject;
    return this;
  }

  /**
   * Get alarmedObject
   * @return alarmedObject
   */
  @NotNull @Valid 
  @Schema(name = "alarmedObject", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("alarmedObject")
  public AlarmedObjectRef getAlarmedObject() {
    return alarmedObject;
  }

  public void setAlarmedObject(AlarmedObjectRef alarmedObject) {
    this.alarmedObject = alarmedObject;
  }

  public AlarmFVO reportingSystemId(String reportingSystemId) {
    this.reportingSystemId = reportingSystemId;
    return this;
  }

  /**
   * Reporting system identity.
   * @return reportingSystemId
   */
  
  @Schema(name = "reportingSystemId", description = "Reporting system identity.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reportingSystemId")
  public String getReportingSystemId() {
    return reportingSystemId;
  }

  public void setReportingSystemId(String reportingSystemId) {
    this.reportingSystemId = reportingSystemId;
  }

  public AlarmFVO sourceSystemId(String sourceSystemId) {
    this.sourceSystemId = sourceSystemId;
    return this;
  }

  /**
   * Source system identity.
   * @return sourceSystemId
   */
  @NotNull 
  @Schema(name = "sourceSystemId", description = "Source system identity.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sourceSystemId")
  public String getSourceSystemId() {
    return sourceSystemId;
  }

  public void setSourceSystemId(String sourceSystemId) {
    this.sourceSystemId = sourceSystemId;
  }

  public AlarmFVO alarmDetails(String alarmDetails) {
    this.alarmDetails = alarmDetails;
    return this;
  }

  /**
   * Contains further information on the alarm.
   * @return alarmDetails
   */
  
  @Schema(name = "alarmDetails", description = "Contains further information on the alarm.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alarmDetails")
  public String getAlarmDetails() {
    return alarmDetails;
  }

  public void setAlarmDetails(String alarmDetails) {
    this.alarmDetails = alarmDetails;
  }

  public AlarmFVO alarmRaisedTime(OffsetDateTime alarmRaisedTime) {
    this.alarmRaisedTime = alarmRaisedTime;
    return this;
  }

  /**
   * Indicates the time (as a date + time) at which the alarm occurred at its source.
   * @return alarmRaisedTime
   */
  @NotNull @Valid 
  @Schema(name = "alarmRaisedTime", description = "Indicates the time (as a date + time) at which the alarm occurred at its source.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("alarmRaisedTime")
  public OffsetDateTime getAlarmRaisedTime() {
    return alarmRaisedTime;
  }

  public void setAlarmRaisedTime(OffsetDateTime alarmRaisedTime) {
    this.alarmRaisedTime = alarmRaisedTime;
  }

  public AlarmFVO alarmChangedTime(OffsetDateTime alarmChangedTime) {
    this.alarmChangedTime = alarmChangedTime;
    return this;
  }

  /**
   * Indicates the last date and time when the alarm is changed on the alarm-owning system. Any change to the alarm whether coming from the alarmed resource, or triggered by a change from the client is changing this time.
   * @return alarmChangedTime
   */
  @Valid 
  @Schema(name = "alarmChangedTime", description = "Indicates the last date and time when the alarm is changed on the alarm-owning system. Any change to the alarm whether coming from the alarmed resource, or triggered by a change from the client is changing this time.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alarmChangedTime")
  public OffsetDateTime getAlarmChangedTime() {
    return alarmChangedTime;
  }

  public void setAlarmChangedTime(OffsetDateTime alarmChangedTime) {
    this.alarmChangedTime = alarmChangedTime;
  }

  public AlarmFVO alarmClearedTime(OffsetDateTime alarmClearedTime) {
    this.alarmClearedTime = alarmClearedTime;
    return this;
  }

  /**
   * Indicates the time (as a date + time) at which the alarm is cleared at the source. 
   * @return alarmClearedTime
   */
  @Valid 
  @Schema(name = "alarmClearedTime", description = "Indicates the time (as a date + time) at which the alarm is cleared at the source. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alarmClearedTime")
  public OffsetDateTime getAlarmClearedTime() {
    return alarmClearedTime;
  }

  public void setAlarmClearedTime(OffsetDateTime alarmClearedTime) {
    this.alarmClearedTime = alarmClearedTime;
  }

  public AlarmFVO alarmReportingTime(OffsetDateTime alarmReportingTime) {
    this.alarmReportingTime = alarmReportingTime;
    return this;
  }

  /**
   * Indicates the time (as a date + time) at which the alarm was reported by the owning OSS. It might be different from the alarmRaisedTime. For instance, if the alarm list is maintained by an EMS, the alarmRaisedtime would be the time the alarm   was detected by the NE, while the alarmReportingTime would be the time this alarm was stored in the alarm list of the EMS.
   * @return alarmReportingTime
   */
  @Valid 
  @Schema(name = "alarmReportingTime", description = "Indicates the time (as a date + time) at which the alarm was reported by the owning OSS. It might be different from the alarmRaisedTime. For instance, if the alarm list is maintained by an EMS, the alarmRaisedtime would be the time the alarm   was detected by the NE, while the alarmReportingTime would be the time this alarm was stored in the alarm list of the EMS.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alarmReportingTime")
  public OffsetDateTime getAlarmReportingTime() {
    return alarmReportingTime;
  }

  public void setAlarmReportingTime(OffsetDateTime alarmReportingTime) {
    this.alarmReportingTime = alarmReportingTime;
  }

  public AlarmFVO ackState(AckStateEnum ackState) {
    this.ackState = ackState;
    return this;
  }

  /**
   * Provides the Acknowledgement State of the alarm (unacknowledged, acknowledged).
   * @return ackState
   */
  
  @Schema(name = "ackState", description = "Provides the Acknowledgement State of the alarm (unacknowledged, acknowledged).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ackState")
  public AckStateEnum getAckState() {
    return ackState;
  }

  public void setAckState(AckStateEnum ackState) {
    this.ackState = ackState;
  }

  public AlarmFVO ackSystemId(String ackSystemId) {
    this.ackSystemId = ackSystemId;
    return this;
  }

  /**
   * Provides the name of the system that last changed the ackState of an alarm, i.e. acknowledged or unacknowledged the alarm.
   * @return ackSystemId
   */
  
  @Schema(name = "ackSystemId", description = "Provides the name of the system that last changed the ackState of an alarm, i.e. acknowledged or unacknowledged the alarm.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ackSystemId")
  public String getAckSystemId() {
    return ackSystemId;
  }

  public void setAckSystemId(String ackSystemId) {
    this.ackSystemId = ackSystemId;
  }

  public AlarmFVO ackUserId(String ackUserId) {
    this.ackUserId = ackUserId;
    return this;
  }

  /**
   * Provides the id of the user who has last changed the ack state of the alarm, i.e. acknowledged or unacknowledged the alarm.
   * @return ackUserId
   */
  
  @Schema(name = "ackUserId", description = "Provides the id of the user who has last changed the ack state of the alarm, i.e. acknowledged or unacknowledged the alarm.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ackUserId")
  public String getAckUserId() {
    return ackUserId;
  }

  public void setAckUserId(String ackUserId) {
    this.ackUserId = ackUserId;
  }

  public AlarmFVO affectedService(List<@Valid ServiceRef> affectedService) {
    this.affectedService = affectedService;
    return this;
  }

  public AlarmFVO addAffectedServiceItem(ServiceRef affectedServiceItem) {
    if (this.affectedService == null) {
      this.affectedService = new ArrayList<>();
    }
    this.affectedService.add(affectedServiceItem);
    return this;
  }

  /**
   * Provides list of affected services.
   * @return affectedService
   */
  @Valid 
  @Schema(name = "affectedService", description = "Provides list of affected services.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("affectedService")
  public List<@Valid ServiceRef> getAffectedService() {
    return affectedService;
  }

  public void setAffectedService(List<@Valid ServiceRef> affectedService) {
    this.affectedService = affectedService;
  }

  public AlarmFVO alarmEscalation(Boolean alarmEscalation) {
    this.alarmEscalation = alarmEscalation;
    return this;
  }

  /**
   * Indicates if this alarm has been escalated or not. 
   * @return alarmEscalation
   */
  
  @Schema(name = "alarmEscalation", description = "Indicates if this alarm has been escalated or not. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alarmEscalation")
  public Boolean getAlarmEscalation() {
    return alarmEscalation;
  }

  public void setAlarmEscalation(Boolean alarmEscalation) {
    this.alarmEscalation = alarmEscalation;
  }

  public AlarmFVO clearSystemId(String clearSystemId) {
    this.clearSystemId = clearSystemId;
    return this;
  }

  /**
   * Provides the id of the system where the user who invoked the alarmCleared operation is located. 
   * @return clearSystemId
   */
  
  @Schema(name = "clearSystemId", description = "Provides the id of the system where the user who invoked the alarmCleared operation is located. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clearSystemId")
  public String getClearSystemId() {
    return clearSystemId;
  }

  public void setClearSystemId(String clearSystemId) {
    this.clearSystemId = clearSystemId;
  }

  public AlarmFVO clearUserId(String clearUserId) {
    this.clearUserId = clearUserId;
    return this;
  }

  /**
   * Provides the id of the user who invoked the alarmCleared operation
   * @return clearUserId
   */
  
  @Schema(name = "clearUserId", description = "Provides the id of the user who invoked the alarmCleared operation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clearUserId")
  public String getClearUserId() {
    return clearUserId;
  }

  public void setClearUserId(String clearUserId) {
    this.clearUserId = clearUserId;
  }

  public AlarmFVO comment(List<Comment> comment) {
    this.comment = comment;
    return this;
  }

  public AlarmFVO addCommentItem(Comment commentItem) {
    if (this.comment == null) {
      this.comment = new ArrayList<>();
    }
    this.comment.add(commentItem);
    return this;
  }

  /**
   * Provides list of Comments regards Alarm.
   * @return comment
   */
  @Valid 
  @Schema(name = "comment", description = "Provides list of Comments regards Alarm.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comment")
  public List<Comment> getComment() {
    return comment;
  }

  public void setComment(List<Comment> comment) {
    this.comment = comment;
  }

  public AlarmFVO correlatedAlarm(List<@Valid AlarmRef> correlatedAlarm) {
    this.correlatedAlarm = correlatedAlarm;
    return this;
  }

  public AlarmFVO addCorrelatedAlarmItem(AlarmRef correlatedAlarmItem) {
    if (this.correlatedAlarm == null) {
      this.correlatedAlarm = new ArrayList<>();
    }
    this.correlatedAlarm.add(correlatedAlarmItem);
    return this;
  }

  /**
   * Provides list of correlated Alarms.
   * @return correlatedAlarm
   */
  @Valid 
  @Schema(name = "correlatedAlarm", description = "Provides list of correlated Alarms.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("correlatedAlarm")
  public List<@Valid AlarmRef> getCorrelatedAlarm() {
    return correlatedAlarm;
  }

  public void setCorrelatedAlarm(List<@Valid AlarmRef> correlatedAlarm) {
    this.correlatedAlarm = correlatedAlarm;
  }

  public AlarmFVO crossedThresholdInformation(CrossedThresholdInformation crossedThresholdInformation) {
    this.crossedThresholdInformation = crossedThresholdInformation;
    return this;
  }

  /**
   * Get crossedThresholdInformation
   * @return crossedThresholdInformation
   */
  @Valid 
  @Schema(name = "crossedThresholdInformation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("crossedThresholdInformation")
  public CrossedThresholdInformation getCrossedThresholdInformation() {
    return crossedThresholdInformation;
  }

  public void setCrossedThresholdInformation(CrossedThresholdInformation crossedThresholdInformation) {
    this.crossedThresholdInformation = crossedThresholdInformation;
  }

  public AlarmFVO isRootCause(Boolean isRootCause) {
    this.isRootCause = isRootCause;
    return this;
  }

  /**
   * Indicates whether the alarm is a root cause alarm.. 
   * @return isRootCause
   */
  
  @Schema(name = "isRootCause", description = "Indicates whether the alarm is a root cause alarm.. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isRootCause")
  public Boolean getIsRootCause() {
    return isRootCause;
  }

  public void setIsRootCause(Boolean isRootCause) {
    this.isRootCause = isRootCause;
  }

  public AlarmFVO parentAlarm(List<@Valid AlarmRef> parentAlarm) {
    this.parentAlarm = parentAlarm;
    return this;
  }

  public AlarmFVO addParentAlarmItem(AlarmRef parentAlarmItem) {
    if (this.parentAlarm == null) {
      this.parentAlarm = new ArrayList<>();
    }
    this.parentAlarm.add(parentAlarmItem);
    return this;
  }

  /**
   * Provides list of parrent Alarms.
   * @return parentAlarm
   */
  @Valid 
  @Schema(name = "parentAlarm", description = "Provides list of parrent Alarms.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parentAlarm")
  public List<@Valid AlarmRef> getParentAlarm() {
    return parentAlarm;
  }

  public void setParentAlarm(List<@Valid AlarmRef> parentAlarm) {
    this.parentAlarm = parentAlarm;
  }

  public AlarmFVO plannedOutageIndicator(PlannedOutageIndicatorEnum plannedOutageIndicator) {
    this.plannedOutageIndicator = plannedOutageIndicator;
    return this;
  }

  /**
   * Indicates that the Managed Object (related to this alarm) is in planned outage (in planned maintenance, or out-of-service). 
   * @return plannedOutageIndicator
   */
  
  @Schema(name = "plannedOutageIndicator", description = "Indicates that the Managed Object (related to this alarm) is in planned outage (in planned maintenance, or out-of-service). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("plannedOutageIndicator")
  public PlannedOutageIndicatorEnum getPlannedOutageIndicator() {
    return plannedOutageIndicator;
  }

  public void setPlannedOutageIndicator(PlannedOutageIndicatorEnum plannedOutageIndicator) {
    this.plannedOutageIndicator = plannedOutageIndicator;
  }

  public AlarmFVO proposedRepairedActions(String proposedRepairedActions) {
    this.proposedRepairedActions = proposedRepairedActions;
    return this;
  }

  /**
   * Indicates proposed repair actions, if known to the system emitting the alarm.
   * @return proposedRepairedActions
   */
  
  @Schema(name = "proposedRepairedActions", description = "Indicates proposed repair actions, if known to the system emitting the alarm.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("proposedRepairedActions")
  public String getProposedRepairedActions() {
    return proposedRepairedActions;
  }

  public void setProposedRepairedActions(String proposedRepairedActions) {
    this.proposedRepairedActions = proposedRepairedActions;
  }

  public AlarmFVO serviceAffecting(Boolean serviceAffecting) {
    this.serviceAffecting = serviceAffecting;
    return this;
  }

  /**
   * Indicates whether the alarm affects service or not.
   * @return serviceAffecting
   */
  
  @Schema(name = "serviceAffecting", description = "Indicates whether the alarm affects service or not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceAffecting")
  public Boolean getServiceAffecting() {
    return serviceAffecting;
  }

  public void setServiceAffecting(Boolean serviceAffecting) {
    this.serviceAffecting = serviceAffecting;
  }

  public AlarmFVO place(List<RelatedPlaceFVO> place) {
    this.place = place;
    return this;
  }

  public AlarmFVO addPlaceItem(RelatedPlaceFVO placeItem) {
    if (this.place == null) {
      this.place = new ArrayList<>();
    }
    this.place.add(placeItem);
    return this;
  }

  /**
   * List of related places, which are affected by Alarm.
   * @return place
   */
  @Valid 
  @Schema(name = "place", description = "List of related places, which are affected by Alarm.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("place")
  public List<RelatedPlaceFVO> getPlace() {
    return place;
  }

  public void setPlace(List<RelatedPlaceFVO> place) {
    this.place = place;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlarmFVO alarmFVO = (AlarmFVO) o;
    return Objects.equals(this.atType, alarmFVO.atType) &&
        Objects.equals(this.atBaseType, alarmFVO.atBaseType) &&
        Objects.equals(this.atSchemaLocation, alarmFVO.atSchemaLocation) &&
        Objects.equals(this.href, alarmFVO.href) &&
        Objects.equals(this.id, alarmFVO.id) &&
        Objects.equals(this.externalAlarmId, alarmFVO.externalAlarmId) &&
        Objects.equals(this.state, alarmFVO.state) &&
        Objects.equals(this.alarmType, alarmFVO.alarmType) &&
        Objects.equals(this.perceivedSeverity, alarmFVO.perceivedSeverity) &&
        Objects.equals(this.probableCause, alarmFVO.probableCause) &&
        Objects.equals(this.specificProblem, alarmFVO.specificProblem) &&
        Objects.equals(this.alarmedObjectType, alarmFVO.alarmedObjectType) &&
        Objects.equals(this.alarmedObject, alarmFVO.alarmedObject) &&
        Objects.equals(this.reportingSystemId, alarmFVO.reportingSystemId) &&
        Objects.equals(this.sourceSystemId, alarmFVO.sourceSystemId) &&
        Objects.equals(this.alarmDetails, alarmFVO.alarmDetails) &&
        Objects.equals(this.alarmRaisedTime, alarmFVO.alarmRaisedTime) &&
        Objects.equals(this.alarmChangedTime, alarmFVO.alarmChangedTime) &&
        Objects.equals(this.alarmClearedTime, alarmFVO.alarmClearedTime) &&
        Objects.equals(this.alarmReportingTime, alarmFVO.alarmReportingTime) &&
        Objects.equals(this.ackState, alarmFVO.ackState) &&
        Objects.equals(this.ackSystemId, alarmFVO.ackSystemId) &&
        Objects.equals(this.ackUserId, alarmFVO.ackUserId) &&
        Objects.equals(this.affectedService, alarmFVO.affectedService) &&
        Objects.equals(this.alarmEscalation, alarmFVO.alarmEscalation) &&
        Objects.equals(this.clearSystemId, alarmFVO.clearSystemId) &&
        Objects.equals(this.clearUserId, alarmFVO.clearUserId) &&
        Objects.equals(this.comment, alarmFVO.comment) &&
        Objects.equals(this.correlatedAlarm, alarmFVO.correlatedAlarm) &&
        Objects.equals(this.crossedThresholdInformation, alarmFVO.crossedThresholdInformation) &&
        Objects.equals(this.isRootCause, alarmFVO.isRootCause) &&
        Objects.equals(this.parentAlarm, alarmFVO.parentAlarm) &&
        Objects.equals(this.plannedOutageIndicator, alarmFVO.plannedOutageIndicator) &&
        Objects.equals(this.proposedRepairedActions, alarmFVO.proposedRepairedActions) &&
        Objects.equals(this.serviceAffecting, alarmFVO.serviceAffecting) &&
        Objects.equals(this.place, alarmFVO.place);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, href, id, externalAlarmId, state, alarmType, perceivedSeverity, probableCause, specificProblem, alarmedObjectType, alarmedObject, reportingSystemId, sourceSystemId, alarmDetails, alarmRaisedTime, alarmChangedTime, alarmClearedTime, alarmReportingTime, ackState, ackSystemId, ackUserId, affectedService, alarmEscalation, clearSystemId, clearUserId, comment, correlatedAlarm, crossedThresholdInformation, isRootCause, parentAlarm, plannedOutageIndicator, proposedRepairedActions, serviceAffecting, place);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlarmFVO {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    externalAlarmId: ").append(toIndentedString(externalAlarmId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    alarmType: ").append(toIndentedString(alarmType)).append("\n");
    sb.append("    perceivedSeverity: ").append(toIndentedString(perceivedSeverity)).append("\n");
    sb.append("    probableCause: ").append(toIndentedString(probableCause)).append("\n");
    sb.append("    specificProblem: ").append(toIndentedString(specificProblem)).append("\n");
    sb.append("    alarmedObjectType: ").append(toIndentedString(alarmedObjectType)).append("\n");
    sb.append("    alarmedObject: ").append(toIndentedString(alarmedObject)).append("\n");
    sb.append("    reportingSystemId: ").append(toIndentedString(reportingSystemId)).append("\n");
    sb.append("    sourceSystemId: ").append(toIndentedString(sourceSystemId)).append("\n");
    sb.append("    alarmDetails: ").append(toIndentedString(alarmDetails)).append("\n");
    sb.append("    alarmRaisedTime: ").append(toIndentedString(alarmRaisedTime)).append("\n");
    sb.append("    alarmChangedTime: ").append(toIndentedString(alarmChangedTime)).append("\n");
    sb.append("    alarmClearedTime: ").append(toIndentedString(alarmClearedTime)).append("\n");
    sb.append("    alarmReportingTime: ").append(toIndentedString(alarmReportingTime)).append("\n");
    sb.append("    ackState: ").append(toIndentedString(ackState)).append("\n");
    sb.append("    ackSystemId: ").append(toIndentedString(ackSystemId)).append("\n");
    sb.append("    ackUserId: ").append(toIndentedString(ackUserId)).append("\n");
    sb.append("    affectedService: ").append(toIndentedString(affectedService)).append("\n");
    sb.append("    alarmEscalation: ").append(toIndentedString(alarmEscalation)).append("\n");
    sb.append("    clearSystemId: ").append(toIndentedString(clearSystemId)).append("\n");
    sb.append("    clearUserId: ").append(toIndentedString(clearUserId)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    correlatedAlarm: ").append(toIndentedString(correlatedAlarm)).append("\n");
    sb.append("    crossedThresholdInformation: ").append(toIndentedString(crossedThresholdInformation)).append("\n");
    sb.append("    isRootCause: ").append(toIndentedString(isRootCause)).append("\n");
    sb.append("    parentAlarm: ").append(toIndentedString(parentAlarm)).append("\n");
    sb.append("    plannedOutageIndicator: ").append(toIndentedString(plannedOutageIndicator)).append("\n");
    sb.append("    proposedRepairedActions: ").append(toIndentedString(proposedRepairedActions)).append("\n");
    sb.append("    serviceAffecting: ").append(toIndentedString(serviceAffecting)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
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

