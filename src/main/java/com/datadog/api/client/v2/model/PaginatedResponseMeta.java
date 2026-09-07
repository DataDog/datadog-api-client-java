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

/** Metadata for scores response. */
@JsonPropertyOrder({
  PaginatedResponseMeta.JSON_PROPERTY_COUNT,
  PaginatedResponseMeta.JSON_PROPERTY_LIMIT,
  PaginatedResponseMeta.JSON_PROPERTY_OFFSET,
  PaginatedResponseMeta.JSON_PROPERTY_TOTAL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PaginatedResponseMeta {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COUNT = "count";
  private Long count;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Long limit;

  public static final String JSON_PROPERTY_OFFSET = "offset";
  private Long offset;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Long total;

  public PaginatedResponseMeta() {}

  @JsonCreator
  public PaginatedResponseMeta(
      @JsonProperty(required = true, value = JSON_PROPERTY_COUNT) Long count,
      @JsonProperty(required = true, value = JSON_PROPERTY_LIMIT) Long limit,
      @JsonProperty(required = true, value = JSON_PROPERTY_OFFSET) Long offset,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOTAL) Long total) {
    this.count = count;
    this.limit = limit;
    this.offset = offset;
    this.total = total;
  }

  public PaginatedResponseMeta count(Long count) {
    this.count = count;
    return this;
  }

  /**
   * Number of entities in this response.
   *
   * @return count
   */
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public PaginatedResponseMeta limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Pagination limit.
   *
   * @return limit
   */
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }

  public PaginatedResponseMeta offset(Long offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Pagination offset.
   *
   * @return offset
   */
  @JsonProperty(JSON_PROPERTY_OFFSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getOffset() {
    return offset;
  }

  public void setOffset(Long offset) {
    this.offset = offset;
  }

  public PaginatedResponseMeta total(Long total) {
    this.total = total;
    return this;
  }

  /**
   * Total number of entities available.
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
   * @return PaginatedResponseMeta
   */
  @JsonAnySetter
  public PaginatedResponseMeta putAdditionalProperty(String key, Object value) {
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

  /** Return true if this PaginatedResponseMeta object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginatedResponseMeta paginatedResponseMeta = (PaginatedResponseMeta) o;
    return Objects.equals(this.count, paginatedResponseMeta.count)
        && Objects.equals(this.limit, paginatedResponseMeta.limit)
        && Objects.equals(this.offset, paginatedResponseMeta.offset)
        && Objects.equals(this.total, paginatedResponseMeta.total)
        && Objects.equals(this.additionalProperties, paginatedResponseMeta.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, limit, offset, total, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedResponseMeta {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
