/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Object describing the extra options for a Synthetic test. */
@JsonPropertyOrder({
  SyntheticsTestOptions.JSON_PROPERTY_ACCEPT_SELF_SIGNED,
  SyntheticsTestOptions.JSON_PROPERTY_ALLOW_INSECURE,
  SyntheticsTestOptions.JSON_PROPERTY_BLOCKED_REQUEST_PATTERNS,
  SyntheticsTestOptions.JSON_PROPERTY_CHECK_CERTIFICATE_REVOCATION,
  SyntheticsTestOptions.JSON_PROPERTY_CI,
  SyntheticsTestOptions.JSON_PROPERTY_DEVICE_IDS,
  SyntheticsTestOptions.JSON_PROPERTY_DISABLE_AIA_INTERMEDIATE_FETCHING,
  SyntheticsTestOptions.JSON_PROPERTY_DISABLE_CORS,
  SyntheticsTestOptions.JSON_PROPERTY_DISABLE_CSP,
  SyntheticsTestOptions.JSON_PROPERTY_ENABLE_PROFILING,
  SyntheticsTestOptions.JSON_PROPERTY_ENABLE_SECURITY_TESTING,
  SyntheticsTestOptions.JSON_PROPERTY_FOLLOW_REDIRECTS,
  SyntheticsTestOptions.JSON_PROPERTY_HTTP_VERSION,
  SyntheticsTestOptions.JSON_PROPERTY_IGNORE_SERVER_CERTIFICATE_ERROR,
  SyntheticsTestOptions.JSON_PROPERTY_INITIAL_NAVIGATION_TIMEOUT,
  SyntheticsTestOptions.JSON_PROPERTY_MIN_FAILURE_DURATION,
  SyntheticsTestOptions.JSON_PROPERTY_MIN_LOCATION_FAILED,
  SyntheticsTestOptions.JSON_PROPERTY_MONITOR_NAME,
  SyntheticsTestOptions.JSON_PROPERTY_MONITOR_OPTIONS,
  SyntheticsTestOptions.JSON_PROPERTY_MONITOR_PRIORITY,
  SyntheticsTestOptions.JSON_PROPERTY_NO_SCREENSHOT,
  SyntheticsTestOptions.JSON_PROPERTY_RESTRICTED_ROLES,
  SyntheticsTestOptions.JSON_PROPERTY_RETRY,
  SyntheticsTestOptions.JSON_PROPERTY_RUM_SETTINGS,
  SyntheticsTestOptions.JSON_PROPERTY_SCHEDULING,
  SyntheticsTestOptions.JSON_PROPERTY_TICK_EVERY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestOptions {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCEPT_SELF_SIGNED = "accept_self_signed";
  private Boolean acceptSelfSigned;

  public static final String JSON_PROPERTY_ALLOW_INSECURE = "allow_insecure";
  private Boolean allowInsecure;

  public static final String JSON_PROPERTY_BLOCKED_REQUEST_PATTERNS = "blockedRequestPatterns";
  private List<String> blockedRequestPatterns = null;

  public static final String JSON_PROPERTY_CHECK_CERTIFICATE_REVOCATION =
      "checkCertificateRevocation";
  private Boolean checkCertificateRevocation;

  public static final String JSON_PROPERTY_CI = "ci";
  private SyntheticsTestCiOptions ci;

  public static final String JSON_PROPERTY_DEVICE_IDS = "device_ids";
  private List<String> deviceIds = null;

  public static final String JSON_PROPERTY_DISABLE_AIA_INTERMEDIATE_FETCHING =
      "disableAiaIntermediateFetching";
  private Boolean disableAiaIntermediateFetching;

  public static final String JSON_PROPERTY_DISABLE_CORS = "disableCors";
  private Boolean disableCors;

  public static final String JSON_PROPERTY_DISABLE_CSP = "disableCsp";
  private Boolean disableCsp;

  public static final String JSON_PROPERTY_ENABLE_PROFILING = "enableProfiling";
  private Boolean enableProfiling;

  public static final String JSON_PROPERTY_ENABLE_SECURITY_TESTING = "enableSecurityTesting";
  private Boolean enableSecurityTesting;

  public static final String JSON_PROPERTY_FOLLOW_REDIRECTS = "follow_redirects";
  private Boolean followRedirects;

  public static final String JSON_PROPERTY_HTTP_VERSION = "httpVersion";
  private SyntheticsTestOptionsHTTPVersion httpVersion;

  public static final String JSON_PROPERTY_IGNORE_SERVER_CERTIFICATE_ERROR =
      "ignoreServerCertificateError";
  private Boolean ignoreServerCertificateError;

  public static final String JSON_PROPERTY_INITIAL_NAVIGATION_TIMEOUT = "initialNavigationTimeout";
  private Long initialNavigationTimeout;

  public static final String JSON_PROPERTY_MIN_FAILURE_DURATION = "min_failure_duration";
  private Long minFailureDuration;

  public static final String JSON_PROPERTY_MIN_LOCATION_FAILED = "min_location_failed";
  private Long minLocationFailed;

  public static final String JSON_PROPERTY_MONITOR_NAME = "monitor_name";
  private String monitorName;

  public static final String JSON_PROPERTY_MONITOR_OPTIONS = "monitor_options";
  private SyntheticsTestOptionsMonitorOptions monitorOptions;

  public static final String JSON_PROPERTY_MONITOR_PRIORITY = "monitor_priority";
  private Integer monitorPriority;

  public static final String JSON_PROPERTY_NO_SCREENSHOT = "noScreenshot";
  private Boolean noScreenshot;

  public static final String JSON_PROPERTY_RESTRICTED_ROLES = "restricted_roles";
  private List<String> restrictedRoles = null;

  public static final String JSON_PROPERTY_RETRY = "retry";
  private SyntheticsTestOptionsRetry retry;

  public static final String JSON_PROPERTY_RUM_SETTINGS = "rumSettings";
  private SyntheticsBrowserTestRumSettings rumSettings;

  public static final String JSON_PROPERTY_SCHEDULING = "scheduling";
  private SyntheticsTestOptionsScheduling scheduling;

  public static final String JSON_PROPERTY_TICK_EVERY = "tick_every";
  private Long tickEvery;

  public SyntheticsTestOptions acceptSelfSigned(Boolean acceptSelfSigned) {
    this.acceptSelfSigned = acceptSelfSigned;
    return this;
  }

  /**
   * For SSL tests, whether or not the test should allow self signed certificates.
   *
   * @return acceptSelfSigned
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCEPT_SELF_SIGNED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAcceptSelfSigned() {
    return acceptSelfSigned;
  }

  public void setAcceptSelfSigned(Boolean acceptSelfSigned) {
    this.acceptSelfSigned = acceptSelfSigned;
  }

  public SyntheticsTestOptions allowInsecure(Boolean allowInsecure) {
    this.allowInsecure = allowInsecure;
    return this;
  }

  /**
   * Allows loading insecure content for an HTTP request in an API test.
   *
   * @return allowInsecure
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_INSECURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAllowInsecure() {
    return allowInsecure;
  }

  public void setAllowInsecure(Boolean allowInsecure) {
    this.allowInsecure = allowInsecure;
  }

  public SyntheticsTestOptions blockedRequestPatterns(List<String> blockedRequestPatterns) {
    this.blockedRequestPatterns = blockedRequestPatterns;
    return this;
  }

  public SyntheticsTestOptions addBlockedRequestPatternsItem(String blockedRequestPatternsItem) {
    if (this.blockedRequestPatterns == null) {
      this.blockedRequestPatterns = new ArrayList<>();
    }
    this.blockedRequestPatterns.add(blockedRequestPatternsItem);
    return this;
  }

  /**
   * Array of URL patterns to block.
   *
   * @return blockedRequestPatterns
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BLOCKED_REQUEST_PATTERNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getBlockedRequestPatterns() {
    return blockedRequestPatterns;
  }

  public void setBlockedRequestPatterns(List<String> blockedRequestPatterns) {
    this.blockedRequestPatterns = blockedRequestPatterns;
  }

  public SyntheticsTestOptions checkCertificateRevocation(Boolean checkCertificateRevocation) {
    this.checkCertificateRevocation = checkCertificateRevocation;
    return this;
  }

  /**
   * For SSL tests, whether or not the test should fail on revoked certificate in stapled OCSP.
   *
   * @return checkCertificateRevocation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHECK_CERTIFICATE_REVOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getCheckCertificateRevocation() {
    return checkCertificateRevocation;
  }

  public void setCheckCertificateRevocation(Boolean checkCertificateRevocation) {
    this.checkCertificateRevocation = checkCertificateRevocation;
  }

  public SyntheticsTestOptions ci(SyntheticsTestCiOptions ci) {
    this.ci = ci;
    this.unparsed |= ci.unparsed;
    return this;
  }

  /**
   * CI/CD options for a Synthetic test.
   *
   * @return ci
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestCiOptions getCi() {
    return ci;
  }

  public void setCi(SyntheticsTestCiOptions ci) {
    this.ci = ci;
  }

  public SyntheticsTestOptions deviceIds(List<String> deviceIds) {
    this.deviceIds = deviceIds;
    return this;
  }

  public SyntheticsTestOptions addDeviceIdsItem(String deviceIdsItem) {
    if (this.deviceIds == null) {
      this.deviceIds = new ArrayList<>();
    }
    this.deviceIds.add(deviceIdsItem);
    return this;
  }

  /**
   * For browser test, array with the different device IDs used to run the test.
   *
   * @return deviceIds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getDeviceIds() {
    return deviceIds;
  }

  public void setDeviceIds(List<String> deviceIds) {
    this.deviceIds = deviceIds;
  }

  public SyntheticsTestOptions disableAiaIntermediateFetching(
      Boolean disableAiaIntermediateFetching) {
    this.disableAiaIntermediateFetching = disableAiaIntermediateFetching;
    return this;
  }

  /**
   * For SSL tests, whether or not the test should disable fetching intermediate certificates from
   * AIA.
   *
   * @return disableAiaIntermediateFetching
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISABLE_AIA_INTERMEDIATE_FETCHING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDisableAiaIntermediateFetching() {
    return disableAiaIntermediateFetching;
  }

  public void setDisableAiaIntermediateFetching(Boolean disableAiaIntermediateFetching) {
    this.disableAiaIntermediateFetching = disableAiaIntermediateFetching;
  }

  public SyntheticsTestOptions disableCors(Boolean disableCors) {
    this.disableCors = disableCors;
    return this;
  }

  /**
   * Whether or not to disable CORS mechanism.
   *
   * @return disableCors
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISABLE_CORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDisableCors() {
    return disableCors;
  }

  public void setDisableCors(Boolean disableCors) {
    this.disableCors = disableCors;
  }

  public SyntheticsTestOptions disableCsp(Boolean disableCsp) {
    this.disableCsp = disableCsp;
    return this;
  }

  /**
   * Disable Content Security Policy for browser tests.
   *
   * @return disableCsp
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISABLE_CSP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDisableCsp() {
    return disableCsp;
  }

  public void setDisableCsp(Boolean disableCsp) {
    this.disableCsp = disableCsp;
  }

  public SyntheticsTestOptions enableProfiling(Boolean enableProfiling) {
    this.enableProfiling = enableProfiling;
    return this;
  }

  /**
   * Enable profiling for browser tests.
   *
   * @return enableProfiling
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLE_PROFILING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnableProfiling() {
    return enableProfiling;
  }

  public void setEnableProfiling(Boolean enableProfiling) {
    this.enableProfiling = enableProfiling;
  }

  public SyntheticsTestOptions enableSecurityTesting(Boolean enableSecurityTesting) {
    this.enableSecurityTesting = enableSecurityTesting;
    return this;
  }

  /**
   * Enable security testing for browser tests. Security testing is not available anymore. This
   * field is deprecated and won't be used.
   *
   * @return enableSecurityTesting
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLE_SECURITY_TESTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnableSecurityTesting() {
    return enableSecurityTesting;
  }

  @Deprecated
  public void setEnableSecurityTesting(Boolean enableSecurityTesting) {
    this.enableSecurityTesting = enableSecurityTesting;
  }

  public SyntheticsTestOptions followRedirects(Boolean followRedirects) {
    this.followRedirects = followRedirects;
    return this;
  }

  /**
   * For API HTTP test, whether or not the test should follow redirects.
   *
   * @return followRedirects
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FOLLOW_REDIRECTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getFollowRedirects() {
    return followRedirects;
  }

  public void setFollowRedirects(Boolean followRedirects) {
    this.followRedirects = followRedirects;
  }

  public SyntheticsTestOptions httpVersion(SyntheticsTestOptionsHTTPVersion httpVersion) {
    this.httpVersion = httpVersion;
    this.unparsed |= !httpVersion.isValid();
    return this;
  }

  /**
   * HTTP version to use for a Synthetic test.
   *
   * @return httpVersion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HTTP_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestOptionsHTTPVersion getHttpVersion() {
    return httpVersion;
  }

  public void setHttpVersion(SyntheticsTestOptionsHTTPVersion httpVersion) {
    if (!httpVersion.isValid()) {
      this.unparsed = true;
    }
    this.httpVersion = httpVersion;
  }

  public SyntheticsTestOptions ignoreServerCertificateError(Boolean ignoreServerCertificateError) {
    this.ignoreServerCertificateError = ignoreServerCertificateError;
    return this;
  }

  /**
   * Ignore server certificate error for browser tests.
   *
   * @return ignoreServerCertificateError
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IGNORE_SERVER_CERTIFICATE_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIgnoreServerCertificateError() {
    return ignoreServerCertificateError;
  }

  public void setIgnoreServerCertificateError(Boolean ignoreServerCertificateError) {
    this.ignoreServerCertificateError = ignoreServerCertificateError;
  }

  public SyntheticsTestOptions initialNavigationTimeout(Long initialNavigationTimeout) {
    this.initialNavigationTimeout = initialNavigationTimeout;
    return this;
  }

  /**
   * Timeout before declaring the initial step as failed (in seconds) for browser tests.
   *
   * @return initialNavigationTimeout
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INITIAL_NAVIGATION_TIMEOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInitialNavigationTimeout() {
    return initialNavigationTimeout;
  }

  public void setInitialNavigationTimeout(Long initialNavigationTimeout) {
    this.initialNavigationTimeout = initialNavigationTimeout;
  }

  public SyntheticsTestOptions minFailureDuration(Long minFailureDuration) {
    this.minFailureDuration = minFailureDuration;
    return this;
  }

  /**
   * Minimum amount of time in failure required to trigger an alert.
   *
   * @return minFailureDuration
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN_FAILURE_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMinFailureDuration() {
    return minFailureDuration;
  }

  public void setMinFailureDuration(Long minFailureDuration) {
    this.minFailureDuration = minFailureDuration;
  }

  public SyntheticsTestOptions minLocationFailed(Long minLocationFailed) {
    this.minLocationFailed = minLocationFailed;
    return this;
  }

  /**
   * Minimum number of locations in failure required to trigger an alert.
   *
   * @return minLocationFailed
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN_LOCATION_FAILED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMinLocationFailed() {
    return minLocationFailed;
  }

  public void setMinLocationFailed(Long minLocationFailed) {
    this.minLocationFailed = minLocationFailed;
  }

  public SyntheticsTestOptions monitorName(String monitorName) {
    this.monitorName = monitorName;
    return this;
  }

  /**
   * The monitor name is used for the alert title as well as for all monitor dashboard widgets and
   * SLOs.
   *
   * @return monitorName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITOR_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMonitorName() {
    return monitorName;
  }

  public void setMonitorName(String monitorName) {
    this.monitorName = monitorName;
  }

  public SyntheticsTestOptions monitorOptions(SyntheticsTestOptionsMonitorOptions monitorOptions) {
    this.monitorOptions = monitorOptions;
    this.unparsed |= monitorOptions.unparsed;
    return this;
  }

  /**
   * Object containing the options for a Synthetic test as a monitor (for example, renotification).
   *
   * @return monitorOptions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITOR_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestOptionsMonitorOptions getMonitorOptions() {
    return monitorOptions;
  }

  public void setMonitorOptions(SyntheticsTestOptionsMonitorOptions monitorOptions) {
    this.monitorOptions = monitorOptions;
  }

  public SyntheticsTestOptions monitorPriority(Integer monitorPriority) {
    this.monitorPriority = monitorPriority;
    return this;
  }

  /**
   * Integer from 1 (high) to 5 (low) indicating alert severity. minimum: 1 maximum: 5
   *
   * @return monitorPriority
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITOR_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getMonitorPriority() {
    return monitorPriority;
  }

  public void setMonitorPriority(Integer monitorPriority) {
    this.monitorPriority = monitorPriority;
  }

  public SyntheticsTestOptions noScreenshot(Boolean noScreenshot) {
    this.noScreenshot = noScreenshot;
    return this;
  }

  /**
   * Prevents saving screenshots of the steps.
   *
   * @return noScreenshot
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NO_SCREENSHOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getNoScreenshot() {
    return noScreenshot;
  }

  public void setNoScreenshot(Boolean noScreenshot) {
    this.noScreenshot = noScreenshot;
  }

  public SyntheticsTestOptions restrictedRoles(List<String> restrictedRoles) {
    this.restrictedRoles = restrictedRoles;
    return this;
  }

  public SyntheticsTestOptions addRestrictedRolesItem(String restrictedRolesItem) {
    if (this.restrictedRoles == null) {
      this.restrictedRoles = new ArrayList<>();
    }
    this.restrictedRoles.add(restrictedRolesItem);
    return this;
  }

  /**
   * A list of role identifiers that can be pulled from the Roles API, for restricting read and
   * write access. This field is deprecated. Use the restriction policies API to manage permissions.
   *
   * @return restrictedRoles
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESTRICTED_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getRestrictedRoles() {
    return restrictedRoles;
  }

  @Deprecated
  public void setRestrictedRoles(List<String> restrictedRoles) {
    this.restrictedRoles = restrictedRoles;
  }

  public SyntheticsTestOptions retry(SyntheticsTestOptionsRetry retry) {
    this.retry = retry;
    this.unparsed |= retry.unparsed;
    return this;
  }

  /**
   * Object describing the retry strategy to apply to a Synthetic test.
   *
   * @return retry
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestOptionsRetry getRetry() {
    return retry;
  }

  public void setRetry(SyntheticsTestOptionsRetry retry) {
    this.retry = retry;
  }

  public SyntheticsTestOptions rumSettings(SyntheticsBrowserTestRumSettings rumSettings) {
    this.rumSettings = rumSettings;
    this.unparsed |= rumSettings.unparsed;
    return this;
  }

  /**
   * The RUM data collection settings for the Synthetic browser test. <strong>Note:</strong> There
   * are 3 ways to format RUM settings:
   *
   * <p><code>{ isEnabled: false }</code> RUM data is not collected.
   *
   * <p><code>{ isEnabled: true }</code> RUM data is collected from the Synthetic test's default
   * application.
   *
   * <p><code>
   * { isEnabled: true, applicationId: "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx", clientTokenId: 12345 }
   * </code> RUM data is collected using the specified application.
   *
   * @return rumSettings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsBrowserTestRumSettings getRumSettings() {
    return rumSettings;
  }

  public void setRumSettings(SyntheticsBrowserTestRumSettings rumSettings) {
    this.rumSettings = rumSettings;
  }

  public SyntheticsTestOptions scheduling(SyntheticsTestOptionsScheduling scheduling) {
    this.scheduling = scheduling;
    this.unparsed |= scheduling.unparsed;
    return this;
  }

  /**
   * Object containing timeframes and timezone used for advanced scheduling.
   *
   * @return scheduling
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEDULING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestOptionsScheduling getScheduling() {
    return scheduling;
  }

  public void setScheduling(SyntheticsTestOptionsScheduling scheduling) {
    this.scheduling = scheduling;
  }

  public SyntheticsTestOptions tickEvery(Long tickEvery) {
    this.tickEvery = tickEvery;
    return this;
  }

  /**
   * The frequency at which to run the Synthetic test (in seconds). minimum: 30 maximum: 604800
   *
   * @return tickEvery
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TICK_EVERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTickEvery() {
    return tickEvery;
  }

  public void setTickEvery(Long tickEvery) {
    this.tickEvery = tickEvery;
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
   * @return SyntheticsTestOptions
   */
  @JsonAnySetter
  public SyntheticsTestOptions putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestOptions object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestOptions syntheticsTestOptions = (SyntheticsTestOptions) o;
    return Objects.equals(this.acceptSelfSigned, syntheticsTestOptions.acceptSelfSigned)
        && Objects.equals(this.allowInsecure, syntheticsTestOptions.allowInsecure)
        && Objects.equals(this.blockedRequestPatterns, syntheticsTestOptions.blockedRequestPatterns)
        && Objects.equals(
            this.checkCertificateRevocation, syntheticsTestOptions.checkCertificateRevocation)
        && Objects.equals(this.ci, syntheticsTestOptions.ci)
        && Objects.equals(this.deviceIds, syntheticsTestOptions.deviceIds)
        && Objects.equals(
            this.disableAiaIntermediateFetching,
            syntheticsTestOptions.disableAiaIntermediateFetching)
        && Objects.equals(this.disableCors, syntheticsTestOptions.disableCors)
        && Objects.equals(this.disableCsp, syntheticsTestOptions.disableCsp)
        && Objects.equals(this.enableProfiling, syntheticsTestOptions.enableProfiling)
        && Objects.equals(this.enableSecurityTesting, syntheticsTestOptions.enableSecurityTesting)
        && Objects.equals(this.followRedirects, syntheticsTestOptions.followRedirects)
        && Objects.equals(this.httpVersion, syntheticsTestOptions.httpVersion)
        && Objects.equals(
            this.ignoreServerCertificateError, syntheticsTestOptions.ignoreServerCertificateError)
        && Objects.equals(
            this.initialNavigationTimeout, syntheticsTestOptions.initialNavigationTimeout)
        && Objects.equals(this.minFailureDuration, syntheticsTestOptions.minFailureDuration)
        && Objects.equals(this.minLocationFailed, syntheticsTestOptions.minLocationFailed)
        && Objects.equals(this.monitorName, syntheticsTestOptions.monitorName)
        && Objects.equals(this.monitorOptions, syntheticsTestOptions.monitorOptions)
        && Objects.equals(this.monitorPriority, syntheticsTestOptions.monitorPriority)
        && Objects.equals(this.noScreenshot, syntheticsTestOptions.noScreenshot)
        && Objects.equals(this.restrictedRoles, syntheticsTestOptions.restrictedRoles)
        && Objects.equals(this.retry, syntheticsTestOptions.retry)
        && Objects.equals(this.rumSettings, syntheticsTestOptions.rumSettings)
        && Objects.equals(this.scheduling, syntheticsTestOptions.scheduling)
        && Objects.equals(this.tickEvery, syntheticsTestOptions.tickEvery)
        && Objects.equals(this.additionalProperties, syntheticsTestOptions.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        acceptSelfSigned,
        allowInsecure,
        blockedRequestPatterns,
        checkCertificateRevocation,
        ci,
        deviceIds,
        disableAiaIntermediateFetching,
        disableCors,
        disableCsp,
        enableProfiling,
        enableSecurityTesting,
        followRedirects,
        httpVersion,
        ignoreServerCertificateError,
        initialNavigationTimeout,
        minFailureDuration,
        minLocationFailed,
        monitorName,
        monitorOptions,
        monitorPriority,
        noScreenshot,
        restrictedRoles,
        retry,
        rumSettings,
        scheduling,
        tickEvery,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestOptions {\n");
    sb.append("    acceptSelfSigned: ").append(toIndentedString(acceptSelfSigned)).append("\n");
    sb.append("    allowInsecure: ").append(toIndentedString(allowInsecure)).append("\n");
    sb.append("    blockedRequestPatterns: ")
        .append(toIndentedString(blockedRequestPatterns))
        .append("\n");
    sb.append("    checkCertificateRevocation: ")
        .append(toIndentedString(checkCertificateRevocation))
        .append("\n");
    sb.append("    ci: ").append(toIndentedString(ci)).append("\n");
    sb.append("    deviceIds: ").append(toIndentedString(deviceIds)).append("\n");
    sb.append("    disableAiaIntermediateFetching: ")
        .append(toIndentedString(disableAiaIntermediateFetching))
        .append("\n");
    sb.append("    disableCors: ").append(toIndentedString(disableCors)).append("\n");
    sb.append("    disableCsp: ").append(toIndentedString(disableCsp)).append("\n");
    sb.append("    enableProfiling: ").append(toIndentedString(enableProfiling)).append("\n");
    sb.append("    enableSecurityTesting: ")
        .append(toIndentedString(enableSecurityTesting))
        .append("\n");
    sb.append("    followRedirects: ").append(toIndentedString(followRedirects)).append("\n");
    sb.append("    httpVersion: ").append(toIndentedString(httpVersion)).append("\n");
    sb.append("    ignoreServerCertificateError: ")
        .append(toIndentedString(ignoreServerCertificateError))
        .append("\n");
    sb.append("    initialNavigationTimeout: ")
        .append(toIndentedString(initialNavigationTimeout))
        .append("\n");
    sb.append("    minFailureDuration: ").append(toIndentedString(minFailureDuration)).append("\n");
    sb.append("    minLocationFailed: ").append(toIndentedString(minLocationFailed)).append("\n");
    sb.append("    monitorName: ").append(toIndentedString(monitorName)).append("\n");
    sb.append("    monitorOptions: ").append(toIndentedString(monitorOptions)).append("\n");
    sb.append("    monitorPriority: ").append(toIndentedString(monitorPriority)).append("\n");
    sb.append("    noScreenshot: ").append(toIndentedString(noScreenshot)).append("\n");
    sb.append("    restrictedRoles: ").append(toIndentedString(restrictedRoles)).append("\n");
    sb.append("    retry: ").append(toIndentedString(retry)).append("\n");
    sb.append("    rumSettings: ").append(toIndentedString(rumSettings)).append("\n");
    sb.append("    scheduling: ").append(toIndentedString(scheduling)).append("\n");
    sb.append("    tickEvery: ").append(toIndentedString(tickEvery)).append("\n");
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
