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

/** Metadata about the notebook search results. */
@JsonPropertyOrder({
  NotebookSearchResponseMeta.JSON_PROPERTY_AGGREGATIONS,
  NotebookSearchResponseMeta.JSON_PROPERTY_TOTAL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NotebookSearchResponseMeta {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATIONS = "aggregations";
  private NotebookSearchAggregations aggregations;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Long total;

  public NotebookSearchResponseMeta() {}

  @JsonCreator
  public NotebookSearchResponseMeta(
      @JsonProperty(required = true, value = JSON_PROPERTY_TOTAL) Long total) {
    this.total = total;
  }

  public NotebookSearchResponseMeta aggregations(NotebookSearchAggregations aggregations) {
    this.aggregations = aggregations;
    this.unparsed |= aggregations.unparsed;
    return this;
  }

  /**
   * Aggregations of notebook search results.
   *
   * @return aggregations
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGGREGATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NotebookSearchAggregations getAggregations() {
    return aggregations;
  }

  public void setAggregations(NotebookSearchAggregations aggregations) {
    this.aggregations = aggregations;
  }

  public NotebookSearchResponseMeta total(Long total) {
    this.total = total;
    return this;
  }

  /**
   * Total number of notebooks found.
   *
   * @return total
   */
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
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
   * @return NotebookSearchResponseMeta
   */
  @JsonAnySetter
  public NotebookSearchResponseMeta putAdditionalProperty(String key, Object value) {
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

  /** Return true if this NotebookSearchResponseMeta object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotebookSearchResponseMeta notebookSearchResponseMeta = (NotebookSearchResponseMeta) o;
    return Objects.equals(this.aggregations, notebookSearchResponseMeta.aggregations)
        && Objects.equals(this.total, notebookSearchResponseMeta.total)
        && Objects.equals(
            this.additionalProperties, notebookSearchResponseMeta.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregations, total, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotebookSearchResponseMeta {\n");
    sb.append("    aggregations: ").append(toIndentedString(aggregations)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
