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

/**
 * Inline rule definitions for a deployment gate evaluation. When provided, rules are evaluated
 * directly from this configuration instead of using the preconfigured gate rules. At least one rule
 * is required.
 */
@JsonPropertyOrder({
  DeploymentGatesEvaluationConfiguration.JSON_PROPERTY_DRY_RUN,
  DeploymentGatesEvaluationConfiguration.JSON_PROPERTY_RULES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DeploymentGatesEvaluationConfiguration {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DRY_RUN = "dry_run";
  private Boolean dryRun;

  public static final String JSON_PROPERTY_RULES = "rules";
  private List<DeploymentGatesEvaluationRule> rules = new ArrayList<>();

  public DeploymentGatesEvaluationConfiguration() {}

  @JsonCreator
  public DeploymentGatesEvaluationConfiguration(
      @JsonProperty(required = true, value = JSON_PROPERTY_RULES)
          List<DeploymentGatesEvaluationRule> rules) {
    this.rules = rules;
  }

  public DeploymentGatesEvaluationConfiguration dryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

  /**
   * Gate-level dry run. When enabled, the rules are evaluated normally but the gate always returns
   * <code>pass</code>. The real result is visible in the Datadog UI.
   *
   * @return dryRun
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DRY_RUN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDryRun() {
    return dryRun;
  }

  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }

  public DeploymentGatesEvaluationConfiguration rules(List<DeploymentGatesEvaluationRule> rules) {
    this.rules = rules;
    for (DeploymentGatesEvaluationRule item : rules) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public DeploymentGatesEvaluationConfiguration addRulesItem(
      DeploymentGatesEvaluationRule rulesItem) {
    this.rules.add(rulesItem);
    this.unparsed |= rulesItem.unparsed;
    return this;
  }

  /**
   * The list of rules to evaluate. At least one rule is required.
   *
   * @return rules
   */
  @JsonProperty(JSON_PROPERTY_RULES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<DeploymentGatesEvaluationRule> getRules() {
    return rules;
  }

  public void setRules(List<DeploymentGatesEvaluationRule> rules) {
    this.rules = rules;
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
   * @return DeploymentGatesEvaluationConfiguration
   */
  @JsonAnySetter
  public DeploymentGatesEvaluationConfiguration putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DeploymentGatesEvaluationConfiguration object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentGatesEvaluationConfiguration deploymentGatesEvaluationConfiguration =
        (DeploymentGatesEvaluationConfiguration) o;
    return Objects.equals(this.dryRun, deploymentGatesEvaluationConfiguration.dryRun)
        && Objects.equals(this.rules, deploymentGatesEvaluationConfiguration.rules)
        && Objects.equals(
            this.additionalProperties, deploymentGatesEvaluationConfiguration.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dryRun, rules, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentGatesEvaluationConfiguration {\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
