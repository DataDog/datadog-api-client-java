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

/** Server-generated reference to an experiment action requiring approval. */
@JsonPropertyOrder({
  FeatureFlagSuggestionExperimentAction.JSON_PROPERTY_ACTION,
  FeatureFlagSuggestionExperimentAction.JSON_PROPERTY_EXPERIMENT_ID,
  FeatureFlagSuggestionExperimentAction.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FeatureFlagSuggestionExperimentAction {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTION = "action";
  private String action;

  public static final String JSON_PROPERTY_EXPERIMENT_ID = "experiment_id";
  private UUID experimentId;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public FeatureFlagSuggestionExperimentAction() {}

  @JsonCreator
  public FeatureFlagSuggestionExperimentAction(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACTION) String action,
      @JsonProperty(required = true, value = JSON_PROPERTY_EXPERIMENT_ID) UUID experimentId,
      @JsonProperty(required = true, value = JSON_PROPERTY_VERSION) Long version) {
    this.action = action;
    this.experimentId = experimentId;
    this.version = version;
  }

  public FeatureFlagSuggestionExperimentAction action(String action) {
    this.action = action;
    return this;
  }

  /**
   * The proposed experiment action.
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

  public FeatureFlagSuggestionExperimentAction experimentId(UUID experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  /**
   * The ID of the experiment.
   *
   * @return experimentId
   */
  @JsonProperty(JSON_PROPERTY_EXPERIMENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getExperimentId() {
    return experimentId;
  }

  public void setExperimentId(UUID experimentId) {
    this.experimentId = experimentId;
  }

  public FeatureFlagSuggestionExperimentAction version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the experiment action reference.
   *
   * @return version
   */
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
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
   * @return FeatureFlagSuggestionExperimentAction
   */
  @JsonAnySetter
  public FeatureFlagSuggestionExperimentAction putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FeatureFlagSuggestionExperimentAction object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureFlagSuggestionExperimentAction featureFlagSuggestionExperimentAction =
        (FeatureFlagSuggestionExperimentAction) o;
    return Objects.equals(this.action, featureFlagSuggestionExperimentAction.action)
        && Objects.equals(this.experimentId, featureFlagSuggestionExperimentAction.experimentId)
        && Objects.equals(this.version, featureFlagSuggestionExperimentAction.version)
        && Objects.equals(
            this.additionalProperties, featureFlagSuggestionExperimentAction.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, experimentId, version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureFlagSuggestionExperimentAction {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    experimentId: ").append(toIndentedString(experimentId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
