/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
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
  SyntheticsMobileTestOptions.JSON_PROPERTY_ALLOW_APPLICATION_CRASH,
  SyntheticsMobileTestOptions.JSON_PROPERTY_BINDINGS,
  SyntheticsMobileTestOptions.JSON_PROPERTY_CI,
  SyntheticsMobileTestOptions.JSON_PROPERTY_DEFAULT_STEP_TIMEOUT,
  SyntheticsMobileTestOptions.JSON_PROPERTY_DEVICE_IDS,
  SyntheticsMobileTestOptions.JSON_PROPERTY_DISABLE_AUTO_ACCEPT_ALERT,
  SyntheticsMobileTestOptions.JSON_PROPERTY_MIN_FAILURE_DURATION,
  SyntheticsMobileTestOptions.JSON_PROPERTY_MOBILE_APPLICATION,
  SyntheticsMobileTestOptions.JSON_PROPERTY_MONITOR_NAME,
  SyntheticsMobileTestOptions.JSON_PROPERTY_MONITOR_OPTIONS,
  SyntheticsMobileTestOptions.JSON_PROPERTY_MONITOR_PRIORITY,
  SyntheticsMobileTestOptions.JSON_PROPERTY_NO_SCREENSHOT,
  SyntheticsMobileTestOptions.JSON_PROPERTY_RESTRICTED_ROLES,
  SyntheticsMobileTestOptions.JSON_PROPERTY_RETRY,
  SyntheticsMobileTestOptions.JSON_PROPERTY_SCHEDULING,
  SyntheticsMobileTestOptions.JSON_PROPERTY_TICK_EVERY,
  SyntheticsMobileTestOptions.JSON_PROPERTY_VERBOSITY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsMobileTestOptions {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALLOW_APPLICATION_CRASH = "allowApplicationCrash";
  private Boolean allowApplicationCrash;

  public static final String JSON_PROPERTY_BINDINGS = "bindings";
  private List<SyntheticsTestRestrictionPolicyBinding> bindings = null;

  public static final String JSON_PROPERTY_CI = "ci";
  private SyntheticsTestCiOptions ci;

  public static final String JSON_PROPERTY_DEFAULT_STEP_TIMEOUT = "defaultStepTimeout";
  private Integer defaultStepTimeout;

  public static final String JSON_PROPERTY_DEVICE_IDS = "device_ids";
  private List<String> deviceIds = new ArrayList<>();

  public static final String JSON_PROPERTY_DISABLE_AUTO_ACCEPT_ALERT = "disableAutoAcceptAlert";
  private Boolean disableAutoAcceptAlert;

  public static final String JSON_PROPERTY_MIN_FAILURE_DURATION = "min_failure_duration";
  private Long minFailureDuration;

  public static final String JSON_PROPERTY_MOBILE_APPLICATION = "mobileApplication";
  private SyntheticsMobileTestsMobileApplication mobileApplication;

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

  public static final String JSON_PROPERTY_SCHEDULING = "scheduling";
  private SyntheticsTestOptionsScheduling scheduling;

  public static final String JSON_PROPERTY_TICK_EVERY = "tick_every";
  private Long tickEvery;

  public static final String JSON_PROPERTY_VERBOSITY = "verbosity";
  private Integer verbosity;

  public SyntheticsMobileTestOptions() {}

  @JsonCreator
  public SyntheticsMobileTestOptions(
      @JsonProperty(required = true, value = JSON_PROPERTY_DEVICE_IDS) List<String> deviceIds,
      @JsonProperty(required = true, value = JSON_PROPERTY_MOBILE_APPLICATION)
          SyntheticsMobileTestsMobileApplication mobileApplication,
      @JsonProperty(required = true, value = JSON_PROPERTY_TICK_EVERY) Long tickEvery) {
    this.deviceIds = deviceIds;
    this.mobileApplication = mobileApplication;
    this.unparsed |= mobileApplication.unparsed;
    this.tickEvery = tickEvery;
  }

  public SyntheticsMobileTestOptions allowApplicationCrash(Boolean allowApplicationCrash) {
    this.allowApplicationCrash = allowApplicationCrash;
    return this;
  }

  /**
   * A boolean to set if an application crash would mark the test as failed.
   *
   * @return allowApplicationCrash
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_APPLICATION_CRASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAllowApplicationCrash() {
    return allowApplicationCrash;
  }

  public void setAllowApplicationCrash(Boolean allowApplicationCrash) {
    this.allowApplicationCrash = allowApplicationCrash;
  }

  public SyntheticsMobileTestOptions bindings(
      List<SyntheticsTestRestrictionPolicyBinding> bindings) {
    this.bindings = bindings;
    for (SyntheticsTestRestrictionPolicyBinding item : bindings) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsMobileTestOptions addBindingsItem(
      SyntheticsTestRestrictionPolicyBinding bindingsItem) {
    if (this.bindings == null) {
      this.bindings = new ArrayList<>();
    }
    this.bindings.add(bindingsItem);
    this.unparsed |= bindingsItem.unparsed;
    return this;
  }

  /**
   * Array of bindings used for the mobile test.
   *
   * @return bindings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BINDINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsTestRestrictionPolicyBinding> getBindings() {
    return bindings;
  }

  public void setBindings(List<SyntheticsTestRestrictionPolicyBinding> bindings) {
    this.bindings = bindings;
  }

  public SyntheticsMobileTestOptions ci(SyntheticsTestCiOptions ci) {
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

  public SyntheticsMobileTestOptions defaultStepTimeout(Integer defaultStepTimeout) {
    this.defaultStepTimeout = defaultStepTimeout;
    return this;
  }

  /**
   * The default timeout for steps in the test (in seconds). minimum: 1 maximum: 300
   *
   * @return defaultStepTimeout
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_STEP_TIMEOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getDefaultStepTimeout() {
    return defaultStepTimeout;
  }

  public void setDefaultStepTimeout(Integer defaultStepTimeout) {
    this.defaultStepTimeout = defaultStepTimeout;
  }

  public SyntheticsMobileTestOptions deviceIds(List<String> deviceIds) {
    this.deviceIds = deviceIds;
    return this;
  }

  public SyntheticsMobileTestOptions addDeviceIdsItem(String deviceIdsItem) {
    this.deviceIds.add(deviceIdsItem);
    return this;
  }

  /**
   * For mobile test, array with the different device IDs used to run the test.
   *
   * @return deviceIds
   */
  @JsonProperty(JSON_PROPERTY_DEVICE_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getDeviceIds() {
    return deviceIds;
  }

  public void setDeviceIds(List<String> deviceIds) {
    this.deviceIds = deviceIds;
  }

  public SyntheticsMobileTestOptions disableAutoAcceptAlert(Boolean disableAutoAcceptAlert) {
    this.disableAutoAcceptAlert = disableAutoAcceptAlert;
    return this;
  }

  /**
   * A boolean to disable auto accepting alerts.
   *
   * @return disableAutoAcceptAlert
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISABLE_AUTO_ACCEPT_ALERT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDisableAutoAcceptAlert() {
    return disableAutoAcceptAlert;
  }

  public void setDisableAutoAcceptAlert(Boolean disableAutoAcceptAlert) {
    this.disableAutoAcceptAlert = disableAutoAcceptAlert;
  }

  public SyntheticsMobileTestOptions minFailureDuration(Long minFailureDuration) {
    this.minFailureDuration = minFailureDuration;
    return this;
  }

  /**
   * Minimum amount of time in failure required to trigger an alert. minimum: 0 maximum: 7200
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

  public SyntheticsMobileTestOptions mobileApplication(
      SyntheticsMobileTestsMobileApplication mobileApplication) {
    this.mobileApplication = mobileApplication;
    this.unparsed |= mobileApplication.unparsed;
    return this;
  }

  /**
   * Mobile application for mobile synthetics test.
   *
   * @return mobileApplication
   */
  @JsonProperty(JSON_PROPERTY_MOBILE_APPLICATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SyntheticsMobileTestsMobileApplication getMobileApplication() {
    return mobileApplication;
  }

  public void setMobileApplication(SyntheticsMobileTestsMobileApplication mobileApplication) {
    this.mobileApplication = mobileApplication;
  }

  public SyntheticsMobileTestOptions monitorName(String monitorName) {
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

  public SyntheticsMobileTestOptions monitorOptions(
      SyntheticsTestOptionsMonitorOptions monitorOptions) {
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

  public SyntheticsMobileTestOptions monitorPriority(Integer monitorPriority) {
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

  public SyntheticsMobileTestOptions noScreenshot(Boolean noScreenshot) {
    this.noScreenshot = noScreenshot;
    return this;
  }

  /**
   * A boolean set to not take a screenshot for the step.
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

  public SyntheticsMobileTestOptions restrictedRoles(List<String> restrictedRoles) {
    this.restrictedRoles = restrictedRoles;
    return this;
  }

  public SyntheticsMobileTestOptions addRestrictedRolesItem(String restrictedRolesItem) {
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

  public SyntheticsMobileTestOptions retry(SyntheticsTestOptionsRetry retry) {
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

  public SyntheticsMobileTestOptions scheduling(SyntheticsTestOptionsScheduling scheduling) {
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

  public SyntheticsMobileTestOptions tickEvery(Long tickEvery) {
    this.tickEvery = tickEvery;
    return this;
  }

  /**
   * The frequency at which to run the Synthetic test (in seconds). minimum: 300 maximum: 604800
   *
   * @return tickEvery
   */
  @JsonProperty(JSON_PROPERTY_TICK_EVERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTickEvery() {
    return tickEvery;
  }

  public void setTickEvery(Long tickEvery) {
    this.tickEvery = tickEvery;
  }

  public SyntheticsMobileTestOptions verbosity(Integer verbosity) {
    this.verbosity = verbosity;
    return this;
  }

  /**
   * The level of verbosity for the mobile test. This field can not be set by a user. minimum: 0
   * maximum: 5
   *
   * @return verbosity
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERBOSITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getVerbosity() {
    return verbosity;
  }

  public void setVerbosity(Integer verbosity) {
    this.verbosity = verbosity;
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
   * @return SyntheticsMobileTestOptions
   */
  @JsonAnySetter
  public SyntheticsMobileTestOptions putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsMobileTestOptions object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsMobileTestOptions syntheticsMobileTestOptions = (SyntheticsMobileTestOptions) o;
    return Objects.equals(
            this.allowApplicationCrash, syntheticsMobileTestOptions.allowApplicationCrash)
        && Objects.equals(this.bindings, syntheticsMobileTestOptions.bindings)
        && Objects.equals(this.ci, syntheticsMobileTestOptions.ci)
        && Objects.equals(this.defaultStepTimeout, syntheticsMobileTestOptions.defaultStepTimeout)
        && Objects.equals(this.deviceIds, syntheticsMobileTestOptions.deviceIds)
        && Objects.equals(
            this.disableAutoAcceptAlert, syntheticsMobileTestOptions.disableAutoAcceptAlert)
        && Objects.equals(this.minFailureDuration, syntheticsMobileTestOptions.minFailureDuration)
        && Objects.equals(this.mobileApplication, syntheticsMobileTestOptions.mobileApplication)
        && Objects.equals(this.monitorName, syntheticsMobileTestOptions.monitorName)
        && Objects.equals(this.monitorOptions, syntheticsMobileTestOptions.monitorOptions)
        && Objects.equals(this.monitorPriority, syntheticsMobileTestOptions.monitorPriority)
        && Objects.equals(this.noScreenshot, syntheticsMobileTestOptions.noScreenshot)
        && Objects.equals(this.restrictedRoles, syntheticsMobileTestOptions.restrictedRoles)
        && Objects.equals(this.retry, syntheticsMobileTestOptions.retry)
        && Objects.equals(this.scheduling, syntheticsMobileTestOptions.scheduling)
        && Objects.equals(this.tickEvery, syntheticsMobileTestOptions.tickEvery)
        && Objects.equals(this.verbosity, syntheticsMobileTestOptions.verbosity)
        && Objects.equals(
            this.additionalProperties, syntheticsMobileTestOptions.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allowApplicationCrash,
        bindings,
        ci,
        defaultStepTimeout,
        deviceIds,
        disableAutoAcceptAlert,
        minFailureDuration,
        mobileApplication,
        monitorName,
        monitorOptions,
        monitorPriority,
        noScreenshot,
        restrictedRoles,
        retry,
        scheduling,
        tickEvery,
        verbosity,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsMobileTestOptions {\n");
    sb.append("    allowApplicationCrash: ")
        .append(toIndentedString(allowApplicationCrash))
        .append("\n");
    sb.append("    bindings: ").append(toIndentedString(bindings)).append("\n");
    sb.append("    ci: ").append(toIndentedString(ci)).append("\n");
    sb.append("    defaultStepTimeout: ").append(toIndentedString(defaultStepTimeout)).append("\n");
    sb.append("    deviceIds: ").append(toIndentedString(deviceIds)).append("\n");
    sb.append("    disableAutoAcceptAlert: ")
        .append(toIndentedString(disableAutoAcceptAlert))
        .append("\n");
    sb.append("    minFailureDuration: ").append(toIndentedString(minFailureDuration)).append("\n");
    sb.append("    mobileApplication: ").append(toIndentedString(mobileApplication)).append("\n");
    sb.append("    monitorName: ").append(toIndentedString(monitorName)).append("\n");
    sb.append("    monitorOptions: ").append(toIndentedString(monitorOptions)).append("\n");
    sb.append("    monitorPriority: ").append(toIndentedString(monitorPriority)).append("\n");
    sb.append("    noScreenshot: ").append(toIndentedString(noScreenshot)).append("\n");
    sb.append("    restrictedRoles: ").append(toIndentedString(restrictedRoles)).append("\n");
    sb.append("    retry: ").append(toIndentedString(retry)).append("\n");
    sb.append("    scheduling: ").append(toIndentedString(scheduling)).append("\n");
    sb.append("    tickEvery: ").append(toIndentedString(tickEvery)).append("\n");
    sb.append("    verbosity: ").append(toIndentedString(verbosity)).append("\n");
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
