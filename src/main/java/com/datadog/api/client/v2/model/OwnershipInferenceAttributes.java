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

/** The attributes of a single ownership inference. */
@JsonPropertyOrder({
  OwnershipInferenceAttributes.JSON_PROPERTY_CHECKSUM,
  OwnershipInferenceAttributes.JSON_PROPERTY_CONFIDENCE,
  OwnershipInferenceAttributes.JSON_PROPERTY_CREATED_AT,
  OwnershipInferenceAttributes.JSON_PROPERTY_EVIDENCE_VERSIONS,
  OwnershipInferenceAttributes.JSON_PROPERTY_EXPLANATION,
  OwnershipInferenceAttributes.JSON_PROPERTY_OWNER_TYPE,
  OwnershipInferenceAttributes.JSON_PROPERTY_PRIMARY_CONTACT_REF,
  OwnershipInferenceAttributes.JSON_PROPERTY_SOURCES,
  OwnershipInferenceAttributes.JSON_PROPERTY_STATUS,
  OwnershipInferenceAttributes.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OwnershipInferenceAttributes {
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

  public static final String JSON_PROPERTY_OWNER_TYPE = "owner_type";
  private OwnershipOwnerType ownerType;

  public static final String JSON_PROPERTY_PRIMARY_CONTACT_REF = "primary_contact_ref";
  private JsonNullable<String> primaryContactRef = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SOURCES = "sources";
  private List<Map<String, Object>> sources = new ArrayList<>();

  public static final String JSON_PROPERTY_STATUS = "status";
  private OwnershipInferenceStatus status;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public OwnershipInferenceAttributes() {}

  @JsonCreator
  public OwnershipInferenceAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CHECKSUM) String checksum,
      @JsonProperty(required = true, value = JSON_PROPERTY_CONFIDENCE) String confidence,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_EVIDENCE_VERSIONS)
          List<Map<String, Object>> evidenceVersions,
      @JsonProperty(required = true, value = JSON_PROPERTY_EXPLANATION) String explanation,
      @JsonProperty(required = true, value = JSON_PROPERTY_OWNER_TYPE) OwnershipOwnerType ownerType,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCES)
          List<Map<String, Object>> sources,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS) OwnershipInferenceStatus status,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_AT) OffsetDateTime updatedAt) {
    this.checksum = checksum;
    this.confidence = confidence;
    this.createdAt = createdAt;
    this.evidenceVersions = evidenceVersions;
    if (evidenceVersions != null) {}
    this.explanation = explanation;
    this.ownerType = ownerType;
    this.unparsed |= !ownerType.isValid();
    this.sources = sources;
    this.status = status;
    this.unparsed |= !status.isValid();
    this.updatedAt = updatedAt;
  }

  public OwnershipInferenceAttributes checksum(String checksum) {
    this.checksum = checksum;
    return this;
  }

  /**
   * A checksum that uniquely identifies the current state of the inference. Required when
   * submitting feedback.
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

  public OwnershipInferenceAttributes confidence(String confidence) {
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

  public OwnershipInferenceAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The time when the inference was created.
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

  public OwnershipInferenceAttributes evidenceVersions(List<Map<String, Object>> evidenceVersions) {
    this.evidenceVersions = evidenceVersions;
    return this;
  }

  public OwnershipInferenceAttributes addEvidenceVersionsItem(
      Map<String, Object> evidenceVersionsItem) {
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

  public OwnershipInferenceAttributes explanation(String explanation) {
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

  public OwnershipInferenceAttributes ownerType(OwnershipOwnerType ownerType) {
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

  public OwnershipInferenceAttributes primaryContactRef(String primaryContactRef) {
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

  public OwnershipInferenceAttributes sources(List<Map<String, Object>> sources) {
    this.sources = sources;
    return this;
  }

  public OwnershipInferenceAttributes addSourcesItem(Map<String, Object> sourcesItem) {
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

  public OwnershipInferenceAttributes status(OwnershipInferenceStatus status) {
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

  public OwnershipInferenceAttributes updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The time when the inference was last updated.
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
   * @return OwnershipInferenceAttributes
   */
  @JsonAnySetter
  public OwnershipInferenceAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OwnershipInferenceAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OwnershipInferenceAttributes ownershipInferenceAttributes = (OwnershipInferenceAttributes) o;
    return Objects.equals(this.checksum, ownershipInferenceAttributes.checksum)
        && Objects.equals(this.confidence, ownershipInferenceAttributes.confidence)
        && Objects.equals(this.createdAt, ownershipInferenceAttributes.createdAt)
        && Objects.equals(this.evidenceVersions, ownershipInferenceAttributes.evidenceVersions)
        && Objects.equals(this.explanation, ownershipInferenceAttributes.explanation)
        && Objects.equals(this.ownerType, ownershipInferenceAttributes.ownerType)
        && Objects.equals(this.primaryContactRef, ownershipInferenceAttributes.primaryContactRef)
        && Objects.equals(this.sources, ownershipInferenceAttributes.sources)
        && Objects.equals(this.status, ownershipInferenceAttributes.status)
        && Objects.equals(this.updatedAt, ownershipInferenceAttributes.updatedAt)
        && Objects.equals(
            this.additionalProperties, ownershipInferenceAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        checksum,
        confidence,
        createdAt,
        evidenceVersions,
        explanation,
        ownerType,
        primaryContactRef,
        sources,
        status,
        updatedAt,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OwnershipInferenceAttributes {\n");
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    evidenceVersions: ").append(toIndentedString(evidenceVersions)).append("\n");
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
    sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
    sb.append("    primaryContactRef: ").append(toIndentedString(primaryContactRef)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
