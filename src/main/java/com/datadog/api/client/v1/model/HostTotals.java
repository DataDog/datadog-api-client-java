/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Total number of host currently monitored by Datadog. */
@JsonPropertyOrder({HostTotals.JSON_PROPERTY_TOTAL_ACTIVE, HostTotals.JSON_PROPERTY_TOTAL_UP})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HostTotals {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TOTAL_ACTIVE = "total_active";
  private Long totalActive;

  public static final String JSON_PROPERTY_TOTAL_UP = "total_up";
  private Long totalUp;

  public HostTotals totalActive(Long totalActive) {
    this.totalActive = totalActive;
    return this;
  }

  /**
   * Total number of active host (UP and ???) reporting to Datadog.
   *
   * @return totalActive
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotalActive() {
    return totalActive;
  }

  public void setTotalActive(Long totalActive) {
    this.totalActive = totalActive;
  }

  public HostTotals totalUp(Long totalUp) {
    this.totalUp = totalUp;
    return this;
  }

  /**
   * Number of host that are UP and reporting to Datadog.
   *
   * @return totalUp
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_UP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotalUp() {
    return totalUp;
  }

  public void setTotalUp(Long totalUp) {
    this.totalUp = totalUp;
  }

  /** Return true if this HostTotals object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostTotals hostTotals = (HostTotals) o;
    return Objects.equals(this.totalActive, hostTotals.totalActive)
        && Objects.equals(this.totalUp, hostTotals.totalUp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalActive, totalUp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostTotals {\n");
    sb.append("    totalActive: ").append(toIndentedString(totalActive)).append("\n");
    sb.append("    totalUp: ").append(toIndentedString(totalUp)).append("\n");
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
