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

/** The object describing attributes of a RUM retention filter. */
@JsonPropertyOrder({
  RumRetentionFilterAttributes.JSON_PROPERTY_ENABLED,
  RumRetentionFilterAttributes.JSON_PROPERTY_EVENT_TYPE,
  RumRetentionFilterAttributes.JSON_PROPERTY_NAME,
  RumRetentionFilterAttributes.JSON_PROPERTY_QUERY,
  RumRetentionFilterAttributes.JSON_PROPERTY_SAMPLE_RATE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumRetentionFilterAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_EVENT_TYPE = "event_type";
  private RumRetentionFilterEventType eventType;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_SAMPLE_RATE = "sample_rate";
  private Double sampleRate;

  public RumRetentionFilterAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether the retention filter is enabled.
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

  public RumRetentionFilterAttributes eventType(RumRetentionFilterEventType eventType) {
    this.eventType = eventType;
    this.unparsed |= !eventType.isValid();
    return this;
  }

  /**
   * The type of RUM events to filter on.
   *
   * @return eventType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RumRetentionFilterEventType getEventType() {
    return eventType;
  }

  public void setEventType(RumRetentionFilterEventType eventType) {
    if (!eventType.isValid()) {
      this.unparsed = true;
    }
    this.eventType = eventType;
  }

  public RumRetentionFilterAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of a RUM retention filter.
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

  public RumRetentionFilterAttributes query(String query) {
    this.query = query;
    return this;
  }

  /**
   * The query string for a RUM retention filter.
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

  public RumRetentionFilterAttributes sampleRate(Double sampleRate) {
    this.sampleRate = sampleRate;
    return this;
  }

  /**
   * The sample rate for a RUM retention filter, between 0.1 and 100. minimum: 0.1 maximum: 100
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
   * @return RumRetentionFilterAttributes
   */
  @JsonAnySetter
  public RumRetentionFilterAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RumRetentionFilterAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RumRetentionFilterAttributes rumRetentionFilterAttributes = (RumRetentionFilterAttributes) o;
    return Objects.equals(this.enabled, rumRetentionFilterAttributes.enabled)
        && Objects.equals(this.eventType, rumRetentionFilterAttributes.eventType)
        && Objects.equals(this.name, rumRetentionFilterAttributes.name)
        && Objects.equals(this.query, rumRetentionFilterAttributes.query)
        && Objects.equals(this.sampleRate, rumRetentionFilterAttributes.sampleRate)
        && Objects.equals(
            this.additionalProperties, rumRetentionFilterAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, eventType, name, query, sampleRate, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RumRetentionFilterAttributes {\n");
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
