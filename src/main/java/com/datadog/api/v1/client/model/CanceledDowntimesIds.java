/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Object containing array of IDs of canceled downtimes. */
@JsonPropertyOrder({CanceledDowntimesIds.JSON_PROPERTY_CANCELLED_IDS})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CanceledDowntimesIds {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CANCELLED_IDS = "cancelled_ids";
  private List<Long> cancelledIds = null;

  public CanceledDowntimesIds cancelledIds(List<Long> cancelledIds) {
    this.cancelledIds = cancelledIds;
    return this;
  }

  public CanceledDowntimesIds addCancelledIdsItem(Long cancelledIdsItem) {
    if (this.cancelledIds == null) {
      this.cancelledIds = new ArrayList<>();
    }
    this.cancelledIds.add(cancelledIdsItem);
    return this;
  }

  /**
   * ID of downtimes that were canceled.
   *
   * @return cancelledIds
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CANCELLED_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Long> getCancelledIds() {
    return cancelledIds;
  }

  public void setCancelledIds(List<Long> cancelledIds) {
    this.cancelledIds = cancelledIds;
  }

  /** Return true if this CanceledDowntimesIds object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CanceledDowntimesIds canceledDowntimesIds = (CanceledDowntimesIds) o;
    return Objects.equals(this.cancelledIds, canceledDowntimesIds.cancelledIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancelledIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CanceledDowntimesIds {\n");
    sb.append("    cancelledIds: ").append(toIndentedString(cancelledIds)).append("\n");
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
