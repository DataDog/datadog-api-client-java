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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Attributes for updating Flaky Tests Management policies. Only provided policy blocks are updated;
 * omitted blocks are left unchanged.
 */
@JsonPropertyOrder({
  TestOptimizationFlakyTestsManagementPoliciesUpdateRequestAttributes.JSON_PROPERTY_ATTEMPT_TO_FIX,
  TestOptimizationFlakyTestsManagementPoliciesUpdateRequestAttributes.JSON_PROPERTY_DISABLED,
  TestOptimizationFlakyTestsManagementPoliciesUpdateRequestAttributes.JSON_PROPERTY_QUARANTINED,
  TestOptimizationFlakyTestsManagementPoliciesUpdateRequestAttributes.JSON_PROPERTY_REPOSITORY_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TestOptimizationFlakyTestsManagementPoliciesUpdateRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTEMPT_TO_FIX = "attempt_to_fix";
  private TestOptimizationFlakyTestsManagementPoliciesAttemptToFix attemptToFix;

  public static final String JSON_PROPERTY_DISABLED = "disabled";
  private TestOptimizationFlakyTestsManagementPoliciesDisabled disabled;

  public static final String JSON_PROPERTY_QUARANTINED = "quarantined";
  private TestOptimizationFlakyTestsManagementPoliciesQuarantined quarantined;

  public static final String JSON_PROPERTY_REPOSITORY_ID = "repository_id";
  private String repositoryId;

  public TestOptimizationFlakyTestsManagementPoliciesUpdateRequestAttributes() {}

  @JsonCreator
  public TestOptimizationFlakyTestsManagementPoliciesUpdateRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_REPOSITORY_ID) String repositoryId) {
    this.repositoryId = repositoryId;
  }

  public TestOptimizationFlakyTestsManagementPoliciesUpdateRequestAttributes attemptToFix(
      TestOptimizationFlakyTestsManagementPoliciesAttemptToFix attemptToFix) {
    this.attemptToFix = attemptToFix;
    this.unparsed |= attemptToFix.unparsed;
    return this;
  }

  /**
   * Configuration for the attempt-to-fix Flaky Tests Management policy.
   *
   * @return attemptToFix
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTEMPT_TO_FIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TestOptimizationFlakyTestsManagementPoliciesAttemptToFix getAttemptToFix() {
    return attemptToFix;
  }

  public void setAttemptToFix(
      TestOptimizationFlakyTestsManagementPoliciesAttemptToFix attemptToFix) {
    this.attemptToFix = attemptToFix;
  }

  public TestOptimizationFlakyTestsManagementPoliciesUpdateRequestAttributes disabled(
      TestOptimizationFlakyTestsManagementPoliciesDisabled disabled) {
    this.disabled = disabled;
    this.unparsed |= disabled.unparsed;
    return this;
  }

  /**
   * Configuration for the disabled Flaky Tests Management policy.
   *
   * @return disabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TestOptimizationFlakyTestsManagementPoliciesDisabled getDisabled() {
    return disabled;
  }

  public void setDisabled(TestOptimizationFlakyTestsManagementPoliciesDisabled disabled) {
    this.disabled = disabled;
  }

  public TestOptimizationFlakyTestsManagementPoliciesUpdateRequestAttributes quarantined(
      TestOptimizationFlakyTestsManagementPoliciesQuarantined quarantined) {
    this.quarantined = quarantined;
    this.unparsed |= quarantined.unparsed;
    return this;
  }

  /**
   * Configuration for the quarantined Flaky Tests Management policy.
   *
   * @return quarantined
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUARANTINED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TestOptimizationFlakyTestsManagementPoliciesQuarantined getQuarantined() {
    return quarantined;
  }

  public void setQuarantined(TestOptimizationFlakyTestsManagementPoliciesQuarantined quarantined) {
    this.quarantined = quarantined;
  }

  public TestOptimizationFlakyTestsManagementPoliciesUpdateRequestAttributes repositoryId(
      String repositoryId) {
    this.repositoryId = repositoryId;
    return this;
  }

  /**
   * The repository identifier.
   *
   * @return repositoryId
   */
  @JsonProperty(JSON_PROPERTY_REPOSITORY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRepositoryId() {
    return repositoryId;
  }

  public void setRepositoryId(String repositoryId) {
    this.repositoryId = repositoryId;
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
   * @return TestOptimizationFlakyTestsManagementPoliciesUpdateRequestAttributes
   */
  @JsonAnySetter
  public TestOptimizationFlakyTestsManagementPoliciesUpdateRequestAttributes putAdditionalProperty(
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
   * Return true if this TestOptimizationFlakyTestsManagementPoliciesUpdateRequestAttributes object
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
    TestOptimizationFlakyTestsManagementPoliciesUpdateRequestAttributes
        testOptimizationFlakyTestsManagementPoliciesUpdateRequestAttributes =
            (TestOptimizationFlakyTestsManagementPoliciesUpdateRequestAttributes) o;
    return Objects.equals(
            this.attemptToFix,
            testOptimizationFlakyTestsManagementPoliciesUpdateRequestAttributes.attemptToFix)
        && Objects.equals(
            this.disabled,
            testOptimizationFlakyTestsManagementPoliciesUpdateRequestAttributes.disabled)
        && Objects.equals(
            this.quarantined,
            testOptimizationFlakyTestsManagementPoliciesUpdateRequestAttributes.quarantined)
        && Objects.equals(
            this.repositoryId,
            testOptimizationFlakyTestsManagementPoliciesUpdateRequestAttributes.repositoryId)
        && Objects.equals(
            this.additionalProperties,
            testOptimizationFlakyTestsManagementPoliciesUpdateRequestAttributes
                .additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attemptToFix, disabled, quarantined, repositoryId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestOptimizationFlakyTestsManagementPoliciesUpdateRequestAttributes {\n");
    sb.append("    attemptToFix: ").append(toIndentedString(attemptToFix)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    quarantined: ").append(toIndentedString(quarantined)).append("\n");
    sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
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
