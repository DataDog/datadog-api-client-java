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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * The flag and environment the bandit serves on, and who it serves there. The server chooses the
 * rule's <code>allocation_key</code>. On create, <code>feature_flag_id</code> and <code>
 * environment_id</code> are required, and <code>null</code> is the same as omitting it. On update,
 * omitted fields are unchanged, and <code>null</code> takes a draft off its flag, which also clears
 * its variants and scheduled end. Moving a draft to another flag clears its variants unless the
 * request sets them. Only a draft can change it.
 */
@JsonPropertyOrder({
  ExperimentsBanditFlagConfigurationInputV2.JSON_PROPERTY_ENVIRONMENT_ID,
  ExperimentsBanditFlagConfigurationInputV2.JSON_PROPERTY_FEATURE_FLAG_ID,
  ExperimentsBanditFlagConfigurationInputV2.JSON_PROPERTY_TARGETING_RULES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsBanditFlagConfigurationInputV2 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENVIRONMENT_ID = "environment_id";
  private UUID environmentId;

  public static final String JSON_PROPERTY_FEATURE_FLAG_ID = "feature_flag_id";
  private UUID featureFlagId;

  public static final String JSON_PROPERTY_TARGETING_RULES = "targeting_rules";
  private List<ExperimentsTargetingRule> targetingRules = null;

  public ExperimentsBanditFlagConfigurationInputV2 environmentId(UUID environmentId) {
    this.environmentId = environmentId;
    return this;
  }

  /**
   * The environment the bandit serves in.
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

  public ExperimentsBanditFlagConfigurationInputV2 featureFlagId(UUID featureFlagId) {
    this.featureFlagId = featureFlagId;
    return this;
  }

  /**
   * The flag the bandit serves through.
   *
   * @return featureFlagId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEATURE_FLAG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getFeatureFlagId() {
    return featureFlagId;
  }

  public void setFeatureFlagId(UUID featureFlagId) {
    this.featureFlagId = featureFlagId;
  }

  public ExperimentsBanditFlagConfigurationInputV2 targetingRules(
      List<ExperimentsTargetingRule> targetingRules) {
    this.targetingRules = targetingRules;
    if (targetingRules != null) {
      for (ExperimentsTargetingRule item : targetingRules) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ExperimentsBanditFlagConfigurationInputV2 addTargetingRulesItem(
      ExperimentsTargetingRule targetingRulesItem) {
    if (this.targetingRules == null) {
      this.targetingRules = new ArrayList<>();
    }
    this.targetingRules.add(targetingRulesItem);
    this.unparsed |= targetingRulesItem.unparsed;
    return this;
  }

  /**
   * Who the bandit serves. When empty, the bandit serves everyone in the environment.
   *
   * @return targetingRules
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGETING_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ExperimentsTargetingRule> getTargetingRules() {
    return targetingRules;
  }

  public void setTargetingRules(List<ExperimentsTargetingRule> targetingRules) {
    this.targetingRules = targetingRules;
    if (targetingRules != null) {
      for (ExperimentsTargetingRule item : targetingRules) {
        this.unparsed |= item.unparsed;
      }
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
   * @return ExperimentsBanditFlagConfigurationInputV2
   */
  @JsonAnySetter
  public ExperimentsBanditFlagConfigurationInputV2 putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExperimentsBanditFlagConfigurationInputV2 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsBanditFlagConfigurationInputV2 experimentsBanditFlagConfigurationInputV2 =
        (ExperimentsBanditFlagConfigurationInputV2) o;
    return Objects.equals(
            this.environmentId, experimentsBanditFlagConfigurationInputV2.environmentId)
        && Objects.equals(
            this.featureFlagId, experimentsBanditFlagConfigurationInputV2.featureFlagId)
        && Objects.equals(
            this.targetingRules, experimentsBanditFlagConfigurationInputV2.targetingRules)
        && Objects.equals(
            this.additionalProperties,
            experimentsBanditFlagConfigurationInputV2.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentId, featureFlagId, targetingRules, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsBanditFlagConfigurationInputV2 {\n");
    sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
    sb.append("    featureFlagId: ").append(toIndentedString(featureFlagId)).append("\n");
    sb.append("    targetingRules: ").append(toIndentedString(targetingRules)).append("\n");
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
