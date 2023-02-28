/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>The object containing information about the pages of the list of SLOs.</p>
 */
@JsonPropertyOrder({
  SLOListResponseMetadataPage.JSON_PROPERTY_TOTAL_COUNT,
  SLOListResponseMetadataPage.JSON_PROPERTY_TOTAL_FILTERED_COUNT
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SLOListResponseMetadataPage {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_TOTAL_COUNT = "total_count";
  private Long totalCount;

  public static final String JSON_PROPERTY_TOTAL_FILTERED_COUNT = "total_filtered_count";
  private Long totalFilteredCount;

  public SLOListResponseMetadataPage totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * <p>The total number of resources that could be retrieved ignoring the parameters and filters in the request.</p>
   * @return totalCount
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getTotalCount() {
        return totalCount;
      }
  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }
  public SLOListResponseMetadataPage totalFilteredCount(Long totalFilteredCount) {
    this.totalFilteredCount = totalFilteredCount;
    return this;
  }

  /**
   * <p>The total number of resources that match the parameters and filters in the request. This attribute can be used by a client to determine the total number of pages.</p>
   * @return totalFilteredCount
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TOTAL_FILTERED_COUNT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getTotalFilteredCount() {
        return totalFilteredCount;
      }
  public void setTotalFilteredCount(Long totalFilteredCount) {
    this.totalFilteredCount = totalFilteredCount;
  }

  /**
   * Return true if this SLOListResponseMetadataPage object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOListResponseMetadataPage sloListResponseMetadataPage = (SLOListResponseMetadataPage) o;
    return Objects.equals(this.totalCount, sloListResponseMetadataPage.totalCount) && Objects.equals(this.totalFilteredCount, sloListResponseMetadataPage.totalFilteredCount);
  }


  @Override
  public int hashCode() {
    return Objects.hash(totalCount,totalFilteredCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOListResponseMetadataPage {\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    totalFilteredCount: ").append(toIndentedString(totalFilteredCount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
