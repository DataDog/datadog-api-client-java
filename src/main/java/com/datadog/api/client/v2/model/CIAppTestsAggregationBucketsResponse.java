/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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
   * <p>The query results.</p>
 */
@JsonPropertyOrder({
  CIAppTestsAggregationBucketsResponse.JSON_PROPERTY_BUCKETS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CIAppTestsAggregationBucketsResponse {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_BUCKETS = "buckets";
  private List<CIAppTestsBucketResponse> buckets = null;

  public CIAppTestsAggregationBucketsResponse buckets(List<CIAppTestsBucketResponse> buckets) {
    this.buckets = buckets;
    for (CIAppTestsBucketResponse item : buckets) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public CIAppTestsAggregationBucketsResponse addBucketsItem(CIAppTestsBucketResponse bucketsItem) {
    if (this.buckets == null) {
      this.buckets = new ArrayList<>();
    }
    this.buckets.add(bucketsItem);
    this.unparsed |= bucketsItem.unparsed;
    return this;
  }

  /**
   * <p>The list of matching buckets, one item per bucket.</p>
   * @return buckets
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_BUCKETS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<CIAppTestsBucketResponse> getBuckets() {
        return buckets;
      }
  public void setBuckets(List<CIAppTestsBucketResponse> buckets) {
    this.buckets = buckets;
  }

  /**
   * Return true if this CIAppTestsAggregationBucketsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CIAppTestsAggregationBucketsResponse ciAppTestsAggregationBucketsResponse = (CIAppTestsAggregationBucketsResponse) o;
    return Objects.equals(this.buckets, ciAppTestsAggregationBucketsResponse.buckets);
  }


  @Override
  public int hashCode() {
    return Objects.hash(buckets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CIAppTestsAggregationBucketsResponse {\n");
    sb.append("    buckets: ").append(toIndentedString(buckets)).append("\n");
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
