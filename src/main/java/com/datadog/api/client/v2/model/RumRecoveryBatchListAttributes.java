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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Batch recovery progress. Status updates can appear here before they appear in request details.
 */
@JsonPropertyOrder({
  RumRecoveryBatchListAttributes.JSON_PROPERTY_CREATED_AT,
  RumRecoveryBatchListAttributes.JSON_PROPERTY_DISCOVERY_STATUS,
  RumRecoveryBatchListAttributes.JSON_PROPERTY_ESTIMATED_COUNT,
  RumRecoveryBatchListAttributes.JSON_PROPERTY_FROM,
  RumRecoveryBatchListAttributes.JSON_PROPERTY_QUERY,
  RumRecoveryBatchListAttributes.JSON_PROPERTY_SESSIONS_DISCOVERED,
  RumRecoveryBatchListAttributes.JSON_PROPERTY_SESSIONS_FAILED,
  RumRecoveryBatchListAttributes.JSON_PROPERTY_SESSIONS_PROCESSED,
  RumRecoveryBatchListAttributes.JSON_PROPERTY_SLICES_COMPLETED,
  RumRecoveryBatchListAttributes.JSON_PROPERTY_SLICES_FAILED,
  RumRecoveryBatchListAttributes.JSON_PROPERTY_STATUS,
  RumRecoveryBatchListAttributes.JSON_PROPERTY_TO,
  RumRecoveryBatchListAttributes.JSON_PROPERTY_TOTAL_SLICES,
  RumRecoveryBatchListAttributes.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumRecoveryBatchListAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DISCOVERY_STATUS = "discovery_status";
  private RumRecoveryDiscoveryStatus discoveryStatus;

  public static final String JSON_PROPERTY_ESTIMATED_COUNT = "estimated_count";
  private Long estimatedCount;

  public static final String JSON_PROPERTY_FROM = "from";
  private Long from;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_SESSIONS_DISCOVERED = "sessions_discovered";
  private Long sessionsDiscovered;

  public static final String JSON_PROPERTY_SESSIONS_FAILED = "sessions_failed";
  private Long sessionsFailed;

  public static final String JSON_PROPERTY_SESSIONS_PROCESSED = "sessions_processed";
  private Long sessionsProcessed;

  public static final String JSON_PROPERTY_SLICES_COMPLETED = "slices_completed";
  private Long slicesCompleted;

  public static final String JSON_PROPERTY_SLICES_FAILED = "slices_failed";
  private Long slicesFailed;

  public static final String JSON_PROPERTY_STATUS = "status";
  private RumRecoveryRequestStatus status;

  public static final String JSON_PROPERTY_TO = "to";
  private Long to;

  public static final String JSON_PROPERTY_TOTAL_SLICES = "total_slices";
  private Long totalSlices;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public RumRecoveryBatchListAttributes() {}

  @JsonCreator
  public RumRecoveryBatchListAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_DISCOVERY_STATUS)
          RumRecoveryDiscoveryStatus discoveryStatus,
      @JsonProperty(required = true, value = JSON_PROPERTY_FROM) Long from,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) String query,
      @JsonProperty(required = true, value = JSON_PROPERTY_SESSIONS_DISCOVERED)
          Long sessionsDiscovered,
      @JsonProperty(required = true, value = JSON_PROPERTY_SESSIONS_FAILED) Long sessionsFailed,
      @JsonProperty(required = true, value = JSON_PROPERTY_SESSIONS_PROCESSED)
          Long sessionsProcessed,
      @JsonProperty(required = true, value = JSON_PROPERTY_SLICES_COMPLETED) Long slicesCompleted,
      @JsonProperty(required = true, value = JSON_PROPERTY_SLICES_FAILED) Long slicesFailed,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS) RumRecoveryRequestStatus status,
      @JsonProperty(required = true, value = JSON_PROPERTY_TO) Long to,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOTAL_SLICES) Long totalSlices,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_AT) OffsetDateTime updatedAt) {
    this.createdAt = createdAt;
    this.discoveryStatus = discoveryStatus;
    this.unparsed |= !discoveryStatus.isValid();
    this.from = from;
    this.query = query;
    this.sessionsDiscovered = sessionsDiscovered;
    this.sessionsFailed = sessionsFailed;
    this.sessionsProcessed = sessionsProcessed;
    this.slicesCompleted = slicesCompleted;
    this.slicesFailed = slicesFailed;
    this.status = status;
    this.unparsed |= !status.isValid();
    this.to = to;
    this.totalSlices = totalSlices;
    this.updatedAt = updatedAt;
  }

  public RumRecoveryBatchListAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Creation time.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public RumRecoveryBatchListAttributes discoveryStatus(
      RumRecoveryDiscoveryStatus discoveryStatus) {
    this.discoveryStatus = discoveryStatus;
    this.unparsed |= !discoveryStatus.isValid();
    return this;
  }

  /**
   * Batch discovery state. QUEUED indicates that the request is waiting for processing capacity.
   *
   * @return discoveryStatus
   */
  @JsonProperty(JSON_PROPERTY_DISCOVERY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RumRecoveryDiscoveryStatus getDiscoveryStatus() {
    return discoveryStatus;
  }

  public void setDiscoveryStatus(RumRecoveryDiscoveryStatus discoveryStatus) {
    if (!discoveryStatus.isValid()) {
      this.unparsed = true;
    }
    this.discoveryStatus = discoveryStatus;
  }

  public RumRecoveryBatchListAttributes estimatedCount(Long estimatedCount) {
    this.estimatedCount = estimatedCount;
    return this;
  }

  /**
   * Batch estimate stored at creation, when present. New batches use a fresh server estimate; older
   * batches may contain a client-supplied estimate. minimum: 0
   *
   * @return estimatedCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ESTIMATED_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEstimatedCount() {
    return estimatedCount;
  }

  public void setEstimatedCount(Long estimatedCount) {
    this.estimatedCount = estimatedCount;
  }

  public RumRecoveryBatchListAttributes from(Long from) {
    this.from = from;
    return this;
  }

  /**
   * Start of the range in Unix milliseconds. Must be positive and earlier than to. minimum: 1
   *
   * @return from
   */
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getFrom() {
    return from;
  }

  public void setFrom(Long from) {
    this.from = from;
  }

  public RumRecoveryBatchListAttributes query(String query) {
    this.query = query;
    return this;
  }

  /**
   * RUM search query. Not blank, at most 4096 bytes for batch creation and count.
   *
   * @return query
   */
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public RumRecoveryBatchListAttributes sessionsDiscovered(Long sessionsDiscovered) {
    this.sessionsDiscovered = sessionsDiscovered;
    return this;
  }

  /**
   * Discovered sessions. minimum: 0
   *
   * @return sessionsDiscovered
   */
  @JsonProperty(JSON_PROPERTY_SESSIONS_DISCOVERED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getSessionsDiscovered() {
    return sessionsDiscovered;
  }

  public void setSessionsDiscovered(Long sessionsDiscovered) {
    this.sessionsDiscovered = sessionsDiscovered;
  }

  public RumRecoveryBatchListAttributes sessionsFailed(Long sessionsFailed) {
    this.sessionsFailed = sessionsFailed;
    return this;
  }

  /**
   * Failed sessions. minimum: 0
   *
   * @return sessionsFailed
   */
  @JsonProperty(JSON_PROPERTY_SESSIONS_FAILED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getSessionsFailed() {
    return sessionsFailed;
  }

  public void setSessionsFailed(Long sessionsFailed) {
    this.sessionsFailed = sessionsFailed;
  }

  public RumRecoveryBatchListAttributes sessionsProcessed(Long sessionsProcessed) {
    this.sessionsProcessed = sessionsProcessed;
    return this;
  }

  /**
   * Processed sessions. minimum: 0
   *
   * @return sessionsProcessed
   */
  @JsonProperty(JSON_PROPERTY_SESSIONS_PROCESSED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getSessionsProcessed() {
    return sessionsProcessed;
  }

  public void setSessionsProcessed(Long sessionsProcessed) {
    this.sessionsProcessed = sessionsProcessed;
  }

  public RumRecoveryBatchListAttributes slicesCompleted(Long slicesCompleted) {
    this.slicesCompleted = slicesCompleted;
    return this;
  }

  /**
   * Completed slices. minimum: 0
   *
   * @return slicesCompleted
   */
  @JsonProperty(JSON_PROPERTY_SLICES_COMPLETED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getSlicesCompleted() {
    return slicesCompleted;
  }

  public void setSlicesCompleted(Long slicesCompleted) {
    this.slicesCompleted = slicesCompleted;
  }

  public RumRecoveryBatchListAttributes slicesFailed(Long slicesFailed) {
    this.slicesFailed = slicesFailed;
    return this;
  }

  /**
   * Failed slices. minimum: 0
   *
   * @return slicesFailed
   */
  @JsonProperty(JSON_PROPERTY_SLICES_FAILED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getSlicesFailed() {
    return slicesFailed;
  }

  public void setSlicesFailed(Long slicesFailed) {
    this.slicesFailed = slicesFailed;
  }

  public RumRecoveryBatchListAttributes status(RumRecoveryRequestStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * Recovery request state.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RumRecoveryRequestStatus getStatus() {
    return status;
  }

  public void setStatus(RumRecoveryRequestStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public RumRecoveryBatchListAttributes to(Long to) {
    this.to = to;
    return this;
  }

  /**
   * End of the range in Unix milliseconds. minimum: 1
   *
   * @return to
   */
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTo() {
    return to;
  }

  public void setTo(Long to) {
    this.to = to;
  }

  public RumRecoveryBatchListAttributes totalSlices(Long totalSlices) {
    this.totalSlices = totalSlices;
    return this;
  }

  /**
   * Total discovery slices. minimum: 0
   *
   * @return totalSlices
   */
  @JsonProperty(JSON_PROPERTY_TOTAL_SLICES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTotalSlices() {
    return totalSlices;
  }

  public void setTotalSlices(Long totalSlices) {
    this.totalSlices = totalSlices;
  }

  public RumRecoveryBatchListAttributes updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Last update time.
   *
   * @return updatedAt
   */
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
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
   * @return RumRecoveryBatchListAttributes
   */
  @JsonAnySetter
  public RumRecoveryBatchListAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RumRecoveryBatchListAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RumRecoveryBatchListAttributes rumRecoveryBatchListAttributes =
        (RumRecoveryBatchListAttributes) o;
    return Objects.equals(this.createdAt, rumRecoveryBatchListAttributes.createdAt)
        && Objects.equals(this.discoveryStatus, rumRecoveryBatchListAttributes.discoveryStatus)
        && Objects.equals(this.estimatedCount, rumRecoveryBatchListAttributes.estimatedCount)
        && Objects.equals(this.from, rumRecoveryBatchListAttributes.from)
        && Objects.equals(this.query, rumRecoveryBatchListAttributes.query)
        && Objects.equals(
            this.sessionsDiscovered, rumRecoveryBatchListAttributes.sessionsDiscovered)
        && Objects.equals(this.sessionsFailed, rumRecoveryBatchListAttributes.sessionsFailed)
        && Objects.equals(this.sessionsProcessed, rumRecoveryBatchListAttributes.sessionsProcessed)
        && Objects.equals(this.slicesCompleted, rumRecoveryBatchListAttributes.slicesCompleted)
        && Objects.equals(this.slicesFailed, rumRecoveryBatchListAttributes.slicesFailed)
        && Objects.equals(this.status, rumRecoveryBatchListAttributes.status)
        && Objects.equals(this.to, rumRecoveryBatchListAttributes.to)
        && Objects.equals(this.totalSlices, rumRecoveryBatchListAttributes.totalSlices)
        && Objects.equals(this.updatedAt, rumRecoveryBatchListAttributes.updatedAt)
        && Objects.equals(
            this.additionalProperties, rumRecoveryBatchListAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        discoveryStatus,
        estimatedCount,
        from,
        query,
        sessionsDiscovered,
        sessionsFailed,
        sessionsProcessed,
        slicesCompleted,
        slicesFailed,
        status,
        to,
        totalSlices,
        updatedAt,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RumRecoveryBatchListAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    discoveryStatus: ").append(toIndentedString(discoveryStatus)).append("\n");
    sb.append("    estimatedCount: ").append(toIndentedString(estimatedCount)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    sessionsDiscovered: ").append(toIndentedString(sessionsDiscovered)).append("\n");
    sb.append("    sessionsFailed: ").append(toIndentedString(sessionsFailed)).append("\n");
    sb.append("    sessionsProcessed: ").append(toIndentedString(sessionsProcessed)).append("\n");
    sb.append("    slicesCompleted: ").append(toIndentedString(slicesCompleted)).append("\n");
    sb.append("    slicesFailed: ").append(toIndentedString(slicesFailed)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    totalSlices: ").append(toIndentedString(totalSlices)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
