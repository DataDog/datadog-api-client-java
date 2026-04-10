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

/** Configuration for the quarantined Flaky Tests Management policy. */
@JsonPropertyOrder({
  TestOptimizationFlakyTestsManagementPoliciesQuarantined.JSON_PROPERTY_AUTO_QUARANTINE_RULE,
  TestOptimizationFlakyTestsManagementPoliciesQuarantined.JSON_PROPERTY_BRANCH_RULE,
  TestOptimizationFlakyTestsManagementPoliciesQuarantined.JSON_PROPERTY_ENABLED,
  TestOptimizationFlakyTestsManagementPoliciesQuarantined.JSON_PROPERTY_FAILURE_RATE_RULE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TestOptimizationFlakyTestsManagementPoliciesQuarantined {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTO_QUARANTINE_RULE = "auto_quarantine_rule";
  private TestOptimizationFlakyTestsManagementPoliciesAutoQuarantineRule autoQuarantineRule;

  public static final String JSON_PROPERTY_BRANCH_RULE = "branch_rule";
  private TestOptimizationFlakyTestsManagementPoliciesBranchRule branchRule;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_FAILURE_RATE_RULE = "failure_rate_rule";
  private TestOptimizationFlakyTestsManagementPoliciesQuarantinedFailureRateRule failureRateRule;

  public TestOptimizationFlakyTestsManagementPoliciesQuarantined autoQuarantineRule(
      TestOptimizationFlakyTestsManagementPoliciesAutoQuarantineRule autoQuarantineRule) {
    this.autoQuarantineRule = autoQuarantineRule;
    this.unparsed |= autoQuarantineRule.unparsed;
    return this;
  }

  /**
   * Automatic quarantine triggering rule based on a time window.
   *
   * @return autoQuarantineRule
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTO_QUARANTINE_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TestOptimizationFlakyTestsManagementPoliciesAutoQuarantineRule getAutoQuarantineRule() {
    return autoQuarantineRule;
  }

  public void setAutoQuarantineRule(
      TestOptimizationFlakyTestsManagementPoliciesAutoQuarantineRule autoQuarantineRule) {
    this.autoQuarantineRule = autoQuarantineRule;
  }

  public TestOptimizationFlakyTestsManagementPoliciesQuarantined branchRule(
      TestOptimizationFlakyTestsManagementPoliciesBranchRule branchRule) {
    this.branchRule = branchRule;
    this.unparsed |= branchRule.unparsed;
    return this;
  }

  /**
   * Branch filtering rule for a Flaky Tests Management policy.
   *
   * @return branchRule
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BRANCH_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TestOptimizationFlakyTestsManagementPoliciesBranchRule getBranchRule() {
    return branchRule;
  }

  public void setBranchRule(TestOptimizationFlakyTestsManagementPoliciesBranchRule branchRule) {
    this.branchRule = branchRule;
  }

  public TestOptimizationFlakyTestsManagementPoliciesQuarantined enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether the quarantined policy is enabled.
   *
   * @return enabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public TestOptimizationFlakyTestsManagementPoliciesQuarantined failureRateRule(
      TestOptimizationFlakyTestsManagementPoliciesQuarantinedFailureRateRule failureRateRule) {
    this.failureRateRule = failureRateRule;
    this.unparsed |= failureRateRule.unparsed;
    return this;
  }

  /**
   * Failure-rate-based rule for the quarantined policy.
   *
   * @return failureRateRule
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILURE_RATE_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TestOptimizationFlakyTestsManagementPoliciesQuarantinedFailureRateRule
      getFailureRateRule() {
    return failureRateRule;
  }

  public void setFailureRateRule(
      TestOptimizationFlakyTestsManagementPoliciesQuarantinedFailureRateRule failureRateRule) {
    this.failureRateRule = failureRateRule;
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
   * @return TestOptimizationFlakyTestsManagementPoliciesQuarantined
   */
  @JsonAnySetter
  public TestOptimizationFlakyTestsManagementPoliciesQuarantined putAdditionalProperty(
      String key, Object value) {
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
   * Return true if this TestOptimizationFlakyTestsManagementPoliciesQuarantined object is equal to
   * o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestOptimizationFlakyTestsManagementPoliciesQuarantined
        testOptimizationFlakyTestsManagementPoliciesQuarantined =
            (TestOptimizationFlakyTestsManagementPoliciesQuarantined) o;
    return Objects.equals(
            this.autoQuarantineRule,
            testOptimizationFlakyTestsManagementPoliciesQuarantined.autoQuarantineRule)
        && Objects.equals(
            this.branchRule, testOptimizationFlakyTestsManagementPoliciesQuarantined.branchRule)
        && Objects.equals(
            this.enabled, testOptimizationFlakyTestsManagementPoliciesQuarantined.enabled)
        && Objects.equals(
            this.failureRateRule,
            testOptimizationFlakyTestsManagementPoliciesQuarantined.failureRateRule)
        && Objects.equals(
            this.additionalProperties,
            testOptimizationFlakyTestsManagementPoliciesQuarantined.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        autoQuarantineRule, branchRule, enabled, failureRateRule, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestOptimizationFlakyTestsManagementPoliciesQuarantined {\n");
    sb.append("    autoQuarantineRule: ").append(toIndentedString(autoQuarantineRule)).append("\n");
    sb.append("    branchRule: ").append(toIndentedString(branchRule)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    failureRateRule: ").append(toIndentedString(failureRateRule)).append("\n");
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
