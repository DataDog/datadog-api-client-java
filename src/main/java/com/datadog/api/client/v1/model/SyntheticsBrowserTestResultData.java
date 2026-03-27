/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>Object containing results for your Synthetic browser test.</p>
 */
@JsonPropertyOrder({
  SyntheticsBrowserTestResultData.JSON_PROPERTY_BROWSER_TYPE,
  SyntheticsBrowserTestResultData.JSON_PROPERTY_BROWSER_VERSION,
  SyntheticsBrowserTestResultData.JSON_PROPERTY_DEVICE,
  SyntheticsBrowserTestResultData.JSON_PROPERTY_DURATION,
  SyntheticsBrowserTestResultData.JSON_PROPERTY_ERROR,
  SyntheticsBrowserTestResultData.JSON_PROPERTY_FAILURE,
  SyntheticsBrowserTestResultData.JSON_PROPERTY_PASSED,
  SyntheticsBrowserTestResultData.JSON_PROPERTY_RECEIVED_EMAIL_COUNT,
  SyntheticsBrowserTestResultData.JSON_PROPERTY_START_URL,
  SyntheticsBrowserTestResultData.JSON_PROPERTY_STEP_DETAILS,
  SyntheticsBrowserTestResultData.JSON_PROPERTY_THUMBNAILS_BUCKET_KEY,
  SyntheticsBrowserTestResultData.JSON_PROPERTY_TIME_TO_INTERACTIVE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsBrowserTestResultData {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_BROWSER_TYPE = "browserType";
  private String browserType;

  public static final String JSON_PROPERTY_BROWSER_VERSION = "browserVersion";
  private String browserVersion;

  public static final String JSON_PROPERTY_DEVICE = "device";
  private SyntheticsDevice device;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Double duration;

  public static final String JSON_PROPERTY_ERROR = "error";
  private String error;

  public static final String JSON_PROPERTY_FAILURE = "failure";
  private SyntheticsBrowserTestResultFailure failure;

  public static final String JSON_PROPERTY_PASSED = "passed";
  private Boolean passed;

  public static final String JSON_PROPERTY_RECEIVED_EMAIL_COUNT = "receivedEmailCount";
  private Long receivedEmailCount;

  public static final String JSON_PROPERTY_START_URL = "startUrl";
  private String startUrl;

  public static final String JSON_PROPERTY_STEP_DETAILS = "stepDetails";
  private List<SyntheticsStepDetail> stepDetails = null;

  public static final String JSON_PROPERTY_THUMBNAILS_BUCKET_KEY = "thumbnailsBucketKey";
  private Boolean thumbnailsBucketKey;

  public static final String JSON_PROPERTY_TIME_TO_INTERACTIVE = "timeToInteractive";
  private Double timeToInteractive;

  public SyntheticsBrowserTestResultData browserType(String browserType) {
    this.browserType = browserType;
    return this;
  }

  /**
   * <p>Type of browser device used for the browser test.</p>
   * @return browserType
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_BROWSER_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getBrowserType() {
        return browserType;
      }
  public void setBrowserType(String browserType) {
    this.browserType = browserType;
  }
  public SyntheticsBrowserTestResultData browserVersion(String browserVersion) {
    this.browserVersion = browserVersion;
    return this;
  }

  /**
   * <p>Browser version used for the browser test.</p>
   * @return browserVersion
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_BROWSER_VERSION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getBrowserVersion() {
        return browserVersion;
      }
  public void setBrowserVersion(String browserVersion) {
    this.browserVersion = browserVersion;
  }
  public SyntheticsBrowserTestResultData device(SyntheticsDevice device) {
    this.device = device;
    this.unparsed |= device.unparsed;
    return this;
  }

  /**
   * <p>Object describing the device used to perform the Synthetic test.</p>
   * @return device
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DEVICE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsDevice getDevice() {
        return device;
      }
  public void setDevice(SyntheticsDevice device) {
    this.device = device;
  }
  public SyntheticsBrowserTestResultData duration(Double duration) {
    this.duration = duration;
    return this;
  }

  /**
   * <p>Global duration in second of the browser test.</p>
   * @return duration
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DURATION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Double getDuration() {
        return duration;
      }
  public void setDuration(Double duration) {
    this.duration = duration;
  }
  public SyntheticsBrowserTestResultData error(String error) {
    this.error = error;
    return this;
  }

  /**
   * <p>Error returned for the browser test.</p>
   * @return error
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ERROR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getError() {
        return error;
      }
  public void setError(String error) {
    this.error = error;
  }
  public SyntheticsBrowserTestResultData failure(SyntheticsBrowserTestResultFailure failure) {
    this.failure = failure;
    this.unparsed |= failure.unparsed;
    return this;
  }

  /**
   * <p>The browser test failure details.</p>
   * @return failure
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FAILURE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsBrowserTestResultFailure getFailure() {
        return failure;
      }
  public void setFailure(SyntheticsBrowserTestResultFailure failure) {
    this.failure = failure;
  }
  public SyntheticsBrowserTestResultData passed(Boolean passed) {
    this.passed = passed;
    return this;
  }

  /**
   * <p>Whether or not the browser test was conducted.</p>
   * @return passed
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PASSED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getPassed() {
        return passed;
      }
  public void setPassed(Boolean passed) {
    this.passed = passed;
  }
  public SyntheticsBrowserTestResultData receivedEmailCount(Long receivedEmailCount) {
    this.receivedEmailCount = receivedEmailCount;
    return this;
  }

  /**
   * <p>The amount of email received during the browser test.</p>
   * @return receivedEmailCount
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RECEIVED_EMAIL_COUNT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getReceivedEmailCount() {
        return receivedEmailCount;
      }
  public void setReceivedEmailCount(Long receivedEmailCount) {
    this.receivedEmailCount = receivedEmailCount;
  }
  public SyntheticsBrowserTestResultData startUrl(String startUrl) {
    this.startUrl = startUrl;
    return this;
  }

  /**
   * <p>Starting URL for the browser test.</p>
   * @return startUrl
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_START_URL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getStartUrl() {
        return startUrl;
      }
  public void setStartUrl(String startUrl) {
    this.startUrl = startUrl;
  }
  public SyntheticsBrowserTestResultData stepDetails(List<SyntheticsStepDetail> stepDetails) {
    this.stepDetails = stepDetails;
    for (SyntheticsStepDetail item : stepDetails) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SyntheticsBrowserTestResultData addStepDetailsItem(SyntheticsStepDetail stepDetailsItem) {
    if (this.stepDetails == null) {
      this.stepDetails = new ArrayList<>();
    }
    this.stepDetails.add(stepDetailsItem);
    this.unparsed |= stepDetailsItem.unparsed;
    return this;
  }

  /**
   * <p>Array containing the different browser test steps.</p>
   * @return stepDetails
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STEP_DETAILS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<SyntheticsStepDetail> getStepDetails() {
        return stepDetails;
      }
  public void setStepDetails(List<SyntheticsStepDetail> stepDetails) {
    this.stepDetails = stepDetails;
  }
  public SyntheticsBrowserTestResultData thumbnailsBucketKey(Boolean thumbnailsBucketKey) {
    this.thumbnailsBucketKey = thumbnailsBucketKey;
    return this;
  }

  /**
   * <p>Whether or not a thumbnail is associated with the browser test.</p>
   * @return thumbnailsBucketKey
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_THUMBNAILS_BUCKET_KEY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getThumbnailsBucketKey() {
        return thumbnailsBucketKey;
      }
  public void setThumbnailsBucketKey(Boolean thumbnailsBucketKey) {
    this.thumbnailsBucketKey = thumbnailsBucketKey;
  }
  public SyntheticsBrowserTestResultData timeToInteractive(Double timeToInteractive) {
    this.timeToInteractive = timeToInteractive;
    return this;
  }

  /**
   * <p>Time in second to wait before the browser test starts after
   * reaching the start URL.</p>
   * @return timeToInteractive
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TIME_TO_INTERACTIVE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Double getTimeToInteractive() {
        return timeToInteractive;
      }
  public void setTimeToInteractive(Double timeToInteractive) {
    this.timeToInteractive = timeToInteractive;
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
   * @return SyntheticsBrowserTestResultData
   */
  @JsonAnySetter
  public SyntheticsBrowserTestResultData putAdditionalProperty(String key, Object value) {
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
   * Return true if this SyntheticsBrowserTestResultData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsBrowserTestResultData syntheticsBrowserTestResultData = (SyntheticsBrowserTestResultData) o;
    return Objects.equals(this.browserType, syntheticsBrowserTestResultData.browserType) && Objects.equals(this.browserVersion, syntheticsBrowserTestResultData.browserVersion) && Objects.equals(this.device, syntheticsBrowserTestResultData.device) && Objects.equals(this.duration, syntheticsBrowserTestResultData.duration) && Objects.equals(this.error, syntheticsBrowserTestResultData.error) && Objects.equals(this.failure, syntheticsBrowserTestResultData.failure) && Objects.equals(this.passed, syntheticsBrowserTestResultData.passed) && Objects.equals(this.receivedEmailCount, syntheticsBrowserTestResultData.receivedEmailCount) && Objects.equals(this.startUrl, syntheticsBrowserTestResultData.startUrl) && Objects.equals(this.stepDetails, syntheticsBrowserTestResultData.stepDetails) && Objects.equals(this.thumbnailsBucketKey, syntheticsBrowserTestResultData.thumbnailsBucketKey) && Objects.equals(this.timeToInteractive, syntheticsBrowserTestResultData.timeToInteractive) && Objects.equals(this.additionalProperties, syntheticsBrowserTestResultData.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(browserType,browserVersion,device,duration,error,failure,passed,receivedEmailCount,startUrl,stepDetails,thumbnailsBucketKey,timeToInteractive, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsBrowserTestResultData {\n");
    sb.append("    browserType: ").append(toIndentedString(browserType)).append("\n");
    sb.append("    browserVersion: ").append(toIndentedString(browserVersion)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    failure: ").append(toIndentedString(failure)).append("\n");
    sb.append("    passed: ").append(toIndentedString(passed)).append("\n");
    sb.append("    receivedEmailCount: ").append(toIndentedString(receivedEmailCount)).append("\n");
    sb.append("    startUrl: ").append(toIndentedString(startUrl)).append("\n");
    sb.append("    stepDetails: ").append(toIndentedString(stepDetails)).append("\n");
    sb.append("    thumbnailsBucketKey: ").append(toIndentedString(thumbnailsBucketKey)).append("\n");
    sb.append("    timeToInteractive: ").append(toIndentedString(timeToInteractive)).append("\n");
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
