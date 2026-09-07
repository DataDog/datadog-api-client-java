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

/** Automatic disable triggering rule based on a time window and test status. */
@JsonPropertyOrder({
  TestOptimizationFlakyTestsManagementPoliciesAutoDisableRule.JSON_PROPERTY_ENABLED,
  TestOptimizationFlakyTestsManagementPoliciesAutoDisableRule.JSON_PROPERTY_STATUS,
  TestOptimizationFlakyTestsManagementPoliciesAutoDisableRule.JSON_PROPERTY_WINDOW_SECONDS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TestOptimizationFlakyTestsManagementPoliciesAutoDisableRule {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_STATUS = "status";
  private TestOptimizationFlakyTestsManagementPoliciesDisabledStatus status;

  public static final String JSON_PROPERTY_WINDOW_SECONDS = "window_seconds";
  private Long windowSeconds;

  public TestOptimizationFlakyTestsManagementPoliciesAutoDisableRule enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether this auto-disable rule is enabled.
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

  public TestOptimizationFlakyTestsManagementPoliciesAutoDisableRule status(
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

  public TestOptimizationFlakyTestsManagementPoliciesAutoDisableRule windowSeconds(
      Long windowSeconds) {
    this.windowSeconds = windowSeconds;
    return this;
  }

  /**
   * Time window in seconds over which flakiness is evaluated. Must be greater than 0.
   *
   * @return windowSeconds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WINDOW_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getWindowSeconds() {
    return windowSeconds;
  }

  public void setWindowSeconds(Long windowSeconds) {
    this.windowSeconds = windowSeconds;
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
   * @return TestOptimizationFlakyTestsManagementPoliciesAutoDisableRule
   */
  @JsonAnySetter
  public TestOptimizationFlakyTestsManagementPoliciesAutoDisableRule putAdditionalProperty(
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
   * Return true if this TestOptimizationFlakyTestsManagementPoliciesAutoDisableRule object is equal
   * to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestOptimizationFlakyTestsManagementPoliciesAutoDisableRule
        testOptimizationFlakyTestsManagementPoliciesAutoDisableRule =
            (TestOptimizationFlakyTestsManagementPoliciesAutoDisableRule) o;
    return Objects.equals(
            this.enabled, testOptimizationFlakyTestsManagementPoliciesAutoDisableRule.enabled)
        && Objects.equals(
            this.status, testOptimizationFlakyTestsManagementPoliciesAutoDisableRule.status)
        && Objects.equals(
            this.windowSeconds,
            testOptimizationFlakyTestsManagementPoliciesAutoDisableRule.windowSeconds)
        && Objects.equals(
            this.additionalProperties,
            testOptimizationFlakyTestsManagementPoliciesAutoDisableRule.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, status, windowSeconds, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestOptimizationFlakyTestsManagementPoliciesAutoDisableRule {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    windowSeconds: ").append(toIndentedString(windowSeconds)).append("\n");
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
