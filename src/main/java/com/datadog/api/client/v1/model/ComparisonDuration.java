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
 * The comparison period. Use a preset <code>type</code> value or set <code>type</code> to <code>
 * custom_timeframe</code> and provide <code>custom_timeframe</code> with explicit millisecond epoch
 * bounds.
 */
@JsonPropertyOrder({
  ComparisonDuration.JSON_PROPERTY_CUSTOM_TIMEFRAME,
  ComparisonDuration.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ComparisonDuration {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUSTOM_TIMEFRAME = "custom_timeframe";
  private ComparisonCustomTimeframe customTimeframe;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ComparisonDurationType type;

  public ComparisonDuration() {}

  @JsonCreator
  public ComparisonDuration(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) ComparisonDurationType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ComparisonDuration customTimeframe(ComparisonCustomTimeframe customTimeframe) {
    this.customTimeframe = customTimeframe;
    this.unparsed |= customTimeframe.unparsed;
    return this;
  }

  /**
   * Fixed time range for a <code>custom_timeframe</code> comparison.
   *
   * @return customTimeframe
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_TIMEFRAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ComparisonCustomTimeframe getCustomTimeframe() {
    return customTimeframe;
  }

  public void setCustomTimeframe(ComparisonCustomTimeframe customTimeframe) {
    this.customTimeframe = customTimeframe;
    if (customTimeframe != null) {
      this.unparsed |= customTimeframe.unparsed;
    }
  }

  public ComparisonDuration type(ComparisonDurationType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The comparison window type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ComparisonDurationType getType() {
    return type;
  }

  public void setType(ComparisonDurationType type) {
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
   * @return ComparisonDuration
   */
  @JsonAnySetter
  public ComparisonDuration putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ComparisonDuration object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComparisonDuration comparisonDuration = (ComparisonDuration) o;
    return Objects.equals(this.customTimeframe, comparisonDuration.customTimeframe)
        && Objects.equals(this.type, comparisonDuration.type)
        && Objects.equals(this.additionalProperties, comparisonDuration.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customTimeframe, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComparisonDuration {\n");
    sb.append("    customTimeframe: ").append(toIndentedString(customTimeframe)).append("\n");
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
