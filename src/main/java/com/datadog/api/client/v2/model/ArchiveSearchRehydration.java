/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Rehydration settings of the Archive Search. Absent when the search only scans the archive without
 * indexing the results.
 */
@JsonPropertyOrder({
  ArchiveSearchRehydration.JSON_PROPERTY_MAX_REHYDRATED_EVENTS,
  ArchiveSearchRehydration.JSON_PROPERTY_RETENTION_DAYS,
  ArchiveSearchRehydration.JSON_PROPERTY_TIER
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ArchiveSearchRehydration {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MAX_REHYDRATED_EVENTS = "max_rehydrated_events";
  private Long maxRehydratedEvents;

  public static final String JSON_PROPERTY_RETENTION_DAYS = "retention_days";
  private Long retentionDays;

  public static final String JSON_PROPERTY_TIER = "tier";
  private ArchiveSearchRehydrationTier tier;

  public ArchiveSearchRehydration() {}

  @JsonCreator
  public ArchiveSearchRehydration(
      @JsonProperty(required = true, value = JSON_PROPERTY_MAX_REHYDRATED_EVENTS)
          Long maxRehydratedEvents,
      @JsonProperty(required = true, value = JSON_PROPERTY_RETENTION_DAYS) Long retentionDays,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIER)
          ArchiveSearchRehydrationTier tier) {
    this.maxRehydratedEvents = maxRehydratedEvents;
    this.retentionDays = retentionDays;
    this.tier = tier;
    this.unparsed |= !tier.isValid();
  }

  public ArchiveSearchRehydration maxRehydratedEvents(Long maxRehydratedEvents) {
    this.maxRehydratedEvents = maxRehydratedEvents;
    return this;
  }

  /**
   * Maximum number of events to rehydrate.
   *
   * @return maxRehydratedEvents
   */
  @JsonProperty(JSON_PROPERTY_MAX_REHYDRATED_EVENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getMaxRehydratedEvents() {
    return maxRehydratedEvents;
  }

  public void setMaxRehydratedEvents(Long maxRehydratedEvents) {
    this.maxRehydratedEvents = maxRehydratedEvents;
  }

  public ArchiveSearchRehydration retentionDays(Long retentionDays) {
    this.retentionDays = retentionDays;
    return this;
  }

  /**
   * Number of days the rehydrated logs are retained for.
   *
   * @return retentionDays
   */
  @JsonProperty(JSON_PROPERTY_RETENTION_DAYS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getRetentionDays() {
    return retentionDays;
  }

  public void setRetentionDays(Long retentionDays) {
    this.retentionDays = retentionDays;
  }

  public ArchiveSearchRehydration tier(ArchiveSearchRehydrationTier tier) {
    this.tier = tier;
    this.unparsed |= !tier.isValid();
    return this;
  }

  /**
   * Storage tier the matched logs are rehydrated into.
   *
   * @return tier
   */
  @JsonProperty(JSON_PROPERTY_TIER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ArchiveSearchRehydrationTier getTier() {
    return tier;
  }

  public void setTier(ArchiveSearchRehydrationTier tier) {
    if (!tier.isValid()) {
      this.unparsed = true;
    }
    this.tier = tier;
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
   * @return ArchiveSearchRehydration
   */
  @JsonAnySetter
  public ArchiveSearchRehydration putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ArchiveSearchRehydration object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArchiveSearchRehydration archiveSearchRehydration = (ArchiveSearchRehydration) o;
    return Objects.equals(this.maxRehydratedEvents, archiveSearchRehydration.maxRehydratedEvents)
        && Objects.equals(this.retentionDays, archiveSearchRehydration.retentionDays)
        && Objects.equals(this.tier, archiveSearchRehydration.tier)
        && Objects.equals(this.additionalProperties, archiveSearchRehydration.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxRehydratedEvents, retentionDays, tier, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArchiveSearchRehydration {\n");
    sb.append("    maxRehydratedEvents: ")
        .append(toIndentedString(maxRehydratedEvents))
        .append("\n");
    sb.append("    retentionDays: ").append(toIndentedString(retentionDays)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
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
