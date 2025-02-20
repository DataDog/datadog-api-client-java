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

/** Options on impossible travel detection method. */
@JsonPropertyOrder({
  SecurityMonitoringRuleImpossibleTravelOptions.JSON_PROPERTY_BASELINE_USER_LOCATIONS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringRuleImpossibleTravelOptions {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BASELINE_USER_LOCATIONS = "baselineUserLocations";
  private Boolean baselineUserLocations;

  public SecurityMonitoringRuleImpossibleTravelOptions baselineUserLocations(
      Boolean baselineUserLocations) {
    this.baselineUserLocations = baselineUserLocations;
    return this;
  }

  /**
   * If true, signals are suppressed for the first 24 hours. In that time, Datadog learns the user's
   * regular access locations. This can be helpful to reduce noise and infer VPN usage or
   * credentialed API access.
   *
   * @return baselineUserLocations
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BASELINE_USER_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getBaselineUserLocations() {
    return baselineUserLocations;
  }

  public void setBaselineUserLocations(Boolean baselineUserLocations) {
    this.baselineUserLocations = baselineUserLocations;
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
   * @return SecurityMonitoringRuleImpossibleTravelOptions
   */
  @JsonAnySetter
  public SecurityMonitoringRuleImpossibleTravelOptions putAdditionalProperty(
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

  /** Return true if this SecurityMonitoringRuleImpossibleTravelOptions object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringRuleImpossibleTravelOptions securityMonitoringRuleImpossibleTravelOptions =
        (SecurityMonitoringRuleImpossibleTravelOptions) o;
    return Objects.equals(
            this.baselineUserLocations,
            securityMonitoringRuleImpossibleTravelOptions.baselineUserLocations)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringRuleImpossibleTravelOptions.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baselineUserLocations, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringRuleImpossibleTravelOptions {\n");
    sb.append("    baselineUserLocations: ")
        .append(toIndentedString(baselineUserLocations))
        .append("\n");
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
