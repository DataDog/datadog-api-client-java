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
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Used to override hardcoded category values with a value pulled from a source attribute on the
 * log.
 */
@JsonPropertyOrder({
  LogsSchemaCategoryMapperFallback.JSON_PROPERTY_SOURCES,
  LogsSchemaCategoryMapperFallback.JSON_PROPERTY_VALUES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsSchemaCategoryMapperFallback {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SOURCES = "sources";
  private Map<String, List<String>> sources = null;

  public static final String JSON_PROPERTY_VALUES = "values";
  private Map<String, String> values = null;

  public LogsSchemaCategoryMapperFallback sources(Map<String, List<String>> sources) {
    this.sources = sources;
    return this;
  }

  public LogsSchemaCategoryMapperFallback putSourcesItem(String key, List<String> sourcesItem) {
    if (this.sources == null) {
      this.sources = new HashMap<>();
    }
    this.sources.put(key, sourcesItem);
    return this;
  }

  /**
   * Fallback sources used to populate value of field.
   *
   * @return sources
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, List<String>> getSources() {
    return sources;
  }

  public void setSources(Map<String, List<String>> sources) {
    this.sources = sources;
  }

  public LogsSchemaCategoryMapperFallback values(Map<String, String> values) {
    this.values = values;
    return this;
  }

  public LogsSchemaCategoryMapperFallback putValuesItem(String key, String valuesItem) {
    if (this.values == null) {
      this.values = new HashMap<>();
    }
    this.values.put(key, valuesItem);
    return this;
  }

  /**
   * Values that define when the fallback is used.
   *
   * @return values
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getValues() {
    return values;
  }

  public void setValues(Map<String, String> values) {
    this.values = values;
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
   * @return LogsSchemaCategoryMapperFallback
   */
  @JsonAnySetter
  public LogsSchemaCategoryMapperFallback putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LogsSchemaCategoryMapperFallback object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsSchemaCategoryMapperFallback logsSchemaCategoryMapperFallback =
        (LogsSchemaCategoryMapperFallback) o;
    return Objects.equals(this.sources, logsSchemaCategoryMapperFallback.sources)
        && Objects.equals(this.values, logsSchemaCategoryMapperFallback.values)
        && Objects.equals(
            this.additionalProperties, logsSchemaCategoryMapperFallback.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sources, values, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsSchemaCategoryMapperFallback {\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
