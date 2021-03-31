/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Object describing the extra options for a Synthetic test. */
@ApiModel(description = "Object describing the extra options for a Synthetic test.")
@JsonPropertyOrder({
  SyntheticsTestOptions.JSON_PROPERTY_ACCEPT_SELF_SIGNED,
  SyntheticsTestOptions.JSON_PROPERTY_ALLOW_INSECURE,
  SyntheticsTestOptions.JSON_PROPERTY_DEVICE_IDS,
  SyntheticsTestOptions.JSON_PROPERTY_DISABLE_CORS,
  SyntheticsTestOptions.JSON_PROPERTY_FOLLOW_REDIRECTS,
  SyntheticsTestOptions.JSON_PROPERTY_MIN_FAILURE_DURATION,
  SyntheticsTestOptions.JSON_PROPERTY_MIN_LOCATION_FAILED,
  SyntheticsTestOptions.JSON_PROPERTY_MONITOR_OPTIONS,
  SyntheticsTestOptions.JSON_PROPERTY_NO_SCREENSHOT,
  SyntheticsTestOptions.JSON_PROPERTY_RETRY,
  SyntheticsTestOptions.JSON_PROPERTY_TICK_EVERY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SyntheticsTestOptions {
  public static final String JSON_PROPERTY_ACCEPT_SELF_SIGNED = "accept_self_signed";
  private Boolean acceptSelfSigned;

  public static final String JSON_PROPERTY_ALLOW_INSECURE = "allow_insecure";
  private Boolean allowInsecure;

  public static final String JSON_PROPERTY_DEVICE_IDS = "device_ids";
  private List<SyntheticsDeviceID> deviceIds = null;

  public static final String JSON_PROPERTY_DISABLE_CORS = "disableCors";
  private Boolean disableCors;

  public static final String JSON_PROPERTY_FOLLOW_REDIRECTS = "follow_redirects";
  private Boolean followRedirects;

  public static final String JSON_PROPERTY_MIN_FAILURE_DURATION = "min_failure_duration";
  private Long minFailureDuration;

  public static final String JSON_PROPERTY_MIN_LOCATION_FAILED = "min_location_failed";
  private Long minLocationFailed;

  public static final String JSON_PROPERTY_MONITOR_OPTIONS = "monitor_options";
  private SyntheticsTestOptionsMonitorOptions monitorOptions;

  public static final String JSON_PROPERTY_NO_SCREENSHOT = "noScreenshot";
  private Boolean noScreenshot;

  public static final String JSON_PROPERTY_RETRY = "retry";
  private SyntheticsTestOptionsRetry retry;

  public static final String JSON_PROPERTY_TICK_EVERY = "tick_every";
  private SyntheticsTickInterval tickEvery;

  public SyntheticsTestOptions acceptSelfSigned(Boolean acceptSelfSigned) {
    this.acceptSelfSigned = acceptSelfSigned;
    return this;
  }

  /**
   * For SSL test, whether or not the test should allow self signed certificates.
   *
   * @return acceptSelfSigned
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "For SSL test, whether or not the test should allow self signed certificates.")
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
   * Allows loading insecure content for an HTTP request.
   *
   * @return allowInsecure
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allows loading insecure content for an HTTP request.")
  @JsonProperty(JSON_PROPERTY_ALLOW_INSECURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAllowInsecure() {
    return allowInsecure;
  }

  public void setAllowInsecure(Boolean allowInsecure) {
    this.allowInsecure = allowInsecure;
  }

  public SyntheticsTestOptions deviceIds(List<SyntheticsDeviceID> deviceIds) {
    this.deviceIds = deviceIds;
    return this;
  }

  public SyntheticsTestOptions addDeviceIdsItem(SyntheticsDeviceID deviceIdsItem) {
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
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "For browser test, array with the different device IDs used to run the test.")
  @JsonProperty(JSON_PROPERTY_DEVICE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsDeviceID> getDeviceIds() {
    return deviceIds;
  }

  public void setDeviceIds(List<SyntheticsDeviceID> deviceIds) {
    this.deviceIds = deviceIds;
  }

  public SyntheticsTestOptions disableCors(Boolean disableCors) {
    this.disableCors = disableCors;
    return this;
  }

  /**
   * Whether or not to disable CORS mechanism. Currently only available for Chrome.
   *
   * @return disableCors
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Whether or not to disable CORS mechanism. Currently only available for Chrome.")
  @JsonProperty(JSON_PROPERTY_DISABLE_CORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDisableCors() {
    return disableCors;
  }

  public void setDisableCors(Boolean disableCors) {
    this.disableCors = disableCors;
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For API HTTP test, whether or not the test should follow redirects.")
  @JsonProperty(JSON_PROPERTY_FOLLOW_REDIRECTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getFollowRedirects() {
    return followRedirects;
  }

  public void setFollowRedirects(Boolean followRedirects) {
    this.followRedirects = followRedirects;
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minimum amount of time in failure required to trigger an alert.")
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minimum number of locations in failure required to trigger an alert.")
  @JsonProperty(JSON_PROPERTY_MIN_LOCATION_FAILED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMinLocationFailed() {
    return minLocationFailed;
  }

  public void setMinLocationFailed(Long minLocationFailed) {
    this.minLocationFailed = minLocationFailed;
  }

  public SyntheticsTestOptions monitorOptions(SyntheticsTestOptionsMonitorOptions monitorOptions) {
    this.monitorOptions = monitorOptions;
    return this;
  }

  /**
   * Get monitorOptions
   *
   * @return monitorOptions
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MONITOR_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestOptionsMonitorOptions getMonitorOptions() {
    return monitorOptions;
  }

  public void setMonitorOptions(SyntheticsTestOptionsMonitorOptions monitorOptions) {
    this.monitorOptions = monitorOptions;
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Prevents saving screenshots of the steps.")
  @JsonProperty(JSON_PROPERTY_NO_SCREENSHOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getNoScreenshot() {
    return noScreenshot;
  }

  public void setNoScreenshot(Boolean noScreenshot) {
    this.noScreenshot = noScreenshot;
  }

  public SyntheticsTestOptions retry(SyntheticsTestOptionsRetry retry) {
    this.retry = retry;
    return this;
  }

  /**
   * Get retry
   *
   * @return retry
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RETRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestOptionsRetry getRetry() {
    return retry;
  }

  public void setRetry(SyntheticsTestOptionsRetry retry) {
    this.retry = retry;
  }

  public SyntheticsTestOptions tickEvery(SyntheticsTickInterval tickEvery) {
    this.tickEvery = tickEvery;
    return this;
  }

  /**
   * Get tickEvery
   *
   * @return tickEvery
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TICK_EVERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTickInterval getTickEvery() {
    return tickEvery;
  }

  public void setTickEvery(SyntheticsTickInterval tickEvery) {
    this.tickEvery = tickEvery;
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
        && Objects.equals(this.deviceIds, syntheticsTestOptions.deviceIds)
        && Objects.equals(this.disableCors, syntheticsTestOptions.disableCors)
        && Objects.equals(this.followRedirects, syntheticsTestOptions.followRedirects)
        && Objects.equals(this.minFailureDuration, syntheticsTestOptions.minFailureDuration)
        && Objects.equals(this.minLocationFailed, syntheticsTestOptions.minLocationFailed)
        && Objects.equals(this.monitorOptions, syntheticsTestOptions.monitorOptions)
        && Objects.equals(this.noScreenshot, syntheticsTestOptions.noScreenshot)
        && Objects.equals(this.retry, syntheticsTestOptions.retry)
        && Objects.equals(this.tickEvery, syntheticsTestOptions.tickEvery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        acceptSelfSigned,
        allowInsecure,
        deviceIds,
        disableCors,
        followRedirects,
        minFailureDuration,
        minLocationFailed,
        monitorOptions,
        noScreenshot,
        retry,
        tickEvery);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestOptions {\n");
    sb.append("    acceptSelfSigned: ").append(toIndentedString(acceptSelfSigned)).append("\n");
    sb.append("    allowInsecure: ").append(toIndentedString(allowInsecure)).append("\n");
    sb.append("    deviceIds: ").append(toIndentedString(deviceIds)).append("\n");
    sb.append("    disableCors: ").append(toIndentedString(disableCors)).append("\n");
    sb.append("    followRedirects: ").append(toIndentedString(followRedirects)).append("\n");
    sb.append("    minFailureDuration: ").append(toIndentedString(minFailureDuration)).append("\n");
    sb.append("    minLocationFailed: ").append(toIndentedString(minLocationFailed)).append("\n");
    sb.append("    monitorOptions: ").append(toIndentedString(monitorOptions)).append("\n");
    sb.append("    noScreenshot: ").append(toIndentedString(noScreenshot)).append("\n");
    sb.append("    retry: ").append(toIndentedString(retry)).append("\n");
    sb.append("    tickEvery: ").append(toIndentedString(tickEvery)).append("\n");
    sb.append("}");
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
