package io.donbee.tmf.alarm.common.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Identifies the details of the threshold that has been crossed.
 */

@Schema(name = "CrossedThresholdInformation", description = "Identifies the details of the threshold that has been crossed.")

public class CrossedThresholdInformation {

  private ThresholdRef threshold;

  private String direction;

  private String granularity;

  private String indicatorName;

  private String indicatorUnit;

  private String observedValue;

  private String thresholdCrossingDescription;

  public CrossedThresholdInformation threshold(ThresholdRef threshold) {
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
  public ThresholdRef getThreshold() {
    return threshold;
  }

  public void setThreshold(ThresholdRef threshold) {
    this.threshold = threshold;
  }

  public CrossedThresholdInformation direction(String direction) {
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

  public CrossedThresholdInformation granularity(String granularity) {
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

  public CrossedThresholdInformation indicatorName(String indicatorName) {
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

  public CrossedThresholdInformation indicatorUnit(String indicatorUnit) {
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

  public CrossedThresholdInformation observedValue(String observedValue) {
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

  public CrossedThresholdInformation thresholdCrossingDescription(String thresholdCrossingDescription) {
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
    CrossedThresholdInformation crossedThresholdInformation = (CrossedThresholdInformation) o;
    return Objects.equals(this.threshold, crossedThresholdInformation.threshold) &&
        Objects.equals(this.direction, crossedThresholdInformation.direction) &&
        Objects.equals(this.granularity, crossedThresholdInformation.granularity) &&
        Objects.equals(this.indicatorName, crossedThresholdInformation.indicatorName) &&
        Objects.equals(this.indicatorUnit, crossedThresholdInformation.indicatorUnit) &&
        Objects.equals(this.observedValue, crossedThresholdInformation.observedValue) &&
        Objects.equals(this.thresholdCrossingDescription, crossedThresholdInformation.thresholdCrossingDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(threshold, direction, granularity, indicatorName, indicatorUnit, observedValue, thresholdCrossingDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrossedThresholdInformation {\n");
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

