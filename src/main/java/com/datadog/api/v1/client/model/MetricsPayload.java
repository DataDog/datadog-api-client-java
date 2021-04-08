/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** The metrics&#39; payload. */
@ApiModel(description = "The metrics' payload.")
@JsonPropertyOrder({MetricsPayload.JSON_PROPERTY_SERIES})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MetricsPayload {
  public static final String JSON_PROPERTY_SERIES = "series";
  private List<Series> series = new ArrayList<>();

  public MetricsPayload series(List<Series> series) {
    this.series = series;
    return this;
  }

  public MetricsPayload addSeriesItem(Series seriesItem) {
    this.series.add(seriesItem);
    return this;
  }

  /**
   * A list of time series to submit to Datadog.
   *
   * @return series
   */
  @ApiModelProperty(
      example = "[{\"metric\":\"system.load.1\",\"points\":[[1475317847,0.7]]}]",
      required = true,
      value = "A list of time series to submit to Datadog.")
  @JsonProperty(JSON_PROPERTY_SERIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<Series> getSeries() {
    return series;
  }

  public void setSeries(List<Series> series) {
    this.series = series;
  }

  /** Return true if this MetricsPayload object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricsPayload metricsPayload = (MetricsPayload) o;
    return Objects.equals(this.series, metricsPayload.series);
  }

  @Override
  public int hashCode() {
    return Objects.hash(series);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricsPayload {\n");
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
