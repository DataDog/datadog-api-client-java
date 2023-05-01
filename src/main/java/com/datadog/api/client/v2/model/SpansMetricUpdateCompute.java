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

/** The compute rule to compute the span-based metric. */
@JsonPropertyOrder({SpansMetricUpdateCompute.JSON_PROPERTY_INCLUDE_PERCENTILES})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SpansMetricUpdateCompute {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INCLUDE_PERCENTILES = "include_percentiles";
  private Boolean includePercentiles;

  public SpansMetricUpdateCompute includePercentiles(Boolean includePercentiles) {
    this.includePercentiles = includePercentiles;
    return this;
  }

  /**
   * Toggle to include or exclude percentile aggregations for distribution metrics. Only present
   * when the <code>aggregation_type</code> is <code>distribution</code>.
   *
   * @return includePercentiles
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDE_PERCENTILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIncludePercentiles() {
    return includePercentiles;
  }

  public void setIncludePercentiles(Boolean includePercentiles) {
    this.includePercentiles = includePercentiles;
  }

  /** Return true if this SpansMetricUpdateCompute object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpansMetricUpdateCompute spansMetricUpdateCompute = (SpansMetricUpdateCompute) o;
    return Objects.equals(this.includePercentiles, spansMetricUpdateCompute.includePercentiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includePercentiles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpansMetricUpdateCompute {\n");
    sb.append("    includePercentiles: ").append(toIndentedString(includePercentiles)).append("\n");
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
