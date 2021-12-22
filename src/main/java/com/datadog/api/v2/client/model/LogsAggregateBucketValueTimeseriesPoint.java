/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v2.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.datadog.api.v2.client.JSON;


/**
 * A timeseries point
 */
@ApiModel(description = "A timeseries point")
@JsonPropertyOrder({
  LogsAggregateBucketValueTimeseriesPoint.JSON_PROPERTY_TIME,
  LogsAggregateBucketValueTimeseriesPoint.JSON_PROPERTY_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class LogsAggregateBucketValueTimeseriesPoint {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_TIME = "time";
  private String time;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Double value;


  public LogsAggregateBucketValueTimeseriesPoint time(String time) {
    this.time = time;
    return this;
  }

   /**
   * The time value for this point
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-06-08T11:55:00Z", value = "The time value for this point")
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTime() {
    return time;
  }


  public void setTime(String time) {
    this.time = time;
  }


  public LogsAggregateBucketValueTimeseriesPoint value(Double value) {
    this.value = value;
    return this;
  }

   /**
   * The value for this point
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "19", value = "The value for this point")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getValue() {
    return value;
  }


  public void setValue(Double value) {
    this.value = value;
  }


  /**
   * Return true if this LogsAggregateBucketValueTimeseriesPoint object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsAggregateBucketValueTimeseriesPoint logsAggregateBucketValueTimeseriesPoint = (LogsAggregateBucketValueTimeseriesPoint) o;
    return Objects.equals(this.time, logsAggregateBucketValueTimeseriesPoint.time) &&
        Objects.equals(this.value, logsAggregateBucketValueTimeseriesPoint.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsAggregateBucketValueTimeseriesPoint {\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

