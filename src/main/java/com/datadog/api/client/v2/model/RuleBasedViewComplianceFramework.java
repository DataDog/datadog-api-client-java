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

/** Compliance framework mapping for a rule. */
@JsonPropertyOrder({
  RuleBasedViewComplianceFramework.JSON_PROPERTY_CONTROL,
  RuleBasedViewComplianceFramework.JSON_PROPERTY_FRAMEWORK,
  RuleBasedViewComplianceFramework.JSON_PROPERTY_IS_DEFAULT,
  RuleBasedViewComplianceFramework.JSON_PROPERTY_MESSAGE,
  RuleBasedViewComplianceFramework.JSON_PROPERTY_REQUIREMENT,
  RuleBasedViewComplianceFramework.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RuleBasedViewComplianceFramework {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONTROL = "control";
  private String control;

  public static final String JSON_PROPERTY_FRAMEWORK = "framework";
  private String framework;

  public static final String JSON_PROPERTY_IS_DEFAULT = "is_default";
  private Boolean isDefault;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_REQUIREMENT = "requirement";
  private String requirement;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public RuleBasedViewComplianceFramework control(String control) {
    this.control = control;
    return this;
  }

  /**
   * Identifier of the control inside the requirement.
   *
   * @return control
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTROL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getControl() {
    return control;
  }

  public void setControl(String control) {
    this.control = control;
  }

  public RuleBasedViewComplianceFramework framework(String framework) {
    this.framework = framework;
    return this;
  }

  /**
   * Handle of the compliance framework.
   *
   * @return framework
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FRAMEWORK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFramework() {
    return framework;
  }

  public void setFramework(String framework) {
    this.framework = framework;
  }

  public RuleBasedViewComplianceFramework isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Whether the framework is a Datadog default framework. <code>true</code> indicates a Datadog
   * framework and <code>false</code> indicates a custom framework.
   *
   * @return isDefault
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public RuleBasedViewComplianceFramework message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Optional message describing the framework mapping for the rule.
   *
   * @return message
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public RuleBasedViewComplianceFramework requirement(String requirement) {
    this.requirement = requirement;
    return this;
  }

  /**
   * Name of the requirement that contains the control.
   *
   * @return requirement
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUIREMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRequirement() {
    return requirement;
  }

  public void setRequirement(String requirement) {
    this.requirement = requirement;
  }

  public RuleBasedViewComplianceFramework version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Version of the compliance framework.
   *
   * @return version
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
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
   * @return RuleBasedViewComplianceFramework
   */
  @JsonAnySetter
  public RuleBasedViewComplianceFramework putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RuleBasedViewComplianceFramework object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleBasedViewComplianceFramework ruleBasedViewComplianceFramework =
        (RuleBasedViewComplianceFramework) o;
    return Objects.equals(this.control, ruleBasedViewComplianceFramework.control)
        && Objects.equals(this.framework, ruleBasedViewComplianceFramework.framework)
        && Objects.equals(this.isDefault, ruleBasedViewComplianceFramework.isDefault)
        && Objects.equals(this.message, ruleBasedViewComplianceFramework.message)
        && Objects.equals(this.requirement, ruleBasedViewComplianceFramework.requirement)
        && Objects.equals(this.version, ruleBasedViewComplianceFramework.version)
        && Objects.equals(
            this.additionalProperties, ruleBasedViewComplianceFramework.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        control, framework, isDefault, message, requirement, version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleBasedViewComplianceFramework {\n");
    sb.append("    control: ").append(toIndentedString(control)).append("\n");
    sb.append("    framework: ").append(toIndentedString(framework)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    requirement: ").append(toIndentedString(requirement)).append("\n");
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
