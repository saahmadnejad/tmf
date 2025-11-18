package com.tmforum.alarm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ExternalIdentifierMVO
 */



public class ExternalIdentifierMVO {

  private String atType;

  private String atBaseType;

  private String atSchemaLocation;

  private String owner;

  private String externalIdentifierType;

  public ExternalIdentifierMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ExternalIdentifierMVO(String atType) {
    this.atType = atType;
  }

  public ExternalIdentifierMVO atType(String atType) {
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

  public ExternalIdentifierMVO atBaseType(String atBaseType) {
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

  public ExternalIdentifierMVO atSchemaLocation(String atSchemaLocation) {
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

  public ExternalIdentifierMVO owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Name of the external system that owns the entity.
   * @return owner
   */
  
  @Schema(name = "owner", example = "MagentoCommerce", description = "Name of the external system that owns the entity.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public ExternalIdentifierMVO externalIdentifierType(String externalIdentifierType) {
    this.externalIdentifierType = externalIdentifierType;
    return this;
  }

  /**
   * Type of the identification, typically would be the type of the entity within the external system
   * @return externalIdentifierType
   */
  
  @Schema(name = "externalIdentifierType", example = "ProductOrder", description = "Type of the identification, typically would be the type of the entity within the external system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalIdentifierType")
  public String getExternalIdentifierType() {
    return externalIdentifierType;
  }

  public void setExternalIdentifierType(String externalIdentifierType) {
    this.externalIdentifierType = externalIdentifierType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalIdentifierMVO externalIdentifierMVO = (ExternalIdentifierMVO) o;
    return Objects.equals(this.atType, externalIdentifierMVO.atType) &&
        Objects.equals(this.atBaseType, externalIdentifierMVO.atBaseType) &&
        Objects.equals(this.atSchemaLocation, externalIdentifierMVO.atSchemaLocation) &&
        Objects.equals(this.owner, externalIdentifierMVO.owner) &&
        Objects.equals(this.externalIdentifierType, externalIdentifierMVO.externalIdentifierType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, owner, externalIdentifierType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalIdentifierMVO {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    externalIdentifierType: ").append(toIndentedString(externalIdentifierType)).append("\n");
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

