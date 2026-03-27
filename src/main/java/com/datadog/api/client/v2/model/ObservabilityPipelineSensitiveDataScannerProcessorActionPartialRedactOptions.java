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

/** Controls how partial redaction is applied, including character count and direction. */
@JsonPropertyOrder({
  ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptions
      .JSON_PROPERTY_CHARACTERS,
  ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptions
      .JSON_PROPERTY_DIRECTION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptions {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHARACTERS = "characters";
  private Long characters;

  public static final String JSON_PROPERTY_DIRECTION = "direction";
  private ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptionsDirection
      direction;

  public ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptions() {}

  @JsonCreator
  public ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptions(
      @JsonProperty(required = true, value = JSON_PROPERTY_CHARACTERS) Long characters,
      @JsonProperty(required = true, value = JSON_PROPERTY_DIRECTION)
          ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptionsDirection
              direction) {
    this.characters = characters;
    this.direction = direction;
    this.unparsed |= !direction.isValid();
  }

  public ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptions characters(
      Long characters) {
    this.characters = characters;
    return this;
  }

  /**
   * Number of characters to leave visible from the start or end of the matched value; the rest are
   * redacted.
   *
   * @return characters
   */
  @JsonProperty(JSON_PROPERTY_CHARACTERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getCharacters() {
    return characters;
  }

  public void setCharacters(Long characters) {
    this.characters = characters;
  }

  public ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptions direction(
      ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptionsDirection
          direction) {
    this.direction = direction;
    this.unparsed |= !direction.isValid();
    return this;
  }

  /**
   * Indicates whether to redact characters from the first or last part of the matched value.
   *
   * @return direction
   */
  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptionsDirection
      getDirection() {
    return direction;
  }

  public void setDirection(
      ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptionsDirection
          direction) {
    if (!direction.isValid()) {
      this.unparsed = true;
    }
    this.direction = direction;
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
   * @return ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptions
   */
  @JsonAnySetter
  public ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptions
      putAdditionalProperty(String key, Object value) {
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
   * Return true if this
   * ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptions object is equal to
   * o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptions
        observabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptions =
            (ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptions) o;
    return Objects.equals(
            this.characters,
            observabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptions.characters)
        && Objects.equals(
            this.direction,
            observabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptions.direction)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptions
                .additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(characters, direction, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(
        "class ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedactOptions {\n");
    sb.append("    characters: ").append(toIndentedString(characters)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
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
