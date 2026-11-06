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

/** Accepted recovery request. */
@JsonPropertyOrder({
  RumRecoveryCreateResponseAttributes.JSON_PROPERTY_CREATED_AT,
  RumRecoveryCreateResponseAttributes.JSON_PROPERTY_DISCOVERY_STATUS,
  RumRecoveryCreateResponseAttributes.JSON_PROPERTY_ESTIMATED_COUNT,
  RumRecoveryCreateResponseAttributes.JSON_PROPERTY_FAILED_SESSIONS,
  RumRecoveryCreateResponseAttributes.JSON_PROPERTY_PROCESSED_SESSIONS,
  RumRecoveryCreateResponseAttributes.JSON_PROPERTY_STATUS,
  RumRecoveryCreateResponseAttributes.JSON_PROPERTY_TOTAL_SESSIONS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumRecoveryCreateResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DISCOVERY_STATUS = "discovery_status";
  private RumRecoveryDiscoveryStatus discoveryStatus;

  public static final String JSON_PROPERTY_ESTIMATED_COUNT = "estimated_count";
  private Long estimatedCount;

  public static final String JSON_PROPERTY_FAILED_SESSIONS = "failed_sessions";
  private Long failedSessions;

  public static final String JSON_PROPERTY_PROCESSED_SESSIONS = "processed_sessions";
  private Long processedSessions;

  public static final String JSON_PROPERTY_STATUS = "status";
  private RumRecoveryRequestStatus status;

  public static final String JSON_PROPERTY_TOTAL_SESSIONS = "total_sessions";
  private Long totalSessions;

  public RumRecoveryCreateResponseAttributes() {}

  @JsonCreator
  public RumRecoveryCreateResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_FAILED_SESSIONS) Long failedSessions,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROCESSED_SESSIONS)
          Long processedSessions,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS)
          RumRecoveryRequestStatus status) {
    this.createdAt = createdAt;
    this.failedSessions = failedSessions;
    this.processedSessions = processedSessions;
    this.status = status;
    this.unparsed |= !status.isValid();
  }

  public RumRecoveryCreateResponseAttributes createdAt(OffsetDateTime createdAt) {
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

  public RumRecoveryCreateResponseAttributes discoveryStatus(
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

  public RumRecoveryCreateResponseAttributes estimatedCount(Long estimatedCount) {
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

  public RumRecoveryCreateResponseAttributes failedSessions(Long failedSessions) {
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

  public RumRecoveryCreateResponseAttributes processedSessions(Long processedSessions) {
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

  public RumRecoveryCreateResponseAttributes status(RumRecoveryRequestStatus status) {
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

  public RumRecoveryCreateResponseAttributes totalSessions(Long totalSessions) {
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
   * @return RumRecoveryCreateResponseAttributes
   */
  @JsonAnySetter
  public RumRecoveryCreateResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RumRecoveryCreateResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RumRecoveryCreateResponseAttributes rumRecoveryCreateResponseAttributes =
        (RumRecoveryCreateResponseAttributes) o;
    return Objects.equals(this.createdAt, rumRecoveryCreateResponseAttributes.createdAt)
        && Objects.equals(this.discoveryStatus, rumRecoveryCreateResponseAttributes.discoveryStatus)
        && Objects.equals(this.estimatedCount, rumRecoveryCreateResponseAttributes.estimatedCount)
        && Objects.equals(this.failedSessions, rumRecoveryCreateResponseAttributes.failedSessions)
        && Objects.equals(
            this.processedSessions, rumRecoveryCreateResponseAttributes.processedSessions)
        && Objects.equals(this.status, rumRecoveryCreateResponseAttributes.status)
        && Objects.equals(this.totalSessions, rumRecoveryCreateResponseAttributes.totalSessions)
        && Objects.equals(
            this.additionalProperties, rumRecoveryCreateResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        discoveryStatus,
        estimatedCount,
        failedSessions,
        processedSessions,
        status,
        totalSessions,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RumRecoveryCreateResponseAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    discoveryStatus: ").append(toIndentedString(discoveryStatus)).append("\n");
    sb.append("    estimatedCount: ").append(toIndentedString(estimatedCount)).append("\n");
    sb.append("    failedSessions: ").append(toIndentedString(failedSessions)).append("\n");
    sb.append("    processedSessions: ").append(toIndentedString(processedSessions)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    totalSessions: ").append(toIndentedString(totalSessions)).append("\n");
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
