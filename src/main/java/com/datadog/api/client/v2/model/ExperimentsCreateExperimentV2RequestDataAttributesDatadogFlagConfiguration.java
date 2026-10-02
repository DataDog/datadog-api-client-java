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

/** Feature flag, environment, and targeting configuration for a Datadog experiment. */
@JsonPropertyOrder({
  ExperimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfiguration
      .JSON_PROPERTY_ENTRY_POINT,
  ExperimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfiguration
      .JSON_PROPERTY_ENVIRONMENT_ID,
  ExperimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfiguration
      .JSON_PROPERTY_FEATURE_FLAG_ID,
  ExperimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfiguration
      .JSON_PROPERTY_RESET_ON_FEATURE_FLAG_CHANGE,
  ExperimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfiguration
      .JSON_PROPERTY_TARGETING_RULES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfiguration {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENTRY_POINT = "entry_point";
  private ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfigurationEntryPoint
      entryPoint;

  public static final String JSON_PROPERTY_ENVIRONMENT_ID = "environment_id";
  private UUID environmentId;

  public static final String JSON_PROPERTY_FEATURE_FLAG_ID = "feature_flag_id";
  private UUID featureFlagId;

  public static final String JSON_PROPERTY_RESET_ON_FEATURE_FLAG_CHANGE =
      "reset_on_feature_flag_change";
  private Boolean resetOnFeatureFlagChange;

  public static final String JSON_PROPERTY_TARGETING_RULES = "targeting_rules";
  private List<
          ExperimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfigurationTargetingRulesItems>
      targetingRules = new ArrayList<>();

  public ExperimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfiguration() {}

  @JsonCreator
  public ExperimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfiguration(
      @JsonProperty(required = true, value = JSON_PROPERTY_ENTRY_POINT)
          ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfigurationEntryPoint
              entryPoint,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENVIRONMENT_ID) UUID environmentId,
      @JsonProperty(required = true, value = JSON_PROPERTY_FEATURE_FLAG_ID) UUID featureFlagId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGETING_RULES)
          List<
                  ExperimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfigurationTargetingRulesItems>
              targetingRules) {
    this.entryPoint = entryPoint;
    if (entryPoint != null) {
      this.unparsed |= entryPoint.unparsed;
    }
    this.environmentId = environmentId;
    this.featureFlagId = featureFlagId;
    this.targetingRules = targetingRules;
    for (ExperimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfigurationTargetingRulesItems
        item : targetingRules) {
      this.unparsed |= item.unparsed;
    }
  }

  public ExperimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfiguration entryPoint(
      ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfigurationEntryPoint
          entryPoint) {
    this.entryPoint = entryPoint;
    if (entryPoint != null) {
      this.unparsed |= entryPoint.unparsed;
    }
    return this;
  }

  /**
   * Datadog measure and filters used to select analyzed subjects.
   *
   * @return entryPoint
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTRY_POINT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfigurationEntryPoint
      getEntryPoint() {
    return entryPoint;
  }

  public void setEntryPoint(
      ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfigurationEntryPoint
          entryPoint) {
    this.entryPoint = entryPoint;
    if (entryPoint != null) {
      this.unparsed |= entryPoint.unparsed;
    }
  }

  public ExperimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfiguration environmentId(
      UUID environmentId) {
    this.environmentId = environmentId;
    return this;
  }

  /**
   * Identifier of the feature flag environment.
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

  public ExperimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfiguration featureFlagId(
      UUID featureFlagId) {
    this.featureFlagId = featureFlagId;
    return this;
  }

  /**
   * Identifier of the Datadog feature flag used by the experiment.
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

  public ExperimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfiguration
      resetOnFeatureFlagChange(Boolean resetOnFeatureFlagChange) {
    this.resetOnFeatureFlagChange = resetOnFeatureFlagChange;
    return this;
  }

  /**
   * Accepted on create but has no effect.
   *
   * @return resetOnFeatureFlagChange
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESET_ON_FEATURE_FLAG_CHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getResetOnFeatureFlagChange() {
    return resetOnFeatureFlagChange;
  }

  public void setResetOnFeatureFlagChange(Boolean resetOnFeatureFlagChange) {
    this.resetOnFeatureFlagChange = resetOnFeatureFlagChange;
  }

  public ExperimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfiguration targetingRules(
      List<
              ExperimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfigurationTargetingRulesItems>
          targetingRules) {
    this.targetingRules = targetingRules;
    for (ExperimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfigurationTargetingRulesItems
        item : targetingRules) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ExperimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfiguration
      addTargetingRulesItem(
          ExperimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfigurationTargetingRulesItems
              targetingRulesItem) {
    this.targetingRules.add(targetingRulesItem);
    this.unparsed |= targetingRulesItem.unparsed;
    return this;
  }

  /**
   * Use an empty array when no targeting rules apply.
   *
   * @return targetingRules
   */
  @JsonProperty(JSON_PROPERTY_TARGETING_RULES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<
          ExperimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfigurationTargetingRulesItems>
      getTargetingRules() {
    return targetingRules;
  }

  public void setTargetingRules(
      List<
              ExperimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfigurationTargetingRulesItems>
          targetingRules) {
    this.targetingRules = targetingRules;
    if (targetingRules != null) {
      for (ExperimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfigurationTargetingRulesItems
          item : targetingRules) {
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
   * @return ExperimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfiguration
   */
  @JsonAnySetter
  public ExperimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfiguration
      putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this ExperimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfiguration
   * object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfiguration
        experimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfiguration =
            (ExperimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfiguration) o;
    return Objects.equals(
            this.entryPoint,
            experimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfiguration.entryPoint)
        && Objects.equals(
            this.environmentId,
            experimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfiguration
                .environmentId)
        && Objects.equals(
            this.featureFlagId,
            experimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfiguration
                .featureFlagId)
        && Objects.equals(
            this.resetOnFeatureFlagChange,
            experimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfiguration
                .resetOnFeatureFlagChange)
        && Objects.equals(
            this.targetingRules,
            experimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfiguration
                .targetingRules)
        && Objects.equals(
            this.additionalProperties,
            experimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfiguration
                .additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        entryPoint,
        environmentId,
        featureFlagId,
        resetOnFeatureFlagChange,
        targetingRules,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(
        "class ExperimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfiguration {\n");
    sb.append("    entryPoint: ").append(toIndentedString(entryPoint)).append("\n");
    sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
    sb.append("    featureFlagId: ").append(toIndentedString(featureFlagId)).append("\n");
    sb.append("    resetOnFeatureFlagChange: ")
        .append(toIndentedString(resetOnFeatureFlagChange))
        .append("\n");
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
