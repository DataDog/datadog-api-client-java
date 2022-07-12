/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.datadog.api.client.JsonTimeSerializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;
import java.util.Objects;

/** Hour usage for logs. */
@JsonPropertyOrder({
  UsageLogsHour.JSON_PROPERTY_BILLABLE_INGESTED_BYTES,
  UsageLogsHour.JSON_PROPERTY_HOUR,
  UsageLogsHour.JSON_PROPERTY_INDEXED_EVENTS_COUNT,
  UsageLogsHour.JSON_PROPERTY_INGESTED_EVENTS_BYTES,
  UsageLogsHour.JSON_PROPERTY_LOGS_LIVE_INDEXED_COUNT,
  UsageLogsHour.JSON_PROPERTY_LOGS_LIVE_INGESTED_BYTES,
  UsageLogsHour.JSON_PROPERTY_LOGS_REHYDRATED_INDEXED_COUNT,
  UsageLogsHour.JSON_PROPERTY_LOGS_REHYDRATED_INGESTED_BYTES,
  UsageLogsHour.JSON_PROPERTY_ORG_NAME,
  UsageLogsHour.JSON_PROPERTY_PUBLIC_ID
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageLogsHour {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BILLABLE_INGESTED_BYTES = "billable_ingested_bytes";
  private Long billableIngestedBytes;

  public static final String JSON_PROPERTY_HOUR = "hour";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime hour;

  public static final String JSON_PROPERTY_INDEXED_EVENTS_COUNT = "indexed_events_count";
  private Long indexedEventsCount;

  public static final String JSON_PROPERTY_INGESTED_EVENTS_BYTES = "ingested_events_bytes";
  private Long ingestedEventsBytes;

  public static final String JSON_PROPERTY_LOGS_LIVE_INDEXED_COUNT = "logs_live_indexed_count";
  private Long logsLiveIndexedCount;

  public static final String JSON_PROPERTY_LOGS_LIVE_INGESTED_BYTES = "logs_live_ingested_bytes";
  private Long logsLiveIngestedBytes;

  public static final String JSON_PROPERTY_LOGS_REHYDRATED_INDEXED_COUNT =
      "logs_rehydrated_indexed_count";
  private Long logsRehydratedIndexedCount;

  public static final String JSON_PROPERTY_LOGS_REHYDRATED_INGESTED_BYTES =
      "logs_rehydrated_ingested_bytes";
  private Long logsRehydratedIngestedBytes;

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public UsageLogsHour billableIngestedBytes(Long billableIngestedBytes) {
    this.billableIngestedBytes = billableIngestedBytes;
    return this;
  }

  /**
   * Contains the number of billable log bytes ingested.
   *
   * @return billableIngestedBytes
   */
  @javax.annotation.Nullable
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
   *
   * @return hour
   */
  @javax.annotation.Nullable
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
   *
   * @return indexedEventsCount
   */
  @javax.annotation.Nullable
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
   *
   * @return ingestedEventsBytes
   */
  @javax.annotation.Nullable
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
   *
   * @return logsLiveIndexedCount
   */
  @javax.annotation.Nullable
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
   *
   * @return logsLiveIngestedBytes
   */
  @javax.annotation.Nullable
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
   *
   * @return logsRehydratedIndexedCount
   */
  @javax.annotation.Nullable
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
   *
   * @return logsRehydratedIngestedBytes
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_REHYDRATED_INGESTED_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLogsRehydratedIngestedBytes() {
    return logsRehydratedIngestedBytes;
  }

  public void setLogsRehydratedIngestedBytes(Long logsRehydratedIngestedBytes) {
    this.logsRehydratedIngestedBytes = logsRehydratedIngestedBytes;
  }

  public UsageLogsHour orgName(String orgName) {
    this.orgName = orgName;
    return this;
  }

  /**
   * The organization name.
   *
   * @return orgName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORG_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOrgName() {
    return orgName;
  }

  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }

  public UsageLogsHour publicId(String publicId) {
    this.publicId = publicId;
    return this;
  }

  /**
   * The organization public ID.
   *
   * @return publicId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublicId() {
    return publicId;
  }

  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }

  /** Return true if this UsageLogsHour object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageLogsHour usageLogsHour = (UsageLogsHour) o;
    return Objects.equals(this.billableIngestedBytes, usageLogsHour.billableIngestedBytes)
        && Objects.equals(this.hour, usageLogsHour.hour)
        && Objects.equals(this.indexedEventsCount, usageLogsHour.indexedEventsCount)
        && Objects.equals(this.ingestedEventsBytes, usageLogsHour.ingestedEventsBytes)
        && Objects.equals(this.logsLiveIndexedCount, usageLogsHour.logsLiveIndexedCount)
        && Objects.equals(this.logsLiveIngestedBytes, usageLogsHour.logsLiveIngestedBytes)
        && Objects.equals(this.logsRehydratedIndexedCount, usageLogsHour.logsRehydratedIndexedCount)
        && Objects.equals(
            this.logsRehydratedIngestedBytes, usageLogsHour.logsRehydratedIngestedBytes)
        && Objects.equals(this.orgName, usageLogsHour.orgName)
        && Objects.equals(this.publicId, usageLogsHour.publicId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        billableIngestedBytes,
        hour,
        indexedEventsCount,
        ingestedEventsBytes,
        logsLiveIndexedCount,
        logsLiveIngestedBytes,
        logsRehydratedIndexedCount,
        logsRehydratedIngestedBytes,
        orgName,
        publicId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageLogsHour {\n");
    sb.append("    billableIngestedBytes: ")
        .append(toIndentedString(billableIngestedBytes))
        .append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    indexedEventsCount: ").append(toIndentedString(indexedEventsCount)).append("\n");
    sb.append("    ingestedEventsBytes: ")
        .append(toIndentedString(ingestedEventsBytes))
        .append("\n");
    sb.append("    logsLiveIndexedCount: ")
        .append(toIndentedString(logsLiveIndexedCount))
        .append("\n");
    sb.append("    logsLiveIngestedBytes: ")
        .append(toIndentedString(logsLiveIngestedBytes))
        .append("\n");
    sb.append("    logsRehydratedIndexedCount: ")
        .append(toIndentedString(logsRehydratedIndexedCount))
        .append("\n");
    sb.append("    logsRehydratedIngestedBytes: ")
        .append(toIndentedString(logsRehydratedIngestedBytes))
        .append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
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