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

/** Configuration for a GCP metric namespace. */
@JsonPropertyOrder({
  GCPMetricNamespaceConfig.JSON_PROPERTY_DISABLED,
  GCPMetricNamespaceConfig.JSON_PROPERTY_FILTERS,
  GCPMetricNamespaceConfig.JSON_PROPERTY_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GCPMetricNamespaceConfig {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DISABLED = "disabled";
  private Boolean disabled = false;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private List<String> filters = null;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public GCPMetricNamespaceConfig disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * When disabled, Datadog does not collect metrics that are related to this GCP metric namespace.
   *
   * @return disabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public GCPMetricNamespaceConfig filters(List<String> filters) {
    this.filters = filters;
    return this;
  }

  public GCPMetricNamespaceConfig addFiltersItem(String filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

  /**
   * When enabled, Datadog applies these additional filters to limit metric collection. A metric is
   * collected only if it does not match all exclusion filters and matches at least one allow
   * filter.
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

  public GCPMetricNamespaceConfig id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the GCP metric namespace.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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
   * @return GCPMetricNamespaceConfig
   */
  @JsonAnySetter
  public GCPMetricNamespaceConfig putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GCPMetricNamespaceConfig object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GCPMetricNamespaceConfig gcpMetricNamespaceConfig = (GCPMetricNamespaceConfig) o;
    return Objects.equals(this.disabled, gcpMetricNamespaceConfig.disabled)
        && Objects.equals(this.filters, gcpMetricNamespaceConfig.filters)
        && Objects.equals(this.id, gcpMetricNamespaceConfig.id)
        && Objects.equals(this.additionalProperties, gcpMetricNamespaceConfig.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disabled, filters, id, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GCPMetricNamespaceConfig {\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
