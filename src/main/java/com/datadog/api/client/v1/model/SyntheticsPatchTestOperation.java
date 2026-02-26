/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>A single <a href="https://jsonpatch.com">JSON Patch</a> operation to perform on the test</p>
 */
@JsonPropertyOrder({
  SyntheticsPatchTestOperation.JSON_PROPERTY_OP,
  SyntheticsPatchTestOperation.JSON_PROPERTY_PATH,
  SyntheticsPatchTestOperation.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsPatchTestOperation {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_OP = "op";
  private SyntheticsPatchTestOperationName op;

  public static final String JSON_PROPERTY_PATH = "path";
  private String path;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Object value = null;

  public SyntheticsPatchTestOperation op(SyntheticsPatchTestOperationName op) {
    this.op = op;
    this.unparsed |= !op.isValid();
    return this;
  }

  /**
   * <p>The operation to perform</p>
   * @return op
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_OP)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsPatchTestOperationName getOp() {
        return op;
      }
  public void setOp(SyntheticsPatchTestOperationName op) {
    if (!op.isValid()) {
        this.unparsed = true;
    }
    this.op = op;
  }
  public SyntheticsPatchTestOperation path(String path) {
    this.path = path;
    return this;
  }

  /**
   * <p>The path to the value to modify</p>
   * @return path
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PATH)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getPath() {
        return path;
      }
  public void setPath(String path) {
    this.path = path;
  }
  public SyntheticsPatchTestOperation value(Object value) {
    this.value = value;
    return this;
  }

  /**
   * <p>A value to use in a <a href="https://jsonpatch.com">JSON Patch</a> operation</p>
   * @return value
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VALUE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Object getValue() {
        return value;
      }
  public void setValue(Object value) {
    this.value = value;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return SyntheticsPatchTestOperation
   */
  @JsonAnySetter
  public SyntheticsPatchTestOperation putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }

  /**
   * Return true if this SyntheticsPatchTestOperation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsPatchTestOperation syntheticsPatchTestOperation = (SyntheticsPatchTestOperation) o;
    return Objects.equals(this.op, syntheticsPatchTestOperation.op) && Objects.equals(this.path, syntheticsPatchTestOperation.path) && Objects.equals(this.value, syntheticsPatchTestOperation.value) && Objects.equals(this.additionalProperties, syntheticsPatchTestOperation.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(op,path,value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsPatchTestOperation {\n");
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
