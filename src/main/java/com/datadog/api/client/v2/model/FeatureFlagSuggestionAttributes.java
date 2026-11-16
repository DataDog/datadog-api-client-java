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

/** Attributes of a feature flag change suggestion. */
@JsonPropertyOrder({
  FeatureFlagSuggestionAttributes.JSON_PROPERTY_ACTION,
  FeatureFlagSuggestionAttributes.JSON_PROPERTY_BASE_FLAG_HISTORY_ID,
  FeatureFlagSuggestionAttributes.JSON_PROPERTY_COMMENT,
  FeatureFlagSuggestionAttributes.JSON_PROPERTY_CREATED_AT,
  FeatureFlagSuggestionAttributes.JSON_PROPERTY_CREATED_BY,
  FeatureFlagSuggestionAttributes.JSON_PROPERTY_CURRENT_STATUS,
  FeatureFlagSuggestionAttributes.JSON_PROPERTY_CURRENT_VALUE,
  FeatureFlagSuggestionAttributes.JSON_PROPERTY_DELETED_AT,
  FeatureFlagSuggestionAttributes.JSON_PROPERTY_DELETED_BY,
  FeatureFlagSuggestionAttributes.JSON_PROPERTY_ENVIRONMENT_ID,
  FeatureFlagSuggestionAttributes.JSON_PROPERTY_FEATURE_FLAG_ID,
  FeatureFlagSuggestionAttributes.JSON_PROPERTY_LIFECYCLE_STATUS,
  FeatureFlagSuggestionAttributes.JSON_PROPERTY_MESSAGE,
  FeatureFlagSuggestionAttributes.JSON_PROPERTY_PROPERTY,
  FeatureFlagSuggestionAttributes.JSON_PROPERTY_SUGGESTION,
  FeatureFlagSuggestionAttributes.JSON_PROPERTY_SUGGESTION_METADATA,
  FeatureFlagSuggestionAttributes.JSON_PROPERTY_UPDATED_AT,
  FeatureFlagSuggestionAttributes.JSON_PROPERTY_UPDATED_BY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FeatureFlagSuggestionAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTION = "action";
  private String action;

  public static final String JSON_PROPERTY_BASE_FLAG_HISTORY_ID = "base_flag_history_id";
  private UUID baseFlagHistoryId;

  public static final String JSON_PROPERTY_COMMENT = "comment";
  private String comment;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private UUID createdBy;

  public static final String JSON_PROPERTY_CURRENT_STATUS = "current_status";
  private FeatureFlagSuggestionAttributesCurrentStatus currentStatus;

  public static final String JSON_PROPERTY_CURRENT_VALUE = "current_value";
  private String currentValue;

  public static final String JSON_PROPERTY_DELETED_AT = "deleted_at";
  private OffsetDateTime deletedAt;

  public static final String JSON_PROPERTY_DELETED_BY = "deleted_by";
  private UUID deletedBy;

  public static final String JSON_PROPERTY_ENVIRONMENT_ID = "environment_id";
  private UUID environmentId;

  public static final String JSON_PROPERTY_FEATURE_FLAG_ID = "feature_flag_id";
  private UUID featureFlagId;

  public static final String JSON_PROPERTY_LIFECYCLE_STATUS = "lifecycle_status";
  private FeatureFlagSuggestionAttributesLifecycleStatus lifecycleStatus;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_PROPERTY = "property";
  private String property;

  public static final String JSON_PROPERTY_SUGGESTION = "suggestion";
  private String suggestion;

  public static final String JSON_PROPERTY_SUGGESTION_METADATA = "suggestion_metadata";
  private FeatureFlagSuggestionMetadata suggestionMetadata;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_UPDATED_BY = "updated_by";
  private UUID updatedBy;

  public FeatureFlagSuggestionAttributes() {}

  @JsonCreator
  public FeatureFlagSuggestionAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACTION) String action,
      @JsonProperty(required = true, value = JSON_PROPERTY_BASE_FLAG_HISTORY_ID)
          UUID baseFlagHistoryId,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_BY) UUID createdBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_CURRENT_STATUS)
          FeatureFlagSuggestionAttributesCurrentStatus currentStatus,
      @JsonProperty(required = true, value = JSON_PROPERTY_CURRENT_VALUE) String currentValue,
      @JsonProperty(required = true, value = JSON_PROPERTY_FEATURE_FLAG_ID) UUID featureFlagId,
      @JsonProperty(required = true, value = JSON_PROPERTY_LIFECYCLE_STATUS)
          FeatureFlagSuggestionAttributesLifecycleStatus lifecycleStatus,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROPERTY) String property,
      @JsonProperty(required = true, value = JSON_PROPERTY_SUGGESTION) String suggestion) {
    this.action = action;
    this.baseFlagHistoryId = baseFlagHistoryId;
    this.createdAt = createdAt;
    this.createdBy = createdBy;
    this.currentStatus = currentStatus;
    this.unparsed |= !currentStatus.isValid();
    this.currentValue = currentValue;
    this.featureFlagId = featureFlagId;
    this.lifecycleStatus = lifecycleStatus;
    this.unparsed |= !lifecycleStatus.isValid();
    this.property = property;
    this.suggestion = suggestion;
  }

  public FeatureFlagSuggestionAttributes action(String action) {
    this.action = action;
    return this;
  }

  /**
   * The action proposed by the suggestion.
   *
   * @return action
   */
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public FeatureFlagSuggestionAttributes baseFlagHistoryId(UUID baseFlagHistoryId) {
    this.baseFlagHistoryId = baseFlagHistoryId;
    return this;
  }

  /**
   * The ID of the flag history entry on which the suggestion is based.
   *
   * @return baseFlagHistoryId
   */
  @JsonProperty(JSON_PROPERTY_BASE_FLAG_HISTORY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getBaseFlagHistoryId() {
    return baseFlagHistoryId;
  }

  public void setBaseFlagHistoryId(UUID baseFlagHistoryId) {
    this.baseFlagHistoryId = baseFlagHistoryId;
  }

  public FeatureFlagSuggestionAttributes comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * The comment supplied by the suggestion's creator.
   *
   * @return comment
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public FeatureFlagSuggestionAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The timestamp when the suggestion was created.
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

  public FeatureFlagSuggestionAttributes createdBy(UUID createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The ID of the user who created the suggestion.
   *
   * @return createdBy
   */
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(UUID createdBy) {
    this.createdBy = createdBy;
  }

  public FeatureFlagSuggestionAttributes currentStatus(
      FeatureFlagSuggestionAttributesCurrentStatus currentStatus) {
    this.currentStatus = currentStatus;
    this.unparsed |= !currentStatus.isValid();
    return this;
  }

  /**
   * The legacy review status. Use <code>lifecycle_status</code> to distinguish approval from
   * application.
   *
   * @return currentStatus
   */
  @JsonProperty(JSON_PROPERTY_CURRENT_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FeatureFlagSuggestionAttributesCurrentStatus getCurrentStatus() {
    return currentStatus;
  }

  public void setCurrentStatus(FeatureFlagSuggestionAttributesCurrentStatus currentStatus) {
    if (!currentStatus.isValid()) {
      this.unparsed = true;
    }
    this.currentStatus = currentStatus;
  }

  public FeatureFlagSuggestionAttributes currentValue(String currentValue) {
    this.currentValue = currentValue;
    return this;
  }

  /**
   * The value before the proposed change, serialized as a string.
   *
   * @return currentValue
   */
  @JsonProperty(JSON_PROPERTY_CURRENT_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCurrentValue() {
    return currentValue;
  }

  public void setCurrentValue(String currentValue) {
    this.currentValue = currentValue;
  }

  public FeatureFlagSuggestionAttributes deletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = deletedAt;
    return this;
  }

  /**
   * The timestamp when the suggestion was deleted.
   *
   * @return deletedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getDeletedAt() {
    return deletedAt;
  }

  public void setDeletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = deletedAt;
  }

  public FeatureFlagSuggestionAttributes deletedBy(UUID deletedBy) {
    this.deletedBy = deletedBy;
    return this;
  }

  /**
   * The ID of the user who deleted the suggestion.
   *
   * @return deletedBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getDeletedBy() {
    return deletedBy;
  }

  public void setDeletedBy(UUID deletedBy) {
    this.deletedBy = deletedBy;
  }

  public FeatureFlagSuggestionAttributes environmentId(UUID environmentId) {
    this.environmentId = environmentId;
    return this;
  }

  /**
   * The ID of the environment targeted by the change, if the change is environment-specific.
   *
   * @return environmentId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENVIRONMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getEnvironmentId() {
    return environmentId;
  }

  public void setEnvironmentId(UUID environmentId) {
    this.environmentId = environmentId;
  }

  public FeatureFlagSuggestionAttributes featureFlagId(UUID featureFlagId) {
    this.featureFlagId = featureFlagId;
    return this;
  }

  /**
   * The ID of the feature flag that the suggestion changes.
   *
   * @return featureFlagId
   */
  @JsonProperty(JSON_PROPERTY_FEATURE_FLAG_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getFeatureFlagId() {
    return featureFlagId;
  }

  public void setFeatureFlagId(UUID featureFlagId) {
    this.featureFlagId = featureFlagId;
  }

  public FeatureFlagSuggestionAttributes lifecycleStatus(
      FeatureFlagSuggestionAttributesLifecycleStatus lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
    this.unparsed |= !lifecycleStatus.isValid();
    return this;
  }

  /**
   * The lifecycle status of the suggestion.
   *
   * @return lifecycleStatus
   */
  @JsonProperty(JSON_PROPERTY_LIFECYCLE_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FeatureFlagSuggestionAttributesLifecycleStatus getLifecycleStatus() {
    return lifecycleStatus;
  }

  public void setLifecycleStatus(FeatureFlagSuggestionAttributesLifecycleStatus lifecycleStatus) {
    if (!lifecycleStatus.isValid()) {
      this.unparsed = true;
    }
    this.lifecycleStatus = lifecycleStatus;
  }

  public FeatureFlagSuggestionAttributes message(String message) {
    this.message = message;
    return this;
  }

  /**
   * A message explaining why a suggestion was created.
   *
   * @return message
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public FeatureFlagSuggestionAttributes property(String property) {
    this.property = property;
    return this;
  }

  /**
   * The feature flag property to update.
   *
   * @return property
   */
  @JsonProperty(JSON_PROPERTY_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getProperty() {
    return property;
  }

  public void setProperty(String property) {
    this.property = property;
  }

  public FeatureFlagSuggestionAttributes suggestion(String suggestion) {
    this.suggestion = suggestion;
    return this;
  }

  /**
   * The proposed value, serialized as a string. Structured values, such as variants and
   * allocations, are JSON-encoded strings.
   *
   * @return suggestion
   */
  @JsonProperty(JSON_PROPERTY_SUGGESTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSuggestion() {
    return suggestion;
  }

  public void setSuggestion(String suggestion) {
    this.suggestion = suggestion;
  }

  public FeatureFlagSuggestionAttributes suggestionMetadata(
      FeatureFlagSuggestionMetadata suggestionMetadata) {
    this.suggestionMetadata = suggestionMetadata;
    this.unparsed |= suggestionMetadata.unparsed;
    return this;
  }

  /**
   * Metadata associated with a suggestion. Fields other than <code>variant_id</code> are set by the
   * server.
   *
   * @return suggestionMetadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUGGESTION_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FeatureFlagSuggestionMetadata getSuggestionMetadata() {
    return suggestionMetadata;
  }

  public void setSuggestionMetadata(FeatureFlagSuggestionMetadata suggestionMetadata) {
    this.suggestionMetadata = suggestionMetadata;
    if (suggestionMetadata != null) {
      this.unparsed |= suggestionMetadata.unparsed;
    }
  }

  public FeatureFlagSuggestionAttributes updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The timestamp when the suggestion was last updated.
   *
   * @return updatedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public FeatureFlagSuggestionAttributes updatedBy(UUID updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  /**
   * The ID of the user who last updated the suggestion.
   *
   * @return updatedBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(UUID updatedBy) {
    this.updatedBy = updatedBy;
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
   * @return FeatureFlagSuggestionAttributes
   */
  @JsonAnySetter
  public FeatureFlagSuggestionAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FeatureFlagSuggestionAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureFlagSuggestionAttributes featureFlagSuggestionAttributes =
        (FeatureFlagSuggestionAttributes) o;
    return Objects.equals(this.action, featureFlagSuggestionAttributes.action)
        && Objects.equals(this.baseFlagHistoryId, featureFlagSuggestionAttributes.baseFlagHistoryId)
        && Objects.equals(this.comment, featureFlagSuggestionAttributes.comment)
        && Objects.equals(this.createdAt, featureFlagSuggestionAttributes.createdAt)
        && Objects.equals(this.createdBy, featureFlagSuggestionAttributes.createdBy)
        && Objects.equals(this.currentStatus, featureFlagSuggestionAttributes.currentStatus)
        && Objects.equals(this.currentValue, featureFlagSuggestionAttributes.currentValue)
        && Objects.equals(this.deletedAt, featureFlagSuggestionAttributes.deletedAt)
        && Objects.equals(this.deletedBy, featureFlagSuggestionAttributes.deletedBy)
        && Objects.equals(this.environmentId, featureFlagSuggestionAttributes.environmentId)
        && Objects.equals(this.featureFlagId, featureFlagSuggestionAttributes.featureFlagId)
        && Objects.equals(this.lifecycleStatus, featureFlagSuggestionAttributes.lifecycleStatus)
        && Objects.equals(this.message, featureFlagSuggestionAttributes.message)
        && Objects.equals(this.property, featureFlagSuggestionAttributes.property)
        && Objects.equals(this.suggestion, featureFlagSuggestionAttributes.suggestion)
        && Objects.equals(
            this.suggestionMetadata, featureFlagSuggestionAttributes.suggestionMetadata)
        && Objects.equals(this.updatedAt, featureFlagSuggestionAttributes.updatedAt)
        && Objects.equals(this.updatedBy, featureFlagSuggestionAttributes.updatedBy)
        && Objects.equals(
            this.additionalProperties, featureFlagSuggestionAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        action,
        baseFlagHistoryId,
        comment,
        createdAt,
        createdBy,
        currentStatus,
        currentValue,
        deletedAt,
        deletedBy,
        environmentId,
        featureFlagId,
        lifecycleStatus,
        message,
        property,
        suggestion,
        suggestionMetadata,
        updatedAt,
        updatedBy,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureFlagSuggestionAttributes {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    baseFlagHistoryId: ").append(toIndentedString(baseFlagHistoryId)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    currentStatus: ").append(toIndentedString(currentStatus)).append("\n");
    sb.append("    currentValue: ").append(toIndentedString(currentValue)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    deletedBy: ").append(toIndentedString(deletedBy)).append("\n");
    sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
    sb.append("    featureFlagId: ").append(toIndentedString(featureFlagId)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
    sb.append("    suggestionMetadata: ").append(toIndentedString(suggestionMetadata)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
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
