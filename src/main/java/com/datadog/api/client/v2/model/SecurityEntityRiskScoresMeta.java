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

/** Metadata for pagination */
@JsonPropertyOrder({
  SecurityEntityRiskScoresMeta.JSON_PROPERTY_PAGE_NUMBER,
  SecurityEntityRiskScoresMeta.JSON_PROPERTY_PAGE_SIZE,
  SecurityEntityRiskScoresMeta.JSON_PROPERTY_QUERY_ID,
  SecurityEntityRiskScoresMeta.JSON_PROPERTY_TOTAL_ROW_COUNT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityEntityRiskScoresMeta {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PAGE_NUMBER = "pageNumber";
  private Long pageNumber;

  public static final String JSON_PROPERTY_PAGE_SIZE = "pageSize";
  private Long pageSize;

  public static final String JSON_PROPERTY_QUERY_ID = "queryId";
  private String queryId;

  public static final String JSON_PROPERTY_TOTAL_ROW_COUNT = "totalRowCount";
  private Long totalRowCount;

  public SecurityEntityRiskScoresMeta() {}

  @JsonCreator
  public SecurityEntityRiskScoresMeta(
      @JsonProperty(required = true, value = JSON_PROPERTY_PAGE_NUMBER) Long pageNumber,
      @JsonProperty(required = true, value = JSON_PROPERTY_PAGE_SIZE) Long pageSize,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY_ID) String queryId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOTAL_ROW_COUNT) Long totalRowCount) {
    this.pageNumber = pageNumber;
    this.pageSize = pageSize;
    this.queryId = queryId;
    this.totalRowCount = totalRowCount;
  }

  public SecurityEntityRiskScoresMeta pageNumber(Long pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

  /**
   * Current page number (1-indexed)
   *
   * @return pageNumber
   */
  @JsonProperty(JSON_PROPERTY_PAGE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Long pageNumber) {
    this.pageNumber = pageNumber;
  }

  public SecurityEntityRiskScoresMeta pageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Number of items per page
   *
   * @return pageSize
   */
  @JsonProperty(JSON_PROPERTY_PAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getPageSize() {
    return pageSize;
  }

  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }

  public SecurityEntityRiskScoresMeta queryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  /**
   * Query ID for pagination consistency
   *
   * @return queryId
   */
  @JsonProperty(JSON_PROPERTY_QUERY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQueryId() {
    return queryId;
  }

  public void setQueryId(String queryId) {
    this.queryId = queryId;
  }

  public SecurityEntityRiskScoresMeta totalRowCount(Long totalRowCount) {
    this.totalRowCount = totalRowCount;
    return this;
  }

  /**
   * Total number of entities matching the query
   *
   * @return totalRowCount
   */
  @JsonProperty(JSON_PROPERTY_TOTAL_ROW_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTotalRowCount() {
    return totalRowCount;
  }

  public void setTotalRowCount(Long totalRowCount) {
    this.totalRowCount = totalRowCount;
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
   * @return SecurityEntityRiskScoresMeta
   */
  @JsonAnySetter
  public SecurityEntityRiskScoresMeta putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SecurityEntityRiskScoresMeta object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityEntityRiskScoresMeta securityEntityRiskScoresMeta = (SecurityEntityRiskScoresMeta) o;
    return Objects.equals(this.pageNumber, securityEntityRiskScoresMeta.pageNumber)
        && Objects.equals(this.pageSize, securityEntityRiskScoresMeta.pageSize)
        && Objects.equals(this.queryId, securityEntityRiskScoresMeta.queryId)
        && Objects.equals(this.totalRowCount, securityEntityRiskScoresMeta.totalRowCount)
        && Objects.equals(
            this.additionalProperties, securityEntityRiskScoresMeta.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, queryId, totalRowCount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityEntityRiskScoresMeta {\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    queryId: ").append(toIndentedString(queryId)).append("\n");
    sb.append("    totalRowCount: ").append(toIndentedString(totalRowCount)).append("\n");
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
