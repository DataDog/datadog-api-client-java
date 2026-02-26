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

/** Test the rule queries of a rule (rule property is ignored when applied to an existing rule) */
@JsonPropertyOrder({
  SecurityMonitoringRuleTestRequest.JSON_PROPERTY_RULE,
  SecurityMonitoringRuleTestRequest.JSON_PROPERTY_RULE_QUERY_PAYLOADS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringRuleTestRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_RULE = "rule";
  private SecurityMonitoringRuleTestPayload rule;

  public static final String JSON_PROPERTY_RULE_QUERY_PAYLOADS = "ruleQueryPayloads";
  private List<SecurityMonitoringRuleQueryPayload> ruleQueryPayloads = null;

  public SecurityMonitoringRuleTestRequest rule(SecurityMonitoringRuleTestPayload rule) {
    this.rule = rule;
    this.unparsed |= rule.unparsed;
    return this;
  }

  /**
   * Test a rule.
   *
   * @return rule
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringRuleTestPayload getRule() {
    return rule;
  }

  public void setRule(SecurityMonitoringRuleTestPayload rule) {
    this.rule = rule;
  }

  public SecurityMonitoringRuleTestRequest ruleQueryPayloads(
      List<SecurityMonitoringRuleQueryPayload> ruleQueryPayloads) {
    this.ruleQueryPayloads = ruleQueryPayloads;
    for (SecurityMonitoringRuleQueryPayload item : ruleQueryPayloads) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SecurityMonitoringRuleTestRequest addRuleQueryPayloadsItem(
      SecurityMonitoringRuleQueryPayload ruleQueryPayloadsItem) {
    if (this.ruleQueryPayloads == null) {
      this.ruleQueryPayloads = new ArrayList<>();
    }
    this.ruleQueryPayloads.add(ruleQueryPayloadsItem);
    this.unparsed |= ruleQueryPayloadsItem.unparsed;
    return this;
  }

  /**
   * Data payloads used to test rules query with the expected result.
   *
   * @return ruleQueryPayloads
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RULE_QUERY_PAYLOADS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SecurityMonitoringRuleQueryPayload> getRuleQueryPayloads() {
    return ruleQueryPayloads;
  }

  public void setRuleQueryPayloads(List<SecurityMonitoringRuleQueryPayload> ruleQueryPayloads) {
    this.ruleQueryPayloads = ruleQueryPayloads;
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
   * @return SecurityMonitoringRuleTestRequest
   */
  @JsonAnySetter
  public SecurityMonitoringRuleTestRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SecurityMonitoringRuleTestRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringRuleTestRequest securityMonitoringRuleTestRequest =
        (SecurityMonitoringRuleTestRequest) o;
    return Objects.equals(this.rule, securityMonitoringRuleTestRequest.rule)
        && Objects.equals(
            this.ruleQueryPayloads, securityMonitoringRuleTestRequest.ruleQueryPayloads)
        && Objects.equals(
            this.additionalProperties, securityMonitoringRuleTestRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rule, ruleQueryPayloads, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringRuleTestRequest {\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    ruleQueryPayloads: ").append(toIndentedString(ruleQueryPayloads)).append("\n");
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
