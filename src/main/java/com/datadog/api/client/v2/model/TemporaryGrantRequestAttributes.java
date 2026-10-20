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
import java.util.UUID;

/**
 * Request history and the linked grant state. List and detail reads include grant_state for
 * approved requests. Decision responses record the decision; read the request for current grant
 * state.
 */
@JsonPropertyOrder({
  TemporaryGrantRequestAttributes.JSON_PROPERTY_CREATED_AT,
  TemporaryGrantRequestAttributes.JSON_PROPERTY_DECIDED_AT,
  TemporaryGrantRequestAttributes.JSON_PROPERTY_DECIDED_BY_USER_ID,
  TemporaryGrantRequestAttributes.JSON_PROPERTY_ENTITY_KEY,
  TemporaryGrantRequestAttributes.JSON_PROPERTY_EXPIRES_AT,
  TemporaryGrantRequestAttributes.JSON_PROPERTY_GRANT_STATE,
  TemporaryGrantRequestAttributes.JSON_PROPERTY_JUSTIFICATION,
  TemporaryGrantRequestAttributes.JSON_PROPERTY_QUOTA_NAMESPACE,
  TemporaryGrantRequestAttributes.JSON_PROPERTY_REQUESTED_BY_USER_ID,
  TemporaryGrantRequestAttributes.JSON_PROPERTY_STATUS,
  TemporaryGrantRequestAttributes.JSON_PROPERTY_TOTAL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TemporaryGrantRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DECIDED_AT = "decided_at";
  private OffsetDateTime decidedAt;

  public static final String JSON_PROPERTY_DECIDED_BY_USER_ID = "decided_by_user_id";
  private UUID decidedByUserId;

  public static final String JSON_PROPERTY_ENTITY_KEY = "entity_key";
  private String entityKey;

  public static final String JSON_PROPERTY_EXPIRES_AT = "expires_at";
  private OffsetDateTime expiresAt;

  public static final String JSON_PROPERTY_GRANT_STATE = "grant_state";
  private TemporaryGrantRequestGrantState grantState;

  public static final String JSON_PROPERTY_JUSTIFICATION = "justification";
  private String justification;

  public static final String JSON_PROPERTY_QUOTA_NAMESPACE = "quota_namespace";
  private String quotaNamespace;

  public static final String JSON_PROPERTY_REQUESTED_BY_USER_ID = "requested_by_user_id";
  private UUID requestedByUserId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private TemporaryGrantRequestStatus status;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Long total;

  public TemporaryGrantRequestAttributes() {}

  @JsonCreator
  public TemporaryGrantRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENTITY_KEY) String entityKey,
      @JsonProperty(required = true, value = JSON_PROPERTY_EXPIRES_AT) OffsetDateTime expiresAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_JUSTIFICATION) String justification,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUOTA_NAMESPACE) String quotaNamespace,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUESTED_BY_USER_ID)
          UUID requestedByUserId,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS)
          TemporaryGrantRequestStatus status,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOTAL) Long total) {
    this.createdAt = createdAt;
    this.entityKey = entityKey;
    this.expiresAt = expiresAt;
    this.justification = justification;
    this.quotaNamespace = quotaNamespace;
    this.requestedByUserId = requestedByUserId;
    this.status = status;
    this.unparsed |= !status.isValid();
    this.total = total;
  }

  public TemporaryGrantRequestAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * When the request was submitted.
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

  public TemporaryGrantRequestAttributes decidedAt(OffsetDateTime decidedAt) {
    this.decidedAt = decidedAt;
    return this;
  }

  /**
   * When the decision or cancellation was recorded.
   *
   * @return decidedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DECIDED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getDecidedAt() {
    return decidedAt;
  }

  public void setDecidedAt(OffsetDateTime decidedAt) {
    this.decidedAt = decidedAt;
  }

  public TemporaryGrantRequestAttributes decidedByUserId(UUID decidedByUserId) {
    this.decidedByUserId = decidedByUserId;
    return this;
  }

  /**
   * UUID of the reviewer, or requester when canceled.
   *
   * @return decidedByUserId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DECIDED_BY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getDecidedByUserId() {
    return decidedByUserId;
  }

  public void setDecidedByUserId(UUID decidedByUserId) {
    this.decidedByUserId = decidedByUserId;
  }

  public TemporaryGrantRequestAttributes entityKey(String entityKey) {
    this.entityKey = entityKey;
    return this;
  }

  /**
   * The requester identity resolved by the server.
   *
   * @return entityKey
   */
  @JsonProperty(JSON_PROPERTY_ENTITY_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getEntityKey() {
    return entityKey;
  }

  public void setEntityKey(String entityKey) {
    this.entityKey = entityKey;
  }

  public TemporaryGrantRequestAttributes expiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * Immutable exclusive expiry, normalized to UTC microsecond precision.
   *
   * @return expiresAt
   */
  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }

  public TemporaryGrantRequestAttributes grantState(TemporaryGrantRequestGrantState grantState) {
    this.grantState = grantState;
    this.unparsed |= !grantState.isValid();
    return this;
  }

  /**
   * Current state of the grant associated with an approved request. Replaced means a successor
   * superseded this grant; the successor need not still be active. Absent for requests that were
   * not approved.
   *
   * @return grantState
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GRANT_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TemporaryGrantRequestGrantState getGrantState() {
    return grantState;
  }

  public void setGrantState(TemporaryGrantRequestGrantState grantState) {
    if (!grantState.isValid()) {
      this.unparsed = true;
    }
    this.grantState = grantState;
  }

  public TemporaryGrantRequestAttributes justification(String justification) {
    this.justification = justification;
    return this;
  }

  /**
   * Reason for requesting temporary credits. Trimmed and limited to 4096 UTF-8 bytes.
   *
   * @return justification
   */
  @JsonProperty(JSON_PROPERTY_JUSTIFICATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getJustification() {
    return justification;
  }

  public void setJustification(String justification) {
    this.justification = justification;
  }

  public TemporaryGrantRequestAttributes quotaNamespace(String quotaNamespace) {
    this.quotaNamespace = quotaNamespace;
    return this;
  }

  /**
   * The quota namespace. Only AI credits are supported.
   *
   * @return quotaNamespace
   */
  @JsonProperty(JSON_PROPERTY_QUOTA_NAMESPACE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQuotaNamespace() {
    return quotaNamespace;
  }

  public void setQuotaNamespace(String quotaNamespace) {
    this.quotaNamespace = quotaNamespace;
  }

  public TemporaryGrantRequestAttributes requestedByUserId(UUID requestedByUserId) {
    this.requestedByUserId = requestedByUserId;
    return this;
  }

  /**
   * UUID of the authenticated requester.
   *
   * @return requestedByUserId
   */
  @JsonProperty(JSON_PROPERTY_REQUESTED_BY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getRequestedByUserId() {
    return requestedByUserId;
  }

  public void setRequestedByUserId(UUID requestedByUserId) {
    this.requestedByUserId = requestedByUserId;
  }

  public TemporaryGrantRequestAttributes status(TemporaryGrantRequestStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * The durable request decision, independent of whether its grant is still active.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TemporaryGrantRequestStatus getStatus() {
    return status;
  }

  public void setStatus(TemporaryGrantRequestStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public TemporaryGrantRequestAttributes total(Long total) {
    this.total = total;
    return this;
  }

  /**
   * Target monthly AI-credit limit in positive whole credits, not additional credits. Fractional
   * credits are not accepted. minimum: 1 maximum: 9223372036854
   *
   * @return total
   */
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
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
   * @return TemporaryGrantRequestAttributes
   */
  @JsonAnySetter
  public TemporaryGrantRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TemporaryGrantRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemporaryGrantRequestAttributes temporaryGrantRequestAttributes =
        (TemporaryGrantRequestAttributes) o;
    return Objects.equals(this.createdAt, temporaryGrantRequestAttributes.createdAt)
        && Objects.equals(this.decidedAt, temporaryGrantRequestAttributes.decidedAt)
        && Objects.equals(this.decidedByUserId, temporaryGrantRequestAttributes.decidedByUserId)
        && Objects.equals(this.entityKey, temporaryGrantRequestAttributes.entityKey)
        && Objects.equals(this.expiresAt, temporaryGrantRequestAttributes.expiresAt)
        && Objects.equals(this.grantState, temporaryGrantRequestAttributes.grantState)
        && Objects.equals(this.justification, temporaryGrantRequestAttributes.justification)
        && Objects.equals(this.quotaNamespace, temporaryGrantRequestAttributes.quotaNamespace)
        && Objects.equals(this.requestedByUserId, temporaryGrantRequestAttributes.requestedByUserId)
        && Objects.equals(this.status, temporaryGrantRequestAttributes.status)
        && Objects.equals(this.total, temporaryGrantRequestAttributes.total)
        && Objects.equals(
            this.additionalProperties, temporaryGrantRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        decidedAt,
        decidedByUserId,
        entityKey,
        expiresAt,
        grantState,
        justification,
        quotaNamespace,
        requestedByUserId,
        status,
        total,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemporaryGrantRequestAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    decidedAt: ").append(toIndentedString(decidedAt)).append("\n");
    sb.append("    decidedByUserId: ").append(toIndentedString(decidedByUserId)).append("\n");
    sb.append("    entityKey: ").append(toIndentedString(entityKey)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    grantState: ").append(toIndentedString(grantState)).append("\n");
    sb.append("    justification: ").append(toIndentedString(justification)).append("\n");
    sb.append("    quotaNamespace: ").append(toIndentedString(quotaNamespace)).append("\n");
    sb.append("    requestedByUserId: ").append(toIndentedString(requestedByUserId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
