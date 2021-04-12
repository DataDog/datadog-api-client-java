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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** The new log-based metric properties. */
@ApiModel(description = "The new log-based metric properties.")
@JsonPropertyOrder({
  LogsMetricCreateData.JSON_PROPERTY_ATTRIBUTES,
  LogsMetricCreateData.JSON_PROPERTY_ID,
  LogsMetricCreateData.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LogsMetricCreateData {
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private LogsMetricCreateAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LogsMetricType type = LogsMetricType.LOGS_METRICS;

  public LogsMetricCreateData attributes(LogsMetricCreateAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Get attributes
   *
   * @return attributes
   */
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogsMetricCreateAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(LogsMetricCreateAttributes attributes) {
    this.attributes = attributes;
  }

  public LogsMetricCreateData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The name of the log-based metric.
   *
   * @return id
   */
  @ApiModelProperty(
      example = "logs.page.load.count",
      required = true,
      value = "The name of the log-based metric.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LogsMetricCreateData type(LogsMetricType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogsMetricType getType() {
    return type;
  }

  public void setType(LogsMetricType type) {
    this.type = type;
  }

  /** Return true if this LogsMetricCreateData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsMetricCreateData logsMetricCreateData = (LogsMetricCreateData) o;
    return Objects.equals(this.attributes, logsMetricCreateData.attributes)
        && Objects.equals(this.id, logsMetricCreateData.id)
        && Objects.equals(this.type, logsMetricCreateData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsMetricCreateData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
