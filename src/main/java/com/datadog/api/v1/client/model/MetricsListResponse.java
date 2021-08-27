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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Object listing all metric names stored by Datadog since a given time. */
@ApiModel(description = "Object listing all metric names stored by Datadog since a given time.")
@JsonPropertyOrder({
  MetricsListResponse.JSON_PROPERTY_FROM,
  MetricsListResponse.JSON_PROPERTY_METRICS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MetricsListResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FROM = "from";
  private String from;

  public static final String JSON_PROPERTY_METRICS = "metrics";
  private List<String> metrics = null;

  public MetricsListResponse from(String from) {
    this.from = from;
    return this;
  }

  /**
   * Time when the metrics were active, seconds since the Unix epoch.
   *
   * @return from
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time when the metrics were active, seconds since the Unix epoch.")
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public MetricsListResponse metrics(List<String> metrics) {
    this.metrics = metrics;
    return this;
  }

  public MetricsListResponse addMetricsItem(String metricsItem) {
    if (this.metrics == null) {
      this.metrics = new ArrayList<>();
    }
    this.metrics.add(metricsItem);
    return this;
  }

  /**
   * List of metric names.
   *
   * @return metrics
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of metric names.")
  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getMetrics() {
    return metrics;
  }

  public void setMetrics(List<String> metrics) {
    this.metrics = metrics;
  }

  /** Return true if this MetricsListResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricsListResponse metricsListResponse = (MetricsListResponse) o;
    return Objects.equals(this.from, metricsListResponse.from)
        && Objects.equals(this.metrics, metricsListResponse.metrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, metrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricsListResponse {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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
