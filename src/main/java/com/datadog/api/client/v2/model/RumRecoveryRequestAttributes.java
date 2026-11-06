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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Recovery progress. Batch-only attributes are omitted for targeted requests; request_type is also
 * omitted for targeted requests.
 */
@JsonPropertyOrder({
  RumRecoveryRequestAttributes.JSON_PROPERTY_CREATED_AT,
  RumRecoveryRequestAttributes.JSON_PROPERTY_DISCOVERY_STATUS,
  RumRecoveryRequestAttributes.JSON_PROPERTY_ERROR_MESSAGE,
  RumRecoveryRequestAttributes.JSON_PROPERTY_ESTIMATED_COUNT,
  RumRecoveryRequestAttributes.JSON_PROPERTY_FAILED_SESSIONS,
  RumRecoveryRequestAttributes.JSON_PROPERTY_FROM,
  RumRecoveryRequestAttributes.JSON_PROPERTY_PROCESSED_SESSIONS,
  RumRecoveryRequestAttributes.JSON_PROPERTY_QUERY,
  RumRecoveryRequestAttributes.JSON_PROPERTY_REQUEST_TYPE,
  RumRecoveryRequestAttributes.JSON_PROPERTY_SESSIONS,
  RumRecoveryRequestAttributes.JSON_PROPERTY_SESSIONS_DISCOVERED,
  RumRecoveryRequestAttributes.JSON_PROPERTY_SESSIONS_FAILED,
  RumRecoveryRequestAttributes.JSON_PROPERTY_SESSIONS_PROCESSED,
  RumRecoveryRequestAttributes.JSON_PROPERTY_SLICES_COMPLETED,
  RumRecoveryRequestAttributes.JSON_PROPERTY_SLICES_FAILED,
  RumRecoveryRequestAttributes.JSON_PROPERTY_STATUS,
  RumRecoveryRequestAttributes.JSON_PROPERTY_TO,
  RumRecoveryRequestAttributes.JSON_PROPERTY_TOTAL_SESSIONS,
  RumRecoveryRequestAttributes.JSON_PROPERTY_TOTAL_SLICES,
  RumRecoveryRequestAttributes.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumRecoveryRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DISCOVERY_STATUS = "discovery_status";
  private RumRecoveryDiscoveryStatus discoveryStatus;

  public static final String JSON_PROPERTY_ERROR_MESSAGE = "error_message";
  private String errorMessage;

  public static final String JSON_PROPERTY_ESTIMATED_COUNT = "estimated_count";
  private Long estimatedCount;

  public static final String JSON_PROPERTY_FAILED_SESSIONS = "failed_sessions";
  private Long failedSessions;

  public static final String JSON_PROPERTY_FROM = "from";
  private Long from;

  public static final String JSON_PROPERTY_PROCESSED_SESSIONS = "processed_sessions";
  private Long processedSessions;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_REQUEST_TYPE = "request_type";
  private RumRecoveryBatchRequestType requestType;

  public static final String JSON_PROPERTY_SESSIONS = "sessions";
  private List<RumRecoveredSession> sessions = null;

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

  public static final String JSON_PROPERTY_TOTAL_SESSIONS = "total_sessions";
  private Long totalSessions;

  public static final String JSON_PROPERTY_TOTAL_SLICES = "total_slices";
  private Long totalSlices;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public RumRecoveryRequestAttributes() {}

  @JsonCreator
  public RumRecoveryRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_FAILED_SESSIONS) Long failedSessions,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROCESSED_SESSIONS)
          Long processedSessions,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS) RumRecoveryRequestStatus status,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_AT) OffsetDateTime updatedAt) {
    this.createdAt = createdAt;
    this.failedSessions = failedSessions;
    this.processedSessions = processedSessions;
    this.status = status;
    this.unparsed |= !status.isValid();
    this.updatedAt = updatedAt;
  }

  public RumRecoveryRequestAttributes createdAt(OffsetDateTime createdAt) {
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

  public RumRecoveryRequestAttributes discoveryStatus(RumRecoveryDiscoveryStatus discoveryStatus) {
    this.discoveryStatus = discoveryStatus;
    this.unparsed |= !discoveryStatus.isValid();
    return this;
  }

  /**
   * Batch discovery state. QUEUED indicates that the request is waiting for processing capacity.
   *
   * @return discoveryStatus
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISCOVERY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RumRecoveryDiscoveryStatus getDiscoveryStatus() {
    return discoveryStatus;
  }

  public void setDiscoveryStatus(RumRecoveryDiscoveryStatus discoveryStatus) {
    if (!discoveryStatus.isValid()) {
      this.unparsed = true;
    }
    this.discoveryStatus = discoveryStatus;
  }

  public RumRecoveryRequestAttributes errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Failure details, if present.
   *
   * @return errorMessage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public RumRecoveryRequestAttributes estimatedCount(Long estimatedCount) {
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

  public RumRecoveryRequestAttributes failedSessions(Long failedSessions) {
    this.failedSessions = failedSessions;
    return this;
  }

  /**
   * Failed session count. minimum: 0
   *
   * @return failedSessions
   */
  @JsonProperty(JSON_PROPERTY_FAILED_SESSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getFailedSessions() {
    return failedSessions;
  }

  public void setFailedSessions(Long failedSessions) {
    this.failedSessions = failedSessions;
  }

  public RumRecoveryRequestAttributes from(Long from) {
    this.from = from;
    return this;
  }

  /**
   * Start of the range in Unix milliseconds. Must be positive and earlier than to. minimum: 1
   *
   * @return from
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFrom() {
    return from;
  }

  public void setFrom(Long from) {
    this.from = from;
  }

  public RumRecoveryRequestAttributes processedSessions(Long processedSessions) {
    this.processedSessions = processedSessions;
    return this;
  }

  /**
   * Processed session count. minimum: 0
   *
   * @return processedSessions
   */
  @JsonProperty(JSON_PROPERTY_PROCESSED_SESSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getProcessedSessions() {
    return processedSessions;
  }

  public void setProcessedSessions(Long processedSessions) {
    this.processedSessions = processedSessions;
  }

  public RumRecoveryRequestAttributes query(String query) {
    this.query = query;
    return this;
  }

  /**
   * RUM search query. Not blank, at most 4096 bytes for batch creation and count.
   *
   * @return query
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public RumRecoveryRequestAttributes requestType(RumRecoveryBatchRequestType requestType) {
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
    return this;
  }

  /**
   * Query-based batch recovery.
   *
   * @return requestType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RumRecoveryBatchRequestType getRequestType() {
    return requestType;
  }

  public void setRequestType(RumRecoveryBatchRequestType requestType) {
    if (!requestType.isValid()) {
      this.unparsed = true;
    }
    this.requestType = requestType;
  }

  public RumRecoveryRequestAttributes sessions(List<RumRecoveredSession> sessions) {
    this.sessions = sessions;
    if (sessions != null) {
      for (RumRecoveredSession item : sessions) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public RumRecoveryRequestAttributes addSessionsItem(RumRecoveredSession sessionsItem) {
    if (this.sessions == null) {
      this.sessions = new ArrayList<>();
    }
    this.sessions.add(sessionsItem);
    this.unparsed |= sessionsItem.unparsed;
    return this;
  }

  /**
   * Targeted session progress. Omitted when empty or not applicable.
   *
   * @return sessions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SESSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<RumRecoveredSession> getSessions() {
    return sessions;
  }

  public void setSessions(List<RumRecoveredSession> sessions) {
    this.sessions = sessions;
    if (sessions != null) {
      for (RumRecoveredSession item : sessions) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public RumRecoveryRequestAttributes sessionsDiscovered(Long sessionsDiscovered) {
    this.sessionsDiscovered = sessionsDiscovered;
    return this;
  }

  /**
   * Discovered sessions. minimum: 0
   *
   * @return sessionsDiscovered
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SESSIONS_DISCOVERED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSessionsDiscovered() {
    return sessionsDiscovered;
  }

  public void setSessionsDiscovered(Long sessionsDiscovered) {
    this.sessionsDiscovered = sessionsDiscovered;
  }

  public RumRecoveryRequestAttributes sessionsFailed(Long sessionsFailed) {
    this.sessionsFailed = sessionsFailed;
    return this;
  }

  /**
   * Failed sessions. minimum: 0
   *
   * @return sessionsFailed
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SESSIONS_FAILED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSessionsFailed() {
    return sessionsFailed;
  }

  public void setSessionsFailed(Long sessionsFailed) {
    this.sessionsFailed = sessionsFailed;
  }

  public RumRecoveryRequestAttributes sessionsProcessed(Long sessionsProcessed) {
    this.sessionsProcessed = sessionsProcessed;
    return this;
  }

  /**
   * Processed sessions. minimum: 0
   *
   * @return sessionsProcessed
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SESSIONS_PROCESSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSessionsProcessed() {
    return sessionsProcessed;
  }

  public void setSessionsProcessed(Long sessionsProcessed) {
    this.sessionsProcessed = sessionsProcessed;
  }

  public RumRecoveryRequestAttributes slicesCompleted(Long slicesCompleted) {
    this.slicesCompleted = slicesCompleted;
    return this;
  }

  /**
   * Completed slices. minimum: 0
   *
   * @return slicesCompleted
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SLICES_COMPLETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSlicesCompleted() {
    return slicesCompleted;
  }

  public void setSlicesCompleted(Long slicesCompleted) {
    this.slicesCompleted = slicesCompleted;
  }

  public RumRecoveryRequestAttributes slicesFailed(Long slicesFailed) {
    this.slicesFailed = slicesFailed;
    return this;
  }

  /**
   * Failed slices. minimum: 0
   *
   * @return slicesFailed
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SLICES_FAILED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSlicesFailed() {
    return slicesFailed;
  }

  public void setSlicesFailed(Long slicesFailed) {
    this.slicesFailed = slicesFailed;
  }

  public RumRecoveryRequestAttributes status(RumRecoveryRequestStatus status) {
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

  public RumRecoveryRequestAttributes to(Long to) {
    this.to = to;
    return this;
  }

  /**
   * End of the range in Unix milliseconds. minimum: 1
   *
   * @return to
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTo() {
    return to;
  }

  public void setTo(Long to) {
    this.to = to;
  }

  public RumRecoveryRequestAttributes totalSessions(Long totalSessions) {
    this.totalSessions = totalSessions;
    return this;
  }

  /**
   * Total targeted sessions. Omitted while a batch total is unknown. minimum: 0
   *
   * @return totalSessions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_SESSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotalSessions() {
    return totalSessions;
  }

  public void setTotalSessions(Long totalSessions) {
    this.totalSessions = totalSessions;
  }

  public RumRecoveryRequestAttributes totalSlices(Long totalSlices) {
    this.totalSlices = totalSlices;
    return this;
  }

  /**
   * Total discovery slices. minimum: 0
   *
   * @return totalSlices
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_SLICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotalSlices() {
    return totalSlices;
  }

  public void setTotalSlices(Long totalSlices) {
    this.totalSlices = totalSlices;
  }

  public RumRecoveryRequestAttributes updatedAt(OffsetDateTime updatedAt) {
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
   * @return RumRecoveryRequestAttributes
   */
  @JsonAnySetter
  public RumRecoveryRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RumRecoveryRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RumRecoveryRequestAttributes rumRecoveryRequestAttributes = (RumRecoveryRequestAttributes) o;
    return Objects.equals(this.createdAt, rumRecoveryRequestAttributes.createdAt)
        && Objects.equals(this.discoveryStatus, rumRecoveryRequestAttributes.discoveryStatus)
        && Objects.equals(this.errorMessage, rumRecoveryRequestAttributes.errorMessage)
        && Objects.equals(this.estimatedCount, rumRecoveryRequestAttributes.estimatedCount)
        && Objects.equals(this.failedSessions, rumRecoveryRequestAttributes.failedSessions)
        && Objects.equals(this.from, rumRecoveryRequestAttributes.from)
        && Objects.equals(this.processedSessions, rumRecoveryRequestAttributes.processedSessions)
        && Objects.equals(this.query, rumRecoveryRequestAttributes.query)
        && Objects.equals(this.requestType, rumRecoveryRequestAttributes.requestType)
        && Objects.equals(this.sessions, rumRecoveryRequestAttributes.sessions)
        && Objects.equals(this.sessionsDiscovered, rumRecoveryRequestAttributes.sessionsDiscovered)
        && Objects.equals(this.sessionsFailed, rumRecoveryRequestAttributes.sessionsFailed)
        && Objects.equals(this.sessionsProcessed, rumRecoveryRequestAttributes.sessionsProcessed)
        && Objects.equals(this.slicesCompleted, rumRecoveryRequestAttributes.slicesCompleted)
        && Objects.equals(this.slicesFailed, rumRecoveryRequestAttributes.slicesFailed)
        && Objects.equals(this.status, rumRecoveryRequestAttributes.status)
        && Objects.equals(this.to, rumRecoveryRequestAttributes.to)
        && Objects.equals(this.totalSessions, rumRecoveryRequestAttributes.totalSessions)
        && Objects.equals(this.totalSlices, rumRecoveryRequestAttributes.totalSlices)
        && Objects.equals(this.updatedAt, rumRecoveryRequestAttributes.updatedAt)
        && Objects.equals(
            this.additionalProperties, rumRecoveryRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        discoveryStatus,
        errorMessage,
        estimatedCount,
        failedSessions,
        from,
        processedSessions,
        query,
        requestType,
        sessions,
        sessionsDiscovered,
        sessionsFailed,
        sessionsProcessed,
        slicesCompleted,
        slicesFailed,
        status,
        to,
        totalSessions,
        totalSlices,
        updatedAt,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RumRecoveryRequestAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    discoveryStatus: ").append(toIndentedString(discoveryStatus)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    estimatedCount: ").append(toIndentedString(estimatedCount)).append("\n");
    sb.append("    failedSessions: ").append(toIndentedString(failedSessions)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    processedSessions: ").append(toIndentedString(processedSessions)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
    sb.append("    sessionsDiscovered: ").append(toIndentedString(sessionsDiscovered)).append("\n");
    sb.append("    sessionsFailed: ").append(toIndentedString(sessionsFailed)).append("\n");
    sb.append("    sessionsProcessed: ").append(toIndentedString(sessionsProcessed)).append("\n");
    sb.append("    slicesCompleted: ").append(toIndentedString(slicesCompleted)).append("\n");
    sb.append("    slicesFailed: ").append(toIndentedString(slicesFailed)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    totalSessions: ").append(toIndentedString(totalSessions)).append("\n");
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
