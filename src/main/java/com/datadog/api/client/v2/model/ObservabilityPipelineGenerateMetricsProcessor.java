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

/**
 * The <code>generate_datadog_metrics</code> processor creates custom metrics from logs and sends
 * them to Datadog. Metrics can be counters, gauges, or distributions and optionally grouped by log
 * fields.
 *
 * <p><strong>Supported pipeline types:</strong> logs
 */
@JsonPropertyOrder({
  ObservabilityPipelineGenerateMetricsProcessor.JSON_PROPERTY_DISPLAY_NAME,
  ObservabilityPipelineGenerateMetricsProcessor.JSON_PROPERTY_ENABLED,
  ObservabilityPipelineGenerateMetricsProcessor.JSON_PROPERTY_ID,
  ObservabilityPipelineGenerateMetricsProcessor.JSON_PROPERTY_INCLUDE,
  ObservabilityPipelineGenerateMetricsProcessor.JSON_PROPERTY_METRICS,
  ObservabilityPipelineGenerateMetricsProcessor.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineGenerateMetricsProcessor {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INCLUDE = "include";
  private String include;

  public static final String JSON_PROPERTY_METRICS = "metrics";
  private List<ObservabilityPipelineGeneratedMetric> metrics = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineGenerateMetricsProcessorType type =
      ObservabilityPipelineGenerateMetricsProcessorType.GENERATE_DATADOG_METRICS;

  public ObservabilityPipelineGenerateMetricsProcessor() {}

  @JsonCreator
  public ObservabilityPipelineGenerateMetricsProcessor(
      @JsonProperty(required = true, value = JSON_PROPERTY_ENABLED) Boolean enabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineGenerateMetricsProcessorType type) {
    this.enabled = enabled;
    this.id = id;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineGenerateMetricsProcessor displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The display name for a component.
   *
   * @return displayName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public ObservabilityPipelineGenerateMetricsProcessor enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether this processor is enabled.
   *
   * @return enabled
   */
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public ObservabilityPipelineGenerateMetricsProcessor id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for this component. Used to reference this component in other parts of
   * the pipeline.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ObservabilityPipelineGenerateMetricsProcessor include(String include) {
    this.include = include;
    return this;
  }

  /**
   * A Datadog search query used to determine which logs this processor targets.
   *
   * @return include
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getInclude() {
    return include;
  }

  public void setInclude(String include) {
    this.include = include;
  }

  public ObservabilityPipelineGenerateMetricsProcessor metrics(
      List<ObservabilityPipelineGeneratedMetric> metrics) {
    this.metrics = metrics;
    for (ObservabilityPipelineGeneratedMetric item : metrics) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ObservabilityPipelineGenerateMetricsProcessor addMetricsItem(
      ObservabilityPipelineGeneratedMetric metricsItem) {
    if (this.metrics == null) {
      this.metrics = new ArrayList<>();
    }
    this.metrics.add(metricsItem);
    this.unparsed |= metricsItem.unparsed;
    return this;
  }

  /**
   * Configuration for generating individual metrics.
   *
   * @return metrics
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ObservabilityPipelineGeneratedMetric> getMetrics() {
    return metrics;
  }

  public void setMetrics(List<ObservabilityPipelineGeneratedMetric> metrics) {
    this.metrics = metrics;
  }

  public ObservabilityPipelineGenerateMetricsProcessor type(
      ObservabilityPipelineGenerateMetricsProcessorType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The processor type. Always <code>generate_datadog_metrics</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineGenerateMetricsProcessorType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineGenerateMetricsProcessorType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return ObservabilityPipelineGenerateMetricsProcessor
   */
  @JsonAnySetter
  public ObservabilityPipelineGenerateMetricsProcessor putAdditionalProperty(
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

  /** Return true if this ObservabilityPipelineGenerateMetricsProcessor object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineGenerateMetricsProcessor observabilityPipelineGenerateMetricsProcessor =
        (ObservabilityPipelineGenerateMetricsProcessor) o;
    return Objects.equals(
            this.displayName, observabilityPipelineGenerateMetricsProcessor.displayName)
        && Objects.equals(this.enabled, observabilityPipelineGenerateMetricsProcessor.enabled)
        && Objects.equals(this.id, observabilityPipelineGenerateMetricsProcessor.id)
        && Objects.equals(this.include, observabilityPipelineGenerateMetricsProcessor.include)
        && Objects.equals(this.metrics, observabilityPipelineGenerateMetricsProcessor.metrics)
        && Objects.equals(this.type, observabilityPipelineGenerateMetricsProcessor.type)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineGenerateMetricsProcessor.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, enabled, id, include, metrics, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineGenerateMetricsProcessor {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
