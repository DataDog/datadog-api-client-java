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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

/** Exposure progression step details. */
@JsonPropertyOrder({
  AllocationExposureRolloutStep.JSON_PROPERTY_ALLOCATION_EXPOSURE_SCHEDULE_ID,
  AllocationExposureRolloutStep.JSON_PROPERTY_CREATED_AT,
  AllocationExposureRolloutStep.JSON_PROPERTY_EXPOSURE_RATIO,
  AllocationExposureRolloutStep.JSON_PROPERTY_GROUPED_STEP_INDEX,
  AllocationExposureRolloutStep.JSON_PROPERTY_ID,
  AllocationExposureRolloutStep.JSON_PROPERTY_INTERVAL_MS,
  AllocationExposureRolloutStep.JSON_PROPERTY_IS_PAUSE_RECORD,
  AllocationExposureRolloutStep.JSON_PROPERTY_ORDER_POSITION,
  AllocationExposureRolloutStep.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AllocationExposureRolloutStep {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALLOCATION_EXPOSURE_SCHEDULE_ID =
      "allocation_exposure_schedule_id";
  private UUID allocationExposureScheduleId;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_EXPOSURE_RATIO = "exposure_ratio";
  private Double exposureRatio;

  public static final String JSON_PROPERTY_GROUPED_STEP_INDEX = "grouped_step_index";
  private Long groupedStepIndex;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_INTERVAL_MS = "interval_ms";
  private JsonNullable<Long> intervalMs = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_IS_PAUSE_RECORD = "is_pause_record";
  private Boolean isPauseRecord;

  public static final String JSON_PROPERTY_ORDER_POSITION = "order_position";
  private Long orderPosition;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public AllocationExposureRolloutStep() {}

  @JsonCreator
  public AllocationExposureRolloutStep(
      @JsonProperty(required = true, value = JSON_PROPERTY_ALLOCATION_EXPOSURE_SCHEDULE_ID)
          UUID allocationExposureScheduleId,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_EXPOSURE_RATIO) Double exposureRatio,
      @JsonProperty(required = true, value = JSON_PROPERTY_GROUPED_STEP_INDEX)
          Long groupedStepIndex,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) UUID id,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_PAUSE_RECORD) Boolean isPauseRecord,
      @JsonProperty(required = true, value = JSON_PROPERTY_ORDER_POSITION) Long orderPosition,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_AT) OffsetDateTime updatedAt) {
    this.allocationExposureScheduleId = allocationExposureScheduleId;
    this.createdAt = createdAt;
    this.exposureRatio = exposureRatio;
    this.groupedStepIndex = groupedStepIndex;
    this.id = id;
    this.isPauseRecord = isPauseRecord;
    this.orderPosition = orderPosition;
    this.updatedAt = updatedAt;
  }

  public AllocationExposureRolloutStep allocationExposureScheduleId(
      UUID allocationExposureScheduleId) {
    this.allocationExposureScheduleId = allocationExposureScheduleId;
    return this;
  }

  /**
   * The progressive rollout ID this step belongs to.
   *
   * @return allocationExposureScheduleId
   */
  @JsonProperty(JSON_PROPERTY_ALLOCATION_EXPOSURE_SCHEDULE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getAllocationExposureScheduleId() {
    return allocationExposureScheduleId;
  }

  public void setAllocationExposureScheduleId(UUID allocationExposureScheduleId) {
    this.allocationExposureScheduleId = allocationExposureScheduleId;
  }

  public AllocationExposureRolloutStep createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The timestamp when the progression step was created.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public AllocationExposureRolloutStep exposureRatio(Double exposureRatio) {
    this.exposureRatio = exposureRatio;
    return this;
  }

  /**
   * The exposure ratio for this step. minimum: 0 maximum: 1
   *
   * @return exposureRatio
   */
  @JsonProperty(JSON_PROPERTY_EXPOSURE_RATIO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getExposureRatio() {
    return exposureRatio;
  }

  public void setExposureRatio(Double exposureRatio) {
    this.exposureRatio = exposureRatio;
  }

  public AllocationExposureRolloutStep groupedStepIndex(Long groupedStepIndex) {
    this.groupedStepIndex = groupedStepIndex;
    return this;
  }

  /**
   * Logical index grouping related steps. minimum: 0
   *
   * @return groupedStepIndex
   */
  @JsonProperty(JSON_PROPERTY_GROUPED_STEP_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getGroupedStepIndex() {
    return groupedStepIndex;
  }

  public void setGroupedStepIndex(Long groupedStepIndex) {
    this.groupedStepIndex = groupedStepIndex;
  }

  public AllocationExposureRolloutStep id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the progression step.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public AllocationExposureRolloutStep intervalMs(Long intervalMs) {
    this.intervalMs = JsonNullable.<Long>of(intervalMs);
    return this;
  }

  /**
   * Step duration in milliseconds.
   *
   * @return intervalMs
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getIntervalMs() {
    return intervalMs.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INTERVAL_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getIntervalMs_JsonNullable() {
    return intervalMs;
  }

  @JsonProperty(JSON_PROPERTY_INTERVAL_MS)
  public void setIntervalMs_JsonNullable(JsonNullable<Long> intervalMs) {
    this.intervalMs = intervalMs;
  }

  public void setIntervalMs(Long intervalMs) {
    this.intervalMs = JsonNullable.<Long>of(intervalMs);
  }

  public AllocationExposureRolloutStep isPauseRecord(Boolean isPauseRecord) {
    this.isPauseRecord = isPauseRecord;
    return this;
  }

  /**
   * Whether this step represents a pause record.
   *
   * @return isPauseRecord
   */
  @JsonProperty(JSON_PROPERTY_IS_PAUSE_RECORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsPauseRecord() {
    return isPauseRecord;
  }

  public void setIsPauseRecord(Boolean isPauseRecord) {
    this.isPauseRecord = isPauseRecord;
  }

  public AllocationExposureRolloutStep orderPosition(Long orderPosition) {
    this.orderPosition = orderPosition;
    return this;
  }

  /**
   * Sort order for the progression step.
   *
   * @return orderPosition
   */
  @JsonProperty(JSON_PROPERTY_ORDER_POSITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getOrderPosition() {
    return orderPosition;
  }

  public void setOrderPosition(Long orderPosition) {
    this.orderPosition = orderPosition;
  }

  public AllocationExposureRolloutStep updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The timestamp when the progression step was last updated.
   *
   * @return updatedAt
   */
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
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
   * @return AllocationExposureRolloutStep
   */
  @JsonAnySetter
  public AllocationExposureRolloutStep putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AllocationExposureRolloutStep object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllocationExposureRolloutStep allocationExposureRolloutStep = (AllocationExposureRolloutStep) o;
    return Objects.equals(
            this.allocationExposureScheduleId,
            allocationExposureRolloutStep.allocationExposureScheduleId)
        && Objects.equals(this.createdAt, allocationExposureRolloutStep.createdAt)
        && Objects.equals(this.exposureRatio, allocationExposureRolloutStep.exposureRatio)
        && Objects.equals(this.groupedStepIndex, allocationExposureRolloutStep.groupedStepIndex)
        && Objects.equals(this.id, allocationExposureRolloutStep.id)
        && Objects.equals(this.intervalMs, allocationExposureRolloutStep.intervalMs)
        && Objects.equals(this.isPauseRecord, allocationExposureRolloutStep.isPauseRecord)
        && Objects.equals(this.orderPosition, allocationExposureRolloutStep.orderPosition)
        && Objects.equals(this.updatedAt, allocationExposureRolloutStep.updatedAt)
        && Objects.equals(
            this.additionalProperties, allocationExposureRolloutStep.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allocationExposureScheduleId,
        createdAt,
        exposureRatio,
        groupedStepIndex,
        id,
        intervalMs,
        isPauseRecord,
        orderPosition,
        updatedAt,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllocationExposureRolloutStep {\n");
    sb.append("    allocationExposureScheduleId: ")
        .append(toIndentedString(allocationExposureScheduleId))
        .append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    exposureRatio: ").append(toIndentedString(exposureRatio)).append("\n");
    sb.append("    groupedStepIndex: ").append(toIndentedString(groupedStepIndex)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    intervalMs: ").append(toIndentedString(intervalMs)).append("\n");
    sb.append("    isPauseRecord: ").append(toIndentedString(isPauseRecord)).append("\n");
    sb.append("    orderPosition: ").append(toIndentedString(orderPosition)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
