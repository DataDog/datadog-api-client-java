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

/** Attributes of an experiment events response. */
@JsonPropertyOrder({
  LLMObsExperimentEventsV2DataAttributesResponse.JSON_PROPERTY_SPANS,
  LLMObsExperimentEventsV2DataAttributesResponse.JSON_PROPERTY_SUMMARY_METRICS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsExperimentEventsV2DataAttributesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SPANS = "spans";
  private List<LLMObsExperimentSpanWithEvals> spans = new ArrayList<>();

  public static final String JSON_PROPERTY_SUMMARY_METRICS = "summary_metrics";
  private List<LLMObsExperimentEvalMetricEvent> summaryMetrics = new ArrayList<>();

  public LLMObsExperimentEventsV2DataAttributesResponse() {}

  @JsonCreator
  public LLMObsExperimentEventsV2DataAttributesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_SPANS)
          List<LLMObsExperimentSpanWithEvals> spans,
      @JsonProperty(required = true, value = JSON_PROPERTY_SUMMARY_METRICS)
          List<LLMObsExperimentEvalMetricEvent> summaryMetrics) {
    this.spans = spans;
    for (LLMObsExperimentSpanWithEvals item : spans) {
      this.unparsed |= item.unparsed;
    }
    this.summaryMetrics = summaryMetrics;
    for (LLMObsExperimentEvalMetricEvent item : summaryMetrics) {
      this.unparsed |= item.unparsed;
    }
  }

  public LLMObsExperimentEventsV2DataAttributesResponse spans(
      List<LLMObsExperimentSpanWithEvals> spans) {
    this.spans = spans;
    for (LLMObsExperimentSpanWithEvals item : spans) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LLMObsExperimentEventsV2DataAttributesResponse addSpansItem(
      LLMObsExperimentSpanWithEvals spansItem) {
    this.spans.add(spansItem);
    this.unparsed |= spansItem.unparsed;
    return this;
  }

  /**
   * Experiment spans, each enriched with their associated evaluation metrics.
   *
   * @return spans
   */
  @JsonProperty(JSON_PROPERTY_SPANS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<LLMObsExperimentSpanWithEvals> getSpans() {
    return spans;
  }

  public void setSpans(List<LLMObsExperimentSpanWithEvals> spans) {
    this.spans = spans;
    if (spans != null) {
      for (LLMObsExperimentSpanWithEvals item : spans) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public LLMObsExperimentEventsV2DataAttributesResponse summaryMetrics(
      List<LLMObsExperimentEvalMetricEvent> summaryMetrics) {
    this.summaryMetrics = summaryMetrics;
    for (LLMObsExperimentEvalMetricEvent item : summaryMetrics) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LLMObsExperimentEventsV2DataAttributesResponse addSummaryMetricsItem(
      LLMObsExperimentEvalMetricEvent summaryMetricsItem) {
    this.summaryMetrics.add(summaryMetricsItem);
    this.unparsed |= summaryMetricsItem.unparsed;
    return this;
  }

  /**
   * Experiment-level summary evaluation metrics (not tied to individual spans).
   *
   * @return summaryMetrics
   */
  @JsonProperty(JSON_PROPERTY_SUMMARY_METRICS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<LLMObsExperimentEvalMetricEvent> getSummaryMetrics() {
    return summaryMetrics;
  }

  public void setSummaryMetrics(List<LLMObsExperimentEvalMetricEvent> summaryMetrics) {
    this.summaryMetrics = summaryMetrics;
    if (summaryMetrics != null) {
      for (LLMObsExperimentEvalMetricEvent item : summaryMetrics) {
        this.unparsed |= item.unparsed;
      }
    }
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
   * @return LLMObsExperimentEventsV2DataAttributesResponse
   */
  @JsonAnySetter
  public LLMObsExperimentEventsV2DataAttributesResponse putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this LLMObsExperimentEventsV2DataAttributesResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsExperimentEventsV2DataAttributesResponse llmObsExperimentEventsV2DataAttributesResponse =
        (LLMObsExperimentEventsV2DataAttributesResponse) o;
    return Objects.equals(this.spans, llmObsExperimentEventsV2DataAttributesResponse.spans)
        && Objects.equals(
            this.summaryMetrics, llmObsExperimentEventsV2DataAttributesResponse.summaryMetrics)
        && Objects.equals(
            this.additionalProperties,
            llmObsExperimentEventsV2DataAttributesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spans, summaryMetrics, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsExperimentEventsV2DataAttributesResponse {\n");
    sb.append("    spans: ").append(toIndentedString(spans)).append("\n");
    sb.append("    summaryMetrics: ").append(toIndentedString(summaryMetrics)).append("\n");
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
