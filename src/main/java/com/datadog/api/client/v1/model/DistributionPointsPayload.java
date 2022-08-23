/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** The distribution points payload. */
@JsonPropertyOrder({DistributionPointsPayload.JSON_PROPERTY_SERIES})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DistributionPointsPayload {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SERIES = "series";
  private List<DistributionPointsSeries> series = new ArrayList<>();

  public DistributionPointsPayload() {}

  @JsonCreator
  public DistributionPointsPayload(
      @JsonProperty(required = true, value = JSON_PROPERTY_SERIES)
          List<DistributionPointsSeries> series) {
    this.series = series;
  }

  public DistributionPointsPayload series(List<DistributionPointsSeries> series) {
    this.series = series;
    for (DistributionPointsSeries item : series) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public DistributionPointsPayload addSeriesItem(DistributionPointsSeries seriesItem) {
    this.series.add(seriesItem);
    this.unparsed |= seriesItem.unparsed;
    return this;
  }

  /**
   * A list of distribution points series to submit to Datadog.
   *
   * @return series
   */
  @JsonProperty(JSON_PROPERTY_SERIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<DistributionPointsSeries> getSeries() {
    return series;
  }

  public void setSeries(List<DistributionPointsSeries> series) {
    this.series = series;
  }

  /** Return true if this DistributionPointsPayload object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistributionPointsPayload distributionPointsPayload = (DistributionPointsPayload) o;
    return Objects.equals(this.series, distributionPointsPayload.series);
  }

  @Override
  public int hashCode() {
    return Objects.hash(series);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistributionPointsPayload {\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
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
