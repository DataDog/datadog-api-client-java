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

/**
 * The flag rule the bandit serves through. Absent until a draft is put on a flag, and when the
 * caller lacks feature flag and environment read permissions (<code>meta.warnings</code> then says
 * so).
 */
@JsonPropertyOrder({
  ExperimentsBanditFlagConfigurationV2.JSON_PROPERTY_ALLOCATION_KEY,
  ExperimentsBanditFlagConfigurationV2.JSON_PROPERTY_ENVIRONMENT_ID,
  ExperimentsBanditFlagConfigurationV2.JSON_PROPERTY_FEATURE_FLAG_ID,
  ExperimentsBanditFlagConfigurationV2.JSON_PROPERTY_TARGETING_RULES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsBanditFlagConfigurationV2 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALLOCATION_KEY = "allocation_key";
  private String allocationKey;

  public static final String JSON_PROPERTY_ENVIRONMENT_ID = "environment_id";
  private UUID environmentId;

  public static final String JSON_PROPERTY_FEATURE_FLAG_ID = "feature_flag_id";
  private UUID featureFlagId;

  public static final String JSON_PROPERTY_TARGETING_RULES = "targeting_rules";
  private List<ExperimentsTargetingRule> targetingRules = new ArrayList<>();

  public ExperimentsBanditFlagConfigurationV2() {}

  @JsonCreator
  public ExperimentsBanditFlagConfigurationV2(
      @JsonProperty(required = true, value = JSON_PROPERTY_ALLOCATION_KEY) String allocationKey,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENVIRONMENT_ID) UUID environmentId,
      @JsonProperty(required = true, value = JSON_PROPERTY_FEATURE_FLAG_ID) UUID featureFlagId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGETING_RULES)
          List<ExperimentsTargetingRule> targetingRules) {
    this.allocationKey = allocationKey;
    this.environmentId = environmentId;
    this.featureFlagId = featureFlagId;
    this.targetingRules = targetingRules;
    for (ExperimentsTargetingRule item : targetingRules) {
      this.unparsed |= item.unparsed;
    }
  }

  public ExperimentsBanditFlagConfigurationV2 allocationKey(String allocationKey) {
    this.allocationKey = allocationKey;
    return this;
  }

  /**
   * The key of the bandit's rule on the flag. Exposures log it.
   *
   * @return allocationKey
   */
  @JsonProperty(JSON_PROPERTY_ALLOCATION_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAllocationKey() {
    return allocationKey;
  }

  public void setAllocationKey(String allocationKey) {
    this.allocationKey = allocationKey;
  }

  public ExperimentsBanditFlagConfigurationV2 environmentId(UUID environmentId) {
    this.environmentId = environmentId;
    return this;
  }

  /**
   * The environment the bandit serves in.
   *
   * @return environmentId
   */
  @JsonProperty(JSON_PROPERTY_ENVIRONMENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getEnvironmentId() {
    return environmentId;
  }

  public void setEnvironmentId(UUID environmentId) {
    this.environmentId = environmentId;
  }

  public ExperimentsBanditFlagConfigurationV2 featureFlagId(UUID featureFlagId) {
    this.featureFlagId = featureFlagId;
    return this;
  }

  /**
   * The flag the bandit serves through.
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

  public ExperimentsBanditFlagConfigurationV2 targetingRules(
      List<ExperimentsTargetingRule> targetingRules) {
    this.targetingRules = targetingRules;
    for (ExperimentsTargetingRule item : targetingRules) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ExperimentsBanditFlagConfigurationV2 addTargetingRulesItem(
      ExperimentsTargetingRule targetingRulesItem) {
    this.targetingRules.add(targetingRulesItem);
    this.unparsed |= targetingRulesItem.unparsed;
    return this;
  }

  /**
   * Who the bandit serves. Empty serves everyone in the environment.
   *
   * @return targetingRules
   */
  @JsonProperty(JSON_PROPERTY_TARGETING_RULES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   * @return ExperimentsBanditFlagConfigurationV2
   */
  @JsonAnySetter
  public ExperimentsBanditFlagConfigurationV2 putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExperimentsBanditFlagConfigurationV2 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsBanditFlagConfigurationV2 experimentsBanditFlagConfigurationV2 =
        (ExperimentsBanditFlagConfigurationV2) o;
    return Objects.equals(this.allocationKey, experimentsBanditFlagConfigurationV2.allocationKey)
        && Objects.equals(this.environmentId, experimentsBanditFlagConfigurationV2.environmentId)
        && Objects.equals(this.featureFlagId, experimentsBanditFlagConfigurationV2.featureFlagId)
        && Objects.equals(this.targetingRules, experimentsBanditFlagConfigurationV2.targetingRules)
        && Objects.equals(
            this.additionalProperties, experimentsBanditFlagConfigurationV2.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allocationKey, environmentId, featureFlagId, targetingRules, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsBanditFlagConfigurationV2 {\n");
    sb.append("    allocationKey: ").append(toIndentedString(allocationKey)).append("\n");
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
