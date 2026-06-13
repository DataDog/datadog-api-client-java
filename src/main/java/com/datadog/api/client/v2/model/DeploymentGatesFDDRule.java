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

/** A faulty deployment detection rule to evaluate as part of a deployment gate evaluation. */
@JsonPropertyOrder({
  DeploymentGatesFDDRule.JSON_PROPERTY_DRY_RUN,
  DeploymentGatesFDDRule.JSON_PROPERTY_NAME,
  DeploymentGatesFDDRule.JSON_PROPERTY_OPTIONS,
  DeploymentGatesFDDRule.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DeploymentGatesFDDRule {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DRY_RUN = "dry_run";
  private Boolean dryRun;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private DeploymentGatesFDDRuleOptions options;

  public static final String JSON_PROPERTY_TYPE = "type";
  private DeploymentGatesFDDRuleType type;

  public DeploymentGatesFDDRule() {}

  @JsonCreator
  public DeploymentGatesFDDRule(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) DeploymentGatesFDDRuleType type) {
    this.name = name;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public DeploymentGatesFDDRule dryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

  /**
   * Rule-level dry run. When enabled, the rule is evaluated normally but it always returns <code>
   * pass</code>. The real result is visible in the Datadog UI.
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

  public DeploymentGatesFDDRule name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Human-readable name for this rule.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DeploymentGatesFDDRule options(DeploymentGatesFDDRuleOptions options) {
    this.options = options;
    this.unparsed |= options.unparsed;
    return this;
  }

  /**
   * Options for a <code>faulty_deployment_detection</code> rule.
   *
   * @return options
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DeploymentGatesFDDRuleOptions getOptions() {
    return options;
  }

  public void setOptions(DeploymentGatesFDDRuleOptions options) {
    this.options = options;
  }

  public DeploymentGatesFDDRule type(DeploymentGatesFDDRuleType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type identifier for a faulty deployment detection rule.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DeploymentGatesFDDRuleType getType() {
    return type;
  }

  public void setType(DeploymentGatesFDDRuleType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return DeploymentGatesFDDRule
   */
  @JsonAnySetter
  public DeploymentGatesFDDRule putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DeploymentGatesFDDRule object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentGatesFDDRule deploymentGatesFddRule = (DeploymentGatesFDDRule) o;
    return Objects.equals(this.dryRun, deploymentGatesFddRule.dryRun)
        && Objects.equals(this.name, deploymentGatesFddRule.name)
        && Objects.equals(this.options, deploymentGatesFddRule.options)
        && Objects.equals(this.type, deploymentGatesFddRule.type)
        && Objects.equals(this.additionalProperties, deploymentGatesFddRule.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dryRun, name, options, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentGatesFDDRule {\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
