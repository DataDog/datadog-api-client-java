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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/** Attributes for creating a flag suggestion. */
@JsonPropertyOrder({
  CreateFlagSuggestionAttributes.JSON_PROPERTY_ACTION,
  CreateFlagSuggestionAttributes.JSON_PROPERTY_COMMENT,
  CreateFlagSuggestionAttributes.JSON_PROPERTY_ENVIRONMENT_ID,
  CreateFlagSuggestionAttributes.JSON_PROPERTY_NOTIFICATION_RULE_TARGETS,
  CreateFlagSuggestionAttributes.JSON_PROPERTY_PROPERTY,
  CreateFlagSuggestionAttributes.JSON_PROPERTY_SUGGESTION,
  CreateFlagSuggestionAttributes.JSON_PROPERTY_SUGGESTION_METADATA
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateFlagSuggestionAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTION = "action";
  private FlagSuggestionAction action;

  public static final String JSON_PROPERTY_COMMENT = "comment";
  private String comment;

  public static final String JSON_PROPERTY_ENVIRONMENT_ID = "environment_id";
  private UUID environmentId;

  public static final String JSON_PROPERTY_NOTIFICATION_RULE_TARGETS = "notification_rule_targets";
  private List<String> notificationRuleTargets = new ArrayList<>();

  public static final String JSON_PROPERTY_PROPERTY = "property";
  private FlagSuggestionProperty property;

  public static final String JSON_PROPERTY_SUGGESTION = "suggestion";
  private String suggestion;

  public static final String JSON_PROPERTY_SUGGESTION_METADATA = "suggestion_metadata";
  private SuggestionMetadata suggestionMetadata;

  public CreateFlagSuggestionAttributes() {}

  @JsonCreator
  public CreateFlagSuggestionAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACTION) FlagSuggestionAction action,
      @JsonProperty(required = true, value = JSON_PROPERTY_NOTIFICATION_RULE_TARGETS)
          List<String> notificationRuleTargets,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROPERTY)
          FlagSuggestionProperty property) {
    this.action = action;
    this.unparsed |= !action.isValid();
    this.notificationRuleTargets = notificationRuleTargets;
    this.property = property;
    this.unparsed |= !property.isValid();
  }

  public CreateFlagSuggestionAttributes action(FlagSuggestionAction action) {
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

  public CreateFlagSuggestionAttributes comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Optional comment explaining the change.
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

  public CreateFlagSuggestionAttributes environmentId(UUID environmentId) {
    this.environmentId = environmentId;
    return this;
  }

  /**
   * The environment ID for environment-scoped changes.
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

  public CreateFlagSuggestionAttributes notificationRuleTargets(
      List<String> notificationRuleTargets) {
    this.notificationRuleTargets = notificationRuleTargets;
    return this;
  }

  public CreateFlagSuggestionAttributes addNotificationRuleTargetsItem(
      String notificationRuleTargetsItem) {
    this.notificationRuleTargets.add(notificationRuleTargetsItem);
    return this;
  }

  /**
   * Notification handles (without @ prefix) to receive approval or rejection notifications. For
   * example, an email address or Slack channel name.
   *
   * @return notificationRuleTargets
   */
  @JsonProperty(JSON_PROPERTY_NOTIFICATION_RULE_TARGETS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getNotificationRuleTargets() {
    return notificationRuleTargets;
  }

  public void setNotificationRuleTargets(List<String> notificationRuleTargets) {
    this.notificationRuleTargets = notificationRuleTargets;
  }

  public CreateFlagSuggestionAttributes property(FlagSuggestionProperty property) {
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

  public CreateFlagSuggestionAttributes suggestion(String suggestion) {
    this.suggestion = suggestion;
    return this;
  }

  /**
   * The suggested new value (empty string for flag-level actions like archive, JSON-encoded for
   * complex properties like allocations).
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

  public CreateFlagSuggestionAttributes suggestionMetadata(SuggestionMetadata suggestionMetadata) {
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
   * @return CreateFlagSuggestionAttributes
   */
  @JsonAnySetter
  public CreateFlagSuggestionAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CreateFlagSuggestionAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFlagSuggestionAttributes createFlagSuggestionAttributes =
        (CreateFlagSuggestionAttributes) o;
    return Objects.equals(this.action, createFlagSuggestionAttributes.action)
        && Objects.equals(this.comment, createFlagSuggestionAttributes.comment)
        && Objects.equals(this.environmentId, createFlagSuggestionAttributes.environmentId)
        && Objects.equals(
            this.notificationRuleTargets, createFlagSuggestionAttributes.notificationRuleTargets)
        && Objects.equals(this.property, createFlagSuggestionAttributes.property)
        && Objects.equals(this.suggestion, createFlagSuggestionAttributes.suggestion)
        && Objects.equals(
            this.suggestionMetadata, createFlagSuggestionAttributes.suggestionMetadata)
        && Objects.equals(
            this.additionalProperties, createFlagSuggestionAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        action,
        comment,
        environmentId,
        notificationRuleTargets,
        property,
        suggestion,
        suggestionMetadata,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFlagSuggestionAttributes {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
    sb.append("    notificationRuleTargets: ")
        .append(toIndentedString(notificationRuleTargets))
        .append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
    sb.append("    suggestionMetadata: ").append(toIndentedString(suggestionMetadata)).append("\n");
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
