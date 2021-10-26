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
import com.datadog.api.v1.client.model.SLOHistoryMetricsSeriesMetadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.datadog.api.v1.client.JSON;


/**
 * A representation of &#x60;metric&#x60; based SLO time series for the provided queries. This is the same response type from &#x60;batch_query&#x60; endpoint.
 */
@ApiModel(description = "A representation of `metric` based SLO time series for the provided queries. This is the same response type from `batch_query` endpoint.")
@JsonPropertyOrder({
  SLOHistoryMetricsSeries.JSON_PROPERTY_COUNT,
  SLOHistoryMetricsSeries.JSON_PROPERTY_METADATA,
  SLOHistoryMetricsSeries.JSON_PROPERTY_SUM,
  SLOHistoryMetricsSeries.JSON_PROPERTY_VALUES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SLOHistoryMetricsSeries {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_COUNT = "count";
  private Long count;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private SLOHistoryMetricsSeriesMetadata metadata;

  public static final String JSON_PROPERTY_SUM = "sum";
  private Double sum;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<Double> values = new ArrayList<>();

  public SLOHistoryMetricsSeries() {}

  @JsonCreator
  public SLOHistoryMetricsSeries(
            @JsonProperty(required=true, value=JSON_PROPERTY_COUNT) Long count,
            @JsonProperty(required=true, value=JSON_PROPERTY_SUM) Double sum,
            @JsonProperty(required=true, value=JSON_PROPERTY_VALUES) List<Double> values
            ) {
        this.count = count;
        this.sum = sum;
        this.values = values;
  }

  public SLOHistoryMetricsSeries count(Long count) {
    this.count = count;
    return this;
  }

   /**
   * Count of submitted metrics.
   * @return count
  **/
  @ApiModelProperty(example = "0", required = true, value = "Count of submitted metrics.")
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getCount() {
    return count;
  }


  public void setCount(Long count) {
    this.count = count;
  }


  public SLOHistoryMetricsSeries metadata(SLOHistoryMetricsSeriesMetadata metadata) {
    this.metadata = metadata;
    this.unparsed |= metadata.unparsed;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SLOHistoryMetricsSeriesMetadata getMetadata() {
    return metadata;
  }


  public void setMetadata(SLOHistoryMetricsSeriesMetadata metadata) {
    this.metadata = metadata;
  }


  public SLOHistoryMetricsSeries sum(Double sum) {
    this.sum = sum;
    return this;
  }

   /**
   * Total sum of the query.
   * @return sum
  **/
  @ApiModelProperty(example = "0.0", required = true, value = "Total sum of the query.")
  @JsonProperty(JSON_PROPERTY_SUM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getSum() {
    return sum;
  }


  public void setSum(Double sum) {
    this.sum = sum;
  }


  public SLOHistoryMetricsSeries values(List<Double> values) {
    this.values = values;
    return this;
  }

  public SLOHistoryMetricsSeries addValuesItem(Double valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

   /**
   * The query values for each metric.
   * @return values
  **/
  @ApiModelProperty(example = "[]", required = true, value = "The query values for each metric.")
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Double> getValues() {
    return values;
  }


  public void setValues(List<Double> values) {
    this.values = values;
  }


  /**
   * Return true if this SLOHistoryMetricsSeries object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOHistoryMetricsSeries slOHistoryMetricsSeries = (SLOHistoryMetricsSeries) o;
    return Objects.equals(this.count, slOHistoryMetricsSeries.count) &&
        Objects.equals(this.metadata, slOHistoryMetricsSeries.metadata) &&
        Objects.equals(this.sum, slOHistoryMetricsSeries.sum) &&
        Objects.equals(this.values, slOHistoryMetricsSeries.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, metadata, sum, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOHistoryMetricsSeries {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

