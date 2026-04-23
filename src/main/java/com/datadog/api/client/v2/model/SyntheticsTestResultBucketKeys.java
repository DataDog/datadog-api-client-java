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

/** Storage bucket keys for artifacts produced during a step or test. */
@JsonPropertyOrder({
  SyntheticsTestResultBucketKeys.JSON_PROPERTY_AFTER_STEP_SCREENSHOT,
  SyntheticsTestResultBucketKeys.JSON_PROPERTY_AFTER_TURN_SCREENSHOT,
  SyntheticsTestResultBucketKeys.JSON_PROPERTY_ARTIFACTS,
  SyntheticsTestResultBucketKeys.JSON_PROPERTY_BEFORE_STEP_SCREENSHOT,
  SyntheticsTestResultBucketKeys.JSON_PROPERTY_BEFORE_TURN_SCREENSHOT,
  SyntheticsTestResultBucketKeys.JSON_PROPERTY_CRASH_REPORT,
  SyntheticsTestResultBucketKeys.JSON_PROPERTY_DEVICE_LOGS,
  SyntheticsTestResultBucketKeys.JSON_PROPERTY_EMAIL_MESSAGES,
  SyntheticsTestResultBucketKeys.JSON_PROPERTY_SCREENSHOT,
  SyntheticsTestResultBucketKeys.JSON_PROPERTY_SNAPSHOT,
  SyntheticsTestResultBucketKeys.JSON_PROPERTY_SOURCE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestResultBucketKeys {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AFTER_STEP_SCREENSHOT = "after_step_screenshot";
  private String afterStepScreenshot;

  public static final String JSON_PROPERTY_AFTER_TURN_SCREENSHOT = "after_turn_screenshot";
  private String afterTurnScreenshot;

  public static final String JSON_PROPERTY_ARTIFACTS = "artifacts";
  private String artifacts;

  public static final String JSON_PROPERTY_BEFORE_STEP_SCREENSHOT = "before_step_screenshot";
  private String beforeStepScreenshot;

  public static final String JSON_PROPERTY_BEFORE_TURN_SCREENSHOT = "before_turn_screenshot";
  private String beforeTurnScreenshot;

  public static final String JSON_PROPERTY_CRASH_REPORT = "crash_report";
  private String crashReport;

  public static final String JSON_PROPERTY_DEVICE_LOGS = "device_logs";
  private String deviceLogs;

  public static final String JSON_PROPERTY_EMAIL_MESSAGES = "email_messages";
  private List<String> emailMessages = null;

  public static final String JSON_PROPERTY_SCREENSHOT = "screenshot";
  private String screenshot;

  public static final String JSON_PROPERTY_SNAPSHOT = "snapshot";
  private String snapshot;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source;

  public SyntheticsTestResultBucketKeys afterStepScreenshot(String afterStepScreenshot) {
    this.afterStepScreenshot = afterStepScreenshot;
    return this;
  }

  /**
   * Key for the screenshot captured after the step (goal-based tests).
   *
   * @return afterStepScreenshot
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AFTER_STEP_SCREENSHOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAfterStepScreenshot() {
    return afterStepScreenshot;
  }

  public void setAfterStepScreenshot(String afterStepScreenshot) {
    this.afterStepScreenshot = afterStepScreenshot;
  }

  public SyntheticsTestResultBucketKeys afterTurnScreenshot(String afterTurnScreenshot) {
    this.afterTurnScreenshot = afterTurnScreenshot;
    return this;
  }

  /**
   * Key for the screenshot captured after the turn (goal-based tests).
   *
   * @return afterTurnScreenshot
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AFTER_TURN_SCREENSHOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAfterTurnScreenshot() {
    return afterTurnScreenshot;
  }

  public void setAfterTurnScreenshot(String afterTurnScreenshot) {
    this.afterTurnScreenshot = afterTurnScreenshot;
  }

  public SyntheticsTestResultBucketKeys artifacts(String artifacts) {
    this.artifacts = artifacts;
    return this;
  }

  /**
   * Key for miscellaneous artifacts.
   *
   * @return artifacts
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARTIFACTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getArtifacts() {
    return artifacts;
  }

  public void setArtifacts(String artifacts) {
    this.artifacts = artifacts;
  }

  public SyntheticsTestResultBucketKeys beforeStepScreenshot(String beforeStepScreenshot) {
    this.beforeStepScreenshot = beforeStepScreenshot;
    return this;
  }

  /**
   * Key for the screenshot captured before the step (goal-based tests).
   *
   * @return beforeStepScreenshot
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BEFORE_STEP_SCREENSHOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBeforeStepScreenshot() {
    return beforeStepScreenshot;
  }

  public void setBeforeStepScreenshot(String beforeStepScreenshot) {
    this.beforeStepScreenshot = beforeStepScreenshot;
  }

  public SyntheticsTestResultBucketKeys beforeTurnScreenshot(String beforeTurnScreenshot) {
    this.beforeTurnScreenshot = beforeTurnScreenshot;
    return this;
  }

  /**
   * Key for the screenshot captured before the turn (goal-based tests).
   *
   * @return beforeTurnScreenshot
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BEFORE_TURN_SCREENSHOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBeforeTurnScreenshot() {
    return beforeTurnScreenshot;
  }

  public void setBeforeTurnScreenshot(String beforeTurnScreenshot) {
    this.beforeTurnScreenshot = beforeTurnScreenshot;
  }

  public SyntheticsTestResultBucketKeys crashReport(String crashReport) {
    this.crashReport = crashReport;
    return this;
  }

  /**
   * Key for a captured crash report.
   *
   * @return crashReport
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CRASH_REPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCrashReport() {
    return crashReport;
  }

  public void setCrashReport(String crashReport) {
    this.crashReport = crashReport;
  }

  public SyntheticsTestResultBucketKeys deviceLogs(String deviceLogs) {
    this.deviceLogs = deviceLogs;
    return this;
  }

  /**
   * Key for captured device logs.
   *
   * @return deviceLogs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE_LOGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDeviceLogs() {
    return deviceLogs;
  }

  public void setDeviceLogs(String deviceLogs) {
    this.deviceLogs = deviceLogs;
  }

  public SyntheticsTestResultBucketKeys emailMessages(List<String> emailMessages) {
    this.emailMessages = emailMessages;
    return this;
  }

  public SyntheticsTestResultBucketKeys addEmailMessagesItem(String emailMessagesItem) {
    if (this.emailMessages == null) {
      this.emailMessages = new ArrayList<>();
    }
    this.emailMessages.add(emailMessagesItem);
    return this;
  }

  /**
   * Keys for email message payloads captured by the step.
   *
   * @return emailMessages
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL_MESSAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getEmailMessages() {
    return emailMessages;
  }

  public void setEmailMessages(List<String> emailMessages) {
    this.emailMessages = emailMessages;
  }

  public SyntheticsTestResultBucketKeys screenshot(String screenshot) {
    this.screenshot = screenshot;
    return this;
  }

  /**
   * Key for the captured screenshot.
   *
   * @return screenshot
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCREENSHOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getScreenshot() {
    return screenshot;
  }

  public void setScreenshot(String screenshot) {
    this.screenshot = screenshot;
  }

  public SyntheticsTestResultBucketKeys snapshot(String snapshot) {
    this.snapshot = snapshot;
    return this;
  }

  /**
   * Key for the captured DOM snapshot.
   *
   * @return snapshot
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SNAPSHOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSnapshot() {
    return snapshot;
  }

  public void setSnapshot(String snapshot) {
    this.snapshot = snapshot;
  }

  public SyntheticsTestResultBucketKeys source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Key for the page source or element source.
   *
   * @return source
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
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
   * @return SyntheticsTestResultBucketKeys
   */
  @JsonAnySetter
  public SyntheticsTestResultBucketKeys putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestResultBucketKeys object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestResultBucketKeys syntheticsTestResultBucketKeys =
        (SyntheticsTestResultBucketKeys) o;
    return Objects.equals(
            this.afterStepScreenshot, syntheticsTestResultBucketKeys.afterStepScreenshot)
        && Objects.equals(
            this.afterTurnScreenshot, syntheticsTestResultBucketKeys.afterTurnScreenshot)
        && Objects.equals(this.artifacts, syntheticsTestResultBucketKeys.artifacts)
        && Objects.equals(
            this.beforeStepScreenshot, syntheticsTestResultBucketKeys.beforeStepScreenshot)
        && Objects.equals(
            this.beforeTurnScreenshot, syntheticsTestResultBucketKeys.beforeTurnScreenshot)
        && Objects.equals(this.crashReport, syntheticsTestResultBucketKeys.crashReport)
        && Objects.equals(this.deviceLogs, syntheticsTestResultBucketKeys.deviceLogs)
        && Objects.equals(this.emailMessages, syntheticsTestResultBucketKeys.emailMessages)
        && Objects.equals(this.screenshot, syntheticsTestResultBucketKeys.screenshot)
        && Objects.equals(this.snapshot, syntheticsTestResultBucketKeys.snapshot)
        && Objects.equals(this.source, syntheticsTestResultBucketKeys.source)
        && Objects.equals(
            this.additionalProperties, syntheticsTestResultBucketKeys.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        afterStepScreenshot,
        afterTurnScreenshot,
        artifacts,
        beforeStepScreenshot,
        beforeTurnScreenshot,
        crashReport,
        deviceLogs,
        emailMessages,
        screenshot,
        snapshot,
        source,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestResultBucketKeys {\n");
    sb.append("    afterStepScreenshot: ")
        .append(toIndentedString(afterStepScreenshot))
        .append("\n");
    sb.append("    afterTurnScreenshot: ")
        .append(toIndentedString(afterTurnScreenshot))
        .append("\n");
    sb.append("    artifacts: ").append(toIndentedString(artifacts)).append("\n");
    sb.append("    beforeStepScreenshot: ")
        .append(toIndentedString(beforeStepScreenshot))
        .append("\n");
    sb.append("    beforeTurnScreenshot: ")
        .append(toIndentedString(beforeTurnScreenshot))
        .append("\n");
    sb.append("    crashReport: ").append(toIndentedString(crashReport)).append("\n");
    sb.append("    deviceLogs: ").append(toIndentedString(deviceLogs)).append("\n");
    sb.append("    emailMessages: ").append(toIndentedString(emailMessages)).append("\n");
    sb.append("    screenshot: ").append(toIndentedString(screenshot)).append("\n");
    sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
