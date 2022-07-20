/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** The new log-based metric properties. */
@JsonPropertyOrder({
  LogsMetricCreateData.JSON_PROPERTY_ATTRIBUTES,
  LogsMetricCreateData.JSON_PROPERTY_ID,
  LogsMetricCreateData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsMetricCreateData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private LogsMetricCreateAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LogsMetricType type = LogsMetricType.LOGS_METRICS;

  public LogsMetricCreateData() {}

  @JsonCreator
  public LogsMetricCreateData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          LogsMetricCreateAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) LogsMetricType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.id = id;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public LogsMetricCreateData attributes(LogsMetricCreateAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * The object describing the Datadog log-based metric to create.
   *
   * @return attributes
   */
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
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of the resource. The value should always be logs_metrics.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogsMetricType getType() {
    return type;
  }

  public void setType(LogsMetricType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
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
