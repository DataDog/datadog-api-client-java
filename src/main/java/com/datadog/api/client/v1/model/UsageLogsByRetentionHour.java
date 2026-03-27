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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

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
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageLogsByRetentionHour {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INDEXED_EVENTS_COUNT = "indexed_events_count";
  private JsonNullable<Long> indexedEventsCount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_LIVE_INDEXED_EVENTS_COUNT = "live_indexed_events_count";
  private JsonNullable<Long> liveIndexedEventsCount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_REHYDRATED_INDEXED_EVENTS_COUNT =
      "rehydrated_indexed_events_count";
  private JsonNullable<Long> rehydratedIndexedEventsCount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_RETENTION = "retention";
  private JsonNullable<String> retention = JsonNullable.<String>undefined();

  public UsageLogsByRetentionHour indexedEventsCount(Long indexedEventsCount) {
    this.indexedEventsCount = JsonNullable.<Long>of(indexedEventsCount);
    return this;
  }

  /**
   * Total logs indexed with this retention period during a given hour.
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

  public UsageLogsByRetentionHour liveIndexedEventsCount(Long liveIndexedEventsCount) {
    this.liveIndexedEventsCount = JsonNullable.<Long>of(liveIndexedEventsCount);
    return this;
  }

  /**
   * Live logs indexed with this retention period during a given hour.
   *
   * @return liveIndexedEventsCount
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getLiveIndexedEventsCount() {
    return liveIndexedEventsCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LIVE_INDEXED_EVENTS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getLiveIndexedEventsCount_JsonNullable() {
    return liveIndexedEventsCount;
  }

  @JsonProperty(JSON_PROPERTY_LIVE_INDEXED_EVENTS_COUNT)
  public void setLiveIndexedEventsCount_JsonNullable(JsonNullable<Long> liveIndexedEventsCount) {
    this.liveIndexedEventsCount = liveIndexedEventsCount;
  }

  public void setLiveIndexedEventsCount(Long liveIndexedEventsCount) {
    this.liveIndexedEventsCount = JsonNullable.<Long>of(liveIndexedEventsCount);
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
  @jakarta.annotation.Nullable
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublicId() {
    return publicId;
  }

  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }

  public UsageLogsByRetentionHour rehydratedIndexedEventsCount(Long rehydratedIndexedEventsCount) {
    this.rehydratedIndexedEventsCount = JsonNullable.<Long>of(rehydratedIndexedEventsCount);
    return this;
  }

  /**
   * Rehydrated logs indexed with this retention period during a given hour.
   *
   * @return rehydratedIndexedEventsCount
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getRehydratedIndexedEventsCount() {
    return rehydratedIndexedEventsCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REHYDRATED_INDEXED_EVENTS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getRehydratedIndexedEventsCount_JsonNullable() {
    return rehydratedIndexedEventsCount;
  }

  @JsonProperty(JSON_PROPERTY_REHYDRATED_INDEXED_EVENTS_COUNT)
  public void setRehydratedIndexedEventsCount_JsonNullable(
      JsonNullable<Long> rehydratedIndexedEventsCount) {
    this.rehydratedIndexedEventsCount = rehydratedIndexedEventsCount;
  }

  public void setRehydratedIndexedEventsCount(Long rehydratedIndexedEventsCount) {
    this.rehydratedIndexedEventsCount = JsonNullable.<Long>of(rehydratedIndexedEventsCount);
  }

  public UsageLogsByRetentionHour retention(String retention) {
    this.retention = JsonNullable.<String>of(retention);
    return this;
  }

  /**
   * The retention period in days or "custom" for all custom retention usage.
   *
   * @return retention
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getRetention() {
    return retention.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RETENTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getRetention_JsonNullable() {
    return retention;
  }

  @JsonProperty(JSON_PROPERTY_RETENTION)
  public void setRetention_JsonNullable(JsonNullable<String> retention) {
    this.retention = retention;
  }

  public void setRetention(String retention) {
    this.retention = JsonNullable.<String>of(retention);
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
   * @return UsageLogsByRetentionHour
   */
  @JsonAnySetter
  public UsageLogsByRetentionHour putAdditionalProperty(String key, Object value) {
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
        && Objects.equals(this.retention, usageLogsByRetentionHour.retention)
        && Objects.equals(this.additionalProperties, usageLogsByRetentionHour.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        indexedEventsCount,
        liveIndexedEventsCount,
        orgName,
        publicId,
        rehydratedIndexedEventsCount,
        retention,
        additionalProperties);
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
