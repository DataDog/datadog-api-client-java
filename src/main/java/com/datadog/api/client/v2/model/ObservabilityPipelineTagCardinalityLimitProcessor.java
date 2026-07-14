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
 * The <code>tag_cardinality_limit</code> processor caps the number of distinct tag value
 * combinations on metrics, dropping tags or events once the limit is exceeded.
 *
 * <p><strong>Supported pipeline types:</strong> metrics
 */
@JsonPropertyOrder({
  ObservabilityPipelineTagCardinalityLimitProcessor.JSON_PROPERTY_DISPLAY_NAME,
  ObservabilityPipelineTagCardinalityLimitProcessor.JSON_PROPERTY_ENABLED,
  ObservabilityPipelineTagCardinalityLimitProcessor.JSON_PROPERTY_ID,
  ObservabilityPipelineTagCardinalityLimitProcessor.JSON_PROPERTY_INCLUDE,
  ObservabilityPipelineTagCardinalityLimitProcessor.JSON_PROPERTY_LIMIT_EXCEEDED_ACTION,
  ObservabilityPipelineTagCardinalityLimitProcessor.JSON_PROPERTY_PER_METRIC_LIMITS,
  ObservabilityPipelineTagCardinalityLimitProcessor.JSON_PROPERTY_TRACKING_MODE,
  ObservabilityPipelineTagCardinalityLimitProcessor.JSON_PROPERTY_TYPE,
  ObservabilityPipelineTagCardinalityLimitProcessor.JSON_PROPERTY_VALUE_LIMIT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineTagCardinalityLimitProcessor {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INCLUDE = "include";
  private String include;

  public static final String JSON_PROPERTY_LIMIT_EXCEEDED_ACTION = "limit_exceeded_action";
  private ObservabilityPipelineTagCardinalityLimitProcessorAction limitExceededAction;

  public static final String JSON_PROPERTY_PER_METRIC_LIMITS = "per_metric_limits";
  private List<ObservabilityPipelineTagCardinalityLimitProcessorPerMetricLimit> perMetricLimits =
      null;

  public static final String JSON_PROPERTY_TRACKING_MODE = "tracking_mode";
  private ObservabilityPipelineTagCardinalityLimitProcessorTrackingMode trackingMode;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineTagCardinalityLimitProcessorType type =
      ObservabilityPipelineTagCardinalityLimitProcessorType.TAG_CARDINALITY_LIMIT;

  public static final String JSON_PROPERTY_VALUE_LIMIT = "value_limit";
  private Long valueLimit;

  public ObservabilityPipelineTagCardinalityLimitProcessor() {}

  @JsonCreator
  public ObservabilityPipelineTagCardinalityLimitProcessor(
      @JsonProperty(required = true, value = JSON_PROPERTY_ENABLED) Boolean enabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INCLUDE) String include,
      @JsonProperty(required = true, value = JSON_PROPERTY_LIMIT_EXCEEDED_ACTION)
          ObservabilityPipelineTagCardinalityLimitProcessorAction limitExceededAction,
      @JsonProperty(required = true, value = JSON_PROPERTY_TRACKING_MODE)
          ObservabilityPipelineTagCardinalityLimitProcessorTrackingMode trackingMode,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineTagCardinalityLimitProcessorType type,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUE_LIMIT) Long valueLimit) {
    this.enabled = enabled;
    this.id = id;
    this.include = include;
    this.limitExceededAction = limitExceededAction;
    this.unparsed |= !limitExceededAction.isValid();
    this.trackingMode = trackingMode;
    this.unparsed |= trackingMode.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
    this.valueLimit = valueLimit;
  }

  public ObservabilityPipelineTagCardinalityLimitProcessor displayName(String displayName) {
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

  public ObservabilityPipelineTagCardinalityLimitProcessor enabled(Boolean enabled) {
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

  public ObservabilityPipelineTagCardinalityLimitProcessor id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for this component. Used in other parts of the pipeline to reference this
   * component (for example, as the <code>input</code> to downstream components).
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

  public ObservabilityPipelineTagCardinalityLimitProcessor include(String include) {
    this.include = include;
    return this;
  }

  /**
   * A Datadog search query used to determine which metrics this processor targets.
   *
   * @return include
   */
  @JsonProperty(JSON_PROPERTY_INCLUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getInclude() {
    return include;
  }

  public void setInclude(String include) {
    this.include = include;
  }

  public ObservabilityPipelineTagCardinalityLimitProcessor limitExceededAction(
      ObservabilityPipelineTagCardinalityLimitProcessorAction limitExceededAction) {
    this.limitExceededAction = limitExceededAction;
    this.unparsed |= !limitExceededAction.isValid();
    return this;
  }

  /**
   * The action to take when the cardinality limit is exceeded.
   *
   * @return limitExceededAction
   */
  @JsonProperty(JSON_PROPERTY_LIMIT_EXCEEDED_ACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineTagCardinalityLimitProcessorAction getLimitExceededAction() {
    return limitExceededAction;
  }

  public void setLimitExceededAction(
      ObservabilityPipelineTagCardinalityLimitProcessorAction limitExceededAction) {
    if (!limitExceededAction.isValid()) {
      this.unparsed = true;
    }
    this.limitExceededAction = limitExceededAction;
  }

  public ObservabilityPipelineTagCardinalityLimitProcessor perMetricLimits(
      List<ObservabilityPipelineTagCardinalityLimitProcessorPerMetricLimit> perMetricLimits) {
    this.perMetricLimits = perMetricLimits;
    for (ObservabilityPipelineTagCardinalityLimitProcessorPerMetricLimit item : perMetricLimits) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ObservabilityPipelineTagCardinalityLimitProcessor addPerMetricLimitsItem(
      ObservabilityPipelineTagCardinalityLimitProcessorPerMetricLimit perMetricLimitsItem) {
    if (this.perMetricLimits == null) {
      this.perMetricLimits = new ArrayList<>();
    }
    this.perMetricLimits.add(perMetricLimitsItem);
    this.unparsed |= perMetricLimitsItem.unparsed;
    return this;
  }

  /**
   * A list of per-metric cardinality overrides that take precedence over the default <code>
   * value_limit</code>.
   *
   * @return perMetricLimits
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PER_METRIC_LIMITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ObservabilityPipelineTagCardinalityLimitProcessorPerMetricLimit>
      getPerMetricLimits() {
    return perMetricLimits;
  }

  public void setPerMetricLimits(
      List<ObservabilityPipelineTagCardinalityLimitProcessorPerMetricLimit> perMetricLimits) {
    this.perMetricLimits = perMetricLimits;
  }

  public ObservabilityPipelineTagCardinalityLimitProcessor trackingMode(
      ObservabilityPipelineTagCardinalityLimitProcessorTrackingMode trackingMode) {
    this.trackingMode = trackingMode;
    this.unparsed |= trackingMode.unparsed;
    return this;
  }

  /**
   * Controls whether the processor uses exact or probabilistic tag tracking.
   *
   * @return trackingMode
   */
  @JsonProperty(JSON_PROPERTY_TRACKING_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineTagCardinalityLimitProcessorTrackingMode getTrackingMode() {
    return trackingMode;
  }

  public void setTrackingMode(
      ObservabilityPipelineTagCardinalityLimitProcessorTrackingMode trackingMode) {
    this.trackingMode = trackingMode;
  }

  public ObservabilityPipelineTagCardinalityLimitProcessor type(
      ObservabilityPipelineTagCardinalityLimitProcessorType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The processor type. The value must be <code>tag_cardinality_limit</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineTagCardinalityLimitProcessorType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineTagCardinalityLimitProcessorType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public ObservabilityPipelineTagCardinalityLimitProcessor valueLimit(Long valueLimit) {
    this.valueLimit = valueLimit;
    return this;
  }

  /**
   * The default maximum number of distinct tag value combinations allowed per metric. minimum: 0
   * maximum: 1000000
   *
   * @return valueLimit
   */
  @JsonProperty(JSON_PROPERTY_VALUE_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getValueLimit() {
    return valueLimit;
  }

  public void setValueLimit(Long valueLimit) {
    this.valueLimit = valueLimit;
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
   * @return ObservabilityPipelineTagCardinalityLimitProcessor
   */
  @JsonAnySetter
  public ObservabilityPipelineTagCardinalityLimitProcessor putAdditionalProperty(
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

  /** Return true if this ObservabilityPipelineTagCardinalityLimitProcessor object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineTagCardinalityLimitProcessor
        observabilityPipelineTagCardinalityLimitProcessor =
            (ObservabilityPipelineTagCardinalityLimitProcessor) o;
    return Objects.equals(
            this.displayName, observabilityPipelineTagCardinalityLimitProcessor.displayName)
        && Objects.equals(this.enabled, observabilityPipelineTagCardinalityLimitProcessor.enabled)
        && Objects.equals(this.id, observabilityPipelineTagCardinalityLimitProcessor.id)
        && Objects.equals(this.include, observabilityPipelineTagCardinalityLimitProcessor.include)
        && Objects.equals(
            this.limitExceededAction,
            observabilityPipelineTagCardinalityLimitProcessor.limitExceededAction)
        && Objects.equals(
            this.perMetricLimits, observabilityPipelineTagCardinalityLimitProcessor.perMetricLimits)
        && Objects.equals(
            this.trackingMode, observabilityPipelineTagCardinalityLimitProcessor.trackingMode)
        && Objects.equals(this.type, observabilityPipelineTagCardinalityLimitProcessor.type)
        && Objects.equals(
            this.valueLimit, observabilityPipelineTagCardinalityLimitProcessor.valueLimit)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineTagCardinalityLimitProcessor.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        displayName,
        enabled,
        id,
        include,
        limitExceededAction,
        perMetricLimits,
        trackingMode,
        type,
        valueLimit,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineTagCardinalityLimitProcessor {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    limitExceededAction: ")
        .append(toIndentedString(limitExceededAction))
        .append("\n");
    sb.append("    perMetricLimits: ").append(toIndentedString(perMetricLimits)).append("\n");
    sb.append("    trackingMode: ").append(toIndentedString(trackingMode)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    valueLimit: ").append(toIndentedString(valueLimit)).append("\n");
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
