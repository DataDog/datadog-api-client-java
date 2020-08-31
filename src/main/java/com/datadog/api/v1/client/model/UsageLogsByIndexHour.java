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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * Number of indexed logs for each hour and index for a given organization.
 */
@ApiModel(description = "Number of indexed logs for each hour and index for a given organization.")
@JsonPropertyOrder({
  UsageLogsByIndexHour.JSON_PROPERTY_EVENT_COUNT,
  UsageLogsByIndexHour.JSON_PROPERTY_HOUR,
  UsageLogsByIndexHour.JSON_PROPERTY_INDEX_ID,
  UsageLogsByIndexHour.JSON_PROPERTY_INDEX_NAME,
  UsageLogsByIndexHour.JSON_PROPERTY_RETENTION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UsageLogsByIndexHour {
  public static final String JSON_PROPERTY_EVENT_COUNT = "event_count";
  private Long eventCount;

  public static final String JSON_PROPERTY_HOUR = "hour";
  private OffsetDateTime hour;

  public static final String JSON_PROPERTY_INDEX_ID = "index_id";
  private String indexId;

  public static final String JSON_PROPERTY_INDEX_NAME = "index_name";
  private String indexName;

  public static final String JSON_PROPERTY_RETENTION = "retention";
  private Long retention;


  public UsageLogsByIndexHour eventCount(Long eventCount) {
    this.eventCount = eventCount;
    return this;
  }

   /**
   * The total number of indexed logs for the queried hour.
   * @return eventCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total number of indexed logs for the queried hour.")
  @JsonProperty(JSON_PROPERTY_EVENT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getEventCount() {
    return eventCount;
  }


  public void setEventCount(Long eventCount) {
    this.eventCount = eventCount;
  }


  public UsageLogsByIndexHour hour(OffsetDateTime hour) {
    this.hour = hour;
    return this;
  }

   /**
   * The hour for the usage.
   * @return hour
  **/
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


  public UsageLogsByIndexHour indexId(String indexId) {
    this.indexId = indexId;
    return this;
  }

   /**
   * The index ID for this usage.
   * @return indexId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The index ID for this usage.")
  @JsonProperty(JSON_PROPERTY_INDEX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIndexId() {
    return indexId;
  }


  public void setIndexId(String indexId) {
    this.indexId = indexId;
  }


  public UsageLogsByIndexHour indexName(String indexName) {
    this.indexName = indexName;
    return this;
  }

   /**
   * The user specified name for this index ID.
   * @return indexName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user specified name for this index ID.")
  @JsonProperty(JSON_PROPERTY_INDEX_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIndexName() {
    return indexName;
  }


  public void setIndexName(String indexName) {
    this.indexName = indexName;
  }


  public UsageLogsByIndexHour retention(Long retention) {
    this.retention = retention;
    return this;
  }

   /**
   * The retention period (in days) for this index ID.
   * @return retention
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The retention period (in days) for this index ID.")
  @JsonProperty(JSON_PROPERTY_RETENTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getRetention() {
    return retention;
  }


  public void setRetention(Long retention) {
    this.retention = retention;
  }


  /**
   * Return true if this UsageLogsByIndexHour object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageLogsByIndexHour usageLogsByIndexHour = (UsageLogsByIndexHour) o;
    return Objects.equals(this.eventCount, usageLogsByIndexHour.eventCount) &&
        Objects.equals(this.hour, usageLogsByIndexHour.hour) &&
        Objects.equals(this.indexId, usageLogsByIndexHour.indexId) &&
        Objects.equals(this.indexName, usageLogsByIndexHour.indexName) &&
        Objects.equals(this.retention, usageLogsByIndexHour.retention);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventCount, hour, indexId, indexName, retention);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageLogsByIndexHour {\n");
    sb.append("    eventCount: ").append(toIndentedString(eventCount)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    indexId: ").append(toIndentedString(indexId)).append("\n");
    sb.append("    indexName: ").append(toIndentedString(indexName)).append("\n");
    sb.append("    retention: ").append(toIndentedString(retention)).append("\n");
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

