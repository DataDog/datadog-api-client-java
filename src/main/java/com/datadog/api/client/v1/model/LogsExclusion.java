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

/** Represents the index exclusion filter object from configuration API. */
@JsonPropertyOrder({
  LogsExclusion.JSON_PROPERTY_FILTER,
  LogsExclusion.JSON_PROPERTY_IS_ENABLED,
  LogsExclusion.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsExclusion {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILTER = "filter";
  private LogsExclusionFilter filter;

  public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
  private Boolean isEnabled;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public LogsExclusion() {}

  @JsonCreator
  public LogsExclusion(@JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.name = name;
  }

  public LogsExclusion filter(LogsExclusionFilter filter) {
    this.filter = filter;
    this.unparsed |= filter.unparsed;
    return this;
  }

  /**
   * Exclusion filter is defined by a query, a sampling rule, and a active/inactive toggle.
   *
   * @return filter
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LogsExclusionFilter getFilter() {
    return filter;
  }

  public void setFilter(LogsExclusionFilter filter) {
    this.filter = filter;
  }

  public LogsExclusion isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * Whether or not the exclusion filter is active.
   *
   * @return isEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public LogsExclusion name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the index exclusion filter.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
   * @return LogsExclusion
   */
  @JsonAnySetter
  public LogsExclusion putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LogsExclusion object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsExclusion logsExclusion = (LogsExclusion) o;
    return Objects.equals(this.filter, logsExclusion.filter)
        && Objects.equals(this.isEnabled, logsExclusion.isEnabled)
        && Objects.equals(this.name, logsExclusion.name)
        && Objects.equals(this.additionalProperties, logsExclusion.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, isEnabled, name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsExclusion {\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
