/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Object with all metric related metadata. */
@JsonPropertyOrder({
  MetricMetadata.JSON_PROPERTY_DESCRIPTION,
  MetricMetadata.JSON_PROPERTY_INTEGRATION,
  MetricMetadata.JSON_PROPERTY_PER_UNIT,
  MetricMetadata.JSON_PROPERTY_SHORT_NAME,
  MetricMetadata.JSON_PROPERTY_STATSD_INTERVAL,
  MetricMetadata.JSON_PROPERTY_TYPE,
  MetricMetadata.JSON_PROPERTY_UNIT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MetricMetadata {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_INTEGRATION = "integration";
  private String integration;

  public static final String JSON_PROPERTY_PER_UNIT = "per_unit";
  private String perUnit;

  public static final String JSON_PROPERTY_SHORT_NAME = "short_name";
  private String shortName;

  public static final String JSON_PROPERTY_STATSD_INTERVAL = "statsd_interval";
  private Long statsdInterval;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_UNIT = "unit";
  private String unit;

  public MetricMetadata description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Metric description.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Name of the integration that sent the metric if applicable.
   *
   * @return integration
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIntegration() {
    return integration;
  }

  public MetricMetadata perUnit(String perUnit) {
    this.perUnit = perUnit;
    return this;
  }

  /**
   * Per unit of the metric such as <code>second</code> in <code>bytes per second</code>.
   *
   * @return perUnit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PER_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPerUnit() {
    return perUnit;
  }

  public void setPerUnit(String perUnit) {
    this.perUnit = perUnit;
  }

  public MetricMetadata shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

  /**
   * A more human-readable and abbreviated version of the metric name.
   *
   * @return shortName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHORT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public MetricMetadata statsdInterval(Long statsdInterval) {
    this.statsdInterval = statsdInterval;
    return this;
  }

  /**
   * StatsD flush interval of the metric in seconds if applicable.
   *
   * @return statsdInterval
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATSD_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getStatsdInterval() {
    return statsdInterval;
  }

  public void setStatsdInterval(Long statsdInterval) {
    this.statsdInterval = statsdInterval;
  }

  public MetricMetadata type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Metric type such as <code>gauge</code> or <code>rate</code>.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public MetricMetadata unit(String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Primary unit of the metric such as <code>byte</code> or <code>operation</code>.
   *
   * @return unit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
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
   * @return MetricMetadata
   */
  @JsonAnySetter
  public MetricMetadata putAdditionalProperty(String key, Object value) {
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

  /** Return true if this MetricMetadata object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricMetadata metricMetadata = (MetricMetadata) o;
    return Objects.equals(this.description, metricMetadata.description)
        && Objects.equals(this.integration, metricMetadata.integration)
        && Objects.equals(this.perUnit, metricMetadata.perUnit)
        && Objects.equals(this.shortName, metricMetadata.shortName)
        && Objects.equals(this.statsdInterval, metricMetadata.statsdInterval)
        && Objects.equals(this.type, metricMetadata.type)
        && Objects.equals(this.unit, metricMetadata.unit)
        && Objects.equals(this.additionalProperties, metricMetadata.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        description,
        integration,
        perUnit,
        shortName,
        statsdInterval,
        type,
        unit,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricMetadata {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    integration: ").append(toIndentedString(integration)).append("\n");
    sb.append("    perUnit: ").append(toIndentedString(perUnit)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    statsdInterval: ").append(toIndentedString(statsdInterval)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
