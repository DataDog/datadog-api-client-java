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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** A representative session illustrating a replay analysis issue. */
@JsonPropertyOrder({
  ReplayAnalysisRepresentativeSession.JSON_PROPERTY_ISSUE_CATEGORY,
  ReplayAnalysisRepresentativeSession.JSON_PROPERTY_LLM_ANALYSIS_DETAILS,
  ReplayAnalysisRepresentativeSession.JSON_PROPERTY_SCREENSHOT,
  ReplayAnalysisRepresentativeSession.JSON_PROPERTY_SESSION_ID,
  ReplayAnalysisRepresentativeSession.JSON_PROPERTY_SESSION_START_TIMESTAMP_MS,
  ReplayAnalysisRepresentativeSession.JSON_PROPERTY_SIGNALS,
  ReplayAnalysisRepresentativeSession.JSON_PROPERTY_VIEW_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ReplayAnalysisRepresentativeSession {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ISSUE_CATEGORY = "issue_category";
  private String issueCategory;

  public static final String JSON_PROPERTY_LLM_ANALYSIS_DETAILS = "llm_analysis_details";
  private ReplayAnalysisLLMDetails llmAnalysisDetails;

  public static final String JSON_PROPERTY_SCREENSHOT = "screenshot";
  private ReplayAnalysisScreenshot screenshot;

  public static final String JSON_PROPERTY_SESSION_ID = "session_id";
  private String sessionId;

  public static final String JSON_PROPERTY_SESSION_START_TIMESTAMP_MS =
      "session_start_timestamp_ms";
  private Long sessionStartTimestampMs;

  public static final String JSON_PROPERTY_SIGNALS = "signals";
  private List<ReplayAnalysisSignal> signals = new ArrayList<>();

  public static final String JSON_PROPERTY_VIEW_NAME = "view_name";
  private JsonNullable<String> viewName = JsonNullable.<String>undefined();

  public ReplayAnalysisRepresentativeSession() {}

  @JsonCreator
  public ReplayAnalysisRepresentativeSession(
      @JsonProperty(required = true, value = JSON_PROPERTY_ISSUE_CATEGORY) String issueCategory,
      @JsonProperty(required = true, value = JSON_PROPERTY_LLM_ANALYSIS_DETAILS)
          ReplayAnalysisLLMDetails llmAnalysisDetails,
      @JsonProperty(required = true, value = JSON_PROPERTY_SESSION_ID) String sessionId,
      @JsonProperty(required = true, value = JSON_PROPERTY_SESSION_START_TIMESTAMP_MS)
          Long sessionStartTimestampMs,
      @JsonProperty(required = true, value = JSON_PROPERTY_SIGNALS)
          List<ReplayAnalysisSignal> signals) {
    this.issueCategory = issueCategory;
    this.llmAnalysisDetails = llmAnalysisDetails;
    this.unparsed |= llmAnalysisDetails.unparsed;
    this.sessionId = sessionId;
    this.sessionStartTimestampMs = sessionStartTimestampMs;
    this.signals = signals;
  }

  public ReplayAnalysisRepresentativeSession issueCategory(String issueCategory) {
    this.issueCategory = issueCategory;
    return this;
  }

  /**
   * Category of the issue observed in this session.
   *
   * @return issueCategory
   */
  @JsonProperty(JSON_PROPERTY_ISSUE_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getIssueCategory() {
    return issueCategory;
  }

  public void setIssueCategory(String issueCategory) {
    this.issueCategory = issueCategory;
  }

  public ReplayAnalysisRepresentativeSession llmAnalysisDetails(
      ReplayAnalysisLLMDetails llmAnalysisDetails) {
    this.llmAnalysisDetails = llmAnalysisDetails;
    this.unparsed |= llmAnalysisDetails.unparsed;
    return this;
  }

  /**
   * AI-generated analysis details for a replay issue.
   *
   * @return llmAnalysisDetails
   */
  @JsonProperty(JSON_PROPERTY_LLM_ANALYSIS_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ReplayAnalysisLLMDetails getLlmAnalysisDetails() {
    return llmAnalysisDetails;
  }

  public void setLlmAnalysisDetails(ReplayAnalysisLLMDetails llmAnalysisDetails) {
    this.llmAnalysisDetails = llmAnalysisDetails;
  }

  public ReplayAnalysisRepresentativeSession screenshot(ReplayAnalysisScreenshot screenshot) {
    this.screenshot = screenshot;
    this.unparsed |= screenshot.unparsed;
    return this;
  }

  /**
   * A screenshot captured during a replay session.
   *
   * @return screenshot
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCREENSHOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ReplayAnalysisScreenshot getScreenshot() {
    return screenshot;
  }

  public void setScreenshot(ReplayAnalysisScreenshot screenshot) {
    this.screenshot = screenshot;
  }

  public ReplayAnalysisRepresentativeSession sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  /**
   * Unique identifier of the representative session.
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

  public ReplayAnalysisRepresentativeSession sessionStartTimestampMs(Long sessionStartTimestampMs) {
    this.sessionStartTimestampMs = sessionStartTimestampMs;
    return this;
  }

  /**
   * Session start timestamp in milliseconds.
   *
   * @return sessionStartTimestampMs
   */
  @JsonProperty(JSON_PROPERTY_SESSION_START_TIMESTAMP_MS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getSessionStartTimestampMs() {
    return sessionStartTimestampMs;
  }

  public void setSessionStartTimestampMs(Long sessionStartTimestampMs) {
    this.sessionStartTimestampMs = sessionStartTimestampMs;
  }

  public ReplayAnalysisRepresentativeSession signals(List<ReplayAnalysisSignal> signals) {
    this.signals = signals;
    for (ReplayAnalysisSignal item : signals) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ReplayAnalysisRepresentativeSession addSignalsItem(ReplayAnalysisSignal signalsItem) {
    this.signals.add(signalsItem);
    this.unparsed |= signalsItem.unparsed;
    return this;
  }

  /**
   * List of signals observed in the representative session.
   *
   * @return signals
   */
  @JsonProperty(JSON_PROPERTY_SIGNALS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ReplayAnalysisSignal> getSignals() {
    return signals;
  }

  public void setSignals(List<ReplayAnalysisSignal> signals) {
    this.signals = signals;
  }

  public ReplayAnalysisRepresentativeSession viewName(String viewName) {
    this.viewName = JsonNullable.<String>of(viewName);
    return this;
  }

  /**
   * Name of the view where the issue was observed.
   *
   * @return viewName
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getViewName() {
    return viewName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VIEW_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getViewName_JsonNullable() {
    return viewName;
  }

  @JsonProperty(JSON_PROPERTY_VIEW_NAME)
  public void setViewName_JsonNullable(JsonNullable<String> viewName) {
    this.viewName = viewName;
  }

  public void setViewName(String viewName) {
    this.viewName = JsonNullable.<String>of(viewName);
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
   * @return ReplayAnalysisRepresentativeSession
   */
  @JsonAnySetter
  public ReplayAnalysisRepresentativeSession putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ReplayAnalysisRepresentativeSession object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplayAnalysisRepresentativeSession replayAnalysisRepresentativeSession =
        (ReplayAnalysisRepresentativeSession) o;
    return Objects.equals(this.issueCategory, replayAnalysisRepresentativeSession.issueCategory)
        && Objects.equals(
            this.llmAnalysisDetails, replayAnalysisRepresentativeSession.llmAnalysisDetails)
        && Objects.equals(this.screenshot, replayAnalysisRepresentativeSession.screenshot)
        && Objects.equals(this.sessionId, replayAnalysisRepresentativeSession.sessionId)
        && Objects.equals(
            this.sessionStartTimestampMs,
            replayAnalysisRepresentativeSession.sessionStartTimestampMs)
        && Objects.equals(this.signals, replayAnalysisRepresentativeSession.signals)
        && Objects.equals(this.viewName, replayAnalysisRepresentativeSession.viewName)
        && Objects.equals(
            this.additionalProperties, replayAnalysisRepresentativeSession.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        issueCategory,
        llmAnalysisDetails,
        screenshot,
        sessionId,
        sessionStartTimestampMs,
        signals,
        viewName,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplayAnalysisRepresentativeSession {\n");
    sb.append("    issueCategory: ").append(toIndentedString(issueCategory)).append("\n");
    sb.append("    llmAnalysisDetails: ").append(toIndentedString(llmAnalysisDetails)).append("\n");
    sb.append("    screenshot: ").append(toIndentedString(screenshot)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    sessionStartTimestampMs: ")
        .append(toIndentedString(sessionStartTimestampMs))
        .append("\n");
    sb.append("    signals: ").append(toIndentedString(signals)).append("\n");
    sb.append("    viewName: ").append(toIndentedString(viewName)).append("\n");
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
