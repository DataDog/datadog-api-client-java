/*
 * (C) Datadog, Inc. 2019
 * All rights reserved
 * Licensed under a 3-clause BSD style license (see LICENSE)
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * CanceledDowntimesIds
 */
@JsonPropertyOrder({
  CanceledDowntimesIds.JSON_PROPERTY_CANCELLED_IDS
})

public class CanceledDowntimesIds {
  public static final String JSON_PROPERTY_CANCELLED_IDS = "cancelled_ids";
  private List<Integer> cancelledIds = null;


  public CanceledDowntimesIds cancelledIds(List<Integer> cancelledIds) {
    
    this.cancelledIds = cancelledIds;
    return this;
  }

  public CanceledDowntimesIds addCancelledIdsItem(Integer cancelledIdsItem) {
    if (this.cancelledIds == null) {
      this.cancelledIds = new ArrayList<Integer>();
    }
    this.cancelledIds.add(cancelledIdsItem);
    return this;
  }

   /**
   * Get cancelledIds
   * @return cancelledIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[123456789,123456790]", value = "")
  @JsonProperty(JSON_PROPERTY_CANCELLED_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getCancelledIds() {
    return cancelledIds;
  }


  public void setCancelledIds(List<Integer> cancelledIds) {
    this.cancelledIds = cancelledIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

