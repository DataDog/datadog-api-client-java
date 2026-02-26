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
   * <p>Operation that computes the length of a <code>source</code> array and stores the result in the <code>target</code> attribute.</p>
 */
@JsonPropertyOrder({
  LogsArrayProcessorOperationLength.JSON_PROPERTY_SOURCE,
  LogsArrayProcessorOperationLength.JSON_PROPERTY_TARGET,
  LogsArrayProcessorOperationLength.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsArrayProcessorOperationLength {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source;

  public static final String JSON_PROPERTY_TARGET = "target";
  private String target;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LogsArrayProcessorOperationLengthType type;

  public LogsArrayProcessorOperationLength() {}

  @JsonCreator
  public LogsArrayProcessorOperationLength(
            @JsonProperty(required=true, value=JSON_PROPERTY_SOURCE)String source,
            @JsonProperty(required=true, value=JSON_PROPERTY_TARGET)String target,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)LogsArrayProcessorOperationLengthType type) {
        this.source = source;
        this.target = target;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public LogsArrayProcessorOperationLength source(String source) {
    this.source = source;
    return this;
  }

  /**
   * <p>Attribute path of the array to measure.</p>
   * @return source
  **/
      @JsonProperty(JSON_PROPERTY_SOURCE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getSource() {
        return source;
      }
  public void setSource(String source) {
    this.source = source;
  }
  public LogsArrayProcessorOperationLength target(String target) {
    this.target = target;
    return this;
  }

  /**
   * <p>Attribute that receives the computed length.</p>
   * @return target
  **/
      @JsonProperty(JSON_PROPERTY_TARGET)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getTarget() {
        return target;
      }
  public void setTarget(String target) {
    this.target = target;
  }
  public LogsArrayProcessorOperationLength type(LogsArrayProcessorOperationLengthType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Operation type.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public LogsArrayProcessorOperationLengthType getType() {
        return type;
      }
  public void setType(LogsArrayProcessorOperationLengthType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
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
   * @return LogsArrayProcessorOperationLength
   */
  @JsonAnySetter
  public LogsArrayProcessorOperationLength putAdditionalProperty(String key, Object value) {
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
   * Return true if this LogsArrayProcessorOperationLength object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsArrayProcessorOperationLength logsArrayProcessorOperationLength = (LogsArrayProcessorOperationLength) o;
    return Objects.equals(this.source, logsArrayProcessorOperationLength.source) && Objects.equals(this.target, logsArrayProcessorOperationLength.target) && Objects.equals(this.type, logsArrayProcessorOperationLength.type) && Objects.equals(this.additionalProperties, logsArrayProcessorOperationLength.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(source,target,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsArrayProcessorOperationLength {\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
