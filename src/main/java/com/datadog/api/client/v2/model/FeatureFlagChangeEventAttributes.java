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
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes of a feature flag change event. */
@JsonPropertyOrder({
  FeatureFlagChangeEventAttributes.JSON_PROPERTY_ACTION,
  FeatureFlagChangeEventAttributes.JSON_PROPERTY_CHANGE_METADATA,
  FeatureFlagChangeEventAttributes.JSON_PROPERTY_CREATION_SOURCE,
  FeatureFlagChangeEventAttributes.JSON_PROPERTY_DESCRIPTION,
  FeatureFlagChangeEventAttributes.JSON_PROPERTY_ENVIRONMENT,
  FeatureFlagChangeEventAttributes.JSON_PROPERTY_FEATURE_FLAG,
  FeatureFlagChangeEventAttributes.JSON_PROPERTY_NEW_VALUE,
  FeatureFlagChangeEventAttributes.JSON_PROPERTY_PREVIOUS_VALUE,
  FeatureFlagChangeEventAttributes.JSON_PROPERTY_PROPERTY,
  FeatureFlagChangeEventAttributes.JSON_PROPERTY_SUGGESTION_REVIEW,
  FeatureFlagChangeEventAttributes.JSON_PROPERTY_TIMESTAMP,
  FeatureFlagChangeEventAttributes.JSON_PROPERTY_USER_ID,
  FeatureFlagChangeEventAttributes.JSON_PROPERTY_VERSION_NUMBER
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FeatureFlagChangeEventAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTION = "action";
  private FeatureFlagChangeEventAction action;

  public static final String JSON_PROPERTY_CHANGE_METADATA = "change_metadata";
  private JsonNullable<String> changeMetadata = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CREATION_SOURCE = "creation_source";
  private JsonNullable<FeatureFlagChangeEventCreationSource> creationSource =
      JsonNullable.<FeatureFlagChangeEventCreationSource>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ENVIRONMENT = "environment";
  private JsonNullable<FeatureFlagChangeEventEnvironment> environment =
      JsonNullable.<FeatureFlagChangeEventEnvironment>undefined();

  public static final String JSON_PROPERTY_FEATURE_FLAG = "feature_flag";
  private FeatureFlagChangeEventFlag featureFlag;

  public static final String JSON_PROPERTY_NEW_VALUE = "new_value";
  private JsonNullable<String> newValue = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PREVIOUS_VALUE = "previous_value";
  private JsonNullable<String> previousValue = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PROPERTY = "property";
  private FeatureFlagChangeEventProperty property;

  public static final String JSON_PROPERTY_SUGGESTION_REVIEW = "suggestion_review";
  private FeatureFlagChangeEventSuggestionReview suggestionReview;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private OffsetDateTime timestamp;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private JsonNullable<String> userId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_VERSION_NUMBER = "version_number";
  private Long versionNumber;

  public FeatureFlagChangeEventAttributes() {}

  @JsonCreator
  public FeatureFlagChangeEventAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACTION)
          FeatureFlagChangeEventAction action,
      @JsonProperty(required = true, value = JSON_PROPERTY_FEATURE_FLAG)
          FeatureFlagChangeEventFlag featureFlag,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROPERTY)
          FeatureFlagChangeEventProperty property,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIMESTAMP) OffsetDateTime timestamp,
      @JsonProperty(required = true, value = JSON_PROPERTY_VERSION_NUMBER) Long versionNumber) {
    this.action = action;
    this.unparsed |= !action.isValid();
    this.featureFlag = featureFlag;
    this.unparsed |= featureFlag.unparsed;
    this.property = property;
    this.unparsed |= !property.isValid();
    this.timestamp = timestamp;
    this.versionNumber = versionNumber;
  }

  public FeatureFlagChangeEventAttributes action(FeatureFlagChangeEventAction action) {
    this.action = action;
    this.unparsed |= !action.isValid();
    return this;
  }

  /**
   * The kind of change.
   *
   * @return action
   */
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FeatureFlagChangeEventAction getAction() {
    return action;
  }

  public void setAction(FeatureFlagChangeEventAction action) {
    if (!action.isValid()) {
      this.unparsed = true;
    }
    this.action = action;
  }

  public FeatureFlagChangeEventAttributes changeMetadata(String changeMetadata) {
    this.changeMetadata = JsonNullable.<String>of(changeMetadata);
    return this;
  }

  /**
   * Additional details about the change, as a JSON-encoded string.
   *
   * @return changeMetadata
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getChangeMetadata() {
    return changeMetadata.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CHANGE_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getChangeMetadata_JsonNullable() {
    return changeMetadata;
  }

  @JsonProperty(JSON_PROPERTY_CHANGE_METADATA)
  public void setChangeMetadata_JsonNullable(JsonNullable<String> changeMetadata) {
    this.changeMetadata = changeMetadata;
  }

  public void setChangeMetadata(String changeMetadata) {
    this.changeMetadata = JsonNullable.<String>of(changeMetadata);
  }

  public FeatureFlagChangeEventAttributes creationSource(
      FeatureFlagChangeEventCreationSource creationSource) {
    this.creationSource = JsonNullable.<FeatureFlagChangeEventCreationSource>of(creationSource);
    return this;
  }

  /**
   * Where the change was made: <code>UI</code> for the Datadog app, or <code>MCP</code> for a Model
   * Context Protocol (MCP) client.
   *
   * @return creationSource
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public FeatureFlagChangeEventCreationSource getCreationSource() {
    return creationSource.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CREATION_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<FeatureFlagChangeEventCreationSource> getCreationSource_JsonNullable() {
    return creationSource;
  }

  @JsonProperty(JSON_PROPERTY_CREATION_SOURCE)
  public void setCreationSource_JsonNullable(
      JsonNullable<FeatureFlagChangeEventCreationSource> creationSource) {
    this.creationSource = creationSource;
  }

  public void setCreationSource(FeatureFlagChangeEventCreationSource creationSource) {
    if (!creationSource.isValid()) {
      this.unparsed = true;
    }
    this.creationSource = JsonNullable.<FeatureFlagChangeEventCreationSource>of(creationSource);
  }

  public FeatureFlagChangeEventAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A readable sentence describing the change, as shown on the flag history page and in the Action
   * column of the CSV export.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FeatureFlagChangeEventAttributes environment(
      FeatureFlagChangeEventEnvironment environment) {
    this.environment = JsonNullable.<FeatureFlagChangeEventEnvironment>of(environment);
    return this;
  }

  /**
   * The environment the change applies to. Null for a change to the flag itself rather than to one
   * environment.
   *
   * @return environment
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public FeatureFlagChangeEventEnvironment getEnvironment() {
    return environment.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<FeatureFlagChangeEventEnvironment> getEnvironment_JsonNullable() {
    return environment;
  }

  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  public void setEnvironment_JsonNullable(
      JsonNullable<FeatureFlagChangeEventEnvironment> environment) {
    this.environment = environment;
  }

  public void setEnvironment(FeatureFlagChangeEventEnvironment environment) {
    this.environment = JsonNullable.<FeatureFlagChangeEventEnvironment>of(environment);
  }

  public FeatureFlagChangeEventAttributes featureFlag(FeatureFlagChangeEventFlag featureFlag) {
    this.featureFlag = featureFlag;
    this.unparsed |= featureFlag.unparsed;
    return this;
  }

  /**
   * The feature flag the change applies to.
   *
   * @return featureFlag
   */
  @JsonProperty(JSON_PROPERTY_FEATURE_FLAG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FeatureFlagChangeEventFlag getFeatureFlag() {
    return featureFlag;
  }

  public void setFeatureFlag(FeatureFlagChangeEventFlag featureFlag) {
    this.featureFlag = featureFlag;
    if (featureFlag != null) {
      this.unparsed |= featureFlag.unparsed;
    }
  }

  public FeatureFlagChangeEventAttributes newValue(String newValue) {
    this.newValue = JsonNullable.<String>of(newValue);
    return this;
  }

  /**
   * The value after the change, serialized as a string.
   *
   * @return newValue
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getNewValue() {
    return newValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NEW_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getNewValue_JsonNullable() {
    return newValue;
  }

  @JsonProperty(JSON_PROPERTY_NEW_VALUE)
  public void setNewValue_JsonNullable(JsonNullable<String> newValue) {
    this.newValue = newValue;
  }

  public void setNewValue(String newValue) {
    this.newValue = JsonNullable.<String>of(newValue);
  }

  public FeatureFlagChangeEventAttributes previousValue(String previousValue) {
    this.previousValue = JsonNullable.<String>of(previousValue);
    return this;
  }

  /**
   * The value before the change, serialized as a string.
   *
   * @return previousValue
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getPreviousValue() {
    return previousValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PREVIOUS_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getPreviousValue_JsonNullable() {
    return previousValue;
  }

  @JsonProperty(JSON_PROPERTY_PREVIOUS_VALUE)
  public void setPreviousValue_JsonNullable(JsonNullable<String> previousValue) {
    this.previousValue = previousValue;
  }

  public void setPreviousValue(String previousValue) {
    this.previousValue = JsonNullable.<String>of(previousValue);
  }

  public FeatureFlagChangeEventAttributes property(FeatureFlagChangeEventProperty property) {
    this.property = property;
    this.unparsed |= !property.isValid();
    return this;
  }

  /**
   * The part of the feature flag the change applies to.
   *
   * @return property
   */
  @JsonProperty(JSON_PROPERTY_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FeatureFlagChangeEventProperty getProperty() {
    return property;
  }

  public void setProperty(FeatureFlagChangeEventProperty property) {
    if (!property.isValid()) {
      this.unparsed = true;
    }
    this.property = property;
  }

  public FeatureFlagChangeEventAttributes suggestionReview(
      FeatureFlagChangeEventSuggestionReview suggestionReview) {
    this.suggestionReview = suggestionReview;
    this.unparsed |= suggestionReview.unparsed;
    return this;
  }

  /**
   * Review details of a change request that needed approval. Present on review events, which <code>
   * include_suggestion_events</code> adds. Also present on a change that an approved change request
   * applied, even when <code>include_suggestion_events</code> is <code>false</code>.
   *
   * @return suggestionReview
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUGGESTION_REVIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FeatureFlagChangeEventSuggestionReview getSuggestionReview() {
    return suggestionReview;
  }

  public void setSuggestionReview(FeatureFlagChangeEventSuggestionReview suggestionReview) {
    this.suggestionReview = suggestionReview;
    if (suggestionReview != null) {
      this.unparsed |= suggestionReview.unparsed;
    }
  }

  public FeatureFlagChangeEventAttributes timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * When the change was made.
   *
   * @return timestamp
   */
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public FeatureFlagChangeEventAttributes userId(String userId) {
    this.userId = JsonNullable.<String>of(userId);
    return this;
  }

  /**
   * The ID of the user who made the change. Null when no user made the change.
   *
   * @return userId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getUserId() {
    return userId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getUserId_JsonNullable() {
    return userId;
  }

  @JsonProperty(JSON_PROPERTY_USER_ID)
  public void setUserId_JsonNullable(JsonNullable<String> userId) {
    this.userId = userId;
  }

  public void setUserId(String userId) {
    this.userId = JsonNullable.<String>of(userId);
  }

  public FeatureFlagChangeEventAttributes versionNumber(Long versionNumber) {
    this.versionNumber = versionNumber;
    return this;
  }

  /**
   * The version of the feature flag the change produced.
   *
   * @return versionNumber
   */
  @JsonProperty(JSON_PROPERTY_VERSION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getVersionNumber() {
    return versionNumber;
  }

  public void setVersionNumber(Long versionNumber) {
    this.versionNumber = versionNumber;
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
   * @return FeatureFlagChangeEventAttributes
   */
  @JsonAnySetter
  public FeatureFlagChangeEventAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FeatureFlagChangeEventAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureFlagChangeEventAttributes featureFlagChangeEventAttributes =
        (FeatureFlagChangeEventAttributes) o;
    return Objects.equals(this.action, featureFlagChangeEventAttributes.action)
        && Objects.equals(this.changeMetadata, featureFlagChangeEventAttributes.changeMetadata)
        && Objects.equals(this.creationSource, featureFlagChangeEventAttributes.creationSource)
        && Objects.equals(this.description, featureFlagChangeEventAttributes.description)
        && Objects.equals(this.environment, featureFlagChangeEventAttributes.environment)
        && Objects.equals(this.featureFlag, featureFlagChangeEventAttributes.featureFlag)
        && Objects.equals(this.newValue, featureFlagChangeEventAttributes.newValue)
        && Objects.equals(this.previousValue, featureFlagChangeEventAttributes.previousValue)
        && Objects.equals(this.property, featureFlagChangeEventAttributes.property)
        && Objects.equals(this.suggestionReview, featureFlagChangeEventAttributes.suggestionReview)
        && Objects.equals(this.timestamp, featureFlagChangeEventAttributes.timestamp)
        && Objects.equals(this.userId, featureFlagChangeEventAttributes.userId)
        && Objects.equals(this.versionNumber, featureFlagChangeEventAttributes.versionNumber)
        && Objects.equals(
            this.additionalProperties, featureFlagChangeEventAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        action,
        changeMetadata,
        creationSource,
        description,
        environment,
        featureFlag,
        newValue,
        previousValue,
        property,
        suggestionReview,
        timestamp,
        userId,
        versionNumber,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureFlagChangeEventAttributes {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    changeMetadata: ").append(toIndentedString(changeMetadata)).append("\n");
    sb.append("    creationSource: ").append(toIndentedString(creationSource)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    featureFlag: ").append(toIndentedString(featureFlag)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
    sb.append("    previousValue: ").append(toIndentedString(previousValue)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    suggestionReview: ").append(toIndentedString(suggestionReview)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
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
