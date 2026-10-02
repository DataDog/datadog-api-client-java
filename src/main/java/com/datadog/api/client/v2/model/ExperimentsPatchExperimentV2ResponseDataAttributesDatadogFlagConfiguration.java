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

/** Feature flag, environment, and targeting configuration for the experiment. */
@JsonPropertyOrder({
  ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfiguration
      .JSON_PROPERTY_ALLOCATION_KEY,
  ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfiguration
      .JSON_PROPERTY_ENTRY_POINT,
  ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfiguration
      .JSON_PROPERTY_ENVIRONMENT_ID,
  ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfiguration
      .JSON_PROPERTY_FEATURE_FLAG_ID,
  ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfiguration
      .JSON_PROPERTY_TARGETING_RULES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfiguration {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALLOCATION_KEY = "allocation_key";
  private String allocationKey;

  public static final String JSON_PROPERTY_ENTRY_POINT = "entry_point";
  private ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfigurationEntryPoint
      entryPoint;

  public static final String JSON_PROPERTY_ENVIRONMENT_ID = "environment_id";
  private String environmentId;

  public static final String JSON_PROPERTY_FEATURE_FLAG_ID = "feature_flag_id";
  private String featureFlagId;

  public static final String JSON_PROPERTY_TARGETING_RULES = "targeting_rules";
  private List<
          ExperimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfigurationTargetingRulesItems>
      targetingRules = null;

  public ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfiguration() {}

  @JsonCreator
  public ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfiguration(
      @JsonProperty(required = true, value = JSON_PROPERTY_ENTRY_POINT)
          ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfigurationEntryPoint
              entryPoint) {
    this.entryPoint = entryPoint;
    if (entryPoint != null) {
      this.unparsed |= entryPoint.unparsed;
    }
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfiguration allocationKey(
      String allocationKey) {
    this.allocationKey = allocationKey;
    return this;
  }

  /**
   * Key of the feature flag allocation linked to the experiment.
   *
   * @return allocationKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOCATION_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAllocationKey() {
    return allocationKey;
  }

  public void setAllocationKey(String allocationKey) {
    this.allocationKey = allocationKey;
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfiguration entryPoint(
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

  public ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfiguration environmentId(
      String environmentId) {
    this.environmentId = environmentId;
    return this;
  }

  /**
   * ID of the feature flag environment used by the experiment.
   *
   * @return environmentId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENVIRONMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEnvironmentId() {
    return environmentId;
  }

  public void setEnvironmentId(String environmentId) {
    this.environmentId = environmentId;
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfiguration featureFlagId(
      String featureFlagId) {
    this.featureFlagId = featureFlagId;
    return this;
  }

  /**
   * ID of the feature flag linked to the experiment.
   *
   * @return featureFlagId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEATURE_FLAG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFeatureFlagId() {
    return featureFlagId;
  }

  public void setFeatureFlagId(String featureFlagId) {
    this.featureFlagId = featureFlagId;
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfiguration targetingRules(
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
    return this;
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfiguration
      addTargetingRulesItem(
          ExperimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfigurationTargetingRulesItems
              targetingRulesItem) {
    if (this.targetingRules == null) {
      this.targetingRules = new ArrayList<>();
    }
    this.targetingRules.add(targetingRulesItem);
    this.unparsed |= targetingRulesItem.unparsed;
    return this;
  }

  /**
   * Rules that select subjects for the experiment.
   *
   * @return targetingRules
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGETING_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * @return ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfiguration
   */
  @JsonAnySetter
  public ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfiguration
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
   * Return true if this ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfiguration
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
    ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfiguration
        experimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfiguration =
            (ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfiguration) o;
    return Objects.equals(
            this.allocationKey,
            experimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfiguration
                .allocationKey)
        && Objects.equals(
            this.entryPoint,
            experimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfiguration.entryPoint)
        && Objects.equals(
            this.environmentId,
            experimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfiguration
                .environmentId)
        && Objects.equals(
            this.featureFlagId,
            experimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfiguration
                .featureFlagId)
        && Objects.equals(
            this.targetingRules,
            experimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfiguration
                .targetingRules)
        && Objects.equals(
            this.additionalProperties,
            experimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfiguration
                .additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allocationKey,
        entryPoint,
        environmentId,
        featureFlagId,
        targetingRules,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(
        "class ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfiguration {\n");
    sb.append("    allocationKey: ").append(toIndentedString(allocationKey)).append("\n");
    sb.append("    entryPoint: ").append(toIndentedString(entryPoint)).append("\n");
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
