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
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

/** Rollout step request payload. */
@JsonPropertyOrder({
  ExposureRolloutStepRequest.JSON_PROPERTY_EXPOSURE_RATIO,
  ExposureRolloutStepRequest.JSON_PROPERTY_GROUPED_STEP_INDEX,
  ExposureRolloutStepRequest.JSON_PROPERTY_ID,
  ExposureRolloutStepRequest.JSON_PROPERTY_INTERVAL_MS,
  ExposureRolloutStepRequest.JSON_PROPERTY_IS_PAUSE_RECORD
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExposureRolloutStepRequest {
  @JsonIgnore public boolean unparsed = false;
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

  public ExposureRolloutStepRequest() {}

  @JsonCreator
  public ExposureRolloutStepRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_EXPOSURE_RATIO) Double exposureRatio,
      @JsonProperty(required = true, value = JSON_PROPERTY_GROUPED_STEP_INDEX)
          Long groupedStepIndex,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_PAUSE_RECORD) Boolean isPauseRecord) {
    this.exposureRatio = exposureRatio;
    this.groupedStepIndex = groupedStepIndex;
    this.isPauseRecord = isPauseRecord;
  }

  public ExposureRolloutStepRequest exposureRatio(Double exposureRatio) {
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

  public ExposureRolloutStepRequest groupedStepIndex(Long groupedStepIndex) {
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

  public ExposureRolloutStepRequest id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the progression step.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public ExposureRolloutStepRequest intervalMs(Long intervalMs) {
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

  public ExposureRolloutStepRequest isPauseRecord(Boolean isPauseRecord) {
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
   * @return ExposureRolloutStepRequest
   */
  @JsonAnySetter
  public ExposureRolloutStepRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExposureRolloutStepRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExposureRolloutStepRequest exposureRolloutStepRequest = (ExposureRolloutStepRequest) o;
    return Objects.equals(this.exposureRatio, exposureRolloutStepRequest.exposureRatio)
        && Objects.equals(this.groupedStepIndex, exposureRolloutStepRequest.groupedStepIndex)
        && Objects.equals(this.id, exposureRolloutStepRequest.id)
        && Objects.equals(this.intervalMs, exposureRolloutStepRequest.intervalMs)
        && Objects.equals(this.isPauseRecord, exposureRolloutStepRequest.isPauseRecord)
        && Objects.equals(
            this.additionalProperties, exposureRolloutStepRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        exposureRatio, groupedStepIndex, id, intervalMs, isPauseRecord, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExposureRolloutStepRequest {\n");
    sb.append("    exposureRatio: ").append(toIndentedString(exposureRatio)).append("\n");
    sb.append("    groupedStepIndex: ").append(toIndentedString(groupedStepIndex)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    intervalMs: ").append(toIndentedString(intervalMs)).append("\n");
    sb.append("    isPauseRecord: ").append(toIndentedString(isPauseRecord)).append("\n");
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
