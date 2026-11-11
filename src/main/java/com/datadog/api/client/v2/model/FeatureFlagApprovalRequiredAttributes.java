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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/** The change to submit for approval. */
@JsonPropertyOrder({
  FeatureFlagApprovalRequiredAttributes.JSON_PROPERTY_ACTION,
  FeatureFlagApprovalRequiredAttributes.JSON_PROPERTY_ENVIRONMENT_ID,
  FeatureFlagApprovalRequiredAttributes.JSON_PROPERTY_PROPERTY,
  FeatureFlagApprovalRequiredAttributes.JSON_PROPERTY_SUGGESTION,
  FeatureFlagApprovalRequiredAttributes.JSON_PROPERTY_SUGGESTION_METADATA
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FeatureFlagApprovalRequiredAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTION = "action";
  private String action;

  public static final String JSON_PROPERTY_ENVIRONMENT_ID = "environment_id";
  private UUID environmentId;

  public static final String JSON_PROPERTY_PROPERTY = "property";
  private String property;

  public static final String JSON_PROPERTY_SUGGESTION = "suggestion";
  private String suggestion;

  public static final String JSON_PROPERTY_SUGGESTION_METADATA = "suggestion_metadata";
  private FeatureFlagSuggestionMetadata suggestionMetadata;

  public FeatureFlagApprovalRequiredAttributes() {}

  @JsonCreator
  public FeatureFlagApprovalRequiredAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACTION) String action,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROPERTY) String property,
      @JsonProperty(required = true, value = JSON_PROPERTY_SUGGESTION) String suggestion) {
    this.action = action;
    this.property = property;
    this.suggestion = suggestion;
  }

  public FeatureFlagApprovalRequiredAttributes action(String action) {
    this.action = action;
    return this;
  }

  /**
   * The proposed action.
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

  public FeatureFlagApprovalRequiredAttributes environmentId(UUID environmentId) {
    this.environmentId = environmentId;
    return this;
  }

  /**
   * The ID of the environment targeted by the change.
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

  public FeatureFlagApprovalRequiredAttributes property(String property) {
    this.property = property;
    return this;
  }

  /**
   * The feature flag property to change.
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

  public FeatureFlagApprovalRequiredAttributes suggestion(String suggestion) {
    this.suggestion = suggestion;
    return this;
  }

  /**
   * The proposed value, serialized as a string. Allocation sets are JSON-encoded strings.
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

  public FeatureFlagApprovalRequiredAttributes suggestionMetadata(
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
   * @return FeatureFlagApprovalRequiredAttributes
   */
  @JsonAnySetter
  public FeatureFlagApprovalRequiredAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FeatureFlagApprovalRequiredAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureFlagApprovalRequiredAttributes featureFlagApprovalRequiredAttributes =
        (FeatureFlagApprovalRequiredAttributes) o;
    return Objects.equals(this.action, featureFlagApprovalRequiredAttributes.action)
        && Objects.equals(this.environmentId, featureFlagApprovalRequiredAttributes.environmentId)
        && Objects.equals(this.property, featureFlagApprovalRequiredAttributes.property)
        && Objects.equals(this.suggestion, featureFlagApprovalRequiredAttributes.suggestion)
        && Objects.equals(
            this.suggestionMetadata, featureFlagApprovalRequiredAttributes.suggestionMetadata)
        && Objects.equals(
            this.additionalProperties, featureFlagApprovalRequiredAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        action, environmentId, property, suggestion, suggestionMetadata, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureFlagApprovalRequiredAttributes {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
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
