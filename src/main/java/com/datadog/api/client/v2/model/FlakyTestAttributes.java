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

/** Attributes of a flaky test. */
@JsonPropertyOrder({
  FlakyTestAttributes.JSON_PROPERTY_ATTEMPT_TO_FIX_ID,
  FlakyTestAttributes.JSON_PROPERTY_CODEOWNERS,
  FlakyTestAttributes.JSON_PROPERTY_ENVS,
  FlakyTestAttributes.JSON_PROPERTY_FIRST_FLAKED_BRANCH,
  FlakyTestAttributes.JSON_PROPERTY_FIRST_FLAKED_SHA,
  FlakyTestAttributes.JSON_PROPERTY_FIRST_FLAKED_TS,
  FlakyTestAttributes.JSON_PROPERTY_FLAKY_CATEGORY,
  FlakyTestAttributes.JSON_PROPERTY_FLAKY_STATE,
  FlakyTestAttributes.JSON_PROPERTY_LAST_FLAKED_BRANCH,
  FlakyTestAttributes.JSON_PROPERTY_LAST_FLAKED_SHA,
  FlakyTestAttributes.JSON_PROPERTY_LAST_FLAKED_TS,
  FlakyTestAttributes.JSON_PROPERTY_MODULE,
  FlakyTestAttributes.JSON_PROPERTY_NAME,
  FlakyTestAttributes.JSON_PROPERTY_PIPELINE_STATS,
  FlakyTestAttributes.JSON_PROPERTY_SERVICES,
  FlakyTestAttributes.JSON_PROPERTY_SUITE,
  FlakyTestAttributes.JSON_PROPERTY_TEST_RUN_METADATA,
  FlakyTestAttributes.JSON_PROPERTY_TEST_STATS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FlakyTestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTEMPT_TO_FIX_ID = "attempt_to_fix_id";
  private String attemptToFixId;

  public static final String JSON_PROPERTY_CODEOWNERS = "codeowners";
  private List<String> codeowners = null;

  public static final String JSON_PROPERTY_ENVS = "envs";
  private List<String> envs = null;

  public static final String JSON_PROPERTY_FIRST_FLAKED_BRANCH = "first_flaked_branch";
  private String firstFlakedBranch;

  public static final String JSON_PROPERTY_FIRST_FLAKED_SHA = "first_flaked_sha";
  private String firstFlakedSha;

  public static final String JSON_PROPERTY_FIRST_FLAKED_TS = "first_flaked_ts";
  private Long firstFlakedTs;

  public static final String JSON_PROPERTY_FLAKY_CATEGORY = "flaky_category";
  private JsonNullable<String> flakyCategory = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FLAKY_STATE = "flaky_state";
  private FlakyTestAttributesFlakyState flakyState;

  public static final String JSON_PROPERTY_LAST_FLAKED_BRANCH = "last_flaked_branch";
  private String lastFlakedBranch;

  public static final String JSON_PROPERTY_LAST_FLAKED_SHA = "last_flaked_sha";
  private String lastFlakedSha;

  public static final String JSON_PROPERTY_LAST_FLAKED_TS = "last_flaked_ts";
  private Long lastFlakedTs;

  public static final String JSON_PROPERTY_MODULE = "module";
  private JsonNullable<String> module = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PIPELINE_STATS = "pipeline_stats";
  private FlakyTestPipelineStats pipelineStats;

  public static final String JSON_PROPERTY_SERVICES = "services";
  private List<String> services = null;

  public static final String JSON_PROPERTY_SUITE = "suite";
  private String suite;

  public static final String JSON_PROPERTY_TEST_RUN_METADATA = "test_run_metadata";
  private FlakyTestRunMetadata testRunMetadata;

  public static final String JSON_PROPERTY_TEST_STATS = "test_stats";
  private FlakyTestStats testStats;

  public FlakyTestAttributes attemptToFixId(String attemptToFixId) {
    this.attemptToFixId = attemptToFixId;
    return this;
  }

  /**
   * Unique identifier for the attempt to fix this flaky test. Use this ID in the Git commit message
   * in order to trigger the attempt to fix workflow.
   *
   * <p>When the workflow is triggered the test is automatically retried by the tracer a certain
   * number of configurable times. When all retries pass, the test is automatically marked as fixed
   * in Flaky Test Management. Test runs are tagged with @test.test_management.attempt_to_fix_passed
   * and @test.test_management.is_attempt_to_fix when the attempt to fix workflow is triggered.
   *
   * @return attemptToFixId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTEMPT_TO_FIX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAttemptToFixId() {
    return attemptToFixId;
  }

  public void setAttemptToFixId(String attemptToFixId) {
    this.attemptToFixId = attemptToFixId;
  }

  public FlakyTestAttributes codeowners(List<String> codeowners) {
    this.codeowners = codeowners;
    return this;
  }

  public FlakyTestAttributes addCodeownersItem(String codeownersItem) {
    if (this.codeowners == null) {
      this.codeowners = new ArrayList<>();
    }
    this.codeowners.add(codeownersItem);
    return this;
  }

  /**
   * The name of the test's code owners as inferred from the repository configuration.
   *
   * @return codeowners
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODEOWNERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getCodeowners() {
    return codeowners;
  }

  public void setCodeowners(List<String> codeowners) {
    this.codeowners = codeowners;
  }

  public FlakyTestAttributes envs(List<String> envs) {
    this.envs = envs;
    return this;
  }

  public FlakyTestAttributes addEnvsItem(String envsItem) {
    if (this.envs == null) {
      this.envs = new ArrayList<>();
    }
    this.envs.add(envsItem);
    return this;
  }

  /**
   * List of environments where this test has been flaky.
   *
   * @return envs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENVS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getEnvs() {
    return envs;
  }

  public void setEnvs(List<String> envs) {
    this.envs = envs;
  }

  public FlakyTestAttributes firstFlakedBranch(String firstFlakedBranch) {
    this.firstFlakedBranch = firstFlakedBranch;
    return this;
  }

  /**
   * The branch name where the test exhibited flakiness for the first time.
   *
   * @return firstFlakedBranch
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_FLAKED_BRANCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFirstFlakedBranch() {
    return firstFlakedBranch;
  }

  public void setFirstFlakedBranch(String firstFlakedBranch) {
    this.firstFlakedBranch = firstFlakedBranch;
  }

  public FlakyTestAttributes firstFlakedSha(String firstFlakedSha) {
    this.firstFlakedSha = firstFlakedSha;
    return this;
  }

  /**
   * The commit SHA where the test exhibited flakiness for the first time.
   *
   * @return firstFlakedSha
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_FLAKED_SHA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFirstFlakedSha() {
    return firstFlakedSha;
  }

  public void setFirstFlakedSha(String firstFlakedSha) {
    this.firstFlakedSha = firstFlakedSha;
  }

  public FlakyTestAttributes firstFlakedTs(Long firstFlakedTs) {
    this.firstFlakedTs = firstFlakedTs;
    return this;
  }

  /**
   * Unix timestamp when the test exhibited flakiness for the first time.
   *
   * @return firstFlakedTs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_FLAKED_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFirstFlakedTs() {
    return firstFlakedTs;
  }

  public void setFirstFlakedTs(Long firstFlakedTs) {
    this.firstFlakedTs = firstFlakedTs;
  }

  public FlakyTestAttributes flakyCategory(String flakyCategory) {
    this.flakyCategory = JsonNullable.<String>of(flakyCategory);
    return this;
  }

  /**
   * The category of a flaky test.
   *
   * @return flakyCategory
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getFlakyCategory() {
    return flakyCategory.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FLAKY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getFlakyCategory_JsonNullable() {
    return flakyCategory;
  }

  @JsonProperty(JSON_PROPERTY_FLAKY_CATEGORY)
  public void setFlakyCategory_JsonNullable(JsonNullable<String> flakyCategory) {
    this.flakyCategory = flakyCategory;
  }

  public void setFlakyCategory(String flakyCategory) {
    this.flakyCategory = JsonNullable.<String>of(flakyCategory);
  }

  public FlakyTestAttributes flakyState(FlakyTestAttributesFlakyState flakyState) {
    this.flakyState = flakyState;
    this.unparsed |= !flakyState.isValid();
    return this;
  }

  /**
   * The current state of the flaky test.
   *
   * @return flakyState
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FLAKY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FlakyTestAttributesFlakyState getFlakyState() {
    return flakyState;
  }

  public void setFlakyState(FlakyTestAttributesFlakyState flakyState) {
    if (!flakyState.isValid()) {
      this.unparsed = true;
    }
    this.flakyState = flakyState;
  }

  public FlakyTestAttributes lastFlakedBranch(String lastFlakedBranch) {
    this.lastFlakedBranch = lastFlakedBranch;
    return this;
  }

  /**
   * The branch name where the test exhibited flakiness for the last time.
   *
   * @return lastFlakedBranch
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_FLAKED_BRANCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLastFlakedBranch() {
    return lastFlakedBranch;
  }

  public void setLastFlakedBranch(String lastFlakedBranch) {
    this.lastFlakedBranch = lastFlakedBranch;
  }

  public FlakyTestAttributes lastFlakedSha(String lastFlakedSha) {
    this.lastFlakedSha = lastFlakedSha;
    return this;
  }

  /**
   * The commit SHA where the test exhibited flakiness for the last time.
   *
   * @return lastFlakedSha
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_FLAKED_SHA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLastFlakedSha() {
    return lastFlakedSha;
  }

  public void setLastFlakedSha(String lastFlakedSha) {
    this.lastFlakedSha = lastFlakedSha;
  }

  public FlakyTestAttributes lastFlakedTs(Long lastFlakedTs) {
    this.lastFlakedTs = lastFlakedTs;
    return this;
  }

  /**
   * Unix timestamp when the test exhibited flakiness for the last time.
   *
   * @return lastFlakedTs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_FLAKED_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLastFlakedTs() {
    return lastFlakedTs;
  }

  public void setLastFlakedTs(Long lastFlakedTs) {
    this.lastFlakedTs = lastFlakedTs;
  }

  public FlakyTestAttributes module(String module) {
    this.module = JsonNullable.<String>of(module);
    return this;
  }

  /**
   * The name of the test module. The definition of module changes slightly per language: - In .NET,
   * a test module groups every test that is run under the same unit test project. - In Swift, a
   * test module groups every test that is run for a given bundle. - In JavaScript, the test modules
   * map one-to-one to test sessions. - In Java, a test module groups every test that is run by the
   * same Maven Surefire/Failsafe or Gradle Test task execution. - In Python, a test module groups
   * every test that is run under the same <code>.py</code> file as part of a test suite, which is
   * typically managed by a framework like <code>unittest</code> or <code>pytest</code>. - In Ruby,
   * a test module groups every test that is run within the same test file, which is typically
   * managed by a framework like <code>RSpec</code> or <code>Minitest</code>.
   *
   * @return module
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getModule() {
    return module.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MODULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getModule_JsonNullable() {
    return module;
  }

  @JsonProperty(JSON_PROPERTY_MODULE)
  public void setModule_JsonNullable(JsonNullable<String> module) {
    this.module = module;
  }

  public void setModule(String module) {
    this.module = JsonNullable.<String>of(module);
  }

  public FlakyTestAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The test name. A concise name for a test case. Defined in the test itself.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FlakyTestAttributes pipelineStats(FlakyTestPipelineStats pipelineStats) {
    this.pipelineStats = pipelineStats;
    this.unparsed |= pipelineStats.unparsed;
    return this;
  }

  /**
   * CI pipeline related statistics for the flaky test. This information is only available if test
   * runs are associated with CI pipeline events from CI Visibility.
   *
   * @return pipelineStats
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PIPELINE_STATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FlakyTestPipelineStats getPipelineStats() {
    return pipelineStats;
  }

  public void setPipelineStats(FlakyTestPipelineStats pipelineStats) {
    this.pipelineStats = pipelineStats;
  }

  public FlakyTestAttributes services(List<String> services) {
    this.services = services;
    return this;
  }

  public FlakyTestAttributes addServicesItem(String servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<>();
    }
    this.services.add(servicesItem);
    return this;
  }

  /**
   * List of test service names where this test has been flaky.
   *
   * <p>A test service is a group of tests associated with a project or repository. It contains all
   * the individual tests for your code, optionally organized into test suites, which are like
   * folders for your tests.
   *
   * @return services
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getServices() {
    return services;
  }

  public void setServices(List<String> services) {
    this.services = services;
  }

  public FlakyTestAttributes suite(String suite) {
    this.suite = suite;
    return this;
  }

  /**
   * The name of the test suite. A group of tests exercising the same unit of code depending on your
   * language and testing framework.
   *
   * @return suite
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSuite() {
    return suite;
  }

  public void setSuite(String suite) {
    this.suite = suite;
  }

  public FlakyTestAttributes testRunMetadata(FlakyTestRunMetadata testRunMetadata) {
    this.testRunMetadata = testRunMetadata;
    this.unparsed |= testRunMetadata.unparsed;
    return this;
  }

  /**
   * Metadata about the latest failed test run of the flaky test.
   *
   * @return testRunMetadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_RUN_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FlakyTestRunMetadata getTestRunMetadata() {
    return testRunMetadata;
  }

  public void setTestRunMetadata(FlakyTestRunMetadata testRunMetadata) {
    this.testRunMetadata = testRunMetadata;
  }

  public FlakyTestAttributes testStats(FlakyTestStats testStats) {
    this.testStats = testStats;
    this.unparsed |= testStats.unparsed;
    return this;
  }

  /**
   * Test statistics for the flaky test.
   *
   * @return testStats
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_STATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FlakyTestStats getTestStats() {
    return testStats;
  }

  public void setTestStats(FlakyTestStats testStats) {
    this.testStats = testStats;
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
   * @return FlakyTestAttributes
   */
  @JsonAnySetter
  public FlakyTestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FlakyTestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlakyTestAttributes flakyTestAttributes = (FlakyTestAttributes) o;
    return Objects.equals(this.attemptToFixId, flakyTestAttributes.attemptToFixId)
        && Objects.equals(this.codeowners, flakyTestAttributes.codeowners)
        && Objects.equals(this.envs, flakyTestAttributes.envs)
        && Objects.equals(this.firstFlakedBranch, flakyTestAttributes.firstFlakedBranch)
        && Objects.equals(this.firstFlakedSha, flakyTestAttributes.firstFlakedSha)
        && Objects.equals(this.firstFlakedTs, flakyTestAttributes.firstFlakedTs)
        && Objects.equals(this.flakyCategory, flakyTestAttributes.flakyCategory)
        && Objects.equals(this.flakyState, flakyTestAttributes.flakyState)
        && Objects.equals(this.lastFlakedBranch, flakyTestAttributes.lastFlakedBranch)
        && Objects.equals(this.lastFlakedSha, flakyTestAttributes.lastFlakedSha)
        && Objects.equals(this.lastFlakedTs, flakyTestAttributes.lastFlakedTs)
        && Objects.equals(this.module, flakyTestAttributes.module)
        && Objects.equals(this.name, flakyTestAttributes.name)
        && Objects.equals(this.pipelineStats, flakyTestAttributes.pipelineStats)
        && Objects.equals(this.services, flakyTestAttributes.services)
        && Objects.equals(this.suite, flakyTestAttributes.suite)
        && Objects.equals(this.testRunMetadata, flakyTestAttributes.testRunMetadata)
        && Objects.equals(this.testStats, flakyTestAttributes.testStats)
        && Objects.equals(this.additionalProperties, flakyTestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        attemptToFixId,
        codeowners,
        envs,
        firstFlakedBranch,
        firstFlakedSha,
        firstFlakedTs,
        flakyCategory,
        flakyState,
        lastFlakedBranch,
        lastFlakedSha,
        lastFlakedTs,
        module,
        name,
        pipelineStats,
        services,
        suite,
        testRunMetadata,
        testStats,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlakyTestAttributes {\n");
    sb.append("    attemptToFixId: ").append(toIndentedString(attemptToFixId)).append("\n");
    sb.append("    codeowners: ").append(toIndentedString(codeowners)).append("\n");
    sb.append("    envs: ").append(toIndentedString(envs)).append("\n");
    sb.append("    firstFlakedBranch: ").append(toIndentedString(firstFlakedBranch)).append("\n");
    sb.append("    firstFlakedSha: ").append(toIndentedString(firstFlakedSha)).append("\n");
    sb.append("    firstFlakedTs: ").append(toIndentedString(firstFlakedTs)).append("\n");
    sb.append("    flakyCategory: ").append(toIndentedString(flakyCategory)).append("\n");
    sb.append("    flakyState: ").append(toIndentedString(flakyState)).append("\n");
    sb.append("    lastFlakedBranch: ").append(toIndentedString(lastFlakedBranch)).append("\n");
    sb.append("    lastFlakedSha: ").append(toIndentedString(lastFlakedSha)).append("\n");
    sb.append("    lastFlakedTs: ").append(toIndentedString(lastFlakedTs)).append("\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pipelineStats: ").append(toIndentedString(pipelineStats)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    suite: ").append(toIndentedString(suite)).append("\n");
    sb.append("    testRunMetadata: ").append(toIndentedString(testRunMetadata)).append("\n");
    sb.append("    testStats: ").append(toIndentedString(testStats)).append("\n");
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
