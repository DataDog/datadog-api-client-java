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

/** A screenshot captured during a replay session. */
@JsonPropertyOrder({
  ReplayAnalysisScreenshot.JSON_PROPERTY_SCREENSHOT_KEY,
  ReplayAnalysisScreenshot.JSON_PROPERTY_SESSION_ID,
  ReplayAnalysisScreenshot.JSON_PROPERTY_TIMESTAMP_MS,
  ReplayAnalysisScreenshot.JSON_PROPERTY_VIEW_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ReplayAnalysisScreenshot {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SCREENSHOT_KEY = "screenshot_key";
  private String screenshotKey;

  public static final String JSON_PROPERTY_SESSION_ID = "session_id";
  private String sessionId;

  public static final String JSON_PROPERTY_TIMESTAMP_MS = "timestamp_ms";
  private Long timestampMs;

  public static final String JSON_PROPERTY_VIEW_ID = "view_id";
  private String viewId;

  public ReplayAnalysisScreenshot() {}

  @JsonCreator
  public ReplayAnalysisScreenshot(
      @JsonProperty(required = true, value = JSON_PROPERTY_SCREENSHOT_KEY) String screenshotKey,
      @JsonProperty(required = true, value = JSON_PROPERTY_SESSION_ID) String sessionId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIMESTAMP_MS) Long timestampMs,
      @JsonProperty(required = true, value = JSON_PROPERTY_VIEW_ID) String viewId) {
    this.screenshotKey = screenshotKey;
    this.sessionId = sessionId;
    this.timestampMs = timestampMs;
    this.viewId = viewId;
  }

  public ReplayAnalysisScreenshot screenshotKey(String screenshotKey) {
    this.screenshotKey = screenshotKey;
    return this;
  }

  /**
   * Filename or key identifier of the screenshot.
   *
   * @return screenshotKey
   */
  @JsonProperty(JSON_PROPERTY_SCREENSHOT_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getScreenshotKey() {
    return screenshotKey;
  }

  public void setScreenshotKey(String screenshotKey) {
    this.screenshotKey = screenshotKey;
  }

  public ReplayAnalysisScreenshot sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  /**
   * Unique identifier of the session where the screenshot was taken.
   *
   * @return sessionId
   */
  @JsonProperty(JSON_PROPERTY_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  public ReplayAnalysisScreenshot timestampMs(Long timestampMs) {
    this.timestampMs = timestampMs;
    return this;
  }

  /**
   * Timestamp of the screenshot in milliseconds.
   *
   * @return timestampMs
   */
  @JsonProperty(JSON_PROPERTY_TIMESTAMP_MS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTimestampMs() {
    return timestampMs;
  }

  public void setTimestampMs(Long timestampMs) {
    this.timestampMs = timestampMs;
  }

  public ReplayAnalysisScreenshot viewId(String viewId) {
    this.viewId = viewId;
    return this;
  }

  /**
   * Unique identifier of the view where the screenshot was taken.
   *
   * @return viewId
   */
  @JsonProperty(JSON_PROPERTY_VIEW_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getViewId() {
    return viewId;
  }

  public void setViewId(String viewId) {
    this.viewId = viewId;
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
   * @return ReplayAnalysisScreenshot
   */
  @JsonAnySetter
  public ReplayAnalysisScreenshot putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ReplayAnalysisScreenshot object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplayAnalysisScreenshot replayAnalysisScreenshot = (ReplayAnalysisScreenshot) o;
    return Objects.equals(this.screenshotKey, replayAnalysisScreenshot.screenshotKey)
        && Objects.equals(this.sessionId, replayAnalysisScreenshot.sessionId)
        && Objects.equals(this.timestampMs, replayAnalysisScreenshot.timestampMs)
        && Objects.equals(this.viewId, replayAnalysisScreenshot.viewId)
        && Objects.equals(this.additionalProperties, replayAnalysisScreenshot.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(screenshotKey, sessionId, timestampMs, viewId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplayAnalysisScreenshot {\n");
    sb.append("    screenshotKey: ").append(toIndentedString(screenshotKey)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    timestampMs: ").append(toIndentedString(timestampMs)).append("\n");
    sb.append("    viewId: ").append(toIndentedString(viewId)).append("\n");
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
