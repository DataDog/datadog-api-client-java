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
import org.openapitools.jackson.nullable.JsonNullable;

/** The metadata for the current pagination. */
@JsonPropertyOrder({
  UsageTopAvgMetricsPagination.JSON_PROPERTY_LIMIT,
  UsageTopAvgMetricsPagination.JSON_PROPERTY_NEXT_RECORD_ID,
  UsageTopAvgMetricsPagination.JSON_PROPERTY_TOTAL_NUMBER_OF_RECORDS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageTopAvgMetricsPagination {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Long limit;

  public static final String JSON_PROPERTY_NEXT_RECORD_ID = "next_record_id";
  private JsonNullable<String> nextRecordId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TOTAL_NUMBER_OF_RECORDS = "total_number_of_records";
  private JsonNullable<Long> totalNumberOfRecords = JsonNullable.<Long>undefined();

  public UsageTopAvgMetricsPagination limit(Long limit) {
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

  public UsageTopAvgMetricsPagination nextRecordId(String nextRecordId) {
    this.nextRecordId = JsonNullable.<String>of(nextRecordId);
    return this;
  }

  /**
   * The cursor to get the next results (if any). To make the next request, use the same parameters
   * and add <code>next_record_id</code>.
   *
   * @return nextRecordId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getNextRecordId() {
    return nextRecordId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NEXT_RECORD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getNextRecordId_JsonNullable() {
    return nextRecordId;
  }

  @JsonProperty(JSON_PROPERTY_NEXT_RECORD_ID)
  public void setNextRecordId_JsonNullable(JsonNullable<String> nextRecordId) {
    this.nextRecordId = nextRecordId;
  }

  public void setNextRecordId(String nextRecordId) {
    this.nextRecordId = JsonNullable.<String>of(nextRecordId);
  }

  public UsageTopAvgMetricsPagination totalNumberOfRecords(Long totalNumberOfRecords) {
    this.totalNumberOfRecords = JsonNullable.<Long>of(totalNumberOfRecords);
    return this;
  }

  /**
   * Total number of records.
   *
   * @return totalNumberOfRecords
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getTotalNumberOfRecords() {
    return totalNumberOfRecords.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TOTAL_NUMBER_OF_RECORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getTotalNumberOfRecords_JsonNullable() {
    return totalNumberOfRecords;
  }

  @JsonProperty(JSON_PROPERTY_TOTAL_NUMBER_OF_RECORDS)
  public void setTotalNumberOfRecords_JsonNullable(JsonNullable<Long> totalNumberOfRecords) {
    this.totalNumberOfRecords = totalNumberOfRecords;
  }

  public void setTotalNumberOfRecords(Long totalNumberOfRecords) {
    this.totalNumberOfRecords = JsonNullable.<Long>of(totalNumberOfRecords);
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
   * @return UsageTopAvgMetricsPagination
   */
  @JsonAnySetter
  public UsageTopAvgMetricsPagination putAdditionalProperty(String key, Object value) {
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

  /** Return true if this UsageTopAvgMetricsPagination object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageTopAvgMetricsPagination usageTopAvgMetricsPagination = (UsageTopAvgMetricsPagination) o;
    return Objects.equals(this.limit, usageTopAvgMetricsPagination.limit)
        && Objects.equals(this.nextRecordId, usageTopAvgMetricsPagination.nextRecordId)
        && Objects.equals(
            this.totalNumberOfRecords, usageTopAvgMetricsPagination.totalNumberOfRecords)
        && Objects.equals(
            this.additionalProperties, usageTopAvgMetricsPagination.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, nextRecordId, totalNumberOfRecords, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageTopAvgMetricsPagination {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    nextRecordId: ").append(toIndentedString(nextRecordId)).append("\n");
    sb.append("    totalNumberOfRecords: ")
        .append(toIndentedString(totalNumberOfRecords))
        .append("\n");
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
