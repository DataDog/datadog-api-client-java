/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
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
  private Long totalNumberOfRecords;

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
            this.totalNumberOfRecords, usageTopAvgMetricsPagination.totalNumberOfRecords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, nextRecordId, totalNumberOfRecords);
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
