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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** The security filters properties to be updated. */
@JsonPropertyOrder({
  SecurityFilterUpdateAttributes.JSON_PROPERTY_EXCLUSION_FILTERS,
  SecurityFilterUpdateAttributes.JSON_PROPERTY_FILTERED_DATA_TYPE,
  SecurityFilterUpdateAttributes.JSON_PROPERTY_IS_ENABLED,
  SecurityFilterUpdateAttributes.JSON_PROPERTY_NAME,
  SecurityFilterUpdateAttributes.JSON_PROPERTY_QUERY,
  SecurityFilterUpdateAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityFilterUpdateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EXCLUSION_FILTERS = "exclusion_filters";
  private List<SecurityFilterExclusionFilter> exclusionFilters = null;

  public static final String JSON_PROPERTY_FILTERED_DATA_TYPE = "filtered_data_type";
  private SecurityFilterFilteredDataType filteredDataType;

  public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
  private Boolean isEnabled;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public SecurityFilterUpdateAttributes exclusionFilters(
      List<SecurityFilterExclusionFilter> exclusionFilters) {
    this.exclusionFilters = exclusionFilters;
    for (SecurityFilterExclusionFilter item : exclusionFilters) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SecurityFilterUpdateAttributes addExclusionFiltersItem(
      SecurityFilterExclusionFilter exclusionFiltersItem) {
    if (this.exclusionFilters == null) {
      this.exclusionFilters = new ArrayList<>();
    }
    this.exclusionFilters.add(exclusionFiltersItem);
    this.unparsed |= exclusionFiltersItem.unparsed;
    return this;
  }

  /**
   * Exclusion filters to exclude some logs from the security filter.
   *
   * @return exclusionFilters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCLUSION_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SecurityFilterExclusionFilter> getExclusionFilters() {
    return exclusionFilters;
  }

  public void setExclusionFilters(List<SecurityFilterExclusionFilter> exclusionFilters) {
    this.exclusionFilters = exclusionFilters;
  }

  public SecurityFilterUpdateAttributes filteredDataType(
      SecurityFilterFilteredDataType filteredDataType) {
    this.filteredDataType = filteredDataType;
    this.unparsed |= !filteredDataType.isValid();
    return this;
  }

  /**
   * The filtered data type.
   *
   * @return filteredDataType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTERED_DATA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityFilterFilteredDataType getFilteredDataType() {
    return filteredDataType;
  }

  public void setFilteredDataType(SecurityFilterFilteredDataType filteredDataType) {
    if (!filteredDataType.isValid()) {
      this.unparsed = true;
    }
    this.filteredDataType = filteredDataType;
  }

  public SecurityFilterUpdateAttributes isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * Whether the security filter is enabled.
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

  public SecurityFilterUpdateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the security filter.
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

  public SecurityFilterUpdateAttributes query(String query) {
    this.query = query;
    return this;
  }

  /**
   * The query of the security filter.
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

  public SecurityFilterUpdateAttributes version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the security filter to update. maximum: 2147483647
   *
   * @return version
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * @return SecurityFilterUpdateAttributes
   */
  @JsonAnySetter
  public SecurityFilterUpdateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SecurityFilterUpdateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityFilterUpdateAttributes securityFilterUpdateAttributes =
        (SecurityFilterUpdateAttributes) o;
    return Objects.equals(this.exclusionFilters, securityFilterUpdateAttributes.exclusionFilters)
        && Objects.equals(this.filteredDataType, securityFilterUpdateAttributes.filteredDataType)
        && Objects.equals(this.isEnabled, securityFilterUpdateAttributes.isEnabled)
        && Objects.equals(this.name, securityFilterUpdateAttributes.name)
        && Objects.equals(this.query, securityFilterUpdateAttributes.query)
        && Objects.equals(this.version, securityFilterUpdateAttributes.version)
        && Objects.equals(
            this.additionalProperties, securityFilterUpdateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        exclusionFilters, filteredDataType, isEnabled, name, query, version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityFilterUpdateAttributes {\n");
    sb.append("    exclusionFilters: ").append(toIndentedString(exclusionFilters)).append("\n");
    sb.append("    filteredDataType: ").append(toIndentedString(filteredDataType)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
