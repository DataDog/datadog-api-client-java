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

/** The attributes of a permanent retention filter. */
@JsonPropertyOrder({
  RumPermanentRetentionFilterAttributes.JSON_PROPERTY_CROSS_PRODUCT_SAMPLING,
  RumPermanentRetentionFilterAttributes.JSON_PROPERTY_CROSS_PRODUCT_SAMPLING_EDITABILITY,
  RumPermanentRetentionFilterAttributes.JSON_PROPERTY_ENABLED,
  RumPermanentRetentionFilterAttributes.JSON_PROPERTY_EVENT_TYPE,
  RumPermanentRetentionFilterAttributes.JSON_PROPERTY_NAME,
  RumPermanentRetentionFilterAttributes.JSON_PROPERTY_QUERY,
  RumPermanentRetentionFilterAttributes.JSON_PROPERTY_SAMPLE_RATE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumPermanentRetentionFilterAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CROSS_PRODUCT_SAMPLING = "cross_product_sampling";
  private RumPermanentCrossProductSampling crossProductSampling;

  public static final String JSON_PROPERTY_CROSS_PRODUCT_SAMPLING_EDITABILITY =
      "cross_product_sampling_editability";
  private RumPermanentCrossProductSamplingEditability crossProductSamplingEditability;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_EVENT_TYPE = "event_type";
  private RumPermanentRetentionFilterEventType eventType;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_SAMPLE_RATE = "sample_rate";
  private Double sampleRate;

  public RumPermanentRetentionFilterAttributes crossProductSampling(
      RumPermanentCrossProductSampling crossProductSampling) {
    this.crossProductSampling = crossProductSampling;
    this.unparsed |= crossProductSampling.unparsed;
    return this;
  }

  /**
   * Cross-product retention settings for a permanent retention filter.
   *
   * @return crossProductSampling
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CROSS_PRODUCT_SAMPLING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RumPermanentCrossProductSampling getCrossProductSampling() {
    return crossProductSampling;
  }

  public void setCrossProductSampling(RumPermanentCrossProductSampling crossProductSampling) {
    this.crossProductSampling = crossProductSampling;
  }

  public RumPermanentRetentionFilterAttributes crossProductSamplingEditability(
      RumPermanentCrossProductSamplingEditability crossProductSamplingEditability) {
    this.crossProductSamplingEditability = crossProductSamplingEditability;
    this.unparsed |= crossProductSamplingEditability.unparsed;
    return this;
  }

  /**
   * Flags indicating which <code>cross_product_sampling</code> rates can be updated for this
   * filter. Read-only.
   *
   * @return crossProductSamplingEditability
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CROSS_PRODUCT_SAMPLING_EDITABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RumPermanentCrossProductSamplingEditability getCrossProductSamplingEditability() {
    return crossProductSamplingEditability;
  }

  public void setCrossProductSamplingEditability(
      RumPermanentCrossProductSamplingEditability crossProductSamplingEditability) {
    this.crossProductSamplingEditability = crossProductSamplingEditability;
  }

  public RumPermanentRetentionFilterAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Indicates whether the permanent retention filter is active. Read-only.
   *
   * @return enabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public RumPermanentRetentionFilterAttributes eventType(
      RumPermanentRetentionFilterEventType eventType) {
    this.eventType = eventType;
    this.unparsed |= !eventType.isValid();
    return this;
  }

  /**
   * The type of RUM events the filter applies to. Read-only.
   *
   * @return eventType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RumPermanentRetentionFilterEventType getEventType() {
    return eventType;
  }

  public void setEventType(RumPermanentRetentionFilterEventType eventType) {
    if (!eventType.isValid()) {
      this.unparsed = true;
    }
    this.eventType = eventType;
  }

  public RumPermanentRetentionFilterAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of a permanent retention filter. Read-only.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RumPermanentRetentionFilterAttributes query(String query) {
    this.query = query;
    return this;
  }

  /**
   * The query string for a permanent retention filter. Read-only.
   *
   * @return query
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public RumPermanentRetentionFilterAttributes sampleRate(Double sampleRate) {
    this.sampleRate = sampleRate;
    return this;
  }

  /**
   * The retention sample rate for a permanent retention filter, from 0 to 100. Read-only. minimum:
   * 0 maximum: 100
   *
   * @return sampleRate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SAMPLE_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getSampleRate() {
    return sampleRate;
  }

  public void setSampleRate(Double sampleRate) {
    this.sampleRate = sampleRate;
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
   * @return RumPermanentRetentionFilterAttributes
   */
  @JsonAnySetter
  public RumPermanentRetentionFilterAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RumPermanentRetentionFilterAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RumPermanentRetentionFilterAttributes rumPermanentRetentionFilterAttributes =
        (RumPermanentRetentionFilterAttributes) o;
    return Objects.equals(
            this.crossProductSampling, rumPermanentRetentionFilterAttributes.crossProductSampling)
        && Objects.equals(
            this.crossProductSamplingEditability,
            rumPermanentRetentionFilterAttributes.crossProductSamplingEditability)
        && Objects.equals(this.enabled, rumPermanentRetentionFilterAttributes.enabled)
        && Objects.equals(this.eventType, rumPermanentRetentionFilterAttributes.eventType)
        && Objects.equals(this.name, rumPermanentRetentionFilterAttributes.name)
        && Objects.equals(this.query, rumPermanentRetentionFilterAttributes.query)
        && Objects.equals(this.sampleRate, rumPermanentRetentionFilterAttributes.sampleRate)
        && Objects.equals(
            this.additionalProperties, rumPermanentRetentionFilterAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        crossProductSampling,
        crossProductSamplingEditability,
        enabled,
        eventType,
        name,
        query,
        sampleRate,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RumPermanentRetentionFilterAttributes {\n");
    sb.append("    crossProductSampling: ")
        .append(toIndentedString(crossProductSampling))
        .append("\n");
    sb.append("    crossProductSamplingEditability: ")
        .append(toIndentedString(crossProductSamplingEditability))
        .append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    sampleRate: ").append(toIndentedString(sampleRate)).append("\n");
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
