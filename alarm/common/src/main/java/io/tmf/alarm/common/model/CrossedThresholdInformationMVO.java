package com.tmforum.alarm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.tmforum.alarm.model.ThresholdRefMVO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Identifies the details of the threshold that has been crossed.
 */

@Schema(name = "CrossedThresholdInformation_MVO", description = "Identifies the details of the threshold that has been crossed.")
@JsonTypeName("CrossedThresholdInformation_MVO")

public class CrossedThresholdInformationMVO {

  private ThresholdRefMVO threshold;

  private String direction;

  private String granularity;

  private String indicatorName;

  private String indicatorUnit;

  private String observedValue;

  private String thresholdCrossingDescription;

  public CrossedThresholdInformationMVO threshold(ThresholdRefMVO threshold) {
    this.threshold = threshold;
    return this;
  }

  /**
   * Get threshold
   * @return threshold
   */
  @Valid 
  @Schema(name = "threshold", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("threshold")
  public ThresholdRefMVO getThreshold() {
    return threshold;
  }

  public void setThreshold(ThresholdRefMVO threshold) {
    this.threshold = threshold;
  }

  public CrossedThresholdInformationMVO direction(String direction) {
    this.direction = direction;
    return this;
  }

  /**
   * Indicates the threshold crossing direction: up or down.
   * @return direction
   */
  
  @Schema(name = "direction", description = "Indicates the threshold crossing direction: up or down.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("direction")
  public String getDirection() {
    return direction;
  }

  public void setDirection(String direction) {
    this.direction = direction;
  }

  public CrossedThresholdInformationMVO granularity(String granularity) {
    this.granularity = granularity;
    return this;
  }

  /**
   * Indicates the granularity at which the indicator is evaluated for threshold crossing
   * @return granularity
   */
  
  @Schema(name = "granularity", description = "Indicates the granularity at which the indicator is evaluated for threshold crossing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("granularity")
  public String getGranularity() {
    return granularity;
  }

  public void setGranularity(String granularity) {
    this.granularity = granularity;
  }

  public CrossedThresholdInformationMVO indicatorName(String indicatorName) {
    this.indicatorName = indicatorName;
    return this;
  }

  /**
   * Indicates the name of indicator which crossed the threshold.
   * @return indicatorName
   */
  
  @Schema(name = "indicatorName", description = "Indicates the name of indicator which crossed the threshold.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("indicatorName")
  public String getIndicatorName() {
    return indicatorName;
  }

  public void setIndicatorName(String indicatorName) {
    this.indicatorName = indicatorName;
  }

  public CrossedThresholdInformationMVO indicatorUnit(String indicatorUnit) {
    this.indicatorUnit = indicatorUnit;
    return this;
  }

  /**
   * Indicates the unit of the measurement of the indicator corresponding to the threshold that has been crossed.
   * @return indicatorUnit
   */
  
  @Schema(name = "indicatorUnit", description = "Indicates the unit of the measurement of the indicator corresponding to the threshold that has been crossed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("indicatorUnit")
  public String getIndicatorUnit() {
    return indicatorUnit;
  }

  public void setIndicatorUnit(String indicatorUnit) {
    this.indicatorUnit = indicatorUnit;
  }

  public CrossedThresholdInformationMVO observedValue(String observedValue) {
    this.observedValue = observedValue;
    return this;
  }

  /**
   * Indicates the value of the indicator which crossed the threshold.
   * @return observedValue
   */
  
  @Schema(name = "observedValue", description = "Indicates the value of the indicator which crossed the threshold.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("observedValue")
  public String getObservedValue() {
    return observedValue;
  }

  public void setObservedValue(String observedValue) {
    this.observedValue = observedValue;
  }

  public CrossedThresholdInformationMVO thresholdCrossingDescription(String thresholdCrossingDescription) {
    this.thresholdCrossingDescription = thresholdCrossingDescription;
    return this;
  }

  /**
   * Indicates further information on the threshold crossing alarm.
   * @return thresholdCrossingDescription
   */
  
  @Schema(name = "thresholdCrossingDescription", description = "Indicates further information on the threshold crossing alarm.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("thresholdCrossingDescription")
  public String getThresholdCrossingDescription() {
    return thresholdCrossingDescription;
  }

  public void setThresholdCrossingDescription(String thresholdCrossingDescription) {
    this.thresholdCrossingDescription = thresholdCrossingDescription;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrossedThresholdInformationMVO crossedThresholdInformationMVO = (CrossedThresholdInformationMVO) o;
    return Objects.equals(this.threshold, crossedThresholdInformationMVO.threshold) &&
        Objects.equals(this.direction, crossedThresholdInformationMVO.direction) &&
        Objects.equals(this.granularity, crossedThresholdInformationMVO.granularity) &&
        Objects.equals(this.indicatorName, crossedThresholdInformationMVO.indicatorName) &&
        Objects.equals(this.indicatorUnit, crossedThresholdInformationMVO.indicatorUnit) &&
        Objects.equals(this.observedValue, crossedThresholdInformationMVO.observedValue) &&
        Objects.equals(this.thresholdCrossingDescription, crossedThresholdInformationMVO.thresholdCrossingDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(threshold, direction, granularity, indicatorName, indicatorUnit, observedValue, thresholdCrossingDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrossedThresholdInformationMVO {\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    indicatorName: ").append(toIndentedString(indicatorName)).append("\n");
    sb.append("    indicatorUnit: ").append(toIndentedString(indicatorUnit)).append("\n");
    sb.append("    observedValue: ").append(toIndentedString(observedValue)).append("\n");
    sb.append("    thresholdCrossingDescription: ").append(toIndentedString(thresholdCrossingDescription)).append("\n");
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

