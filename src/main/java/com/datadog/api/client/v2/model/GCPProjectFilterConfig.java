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

/**
 * Configuration for filtering the GCP projects that Datadog monitors by project ID or by project
 * label.
 */
@JsonPropertyOrder({
  GCPProjectFilterConfig.JSON_PROPERTY_FILTERS,
  GCPProjectFilterConfig.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GCPProjectFilterConfig {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILTERS = "filters";
  private List<String> filters = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private GCPProjectFilterConfigType type;

  public GCPProjectFilterConfig filters(List<String> filters) {
    this.filters = filters;
    return this;
  }

  public GCPProjectFilterConfig addFiltersItem(String filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

  /**
   * List of filters matched against the project field set by <code>type</code>. Filters support the
   * <code>*</code> and <code>?</code> wildcards, and a leading <code>!</code> makes a filter an
   * exclusion. A project is skipped if it matches any exclusion filter. When inclusion filters are
   * set, a project must also match at least one of them. For <code>project_id</code>, each filter
   * is a project ID pattern, such as <code>prod-*</code>. You can set up to 15,000 filters. For
   * <code>project_label</code>, each filter is a label in the form <code>key:value</code>, such as
   * <code>env:prod*</code>. You can set up to 100 filters. Keys are matched exactly, and wildcards
   * apply only to values, so <code>key:*</code> matches any value.
   *
   * @return filters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getFilters() {
    return filters;
  }

  public void setFilters(List<String> filters) {
    this.filters = filters;
  }

  public GCPProjectFilterConfig type(GCPProjectFilterConfigType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The GCP project field that the filters are matched against.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GCPProjectFilterConfigType getType() {
    return type;
  }

  public void setType(GCPProjectFilterConfigType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return GCPProjectFilterConfig
   */
  @JsonAnySetter
  public GCPProjectFilterConfig putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GCPProjectFilterConfig object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GCPProjectFilterConfig gcpProjectFilterConfig = (GCPProjectFilterConfig) o;
    return Objects.equals(this.filters, gcpProjectFilterConfig.filters)
        && Objects.equals(this.type, gcpProjectFilterConfig.type)
        && Objects.equals(this.additionalProperties, gcpProjectFilterConfig.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GCPProjectFilterConfig {\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
