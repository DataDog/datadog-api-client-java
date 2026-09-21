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

/** Metadata about the rows requested, including which ones were not found. */
@JsonPropertyOrder({
  TableRowResourceArrayMeta.JSON_PROPERTY_FOUND_COUNT,
  TableRowResourceArrayMeta.JSON_PROPERTY_NOT_FOUND,
  TableRowResourceArrayMeta.JSON_PROPERTY_REQUESTED_COUNT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TableRowResourceArrayMeta {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FOUND_COUNT = "found_count";
  private Long foundCount;

  public static final String JSON_PROPERTY_NOT_FOUND = "not_found";
  private List<String> notFound = new ArrayList<>();

  public static final String JSON_PROPERTY_REQUESTED_COUNT = "requested_count";
  private Long requestedCount;

  public TableRowResourceArrayMeta() {}

  @JsonCreator
  public TableRowResourceArrayMeta(
      @JsonProperty(required = true, value = JSON_PROPERTY_FOUND_COUNT) Long foundCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_NOT_FOUND) List<String> notFound,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUESTED_COUNT) Long requestedCount) {
    this.foundCount = foundCount;
    this.notFound = notFound;
    this.requestedCount = requestedCount;
  }

  public TableRowResourceArrayMeta foundCount(Long foundCount) {
    this.foundCount = foundCount;
    return this;
  }

  /**
   * Number of requested rows that were found and returned in <code>data</code>.
   *
   * @return foundCount
   */
  @JsonProperty(JSON_PROPERTY_FOUND_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getFoundCount() {
    return foundCount;
  }

  public void setFoundCount(Long foundCount) {
    this.foundCount = foundCount;
  }

  public TableRowResourceArrayMeta notFound(List<String> notFound) {
    this.notFound = notFound;
    return this;
  }

  public TableRowResourceArrayMeta addNotFoundItem(String notFoundItem) {
    this.notFound.add(notFoundItem);
    return this;
  }

  /**
   * Row IDs from the request that do not exist in the reference table. Empty when every requested
   * row was found.
   *
   * @return notFound
   */
  @JsonProperty(JSON_PROPERTY_NOT_FOUND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getNotFound() {
    return notFound;
  }

  public void setNotFound(List<String> notFound) {
    this.notFound = notFound;
  }

  public TableRowResourceArrayMeta requestedCount(Long requestedCount) {
    this.requestedCount = requestedCount;
    return this;
  }

  /**
   * Number of row IDs supplied in the <code>row_id</code> query parameter.
   *
   * @return requestedCount
   */
  @JsonProperty(JSON_PROPERTY_REQUESTED_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getRequestedCount() {
    return requestedCount;
  }

  public void setRequestedCount(Long requestedCount) {
    this.requestedCount = requestedCount;
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
   * @return TableRowResourceArrayMeta
   */
  @JsonAnySetter
  public TableRowResourceArrayMeta putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TableRowResourceArrayMeta object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableRowResourceArrayMeta tableRowResourceArrayMeta = (TableRowResourceArrayMeta) o;
    return Objects.equals(this.foundCount, tableRowResourceArrayMeta.foundCount)
        && Objects.equals(this.notFound, tableRowResourceArrayMeta.notFound)
        && Objects.equals(this.requestedCount, tableRowResourceArrayMeta.requestedCount)
        && Objects.equals(
            this.additionalProperties, tableRowResourceArrayMeta.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(foundCount, notFound, requestedCount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableRowResourceArrayMeta {\n");
    sb.append("    foundCount: ").append(toIndentedString(foundCount)).append("\n");
    sb.append("    notFound: ").append(toIndentedString(notFound)).append("\n");
    sb.append("    requestedCount: ").append(toIndentedString(requestedCount)).append("\n");
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
