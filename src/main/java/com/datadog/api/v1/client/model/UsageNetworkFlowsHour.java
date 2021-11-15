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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.Objects;

/** Number of netflow events indexed for each hour for a given organization. */
@ApiModel(description = "Number of netflow events indexed for each hour for a given organization.")
@JsonPropertyOrder({
  UsageNetworkFlowsHour.JSON_PROPERTY_HOUR,
  UsageNetworkFlowsHour.JSON_PROPERTY_INDEXED_EVENTS_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UsageNetworkFlowsHour {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HOUR = "hour";
  private OffsetDateTime hour;

  public static final String JSON_PROPERTY_INDEXED_EVENTS_COUNT = "indexed_events_count";
  private Long indexedEventsCount;

  public UsageNetworkFlowsHour hour(OffsetDateTime hour) {
    this.hour = hour;
    return this;
  }

  /**
   * The hour for the usage.
   *
   * @return hour
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The hour for the usage.")
  @JsonProperty(JSON_PROPERTY_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getHour() {
    return hour;
  }

  public void setHour(OffsetDateTime hour) {
    this.hour = hour;
  }

  public UsageNetworkFlowsHour indexedEventsCount(Long indexedEventsCount) {
    this.indexedEventsCount = indexedEventsCount;
    return this;
  }

  /**
   * Contains the number of netflow events indexed.
   *
   * @return indexedEventsCount
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contains the number of netflow events indexed.")
  @JsonProperty(JSON_PROPERTY_INDEXED_EVENTS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getIndexedEventsCount() {
    return indexedEventsCount;
  }

  public void setIndexedEventsCount(Long indexedEventsCount) {
    this.indexedEventsCount = indexedEventsCount;
  }

  /** Return true if this UsageNetworkFlowsHour object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageNetworkFlowsHour usageNetworkFlowsHour = (UsageNetworkFlowsHour) o;
    return Objects.equals(this.hour, usageNetworkFlowsHour.hour)
        && Objects.equals(this.indexedEventsCount, usageNetworkFlowsHour.indexedEventsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hour, indexedEventsCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageNetworkFlowsHour {\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    indexedEventsCount: ").append(toIndentedString(indexedEventsCount)).append("\n");
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
