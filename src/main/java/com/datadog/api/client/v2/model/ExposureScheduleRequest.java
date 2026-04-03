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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

/** Progressive release request payload. */
@JsonPropertyOrder({
  ExposureScheduleRequest.JSON_PROPERTY_ABSOLUTE_START_TIME,
  ExposureScheduleRequest.JSON_PROPERTY_CONTROL_VARIANT_ID,
  ExposureScheduleRequest.JSON_PROPERTY_CONTROL_VARIANT_KEY,
  ExposureScheduleRequest.JSON_PROPERTY_ID,
  ExposureScheduleRequest.JSON_PROPERTY_ROLLOUT_OPTIONS,
  ExposureScheduleRequest.JSON_PROPERTY_ROLLOUT_STEPS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExposureScheduleRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ABSOLUTE_START_TIME = "absolute_start_time";
  private JsonNullable<OffsetDateTime> absoluteStartTime = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CONTROL_VARIANT_ID = "control_variant_id";
  private JsonNullable<String> controlVariantId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CONTROL_VARIANT_KEY = "control_variant_key";
  private JsonNullable<String> controlVariantKey = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_ROLLOUT_OPTIONS = "rollout_options";
  private RolloutOptionsRequest rolloutOptions;

  public static final String JSON_PROPERTY_ROLLOUT_STEPS = "rollout_steps";
  private List<ExposureRolloutStepRequest> rolloutSteps = new ArrayList<>();

  public ExposureScheduleRequest() {}

  @JsonCreator
  public ExposureScheduleRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_ROLLOUT_OPTIONS)
          RolloutOptionsRequest rolloutOptions,
      @JsonProperty(required = true, value = JSON_PROPERTY_ROLLOUT_STEPS)
          List<ExposureRolloutStepRequest> rolloutSteps) {
    this.rolloutOptions = rolloutOptions;
    this.unparsed |= rolloutOptions.unparsed;
    this.rolloutSteps = rolloutSteps;
  }

  public ExposureScheduleRequest absoluteStartTime(OffsetDateTime absoluteStartTime) {
    this.absoluteStartTime = JsonNullable.<OffsetDateTime>of(absoluteStartTime);
    return this;
  }

  /**
   * The absolute UTC start time for this schedule.
   *
   * @return absoluteStartTime
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getAbsoluteStartTime() {
    return absoluteStartTime.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ABSOLUTE_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getAbsoluteStartTime_JsonNullable() {
    return absoluteStartTime;
  }

  @JsonProperty(JSON_PROPERTY_ABSOLUTE_START_TIME)
  public void setAbsoluteStartTime_JsonNullable(JsonNullable<OffsetDateTime> absoluteStartTime) {
    this.absoluteStartTime = absoluteStartTime;
  }

  public void setAbsoluteStartTime(OffsetDateTime absoluteStartTime) {
    this.absoluteStartTime = JsonNullable.<OffsetDateTime>of(absoluteStartTime);
  }

  public ExposureScheduleRequest controlVariantId(String controlVariantId) {
    this.controlVariantId = JsonNullable.<String>of(controlVariantId);
    return this;
  }

  /**
   * The control variant ID used for experiment comparisons.
   *
   * @return controlVariantId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getControlVariantId() {
    return controlVariantId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTROL_VARIANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getControlVariantId_JsonNullable() {
    return controlVariantId;
  }

  @JsonProperty(JSON_PROPERTY_CONTROL_VARIANT_ID)
  public void setControlVariantId_JsonNullable(JsonNullable<String> controlVariantId) {
    this.controlVariantId = controlVariantId;
  }

  public void setControlVariantId(String controlVariantId) {
    this.controlVariantId = JsonNullable.<String>of(controlVariantId);
  }

  public ExposureScheduleRequest controlVariantKey(String controlVariantKey) {
    this.controlVariantKey = JsonNullable.<String>of(controlVariantKey);
    return this;
  }

  /**
   * The control variant key used during creation workflows.
   *
   * @return controlVariantKey
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getControlVariantKey() {
    return controlVariantKey.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTROL_VARIANT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getControlVariantKey_JsonNullable() {
    return controlVariantKey;
  }

  @JsonProperty(JSON_PROPERTY_CONTROL_VARIANT_KEY)
  public void setControlVariantKey_JsonNullable(JsonNullable<String> controlVariantKey) {
    this.controlVariantKey = controlVariantKey;
  }

  public void setControlVariantKey(String controlVariantKey) {
    this.controlVariantKey = JsonNullable.<String>of(controlVariantKey);
  }

  public ExposureScheduleRequest id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the progressive rollout.
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

  public ExposureScheduleRequest rolloutOptions(RolloutOptionsRequest rolloutOptions) {
    this.rolloutOptions = rolloutOptions;
    this.unparsed |= rolloutOptions.unparsed;
    return this;
  }

  /**
   * Rollout options request payload.
   *
   * @return rolloutOptions
   */
  @JsonProperty(JSON_PROPERTY_ROLLOUT_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RolloutOptionsRequest getRolloutOptions() {
    return rolloutOptions;
  }

  public void setRolloutOptions(RolloutOptionsRequest rolloutOptions) {
    this.rolloutOptions = rolloutOptions;
  }

  public ExposureScheduleRequest rolloutSteps(List<ExposureRolloutStepRequest> rolloutSteps) {
    this.rolloutSteps = rolloutSteps;
    for (ExposureRolloutStepRequest item : rolloutSteps) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ExposureScheduleRequest addRolloutStepsItem(ExposureRolloutStepRequest rolloutStepsItem) {
    this.rolloutSteps.add(rolloutStepsItem);
    this.unparsed |= rolloutStepsItem.unparsed;
    return this;
  }

  /**
   * Ordered progression steps for exposure.
   *
   * @return rolloutSteps
   */
  @JsonProperty(JSON_PROPERTY_ROLLOUT_STEPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ExposureRolloutStepRequest> getRolloutSteps() {
    return rolloutSteps;
  }

  public void setRolloutSteps(List<ExposureRolloutStepRequest> rolloutSteps) {
    this.rolloutSteps = rolloutSteps;
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
   * @return ExposureScheduleRequest
   */
  @JsonAnySetter
  public ExposureScheduleRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExposureScheduleRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExposureScheduleRequest exposureScheduleRequest = (ExposureScheduleRequest) o;
    return Objects.equals(this.absoluteStartTime, exposureScheduleRequest.absoluteStartTime)
        && Objects.equals(this.controlVariantId, exposureScheduleRequest.controlVariantId)
        && Objects.equals(this.controlVariantKey, exposureScheduleRequest.controlVariantKey)
        && Objects.equals(this.id, exposureScheduleRequest.id)
        && Objects.equals(this.rolloutOptions, exposureScheduleRequest.rolloutOptions)
        && Objects.equals(this.rolloutSteps, exposureScheduleRequest.rolloutSteps)
        && Objects.equals(this.additionalProperties, exposureScheduleRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        absoluteStartTime,
        controlVariantId,
        controlVariantKey,
        id,
        rolloutOptions,
        rolloutSteps,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExposureScheduleRequest {\n");
    sb.append("    absoluteStartTime: ").append(toIndentedString(absoluteStartTime)).append("\n");
    sb.append("    controlVariantId: ").append(toIndentedString(controlVariantId)).append("\n");
    sb.append("    controlVariantKey: ").append(toIndentedString(controlVariantKey)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rolloutOptions: ").append(toIndentedString(rolloutOptions)).append("\n");
    sb.append("    rolloutSteps: ").append(toIndentedString(rolloutSteps)).append("\n");
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
