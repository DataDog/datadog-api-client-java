/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** The rule to count updatable events. Is only set if "event_type" is "sessions" or "views". */
@JsonPropertyOrder({RumMetricResponseUniqueness.JSON_PROPERTY_WHEN})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumMetricResponseUniqueness {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_WHEN = "when";
  private RumMetricUniquenessWhen when;

  public RumMetricResponseUniqueness when(RumMetricUniquenessWhen when) {
    this.when = when;
    this.unparsed |= !when.isValid();
    return this;
  }

  /**
   * When to count updatable events. "match" when the event is first seen, or "end" when the event
   * is complete.
   *
   * @return when
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WHEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RumMetricUniquenessWhen getWhen() {
    return when;
  }

  public void setWhen(RumMetricUniquenessWhen when) {
    if (!when.isValid()) {
      this.unparsed = true;
    }
    this.when = when;
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
   * @return RumMetricResponseUniqueness
   */
  @JsonAnySetter
  public RumMetricResponseUniqueness putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RumMetricResponseUniqueness object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RumMetricResponseUniqueness rumMetricResponseUniqueness = (RumMetricResponseUniqueness) o;
    return Objects.equals(this.when, rumMetricResponseUniqueness.when)
        && Objects.equals(
            this.additionalProperties, rumMetricResponseUniqueness.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(when, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RumMetricResponseUniqueness {\n");
    sb.append("    when: ").append(toIndentedString(when)).append("\n");
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
