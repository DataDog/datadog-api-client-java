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
import org.openapitools.jackson.nullable.JsonNullable;

/** The monitor identified by the downtime. */
@JsonPropertyOrder({DowntimeRelationshipsMonitor.JSON_PROPERTY_DATA})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DowntimeRelationshipsMonitor {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private JsonNullable<DowntimeRelationshipsMonitorData> data =
      JsonNullable.<DowntimeRelationshipsMonitorData>undefined();

  public DowntimeRelationshipsMonitor data(DowntimeRelationshipsMonitorData data) {
    this.data = JsonNullable.<DowntimeRelationshipsMonitorData>of(data);
    return this;
  }

  /**
   * Data for the monitor.
   *
   * @return data
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public DowntimeRelationshipsMonitorData getData() {
    return data.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<DowntimeRelationshipsMonitorData> getData_JsonNullable() {
    return data;
  }

  @JsonProperty(JSON_PROPERTY_DATA)
  public void setData_JsonNullable(JsonNullable<DowntimeRelationshipsMonitorData> data) {
    this.data = data;
  }

  public void setData(DowntimeRelationshipsMonitorData data) {
    this.data = JsonNullable.<DowntimeRelationshipsMonitorData>of(data);
  }

  /** Return true if this DowntimeRelationshipsMonitor object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DowntimeRelationshipsMonitor downtimeRelationshipsMonitor = (DowntimeRelationshipsMonitor) o;
    return Objects.equals(this.data, downtimeRelationshipsMonitor.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DowntimeRelationshipsMonitor {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
