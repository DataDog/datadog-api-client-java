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

/** Anomaly detection configuration used for the result. */
@JsonPropertyOrder({
  TimeseriesAnomalyInvestigationDetection.JSON_PROPERTY_CONFIGURATION_SOURCE,
  TimeseriesAnomalyInvestigationDetection.JSON_PROPERTY_PROFILE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TimeseriesAnomalyInvestigationDetection {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFIGURATION_SOURCE = "configuration_source";
  private TimeseriesAnomalyInvestigationConfigurationSource configurationSource;

  public static final String JSON_PROPERTY_PROFILE = "profile";
  private String profile;

  public TimeseriesAnomalyInvestigationDetection() {}

  @JsonCreator
  public TimeseriesAnomalyInvestigationDetection(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONFIGURATION_SOURCE)
          TimeseriesAnomalyInvestigationConfigurationSource configurationSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROFILE) String profile) {
    this.configurationSource = configurationSource;
    this.unparsed |= !configurationSource.isValid();
    this.profile = profile;
    if (profile != null) {}
  }

  public TimeseriesAnomalyInvestigationDetection configurationSource(
      TimeseriesAnomalyInvestigationConfigurationSource configurationSource) {
    this.configurationSource = configurationSource;
    this.unparsed |= !configurationSource.isValid();
    return this;
  }

  /**
   * Source of the anomaly detection configuration.
   *
   * @return configurationSource
   */
  @JsonProperty(JSON_PROPERTY_CONFIGURATION_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TimeseriesAnomalyInvestigationConfigurationSource getConfigurationSource() {
    return configurationSource;
  }

  public void setConfigurationSource(
      TimeseriesAnomalyInvestigationConfigurationSource configurationSource) {
    if (!configurationSource.isValid()) {
      this.unparsed = true;
    }
    this.configurationSource = configurationSource;
  }

  public TimeseriesAnomalyInvestigationDetection profile(String profile) {
    this.profile = profile;
    if (profile != null) {}
    return this;
  }

  /**
   * Applied Watchdog Explains profile, or null when the request supplied an explicit <code>
   * anomalies()</code> formula. The current Watchdog profile is <code>watchdog_explains_v1</code>.
   *
   * @return profile
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROFILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getProfile() {
    return profile;
  }

  public void setProfile(String profile) {
    this.profile = profile;
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
   * @return TimeseriesAnomalyInvestigationDetection
   */
  @JsonAnySetter
  public TimeseriesAnomalyInvestigationDetection putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TimeseriesAnomalyInvestigationDetection object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeseriesAnomalyInvestigationDetection timeseriesAnomalyInvestigationDetection =
        (TimeseriesAnomalyInvestigationDetection) o;
    return Objects.equals(
            this.configurationSource, timeseriesAnomalyInvestigationDetection.configurationSource)
        && Objects.equals(this.profile, timeseriesAnomalyInvestigationDetection.profile)
        && Objects.equals(
            this.additionalProperties,
            timeseriesAnomalyInvestigationDetection.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurationSource, profile, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeseriesAnomalyInvestigationDetection {\n");
    sb.append("    configurationSource: ")
        .append(toIndentedString(configurationSource))
        .append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
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
