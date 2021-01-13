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
 * Hour usage for logs.
 */
@ApiModel(description = "Hour usage for logs.")
@JsonPropertyOrder({
  UsageLogsHour.JSON_PROPERTY_BILLABLE_INGESTED_BYTES,
  UsageLogsHour.JSON_PROPERTY_HOUR,
  UsageLogsHour.JSON_PROPERTY_INDEXED_EVENTS_COUNT,
  UsageLogsHour.JSON_PROPERTY_INGESTED_EVENTS_BYTES,
  UsageLogsHour.JSON_PROPERTY_LOGS_LIVE_INDEXED_COUNT,
  UsageLogsHour.JSON_PROPERTY_LOGS_LIVE_INGESTED_BYTES,
  UsageLogsHour.JSON_PROPERTY_LOGS_REHYDRATED_INDEXED_COUNT,
  UsageLogsHour.JSON_PROPERTY_LOGS_REHYDRATED_INGESTED_BYTES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UsageLogsHour {
  public static final String JSON_PROPERTY_BILLABLE_INGESTED_BYTES = "billable_ingested_bytes";
  private Long billableIngestedBytes;

  public static final String JSON_PROPERTY_HOUR = "hour";
  private OffsetDateTime hour;

  public static final String JSON_PROPERTY_INDEXED_EVENTS_COUNT = "indexed_events_count";
  private Long indexedEventsCount;

  public static final String JSON_PROPERTY_INGESTED_EVENTS_BYTES = "ingested_events_bytes";
  private Long ingestedEventsBytes;

  public static final String JSON_PROPERTY_LOGS_LIVE_INDEXED_COUNT = "logs_live_indexed_count";
  private Long logsLiveIndexedCount;

  public static final String JSON_PROPERTY_LOGS_LIVE_INGESTED_BYTES = "logs_live_ingested_bytes";
  private Long logsLiveIngestedBytes;

  public static final String JSON_PROPERTY_LOGS_REHYDRATED_INDEXED_COUNT = "logs_rehydrated_indexed_count";
  private Long logsRehydratedIndexedCount;

  public static final String JSON_PROPERTY_LOGS_REHYDRATED_INGESTED_BYTES = "logs_rehydrated_ingested_bytes";
  private Long logsRehydratedIngestedBytes;


  public UsageLogsHour billableIngestedBytes(Long billableIngestedBytes) {
    this.billableIngestedBytes = billableIngestedBytes;
    return this;
  }

   /**
   * Contains the number of billable log bytes ingested.
   * @return billableIngestedBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contains the number of billable log bytes ingested.")
  @JsonProperty(JSON_PROPERTY_BILLABLE_INGESTED_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBillableIngestedBytes() {
    return billableIngestedBytes;
  }


  public void setBillableIngestedBytes(Long billableIngestedBytes) {
    this.billableIngestedBytes = billableIngestedBytes;
  }


  public UsageLogsHour hour(OffsetDateTime hour) {
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


  public UsageLogsHour indexedEventsCount(Long indexedEventsCount) {
    this.indexedEventsCount = indexedEventsCount;
    return this;
  }

   /**
   * Contains the number of log events indexed.
   * @return indexedEventsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contains the number of log events indexed.")
  @JsonProperty(JSON_PROPERTY_INDEXED_EVENTS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getIndexedEventsCount() {
    return indexedEventsCount;
  }


  public void setIndexedEventsCount(Long indexedEventsCount) {
    this.indexedEventsCount = indexedEventsCount;
  }


  public UsageLogsHour ingestedEventsBytes(Long ingestedEventsBytes) {
    this.ingestedEventsBytes = ingestedEventsBytes;
    return this;
  }

   /**
   * Contains the number of log bytes ingested.
   * @return ingestedEventsBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contains the number of log bytes ingested.")
  @JsonProperty(JSON_PROPERTY_INGESTED_EVENTS_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getIngestedEventsBytes() {
    return ingestedEventsBytes;
  }


  public void setIngestedEventsBytes(Long ingestedEventsBytes) {
    this.ingestedEventsBytes = ingestedEventsBytes;
  }


  public UsageLogsHour logsLiveIndexedCount(Long logsLiveIndexedCount) {
    this.logsLiveIndexedCount = logsLiveIndexedCount;
    return this;
  }

   /**
   * Contains the number of live log events indexed (data available as of December 1, 2020).
   * @return logsLiveIndexedCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contains the number of live log events indexed (data available as of December 1, 2020).")
  @JsonProperty(JSON_PROPERTY_LOGS_LIVE_INDEXED_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLogsLiveIndexedCount() {
    return logsLiveIndexedCount;
  }


  public void setLogsLiveIndexedCount(Long logsLiveIndexedCount) {
    this.logsLiveIndexedCount = logsLiveIndexedCount;
  }


  public UsageLogsHour logsLiveIngestedBytes(Long logsLiveIngestedBytes) {
    this.logsLiveIngestedBytes = logsLiveIngestedBytes;
    return this;
  }

   /**
   * Contains the number of live log bytes ingested (data available as of December 1, 2020).
   * @return logsLiveIngestedBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contains the number of live log bytes ingested (data available as of December 1, 2020).")
  @JsonProperty(JSON_PROPERTY_LOGS_LIVE_INGESTED_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLogsLiveIngestedBytes() {
    return logsLiveIngestedBytes;
  }


  public void setLogsLiveIngestedBytes(Long logsLiveIngestedBytes) {
    this.logsLiveIngestedBytes = logsLiveIngestedBytes;
  }


  public UsageLogsHour logsRehydratedIndexedCount(Long logsRehydratedIndexedCount) {
    this.logsRehydratedIndexedCount = logsRehydratedIndexedCount;
    return this;
  }

   /**
   * Contains the number of rehydrated log events indexed (data available as of December 1, 2020).
   * @return logsRehydratedIndexedCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contains the number of rehydrated log events indexed (data available as of December 1, 2020).")
  @JsonProperty(JSON_PROPERTY_LOGS_REHYDRATED_INDEXED_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLogsRehydratedIndexedCount() {
    return logsRehydratedIndexedCount;
  }


  public void setLogsRehydratedIndexedCount(Long logsRehydratedIndexedCount) {
    this.logsRehydratedIndexedCount = logsRehydratedIndexedCount;
  }


  public UsageLogsHour logsRehydratedIngestedBytes(Long logsRehydratedIngestedBytes) {
    this.logsRehydratedIngestedBytes = logsRehydratedIngestedBytes;
    return this;
  }

   /**
   * Contains the number of rehydrated log bytes ingested (data available as of December 1, 2020).
   * @return logsRehydratedIngestedBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contains the number of rehydrated log bytes ingested (data available as of December 1, 2020).")
  @JsonProperty(JSON_PROPERTY_LOGS_REHYDRATED_INGESTED_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLogsRehydratedIngestedBytes() {
    return logsRehydratedIngestedBytes;
  }


  public void setLogsRehydratedIngestedBytes(Long logsRehydratedIngestedBytes) {
    this.logsRehydratedIngestedBytes = logsRehydratedIngestedBytes;
  }


  /**
   * Return true if this UsageLogsHour object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageLogsHour usageLogsHour = (UsageLogsHour) o;
    return Objects.equals(this.billableIngestedBytes, usageLogsHour.billableIngestedBytes) &&
        Objects.equals(this.hour, usageLogsHour.hour) &&
        Objects.equals(this.indexedEventsCount, usageLogsHour.indexedEventsCount) &&
        Objects.equals(this.ingestedEventsBytes, usageLogsHour.ingestedEventsBytes) &&
        Objects.equals(this.logsLiveIndexedCount, usageLogsHour.logsLiveIndexedCount) &&
        Objects.equals(this.logsLiveIngestedBytes, usageLogsHour.logsLiveIngestedBytes) &&
        Objects.equals(this.logsRehydratedIndexedCount, usageLogsHour.logsRehydratedIndexedCount) &&
        Objects.equals(this.logsRehydratedIngestedBytes, usageLogsHour.logsRehydratedIngestedBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billableIngestedBytes, hour, indexedEventsCount, ingestedEventsBytes, logsLiveIndexedCount, logsLiveIngestedBytes, logsRehydratedIndexedCount, logsRehydratedIngestedBytes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageLogsHour {\n");
    sb.append("    billableIngestedBytes: ").append(toIndentedString(billableIngestedBytes)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    indexedEventsCount: ").append(toIndentedString(indexedEventsCount)).append("\n");
    sb.append("    ingestedEventsBytes: ").append(toIndentedString(ingestedEventsBytes)).append("\n");
    sb.append("    logsLiveIndexedCount: ").append(toIndentedString(logsLiveIndexedCount)).append("\n");
    sb.append("    logsLiveIngestedBytes: ").append(toIndentedString(logsLiveIngestedBytes)).append("\n");
    sb.append("    logsRehydratedIndexedCount: ").append(toIndentedString(logsRehydratedIndexedCount)).append("\n");
    sb.append("    logsRehydratedIngestedBytes: ").append(toIndentedString(logsRehydratedIngestedBytes)).append("\n");
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

