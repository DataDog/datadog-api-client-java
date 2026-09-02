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

/** Guardrail trigger details for a progressive rollout. */
@JsonPropertyOrder({
  AllocationExposureGuardrailTrigger.JSON_PROPERTY_ALLOCATION_EXPOSURE_SCHEDULE_ID,
  AllocationExposureGuardrailTrigger.JSON_PROPERTY_CREATED_AT,
  AllocationExposureGuardrailTrigger.JSON_PROPERTY_FLAGGING_VARIANT_ID,
  AllocationExposureGuardrailTrigger.JSON_PROPERTY_ID,
  AllocationExposureGuardrailTrigger.JSON_PROPERTY_METRIC_ID,
  AllocationExposureGuardrailTrigger.JSON_PROPERTY_TRIGGERED_ACTION,
  AllocationExposureGuardrailTrigger.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AllocationExposureGuardrailTrigger {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALLOCATION_EXPOSURE_SCHEDULE_ID =
      "allocation_exposure_schedule_id";
  private UUID allocationExposureScheduleId;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_FLAGGING_VARIANT_ID = "flagging_variant_id";
  private UUID flaggingVariantId;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_METRIC_ID = "metric_id";
  private String metricId;

  public static final String JSON_PROPERTY_TRIGGERED_ACTION = "triggered_action";
  private String triggeredAction;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public AllocationExposureGuardrailTrigger() {}

  @JsonCreator
  public AllocationExposureGuardrailTrigger(
      @JsonProperty(required = true, value = JSON_PROPERTY_ALLOCATION_EXPOSURE_SCHEDULE_ID)
          UUID allocationExposureScheduleId,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_FLAGGING_VARIANT_ID)
          UUID flaggingVariantId,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) UUID id,
      @JsonProperty(required = true, value = JSON_PROPERTY_METRIC_ID) String metricId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TRIGGERED_ACTION) String triggeredAction,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_AT) OffsetDateTime updatedAt) {
    this.allocationExposureScheduleId = allocationExposureScheduleId;
    this.createdAt = createdAt;
    this.flaggingVariantId = flaggingVariantId;
    this.id = id;
    this.metricId = metricId;
    this.triggeredAction = triggeredAction;
    this.updatedAt = updatedAt;
  }

  public AllocationExposureGuardrailTrigger allocationExposureScheduleId(
      UUID allocationExposureScheduleId) {
    this.allocationExposureScheduleId = allocationExposureScheduleId;
    return this;
  }

  /**
   * The progressive rollout ID this trigger belongs to.
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

  public AllocationExposureGuardrailTrigger createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The timestamp when this trigger was created.
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

  public AllocationExposureGuardrailTrigger flaggingVariantId(UUID flaggingVariantId) {
    this.flaggingVariantId = flaggingVariantId;
    return this;
  }

  /**
   * The variant ID that triggered this event.
   *
   * @return flaggingVariantId
   */
  @JsonProperty(JSON_PROPERTY_FLAGGING_VARIANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getFlaggingVariantId() {
    return flaggingVariantId;
  }

  public void setFlaggingVariantId(UUID flaggingVariantId) {
    this.flaggingVariantId = flaggingVariantId;
  }

  public AllocationExposureGuardrailTrigger id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the guardrail trigger.
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

  public AllocationExposureGuardrailTrigger metricId(String metricId) {
    this.metricId = metricId;
    return this;
  }

  /**
   * The metric ID associated with the trigger.
   *
   * @return metricId
   */
  @JsonProperty(JSON_PROPERTY_METRIC_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMetricId() {
    return metricId;
  }

  public void setMetricId(String metricId) {
    this.metricId = metricId;
  }

  public AllocationExposureGuardrailTrigger triggeredAction(String triggeredAction) {
    this.triggeredAction = triggeredAction;
    return this;
  }

  /**
   * The action that was triggered.
   *
   * @return triggeredAction
   */
  @JsonProperty(JSON_PROPERTY_TRIGGERED_ACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTriggeredAction() {
    return triggeredAction;
  }

  public void setTriggeredAction(String triggeredAction) {
    this.triggeredAction = triggeredAction;
  }

  public AllocationExposureGuardrailTrigger updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The timestamp when this trigger was last updated.
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
   * @return AllocationExposureGuardrailTrigger
   */
  @JsonAnySetter
  public AllocationExposureGuardrailTrigger putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AllocationExposureGuardrailTrigger object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllocationExposureGuardrailTrigger allocationExposureGuardrailTrigger =
        (AllocationExposureGuardrailTrigger) o;
    return Objects.equals(
            this.allocationExposureScheduleId,
            allocationExposureGuardrailTrigger.allocationExposureScheduleId)
        && Objects.equals(this.createdAt, allocationExposureGuardrailTrigger.createdAt)
        && Objects.equals(
            this.flaggingVariantId, allocationExposureGuardrailTrigger.flaggingVariantId)
        && Objects.equals(this.id, allocationExposureGuardrailTrigger.id)
        && Objects.equals(this.metricId, allocationExposureGuardrailTrigger.metricId)
        && Objects.equals(this.triggeredAction, allocationExposureGuardrailTrigger.triggeredAction)
        && Objects.equals(this.updatedAt, allocationExposureGuardrailTrigger.updatedAt)
        && Objects.equals(
            this.additionalProperties, allocationExposureGuardrailTrigger.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allocationExposureScheduleId,
        createdAt,
        flaggingVariantId,
        id,
        metricId,
        triggeredAction,
        updatedAt,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllocationExposureGuardrailTrigger {\n");
    sb.append("    allocationExposureScheduleId: ")
        .append(toIndentedString(allocationExposureScheduleId))
        .append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    flaggingVariantId: ").append(toIndentedString(flaggingVariantId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metricId: ").append(toIndentedString(metricId)).append("\n");
    sb.append("    triggeredAction: ").append(toIndentedString(triggeredAction)).append("\n");
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
