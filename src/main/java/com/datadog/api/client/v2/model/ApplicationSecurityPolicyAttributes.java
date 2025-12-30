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

/** A WAF policy. */
@JsonPropertyOrder({
  ApplicationSecurityPolicyAttributes.JSON_PROPERTY_DESCRIPTION,
  ApplicationSecurityPolicyAttributes.JSON_PROPERTY_IS_DEFAULT,
  ApplicationSecurityPolicyAttributes.JSON_PROPERTY_NAME,
  ApplicationSecurityPolicyAttributes.JSON_PROPERTY_PROTECTION_PRESETS,
  ApplicationSecurityPolicyAttributes.JSON_PROPERTY_RULES,
  ApplicationSecurityPolicyAttributes.JSON_PROPERTY_SCOPE,
  ApplicationSecurityPolicyAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ApplicationSecurityPolicyAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_IS_DEFAULT = "isDefault";
  private Boolean isDefault;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PROTECTION_PRESETS = "protectionPresets";
  private List<String> protectionPresets = null;

  public static final String JSON_PROPERTY_RULES = "rules";
  private List<ApplicationSecurityPolicyRuleOverride> rules = null;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private List<ApplicationSecurityPolicyScope> scope = null;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version = 0l;

  public ApplicationSecurityPolicyAttributes() {}

  @JsonCreator
  public ApplicationSecurityPolicyAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.description = description;
    this.name = name;
  }

  public ApplicationSecurityPolicyAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the WAF policy.
   *
   * @return description
   */
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ApplicationSecurityPolicyAttributes isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Make this policy the default policy. The default policy is applied to every services not
   * specifically added to another policy.
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

  public ApplicationSecurityPolicyAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The Name of the WAF policy.
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

  public ApplicationSecurityPolicyAttributes protectionPresets(List<String> protectionPresets) {
    this.protectionPresets = protectionPresets;
    return this;
  }

  public ApplicationSecurityPolicyAttributes addProtectionPresetsItem(
      String protectionPresetsItem) {
    if (this.protectionPresets == null) {
      this.protectionPresets = new ArrayList<>();
    }
    this.protectionPresets.add(protectionPresetsItem);
    return this;
  }

  /**
   * Presets enabled on this policy.
   *
   * @return protectionPresets
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROTECTION_PRESETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getProtectionPresets() {
    return protectionPresets;
  }

  public void setProtectionPresets(List<String> protectionPresets) {
    this.protectionPresets = protectionPresets;
  }

  public ApplicationSecurityPolicyAttributes rules(
      List<ApplicationSecurityPolicyRuleOverride> rules) {
    this.rules = rules;
    for (ApplicationSecurityPolicyRuleOverride item : rules) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ApplicationSecurityPolicyAttributes addRulesItem(
      ApplicationSecurityPolicyRuleOverride rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    this.unparsed |= rulesItem.unparsed;
    return this;
  }

  /**
   * Rule overrides applied by the policy.
   *
   * @return rules
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ApplicationSecurityPolicyRuleOverride> getRules() {
    return rules;
  }

  public void setRules(List<ApplicationSecurityPolicyRuleOverride> rules) {
    this.rules = rules;
  }

  public ApplicationSecurityPolicyAttributes scope(List<ApplicationSecurityPolicyScope> scope) {
    this.scope = scope;
    for (ApplicationSecurityPolicyScope item : scope) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ApplicationSecurityPolicyAttributes addScopeItem(
      ApplicationSecurityPolicyScope scopeItem) {
    if (this.scope == null) {
      this.scope = new ArrayList<>();
    }
    this.scope.add(scopeItem);
    this.unparsed |= scopeItem.unparsed;
    return this;
  }

  /**
   * The scope of the WAF policy.
   *
   * @return scope
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ApplicationSecurityPolicyScope> getScope() {
    return scope;
  }

  public void setScope(List<ApplicationSecurityPolicyScope> scope) {
    this.scope = scope;
  }

  public ApplicationSecurityPolicyAttributes version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * Version of the WAF ruleset maintained by Datadog used by this policy. 0 is the default value.
   *
   * @return version
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * @return ApplicationSecurityPolicyAttributes
   */
  @JsonAnySetter
  public ApplicationSecurityPolicyAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ApplicationSecurityPolicyAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationSecurityPolicyAttributes applicationSecurityPolicyAttributes =
        (ApplicationSecurityPolicyAttributes) o;
    return Objects.equals(this.description, applicationSecurityPolicyAttributes.description)
        && Objects.equals(this.isDefault, applicationSecurityPolicyAttributes.isDefault)
        && Objects.equals(this.name, applicationSecurityPolicyAttributes.name)
        && Objects.equals(
            this.protectionPresets, applicationSecurityPolicyAttributes.protectionPresets)
        && Objects.equals(this.rules, applicationSecurityPolicyAttributes.rules)
        && Objects.equals(this.scope, applicationSecurityPolicyAttributes.scope)
        && Objects.equals(this.version, applicationSecurityPolicyAttributes.version)
        && Objects.equals(
            this.additionalProperties, applicationSecurityPolicyAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        description,
        isDefault,
        name,
        protectionPresets,
        rules,
        scope,
        version,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationSecurityPolicyAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    protectionPresets: ").append(toIndentedString(protectionPresets)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
