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

/** Object describing a step for a Synthetic test. */
@JsonPropertyOrder({
  SyntheticsStepDetail.JSON_PROPERTY_ALLOW_FAILURE,
  SyntheticsStepDetail.JSON_PROPERTY_BROWSER_ERRORS,
  SyntheticsStepDetail.JSON_PROPERTY_CHECK_TYPE,
  SyntheticsStepDetail.JSON_PROPERTY_DESCRIPTION,
  SyntheticsStepDetail.JSON_PROPERTY_DURATION,
  SyntheticsStepDetail.JSON_PROPERTY_ERROR,
  SyntheticsStepDetail.JSON_PROPERTY_FAILURE,
  SyntheticsStepDetail.JSON_PROPERTY_PLAYING_TAB,
  SyntheticsStepDetail.JSON_PROPERTY_SCREENSHOT_BUCKET_KEY,
  SyntheticsStepDetail.JSON_PROPERTY_SKIPPED,
  SyntheticsStepDetail.JSON_PROPERTY_SNAPSHOT_BUCKET_KEY,
  SyntheticsStepDetail.JSON_PROPERTY_STEP_ID,
  SyntheticsStepDetail.JSON_PROPERTY_SUB_TEST_STEP_DETAILS,
  SyntheticsStepDetail.JSON_PROPERTY_TIME_TO_INTERACTIVE,
  SyntheticsStepDetail.JSON_PROPERTY_TYPE,
  SyntheticsStepDetail.JSON_PROPERTY_URL,
  SyntheticsStepDetail.JSON_PROPERTY_VALUE,
  SyntheticsStepDetail.JSON_PROPERTY_VITALS_METRICS,
  SyntheticsStepDetail.JSON_PROPERTY_WARNINGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsStepDetail {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALLOW_FAILURE = "allowFailure";
  private Boolean allowFailure;

  public static final String JSON_PROPERTY_BROWSER_ERRORS = "browserErrors";
  private List<SyntheticsBrowserError> browserErrors = null;

  public static final String JSON_PROPERTY_CHECK_TYPE = "checkType";
  private SyntheticsCheckType checkType;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Double duration;

  public static final String JSON_PROPERTY_ERROR = "error";
  private String error;

  public static final String JSON_PROPERTY_FAILURE = "failure";
  private SyntheticsBrowserTestResultFailure failure;

  public static final String JSON_PROPERTY_PLAYING_TAB = "playingTab";
  private SyntheticsPlayingTab playingTab;

  public static final String JSON_PROPERTY_SCREENSHOT_BUCKET_KEY = "screenshotBucketKey";
  private Boolean screenshotBucketKey;

  public static final String JSON_PROPERTY_SKIPPED = "skipped";
  private Boolean skipped;

  public static final String JSON_PROPERTY_SNAPSHOT_BUCKET_KEY = "snapshotBucketKey";
  private Boolean snapshotBucketKey;

  public static final String JSON_PROPERTY_STEP_ID = "stepId";
  private Long stepId;

  public static final String JSON_PROPERTY_SUB_TEST_STEP_DETAILS = "subTestStepDetails";
  private List<SyntheticsStepDetail> subTestStepDetails = null;

  public static final String JSON_PROPERTY_TIME_TO_INTERACTIVE = "timeToInteractive";
  private Double timeToInteractive;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SyntheticsStepType type;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Object value = null;

  public static final String JSON_PROPERTY_VITALS_METRICS = "vitalsMetrics";
  private List<SyntheticsCoreWebVitals> vitalsMetrics = null;

  public static final String JSON_PROPERTY_WARNINGS = "warnings";
  private List<SyntheticsStepDetailWarning> warnings = null;

  public SyntheticsStepDetail allowFailure(Boolean allowFailure) {
    this.allowFailure = allowFailure;
    return this;
  }

  /**
   * Whether or not the step was allowed to fail.
   *
   * @return allowFailure
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_FAILURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAllowFailure() {
    return allowFailure;
  }

  public void setAllowFailure(Boolean allowFailure) {
    this.allowFailure = allowFailure;
  }

  public SyntheticsStepDetail browserErrors(List<SyntheticsBrowserError> browserErrors) {
    this.browserErrors = browserErrors;
    for (SyntheticsBrowserError item : browserErrors) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsStepDetail addBrowserErrorsItem(SyntheticsBrowserError browserErrorsItem) {
    if (this.browserErrors == null) {
      this.browserErrors = new ArrayList<>();
    }
    this.browserErrors.add(browserErrorsItem);
    this.unparsed |= browserErrorsItem.unparsed;
    return this;
  }

  /**
   * Array of errors collected for a browser test.
   *
   * @return browserErrors
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BROWSER_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsBrowserError> getBrowserErrors() {
    return browserErrors;
  }

  public void setBrowserErrors(List<SyntheticsBrowserError> browserErrors) {
    this.browserErrors = browserErrors;
  }

  public SyntheticsStepDetail checkType(SyntheticsCheckType checkType) {
    this.checkType = checkType;
    this.unparsed |= !checkType.isValid();
    return this;
  }

  /**
   * Type of assertion to apply in an API test.
   *
   * @return checkType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHECK_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsCheckType getCheckType() {
    return checkType;
  }

  public void setCheckType(SyntheticsCheckType checkType) {
    if (!checkType.isValid()) {
      this.unparsed = true;
    }
    this.checkType = checkType;
  }

  public SyntheticsStepDetail description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the test.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SyntheticsStepDetail duration(Double duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Total duration in millisecond of the test.
   *
   * @return duration
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDuration() {
    return duration;
  }

  public void setDuration(Double duration) {
    this.duration = duration;
  }

  public SyntheticsStepDetail error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Error returned by the test.
   *
   * @return error
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public SyntheticsStepDetail failure(SyntheticsBrowserTestResultFailure failure) {
    this.failure = failure;
    this.unparsed |= failure.unparsed;
    return this;
  }

  /**
   * The browser test failure details.
   *
   * @return failure
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsBrowserTestResultFailure getFailure() {
    return failure;
  }

  public void setFailure(SyntheticsBrowserTestResultFailure failure) {
    this.failure = failure;
  }

  public SyntheticsStepDetail playingTab(SyntheticsPlayingTab playingTab) {
    this.playingTab = playingTab;
    this.unparsed |= !playingTab.isValid();
    return this;
  }

  /**
   * Navigate between different tabs for your browser test.
   *
   * @return playingTab
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLAYING_TAB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsPlayingTab getPlayingTab() {
    return playingTab;
  }

  public void setPlayingTab(SyntheticsPlayingTab playingTab) {
    if (!playingTab.isValid()) {
      this.unparsed = true;
    }
    this.playingTab = playingTab;
  }

  public SyntheticsStepDetail screenshotBucketKey(Boolean screenshotBucketKey) {
    this.screenshotBucketKey = screenshotBucketKey;
    return this;
  }

  /**
   * Whether or not screenshots where collected by the test.
   *
   * @return screenshotBucketKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCREENSHOT_BUCKET_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getScreenshotBucketKey() {
    return screenshotBucketKey;
  }

  public void setScreenshotBucketKey(Boolean screenshotBucketKey) {
    this.screenshotBucketKey = screenshotBucketKey;
  }

  public SyntheticsStepDetail skipped(Boolean skipped) {
    this.skipped = skipped;
    return this;
  }

  /**
   * Whether or not to skip this step.
   *
   * @return skipped
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SKIPPED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSkipped() {
    return skipped;
  }

  public void setSkipped(Boolean skipped) {
    this.skipped = skipped;
  }

  public SyntheticsStepDetail snapshotBucketKey(Boolean snapshotBucketKey) {
    this.snapshotBucketKey = snapshotBucketKey;
    return this;
  }

  /**
   * Whether or not snapshots where collected by the test.
   *
   * @return snapshotBucketKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SNAPSHOT_BUCKET_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSnapshotBucketKey() {
    return snapshotBucketKey;
  }

  public void setSnapshotBucketKey(Boolean snapshotBucketKey) {
    this.snapshotBucketKey = snapshotBucketKey;
  }

  public SyntheticsStepDetail stepId(Long stepId) {
    this.stepId = stepId;
    return this;
  }

  /**
   * The step ID.
   *
   * @return stepId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STEP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getStepId() {
    return stepId;
  }

  public void setStepId(Long stepId) {
    this.stepId = stepId;
  }

  public SyntheticsStepDetail subTestStepDetails(List<SyntheticsStepDetail> subTestStepDetails) {
    this.subTestStepDetails = subTestStepDetails;
    for (SyntheticsStepDetail item : subTestStepDetails) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsStepDetail addSubTestStepDetailsItem(
      SyntheticsStepDetail subTestStepDetailsItem) {
    if (this.subTestStepDetails == null) {
      this.subTestStepDetails = new ArrayList<>();
    }
    this.subTestStepDetails.add(subTestStepDetailsItem);
    this.unparsed |= subTestStepDetailsItem.unparsed;
    return this;
  }

  /**
   * If this step includes a sub-test. <a
   * href="https://docs.datadoghq.com/synthetics/browser_tests/advanced_options/#subtests">Subtests
   * documentation</a>.
   *
   * @return subTestStepDetails
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUB_TEST_STEP_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsStepDetail> getSubTestStepDetails() {
    return subTestStepDetails;
  }

  public void setSubTestStepDetails(List<SyntheticsStepDetail> subTestStepDetails) {
    this.subTestStepDetails = subTestStepDetails;
  }

  public SyntheticsStepDetail timeToInteractive(Double timeToInteractive) {
    this.timeToInteractive = timeToInteractive;
    return this;
  }

  /**
   * Time before starting the step.
   *
   * @return timeToInteractive
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_TO_INTERACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTimeToInteractive() {
    return timeToInteractive;
  }

  public void setTimeToInteractive(Double timeToInteractive) {
    this.timeToInteractive = timeToInteractive;
  }

  public SyntheticsStepDetail type(SyntheticsStepType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Step type used in your Synthetic test.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsStepType getType() {
    return type;
  }

  public void setType(SyntheticsStepType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public SyntheticsStepDetail url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL to perform the step against.
   *
   * @return url
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public SyntheticsStepDetail value(Object value) {
    this.value = value;
    return this;
  }

  /**
   * Value for the step.
   *
   * @return value
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public SyntheticsStepDetail vitalsMetrics(List<SyntheticsCoreWebVitals> vitalsMetrics) {
    this.vitalsMetrics = vitalsMetrics;
    for (SyntheticsCoreWebVitals item : vitalsMetrics) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsStepDetail addVitalsMetricsItem(SyntheticsCoreWebVitals vitalsMetricsItem) {
    if (this.vitalsMetrics == null) {
      this.vitalsMetrics = new ArrayList<>();
    }
    this.vitalsMetrics.add(vitalsMetricsItem);
    this.unparsed |= vitalsMetricsItem.unparsed;
    return this;
  }

  /**
   * Array of Core Web Vitals metrics for the step.
   *
   * @return vitalsMetrics
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VITALS_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsCoreWebVitals> getVitalsMetrics() {
    return vitalsMetrics;
  }

  public void setVitalsMetrics(List<SyntheticsCoreWebVitals> vitalsMetrics) {
    this.vitalsMetrics = vitalsMetrics;
  }

  public SyntheticsStepDetail warnings(List<SyntheticsStepDetailWarning> warnings) {
    this.warnings = warnings;
    for (SyntheticsStepDetailWarning item : warnings) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsStepDetail addWarningsItem(SyntheticsStepDetailWarning warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    this.unparsed |= warningsItem.unparsed;
    return this;
  }

  /**
   * Warning collected that didn't failed the step.
   *
   * @return warnings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsStepDetailWarning> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<SyntheticsStepDetailWarning> warnings) {
    this.warnings = warnings;
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
   * @return SyntheticsStepDetail
   */
  @JsonAnySetter
  public SyntheticsStepDetail putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsStepDetail object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsStepDetail syntheticsStepDetail = (SyntheticsStepDetail) o;
    return Objects.equals(this.allowFailure, syntheticsStepDetail.allowFailure)
        && Objects.equals(this.browserErrors, syntheticsStepDetail.browserErrors)
        && Objects.equals(this.checkType, syntheticsStepDetail.checkType)
        && Objects.equals(this.description, syntheticsStepDetail.description)
        && Objects.equals(this.duration, syntheticsStepDetail.duration)
        && Objects.equals(this.error, syntheticsStepDetail.error)
        && Objects.equals(this.failure, syntheticsStepDetail.failure)
        && Objects.equals(this.playingTab, syntheticsStepDetail.playingTab)
        && Objects.equals(this.screenshotBucketKey, syntheticsStepDetail.screenshotBucketKey)
        && Objects.equals(this.skipped, syntheticsStepDetail.skipped)
        && Objects.equals(this.snapshotBucketKey, syntheticsStepDetail.snapshotBucketKey)
        && Objects.equals(this.stepId, syntheticsStepDetail.stepId)
        && Objects.equals(this.subTestStepDetails, syntheticsStepDetail.subTestStepDetails)
        && Objects.equals(this.timeToInteractive, syntheticsStepDetail.timeToInteractive)
        && Objects.equals(this.type, syntheticsStepDetail.type)
        && Objects.equals(this.url, syntheticsStepDetail.url)
        && Objects.equals(this.value, syntheticsStepDetail.value)
        && Objects.equals(this.vitalsMetrics, syntheticsStepDetail.vitalsMetrics)
        && Objects.equals(this.warnings, syntheticsStepDetail.warnings)
        && Objects.equals(this.additionalProperties, syntheticsStepDetail.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allowFailure,
        browserErrors,
        checkType,
        description,
        duration,
        error,
        failure,
        playingTab,
        screenshotBucketKey,
        skipped,
        snapshotBucketKey,
        stepId,
        subTestStepDetails,
        timeToInteractive,
        type,
        url,
        value,
        vitalsMetrics,
        warnings,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsStepDetail {\n");
    sb.append("    allowFailure: ").append(toIndentedString(allowFailure)).append("\n");
    sb.append("    browserErrors: ").append(toIndentedString(browserErrors)).append("\n");
    sb.append("    checkType: ").append(toIndentedString(checkType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    failure: ").append(toIndentedString(failure)).append("\n");
    sb.append("    playingTab: ").append(toIndentedString(playingTab)).append("\n");
    sb.append("    screenshotBucketKey: ")
        .append(toIndentedString(screenshotBucketKey))
        .append("\n");
    sb.append("    skipped: ").append(toIndentedString(skipped)).append("\n");
    sb.append("    snapshotBucketKey: ").append(toIndentedString(snapshotBucketKey)).append("\n");
    sb.append("    stepId: ").append(toIndentedString(stepId)).append("\n");
    sb.append("    subTestStepDetails: ").append(toIndentedString(subTestStepDetails)).append("\n");
    sb.append("    timeToInteractive: ").append(toIndentedString(timeToInteractive)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    vitalsMetrics: ").append(toIndentedString(vitalsMetrics)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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
