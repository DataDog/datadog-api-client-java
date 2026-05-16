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
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes of a flag suggestion. */
@JsonPropertyOrder({
  FlagSuggestionAttributes.JSON_PROPERTY_ACTION,
  FlagSuggestionAttributes.JSON_PROPERTY_BASE_FLAG_HISTORY_ID,
  FlagSuggestionAttributes.JSON_PROPERTY_COMMENT,
  FlagSuggestionAttributes.JSON_PROPERTY_CREATED_AT,
  FlagSuggestionAttributes.JSON_PROPERTY_CREATED_BY,
  FlagSuggestionAttributes.JSON_PROPERTY_CURRENT_STATUS,
  FlagSuggestionAttributes.JSON_PROPERTY_CURRENT_VALUE,
  FlagSuggestionAttributes.JSON_PROPERTY_DELETED_AT,
  FlagSuggestionAttributes.JSON_PROPERTY_DELETED_BY,
  FlagSuggestionAttributes.JSON_PROPERTY_ENVIRONMENT_ID,
  FlagSuggestionAttributes.JSON_PROPERTY_FEATURE_FLAG_ID,
  FlagSuggestionAttributes.JSON_PROPERTY_MESSAGE,
  FlagSuggestionAttributes.JSON_PROPERTY_PROPERTY,
  FlagSuggestionAttributes.JSON_PROPERTY_SUGGESTION,
  FlagSuggestionAttributes.JSON_PROPERTY_SUGGESTION_METADATA,
  FlagSuggestionAttributes.JSON_PROPERTY_UPDATED_AT,
  FlagSuggestionAttributes.JSON_PROPERTY_UPDATED_BY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FlagSuggestionAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTION = "action";
  private FlagSuggestionAction action;

  public static final String JSON_PROPERTY_BASE_FLAG_HISTORY_ID = "base_flag_history_id";
  private UUID baseFlagHistoryId;

  public static final String JSON_PROPERTY_COMMENT = "comment";
  private JsonNullable<String> comment = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private UUID createdBy;

  public static final String JSON_PROPERTY_CURRENT_STATUS = "current_status";
  private FlagSuggestionStatus currentStatus;

  public static final String JSON_PROPERTY_CURRENT_VALUE = "current_value";
  private String currentValue;

  public static final String JSON_PROPERTY_DELETED_AT = "deleted_at";
  private JsonNullable<OffsetDateTime> deletedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_DELETED_BY = "deleted_by";
  private JsonNullable<String> deletedBy = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENVIRONMENT_ID = "environment_id";
  private JsonNullable<String> environmentId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FEATURE_FLAG_ID = "feature_flag_id";
  private UUID featureFlagId;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_PROPERTY = "property";
  private FlagSuggestionProperty property;

  public static final String JSON_PROPERTY_SUGGESTION = "suggestion";
  private String suggestion;

  public static final String JSON_PROPERTY_SUGGESTION_METADATA = "suggestion_metadata";
  private SuggestionMetadata suggestionMetadata;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private JsonNullable<OffsetDateTime> updatedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_UPDATED_BY = "updated_by";
  private JsonNullable<String> updatedBy = JsonNullable.<String>undefined();

  public FlagSuggestionAttributes() {}

  @JsonCreator
  public FlagSuggestionAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACTION) FlagSuggestionAction action,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_BY) UUID createdBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_CURRENT_STATUS)
          FlagSuggestionStatus currentStatus,
      @JsonProperty(required = true, value = JSON_PROPERTY_FEATURE_FLAG_ID) UUID featureFlagId,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROPERTY)
          FlagSuggestionProperty property) {
    this.action = action;
    this.unparsed |= !action.isValid();
    this.createdAt = createdAt;
    this.createdBy = createdBy;
    this.currentStatus = currentStatus;
    this.unparsed |= !currentStatus.isValid();
    this.featureFlagId = featureFlagId;
    this.property = property;
    this.unparsed |= !property.isValid();
  }

  public FlagSuggestionAttributes action(FlagSuggestionAction action) {
    this.action = action;
    this.unparsed |= !action.isValid();
    return this;
  }

  /**
   * The type of change action for a suggestion.
   *
   * @return action
   */
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FlagSuggestionAction getAction() {
    return action;
  }

  public void setAction(FlagSuggestionAction action) {
    if (!action.isValid()) {
      this.unparsed = true;
    }
    this.action = action;
  }

  public FlagSuggestionAttributes baseFlagHistoryId(UUID baseFlagHistoryId) {
    this.baseFlagHistoryId = baseFlagHistoryId;
    return this;
  }

  /**
   * The flag history version this suggestion was based on.
   *
   * @return baseFlagHistoryId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BASE_FLAG_HISTORY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getBaseFlagHistoryId() {
    return baseFlagHistoryId;
  }

  public void setBaseFlagHistoryId(UUID baseFlagHistoryId) {
    this.baseFlagHistoryId = baseFlagHistoryId;
  }

  public FlagSuggestionAttributes comment(String comment) {
    this.comment = JsonNullable.<String>of(comment);
    return this;
  }

  /**
   * Optional comment from the requester.
   *
   * @return comment
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getComment() {
    return comment.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getComment_JsonNullable() {
    return comment;
  }

  @JsonProperty(JSON_PROPERTY_COMMENT)
  public void setComment_JsonNullable(JsonNullable<String> comment) {
    this.comment = comment;
  }

  public void setComment(String comment) {
    this.comment = JsonNullable.<String>of(comment);
  }

  public FlagSuggestionAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * When the suggestion was created.
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

  public FlagSuggestionAttributes createdBy(UUID createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * UUID of the user who created the suggestion.
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

  public FlagSuggestionAttributes currentStatus(FlagSuggestionStatus currentStatus) {
    this.currentStatus = currentStatus;
    this.unparsed |= !currentStatus.isValid();
    return this;
  }

  /**
   * The status of a flag suggestion.
   *
   * @return currentStatus
   */
  @JsonProperty(JSON_PROPERTY_CURRENT_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FlagSuggestionStatus getCurrentStatus() {
    return currentStatus;
  }

  public void setCurrentStatus(FlagSuggestionStatus currentStatus) {
    if (!currentStatus.isValid()) {
      this.unparsed = true;
    }
    this.currentStatus = currentStatus;
  }

  public FlagSuggestionAttributes currentValue(String currentValue) {
    this.currentValue = currentValue;
    return this;
  }

  /**
   * The current value before the suggested change (empty string for flag-level actions like
   * archive).
   *
   * @return currentValue
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCurrentValue() {
    return currentValue;
  }

  public void setCurrentValue(String currentValue) {
    this.currentValue = currentValue;
  }

  public FlagSuggestionAttributes deletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = JsonNullable.<OffsetDateTime>of(deletedAt);
    return this;
  }

  /**
   * When the suggestion was soft-deleted.
   *
   * @return deletedAt
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getDeletedAt() {
    return deletedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DELETED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getDeletedAt_JsonNullable() {
    return deletedAt;
  }

  @JsonProperty(JSON_PROPERTY_DELETED_AT)
  public void setDeletedAt_JsonNullable(JsonNullable<OffsetDateTime> deletedAt) {
    this.deletedAt = deletedAt;
  }

  public void setDeletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = JsonNullable.<OffsetDateTime>of(deletedAt);
  }

  public FlagSuggestionAttributes deletedBy(String deletedBy) {
    this.deletedBy = JsonNullable.<String>of(deletedBy);
    return this;
  }

  /**
   * UUID of the user who deleted the suggestion.
   *
   * @return deletedBy
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getDeletedBy() {
    return deletedBy.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DELETED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDeletedBy_JsonNullable() {
    return deletedBy;
  }

  @JsonProperty(JSON_PROPERTY_DELETED_BY)
  public void setDeletedBy_JsonNullable(JsonNullable<String> deletedBy) {
    this.deletedBy = deletedBy;
  }

  public void setDeletedBy(String deletedBy) {
    this.deletedBy = JsonNullable.<String>of(deletedBy);
  }

  public FlagSuggestionAttributes environmentId(String environmentId) {
    this.environmentId = JsonNullable.<String>of(environmentId);
    return this;
  }

  /**
   * The environment ID for environment-scoped suggestions. Null for flag-level changes.
   *
   * @return environmentId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getEnvironmentId() {
    return environmentId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENVIRONMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getEnvironmentId_JsonNullable() {
    return environmentId;
  }

  @JsonProperty(JSON_PROPERTY_ENVIRONMENT_ID)
  public void setEnvironmentId_JsonNullable(JsonNullable<String> environmentId) {
    this.environmentId = environmentId;
  }

  public void setEnvironmentId(String environmentId) {
    this.environmentId = JsonNullable.<String>of(environmentId);
  }

  public FlagSuggestionAttributes featureFlagId(UUID featureFlagId) {
    this.featureFlagId = featureFlagId;
    return this;
  }

  /**
   * The ID of the feature flag this suggestion applies to.
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

  public FlagSuggestionAttributes message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Human-readable message about the suggestion (populated on auto-created suggestions).
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

  public FlagSuggestionAttributes property(FlagSuggestionProperty property) {
    this.property = property;
    this.unparsed |= !property.isValid();
    return this;
  }

  /**
   * The flag property being changed.
   *
   * @return property
   */
  @JsonProperty(JSON_PROPERTY_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FlagSuggestionProperty getProperty() {
    return property;
  }

  public void setProperty(FlagSuggestionProperty property) {
    if (!property.isValid()) {
      this.unparsed = true;
    }
    this.property = property;
  }

  public FlagSuggestionAttributes suggestion(String suggestion) {
    this.suggestion = suggestion;
    return this;
  }

  /**
   * The suggested new value (JSON-encoded for complex properties, empty string for flag-level
   * actions like archive).
   *
   * @return suggestion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUGGESTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSuggestion() {
    return suggestion;
  }

  public void setSuggestion(String suggestion) {
    this.suggestion = suggestion;
  }

  public FlagSuggestionAttributes suggestionMetadata(SuggestionMetadata suggestionMetadata) {
    this.suggestionMetadata = suggestionMetadata;
    this.unparsed |= suggestionMetadata.unparsed;
    return this;
  }

  /**
   * Optional metadata for a suggestion.
   *
   * @return suggestionMetadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUGGESTION_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SuggestionMetadata getSuggestionMetadata() {
    return suggestionMetadata;
  }

  public void setSuggestionMetadata(SuggestionMetadata suggestionMetadata) {
    this.suggestionMetadata = suggestionMetadata;
  }

  public FlagSuggestionAttributes updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = JsonNullable.<OffsetDateTime>of(updatedAt);
    return this;
  }

  /**
   * When the suggestion was last updated.
   *
   * @return updatedAt
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getUpdatedAt() {
    return updatedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getUpdatedAt_JsonNullable() {
    return updatedAt;
  }

  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  public void setUpdatedAt_JsonNullable(JsonNullable<OffsetDateTime> updatedAt) {
    this.updatedAt = updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = JsonNullable.<OffsetDateTime>of(updatedAt);
  }

  public FlagSuggestionAttributes updatedBy(String updatedBy) {
    this.updatedBy = JsonNullable.<String>of(updatedBy);
    return this;
  }

  /**
   * UUID of the user who last updated the suggestion.
   *
   * @return updatedBy
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getUpdatedBy() {
    return updatedBy.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UPDATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getUpdatedBy_JsonNullable() {
    return updatedBy;
  }

  @JsonProperty(JSON_PROPERTY_UPDATED_BY)
  public void setUpdatedBy_JsonNullable(JsonNullable<String> updatedBy) {
    this.updatedBy = updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = JsonNullable.<String>of(updatedBy);
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
   * @return FlagSuggestionAttributes
   */
  @JsonAnySetter
  public FlagSuggestionAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FlagSuggestionAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlagSuggestionAttributes flagSuggestionAttributes = (FlagSuggestionAttributes) o;
    return Objects.equals(this.action, flagSuggestionAttributes.action)
        && Objects.equals(this.baseFlagHistoryId, flagSuggestionAttributes.baseFlagHistoryId)
        && Objects.equals(this.comment, flagSuggestionAttributes.comment)
        && Objects.equals(this.createdAt, flagSuggestionAttributes.createdAt)
        && Objects.equals(this.createdBy, flagSuggestionAttributes.createdBy)
        && Objects.equals(this.currentStatus, flagSuggestionAttributes.currentStatus)
        && Objects.equals(this.currentValue, flagSuggestionAttributes.currentValue)
        && Objects.equals(this.deletedAt, flagSuggestionAttributes.deletedAt)
        && Objects.equals(this.deletedBy, flagSuggestionAttributes.deletedBy)
        && Objects.equals(this.environmentId, flagSuggestionAttributes.environmentId)
        && Objects.equals(this.featureFlagId, flagSuggestionAttributes.featureFlagId)
        && Objects.equals(this.message, flagSuggestionAttributes.message)
        && Objects.equals(this.property, flagSuggestionAttributes.property)
        && Objects.equals(this.suggestion, flagSuggestionAttributes.suggestion)
        && Objects.equals(this.suggestionMetadata, flagSuggestionAttributes.suggestionMetadata)
        && Objects.equals(this.updatedAt, flagSuggestionAttributes.updatedAt)
        && Objects.equals(this.updatedBy, flagSuggestionAttributes.updatedBy)
        && Objects.equals(this.additionalProperties, flagSuggestionAttributes.additionalProperties);
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
    sb.append("class FlagSuggestionAttributes {\n");
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
