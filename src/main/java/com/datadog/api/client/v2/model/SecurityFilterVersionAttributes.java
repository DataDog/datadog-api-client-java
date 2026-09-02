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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** The attributes describing a single security filter configuration version. */
@JsonPropertyOrder({
  SecurityFilterVersionAttributes.JSON_PROPERTY_DATE,
  SecurityFilterVersionAttributes.JSON_PROPERTY_FILTERS,
  SecurityFilterVersionAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityFilterVersionAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATE = "date";
  private Long date;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private List<SecurityFilterVersionEntry> filters = new ArrayList<>();

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public SecurityFilterVersionAttributes() {}

  @JsonCreator
  public SecurityFilterVersionAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATE) Long date,
      @JsonProperty(required = true, value = JSON_PROPERTY_FILTERS)
          List<SecurityFilterVersionEntry> filters,
      @JsonProperty(required = true, value = JSON_PROPERTY_VERSION) Integer version) {
    this.date = date;
    this.filters = filters;
    for (SecurityFilterVersionEntry item : filters) {
      this.unparsed |= item.unparsed;
    }
    this.version = version;
  }

  public SecurityFilterVersionAttributes date(Long date) {
    this.date = date;
    return this;
  }

  /**
   * The Unix timestamp in milliseconds at which this configuration version was applied.
   *
   * @return date
   */
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getDate() {
    return date;
  }

  public void setDate(Long date) {
    this.date = date;
  }

  public SecurityFilterVersionAttributes filters(List<SecurityFilterVersionEntry> filters) {
    this.filters = filters;
    for (SecurityFilterVersionEntry item : filters) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SecurityFilterVersionAttributes addFiltersItem(SecurityFilterVersionEntry filtersItem) {
    this.filters.add(filtersItem);
    this.unparsed |= filtersItem.unparsed;
    return this;
  }

  /**
   * The set of security filters at this configuration version.
   *
   * @return filters
   */
  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SecurityFilterVersionEntry> getFilters() {
    return filters;
  }

  public void setFilters(List<SecurityFilterVersionEntry> filters) {
    this.filters = filters;
    if (filters != null) {
      for (SecurityFilterVersionEntry item : filters) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public SecurityFilterVersionAttributes version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * The configuration version number. maximum: 2147483647
   *
   * @return version
   */
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
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
   * @return SecurityFilterVersionAttributes
   */
  @JsonAnySetter
  public SecurityFilterVersionAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SecurityFilterVersionAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityFilterVersionAttributes securityFilterVersionAttributes =
        (SecurityFilterVersionAttributes) o;
    return Objects.equals(this.date, securityFilterVersionAttributes.date)
        && Objects.equals(this.filters, securityFilterVersionAttributes.filters)
        && Objects.equals(this.version, securityFilterVersionAttributes.version)
        && Objects.equals(
            this.additionalProperties, securityFilterVersionAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, filters, version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityFilterVersionAttributes {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
