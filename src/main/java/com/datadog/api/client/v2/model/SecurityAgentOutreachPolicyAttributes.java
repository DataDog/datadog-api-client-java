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
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes of the organization's outreach policy. */
@JsonPropertyOrder({
  SecurityAgentOutreachPolicyAttributes.JSON_PROPERTY_ALLOWED_DOMAINS,
  SecurityAgentOutreachPolicyAttributes.JSON_PROPERTY_MODE,
  SecurityAgentOutreachPolicyAttributes.JSON_PROPERTY_RULES,
  SecurityAgentOutreachPolicyAttributes.JSON_PROPERTY_SUGGESTED_DOMAINS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityAgentOutreachPolicyAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALLOWED_DOMAINS = "allowed_domains";
  private JsonNullable<List<String>> allowedDomains = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_MODE = "mode";
  private SecurityAgentOutreachMode mode;

  public static final String JSON_PROPERTY_RULES = "rules";
  private JsonNullable<List<SecurityAgentOutreachRule>> rules =
      JsonNullable.<List<SecurityAgentOutreachRule>>undefined();

  public static final String JSON_PROPERTY_SUGGESTED_DOMAINS = "suggested_domains";
  private JsonNullable<List<String>> suggestedDomains = JsonNullable.<List<String>>undefined();

  public SecurityAgentOutreachPolicyAttributes() {}

  @JsonCreator
  public SecurityAgentOutreachPolicyAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_MODE) SecurityAgentOutreachMode mode) {
    this.mode = mode;
    this.unparsed |= !mode.isValid();
  }

  public SecurityAgentOutreachPolicyAttributes allowedDomains(List<String> allowedDomains) {
    this.allowedDomains = JsonNullable.<List<String>>of(allowedDomains);
    return this;
  }

  public SecurityAgentOutreachPolicyAttributes addAllowedDomainsItem(String allowedDomainsItem) {
    if (this.allowedDomains == null || !this.allowedDomains.isPresent()) {
      this.allowedDomains = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.allowedDomains.get().add(allowedDomainsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Email domains user outreach can be sent to, at most 20. <code>null</code> when none are
   * allowed.
   *
   * @return allowedDomains
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<String> getAllowedDomains() {
    return allowedDomains.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ALLOWED_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getAllowedDomains_JsonNullable() {
    return allowedDomains;
  }

  @JsonProperty(JSON_PROPERTY_ALLOWED_DOMAINS)
  public void setAllowedDomains_JsonNullable(JsonNullable<List<String>> allowedDomains) {
    this.allowedDomains = allowedDomains;
  }

  public void setAllowedDomains(List<String> allowedDomains) {
    this.allowedDomains = JsonNullable.<List<String>>of(allowedDomains);
  }

  public SecurityAgentOutreachPolicyAttributes mode(SecurityAgentOutreachMode mode) {
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    return this;
  }

  /**
   * The organization's outreach mode. <code>off</code> disables user outreach. <code>manual</code>
   * only sends outreach an analyst triggers. <code>automated</code> auto-sends automated interviews
   * for rules with outreach enabled, to users whose email domain is allowed.
   *
   * @return mode
   */
  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityAgentOutreachMode getMode() {
    return mode;
  }

  public void setMode(SecurityAgentOutreachMode mode) {
    if (!mode.isValid()) {
      this.unparsed = true;
    }
    this.mode = mode;
  }

  public SecurityAgentOutreachPolicyAttributes rules(List<SecurityAgentOutreachRule> rules) {
    this.rules = JsonNullable.<List<SecurityAgentOutreachRule>>of(rules);
    return this;
  }

  public SecurityAgentOutreachPolicyAttributes addRulesItem(SecurityAgentOutreachRule rulesItem) {
    if (this.rules == null || !this.rules.isPresent()) {
      this.rules = JsonNullable.<List<SecurityAgentOutreachRule>>of(new ArrayList<>());
    }
    try {
      this.rules.get().add(rulesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The stored per-rule automation state, including rules that are explicitly disabled. <code>null
   * </code> when the organization has no stored rule state.
   *
   * @return rules
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<SecurityAgentOutreachRule> getRules() {
    return rules.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<SecurityAgentOutreachRule>> getRules_JsonNullable() {
    return rules;
  }

  @JsonProperty(JSON_PROPERTY_RULES)
  public void setRules_JsonNullable(JsonNullable<List<SecurityAgentOutreachRule>> rules) {
    this.rules = rules;
  }

  public void setRules(List<SecurityAgentOutreachRule> rules) {
    this.rules = JsonNullable.<List<SecurityAgentOutreachRule>>of(rules);
  }

  public SecurityAgentOutreachPolicyAttributes suggestedDomains(List<String> suggestedDomains) {
    this.suggestedDomains = JsonNullable.<List<String>>of(suggestedDomains);
    return this;
  }

  public SecurityAgentOutreachPolicyAttributes addSuggestedDomainsItem(
      String suggestedDomainsItem) {
    if (this.suggestedDomains == null || !this.suggestedDomains.isPresent()) {
      this.suggestedDomains = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.suggestedDomains.get().add(suggestedDomainsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Domains the caller could allow next: their own email domain when it is not allowed yet and is
   * not a consumer mailbox provider. Read-only, never stored. <code>null</code> when there is no
   * suggestion.
   *
   * @return suggestedDomains
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<String> getSuggestedDomains() {
    return suggestedDomains.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUGGESTED_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getSuggestedDomains_JsonNullable() {
    return suggestedDomains;
  }

  @JsonProperty(JSON_PROPERTY_SUGGESTED_DOMAINS)
  public void setSuggestedDomains_JsonNullable(JsonNullable<List<String>> suggestedDomains) {
    this.suggestedDomains = suggestedDomains;
  }

  public void setSuggestedDomains(List<String> suggestedDomains) {
    this.suggestedDomains = JsonNullable.<List<String>>of(suggestedDomains);
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
   * @return SecurityAgentOutreachPolicyAttributes
   */
  @JsonAnySetter
  public SecurityAgentOutreachPolicyAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SecurityAgentOutreachPolicyAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityAgentOutreachPolicyAttributes securityAgentOutreachPolicyAttributes =
        (SecurityAgentOutreachPolicyAttributes) o;
    return Objects.equals(this.allowedDomains, securityAgentOutreachPolicyAttributes.allowedDomains)
        && Objects.equals(this.mode, securityAgentOutreachPolicyAttributes.mode)
        && Objects.equals(this.rules, securityAgentOutreachPolicyAttributes.rules)
        && Objects.equals(
            this.suggestedDomains, securityAgentOutreachPolicyAttributes.suggestedDomains)
        && Objects.equals(
            this.additionalProperties, securityAgentOutreachPolicyAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedDomains, mode, rules, suggestedDomains, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityAgentOutreachPolicyAttributes {\n");
    sb.append("    allowedDomains: ").append(toIndentedString(allowedDomains)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    suggestedDomains: ").append(toIndentedString(suggestedDomains)).append("\n");
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
