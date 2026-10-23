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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Traffic schedule. Publishing and replacement require <code>NO_ROLLOUT</code> with exactly one
 * step, or <code>UNIFORM_INTERVALS</code> with a positive selection interval and at least one step.
 * Requires <code>environment_id</code>.
 */
@JsonPropertyOrder({
  ExperimentsProtocolExposureScheduleInput.JSON_PROPERTY_AUTOSTART,
  ExperimentsProtocolExposureScheduleInput.JSON_PROPERTY_GUARDRAIL_TRIGGERED_ACTION,
  ExperimentsProtocolExposureScheduleInput.JSON_PROPERTY_ROLLOUT_STEPS,
  ExperimentsProtocolExposureScheduleInput.JSON_PROPERTY_SELECTION_INTERVAL_MS,
  ExperimentsProtocolExposureScheduleInput.JSON_PROPERTY_STRATEGY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsProtocolExposureScheduleInput {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTOSTART = "autostart";
  private Boolean autostart;

  public static final String JSON_PROPERTY_GUARDRAIL_TRIGGERED_ACTION =
      "guardrail_triggered_action";
  private JsonNullable<String> guardrailTriggeredAction = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ROLLOUT_STEPS = "rollout_steps";
  private JsonNullable<List<ExperimentsProtocolExposureStepInput>> rolloutSteps =
      JsonNullable.<List<ExperimentsProtocolExposureStepInput>>undefined();

  public static final String JSON_PROPERTY_SELECTION_INTERVAL_MS = "selection_interval_ms";
  private JsonNullable<Long> selectionIntervalMs = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_STRATEGY = "strategy";
  private String strategy;

  public ExperimentsProtocolExposureScheduleInput autostart(Boolean autostart) {
    this.autostart = autostart;
    return this;
  }

  /**
   * Whether the exposure schedule starts automatically.
   *
   * @return autostart
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTOSTART)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAutostart() {
    return autostart;
  }

  public void setAutostart(Boolean autostart) {
    this.autostart = autostart;
  }

  public ExperimentsProtocolExposureScheduleInput guardrailTriggeredAction(
      String guardrailTriggeredAction) {
    this.guardrailTriggeredAction = JsonNullable.<String>of(guardrailTriggeredAction);
    return this;
  }

  /**
   * Action taken when a guardrail triggers during the exposure schedule.
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

  public ExperimentsProtocolExposureScheduleInput rolloutSteps(
      List<ExperimentsProtocolExposureStepInput> rolloutSteps) {
    this.rolloutSteps = JsonNullable.<List<ExperimentsProtocolExposureStepInput>>of(rolloutSteps);
    return this;
  }

  public ExperimentsProtocolExposureScheduleInput addRolloutStepsItem(
      ExperimentsProtocolExposureStepInput rolloutStepsItem) {
    if (this.rolloutSteps == null || !this.rolloutSteps.isPresent()) {
      this.rolloutSteps =
          JsonNullable.<List<ExperimentsProtocolExposureStepInput>>of(new ArrayList<>());
    }
    try {
      this.rolloutSteps.get().add(rolloutStepsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Rollout steps, replaced when supplied.
   *
   * @return rolloutSteps
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<ExperimentsProtocolExposureStepInput> getRolloutSteps() {
    return rolloutSteps.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ROLLOUT_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<ExperimentsProtocolExposureStepInput>> getRolloutSteps_JsonNullable() {
    return rolloutSteps;
  }

  @JsonProperty(JSON_PROPERTY_ROLLOUT_STEPS)
  public void setRolloutSteps_JsonNullable(
      JsonNullable<List<ExperimentsProtocolExposureStepInput>> rolloutSteps) {
    this.rolloutSteps = rolloutSteps;
  }

  public void setRolloutSteps(List<ExperimentsProtocolExposureStepInput> rolloutSteps) {
    this.rolloutSteps = JsonNullable.<List<ExperimentsProtocolExposureStepInput>>of(rolloutSteps);
  }

  public ExperimentsProtocolExposureScheduleInput selectionIntervalMs(Long selectionIntervalMs) {
    this.selectionIntervalMs = JsonNullable.<Long>of(selectionIntervalMs);
    return this;
  }

  /**
   * Interval between traffic selections, in milliseconds. minimum: 0
   *
   * @return selectionIntervalMs
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getSelectionIntervalMs() {
    return selectionIntervalMs.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SELECTION_INTERVAL_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getSelectionIntervalMs_JsonNullable() {
    return selectionIntervalMs;
  }

  @JsonProperty(JSON_PROPERTY_SELECTION_INTERVAL_MS)
  public void setSelectionIntervalMs_JsonNullable(JsonNullable<Long> selectionIntervalMs) {
    this.selectionIntervalMs = selectionIntervalMs;
  }

  public void setSelectionIntervalMs(Long selectionIntervalMs) {
    this.selectionIntervalMs = JsonNullable.<Long>of(selectionIntervalMs);
  }

  public ExperimentsProtocolExposureScheduleInput strategy(String strategy) {
    this.strategy = strategy;
    return this;
  }

  /**
   * Method used to increase traffic exposure over the schedule.
   *
   * @return strategy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStrategy() {
    return strategy;
  }

  public void setStrategy(String strategy) {
    this.strategy = strategy;
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
   * @return ExperimentsProtocolExposureScheduleInput
   */
  @JsonAnySetter
  public ExperimentsProtocolExposureScheduleInput putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExperimentsProtocolExposureScheduleInput object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsProtocolExposureScheduleInput experimentsProtocolExposureScheduleInput =
        (ExperimentsProtocolExposureScheduleInput) o;
    return Objects.equals(this.autostart, experimentsProtocolExposureScheduleInput.autostart)
        && Objects.equals(
            this.guardrailTriggeredAction,
            experimentsProtocolExposureScheduleInput.guardrailTriggeredAction)
        && Objects.equals(this.rolloutSteps, experimentsProtocolExposureScheduleInput.rolloutSteps)
        && Objects.equals(
            this.selectionIntervalMs, experimentsProtocolExposureScheduleInput.selectionIntervalMs)
        && Objects.equals(this.strategy, experimentsProtocolExposureScheduleInput.strategy)
        && Objects.equals(
            this.additionalProperties,
            experimentsProtocolExposureScheduleInput.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        autostart,
        guardrailTriggeredAction,
        rolloutSteps,
        selectionIntervalMs,
        strategy,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsProtocolExposureScheduleInput {\n");
    sb.append("    autostart: ").append(toIndentedString(autostart)).append("\n");
    sb.append("    guardrailTriggeredAction: ")
        .append(toIndentedString(guardrailTriggeredAction))
        .append("\n");
    sb.append("    rolloutSteps: ").append(toIndentedString(rolloutSteps)).append("\n");
    sb.append("    selectionIntervalMs: ")
        .append(toIndentedString(selectionIntervalMs))
        .append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
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
