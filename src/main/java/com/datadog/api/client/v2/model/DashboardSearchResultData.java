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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** A dashboard search result. */
@JsonPropertyOrder({
  DashboardSearchResultData.JSON_PROPERTY_ATTRIBUTES,
  DashboardSearchResultData.JSON_PROPERTY_ID,
  DashboardSearchResultData.JSON_PROPERTY_META,
  DashboardSearchResultData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DashboardSearchResultData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private DashboardSearchAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_META = "meta";
  private DashboardSearchMetadata meta;

  public static final String JSON_PROPERTY_TYPE = "type";
  private MetricDashboardType type;

  public DashboardSearchResultData() {}

  @JsonCreator
  public DashboardSearchResultData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          DashboardSearchAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_META) DashboardSearchMetadata meta,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) MetricDashboardType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.id = id;
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public DashboardSearchResultData attributes(DashboardSearchAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Dashboard search result attributes.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DashboardSearchAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(DashboardSearchAttributes attributes) {
    this.attributes = attributes;
  }

  public DashboardSearchResultData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Dashboard identifier.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DashboardSearchResultData meta(DashboardSearchMetadata meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * Metadata about the dashboard.
   *
   * @return meta
   */
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DashboardSearchMetadata getMeta() {
    return meta;
  }

  public void setMeta(DashboardSearchMetadata meta) {
    this.meta = meta;
  }

  public DashboardSearchResultData type(MetricDashboardType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Dashboard resource type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public MetricDashboardType getType() {
    return type;
  }

  public void setType(MetricDashboardType type) {
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
   * @return DashboardSearchResultData
   */
  @JsonAnySetter
  public DashboardSearchResultData putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DashboardSearchResultData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardSearchResultData dashboardSearchResultData = (DashboardSearchResultData) o;
    return Objects.equals(this.attributes, dashboardSearchResultData.attributes)
        && Objects.equals(this.id, dashboardSearchResultData.id)
        && Objects.equals(this.meta, dashboardSearchResultData.meta)
        && Objects.equals(this.type, dashboardSearchResultData.type)
        && Objects.equals(
            this.additionalProperties, dashboardSearchResultData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, meta, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardSearchResultData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
