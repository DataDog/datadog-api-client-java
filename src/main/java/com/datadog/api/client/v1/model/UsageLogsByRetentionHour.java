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

/**
 * The number of indexed logs for each hour for a given organization broken down by retention
 * period.
 */
@JsonPropertyOrder({
  UsageLogsByRetentionHour.JSON_PROPERTY_INDEXED_EVENTS_COUNT,
  UsageLogsByRetentionHour.JSON_PROPERTY_LIVE_INDEXED_EVENTS_COUNT,
  UsageLogsByRetentionHour.JSON_PROPERTY_ORG_NAME,
  UsageLogsByRetentionHour.JSON_PROPERTY_PUBLIC_ID,
  UsageLogsByRetentionHour.JSON_PROPERTY_REHYDRATED_INDEXED_EVENTS_COUNT,
  UsageLogsByRetentionHour.JSON_PROPERTY_RETENTION
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageLogsByRetentionHour {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INDEXED_EVENTS_COUNT = "indexed_events_count";
  private Long indexedEventsCount;

  public static final String JSON_PROPERTY_LIVE_INDEXED_EVENTS_COUNT = "live_indexed_events_count";
  private Long liveIndexedEventsCount;

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_REHYDRATED_INDEXED_EVENTS_COUNT =
      "rehydrated_indexed_events_count";
  private Long rehydratedIndexedEventsCount;

  public static final String JSON_PROPERTY_RETENTION = "retention";
  private String retention;

  public UsageLogsByRetentionHour indexedEventsCount(Long indexedEventsCount) {
    this.indexedEventsCount = indexedEventsCount;
    return this;
  }

  /**
   * Total logs indexed with this retention period during a given hour.
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

  public UsageLogsByRetentionHour liveIndexedEventsCount(Long liveIndexedEventsCount) {
    this.liveIndexedEventsCount = liveIndexedEventsCount;
    return this;
  }

  /**
   * Live logs indexed with this retention period during a given hour.
   *
   * @return liveIndexedEventsCount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIVE_INDEXED_EVENTS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLiveIndexedEventsCount() {
    return liveIndexedEventsCount;
  }

  public void setLiveIndexedEventsCount(Long liveIndexedEventsCount) {
    this.liveIndexedEventsCount = liveIndexedEventsCount;
  }

  public UsageLogsByRetentionHour orgName(String orgName) {
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

  public UsageLogsByRetentionHour publicId(String publicId) {
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

  public UsageLogsByRetentionHour rehydratedIndexedEventsCount(Long rehydratedIndexedEventsCount) {
    this.rehydratedIndexedEventsCount = rehydratedIndexedEventsCount;
    return this;
  }

  /**
   * Rehydrated logs indexed with this retention period during a given hour.
   *
   * @return rehydratedIndexedEventsCount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REHYDRATED_INDEXED_EVENTS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRehydratedIndexedEventsCount() {
    return rehydratedIndexedEventsCount;
  }

  public void setRehydratedIndexedEventsCount(Long rehydratedIndexedEventsCount) {
    this.rehydratedIndexedEventsCount = rehydratedIndexedEventsCount;
  }

  public UsageLogsByRetentionHour retention(String retention) {
    this.retention = retention;
    return this;
  }

  /**
   * The retention period in days or "custom" for all custom retention usage.
   *
   * @return retention
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETENTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRetention() {
    return retention;
  }

  public void setRetention(String retention) {
    this.retention = retention;
  }

  /** Return true if this UsageLogsByRetentionHour object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageLogsByRetentionHour usageLogsByRetentionHour = (UsageLogsByRetentionHour) o;
    return Objects.equals(this.indexedEventsCount, usageLogsByRetentionHour.indexedEventsCount)
        && Objects.equals(
            this.liveIndexedEventsCount, usageLogsByRetentionHour.liveIndexedEventsCount)
        && Objects.equals(this.orgName, usageLogsByRetentionHour.orgName)
        && Objects.equals(this.publicId, usageLogsByRetentionHour.publicId)
        && Objects.equals(
            this.rehydratedIndexedEventsCount,
            usageLogsByRetentionHour.rehydratedIndexedEventsCount)
        && Objects.equals(this.retention, usageLogsByRetentionHour.retention);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        indexedEventsCount,
        liveIndexedEventsCount,
        orgName,
        publicId,
        rehydratedIndexedEventsCount,
        retention);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageLogsByRetentionHour {\n");
    sb.append("    indexedEventsCount: ").append(toIndentedString(indexedEventsCount)).append("\n");
    sb.append("    liveIndexedEventsCount: ")
        .append(toIndentedString(liveIndexedEventsCount))
        .append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    rehydratedIndexedEventsCount: ")
        .append(toIndentedString(rehydratedIndexedEventsCount))
        .append("\n");
    sb.append("    retention: ").append(toIndentedString(retention)).append("\n");
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
