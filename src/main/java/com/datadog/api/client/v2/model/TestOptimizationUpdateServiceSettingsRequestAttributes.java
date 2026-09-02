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
 * Attributes for updating Test Optimization service settings. All non-required fields are optional;
 * only provided fields will be updated. Setting a field to <code>null</code> is a no-op. To reset a
 * setting to inherit from the repository level, use the corresponding <code>&lt;setting&gt;_inherit
 * </code> field.
 */
@JsonPropertyOrder({
  TestOptimizationUpdateServiceSettingsRequestAttributes.JSON_PROPERTY_AUTO_TEST_RETRIES_ENABLED,
  TestOptimizationUpdateServiceSettingsRequestAttributes
      .JSON_PROPERTY_AUTO_TEST_RETRIES_ENABLED_INHERIT,
  TestOptimizationUpdateServiceSettingsRequestAttributes.JSON_PROPERTY_CODE_COVERAGE_ENABLED,
  TestOptimizationUpdateServiceSettingsRequestAttributes
      .JSON_PROPERTY_CODE_COVERAGE_ENABLED_INHERIT,
  TestOptimizationUpdateServiceSettingsRequestAttributes
      .JSON_PROPERTY_EARLY_FLAKE_DETECTION_ENABLED,
  TestOptimizationUpdateServiceSettingsRequestAttributes
      .JSON_PROPERTY_EARLY_FLAKE_DETECTION_ENABLED_INHERIT,
  TestOptimizationUpdateServiceSettingsRequestAttributes.JSON_PROPERTY_ENV,
  TestOptimizationUpdateServiceSettingsRequestAttributes.JSON_PROPERTY_FAILED_TEST_REPLAY_ENABLED,
  TestOptimizationUpdateServiceSettingsRequestAttributes
      .JSON_PROPERTY_FAILED_TEST_REPLAY_ENABLED_INHERIT,
  TestOptimizationUpdateServiceSettingsRequestAttributes.JSON_PROPERTY_PR_COMMENTS_ENABLED,
  TestOptimizationUpdateServiceSettingsRequestAttributes.JSON_PROPERTY_REPOSITORY_ID,
  TestOptimizationUpdateServiceSettingsRequestAttributes.JSON_PROPERTY_SERVICE_NAME,
  TestOptimizationUpdateServiceSettingsRequestAttributes.JSON_PROPERTY_TEST_IMPACT_ANALYSIS_ENABLED,
  TestOptimizationUpdateServiceSettingsRequestAttributes
      .JSON_PROPERTY_TEST_IMPACT_ANALYSIS_ENABLED_INHERIT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TestOptimizationUpdateServiceSettingsRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTO_TEST_RETRIES_ENABLED = "auto_test_retries_enabled";
  private Boolean autoTestRetriesEnabled;

  public static final String JSON_PROPERTY_AUTO_TEST_RETRIES_ENABLED_INHERIT =
      "auto_test_retries_enabled_inherit";
  private Boolean autoTestRetriesEnabledInherit;

  public static final String JSON_PROPERTY_CODE_COVERAGE_ENABLED = "code_coverage_enabled";
  private Boolean codeCoverageEnabled;

  public static final String JSON_PROPERTY_CODE_COVERAGE_ENABLED_INHERIT =
      "code_coverage_enabled_inherit";
  private Boolean codeCoverageEnabledInherit;

  public static final String JSON_PROPERTY_EARLY_FLAKE_DETECTION_ENABLED =
      "early_flake_detection_enabled";
  private Boolean earlyFlakeDetectionEnabled;

  public static final String JSON_PROPERTY_EARLY_FLAKE_DETECTION_ENABLED_INHERIT =
      "early_flake_detection_enabled_inherit";
  private Boolean earlyFlakeDetectionEnabledInherit;

  public static final String JSON_PROPERTY_ENV = "env";
  private String env;

  public static final String JSON_PROPERTY_FAILED_TEST_REPLAY_ENABLED =
      "failed_test_replay_enabled";
  private Boolean failedTestReplayEnabled;

  public static final String JSON_PROPERTY_FAILED_TEST_REPLAY_ENABLED_INHERIT =
      "failed_test_replay_enabled_inherit";
  private Boolean failedTestReplayEnabledInherit;

  public static final String JSON_PROPERTY_PR_COMMENTS_ENABLED = "pr_comments_enabled";
  private Boolean prCommentsEnabled;

  public static final String JSON_PROPERTY_REPOSITORY_ID = "repository_id";
  private String repositoryId;

  public static final String JSON_PROPERTY_SERVICE_NAME = "service_name";
  private String serviceName;

  public static final String JSON_PROPERTY_TEST_IMPACT_ANALYSIS_ENABLED =
      "test_impact_analysis_enabled";
  private Boolean testImpactAnalysisEnabled;

  public static final String JSON_PROPERTY_TEST_IMPACT_ANALYSIS_ENABLED_INHERIT =
      "test_impact_analysis_enabled_inherit";
  private Boolean testImpactAnalysisEnabledInherit;

  public TestOptimizationUpdateServiceSettingsRequestAttributes() {}

  @JsonCreator
  public TestOptimizationUpdateServiceSettingsRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_REPOSITORY_ID) String repositoryId,
      @JsonProperty(required = true, value = JSON_PROPERTY_SERVICE_NAME) String serviceName) {
    this.repositoryId = repositoryId;
    this.serviceName = serviceName;
  }

  public TestOptimizationUpdateServiceSettingsRequestAttributes autoTestRetriesEnabled(
      Boolean autoTestRetriesEnabled) {
    this.autoTestRetriesEnabled = autoTestRetriesEnabled;
    return this;
  }

  /**
   * Whether Auto Test Retries are enabled for this service. Setting to <code>null</code> is a
   * no-op; use <code>auto_test_retries_enabled_inherit</code> to reset to repository-level
   * inheritance.
   *
   * @return autoTestRetriesEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTO_TEST_RETRIES_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAutoTestRetriesEnabled() {
    return autoTestRetriesEnabled;
  }

  public void setAutoTestRetriesEnabled(Boolean autoTestRetriesEnabled) {
    this.autoTestRetriesEnabled = autoTestRetriesEnabled;
  }

  public TestOptimizationUpdateServiceSettingsRequestAttributes autoTestRetriesEnabledInherit(
      Boolean autoTestRetriesEnabledInherit) {
    this.autoTestRetriesEnabledInherit = autoTestRetriesEnabledInherit;
    return this;
  }

  /**
   * When <code>true</code>, resets the Auto Test Retries setting to inherit from the repository
   * level.
   *
   * @return autoTestRetriesEnabledInherit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTO_TEST_RETRIES_ENABLED_INHERIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAutoTestRetriesEnabledInherit() {
    return autoTestRetriesEnabledInherit;
  }

  public void setAutoTestRetriesEnabledInherit(Boolean autoTestRetriesEnabledInherit) {
    this.autoTestRetriesEnabledInherit = autoTestRetriesEnabledInherit;
  }

  public TestOptimizationUpdateServiceSettingsRequestAttributes codeCoverageEnabled(
      Boolean codeCoverageEnabled) {
    this.codeCoverageEnabled = codeCoverageEnabled;
    return this;
  }

  /**
   * Whether Code Coverage is enabled for this service. Setting to <code>null</code> is a no-op; use
   * <code>code_coverage_enabled_inherit</code> to reset to repository-level inheritance.
   *
   * @return codeCoverageEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODE_COVERAGE_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getCodeCoverageEnabled() {
    return codeCoverageEnabled;
  }

  public void setCodeCoverageEnabled(Boolean codeCoverageEnabled) {
    this.codeCoverageEnabled = codeCoverageEnabled;
  }

  public TestOptimizationUpdateServiceSettingsRequestAttributes codeCoverageEnabledInherit(
      Boolean codeCoverageEnabledInherit) {
    this.codeCoverageEnabledInherit = codeCoverageEnabledInherit;
    return this;
  }

  /**
   * When <code>true</code>, resets the Code Coverage setting to inherit from the repository level.
   *
   * @return codeCoverageEnabledInherit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODE_COVERAGE_ENABLED_INHERIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getCodeCoverageEnabledInherit() {
    return codeCoverageEnabledInherit;
  }

  public void setCodeCoverageEnabledInherit(Boolean codeCoverageEnabledInherit) {
    this.codeCoverageEnabledInherit = codeCoverageEnabledInherit;
  }

  public TestOptimizationUpdateServiceSettingsRequestAttributes earlyFlakeDetectionEnabled(
      Boolean earlyFlakeDetectionEnabled) {
    this.earlyFlakeDetectionEnabled = earlyFlakeDetectionEnabled;
    return this;
  }

  /**
   * Whether Early Flake Detection is enabled for this service. Setting to <code>null</code> is a
   * no-op; use <code>early_flake_detection_enabled_inherit</code> to reset to repository-level
   * inheritance.
   *
   * @return earlyFlakeDetectionEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EARLY_FLAKE_DETECTION_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEarlyFlakeDetectionEnabled() {
    return earlyFlakeDetectionEnabled;
  }

  public void setEarlyFlakeDetectionEnabled(Boolean earlyFlakeDetectionEnabled) {
    this.earlyFlakeDetectionEnabled = earlyFlakeDetectionEnabled;
  }

  public TestOptimizationUpdateServiceSettingsRequestAttributes earlyFlakeDetectionEnabledInherit(
      Boolean earlyFlakeDetectionEnabledInherit) {
    this.earlyFlakeDetectionEnabledInherit = earlyFlakeDetectionEnabledInherit;
    return this;
  }

  /**
   * When <code>true</code>, resets the Early Flake Detection setting to inherit from the repository
   * level.
   *
   * @return earlyFlakeDetectionEnabledInherit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EARLY_FLAKE_DETECTION_ENABLED_INHERIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEarlyFlakeDetectionEnabledInherit() {
    return earlyFlakeDetectionEnabledInherit;
  }

  public void setEarlyFlakeDetectionEnabledInherit(Boolean earlyFlakeDetectionEnabledInherit) {
    this.earlyFlakeDetectionEnabledInherit = earlyFlakeDetectionEnabledInherit;
  }

  public TestOptimizationUpdateServiceSettingsRequestAttributes env(String env) {
    this.env = env;
    return this;
  }

  /**
   * The environment name. If omitted, defaults to <code>none</code>.
   *
   * @return env
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEnv() {
    return env;
  }

  public void setEnv(String env) {
    this.env = env;
  }

  public TestOptimizationUpdateServiceSettingsRequestAttributes failedTestReplayEnabled(
      Boolean failedTestReplayEnabled) {
    this.failedTestReplayEnabled = failedTestReplayEnabled;
    return this;
  }

  /**
   * Whether Failed Test Replay is enabled for this service. Setting to <code>null</code> is a
   * no-op; use <code>failed_test_replay_enabled_inherit</code> to reset to repository-level
   * inheritance.
   *
   * @return failedTestReplayEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILED_TEST_REPLAY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getFailedTestReplayEnabled() {
    return failedTestReplayEnabled;
  }

  public void setFailedTestReplayEnabled(Boolean failedTestReplayEnabled) {
    this.failedTestReplayEnabled = failedTestReplayEnabled;
  }

  public TestOptimizationUpdateServiceSettingsRequestAttributes failedTestReplayEnabledInherit(
      Boolean failedTestReplayEnabledInherit) {
    this.failedTestReplayEnabledInherit = failedTestReplayEnabledInherit;
    return this;
  }

  /**
   * When <code>true</code>, resets the Failed Test Replay setting to inherit from the repository
   * level.
   *
   * @return failedTestReplayEnabledInherit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILED_TEST_REPLAY_ENABLED_INHERIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getFailedTestReplayEnabledInherit() {
    return failedTestReplayEnabledInherit;
  }

  public void setFailedTestReplayEnabledInherit(Boolean failedTestReplayEnabledInherit) {
    this.failedTestReplayEnabledInherit = failedTestReplayEnabledInherit;
  }

  public TestOptimizationUpdateServiceSettingsRequestAttributes prCommentsEnabled(
      Boolean prCommentsEnabled) {
    this.prCommentsEnabled = prCommentsEnabled;
    return this;
  }

  /**
   * This field is ignored. PR Comments cannot be overridden at the service level.
   *
   * @return prCommentsEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PR_COMMENTS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPrCommentsEnabled() {
    return prCommentsEnabled;
  }

  public void setPrCommentsEnabled(Boolean prCommentsEnabled) {
    this.prCommentsEnabled = prCommentsEnabled;
  }

  public TestOptimizationUpdateServiceSettingsRequestAttributes repositoryId(String repositoryId) {
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

  public TestOptimizationUpdateServiceSettingsRequestAttributes serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * The service name.
   *
   * @return serviceName
   */
  @JsonProperty(JSON_PROPERTY_SERVICE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public TestOptimizationUpdateServiceSettingsRequestAttributes testImpactAnalysisEnabled(
      Boolean testImpactAnalysisEnabled) {
    this.testImpactAnalysisEnabled = testImpactAnalysisEnabled;
    return this;
  }

  /**
   * Whether Test Impact Analysis is enabled for this service. Setting to <code>null</code> is a
   * no-op; use <code>test_impact_analysis_enabled_inherit</code> to reset to repository-level
   * inheritance.
   *
   * @return testImpactAnalysisEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_IMPACT_ANALYSIS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getTestImpactAnalysisEnabled() {
    return testImpactAnalysisEnabled;
  }

  public void setTestImpactAnalysisEnabled(Boolean testImpactAnalysisEnabled) {
    this.testImpactAnalysisEnabled = testImpactAnalysisEnabled;
  }

  public TestOptimizationUpdateServiceSettingsRequestAttributes testImpactAnalysisEnabledInherit(
      Boolean testImpactAnalysisEnabledInherit) {
    this.testImpactAnalysisEnabledInherit = testImpactAnalysisEnabledInherit;
    return this;
  }

  /**
   * When <code>true</code>, resets the Test Impact Analysis setting to inherit from the repository
   * level.
   *
   * @return testImpactAnalysisEnabledInherit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_IMPACT_ANALYSIS_ENABLED_INHERIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getTestImpactAnalysisEnabledInherit() {
    return testImpactAnalysisEnabledInherit;
  }

  public void setTestImpactAnalysisEnabledInherit(Boolean testImpactAnalysisEnabledInherit) {
    this.testImpactAnalysisEnabledInherit = testImpactAnalysisEnabledInherit;
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
   * @return TestOptimizationUpdateServiceSettingsRequestAttributes
   */
  @JsonAnySetter
  public TestOptimizationUpdateServiceSettingsRequestAttributes putAdditionalProperty(
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
   * Return true if this TestOptimizationUpdateServiceSettingsRequestAttributes object is equal to
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
    TestOptimizationUpdateServiceSettingsRequestAttributes
        testOptimizationUpdateServiceSettingsRequestAttributes =
            (TestOptimizationUpdateServiceSettingsRequestAttributes) o;
    return Objects.equals(
            this.autoTestRetriesEnabled,
            testOptimizationUpdateServiceSettingsRequestAttributes.autoTestRetriesEnabled)
        && Objects.equals(
            this.autoTestRetriesEnabledInherit,
            testOptimizationUpdateServiceSettingsRequestAttributes.autoTestRetriesEnabledInherit)
        && Objects.equals(
            this.codeCoverageEnabled,
            testOptimizationUpdateServiceSettingsRequestAttributes.codeCoverageEnabled)
        && Objects.equals(
            this.codeCoverageEnabledInherit,
            testOptimizationUpdateServiceSettingsRequestAttributes.codeCoverageEnabledInherit)
        && Objects.equals(
            this.earlyFlakeDetectionEnabled,
            testOptimizationUpdateServiceSettingsRequestAttributes.earlyFlakeDetectionEnabled)
        && Objects.equals(
            this.earlyFlakeDetectionEnabledInherit,
            testOptimizationUpdateServiceSettingsRequestAttributes
                .earlyFlakeDetectionEnabledInherit)
        && Objects.equals(this.env, testOptimizationUpdateServiceSettingsRequestAttributes.env)
        && Objects.equals(
            this.failedTestReplayEnabled,
            testOptimizationUpdateServiceSettingsRequestAttributes.failedTestReplayEnabled)
        && Objects.equals(
            this.failedTestReplayEnabledInherit,
            testOptimizationUpdateServiceSettingsRequestAttributes.failedTestReplayEnabledInherit)
        && Objects.equals(
            this.prCommentsEnabled,
            testOptimizationUpdateServiceSettingsRequestAttributes.prCommentsEnabled)
        && Objects.equals(
            this.repositoryId, testOptimizationUpdateServiceSettingsRequestAttributes.repositoryId)
        && Objects.equals(
            this.serviceName, testOptimizationUpdateServiceSettingsRequestAttributes.serviceName)
        && Objects.equals(
            this.testImpactAnalysisEnabled,
            testOptimizationUpdateServiceSettingsRequestAttributes.testImpactAnalysisEnabled)
        && Objects.equals(
            this.testImpactAnalysisEnabledInherit,
            testOptimizationUpdateServiceSettingsRequestAttributes.testImpactAnalysisEnabledInherit)
        && Objects.equals(
            this.additionalProperties,
            testOptimizationUpdateServiceSettingsRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        autoTestRetriesEnabled,
        autoTestRetriesEnabledInherit,
        codeCoverageEnabled,
        codeCoverageEnabledInherit,
        earlyFlakeDetectionEnabled,
        earlyFlakeDetectionEnabledInherit,
        env,
        failedTestReplayEnabled,
        failedTestReplayEnabledInherit,
        prCommentsEnabled,
        repositoryId,
        serviceName,
        testImpactAnalysisEnabled,
        testImpactAnalysisEnabledInherit,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestOptimizationUpdateServiceSettingsRequestAttributes {\n");
    sb.append("    autoTestRetriesEnabled: ")
        .append(toIndentedString(autoTestRetriesEnabled))
        .append("\n");
    sb.append("    autoTestRetriesEnabledInherit: ")
        .append(toIndentedString(autoTestRetriesEnabledInherit))
        .append("\n");
    sb.append("    codeCoverageEnabled: ")
        .append(toIndentedString(codeCoverageEnabled))
        .append("\n");
    sb.append("    codeCoverageEnabledInherit: ")
        .append(toIndentedString(codeCoverageEnabledInherit))
        .append("\n");
    sb.append("    earlyFlakeDetectionEnabled: ")
        .append(toIndentedString(earlyFlakeDetectionEnabled))
        .append("\n");
    sb.append("    earlyFlakeDetectionEnabledInherit: ")
        .append(toIndentedString(earlyFlakeDetectionEnabledInherit))
        .append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    failedTestReplayEnabled: ")
        .append(toIndentedString(failedTestReplayEnabled))
        .append("\n");
    sb.append("    failedTestReplayEnabledInherit: ")
        .append(toIndentedString(failedTestReplayEnabledInherit))
        .append("\n");
    sb.append("    prCommentsEnabled: ").append(toIndentedString(prCommentsEnabled)).append("\n");
    sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    testImpactAnalysisEnabled: ")
        .append(toIndentedString(testImpactAnalysisEnabled))
        .append("\n");
    sb.append("    testImpactAnalysisEnabledInherit: ")
        .append(toIndentedString(testImpactAnalysisEnabledInherit))
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
