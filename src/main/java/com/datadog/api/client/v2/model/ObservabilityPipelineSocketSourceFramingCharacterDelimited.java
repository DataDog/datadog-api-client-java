/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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

/** Byte frames which are delimited by a chosen character. */
@JsonPropertyOrder({
  ObservabilityPipelineSocketSourceFramingCharacterDelimited.JSON_PROPERTY_DELIMITER,
  ObservabilityPipelineSocketSourceFramingCharacterDelimited.JSON_PROPERTY_METHOD
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineSocketSourceFramingCharacterDelimited {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DELIMITER = "delimiter";
  private String delimiter;

  public static final String JSON_PROPERTY_METHOD = "method";
  private ObservabilityPipelineSocketSourceFramingCharacterDelimitedMethod method;

  public ObservabilityPipelineSocketSourceFramingCharacterDelimited() {}

  @JsonCreator
  public ObservabilityPipelineSocketSourceFramingCharacterDelimited(
      @JsonProperty(required = true, value = JSON_PROPERTY_DELIMITER) String delimiter,
      @JsonProperty(required = true, value = JSON_PROPERTY_METHOD)
          ObservabilityPipelineSocketSourceFramingCharacterDelimitedMethod method) {
    this.delimiter = delimiter;
    this.method = method;
    this.unparsed |= !method.isValid();
  }

  public ObservabilityPipelineSocketSourceFramingCharacterDelimited delimiter(String delimiter) {
    this.delimiter = delimiter;
    return this;
  }

  /**
   * A single ASCII character used to delimit events.
   *
   * @return delimiter
   */
  @JsonProperty(JSON_PROPERTY_DELIMITER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDelimiter() {
    return delimiter;
  }

  public void setDelimiter(String delimiter) {
    this.delimiter = delimiter;
  }

  public ObservabilityPipelineSocketSourceFramingCharacterDelimited method(
      ObservabilityPipelineSocketSourceFramingCharacterDelimitedMethod method) {
    this.method = method;
    this.unparsed |= !method.isValid();
    return this;
  }

  /**
   * Byte frames which are delimited by a chosen character.
   *
   * @return method
   */
  @JsonProperty(JSON_PROPERTY_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineSocketSourceFramingCharacterDelimitedMethod getMethod() {
    return method;
  }

  public void setMethod(ObservabilityPipelineSocketSourceFramingCharacterDelimitedMethod method) {
    if (!method.isValid()) {
      this.unparsed = true;
    }
    this.method = method;
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
   * @return ObservabilityPipelineSocketSourceFramingCharacterDelimited
   */
  @JsonAnySetter
  public ObservabilityPipelineSocketSourceFramingCharacterDelimited putAdditionalProperty(
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

  /**
   * Return true if this ObservabilityPipelineSocketSourceFramingCharacterDelimited object is equal
   * to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineSocketSourceFramingCharacterDelimited
        observabilityPipelineSocketSourceFramingCharacterDelimited =
            (ObservabilityPipelineSocketSourceFramingCharacterDelimited) o;
    return Objects.equals(
            this.delimiter, observabilityPipelineSocketSourceFramingCharacterDelimited.delimiter)
        && Objects.equals(
            this.method, observabilityPipelineSocketSourceFramingCharacterDelimited.method)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineSocketSourceFramingCharacterDelimited.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delimiter, method, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineSocketSourceFramingCharacterDelimited {\n");
    sb.append("    delimiter: ").append(toIndentedString(delimiter)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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
