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
import org.openapitools.jackson.nullable.JsonNullable;

/** Configuration parameters of the policy that triggered this status change. */
@JsonPropertyOrder({
  FlakyTestHistoryPolicyMetaConfig.JSON_PROPERTY_BRANCHES,
  FlakyTestHistoryPolicyMetaConfig.JSON_PROPERTY_DAYS_ACTIVE,
  FlakyTestHistoryPolicyMetaConfig.JSON_PROPERTY_FAILURE_RATE,
  FlakyTestHistoryPolicyMetaConfig.JSON_PROPERTY_FORGET_BRANCHES,
  FlakyTestHistoryPolicyMetaConfig.JSON_PROPERTY_REQUIRED_RUNS,
  FlakyTestHistoryPolicyMetaConfig.JSON_PROPERTY_STATE,
  FlakyTestHistoryPolicyMetaConfig.JSON_PROPERTY_TEST_SERVICES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FlakyTestHistoryPolicyMetaConfig {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BRANCHES = "branches";
  private JsonNullable<List<String>> branches = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_DAYS_ACTIVE = "days_active";
  private JsonNullable<Integer> daysActive = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_FAILURE_RATE = "failure_rate";
  private JsonNullable<Double> failureRate = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_FORGET_BRANCHES = "forget_branches";
  private JsonNullable<List<String>> forgetBranches = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_REQUIRED_RUNS = "required_runs";
  private JsonNullable<Integer> requiredRuns = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_STATE = "state";
  private JsonNullable<String> state = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TEST_SERVICES = "test_services";
  private JsonNullable<List<String>> testServices = JsonNullable.<List<String>>undefined();

  public FlakyTestHistoryPolicyMetaConfig branches(List<String> branches) {
    this.branches = JsonNullable.<List<String>>of(branches);
    return this;
  }

  public FlakyTestHistoryPolicyMetaConfig addBranchesItem(String branchesItem) {
    if (this.branches == null || !this.branches.isPresent()) {
      this.branches = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.branches.get().add(branchesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The branches considered by the policy.
   *
   * @return branches
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<String> getBranches() {
    return branches.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BRANCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getBranches_JsonNullable() {
    return branches;
  }

  @JsonProperty(JSON_PROPERTY_BRANCHES)
  public void setBranches_JsonNullable(JsonNullable<List<String>> branches) {
    this.branches = branches;
  }

  public void setBranches(List<String> branches) {
    this.branches = JsonNullable.<List<String>>of(branches);
  }

  public FlakyTestHistoryPolicyMetaConfig daysActive(Integer daysActive) {
    this.daysActive = JsonNullable.<Integer>of(daysActive);
    return this;
  }

  /**
   * The number of days a test must have been active for the policy to trigger. maximum: 2147483647
   *
   * @return daysActive
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Integer getDaysActive() {
    return daysActive.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DAYS_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Integer> getDaysActive_JsonNullable() {
    return daysActive;
  }

  @JsonProperty(JSON_PROPERTY_DAYS_ACTIVE)
  public void setDaysActive_JsonNullable(JsonNullable<Integer> daysActive) {
    this.daysActive = daysActive;
  }

  public void setDaysActive(Integer daysActive) {
    this.daysActive = JsonNullable.<Integer>of(daysActive);
  }

  public FlakyTestHistoryPolicyMetaConfig failureRate(Double failureRate) {
    this.failureRate = JsonNullable.<Double>of(failureRate);
    return this;
  }

  /**
   * The failure rate threshold for the policy to trigger. minimum: 0 maximum: 1
   *
   * @return failureRate
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getFailureRate() {
    return failureRate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FAILURE_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getFailureRate_JsonNullable() {
    return failureRate;
  }

  @JsonProperty(JSON_PROPERTY_FAILURE_RATE)
  public void setFailureRate_JsonNullable(JsonNullable<Double> failureRate) {
    this.failureRate = failureRate;
  }

  public void setFailureRate(Double failureRate) {
    this.failureRate = JsonNullable.<Double>of(failureRate);
  }

  public FlakyTestHistoryPolicyMetaConfig forgetBranches(List<String> forgetBranches) {
    this.forgetBranches = JsonNullable.<List<String>>of(forgetBranches);
    return this;
  }

  public FlakyTestHistoryPolicyMetaConfig addForgetBranchesItem(String forgetBranchesItem) {
    if (this.forgetBranches == null || !this.forgetBranches.isPresent()) {
      this.forgetBranches = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.forgetBranches.get().add(forgetBranchesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Branches excluded from the policy evaluation.
   *
   * @return forgetBranches
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<String> getForgetBranches() {
    return forgetBranches.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FORGET_BRANCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getForgetBranches_JsonNullable() {
    return forgetBranches;
  }

  @JsonProperty(JSON_PROPERTY_FORGET_BRANCHES)
  public void setForgetBranches_JsonNullable(JsonNullable<List<String>> forgetBranches) {
    this.forgetBranches = forgetBranches;
  }

  public void setForgetBranches(List<String> forgetBranches) {
    this.forgetBranches = JsonNullable.<List<String>>of(forgetBranches);
  }

  public FlakyTestHistoryPolicyMetaConfig requiredRuns(Integer requiredRuns) {
    this.requiredRuns = JsonNullable.<Integer>of(requiredRuns);
    return this;
  }

  /**
   * The minimum number of test runs required for the policy to trigger. maximum: 2147483647
   *
   * @return requiredRuns
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Integer getRequiredRuns() {
    return requiredRuns.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REQUIRED_RUNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Integer> getRequiredRuns_JsonNullable() {
    return requiredRuns;
  }

  @JsonProperty(JSON_PROPERTY_REQUIRED_RUNS)
  public void setRequiredRuns_JsonNullable(JsonNullable<Integer> requiredRuns) {
    this.requiredRuns = requiredRuns;
  }

  public void setRequiredRuns(Integer requiredRuns) {
    this.requiredRuns = JsonNullable.<Integer>of(requiredRuns);
  }

  public FlakyTestHistoryPolicyMetaConfig state(String state) {
    this.state = JsonNullable.<String>of(state);
    return this;
  }

  /**
   * The target state the policy transitions the test from.
   *
   * @return state
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getState() {
    return state.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getState_JsonNullable() {
    return state;
  }

  @JsonProperty(JSON_PROPERTY_STATE)
  public void setState_JsonNullable(JsonNullable<String> state) {
    this.state = state;
  }

  public void setState(String state) {
    this.state = JsonNullable.<String>of(state);
  }

  public FlakyTestHistoryPolicyMetaConfig testServices(List<String> testServices) {
    this.testServices = JsonNullable.<List<String>>of(testServices);
    return this;
  }

  public FlakyTestHistoryPolicyMetaConfig addTestServicesItem(String testServicesItem) {
    if (this.testServices == null || !this.testServices.isPresent()) {
      this.testServices = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.testServices.get().add(testServicesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Test services excluded from the policy evaluation.
   *
   * @return testServices
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<String> getTestServices() {
    return testServices.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEST_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getTestServices_JsonNullable() {
    return testServices;
  }

  @JsonProperty(JSON_PROPERTY_TEST_SERVICES)
  public void setTestServices_JsonNullable(JsonNullable<List<String>> testServices) {
    this.testServices = testServices;
  }

  public void setTestServices(List<String> testServices) {
    this.testServices = JsonNullable.<List<String>>of(testServices);
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
   * @return FlakyTestHistoryPolicyMetaConfig
   */
  @JsonAnySetter
  public FlakyTestHistoryPolicyMetaConfig putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FlakyTestHistoryPolicyMetaConfig object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlakyTestHistoryPolicyMetaConfig flakyTestHistoryPolicyMetaConfig =
        (FlakyTestHistoryPolicyMetaConfig) o;
    return Objects.equals(this.branches, flakyTestHistoryPolicyMetaConfig.branches)
        && Objects.equals(this.daysActive, flakyTestHistoryPolicyMetaConfig.daysActive)
        && Objects.equals(this.failureRate, flakyTestHistoryPolicyMetaConfig.failureRate)
        && Objects.equals(this.forgetBranches, flakyTestHistoryPolicyMetaConfig.forgetBranches)
        && Objects.equals(this.requiredRuns, flakyTestHistoryPolicyMetaConfig.requiredRuns)
        && Objects.equals(this.state, flakyTestHistoryPolicyMetaConfig.state)
        && Objects.equals(this.testServices, flakyTestHistoryPolicyMetaConfig.testServices)
        && Objects.equals(
            this.additionalProperties, flakyTestHistoryPolicyMetaConfig.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        branches,
        daysActive,
        failureRate,
        forgetBranches,
        requiredRuns,
        state,
        testServices,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlakyTestHistoryPolicyMetaConfig {\n");
    sb.append("    branches: ").append(toIndentedString(branches)).append("\n");
    sb.append("    daysActive: ").append(toIndentedString(daysActive)).append("\n");
    sb.append("    failureRate: ").append(toIndentedString(failureRate)).append("\n");
    sb.append("    forgetBranches: ").append(toIndentedString(forgetBranches)).append("\n");
    sb.append("    requiredRuns: ").append(toIndentedString(requiredRuns)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    testServices: ").append(toIndentedString(testServices)).append("\n");
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
