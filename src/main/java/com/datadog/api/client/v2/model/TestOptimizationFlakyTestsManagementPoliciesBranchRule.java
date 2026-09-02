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

/** Branch filtering rule for a Flaky Tests Management policy. */
@JsonPropertyOrder({
  TestOptimizationFlakyTestsManagementPoliciesBranchRule.JSON_PROPERTY_BRANCHES,
  TestOptimizationFlakyTestsManagementPoliciesBranchRule.JSON_PROPERTY_ENABLED,
  TestOptimizationFlakyTestsManagementPoliciesBranchRule.JSON_PROPERTY_EXCLUDED_BRANCHES,
  TestOptimizationFlakyTestsManagementPoliciesBranchRule.JSON_PROPERTY_EXCLUDED_TEST_SERVICES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TestOptimizationFlakyTestsManagementPoliciesBranchRule {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BRANCHES = "branches";
  private List<String> branches = null;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_EXCLUDED_BRANCHES = "excluded_branches";
  private List<String> excludedBranches = null;

  public static final String JSON_PROPERTY_EXCLUDED_TEST_SERVICES = "excluded_test_services";
  private List<String> excludedTestServices = null;

  public TestOptimizationFlakyTestsManagementPoliciesBranchRule branches(List<String> branches) {
    this.branches = branches;
    return this;
  }

  public TestOptimizationFlakyTestsManagementPoliciesBranchRule addBranchesItem(
      String branchesItem) {
    if (this.branches == null) {
      this.branches = new ArrayList<>();
    }
    this.branches.add(branchesItem);
    return this;
  }

  /**
   * List of branches to which the policy applies.
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

  public TestOptimizationFlakyTestsManagementPoliciesBranchRule enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether this branch rule is enabled.
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

  public TestOptimizationFlakyTestsManagementPoliciesBranchRule excludedBranches(
      List<String> excludedBranches) {
    this.excludedBranches = excludedBranches;
    return this;
  }

  public TestOptimizationFlakyTestsManagementPoliciesBranchRule addExcludedBranchesItem(
      String excludedBranchesItem) {
    if (this.excludedBranches == null) {
      this.excludedBranches = new ArrayList<>();
    }
    this.excludedBranches.add(excludedBranchesItem);
    return this;
  }

  /**
   * List of branches excluded from the policy.
   *
   * @return excludedBranches
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCLUDED_BRANCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getExcludedBranches() {
    return excludedBranches;
  }

  public void setExcludedBranches(List<String> excludedBranches) {
    this.excludedBranches = excludedBranches;
  }

  public TestOptimizationFlakyTestsManagementPoliciesBranchRule excludedTestServices(
      List<String> excludedTestServices) {
    this.excludedTestServices = excludedTestServices;
    return this;
  }

  public TestOptimizationFlakyTestsManagementPoliciesBranchRule addExcludedTestServicesItem(
      String excludedTestServicesItem) {
    if (this.excludedTestServices == null) {
      this.excludedTestServices = new ArrayList<>();
    }
    this.excludedTestServices.add(excludedTestServicesItem);
    return this;
  }

  /**
   * List of test services excluded from the policy.
   *
   * @return excludedTestServices
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCLUDED_TEST_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getExcludedTestServices() {
    return excludedTestServices;
  }

  public void setExcludedTestServices(List<String> excludedTestServices) {
    this.excludedTestServices = excludedTestServices;
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
   * @return TestOptimizationFlakyTestsManagementPoliciesBranchRule
   */
  @JsonAnySetter
  public TestOptimizationFlakyTestsManagementPoliciesBranchRule putAdditionalProperty(
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
   * Return true if this TestOptimizationFlakyTestsManagementPoliciesBranchRule object is equal to
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
    TestOptimizationFlakyTestsManagementPoliciesBranchRule
        testOptimizationFlakyTestsManagementPoliciesBranchRule =
            (TestOptimizationFlakyTestsManagementPoliciesBranchRule) o;
    return Objects.equals(
            this.branches, testOptimizationFlakyTestsManagementPoliciesBranchRule.branches)
        && Objects.equals(
            this.enabled, testOptimizationFlakyTestsManagementPoliciesBranchRule.enabled)
        && Objects.equals(
            this.excludedBranches,
            testOptimizationFlakyTestsManagementPoliciesBranchRule.excludedBranches)
        && Objects.equals(
            this.excludedTestServices,
            testOptimizationFlakyTestsManagementPoliciesBranchRule.excludedTestServices)
        && Objects.equals(
            this.additionalProperties,
            testOptimizationFlakyTestsManagementPoliciesBranchRule.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        branches, enabled, excludedBranches, excludedTestServices, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestOptimizationFlakyTestsManagementPoliciesBranchRule {\n");
    sb.append("    branches: ").append(toIndentedString(branches)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    excludedBranches: ").append(toIndentedString(excludedBranches)).append("\n");
    sb.append("    excludedTestServices: ")
        .append(toIndentedString(excludedTestServices))
        .append("\n");
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
