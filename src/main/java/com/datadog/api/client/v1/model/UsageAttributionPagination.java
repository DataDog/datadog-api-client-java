/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** The metadata for the current pagination. */
@JsonPropertyOrder({
  UsageAttributionPagination.JSON_PROPERTY_LIMIT,
  UsageAttributionPagination.JSON_PROPERTY_OFFSET,
  UsageAttributionPagination.JSON_PROPERTY_SORT_DIRECTION,
  UsageAttributionPagination.JSON_PROPERTY_SORT_NAME,
  UsageAttributionPagination.JSON_PROPERTY_TOTAL_NUMBER_OF_RECORDS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageAttributionPagination {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Long limit;

  public static final String JSON_PROPERTY_OFFSET = "offset";
  private Long offset;

  public static final String JSON_PROPERTY_SORT_DIRECTION = "sort_direction";
  private String sortDirection;

  public static final String JSON_PROPERTY_SORT_NAME = "sort_name";
  private String sortName;

  public static final String JSON_PROPERTY_TOTAL_NUMBER_OF_RECORDS = "total_number_of_records";
  private Long totalNumberOfRecords;

  public UsageAttributionPagination limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Maximum amount of records to be returned.
   *
   * @return limit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }

  public UsageAttributionPagination offset(Long offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Records to be skipped before beginning to return.
   *
   * @return offset
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getOffset() {
    return offset;
  }

  public void setOffset(Long offset) {
    this.offset = offset;
  }

  public UsageAttributionPagination sortDirection(String sortDirection) {
    this.sortDirection = sortDirection;
    return this;
  }

  /**
   * Direction to sort by.
   *
   * @return sortDirection
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSortDirection() {
    return sortDirection;
  }

  public void setSortDirection(String sortDirection) {
    this.sortDirection = sortDirection;
  }

  public UsageAttributionPagination sortName(String sortName) {
    this.sortName = sortName;
    return this;
  }

  /**
   * Field to sort by.
   *
   * @return sortName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSortName() {
    return sortName;
  }

  public void setSortName(String sortName) {
    this.sortName = sortName;
  }

  public UsageAttributionPagination totalNumberOfRecords(Long totalNumberOfRecords) {
    this.totalNumberOfRecords = totalNumberOfRecords;
    return this;
  }

  /**
   * Total number of records.
   *
   * @return totalNumberOfRecords
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_NUMBER_OF_RECORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotalNumberOfRecords() {
    return totalNumberOfRecords;
  }

  public void setTotalNumberOfRecords(Long totalNumberOfRecords) {
    this.totalNumberOfRecords = totalNumberOfRecords;
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
   * @return UsageAttributionPagination
   */
  @JsonAnySetter
  public UsageAttributionPagination putAdditionalProperty(String key, Object value) {
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

  /** Return true if this UsageAttributionPagination object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageAttributionPagination usageAttributionPagination = (UsageAttributionPagination) o;
    return Objects.equals(this.limit, usageAttributionPagination.limit)
        && Objects.equals(this.offset, usageAttributionPagination.offset)
        && Objects.equals(this.sortDirection, usageAttributionPagination.sortDirection)
        && Objects.equals(this.sortName, usageAttributionPagination.sortName)
        && Objects.equals(
            this.totalNumberOfRecords, usageAttributionPagination.totalNumberOfRecords)
        && Objects.equals(
            this.additionalProperties, usageAttributionPagination.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        limit, offset, sortDirection, sortName, totalNumberOfRecords, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageAttributionPagination {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    sortDirection: ").append(toIndentedString(sortDirection)).append("\n");
    sb.append("    sortName: ").append(toIndentedString(sortName)).append("\n");
    sb.append("    totalNumberOfRecords: ")
        .append(toIndentedString(totalNumberOfRecords))
        .append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append("}");
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
