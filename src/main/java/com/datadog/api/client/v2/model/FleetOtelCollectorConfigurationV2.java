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

/** Configuration for a single OpenTelemetry collector associated with the agent. */
@JsonPropertyOrder({
  FleetOtelCollectorConfigurationV2.JSON_PROPERTY_COLLECTOR_ID,
  FleetOtelCollectorConfigurationV2.JSON_PROPERTY_COMPILED_CONFIGURATION,
  FleetOtelCollectorConfigurationV2.JSON_PROPERTY_DISTRIBUTION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetOtelCollectorConfigurationV2 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLLECTOR_ID = "collector_id";
  private String collectorId;

  public static final String JSON_PROPERTY_COMPILED_CONFIGURATION = "compiled_configuration";
  private String compiledConfiguration;

  public static final String JSON_PROPERTY_DISTRIBUTION = "distribution";
  private String distribution;

  public FleetOtelCollectorConfigurationV2 collectorId(String collectorId) {
    this.collectorId = collectorId;
    return this;
  }

  /**
   * The unique identifier of the OpenTelemetry collector.
   *
   * @return collectorId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLLECTOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCollectorId() {
    return collectorId;
  }

  public void setCollectorId(String collectorId) {
    this.collectorId = collectorId;
  }

  public FleetOtelCollectorConfigurationV2 compiledConfiguration(String compiledConfiguration) {
    this.compiledConfiguration = compiledConfiguration;
    return this;
  }

  /**
   * The final compiled configuration of the OpenTelemetry collector.
   *
   * @return compiledConfiguration
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPILED_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCompiledConfiguration() {
    return compiledConfiguration;
  }

  public void setCompiledConfiguration(String compiledConfiguration) {
    this.compiledConfiguration = compiledConfiguration;
  }

  public FleetOtelCollectorConfigurationV2 distribution(String distribution) {
    this.distribution = distribution;
    return this;
  }

  /**
   * The distribution of the OpenTelemetry collector.
   *
   * @return distribution
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISTRIBUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDistribution() {
    return distribution;
  }

  public void setDistribution(String distribution) {
    this.distribution = distribution;
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
   * @return FleetOtelCollectorConfigurationV2
   */
  @JsonAnySetter
  public FleetOtelCollectorConfigurationV2 putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FleetOtelCollectorConfigurationV2 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetOtelCollectorConfigurationV2 fleetOtelCollectorConfigurationV2 =
        (FleetOtelCollectorConfigurationV2) o;
    return Objects.equals(this.collectorId, fleetOtelCollectorConfigurationV2.collectorId)
        && Objects.equals(
            this.compiledConfiguration, fleetOtelCollectorConfigurationV2.compiledConfiguration)
        && Objects.equals(this.distribution, fleetOtelCollectorConfigurationV2.distribution)
        && Objects.equals(
            this.additionalProperties, fleetOtelCollectorConfigurationV2.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectorId, compiledConfiguration, distribution, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetOtelCollectorConfigurationV2 {\n");
    sb.append("    collectorId: ").append(toIndentedString(collectorId)).append("\n");
    sb.append("    compiledConfiguration: ")
        .append(toIndentedString(compiledConfiguration))
        .append("\n");
    sb.append("    distribution: ").append(toIndentedString(distribution)).append("\n");
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
