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

/**
 * Use this processor to remove an attribute from a log during processing. The processor strips the
 * specified attribute from the log event, which is useful when the attribute contains sensitive
 * data or is no longer needed downstream.
 */
@JsonPropertyOrder({
  LogsExcludeAttributeProcessor.JSON_PROPERTY_ATTRIBUTE_TO_EXCLUDE,
  LogsExcludeAttributeProcessor.JSON_PROPERTY_IS_ENABLED,
  LogsExcludeAttributeProcessor.JSON_PROPERTY_NAME,
  LogsExcludeAttributeProcessor.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsExcludeAttributeProcessor {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTE_TO_EXCLUDE = "attribute_to_exclude";
  private String attributeToExclude;

  public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
  private Boolean isEnabled = false;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LogsExcludeAttributeProcessorType type =
      LogsExcludeAttributeProcessorType.EXCLUDE_ATTRIBUTE;

  public LogsExcludeAttributeProcessor() {}

  @JsonCreator
  public LogsExcludeAttributeProcessor(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTE_TO_EXCLUDE)
          String attributeToExclude,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          LogsExcludeAttributeProcessorType type) {
    this.attributeToExclude = attributeToExclude;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public LogsExcludeAttributeProcessor attributeToExclude(String attributeToExclude) {
    this.attributeToExclude = attributeToExclude;
    return this;
  }

  /**
   * Name of the log attribute to remove from the log event.
   *
   * @return attributeToExclude
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTE_TO_EXCLUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAttributeToExclude() {
    return attributeToExclude;
  }

  public void setAttributeToExclude(String attributeToExclude) {
    this.attributeToExclude = attributeToExclude;
  }

  public LogsExcludeAttributeProcessor isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * Whether or not the processor is enabled.
   *
   * @return isEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public LogsExcludeAttributeProcessor name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the processor.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LogsExcludeAttributeProcessor type(LogsExcludeAttributeProcessorType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of logs exclude attribute processor.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogsExcludeAttributeProcessorType getType() {
    return type;
  }

  public void setType(LogsExcludeAttributeProcessorType type) {
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
   * @return LogsExcludeAttributeProcessor
   */
  @JsonAnySetter
  public LogsExcludeAttributeProcessor putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LogsExcludeAttributeProcessor object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsExcludeAttributeProcessor logsExcludeAttributeProcessor = (LogsExcludeAttributeProcessor) o;
    return Objects.equals(this.attributeToExclude, logsExcludeAttributeProcessor.attributeToExclude)
        && Objects.equals(this.isEnabled, logsExcludeAttributeProcessor.isEnabled)
        && Objects.equals(this.name, logsExcludeAttributeProcessor.name)
        && Objects.equals(this.type, logsExcludeAttributeProcessor.type)
        && Objects.equals(
            this.additionalProperties, logsExcludeAttributeProcessor.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeToExclude, isEnabled, name, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsExcludeAttributeProcessor {\n");
    sb.append("    attributeToExclude: ").append(toIndentedString(attributeToExclude)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
