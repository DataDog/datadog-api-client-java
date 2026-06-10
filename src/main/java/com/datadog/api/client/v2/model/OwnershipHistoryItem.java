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
import org.openapitools.jackson.nullable.JsonNullable;

/** A single ownership inference history entry. */
@JsonPropertyOrder({
  OwnershipHistoryItem.JSON_PROPERTY_CHECKSUM,
  OwnershipHistoryItem.JSON_PROPERTY_CONFIDENCE,
  OwnershipHistoryItem.JSON_PROPERTY_CREATED_AT,
  OwnershipHistoryItem.JSON_PROPERTY_EVIDENCE_VERSIONS,
  OwnershipHistoryItem.JSON_PROPERTY_EXPLANATION,
  OwnershipHistoryItem.JSON_PROPERTY_FAILED_AT,
  OwnershipHistoryItem.JSON_PROPERTY_FAILURE_REASON,
  OwnershipHistoryItem.JSON_PROPERTY_ID,
  OwnershipHistoryItem.JSON_PROPERTY_OWNER_TYPE,
  OwnershipHistoryItem.JSON_PROPERTY_PRIMARY_CONTACT_REF,
  OwnershipHistoryItem.JSON_PROPERTY_RESOURCE_ID,
  OwnershipHistoryItem.JSON_PROPERTY_RETRY_SCHEDULE,
  OwnershipHistoryItem.JSON_PROPERTY_SOURCES,
  OwnershipHistoryItem.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OwnershipHistoryItem {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHECKSUM = "checksum";
  private String checksum;

  public static final String JSON_PROPERTY_CONFIDENCE = "confidence";
  private String confidence;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_EVIDENCE_VERSIONS = "evidence_versions";
  private List<Map<String, Object>> evidenceVersions = new ArrayList<>();

  public static final String JSON_PROPERTY_EXPLANATION = "explanation";
  private String explanation;

  public static final String JSON_PROPERTY_FAILED_AT = "failed_at";
  private JsonNullable<OffsetDateTime> failedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_FAILURE_REASON = "failure_reason";
  private JsonNullable<String> failureReason = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_OWNER_TYPE = "owner_type";
  private OwnershipOwnerType ownerType;

  public static final String JSON_PROPERTY_PRIMARY_CONTACT_REF = "primary_contact_ref";
  private JsonNullable<String> primaryContactRef = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_RESOURCE_ID = "resource_id";
  private String resourceId;

  public static final String JSON_PROPERTY_RETRY_SCHEDULE = "retry_schedule";
  private JsonNullable<OffsetDateTime> retrySchedule = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_SOURCES = "sources";
  private List<Map<String, Object>> sources = new ArrayList<>();

  public static final String JSON_PROPERTY_STATUS = "status";
  private OwnershipInferenceStatus status;

  public OwnershipHistoryItem() {}

  @JsonCreator
  public OwnershipHistoryItem(
      @JsonProperty(required = true, value = JSON_PROPERTY_CHECKSUM) String checksum,
      @JsonProperty(required = true, value = JSON_PROPERTY_CONFIDENCE) String confidence,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_EVIDENCE_VERSIONS)
          List<Map<String, Object>> evidenceVersions,
      @JsonProperty(required = true, value = JSON_PROPERTY_EXPLANATION) String explanation,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) Long id,
      @JsonProperty(required = true, value = JSON_PROPERTY_OWNER_TYPE) OwnershipOwnerType ownerType,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOURCE_ID) String resourceId,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCES)
          List<Map<String, Object>> sources,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS)
          OwnershipInferenceStatus status) {
    this.checksum = checksum;
    this.confidence = confidence;
    this.createdAt = createdAt;
    this.evidenceVersions = evidenceVersions;
    if (evidenceVersions != null) {}
    this.explanation = explanation;
    this.id = id;
    this.ownerType = ownerType;
    this.unparsed |= !ownerType.isValid();
    this.resourceId = resourceId;
    this.sources = sources;
    this.status = status;
    this.unparsed |= !status.isValid();
  }

  public OwnershipHistoryItem checksum(String checksum) {
    this.checksum = checksum;
    return this;
  }

  /**
   * A checksum identifying the state of the inference at this point in time.
   *
   * @return checksum
   */
  @JsonProperty(JSON_PROPERTY_CHECKSUM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getChecksum() {
    return checksum;
  }

  public void setChecksum(String checksum) {
    this.checksum = checksum;
  }

  public OwnershipHistoryItem confidence(String confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * The confidence score of the inference, expressed as a numeric string with up to four decimal
   * places.
   *
   * @return confidence
   */
  @JsonProperty(JSON_PROPERTY_CONFIDENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getConfidence() {
    return confidence;
  }

  public void setConfidence(String confidence) {
    this.confidence = confidence;
  }

  public OwnershipHistoryItem createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The time this history entry was created.
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

  public OwnershipHistoryItem evidenceVersions(List<Map<String, Object>> evidenceVersions) {
    this.evidenceVersions = evidenceVersions;
    return this;
  }

  public OwnershipHistoryItem addEvidenceVersionsItem(Map<String, Object> evidenceVersionsItem) {
    this.evidenceVersions.add(evidenceVersionsItem);
    return this;
  }

  /**
   * The list of evidence versions associated with an inference.
   *
   * @return evidenceVersions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVIDENCE_VERSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<Map<String, Object>> getEvidenceVersions() {
    return evidenceVersions;
  }

  public void setEvidenceVersions(List<Map<String, Object>> evidenceVersions) {
    this.evidenceVersions = evidenceVersions;
  }

  public OwnershipHistoryItem explanation(String explanation) {
    this.explanation = explanation;
    return this;
  }

  /**
   * A human-readable explanation of how the inference was produced.
   *
   * @return explanation
   */
  @JsonProperty(JSON_PROPERTY_EXPLANATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getExplanation() {
    return explanation;
  }

  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }

  public OwnershipHistoryItem failedAt(OffsetDateTime failedAt) {
    this.failedAt = JsonNullable.<OffsetDateTime>of(failedAt);
    return this;
  }

  /**
   * The time when this inference failed, if applicable.
   *
   * @return failedAt
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getFailedAt() {
    return failedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FAILED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getFailedAt_JsonNullable() {
    return failedAt;
  }

  @JsonProperty(JSON_PROPERTY_FAILED_AT)
  public void setFailedAt_JsonNullable(JsonNullable<OffsetDateTime> failedAt) {
    this.failedAt = failedAt;
  }

  public void setFailedAt(OffsetDateTime failedAt) {
    this.failedAt = JsonNullable.<OffsetDateTime>of(failedAt);
  }

  public OwnershipHistoryItem failureReason(String failureReason) {
    this.failureReason = JsonNullable.<String>of(failureReason);
    return this;
  }

  /**
   * The reason why this inference failed, if applicable.
   *
   * @return failureReason
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getFailureReason() {
    return failureReason.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FAILURE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getFailureReason_JsonNullable() {
    return failureReason;
  }

  @JsonProperty(JSON_PROPERTY_FAILURE_REASON)
  public void setFailureReason_JsonNullable(JsonNullable<String> failureReason) {
    this.failureReason = failureReason;
  }

  public void setFailureReason(String failureReason) {
    this.failureReason = JsonNullable.<String>of(failureReason);
  }

  public OwnershipHistoryItem id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the history entry.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OwnershipHistoryItem ownerType(OwnershipOwnerType ownerType) {
    this.ownerType = ownerType;
    this.unparsed |= !ownerType.isValid();
    return this;
  }

  /**
   * The owner type for an ownership inference.
   *
   * @return ownerType
   */
  @JsonProperty(JSON_PROPERTY_OWNER_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OwnershipOwnerType getOwnerType() {
    return ownerType;
  }

  public void setOwnerType(OwnershipOwnerType ownerType) {
    if (!ownerType.isValid()) {
      this.unparsed = true;
    }
    this.ownerType = ownerType;
  }

  public OwnershipHistoryItem primaryContactRef(String primaryContactRef) {
    this.primaryContactRef = JsonNullable.<String>of(primaryContactRef);
    return this;
  }

  /**
   * The primary contact reference for the inferred owner, formatted as <code>
   * ref:handle/&lt;owner_handle&gt;</code>.
   *
   * @return primaryContactRef
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getPrimaryContactRef() {
    return primaryContactRef.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRIMARY_CONTACT_REF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getPrimaryContactRef_JsonNullable() {
    return primaryContactRef;
  }

  @JsonProperty(JSON_PROPERTY_PRIMARY_CONTACT_REF)
  public void setPrimaryContactRef_JsonNullable(JsonNullable<String> primaryContactRef) {
    this.primaryContactRef = primaryContactRef;
  }

  public void setPrimaryContactRef(String primaryContactRef) {
    this.primaryContactRef = JsonNullable.<String>of(primaryContactRef);
  }

  public OwnershipHistoryItem resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * The identifier of the resource that the inference applies to.
   *
   * @return resourceId
   */
  @JsonProperty(JSON_PROPERTY_RESOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  public OwnershipHistoryItem retrySchedule(OffsetDateTime retrySchedule) {
    this.retrySchedule = JsonNullable.<OffsetDateTime>of(retrySchedule);
    return this;
  }

  /**
   * The scheduled retry time for a failed inference, if applicable.
   *
   * @return retrySchedule
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getRetrySchedule() {
    return retrySchedule.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RETRY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getRetrySchedule_JsonNullable() {
    return retrySchedule;
  }

  @JsonProperty(JSON_PROPERTY_RETRY_SCHEDULE)
  public void setRetrySchedule_JsonNullable(JsonNullable<OffsetDateTime> retrySchedule) {
    this.retrySchedule = retrySchedule;
  }

  public void setRetrySchedule(OffsetDateTime retrySchedule) {
    this.retrySchedule = JsonNullable.<OffsetDateTime>of(retrySchedule);
  }

  public OwnershipHistoryItem sources(List<Map<String, Object>> sources) {
    this.sources = sources;
    return this;
  }

  public OwnershipHistoryItem addSourcesItem(Map<String, Object> sourcesItem) {
    this.sources.add(sourcesItem);
    return this;
  }

  /**
   * The list of sources backing an ownership inference. Empty when the inference status is not
   * whitelisted to expose sources.
   *
   * @return sources
   */
  @JsonProperty(JSON_PROPERTY_SOURCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<Map<String, Object>> getSources() {
    return sources;
  }

  public void setSources(List<Map<String, Object>> sources) {
    this.sources = sources;
  }

  public OwnershipHistoryItem status(OwnershipInferenceStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * The lifecycle status of an ownership inference.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OwnershipInferenceStatus getStatus() {
    return status;
  }

  public void setStatus(OwnershipInferenceStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
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
   * @return OwnershipHistoryItem
   */
  @JsonAnySetter
  public OwnershipHistoryItem putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OwnershipHistoryItem object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OwnershipHistoryItem ownershipHistoryItem = (OwnershipHistoryItem) o;
    return Objects.equals(this.checksum, ownershipHistoryItem.checksum)
        && Objects.equals(this.confidence, ownershipHistoryItem.confidence)
        && Objects.equals(this.createdAt, ownershipHistoryItem.createdAt)
        && Objects.equals(this.evidenceVersions, ownershipHistoryItem.evidenceVersions)
        && Objects.equals(this.explanation, ownershipHistoryItem.explanation)
        && Objects.equals(this.failedAt, ownershipHistoryItem.failedAt)
        && Objects.equals(this.failureReason, ownershipHistoryItem.failureReason)
        && Objects.equals(this.id, ownershipHistoryItem.id)
        && Objects.equals(this.ownerType, ownershipHistoryItem.ownerType)
        && Objects.equals(this.primaryContactRef, ownershipHistoryItem.primaryContactRef)
        && Objects.equals(this.resourceId, ownershipHistoryItem.resourceId)
        && Objects.equals(this.retrySchedule, ownershipHistoryItem.retrySchedule)
        && Objects.equals(this.sources, ownershipHistoryItem.sources)
        && Objects.equals(this.status, ownershipHistoryItem.status)
        && Objects.equals(this.additionalProperties, ownershipHistoryItem.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        checksum,
        confidence,
        createdAt,
        evidenceVersions,
        explanation,
        failedAt,
        failureReason,
        id,
        ownerType,
        primaryContactRef,
        resourceId,
        retrySchedule,
        sources,
        status,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OwnershipHistoryItem {\n");
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    evidenceVersions: ").append(toIndentedString(evidenceVersions)).append("\n");
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
    sb.append("    failedAt: ").append(toIndentedString(failedAt)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
    sb.append("    primaryContactRef: ").append(toIndentedString(primaryContactRef)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    retrySchedule: ").append(toIndentedString(retrySchedule)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
