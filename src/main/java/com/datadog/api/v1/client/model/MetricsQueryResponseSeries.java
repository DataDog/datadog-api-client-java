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

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.datadog.api.v1.client.model.MetricsQueryResponseUnit;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * Object containing all metric names returned and their associated metadata.
 */
@ApiModel(description = "Object containing all metric names returned and their associated metadata.")
@JsonPropertyOrder({
  MetricsQueryResponseSeries.JSON_PROPERTY_AGGR,
  MetricsQueryResponseSeries.JSON_PROPERTY_DISPLAY_NAME,
  MetricsQueryResponseSeries.JSON_PROPERTY_END,
  MetricsQueryResponseSeries.JSON_PROPERTY_EXPRESSION,
  MetricsQueryResponseSeries.JSON_PROPERTY_INTERVAL,
  MetricsQueryResponseSeries.JSON_PROPERTY_LENGTH,
  MetricsQueryResponseSeries.JSON_PROPERTY_METRIC,
  MetricsQueryResponseSeries.JSON_PROPERTY_POINTLIST,
  MetricsQueryResponseSeries.JSON_PROPERTY_SCOPE,
  MetricsQueryResponseSeries.JSON_PROPERTY_START,
  MetricsQueryResponseSeries.JSON_PROPERTY_UNIT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MetricsQueryResponseSeries {
  public static final String JSON_PROPERTY_AGGR = "aggr";
  private String aggr;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_END = "end";
  private Long end;

  public static final String JSON_PROPERTY_EXPRESSION = "expression";
  private String expression;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private Long interval;

  public static final String JSON_PROPERTY_LENGTH = "length";
  private Long length;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private String metric;

  public static final String JSON_PROPERTY_POINTLIST = "pointlist";
  private List<List<Double>> pointlist = null;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private String scope;

  public static final String JSON_PROPERTY_START = "start";
  private Long start;

  public static final String JSON_PROPERTY_UNIT = "unit";
  private List<MetricsQueryResponseUnit> unit = null;


   /**
   * Aggregation type.
   * @return aggr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "avg", value = "Aggregation type.")
  @JsonProperty(JSON_PROPERTY_AGGR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAggr() {
    return aggr;
  }




   /**
   * Display name of the metric.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "system.cpu.idle", value = "Display name of the metric.")
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayName() {
    return displayName;
  }




   /**
   * End of the time window, milliseconds since Unix epoch.
   * @return end
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "End of the time window, milliseconds since Unix epoch.")
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getEnd() {
    return end;
  }




   /**
   * Metric expression.
   * @return expression
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "system.cpu.idle{host:foo,env:test}", value = "Metric expression.")
  @JsonProperty(JSON_PROPERTY_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpression() {
    return expression;
  }




   /**
   * Number of seconds between data samples.
   * @return interval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of seconds between data samples.")
  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getInterval() {
    return interval;
  }




   /**
   * Number of data samples.
   * @return length
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of data samples.")
  @JsonProperty(JSON_PROPERTY_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLength() {
    return length;
  }




   /**
   * Metric name.
   * @return metric
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "system.cpu.idle", value = "Metric name.")
  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMetric() {
    return metric;
  }




   /**
   * List of points of the time series.
   * @return pointlist
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of points of the time series.")
  @JsonProperty(JSON_PROPERTY_POINTLIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<List<Double>> getPointlist() {
    return pointlist;
  }




   /**
   * Metric scope, comma separated list of tags.
   * @return scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "host:foo,env:test", value = "Metric scope, comma separated list of tags.")
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getScope() {
    return scope;
  }




   /**
   * Start of the time window, milliseconds since Unix epoch.
   * @return start
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Start of the time window, milliseconds since Unix epoch.")
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getStart() {
    return start;
  }




   /**
   * Detailed information about the metric unit. First element describes the \&quot;primary unit\&quot; (for example, &#x60;bytes&#x60; in &#x60;bytes per second&#x60;), second describes the \&quot;per unit\&quot; (for example, &#x60;second&#x60; in &#x60;bytes per second&#x60;).
   * @return unit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Detailed information about the metric unit. First element describes the \"primary unit\" (for example, `bytes` in `bytes per second`), second describes the \"per unit\" (for example, `second` in `bytes per second`).")
  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MetricsQueryResponseUnit> getUnit() {
    return unit;
  }




  /**
   * Return true if this MetricsQueryResponse_series object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricsQueryResponseSeries metricsQueryResponseSeries = (MetricsQueryResponseSeries) o;
    return Objects.equals(this.aggr, metricsQueryResponseSeries.aggr) &&
        Objects.equals(this.displayName, metricsQueryResponseSeries.displayName) &&
        Objects.equals(this.end, metricsQueryResponseSeries.end) &&
        Objects.equals(this.expression, metricsQueryResponseSeries.expression) &&
        Objects.equals(this.interval, metricsQueryResponseSeries.interval) &&
        Objects.equals(this.length, metricsQueryResponseSeries.length) &&
        Objects.equals(this.metric, metricsQueryResponseSeries.metric) &&
        Objects.equals(this.pointlist, metricsQueryResponseSeries.pointlist) &&
        Objects.equals(this.scope, metricsQueryResponseSeries.scope) &&
        Objects.equals(this.start, metricsQueryResponseSeries.start) &&
        Objects.equals(this.unit, metricsQueryResponseSeries.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggr, displayName, end, expression, interval, length, metric, pointlist, scope, start, unit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricsQueryResponseSeries {\n");
    sb.append("    aggr: ").append(toIndentedString(aggr)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    pointlist: ").append(toIndentedString(pointlist)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

