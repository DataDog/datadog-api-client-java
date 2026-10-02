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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** One step in the protocol's traffic exposure schedule. */
@JsonPropertyOrder({
  ExperimentsPublicProtocolResponseDataAttributesExposureScheduleRolloutStepsItems
      .JSON_PROPERTY_EXPOSURE_RATIO,
  ExperimentsPublicProtocolResponseDataAttributesExposureScheduleRolloutStepsItems
      .JSON_PROPERTY_GROUPED_STEP_INDEX,
  ExperimentsPublicProtocolResponseDataAttributesExposureScheduleRolloutStepsItems
      .JSON_PROPERTY_INTERVAL_MS,
  ExperimentsPublicProtocolResponseDataAttributesExposureScheduleRolloutStepsItems
      .JSON_PROPERTY_IS_PAUSE_RECORD,
  ExperimentsPublicProtocolResponseDataAttributesExposureScheduleRolloutStepsItems
      .JSON_PROPERTY_ORDER_POSITION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsPublicProtocolResponseDataAttributesExposureScheduleRolloutStepsItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EXPOSURE_RATIO = "exposure_ratio";
  private Double exposureRatio;

  public static final String JSON_PROPERTY_GROUPED_STEP_INDEX = "grouped_step_index";
  private Long groupedStepIndex;

  public static final String JSON_PROPERTY_INTERVAL_MS = "interval_ms";
  private Long intervalMs;

  public static final String JSON_PROPERTY_IS_PAUSE_RECORD = "is_pause_record";
  private Boolean isPauseRecord;

  public static final String JSON_PROPERTY_ORDER_POSITION = "order_position";
  private Long orderPosition;

  public ExperimentsPublicProtocolResponseDataAttributesExposureScheduleRolloutStepsItems
      exposureRatio(Double exposureRatio) {
    this.exposureRatio = exposureRatio;
    return this;
  }

  /**
   * Fraction of traffic exposed during this rollout step.
   *
   * @return exposureRatio
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPOSURE_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getExposureRatio() {
    return exposureRatio;
  }

  public void setExposureRatio(Double exposureRatio) {
    this.exposureRatio = exposureRatio;
  }

  public ExperimentsPublicProtocolResponseDataAttributesExposureScheduleRolloutStepsItems
      groupedStepIndex(Long groupedStepIndex) {
    this.groupedStepIndex = groupedStepIndex;
    return this;
  }

  /**
   * Index of the group that contains this rollout step.
   *
   * @return groupedStepIndex
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUPED_STEP_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getGroupedStepIndex() {
    return groupedStepIndex;
  }

  public void setGroupedStepIndex(Long groupedStepIndex) {
    this.groupedStepIndex = groupedStepIndex;
  }

  public ExperimentsPublicProtocolResponseDataAttributesExposureScheduleRolloutStepsItems
      intervalMs(Long intervalMs) {
    this.intervalMs = intervalMs;
    return this;
  }

  /**
   * Duration of this rollout step, in milliseconds.
   *
   * @return intervalMs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERVAL_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getIntervalMs() {
    return intervalMs;
  }

  public void setIntervalMs(Long intervalMs) {
    this.intervalMs = intervalMs;
  }

  public ExperimentsPublicProtocolResponseDataAttributesExposureScheduleRolloutStepsItems
      isPauseRecord(Boolean isPauseRecord) {
    this.isPauseRecord = isPauseRecord;
    return this;
  }

  /**
   * Whether this schedule entry represents a pause.
   *
   * @return isPauseRecord
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_PAUSE_RECORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsPauseRecord() {
    return isPauseRecord;
  }

  public void setIsPauseRecord(Boolean isPauseRecord) {
    this.isPauseRecord = isPauseRecord;
  }

  public ExperimentsPublicProtocolResponseDataAttributesExposureScheduleRolloutStepsItems
      orderPosition(Long orderPosition) {
    this.orderPosition = orderPosition;
    return this;
  }

  /**
   * Position of this entry in the ordered configuration.
   *
   * @return orderPosition
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDER_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getOrderPosition() {
    return orderPosition;
  }

  public void setOrderPosition(Long orderPosition) {
    this.orderPosition = orderPosition;
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
   * @return ExperimentsPublicProtocolResponseDataAttributesExposureScheduleRolloutStepsItems
   */
  @JsonAnySetter
  public ExperimentsPublicProtocolResponseDataAttributesExposureScheduleRolloutStepsItems
      putAdditionalProperty(String key, Object value) {
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
   * Return true if this
   * ExperimentsPublicProtocolResponseDataAttributesExposureScheduleRolloutStepsItems object is
   * equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsPublicProtocolResponseDataAttributesExposureScheduleRolloutStepsItems
        experimentsPublicProtocolResponseDataAttributesExposureScheduleRolloutStepsItems =
            (ExperimentsPublicProtocolResponseDataAttributesExposureScheduleRolloutStepsItems) o;
    return Objects.equals(
            this.exposureRatio,
            experimentsPublicProtocolResponseDataAttributesExposureScheduleRolloutStepsItems
                .exposureRatio)
        && Objects.equals(
            this.groupedStepIndex,
            experimentsPublicProtocolResponseDataAttributesExposureScheduleRolloutStepsItems
                .groupedStepIndex)
        && Objects.equals(
            this.intervalMs,
            experimentsPublicProtocolResponseDataAttributesExposureScheduleRolloutStepsItems
                .intervalMs)
        && Objects.equals(
            this.isPauseRecord,
            experimentsPublicProtocolResponseDataAttributesExposureScheduleRolloutStepsItems
                .isPauseRecord)
        && Objects.equals(
            this.orderPosition,
            experimentsPublicProtocolResponseDataAttributesExposureScheduleRolloutStepsItems
                .orderPosition)
        && Objects.equals(
            this.additionalProperties,
            experimentsPublicProtocolResponseDataAttributesExposureScheduleRolloutStepsItems
                .additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        exposureRatio,
        groupedStepIndex,
        intervalMs,
        isPauseRecord,
        orderPosition,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(
        "class ExperimentsPublicProtocolResponseDataAttributesExposureScheduleRolloutStepsItems"
            + " {\n");
    sb.append("    exposureRatio: ").append(toIndentedString(exposureRatio)).append("\n");
    sb.append("    groupedStepIndex: ").append(toIndentedString(groupedStepIndex)).append("\n");
    sb.append("    intervalMs: ").append(toIndentedString(intervalMs)).append("\n");
    sb.append("    isPauseRecord: ").append(toIndentedString(isPauseRecord)).append("\n");
    sb.append("    orderPosition: ").append(toIndentedString(orderPosition)).append("\n");
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
