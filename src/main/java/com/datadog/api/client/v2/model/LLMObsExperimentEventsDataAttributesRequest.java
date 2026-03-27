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

/** Attributes for pushing experiment events including spans and metrics. */
@JsonPropertyOrder({
  LLMObsExperimentEventsDataAttributesRequest.JSON_PROPERTY_METRICS,
  LLMObsExperimentEventsDataAttributesRequest.JSON_PROPERTY_SPANS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsExperimentEventsDataAttributesRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_METRICS = "metrics";
  private List<LLMObsExperimentMetric> metrics = null;

  public static final String JSON_PROPERTY_SPANS = "spans";
  private List<LLMObsExperimentSpan> spans = null;

  public LLMObsExperimentEventsDataAttributesRequest metrics(List<LLMObsExperimentMetric> metrics) {
    this.metrics = metrics;
    for (LLMObsExperimentMetric item : metrics) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LLMObsExperimentEventsDataAttributesRequest addMetricsItem(
      LLMObsExperimentMetric metricsItem) {
    if (this.metrics == null) {
      this.metrics = new ArrayList<>();
    }
    this.metrics.add(metricsItem);
    this.unparsed |= metricsItem.unparsed;
    return this;
  }

  /**
   * List of metrics to push for the experiment.
   *
   * @return metrics
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LLMObsExperimentMetric> getMetrics() {
    return metrics;
  }

  public void setMetrics(List<LLMObsExperimentMetric> metrics) {
    this.metrics = metrics;
  }

  public LLMObsExperimentEventsDataAttributesRequest spans(List<LLMObsExperimentSpan> spans) {
    this.spans = spans;
    for (LLMObsExperimentSpan item : spans) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LLMObsExperimentEventsDataAttributesRequest addSpansItem(LLMObsExperimentSpan spansItem) {
    if (this.spans == null) {
      this.spans = new ArrayList<>();
    }
    this.spans.add(spansItem);
    this.unparsed |= spansItem.unparsed;
    return this;
  }

  /**
   * List of spans to push for the experiment.
   *
   * @return spans
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPANS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LLMObsExperimentSpan> getSpans() {
    return spans;
  }

  public void setSpans(List<LLMObsExperimentSpan> spans) {
    this.spans = spans;
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
   * @return LLMObsExperimentEventsDataAttributesRequest
   */
  @JsonAnySetter
  public LLMObsExperimentEventsDataAttributesRequest putAdditionalProperty(
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

  /** Return true if this LLMObsExperimentEventsDataAttributesRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsExperimentEventsDataAttributesRequest llmObsExperimentEventsDataAttributesRequest =
        (LLMObsExperimentEventsDataAttributesRequest) o;
    return Objects.equals(this.metrics, llmObsExperimentEventsDataAttributesRequest.metrics)
        && Objects.equals(this.spans, llmObsExperimentEventsDataAttributesRequest.spans)
        && Objects.equals(
            this.additionalProperties,
            llmObsExperimentEventsDataAttributesRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metrics, spans, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsExperimentEventsDataAttributesRequest {\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    spans: ").append(toIndentedString(spans)).append("\n");
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
