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

/** Failure-rate-based rule for the disabled policy. */
@JsonPropertyOrder({
  TestOptimizationFlakyTestsManagementPoliciesDisabledFailureRateRule.JSON_PROPERTY_BRANCHES,
  TestOptimizationFlakyTestsManagementPoliciesDisabledFailureRateRule.JSON_PROPERTY_ENABLED,
  TestOptimizationFlakyTestsManagementPoliciesDisabledFailureRateRule.JSON_PROPERTY_MIN_RUNS,
  TestOptimizationFlakyTestsManagementPoliciesDisabledFailureRateRule.JSON_PROPERTY_STATUS,
  TestOptimizationFlakyTestsManagementPoliciesDisabledFailureRateRule.JSON_PROPERTY_THRESHOLD
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TestOptimizationFlakyTestsManagementPoliciesDisabledFailureRateRule {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BRANCHES = "branches";
  private List<String> branches = null;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_MIN_RUNS = "min_runs";
  private Long minRuns;

  public static final String JSON_PROPERTY_STATUS = "status";
  private TestOptimizationFlakyTestsManagementPoliciesDisabledStatus status;

  public static final String JSON_PROPERTY_THRESHOLD = "threshold";
  private Double threshold;

  public TestOptimizationFlakyTestsManagementPoliciesDisabledFailureRateRule branches(
      List<String> branches) {
    this.branches = branches;
    return this;
  }

  public TestOptimizationFlakyTestsManagementPoliciesDisabledFailureRateRule addBranchesItem(
      String branchesItem) {
    if (this.branches == null) {
      this.branches = new ArrayList<>();
    }
    this.branches.add(branchesItem);
    return this;
  }

  /**
   * List of branches to which this rule applies.
   *
   * @return branches
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BRANCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getBranches() {
    return branches;
  }

  public void setBranches(List<String> branches) {
    this.branches = branches;
  }

  public TestOptimizationFlakyTestsManagementPoliciesDisabledFailureRateRule enabled(
      Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether this failure rate rule is enabled.
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

  public TestOptimizationFlakyTestsManagementPoliciesDisabledFailureRateRule minRuns(Long minRuns) {
    this.minRuns = minRuns;
    return this;
  }

  /**
   * Minimum number of runs required before the rule is evaluated. Must be greater than or equal to
   * 0.
   *
   * @return minRuns
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN_RUNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMinRuns() {
    return minRuns;
  }

  public void setMinRuns(Long minRuns) {
    this.minRuns = minRuns;
  }

  public TestOptimizationFlakyTestsManagementPoliciesDisabledFailureRateRule status(
      TestOptimizationFlakyTestsManagementPoliciesDisabledStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * Test status that the disable policy applies to. Must be either <code>active</code> or <code>
   * quarantined</code>.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TestOptimizationFlakyTestsManagementPoliciesDisabledStatus getStatus() {
    return status;
  }

  public void setStatus(TestOptimizationFlakyTestsManagementPoliciesDisabledStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public TestOptimizationFlakyTestsManagementPoliciesDisabledFailureRateRule threshold(
      Double threshold) {
    this.threshold = threshold;
    return this;
  }

  /**
   * Failure rate threshold (0.0–1.0) above which the rule triggers.
   *
   * @return threshold
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getThreshold() {
    return threshold;
  }

  public void setThreshold(Double threshold) {
    this.threshold = threshold;
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
   * @return TestOptimizationFlakyTestsManagementPoliciesDisabledFailureRateRule
   */
  @JsonAnySetter
  public TestOptimizationFlakyTestsManagementPoliciesDisabledFailureRateRule putAdditionalProperty(
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
   * Return true if this TestOptimizationFlakyTestsManagementPoliciesDisabledFailureRateRule object
   * is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestOptimizationFlakyTestsManagementPoliciesDisabledFailureRateRule
        testOptimizationFlakyTestsManagementPoliciesDisabledFailureRateRule =
            (TestOptimizationFlakyTestsManagementPoliciesDisabledFailureRateRule) o;
    return Objects.equals(
            this.branches,
            testOptimizationFlakyTestsManagementPoliciesDisabledFailureRateRule.branches)
        && Objects.equals(
            this.enabled,
            testOptimizationFlakyTestsManagementPoliciesDisabledFailureRateRule.enabled)
        && Objects.equals(
            this.minRuns,
            testOptimizationFlakyTestsManagementPoliciesDisabledFailureRateRule.minRuns)
        && Objects.equals(
            this.status, testOptimizationFlakyTestsManagementPoliciesDisabledFailureRateRule.status)
        && Objects.equals(
            this.threshold,
            testOptimizationFlakyTestsManagementPoliciesDisabledFailureRateRule.threshold)
        && Objects.equals(
            this.additionalProperties,
            testOptimizationFlakyTestsManagementPoliciesDisabledFailureRateRule
                .additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branches, enabled, minRuns, status, threshold, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestOptimizationFlakyTestsManagementPoliciesDisabledFailureRateRule {\n");
    sb.append("    branches: ").append(toIndentedString(branches)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    minRuns: ").append(toIndentedString(minRuns)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
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
