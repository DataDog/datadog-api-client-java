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

/** Progressive release details for a targeting rule allocation. */
@JsonPropertyOrder({
  AllocationExposureSchedule.JSON_PROPERTY_ABSOLUTE_START_TIME,
  AllocationExposureSchedule.JSON_PROPERTY_ALLOCATION_ID,
  AllocationExposureSchedule.JSON_PROPERTY_CONTROL_VARIANT_ID,
  AllocationExposureSchedule.JSON_PROPERTY_CREATED_AT,
  AllocationExposureSchedule.JSON_PROPERTY_GUARDRAIL_TRIGGERED_ACTION,
  AllocationExposureSchedule.JSON_PROPERTY_GUARDRAIL_TRIGGERS,
  AllocationExposureSchedule.JSON_PROPERTY_ID,
  AllocationExposureSchedule.JSON_PROPERTY_ROLLOUT_OPTIONS,
  AllocationExposureSchedule.JSON_PROPERTY_ROLLOUT_STEPS,
  AllocationExposureSchedule.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AllocationExposureSchedule {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ABSOLUTE_START_TIME = "absolute_start_time";
  private JsonNullable<OffsetDateTime> absoluteStartTime = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_ALLOCATION_ID = "allocation_id";
  private UUID allocationId;

  public static final String JSON_PROPERTY_CONTROL_VARIANT_ID = "control_variant_id";
  private JsonNullable<String> controlVariantId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_GUARDRAIL_TRIGGERED_ACTION =
      "guardrail_triggered_action";
  private JsonNullable<String> guardrailTriggeredAction = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_GUARDRAIL_TRIGGERS = "guardrail_triggers";
  private List<AllocationExposureGuardrailTrigger> guardrailTriggers = new ArrayList<>();

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_ROLLOUT_OPTIONS = "rollout_options";
  private RolloutOptions rolloutOptions;

  public static final String JSON_PROPERTY_ROLLOUT_STEPS = "rollout_steps";
  private List<AllocationExposureRolloutStep> rolloutSteps = new ArrayList<>();

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public AllocationExposureSchedule() {}

  @JsonCreator
  public AllocationExposureSchedule(
      @JsonProperty(required = true, value = JSON_PROPERTY_ALLOCATION_ID) UUID allocationId,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_GUARDRAIL_TRIGGERS)
          List<AllocationExposureGuardrailTrigger> guardrailTriggers,
      @JsonProperty(required = true, value = JSON_PROPERTY_ROLLOUT_OPTIONS)
          RolloutOptions rolloutOptions,
      @JsonProperty(required = true, value = JSON_PROPERTY_ROLLOUT_STEPS)
          List<AllocationExposureRolloutStep> rolloutSteps,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_AT) OffsetDateTime updatedAt) {
    this.allocationId = allocationId;
    this.createdAt = createdAt;
    this.guardrailTriggers = guardrailTriggers;
    this.rolloutOptions = rolloutOptions;
    this.unparsed |= rolloutOptions.unparsed;
    this.rolloutSteps = rolloutSteps;
    this.updatedAt = updatedAt;
  }

  public AllocationExposureSchedule absoluteStartTime(OffsetDateTime absoluteStartTime) {
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

  public AllocationExposureSchedule allocationId(UUID allocationId) {
    this.allocationId = allocationId;
    return this;
  }

  /**
   * The targeting rule allocation ID this progressive rollout belongs to.
   *
   * @return allocationId
   */
  @JsonProperty(JSON_PROPERTY_ALLOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getAllocationId() {
    return allocationId;
  }

  public void setAllocationId(UUID allocationId) {
    this.allocationId = allocationId;
  }

  public AllocationExposureSchedule controlVariantId(String controlVariantId) {
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

  public AllocationExposureSchedule createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The timestamp when the schedule was created.
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

  public AllocationExposureSchedule guardrailTriggeredAction(String guardrailTriggeredAction) {
    this.guardrailTriggeredAction = JsonNullable.<String>of(guardrailTriggeredAction);
    return this;
  }

  /**
   * Last guardrail action triggered for this schedule.
   *
   * @return guardrailTriggeredAction
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getGuardrailTriggeredAction() {
    return guardrailTriggeredAction.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GUARDRAIL_TRIGGERED_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getGuardrailTriggeredAction_JsonNullable() {
    return guardrailTriggeredAction;
  }

  @JsonProperty(JSON_PROPERTY_GUARDRAIL_TRIGGERED_ACTION)
  public void setGuardrailTriggeredAction_JsonNullable(
      JsonNullable<String> guardrailTriggeredAction) {
    this.guardrailTriggeredAction = guardrailTriggeredAction;
  }

  public void setGuardrailTriggeredAction(String guardrailTriggeredAction) {
    this.guardrailTriggeredAction = JsonNullable.<String>of(guardrailTriggeredAction);
  }

  public AllocationExposureSchedule guardrailTriggers(
      List<AllocationExposureGuardrailTrigger> guardrailTriggers) {
    this.guardrailTriggers = guardrailTriggers;
    for (AllocationExposureGuardrailTrigger item : guardrailTriggers) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public AllocationExposureSchedule addGuardrailTriggersItem(
      AllocationExposureGuardrailTrigger guardrailTriggersItem) {
    this.guardrailTriggers.add(guardrailTriggersItem);
    this.unparsed |= guardrailTriggersItem.unparsed;
    return this;
  }

  /**
   * Guardrail trigger records for this schedule.
   *
   * @return guardrailTriggers
   */
  @JsonProperty(JSON_PROPERTY_GUARDRAIL_TRIGGERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<AllocationExposureGuardrailTrigger> getGuardrailTriggers() {
    return guardrailTriggers;
  }

  public void setGuardrailTriggers(List<AllocationExposureGuardrailTrigger> guardrailTriggers) {
    this.guardrailTriggers = guardrailTriggers;
  }

  public AllocationExposureSchedule id(UUID id) {
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

  public AllocationExposureSchedule rolloutOptions(RolloutOptions rolloutOptions) {
    this.rolloutOptions = rolloutOptions;
    this.unparsed |= rolloutOptions.unparsed;
    return this;
  }

  /**
   * Applied progression options for a progressive rollout.
   *
   * @return rolloutOptions
   */
  @JsonProperty(JSON_PROPERTY_ROLLOUT_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RolloutOptions getRolloutOptions() {
    return rolloutOptions;
  }

  public void setRolloutOptions(RolloutOptions rolloutOptions) {
    this.rolloutOptions = rolloutOptions;
  }

  public AllocationExposureSchedule rolloutSteps(List<AllocationExposureRolloutStep> rolloutSteps) {
    this.rolloutSteps = rolloutSteps;
    for (AllocationExposureRolloutStep item : rolloutSteps) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public AllocationExposureSchedule addRolloutStepsItem(
      AllocationExposureRolloutStep rolloutStepsItem) {
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
  public List<AllocationExposureRolloutStep> getRolloutSteps() {
    return rolloutSteps;
  }

  public void setRolloutSteps(List<AllocationExposureRolloutStep> rolloutSteps) {
    this.rolloutSteps = rolloutSteps;
  }

  public AllocationExposureSchedule updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The timestamp when the schedule was last updated.
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
   * @return AllocationExposureSchedule
   */
  @JsonAnySetter
  public AllocationExposureSchedule putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AllocationExposureSchedule object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllocationExposureSchedule allocationExposureSchedule = (AllocationExposureSchedule) o;
    return Objects.equals(this.absoluteStartTime, allocationExposureSchedule.absoluteStartTime)
        && Objects.equals(this.allocationId, allocationExposureSchedule.allocationId)
        && Objects.equals(this.controlVariantId, allocationExposureSchedule.controlVariantId)
        && Objects.equals(this.createdAt, allocationExposureSchedule.createdAt)
        && Objects.equals(
            this.guardrailTriggeredAction, allocationExposureSchedule.guardrailTriggeredAction)
        && Objects.equals(this.guardrailTriggers, allocationExposureSchedule.guardrailTriggers)
        && Objects.equals(this.id, allocationExposureSchedule.id)
        && Objects.equals(this.rolloutOptions, allocationExposureSchedule.rolloutOptions)
        && Objects.equals(this.rolloutSteps, allocationExposureSchedule.rolloutSteps)
        && Objects.equals(this.updatedAt, allocationExposureSchedule.updatedAt)
        && Objects.equals(
            this.additionalProperties, allocationExposureSchedule.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        absoluteStartTime,
        allocationId,
        controlVariantId,
        createdAt,
        guardrailTriggeredAction,
        guardrailTriggers,
        id,
        rolloutOptions,
        rolloutSteps,
        updatedAt,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllocationExposureSchedule {\n");
    sb.append("    absoluteStartTime: ").append(toIndentedString(absoluteStartTime)).append("\n");
    sb.append("    allocationId: ").append(toIndentedString(allocationId)).append("\n");
    sb.append("    controlVariantId: ").append(toIndentedString(controlVariantId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    guardrailTriggeredAction: ")
        .append(toIndentedString(guardrailTriggeredAction))
        .append("\n");
    sb.append("    guardrailTriggers: ").append(toIndentedString(guardrailTriggers)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rolloutOptions: ").append(toIndentedString(rolloutOptions)).append("\n");
    sb.append("    rolloutSteps: ").append(toIndentedString(rolloutSteps)).append("\n");
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
