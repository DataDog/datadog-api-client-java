/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Attributes for updating Test Optimization service settings.
   * All non-required fields are optional; only provided fields will be updated.</p>
 */
@JsonPropertyOrder({
  TestOptimizationUpdateServiceSettingsRequestAttributes.JSON_PROPERTY_AUTO_TEST_RETRIES_ENABLED,
  TestOptimizationUpdateServiceSettingsRequestAttributes.JSON_PROPERTY_CODE_COVERAGE_ENABLED,
  TestOptimizationUpdateServiceSettingsRequestAttributes.JSON_PROPERTY_EARLY_FLAKE_DETECTION_ENABLED,
  TestOptimizationUpdateServiceSettingsRequestAttributes.JSON_PROPERTY_ENV,
  TestOptimizationUpdateServiceSettingsRequestAttributes.JSON_PROPERTY_FAILED_TEST_REPLAY_ENABLED,
  TestOptimizationUpdateServiceSettingsRequestAttributes.JSON_PROPERTY_PR_COMMENTS_ENABLED,
  TestOptimizationUpdateServiceSettingsRequestAttributes.JSON_PROPERTY_REPOSITORY_ID,
  TestOptimizationUpdateServiceSettingsRequestAttributes.JSON_PROPERTY_SERVICE_NAME,
  TestOptimizationUpdateServiceSettingsRequestAttributes.JSON_PROPERTY_TEST_IMPACT_ANALYSIS_ENABLED
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TestOptimizationUpdateServiceSettingsRequestAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTO_TEST_RETRIES_ENABLED = "auto_test_retries_enabled";
  private Boolean autoTestRetriesEnabled;

  public static final String JSON_PROPERTY_CODE_COVERAGE_ENABLED = "code_coverage_enabled";
  private Boolean codeCoverageEnabled;

  public static final String JSON_PROPERTY_EARLY_FLAKE_DETECTION_ENABLED = "early_flake_detection_enabled";
  private Boolean earlyFlakeDetectionEnabled;

  public static final String JSON_PROPERTY_ENV = "env";
  private String env;

  public static final String JSON_PROPERTY_FAILED_TEST_REPLAY_ENABLED = "failed_test_replay_enabled";
  private Boolean failedTestReplayEnabled;

  public static final String JSON_PROPERTY_PR_COMMENTS_ENABLED = "pr_comments_enabled";
  private Boolean prCommentsEnabled;

  public static final String JSON_PROPERTY_REPOSITORY_ID = "repository_id";
  private String repositoryId;

  public static final String JSON_PROPERTY_SERVICE_NAME = "service_name";
  private String serviceName;

  public static final String JSON_PROPERTY_TEST_IMPACT_ANALYSIS_ENABLED = "test_impact_analysis_enabled";
  private Boolean testImpactAnalysisEnabled;

  public TestOptimizationUpdateServiceSettingsRequestAttributes() {}

  @JsonCreator
  public TestOptimizationUpdateServiceSettingsRequestAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_REPOSITORY_ID)String repositoryId,
            @JsonProperty(required=true, value=JSON_PROPERTY_SERVICE_NAME)String serviceName) {
        this.repositoryId = repositoryId;
        this.serviceName = serviceName;
  }
  public TestOptimizationUpdateServiceSettingsRequestAttributes autoTestRetriesEnabled(Boolean autoTestRetriesEnabled) {
    this.autoTestRetriesEnabled = autoTestRetriesEnabled;
    return this;
  }

  /**
   * <p>Whether Auto Test Retries are enabled for this service.</p>
   * @return autoTestRetriesEnabled
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AUTO_TEST_RETRIES_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getAutoTestRetriesEnabled() {
        return autoTestRetriesEnabled;
      }
  public void setAutoTestRetriesEnabled(Boolean autoTestRetriesEnabled) {
    this.autoTestRetriesEnabled = autoTestRetriesEnabled;
  }
  public TestOptimizationUpdateServiceSettingsRequestAttributes codeCoverageEnabled(Boolean codeCoverageEnabled) {
    this.codeCoverageEnabled = codeCoverageEnabled;
    return this;
  }

  /**
   * <p>Whether Code Coverage is enabled for this service.</p>
   * @return codeCoverageEnabled
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CODE_COVERAGE_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getCodeCoverageEnabled() {
        return codeCoverageEnabled;
      }
  public void setCodeCoverageEnabled(Boolean codeCoverageEnabled) {
    this.codeCoverageEnabled = codeCoverageEnabled;
  }
  public TestOptimizationUpdateServiceSettingsRequestAttributes earlyFlakeDetectionEnabled(Boolean earlyFlakeDetectionEnabled) {
    this.earlyFlakeDetectionEnabled = earlyFlakeDetectionEnabled;
    return this;
  }

  /**
   * <p>Whether Early Flake Detection is enabled for this service.</p>
   * @return earlyFlakeDetectionEnabled
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EARLY_FLAKE_DETECTION_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getEarlyFlakeDetectionEnabled() {
        return earlyFlakeDetectionEnabled;
      }
  public void setEarlyFlakeDetectionEnabled(Boolean earlyFlakeDetectionEnabled) {
    this.earlyFlakeDetectionEnabled = earlyFlakeDetectionEnabled;
  }
  public TestOptimizationUpdateServiceSettingsRequestAttributes env(String env) {
    this.env = env;
    return this;
  }

  /**
   * <p>The environment name. If omitted, defaults to <code>none</code>.</p>
   * @return env
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ENV)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getEnv() {
        return env;
      }
  public void setEnv(String env) {
    this.env = env;
  }
  public TestOptimizationUpdateServiceSettingsRequestAttributes failedTestReplayEnabled(Boolean failedTestReplayEnabled) {
    this.failedTestReplayEnabled = failedTestReplayEnabled;
    return this;
  }

  /**
   * <p>Whether Failed Test Replay is enabled for this service.</p>
   * @return failedTestReplayEnabled
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FAILED_TEST_REPLAY_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getFailedTestReplayEnabled() {
        return failedTestReplayEnabled;
      }
  public void setFailedTestReplayEnabled(Boolean failedTestReplayEnabled) {
    this.failedTestReplayEnabled = failedTestReplayEnabled;
  }
  public TestOptimizationUpdateServiceSettingsRequestAttributes prCommentsEnabled(Boolean prCommentsEnabled) {
    this.prCommentsEnabled = prCommentsEnabled;
    return this;
  }

  /**
   * <p>Whether PR Comments are enabled for this service.</p>
   * @return prCommentsEnabled
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PR_COMMENTS_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>The repository identifier.</p>
   * @return repositoryId
  **/
      @JsonProperty(JSON_PROPERTY_REPOSITORY_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
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
   * <p>The service name.</p>
   * @return serviceName
  **/
      @JsonProperty(JSON_PROPERTY_SERVICE_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getServiceName() {
        return serviceName;
      }
  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }
  public TestOptimizationUpdateServiceSettingsRequestAttributes testImpactAnalysisEnabled(Boolean testImpactAnalysisEnabled) {
    this.testImpactAnalysisEnabled = testImpactAnalysisEnabled;
    return this;
  }

  /**
   * <p>Whether Test Impact Analysis is enabled for this service.</p>
   * @return testImpactAnalysisEnabled
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TEST_IMPACT_ANALYSIS_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getTestImpactAnalysisEnabled() {
        return testImpactAnalysisEnabled;
      }
  public void setTestImpactAnalysisEnabled(Boolean testImpactAnalysisEnabled) {
    this.testImpactAnalysisEnabled = testImpactAnalysisEnabled;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return TestOptimizationUpdateServiceSettingsRequestAttributes
   */
  @JsonAnySetter
  public TestOptimizationUpdateServiceSettingsRequestAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this TestOptimizationUpdateServiceSettingsRequestAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestOptimizationUpdateServiceSettingsRequestAttributes testOptimizationUpdateServiceSettingsRequestAttributes = (TestOptimizationUpdateServiceSettingsRequestAttributes) o;
    return Objects.equals(this.autoTestRetriesEnabled, testOptimizationUpdateServiceSettingsRequestAttributes.autoTestRetriesEnabled) && Objects.equals(this.codeCoverageEnabled, testOptimizationUpdateServiceSettingsRequestAttributes.codeCoverageEnabled) && Objects.equals(this.earlyFlakeDetectionEnabled, testOptimizationUpdateServiceSettingsRequestAttributes.earlyFlakeDetectionEnabled) && Objects.equals(this.env, testOptimizationUpdateServiceSettingsRequestAttributes.env) && Objects.equals(this.failedTestReplayEnabled, testOptimizationUpdateServiceSettingsRequestAttributes.failedTestReplayEnabled) && Objects.equals(this.prCommentsEnabled, testOptimizationUpdateServiceSettingsRequestAttributes.prCommentsEnabled) && Objects.equals(this.repositoryId, testOptimizationUpdateServiceSettingsRequestAttributes.repositoryId) && Objects.equals(this.serviceName, testOptimizationUpdateServiceSettingsRequestAttributes.serviceName) && Objects.equals(this.testImpactAnalysisEnabled, testOptimizationUpdateServiceSettingsRequestAttributes.testImpactAnalysisEnabled) && Objects.equals(this.additionalProperties, testOptimizationUpdateServiceSettingsRequestAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(autoTestRetriesEnabled,codeCoverageEnabled,earlyFlakeDetectionEnabled,env,failedTestReplayEnabled,prCommentsEnabled,repositoryId,serviceName,testImpactAnalysisEnabled, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestOptimizationUpdateServiceSettingsRequestAttributes {\n");
    sb.append("    autoTestRetriesEnabled: ").append(toIndentedString(autoTestRetriesEnabled)).append("\n");
    sb.append("    codeCoverageEnabled: ").append(toIndentedString(codeCoverageEnabled)).append("\n");
    sb.append("    earlyFlakeDetectionEnabled: ").append(toIndentedString(earlyFlakeDetectionEnabled)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    failedTestReplayEnabled: ").append(toIndentedString(failedTestReplayEnabled)).append("\n");
    sb.append("    prCommentsEnabled: ").append(toIndentedString(prCommentsEnabled)).append("\n");
    sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    testImpactAnalysisEnabled: ").append(toIndentedString(testImpactAnalysisEnabled)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
