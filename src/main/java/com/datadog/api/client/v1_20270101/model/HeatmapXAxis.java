/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({HeatmapXAxis.JSON_PROPERTY_NUM_BUCKETS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HeatmapXAxis {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NUM_BUCKETS = "num_buckets";
  private Double numBuckets;

  public HeatmapXAxis numBuckets(Double numBuckets) {
    this.numBuckets = numBuckets;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return numBuckets
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUM_BUCKETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNumBuckets() {
    return numBuckets;
  }

  public void setNumBuckets(Double numBuckets) {
    this.numBuckets = numBuckets;
  }

  /** Return true if this HeatmapXAxis object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeatmapXAxis heatmapXAxis = (HeatmapXAxis) o;
    return Objects.equals(this.numBuckets, heatmapXAxis.numBuckets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numBuckets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeatmapXAxis {\n");
    sb.append("    numBuckets: ").append(toIndentedString(numBuckets)).append("\n");
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
