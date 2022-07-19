/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** The metadata for the current pagination. */
@JsonPropertyOrder({HourlyUsagePagination.JSON_PROPERTY_NEXT_RECORD_ID})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HourlyUsagePagination {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NEXT_RECORD_ID = "next_record_id";
  private JsonNullable<String> nextRecordId = JsonNullable.<String>undefined();

  public HourlyUsagePagination nextRecordId(String nextRecordId) {
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

  /** Return true if this HourlyUsagePagination object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HourlyUsagePagination hourlyUsagePagination = (HourlyUsagePagination) o;
    return Objects.equals(this.nextRecordId, hourlyUsagePagination.nextRecordId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextRecordId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HourlyUsagePagination {\n");
    sb.append("    nextRecordId: ").append(toIndentedString(nextRecordId)).append("\n");
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
