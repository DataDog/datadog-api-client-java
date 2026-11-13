/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * Metadata associated with a suggestion. Fields other than <code>variant_id</code> are set by the
 * server.
 */
@JsonPropertyOrder({
  FeatureFlagSuggestionMetadata.JSON_PROPERTY_ALLOW_DRAFT_REORDER,
  FeatureFlagSuggestionMetadata.JSON_PROPERTY_EXPERIMENT_ACTION,
  FeatureFlagSuggestionMetadata.JSON_PROPERTY_EXPERIMENT_ACTION_REQUEST_FINGERPRINT,
  FeatureFlagSuggestionMetadata.JSON_PROPERTY_VARIANT_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FeatureFlagSuggestionMetadata {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALLOW_DRAFT_REORDER = "allow_draft_reorder";
  private Boolean allowDraftReorder;

  public static final String JSON_PROPERTY_EXPERIMENT_ACTION = "experiment_action";
  private FeatureFlagSuggestionExperimentAction experimentAction;

  public static final String JSON_PROPERTY_EXPERIMENT_ACTION_REQUEST_FINGERPRINT =
      "experiment_action_request_fingerprint";
  private String experimentActionRequestFingerprint;

  public static final String JSON_PROPERTY_VARIANT_ID = "variant_id";
  private UUID variantId;

  public FeatureFlagSuggestionMetadata allowDraftReorder(Boolean allowDraftReorder) {
    this.allowDraftReorder = allowDraftReorder;
    return this;
  }

  /**
   * Whether the server allows this allocation suggestion to reorder persisted drafts.
   *
   * @return allowDraftReorder
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_DRAFT_REORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAllowDraftReorder() {
    return allowDraftReorder;
  }

  public void setAllowDraftReorder(Boolean allowDraftReorder) {
    this.allowDraftReorder = allowDraftReorder;
  }

  public FeatureFlagSuggestionMetadata experimentAction(
      FeatureFlagSuggestionExperimentAction experimentAction) {
    this.experimentAction = experimentAction;
    this.unparsed |= experimentAction.unparsed;
    return this;
  }

  /**
   * Server-generated reference to an experiment action requiring approval.
   *
   * @return experimentAction
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPERIMENT_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FeatureFlagSuggestionExperimentAction getExperimentAction() {
    return experimentAction;
  }

  public void setExperimentAction(FeatureFlagSuggestionExperimentAction experimentAction) {
    this.experimentAction = experimentAction;
    if (experimentAction != null) {
      this.unparsed |= experimentAction.unparsed;
    }
  }

  public FeatureFlagSuggestionMetadata experimentActionRequestFingerprint(
      String experimentActionRequestFingerprint) {
    this.experimentActionRequestFingerprint = experimentActionRequestFingerprint;
    return this;
  }

  /**
   * Server-generated fingerprint of the experiment action request.
   *
   * @return experimentActionRequestFingerprint
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPERIMENT_ACTION_REQUEST_FINGERPRINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getExperimentActionRequestFingerprint() {
    return experimentActionRequestFingerprint;
  }

  public void setExperimentActionRequestFingerprint(String experimentActionRequestFingerprint) {
    this.experimentActionRequestFingerprint = experimentActionRequestFingerprint;
  }

  public FeatureFlagSuggestionMetadata variantId(UUID variantId) {
    this.variantId = variantId;
    return this;
  }

  /**
   * The ID of the variant targeted by the suggestion.
   *
   * @return variantId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VARIANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getVariantId() {
    return variantId;
  }

  public void setVariantId(UUID variantId) {
    this.variantId = variantId;
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
   * @return FeatureFlagSuggestionMetadata
   */
  @JsonAnySetter
  public FeatureFlagSuggestionMetadata putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FeatureFlagSuggestionMetadata object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureFlagSuggestionMetadata featureFlagSuggestionMetadata = (FeatureFlagSuggestionMetadata) o;
    return Objects.equals(this.allowDraftReorder, featureFlagSuggestionMetadata.allowDraftReorder)
        && Objects.equals(this.experimentAction, featureFlagSuggestionMetadata.experimentAction)
        && Objects.equals(
            this.experimentActionRequestFingerprint,
            featureFlagSuggestionMetadata.experimentActionRequestFingerprint)
        && Objects.equals(this.variantId, featureFlagSuggestionMetadata.variantId)
        && Objects.equals(
            this.additionalProperties, featureFlagSuggestionMetadata.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allowDraftReorder,
        experimentAction,
        experimentActionRequestFingerprint,
        variantId,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureFlagSuggestionMetadata {\n");
    sb.append("    allowDraftReorder: ").append(toIndentedString(allowDraftReorder)).append("\n");
    sb.append("    experimentAction: ").append(toIndentedString(experimentAction)).append("\n");
    sb.append("    experimentActionRequestFingerprint: ")
        .append(toIndentedString(experimentActionRequestFingerprint))
        .append("\n");
    sb.append("    variantId: ").append(toIndentedString(variantId)).append("\n");
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
