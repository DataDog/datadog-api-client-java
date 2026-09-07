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
 * Operation that extracts key-value pairs from a <code>source</code> array and stores the result in
 * the <code>target</code> attribute.
 */
@JsonPropertyOrder({
  LogsArrayProcessorOperationExtractKeyValue.JSON_PROPERTY_KEY_TO_EXTRACT,
  LogsArrayProcessorOperationExtractKeyValue.JSON_PROPERTY_OVERRIDE_ON_CONFLICT,
  LogsArrayProcessorOperationExtractKeyValue.JSON_PROPERTY_SOURCE,
  LogsArrayProcessorOperationExtractKeyValue.JSON_PROPERTY_TARGET,
  LogsArrayProcessorOperationExtractKeyValue.JSON_PROPERTY_TYPE,
  LogsArrayProcessorOperationExtractKeyValue.JSON_PROPERTY_VALUE_TO_EXTRACT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsArrayProcessorOperationExtractKeyValue {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_KEY_TO_EXTRACT = "key_to_extract";
  private String keyToExtract;

  public static final String JSON_PROPERTY_OVERRIDE_ON_CONFLICT = "override_on_conflict";
  private Boolean overrideOnConflict = false;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source;

  public static final String JSON_PROPERTY_TARGET = "target";
  private String target;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LogsArrayProcessorOperationExtractKeyValueType type;

  public static final String JSON_PROPERTY_VALUE_TO_EXTRACT = "value_to_extract";
  private String valueToExtract;

  public LogsArrayProcessorOperationExtractKeyValue() {}

  @JsonCreator
  public LogsArrayProcessorOperationExtractKeyValue(
      @JsonProperty(required = true, value = JSON_PROPERTY_KEY_TO_EXTRACT) String keyToExtract,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE) String source,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          LogsArrayProcessorOperationExtractKeyValueType type,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUE_TO_EXTRACT)
          String valueToExtract) {
    this.keyToExtract = keyToExtract;
    this.source = source;
    this.type = type;
    this.unparsed |= !type.isValid();
    this.valueToExtract = valueToExtract;
  }

  public LogsArrayProcessorOperationExtractKeyValue keyToExtract(String keyToExtract) {
    this.keyToExtract = keyToExtract;
    return this;
  }

  /**
   * Key of the attribute in each array element that holds the name to use for the extracted
   * attribute.
   *
   * @return keyToExtract
   */
  @JsonProperty(JSON_PROPERTY_KEY_TO_EXTRACT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getKeyToExtract() {
    return keyToExtract;
  }

  public void setKeyToExtract(String keyToExtract) {
    this.keyToExtract = keyToExtract;
  }

  public LogsArrayProcessorOperationExtractKeyValue overrideOnConflict(Boolean overrideOnConflict) {
    this.overrideOnConflict = overrideOnConflict;
    return this;
  }

  /**
   * Whether to override the target element if it's already set.
   *
   * @return overrideOnConflict
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OVERRIDE_ON_CONFLICT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getOverrideOnConflict() {
    return overrideOnConflict;
  }

  public void setOverrideOnConflict(Boolean overrideOnConflict) {
    this.overrideOnConflict = overrideOnConflict;
  }

  public LogsArrayProcessorOperationExtractKeyValue source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Attribute path of the array to extract key-value pairs from.
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

  public LogsArrayProcessorOperationExtractKeyValue target(String target) {
    this.target = target;
    return this;
  }

  /**
   * Attribute that receives the extracted key-value pairs. If not specified, the extracted
   * attributes are added at the root level of the log.
   *
   * @return target
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public LogsArrayProcessorOperationExtractKeyValue type(
      LogsArrayProcessorOperationExtractKeyValueType type) {
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
  public LogsArrayProcessorOperationExtractKeyValueType getType() {
    return type;
  }

  public void setType(LogsArrayProcessorOperationExtractKeyValueType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public LogsArrayProcessorOperationExtractKeyValue valueToExtract(String valueToExtract) {
    this.valueToExtract = valueToExtract;
    return this;
  }

  /**
   * Key of the attribute in each array element that holds the value to use for the extracted
   * attribute.
   *
   * @return valueToExtract
   */
  @JsonProperty(JSON_PROPERTY_VALUE_TO_EXTRACT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getValueToExtract() {
    return valueToExtract;
  }

  public void setValueToExtract(String valueToExtract) {
    this.valueToExtract = valueToExtract;
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
   * @return LogsArrayProcessorOperationExtractKeyValue
   */
  @JsonAnySetter
  public LogsArrayProcessorOperationExtractKeyValue putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this LogsArrayProcessorOperationExtractKeyValue object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsArrayProcessorOperationExtractKeyValue logsArrayProcessorOperationExtractKeyValue =
        (LogsArrayProcessorOperationExtractKeyValue) o;
    return Objects.equals(
            this.keyToExtract, logsArrayProcessorOperationExtractKeyValue.keyToExtract)
        && Objects.equals(
            this.overrideOnConflict, logsArrayProcessorOperationExtractKeyValue.overrideOnConflict)
        && Objects.equals(this.source, logsArrayProcessorOperationExtractKeyValue.source)
        && Objects.equals(this.target, logsArrayProcessorOperationExtractKeyValue.target)
        && Objects.equals(this.type, logsArrayProcessorOperationExtractKeyValue.type)
        && Objects.equals(
            this.valueToExtract, logsArrayProcessorOperationExtractKeyValue.valueToExtract)
        && Objects.equals(
            this.additionalProperties,
            logsArrayProcessorOperationExtractKeyValue.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        keyToExtract,
        overrideOnConflict,
        source,
        target,
        type,
        valueToExtract,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsArrayProcessorOperationExtractKeyValue {\n");
    sb.append("    keyToExtract: ").append(toIndentedString(keyToExtract)).append("\n");
    sb.append("    overrideOnConflict: ").append(toIndentedString(overrideOnConflict)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    valueToExtract: ").append(toIndentedString(valueToExtract)).append("\n");
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
