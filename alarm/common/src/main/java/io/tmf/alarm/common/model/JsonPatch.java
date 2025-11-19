package com.tmforum.alarm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * A JSONPatch document as defined by RFC 6902
 */

@Schema(name = "JsonPatch", description = "A JSONPatch document as defined by RFC 6902")

public class JsonPatch {

  /**
   * The operation to be performed
   */
  public enum OpEnum {
    ADD("add"),
    
    REMOVE("remove"),
    
    REPLACE("replace"),
    
    MOVE("move"),
    
    COPY("copy"),
    
    TEST("test");

    private String value;

    OpEnum(String value) {
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
    public static OpEnum fromValue(String value) {
      for (OpEnum b : OpEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private OpEnum op;

  private String path;

  private JsonNullable<Object> value = JsonNullable.<Object>undefined();

  private String from;

  public JsonPatch() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public JsonPatch(OpEnum op, String path) {
    this.op = op;
    this.path = path;
  }

  public JsonPatch op(OpEnum op) {
    this.op = op;
    return this;
  }

  /**
   * The operation to be performed
   * @return op
   */
  @NotNull 
  @Schema(name = "op", description = "The operation to be performed", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("op")
  public OpEnum getOp() {
    return op;
  }

  public void setOp(OpEnum op) {
    this.op = op;
  }

  public JsonPatch path(String path) {
    this.path = path;
    return this;
  }

  /**
   * A JSON-Pointer
   * @return path
   */
  @NotNull 
  @Schema(name = "path", description = "A JSON-Pointer", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public JsonPatch value(Object value) {
    this.value = JsonNullable.of(value);
    return this;
  }

  /**
   * The value to be used within the operations.
   * @return value
   */
  
  @Schema(name = "value", description = "The value to be used within the operations.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public JsonNullable<Object> getValue() {
    return value;
  }

  public void setValue(JsonNullable<Object> value) {
    this.value = value;
  }

  public JsonPatch from(String from) {
    this.from = from;
    return this;
  }

  /**
   * A string containing a JSON Pointer value.
   * @return from
   */
  
  @Schema(name = "from", description = "A string containing a JSON Pointer value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("from")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonPatch jsonPatch = (JsonPatch) o;
    return Objects.equals(this.op, jsonPatch.op) &&
        Objects.equals(this.path, jsonPatch.path) &&
        equalsNullable(this.value, jsonPatch.value) &&
        Objects.equals(this.from, jsonPatch.from);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(op, path, hashCodeNullable(value), from);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonPatch {\n");
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
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

