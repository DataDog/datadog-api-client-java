/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v2.client.model;

import com.datadog.api.v2.client.JsonTimeSerializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Usage timeseries data. */
@JsonPropertyOrder({
  UsageTimeSeriesObject.JSON_PROPERTY_TIMESTAMP,
  UsageTimeSeriesObject.JSON_PROPERTY_VALUE
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageTimeSeriesObject {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime timestamp;

  public static final String JSON_PROPERTY_VALUE = "value";
  private JsonNullable<Long> value = JsonNullable.<Long>undefined();

  public UsageTimeSeriesObject timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Datetime in ISO-8601 format, UTC. The hour for the usage.
   *
   * @return timestamp
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public UsageTimeSeriesObject value(Long value) {
    this.value = JsonNullable.<Long>of(value);
    return this;
  }

  /**
   * Contains the number measured for the given usage_type during the hour.
   *
   * @return value
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public Long getValue() {
    return value.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getValue_JsonNullable() {
    return value;
  }

  @JsonProperty(JSON_PROPERTY_VALUE)
  public void setValue_JsonNullable(JsonNullable<Long> value) {
    this.value = value;
  }

  public void setValue(Long value) {
    this.value = JsonNullable.<Long>of(value);
  }

  /** Return true if this UsageTimeSeriesObject object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageTimeSeriesObject usageTimeSeriesObject = (UsageTimeSeriesObject) o;
    return Objects.equals(this.timestamp, usageTimeSeriesObject.timestamp)
        && Objects.equals(this.value, usageTimeSeriesObject.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageTimeSeriesObject {\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
