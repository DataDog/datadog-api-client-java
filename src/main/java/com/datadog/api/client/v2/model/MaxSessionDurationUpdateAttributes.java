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

/** Attributes for updating maximum session duration. */
@JsonPropertyOrder({MaxSessionDurationUpdateAttributes.JSON_PROPERTY_MAX_SESSION_DURATION})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MaxSessionDurationUpdateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MAX_SESSION_DURATION = "max_session_duration";
  private Long maxSessionDuration;

  public MaxSessionDurationUpdateAttributes() {}

  @JsonCreator
  public MaxSessionDurationUpdateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_MAX_SESSION_DURATION)
          Long maxSessionDuration) {
    this.maxSessionDuration = maxSessionDuration;
  }

  public MaxSessionDurationUpdateAttributes maxSessionDuration(Long maxSessionDuration) {
    this.maxSessionDuration = maxSessionDuration;
    return this;
  }

  /**
   * Maximum session duration in seconds. Must not exceed 30 days (2592000 seconds). Note:
   * Government cloud environments are limited to 24 hours (86400 seconds). minimum: 1 maximum:
   * 2592000
   *
   * @return maxSessionDuration
   */
  @JsonProperty(JSON_PROPERTY_MAX_SESSION_DURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getMaxSessionDuration() {
    return maxSessionDuration;
  }

  public void setMaxSessionDuration(Long maxSessionDuration) {
    this.maxSessionDuration = maxSessionDuration;
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
   * @return MaxSessionDurationUpdateAttributes
   */
  @JsonAnySetter
  public MaxSessionDurationUpdateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this MaxSessionDurationUpdateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaxSessionDurationUpdateAttributes maxSessionDurationUpdateAttributes =
        (MaxSessionDurationUpdateAttributes) o;
    return Objects.equals(
            this.maxSessionDuration, maxSessionDurationUpdateAttributes.maxSessionDuration)
        && Objects.equals(
            this.additionalProperties, maxSessionDurationUpdateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxSessionDuration, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaxSessionDurationUpdateAttributes {\n");
    sb.append("    maxSessionDuration: ").append(toIndentedString(maxSessionDuration)).append("\n");
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
