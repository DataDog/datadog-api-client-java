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

/** All relationships associated with downtime. */
@JsonPropertyOrder({
  DowntimeRelationships.JSON_PROPERTY_CREATED_BY,
  DowntimeRelationships.JSON_PROPERTY_MONITOR
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DowntimeRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private DowntimeRelationshipsCreatedBy createdBy;

  public static final String JSON_PROPERTY_MONITOR = "monitor";
  private DowntimeRelationshipsMonitor monitor;

  public DowntimeRelationships createdBy(DowntimeRelationshipsCreatedBy createdBy) {
    this.createdBy = createdBy;
    this.unparsed |= createdBy.unparsed;
    return this;
  }

  /**
   * The user who created the downtime.
   *
   * @return createdBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DowntimeRelationshipsCreatedBy getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(DowntimeRelationshipsCreatedBy createdBy) {
    this.createdBy = createdBy;
  }

  public DowntimeRelationships monitor(DowntimeRelationshipsMonitor monitor) {
    this.monitor = monitor;
    this.unparsed |= monitor.unparsed;
    return this;
  }

  /**
   * The monitor identified by the downtime.
   *
   * @return monitor
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DowntimeRelationshipsMonitor getMonitor() {
    return monitor;
  }

  public void setMonitor(DowntimeRelationshipsMonitor monitor) {
    this.monitor = monitor;
  }

  /** Return true if this DowntimeRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DowntimeRelationships downtimeRelationships = (DowntimeRelationships) o;
    return Objects.equals(this.createdBy, downtimeRelationships.createdBy)
        && Objects.equals(this.monitor, downtimeRelationships.monitor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, monitor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DowntimeRelationships {\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    monitor: ").append(toIndentedString(monitor)).append("\n");
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
