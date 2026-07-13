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
 * The <code>generate_metrics</code> processor creates custom metrics from logs. Metrics can be
 * counters, gauges, or distributions and optionally grouped by log fields. The generated metrics
 * must be routed to a metrics destination using the input <code>&lt;processor-id&gt;.metrics</code>
 * .
 *
 * <p><strong>Supported pipeline types:</strong> logs
 */
@JsonPropertyOrder({
  ObservabilityPipelineGenerateMetricsV2Processor.JSON_PROPERTY_DISPLAY_NAME,
  ObservabilityPipelineGenerateMetricsV2Processor.JSON_PROPERTY_ENABLED,
  ObservabilityPipelineGenerateMetricsV2Processor.JSON_PROPERTY_ID,
  ObservabilityPipelineGenerateMetricsV2Processor.JSON_PROPERTY_INCLUDE,
  ObservabilityPipelineGenerateMetricsV2Processor.JSON_PROPERTY_METRICS,
  ObservabilityPipelineGenerateMetricsV2Processor.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineGenerateMetricsV2Processor {
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
  private ObservabilityPipelineGenerateMetricsV2ProcessorType type =
      ObservabilityPipelineGenerateMetricsV2ProcessorType.GENERATE_METRICS;

  public ObservabilityPipelineGenerateMetricsV2Processor() {}

  @JsonCreator
  public ObservabilityPipelineGenerateMetricsV2Processor(
      @JsonProperty(required = true, value = JSON_PROPERTY_ENABLED) Boolean enabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineGenerateMetricsV2ProcessorType type) {
    this.enabled = enabled;
    this.id = id;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineGenerateMetricsV2Processor displayName(String displayName) {
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

  public ObservabilityPipelineGenerateMetricsV2Processor enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Indicates whether the processor is enabled.
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

  public ObservabilityPipelineGenerateMetricsV2Processor id(String id) {
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

  public ObservabilityPipelineGenerateMetricsV2Processor include(String include) {
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

  public ObservabilityPipelineGenerateMetricsV2Processor metrics(
      List<ObservabilityPipelineGeneratedMetric> metrics) {
    this.metrics = metrics;
    for (ObservabilityPipelineGeneratedMetric item : metrics) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ObservabilityPipelineGenerateMetricsV2Processor addMetricsItem(
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
    if (metrics != null) {
      for (ObservabilityPipelineGeneratedMetric item : metrics) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ObservabilityPipelineGenerateMetricsV2Processor type(
      ObservabilityPipelineGenerateMetricsV2ProcessorType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The processor type. Always <code>generate_metrics</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineGenerateMetricsV2ProcessorType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineGenerateMetricsV2ProcessorType type) {
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
   * @return ObservabilityPipelineGenerateMetricsV2Processor
   */
  @JsonAnySetter
  public ObservabilityPipelineGenerateMetricsV2Processor putAdditionalProperty(
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

  /** Return true if this ObservabilityPipelineGenerateMetricsV2Processor object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineGenerateMetricsV2Processor
        observabilityPipelineGenerateMetricsV2Processor =
            (ObservabilityPipelineGenerateMetricsV2Processor) o;
    return Objects.equals(
            this.displayName, observabilityPipelineGenerateMetricsV2Processor.displayName)
        && Objects.equals(this.enabled, observabilityPipelineGenerateMetricsV2Processor.enabled)
        && Objects.equals(this.id, observabilityPipelineGenerateMetricsV2Processor.id)
        && Objects.equals(this.include, observabilityPipelineGenerateMetricsV2Processor.include)
        && Objects.equals(this.metrics, observabilityPipelineGenerateMetricsV2Processor.metrics)
        && Objects.equals(this.type, observabilityPipelineGenerateMetricsV2Processor.type)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineGenerateMetricsV2Processor.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, enabled, id, include, metrics, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineGenerateMetricsV2Processor {\n");
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
