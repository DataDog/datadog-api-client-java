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

/** Attributes of a Cloud Cost Management tag key. */
@JsonPropertyOrder({
  CostTagKeyAttributes.JSON_PROPERTY_DETAILS,
  CostTagKeyAttributes.JSON_PROPERTY_SOURCES,
  CostTagKeyAttributes.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CostTagKeyAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DETAILS = "details";
  private CostTagKeyDetails details;

  public static final String JSON_PROPERTY_SOURCES = "sources";
  private List<String> sources = new ArrayList<>();

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public CostTagKeyAttributes() {}

  @JsonCreator
  public CostTagKeyAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCES) List<String> sources,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUE) String value) {
    this.sources = sources;
    this.value = value;
  }

  public CostTagKeyAttributes details(CostTagKeyDetails details) {
    this.details = details;
    this.unparsed |= details.unparsed;
    return this;
  }

  /**
   * Additional details for a Cloud Cost Management tag key, including its description and example
   * tag values.
   *
   * @return details
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CostTagKeyDetails getDetails() {
    return details;
  }

  public void setDetails(CostTagKeyDetails details) {
    this.details = details;
    if (details != null) {
      this.unparsed |= details.unparsed;
    }
  }

  public CostTagKeyAttributes sources(List<String> sources) {
    this.sources = sources;
    return this;
  }

  public CostTagKeyAttributes addSourcesItem(String sourcesItem) {
    this.sources.add(sourcesItem);
    return this;
  }

  /**
   * List of sources that define this tag key.
   *
   * @return sources
   */
  @JsonProperty(JSON_PROPERTY_SOURCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getSources() {
    return sources;
  }

  public void setSources(List<String> sources) {
    this.sources = sources;
  }

  public CostTagKeyAttributes value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The tag key name.
   *
   * @return value
   */
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
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
   * @return CostTagKeyAttributes
   */
  @JsonAnySetter
  public CostTagKeyAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CostTagKeyAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CostTagKeyAttributes costTagKeyAttributes = (CostTagKeyAttributes) o;
    return Objects.equals(this.details, costTagKeyAttributes.details)
        && Objects.equals(this.sources, costTagKeyAttributes.sources)
        && Objects.equals(this.value, costTagKeyAttributes.value)
        && Objects.equals(this.additionalProperties, costTagKeyAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(details, sources, value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostTagKeyAttributes {\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
