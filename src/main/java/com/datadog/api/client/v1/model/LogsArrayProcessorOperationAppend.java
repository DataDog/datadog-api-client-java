/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Operation that appends a value to a target array attribute. */
@JsonPropertyOrder({
  LogsArrayProcessorOperationAppend.JSON_PROPERTY_PRESERVE_SOURCE,
  LogsArrayProcessorOperationAppend.JSON_PROPERTY_SOURCE,
  LogsArrayProcessorOperationAppend.JSON_PROPERTY_TARGET,
  LogsArrayProcessorOperationAppend.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsArrayProcessorOperationAppend {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PRESERVE_SOURCE = "preserve_source";
  private Boolean preserveSource = true;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source;

  public static final String JSON_PROPERTY_TARGET = "target";
  private String target;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LogsArrayProcessorOperationAppendType type;

  public LogsArrayProcessorOperationAppend() {}

  @JsonCreator
  public LogsArrayProcessorOperationAppend(
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE) String source,
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGET) String target,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          LogsArrayProcessorOperationAppendType type) {
    this.source = source;
    this.target = target;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public LogsArrayProcessorOperationAppend preserveSource(Boolean preserveSource) {
    this.preserveSource = preserveSource;
    return this;
  }

  /**
   * Remove or preserve the remapped source element.
   *
   * @return preserveSource
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRESERVE_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPreserveSource() {
    return preserveSource;
  }

  public void setPreserveSource(Boolean preserveSource) {
    this.preserveSource = preserveSource;
  }

  public LogsArrayProcessorOperationAppend source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Attribute path containing the value to append.
   *
   * @return source
   */
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public LogsArrayProcessorOperationAppend target(String target) {
    this.target = target;
    return this;
  }

  /**
   * Attribute path of the array to append to.
   *
   * @return target
   */
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public LogsArrayProcessorOperationAppend type(LogsArrayProcessorOperationAppendType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Operation type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogsArrayProcessorOperationAppendType getType() {
    return type;
  }

  public void setType(LogsArrayProcessorOperationAppendType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return LogsArrayProcessorOperationAppend
   */
  @JsonAnySetter
  public LogsArrayProcessorOperationAppend putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LogsArrayProcessorOperationAppend object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsArrayProcessorOperationAppend logsArrayProcessorOperationAppend =
        (LogsArrayProcessorOperationAppend) o;
    return Objects.equals(this.preserveSource, logsArrayProcessorOperationAppend.preserveSource)
        && Objects.equals(this.source, logsArrayProcessorOperationAppend.source)
        && Objects.equals(this.target, logsArrayProcessorOperationAppend.target)
        && Objects.equals(this.type, logsArrayProcessorOperationAppend.type)
        && Objects.equals(
            this.additionalProperties, logsArrayProcessorOperationAppend.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preserveSource, source, target, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsArrayProcessorOperationAppend {\n");
    sb.append("    preserveSource: ").append(toIndentedString(preserveSource)).append("\n");
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
