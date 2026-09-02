/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Hour usage for logs. */
@JsonPropertyOrder({
  UsageLogsHour.JSON_PROPERTY_BILLABLE_INGESTED_BYTES,
  UsageLogsHour.JSON_PROPERTY_HOUR,
  UsageLogsHour.JSON_PROPERTY_INDEXED_EVENTS_COUNT,
  UsageLogsHour.JSON_PROPERTY_INGESTED_EVENTS_BYTES,
  UsageLogsHour.JSON_PROPERTY_LOGS_FORWARDING_EVENTS_BYTES,
  UsageLogsHour.JSON_PROPERTY_LOGS_LIVE_INDEXED_COUNT,
  UsageLogsHour.JSON_PROPERTY_LOGS_LIVE_INGESTED_BYTES,
  UsageLogsHour.JSON_PROPERTY_LOGS_REHYDRATED_INDEXED_COUNT,
  UsageLogsHour.JSON_PROPERTY_LOGS_REHYDRATED_INGESTED_BYTES,
  UsageLogsHour.JSON_PROPERTY_ORG_NAME,
  UsageLogsHour.JSON_PROPERTY_PUBLIC_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageLogsHour {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BILLABLE_INGESTED_BYTES = "billable_ingested_bytes";
  private JsonNullable<Long> billableIngestedBytes = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_HOUR = "hour";
  private OffsetDateTime hour;

  public static final String JSON_PROPERTY_INDEXED_EVENTS_COUNT = "indexed_events_count";
  private JsonNullable<Long> indexedEventsCount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_INGESTED_EVENTS_BYTES = "ingested_events_bytes";
  private JsonNullable<Long> ingestedEventsBytes = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_LOGS_FORWARDING_EVENTS_BYTES =
      "logs_forwarding_events_bytes";
  private JsonNullable<Long> logsForwardingEventsBytes = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_LOGS_LIVE_INDEXED_COUNT = "logs_live_indexed_count";
  private JsonNullable<Long> logsLiveIndexedCount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_LOGS_LIVE_INGESTED_BYTES = "logs_live_ingested_bytes";
  private JsonNullable<Long> logsLiveIngestedBytes = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_LOGS_REHYDRATED_INDEXED_COUNT =
      "logs_rehydrated_indexed_count";
  private JsonNullable<Long> logsRehydratedIndexedCount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_LOGS_REHYDRATED_INGESTED_BYTES =
      "logs_rehydrated_ingested_bytes";
  private JsonNullable<Long> logsRehydratedIngestedBytes = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public UsageLogsHour billableIngestedBytes(Long billableIngestedBytes) {
    this.billableIngestedBytes = JsonNullable.<Long>of(billableIngestedBytes);
    return this;
  }

  /**
   * Contains the number of billable log bytes ingested.
   *
   * @return billableIngestedBytes
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getBillableIngestedBytes() {
    return billableIngestedBytes.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BILLABLE_INGESTED_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getBillableIngestedBytes_JsonNullable() {
    return billableIngestedBytes;
  }

  @JsonProperty(JSON_PROPERTY_BILLABLE_INGESTED_BYTES)
  public void setBillableIngestedBytes_JsonNullable(JsonNullable<Long> billableIngestedBytes) {
    this.billableIngestedBytes = billableIngestedBytes;
  }

  public void setBillableIngestedBytes(Long billableIngestedBytes) {
    this.billableIngestedBytes = JsonNullable.<Long>of(billableIngestedBytes);
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getHour() {
    return hour;
  }

  public void setHour(OffsetDateTime hour) {
    this.hour = hour;
  }

  public UsageLogsHour indexedEventsCount(Long indexedEventsCount) {
    this.indexedEventsCount = JsonNullable.<Long>of(indexedEventsCount);
    return this;
  }

  /**
   * Contains the number of log events indexed.
   *
   * @return indexedEventsCount
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getIndexedEventsCount() {
    return indexedEventsCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INDEXED_EVENTS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getIndexedEventsCount_JsonNullable() {
    return indexedEventsCount;
  }

  @JsonProperty(JSON_PROPERTY_INDEXED_EVENTS_COUNT)
  public void setIndexedEventsCount_JsonNullable(JsonNullable<Long> indexedEventsCount) {
    this.indexedEventsCount = indexedEventsCount;
  }

  public void setIndexedEventsCount(Long indexedEventsCount) {
    this.indexedEventsCount = JsonNullable.<Long>of(indexedEventsCount);
  }

  public UsageLogsHour ingestedEventsBytes(Long ingestedEventsBytes) {
    this.ingestedEventsBytes = JsonNullable.<Long>of(ingestedEventsBytes);
    return this;
  }

  /**
   * Contains the number of log bytes ingested.
   *
   * @return ingestedEventsBytes
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getIngestedEventsBytes() {
    return ingestedEventsBytes.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INGESTED_EVENTS_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getIngestedEventsBytes_JsonNullable() {
    return ingestedEventsBytes;
  }

  @JsonProperty(JSON_PROPERTY_INGESTED_EVENTS_BYTES)
  public void setIngestedEventsBytes_JsonNullable(JsonNullable<Long> ingestedEventsBytes) {
    this.ingestedEventsBytes = ingestedEventsBytes;
  }

  public void setIngestedEventsBytes(Long ingestedEventsBytes) {
    this.ingestedEventsBytes = JsonNullable.<Long>of(ingestedEventsBytes);
  }

  public UsageLogsHour logsForwardingEventsBytes(Long logsForwardingEventsBytes) {
    this.logsForwardingEventsBytes = JsonNullable.<Long>of(logsForwardingEventsBytes);
    return this;
  }

  /**
   * Contains the number of logs forwarded bytes (data available as of April 1st 2023)
   *
   * @return logsForwardingEventsBytes
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getLogsForwardingEventsBytes() {
    return logsForwardingEventsBytes.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOGS_FORWARDING_EVENTS_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getLogsForwardingEventsBytes_JsonNullable() {
    return logsForwardingEventsBytes;
  }

  @JsonProperty(JSON_PROPERTY_LOGS_FORWARDING_EVENTS_BYTES)
  public void setLogsForwardingEventsBytes_JsonNullable(
      JsonNullable<Long> logsForwardingEventsBytes) {
    this.logsForwardingEventsBytes = logsForwardingEventsBytes;
  }

  public void setLogsForwardingEventsBytes(Long logsForwardingEventsBytes) {
    this.logsForwardingEventsBytes = JsonNullable.<Long>of(logsForwardingEventsBytes);
  }

  public UsageLogsHour logsLiveIndexedCount(Long logsLiveIndexedCount) {
    this.logsLiveIndexedCount = JsonNullable.<Long>of(logsLiveIndexedCount);
    return this;
  }

  /**
   * Contains the number of live log events indexed (data available as of December 1, 2020).
   *
   * @return logsLiveIndexedCount
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getLogsLiveIndexedCount() {
    return logsLiveIndexedCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOGS_LIVE_INDEXED_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getLogsLiveIndexedCount_JsonNullable() {
    return logsLiveIndexedCount;
  }

  @JsonProperty(JSON_PROPERTY_LOGS_LIVE_INDEXED_COUNT)
  public void setLogsLiveIndexedCount_JsonNullable(JsonNullable<Long> logsLiveIndexedCount) {
    this.logsLiveIndexedCount = logsLiveIndexedCount;
  }

  public void setLogsLiveIndexedCount(Long logsLiveIndexedCount) {
    this.logsLiveIndexedCount = JsonNullable.<Long>of(logsLiveIndexedCount);
  }

  public UsageLogsHour logsLiveIngestedBytes(Long logsLiveIngestedBytes) {
    this.logsLiveIngestedBytes = JsonNullable.<Long>of(logsLiveIngestedBytes);
    return this;
  }

  /**
   * Contains the number of live log bytes ingested (data available as of December 1, 2020).
   *
   * @return logsLiveIngestedBytes
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getLogsLiveIngestedBytes() {
    return logsLiveIngestedBytes.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOGS_LIVE_INGESTED_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getLogsLiveIngestedBytes_JsonNullable() {
    return logsLiveIngestedBytes;
  }

  @JsonProperty(JSON_PROPERTY_LOGS_LIVE_INGESTED_BYTES)
  public void setLogsLiveIngestedBytes_JsonNullable(JsonNullable<Long> logsLiveIngestedBytes) {
    this.logsLiveIngestedBytes = logsLiveIngestedBytes;
  }

  public void setLogsLiveIngestedBytes(Long logsLiveIngestedBytes) {
    this.logsLiveIngestedBytes = JsonNullable.<Long>of(logsLiveIngestedBytes);
  }

  public UsageLogsHour logsRehydratedIndexedCount(Long logsRehydratedIndexedCount) {
    this.logsRehydratedIndexedCount = JsonNullable.<Long>of(logsRehydratedIndexedCount);
    return this;
  }

  /**
   * Contains the number of rehydrated log events indexed (data available as of December 1, 2020).
   *
   * @return logsRehydratedIndexedCount
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getLogsRehydratedIndexedCount() {
    return logsRehydratedIndexedCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOGS_REHYDRATED_INDEXED_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getLogsRehydratedIndexedCount_JsonNullable() {
    return logsRehydratedIndexedCount;
  }

  @JsonProperty(JSON_PROPERTY_LOGS_REHYDRATED_INDEXED_COUNT)
  public void setLogsRehydratedIndexedCount_JsonNullable(
      JsonNullable<Long> logsRehydratedIndexedCount) {
    this.logsRehydratedIndexedCount = logsRehydratedIndexedCount;
  }

  public void setLogsRehydratedIndexedCount(Long logsRehydratedIndexedCount) {
    this.logsRehydratedIndexedCount = JsonNullable.<Long>of(logsRehydratedIndexedCount);
  }

  public UsageLogsHour logsRehydratedIngestedBytes(Long logsRehydratedIngestedBytes) {
    this.logsRehydratedIngestedBytes = JsonNullable.<Long>of(logsRehydratedIngestedBytes);
    return this;
  }

  /**
   * Contains the number of rehydrated log bytes ingested (data available as of December 1, 2020).
   *
   * @return logsRehydratedIngestedBytes
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getLogsRehydratedIngestedBytes() {
    return logsRehydratedIngestedBytes.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOGS_REHYDRATED_INGESTED_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getLogsRehydratedIngestedBytes_JsonNullable() {
    return logsRehydratedIngestedBytes;
  }

  @JsonProperty(JSON_PROPERTY_LOGS_REHYDRATED_INGESTED_BYTES)
  public void setLogsRehydratedIngestedBytes_JsonNullable(
      JsonNullable<Long> logsRehydratedIngestedBytes) {
    this.logsRehydratedIngestedBytes = logsRehydratedIngestedBytes;
  }

  public void setLogsRehydratedIngestedBytes(Long logsRehydratedIngestedBytes) {
    this.logsRehydratedIngestedBytes = JsonNullable.<Long>of(logsRehydratedIngestedBytes);
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
  @jakarta.annotation.Nullable
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublicId() {
    return publicId;
  }

  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return UsageLogsHour
   */
  @JsonAnySetter
  public UsageLogsHour putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
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
        && Objects.equals(this.logsForwardingEventsBytes, usageLogsHour.logsForwardingEventsBytes)
        && Objects.equals(this.logsLiveIndexedCount, usageLogsHour.logsLiveIndexedCount)
        && Objects.equals(this.logsLiveIngestedBytes, usageLogsHour.logsLiveIngestedBytes)
        && Objects.equals(this.logsRehydratedIndexedCount, usageLogsHour.logsRehydratedIndexedCount)
        && Objects.equals(
            this.logsRehydratedIngestedBytes, usageLogsHour.logsRehydratedIngestedBytes)
        && Objects.equals(this.orgName, usageLogsHour.orgName)
        && Objects.equals(this.publicId, usageLogsHour.publicId)
        && Objects.equals(this.additionalProperties, usageLogsHour.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        billableIngestedBytes,
        hour,
        indexedEventsCount,
        ingestedEventsBytes,
        logsForwardingEventsBytes,
        logsLiveIndexedCount,
        logsLiveIngestedBytes,
        logsRehydratedIndexedCount,
        logsRehydratedIngestedBytes,
        orgName,
        publicId,
        additionalProperties);
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
    sb.append("    logsForwardingEventsBytes: ")
        .append(toIndentedString(logsForwardingEventsBytes))
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
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
