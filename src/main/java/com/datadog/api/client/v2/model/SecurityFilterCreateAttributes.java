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

/** Object containing the attributes of the security filter to be created. */
@JsonPropertyOrder({
  SecurityFilterCreateAttributes.JSON_PROPERTY_EXCLUSION_FILTERS,
  SecurityFilterCreateAttributes.JSON_PROPERTY_FILTERED_DATA_TYPE,
  SecurityFilterCreateAttributes.JSON_PROPERTY_IS_ENABLED,
  SecurityFilterCreateAttributes.JSON_PROPERTY_NAME,
  SecurityFilterCreateAttributes.JSON_PROPERTY_QUERY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityFilterCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EXCLUSION_FILTERS = "exclusion_filters";
  private List<SecurityFilterExclusionFilter> exclusionFilters = new ArrayList<>();

  public static final String JSON_PROPERTY_FILTERED_DATA_TYPE = "filtered_data_type";
  private SecurityFilterFilteredDataType filteredDataType;

  public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
  private Boolean isEnabled;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public SecurityFilterCreateAttributes() {}

  @JsonCreator
  public SecurityFilterCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_EXCLUSION_FILTERS)
          List<SecurityFilterExclusionFilter> exclusionFilters,
      @JsonProperty(required = true, value = JSON_PROPERTY_FILTERED_DATA_TYPE)
          SecurityFilterFilteredDataType filteredDataType,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_ENABLED) Boolean isEnabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) String query) {
    this.exclusionFilters = exclusionFilters;
    this.filteredDataType = filteredDataType;
    this.unparsed |= !filteredDataType.isValid();
    this.isEnabled = isEnabled;
    this.name = name;
    this.query = query;
  }

  public SecurityFilterCreateAttributes exclusionFilters(
      List<SecurityFilterExclusionFilter> exclusionFilters) {
    this.exclusionFilters = exclusionFilters;
    for (SecurityFilterExclusionFilter item : exclusionFilters) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SecurityFilterCreateAttributes addExclusionFiltersItem(
      SecurityFilterExclusionFilter exclusionFiltersItem) {
    this.exclusionFilters.add(exclusionFiltersItem);
    this.unparsed |= exclusionFiltersItem.unparsed;
    return this;
  }

  /**
   * Exclusion filters to exclude some logs from the security filter.
   *
   * @return exclusionFilters
   */
  @JsonProperty(JSON_PROPERTY_EXCLUSION_FILTERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SecurityFilterExclusionFilter> getExclusionFilters() {
    return exclusionFilters;
  }

  public void setExclusionFilters(List<SecurityFilterExclusionFilter> exclusionFilters) {
    this.exclusionFilters = exclusionFilters;
  }

  public SecurityFilterCreateAttributes filteredDataType(
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
  @JsonProperty(JSON_PROPERTY_FILTERED_DATA_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityFilterFilteredDataType getFilteredDataType() {
    return filteredDataType;
  }

  public void setFilteredDataType(SecurityFilterFilteredDataType filteredDataType) {
    if (!filteredDataType.isValid()) {
      this.unparsed = true;
    }
    this.filteredDataType = filteredDataType;
  }

  public SecurityFilterCreateAttributes isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * Whether the security filter is enabled.
   *
   * @return isEnabled
   */
  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public SecurityFilterCreateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the security filter.
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

  public SecurityFilterCreateAttributes query(String query) {
    this.query = query;
    return this;
  }

  /**
   * The query of the security filter.
   *
   * @return query
   */
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
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
   * @return SecurityFilterCreateAttributes
   */
  @JsonAnySetter
  public SecurityFilterCreateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SecurityFilterCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityFilterCreateAttributes securityFilterCreateAttributes =
        (SecurityFilterCreateAttributes) o;
    return Objects.equals(this.exclusionFilters, securityFilterCreateAttributes.exclusionFilters)
        && Objects.equals(this.filteredDataType, securityFilterCreateAttributes.filteredDataType)
        && Objects.equals(this.isEnabled, securityFilterCreateAttributes.isEnabled)
        && Objects.equals(this.name, securityFilterCreateAttributes.name)
        && Objects.equals(this.query, securityFilterCreateAttributes.query)
        && Objects.equals(
            this.additionalProperties, securityFilterCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        exclusionFilters, filteredDataType, isEnabled, name, query, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityFilterCreateAttributes {\n");
    sb.append("    exclusionFilters: ").append(toIndentedString(exclusionFilters)).append("\n");
    sb.append("    filteredDataType: ").append(toIndentedString(filteredDataType)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
