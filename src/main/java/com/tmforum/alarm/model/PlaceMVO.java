package com.tmforum.alarm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.tmforum.alarm.model.ExternalIdentifierMVO;
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
 * PlaceMVO
 */



public class PlaceMVO {

  private String atType;

  private String atBaseType;

  private String atSchemaLocation;

  private String href;

  private String id;

  @Valid
  private List<ExternalIdentifierMVO> externalIdentifier = new ArrayList<>();

  public PlaceMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PlaceMVO(String atType) {
    this.atType = atType;
  }

  public PlaceMVO atType(String atType) {
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

  public PlaceMVO atBaseType(String atBaseType) {
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

  public PlaceMVO atSchemaLocation(String atSchemaLocation) {
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

  public PlaceMVO href(String href) {
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

  public PlaceMVO id(String id) {
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

  public PlaceMVO externalIdentifier(List<ExternalIdentifierMVO> externalIdentifier) {
    this.externalIdentifier = externalIdentifier;
    return this;
  }

  public PlaceMVO addExternalIdentifierItem(ExternalIdentifierMVO externalIdentifierItem) {
    if (this.externalIdentifier == null) {
      this.externalIdentifier = new ArrayList<>();
    }
    this.externalIdentifier.add(externalIdentifierItem);
    return this;
  }

  /**
   * Collection of external identifiers
   * @return externalIdentifier
   */
  @Valid 
  @Schema(name = "externalIdentifier", description = "Collection of external identifiers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalIdentifier")
  public List<ExternalIdentifierMVO> getExternalIdentifier() {
    return externalIdentifier;
  }

  public void setExternalIdentifier(List<ExternalIdentifierMVO> externalIdentifier) {
    this.externalIdentifier = externalIdentifier;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaceMVO placeMVO = (PlaceMVO) o;
    return Objects.equals(this.atType, placeMVO.atType) &&
        Objects.equals(this.atBaseType, placeMVO.atBaseType) &&
        Objects.equals(this.atSchemaLocation, placeMVO.atSchemaLocation) &&
        Objects.equals(this.href, placeMVO.href) &&
        Objects.equals(this.id, placeMVO.id) &&
        Objects.equals(this.externalIdentifier, placeMVO.externalIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, href, id, externalIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaceMVO {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    externalIdentifier: ").append(toIndentedString(externalIdentifier)).append("\n");
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

