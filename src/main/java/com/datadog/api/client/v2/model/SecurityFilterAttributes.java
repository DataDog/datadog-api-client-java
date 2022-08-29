/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>The object describing a security filter.</p>
 */
@JsonPropertyOrder({
  SecurityFilterAttributes.JSON_PROPERTY_EXCLUSION_FILTERS,
  SecurityFilterAttributes.JSON_PROPERTY_FILTERED_DATA_TYPE,
  SecurityFilterAttributes.JSON_PROPERTY_IS_BUILTIN,
  SecurityFilterAttributes.JSON_PROPERTY_IS_ENABLED,
  SecurityFilterAttributes.JSON_PROPERTY_NAME,
  SecurityFilterAttributes.JSON_PROPERTY_QUERY,
  SecurityFilterAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityFilterAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_EXCLUSION_FILTERS = "exclusion_filters";
  private List<SecurityFilterExclusionFilterResponse> exclusionFilters = null;

  public static final String JSON_PROPERTY_FILTERED_DATA_TYPE = "filtered_data_type";
  private SecurityFilterFilteredDataType filteredDataType;

  public static final String JSON_PROPERTY_IS_BUILTIN = "is_builtin";
  private Boolean isBuiltin;

  public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
  private Boolean isEnabled;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public SecurityFilterAttributes exclusionFilters(List<SecurityFilterExclusionFilterResponse> exclusionFilters) {
    this.exclusionFilters = exclusionFilters;
    for (SecurityFilterExclusionFilterResponse item : exclusionFilters) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SecurityFilterAttributes addExclusionFiltersItem(SecurityFilterExclusionFilterResponse exclusionFiltersItem) {
    if (this.exclusionFilters == null) {
      this.exclusionFilters = new ArrayList<>();
    }
    this.exclusionFilters.add(exclusionFiltersItem);
    this.unparsed |= exclusionFiltersItem.unparsed;
    return this;
  }

  /**
   * <p>The list of exclusion filters applied in this security filter.</p>
   * @return exclusionFilters
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EXCLUSION_FILTERS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<SecurityFilterExclusionFilterResponse> getExclusionFilters() {
        return exclusionFilters;
      }
  public void setExclusionFilters(List<SecurityFilterExclusionFilterResponse> exclusionFilters) {
    this.exclusionFilters = exclusionFilters;
  }
  public SecurityFilterAttributes filteredDataType(SecurityFilterFilteredDataType filteredDataType) {
    this.filteredDataType = filteredDataType;
    this.unparsed |= !filteredDataType.isValid();
    return this;
  }

  /**
   * <p>The filtered data type.</p>
   * @return filteredDataType
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FILTERED_DATA_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SecurityFilterFilteredDataType getFilteredDataType() {
        return filteredDataType;
      }
  public void setFilteredDataType(SecurityFilterFilteredDataType filteredDataType) {
    if (!filteredDataType.isValid()) {
        this.unparsed = true;
    }
    this.filteredDataType = filteredDataType;
  }
  public SecurityFilterAttributes isBuiltin(Boolean isBuiltin) {
    this.isBuiltin = isBuiltin;
    return this;
  }

  /**
   * <p>Whether the security filter is the built-in filter.</p>
   * @return isBuiltin
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IS_BUILTIN)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getIsBuiltin() {
        return isBuiltin;
      }
  public void setIsBuiltin(Boolean isBuiltin) {
    this.isBuiltin = isBuiltin;
  }
  public SecurityFilterAttributes isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * <p>Whether the security filter is enabled.</p>
   * @return isEnabled
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IS_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getIsEnabled() {
        return isEnabled;
      }
  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }
  public SecurityFilterAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The security filter name.</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public SecurityFilterAttributes query(String query) {
    this.query = query;
    return this;
  }

  /**
   * <p>The security filter query. Logs accepted by this query will be accepted by this filter.</p>
   * @return query
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getQuery() {
        return query;
      }
  public void setQuery(String query) {
    this.query = query;
  }
  public SecurityFilterAttributes version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * <p>The version of the security filter.</p>
   * maximum: 2147483647
   * @return version
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VERSION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Integer getVersion() {
        return version;
      }
  public void setVersion(Integer version) {
    this.version = version;
  }

  /**
   * Return true if this SecurityFilterAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityFilterAttributes securityFilterAttributes = (SecurityFilterAttributes) o;
    return Objects.equals(this.exclusionFilters, securityFilterAttributes.exclusionFilters) && Objects.equals(this.filteredDataType, securityFilterAttributes.filteredDataType) && Objects.equals(this.isBuiltin, securityFilterAttributes.isBuiltin) && Objects.equals(this.isEnabled, securityFilterAttributes.isEnabled) && Objects.equals(this.name, securityFilterAttributes.name) && Objects.equals(this.query, securityFilterAttributes.query) && Objects.equals(this.version, securityFilterAttributes.version);
  }


  @Override
  public int hashCode() {
    return Objects.hash(exclusionFilters,filteredDataType,isBuiltin,isEnabled,name,query,version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityFilterAttributes {\n");
    sb.append("    exclusionFilters: ").append(toIndentedString(exclusionFilters)).append("\n");
    sb.append("    filteredDataType: ").append(toIndentedString(filteredDataType)).append("\n");
    sb.append("    isBuiltin: ").append(toIndentedString(isBuiltin)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
