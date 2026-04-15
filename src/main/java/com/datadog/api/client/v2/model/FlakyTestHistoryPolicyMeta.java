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

/** Metadata about the policy that triggered this status change. */
@JsonPropertyOrder({
  FlakyTestHistoryPolicyMeta.JSON_PROPERTY_BRANCHES,
  FlakyTestHistoryPolicyMeta.JSON_PROPERTY_CONFIG,
  FlakyTestHistoryPolicyMeta.JSON_PROPERTY_DAYS_ACTIVE,
  FlakyTestHistoryPolicyMeta.JSON_PROPERTY_DAYS_WITHOUT_FLAKE,
  FlakyTestHistoryPolicyMeta.JSON_PROPERTY_FAILURE_RATE,
  FlakyTestHistoryPolicyMeta.JSON_PROPERTY_STATE,
  FlakyTestHistoryPolicyMeta.JSON_PROPERTY_TOTAL_RUNS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FlakyTestHistoryPolicyMeta {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BRANCHES = "branches";
  private JsonNullable<List<String>> branches = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_CONFIG = "config";
  private FlakyTestHistoryPolicyMetaConfig config;

  public static final String JSON_PROPERTY_DAYS_ACTIVE = "days_active";
  private JsonNullable<Integer> daysActive = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_DAYS_WITHOUT_FLAKE = "days_without_flake";
  private JsonNullable<Integer> daysWithoutFlake = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_FAILURE_RATE = "failure_rate";
  private JsonNullable<Double> failureRate = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_STATE = "state";
  private JsonNullable<String> state = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TOTAL_RUNS = "total_runs";
  private JsonNullable<Integer> totalRuns = JsonNullable.<Integer>undefined();

  public FlakyTestHistoryPolicyMeta branches(List<String> branches) {
    this.branches = JsonNullable.<List<String>>of(branches);
    return this;
  }

  public FlakyTestHistoryPolicyMeta addBranchesItem(String branchesItem) {
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
   * Branches where the test was flaky at the time of the status change.
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

  public FlakyTestHistoryPolicyMeta config(FlakyTestHistoryPolicyMetaConfig config) {
    this.config = config;
    this.unparsed |= config.unparsed;
    return this;
  }

  /**
   * Configuration parameters of the policy that triggered this status change.
   *
   * @return config
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FlakyTestHistoryPolicyMetaConfig getConfig() {
    return config;
  }

  public void setConfig(FlakyTestHistoryPolicyMetaConfig config) {
    this.config = config;
  }

  public FlakyTestHistoryPolicyMeta daysActive(Integer daysActive) {
    this.daysActive = JsonNullable.<Integer>of(daysActive);
    return this;
  }

  /**
   * The number of days the test has been active at the time of the status change. maximum:
   * 2147483647
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

  public FlakyTestHistoryPolicyMeta daysWithoutFlake(Integer daysWithoutFlake) {
    this.daysWithoutFlake = JsonNullable.<Integer>of(daysWithoutFlake);
    return this;
  }

  /**
   * The number of days since the test last exhibited flakiness. maximum: 2147483647
   *
   * @return daysWithoutFlake
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Integer getDaysWithoutFlake() {
    return daysWithoutFlake.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DAYS_WITHOUT_FLAKE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Integer> getDaysWithoutFlake_JsonNullable() {
    return daysWithoutFlake;
  }

  @JsonProperty(JSON_PROPERTY_DAYS_WITHOUT_FLAKE)
  public void setDaysWithoutFlake_JsonNullable(JsonNullable<Integer> daysWithoutFlake) {
    this.daysWithoutFlake = daysWithoutFlake;
  }

  public void setDaysWithoutFlake(Integer daysWithoutFlake) {
    this.daysWithoutFlake = JsonNullable.<Integer>of(daysWithoutFlake);
  }

  public FlakyTestHistoryPolicyMeta failureRate(Double failureRate) {
    this.failureRate = JsonNullable.<Double>of(failureRate);
    return this;
  }

  /**
   * The failure rate of the test at the time of the status change. minimum: 0 maximum: 1
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

  public FlakyTestHistoryPolicyMeta state(String state) {
    this.state = JsonNullable.<String>of(state);
    return this;
  }

  /**
   * The previous state of the test.
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

  public FlakyTestHistoryPolicyMeta totalRuns(Integer totalRuns) {
    this.totalRuns = JsonNullable.<Integer>of(totalRuns);
    return this;
  }

  /**
   * The total number of test runs at the time of the status change. maximum: 2147483647
   *
   * @return totalRuns
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Integer getTotalRuns() {
    return totalRuns.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TOTAL_RUNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Integer> getTotalRuns_JsonNullable() {
    return totalRuns;
  }

  @JsonProperty(JSON_PROPERTY_TOTAL_RUNS)
  public void setTotalRuns_JsonNullable(JsonNullable<Integer> totalRuns) {
    this.totalRuns = totalRuns;
  }

  public void setTotalRuns(Integer totalRuns) {
    this.totalRuns = JsonNullable.<Integer>of(totalRuns);
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
   * @return FlakyTestHistoryPolicyMeta
   */
  @JsonAnySetter
  public FlakyTestHistoryPolicyMeta putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FlakyTestHistoryPolicyMeta object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlakyTestHistoryPolicyMeta flakyTestHistoryPolicyMeta = (FlakyTestHistoryPolicyMeta) o;
    return Objects.equals(this.branches, flakyTestHistoryPolicyMeta.branches)
        && Objects.equals(this.config, flakyTestHistoryPolicyMeta.config)
        && Objects.equals(this.daysActive, flakyTestHistoryPolicyMeta.daysActive)
        && Objects.equals(this.daysWithoutFlake, flakyTestHistoryPolicyMeta.daysWithoutFlake)
        && Objects.equals(this.failureRate, flakyTestHistoryPolicyMeta.failureRate)
        && Objects.equals(this.state, flakyTestHistoryPolicyMeta.state)
        && Objects.equals(this.totalRuns, flakyTestHistoryPolicyMeta.totalRuns)
        && Objects.equals(
            this.additionalProperties, flakyTestHistoryPolicyMeta.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        branches,
        config,
        daysActive,
        daysWithoutFlake,
        failureRate,
        state,
        totalRuns,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlakyTestHistoryPolicyMeta {\n");
    sb.append("    branches: ").append(toIndentedString(branches)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    daysActive: ").append(toIndentedString(daysActive)).append("\n");
    sb.append("    daysWithoutFlake: ").append(toIndentedString(daysWithoutFlake)).append("\n");
    sb.append("    failureRate: ").append(toIndentedString(failureRate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    totalRuns: ").append(toIndentedString(totalRuns)).append("\n");
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
