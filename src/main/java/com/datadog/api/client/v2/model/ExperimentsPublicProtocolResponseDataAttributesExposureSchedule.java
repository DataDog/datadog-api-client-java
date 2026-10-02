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

/** Schedule that controls traffic exposure for experiments created from the protocol. */
@JsonPropertyOrder({
  ExperimentsPublicProtocolResponseDataAttributesExposureSchedule.JSON_PROPERTY_AUTOSTART,
  ExperimentsPublicProtocolResponseDataAttributesExposureSchedule
      .JSON_PROPERTY_GUARDRAIL_TRIGGERED_ACTION,
  ExperimentsPublicProtocolResponseDataAttributesExposureSchedule.JSON_PROPERTY_ROLLOUT_STEPS,
  ExperimentsPublicProtocolResponseDataAttributesExposureSchedule
      .JSON_PROPERTY_SELECTION_INTERVAL_MS,
  ExperimentsPublicProtocolResponseDataAttributesExposureSchedule.JSON_PROPERTY_STRATEGY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsPublicProtocolResponseDataAttributesExposureSchedule {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTOSTART = "autostart";
  private Boolean autostart;

  public static final String JSON_PROPERTY_GUARDRAIL_TRIGGERED_ACTION =
      "guardrail_triggered_action";
  private String guardrailTriggeredAction;

  public static final String JSON_PROPERTY_ROLLOUT_STEPS = "rollout_steps";
  private List<ExperimentsPublicProtocolResponseDataAttributesExposureScheduleRolloutStepsItems>
      rolloutSteps = null;

  public static final String JSON_PROPERTY_SELECTION_INTERVAL_MS = "selection_interval_ms";
  private Long selectionIntervalMs;

  public static final String JSON_PROPERTY_STRATEGY = "strategy";
  private String strategy;

  public ExperimentsPublicProtocolResponseDataAttributesExposureSchedule autostart(
      Boolean autostart) {
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

  public ExperimentsPublicProtocolResponseDataAttributesExposureSchedule guardrailTriggeredAction(
      String guardrailTriggeredAction) {
    this.guardrailTriggeredAction = guardrailTriggeredAction;
    return this;
  }

  /**
   * Action taken when a guardrail triggers during the exposure schedule.
   *
   * @return guardrailTriggeredAction
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GUARDRAIL_TRIGGERED_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getGuardrailTriggeredAction() {
    return guardrailTriggeredAction;
  }

  public void setGuardrailTriggeredAction(String guardrailTriggeredAction) {
    this.guardrailTriggeredAction = guardrailTriggeredAction;
  }

  public ExperimentsPublicProtocolResponseDataAttributesExposureSchedule rolloutSteps(
      List<ExperimentsPublicProtocolResponseDataAttributesExposureScheduleRolloutStepsItems>
          rolloutSteps) {
    this.rolloutSteps = rolloutSteps;
    if (rolloutSteps != null) {
      for (ExperimentsPublicProtocolResponseDataAttributesExposureScheduleRolloutStepsItems item :
          rolloutSteps) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ExperimentsPublicProtocolResponseDataAttributesExposureSchedule addRolloutStepsItem(
      ExperimentsPublicProtocolResponseDataAttributesExposureScheduleRolloutStepsItems
          rolloutStepsItem) {
    if (this.rolloutSteps == null) {
      this.rolloutSteps = new ArrayList<>();
    }
    this.rolloutSteps.add(rolloutStepsItem);
    this.unparsed |= rolloutStepsItem.unparsed;
    return this;
  }

  /**
   * Ordered steps that define changes in traffic exposure.
   *
   * @return rolloutSteps
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROLLOUT_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ExperimentsPublicProtocolResponseDataAttributesExposureScheduleRolloutStepsItems>
      getRolloutSteps() {
    return rolloutSteps;
  }

  public void setRolloutSteps(
      List<ExperimentsPublicProtocolResponseDataAttributesExposureScheduleRolloutStepsItems>
          rolloutSteps) {
    this.rolloutSteps = rolloutSteps;
    if (rolloutSteps != null) {
      for (ExperimentsPublicProtocolResponseDataAttributesExposureScheduleRolloutStepsItems item :
          rolloutSteps) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ExperimentsPublicProtocolResponseDataAttributesExposureSchedule selectionIntervalMs(
      Long selectionIntervalMs) {
    this.selectionIntervalMs = selectionIntervalMs;
    return this;
  }

  /**
   * Interval between traffic selections, in milliseconds.
   *
   * @return selectionIntervalMs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SELECTION_INTERVAL_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSelectionIntervalMs() {
    return selectionIntervalMs;
  }

  public void setSelectionIntervalMs(Long selectionIntervalMs) {
    this.selectionIntervalMs = selectionIntervalMs;
  }

  public ExperimentsPublicProtocolResponseDataAttributesExposureSchedule strategy(String strategy) {
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
   * @return ExperimentsPublicProtocolResponseDataAttributesExposureSchedule
   */
  @JsonAnySetter
  public ExperimentsPublicProtocolResponseDataAttributesExposureSchedule putAdditionalProperty(
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

  /**
   * Return true if this ExperimentsPublicProtocolResponseDataAttributesExposureSchedule object is
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
    ExperimentsPublicProtocolResponseDataAttributesExposureSchedule
        experimentsPublicProtocolResponseDataAttributesExposureSchedule =
            (ExperimentsPublicProtocolResponseDataAttributesExposureSchedule) o;
    return Objects.equals(
            this.autostart,
            experimentsPublicProtocolResponseDataAttributesExposureSchedule.autostart)
        && Objects.equals(
            this.guardrailTriggeredAction,
            experimentsPublicProtocolResponseDataAttributesExposureSchedule
                .guardrailTriggeredAction)
        && Objects.equals(
            this.rolloutSteps,
            experimentsPublicProtocolResponseDataAttributesExposureSchedule.rolloutSteps)
        && Objects.equals(
            this.selectionIntervalMs,
            experimentsPublicProtocolResponseDataAttributesExposureSchedule.selectionIntervalMs)
        && Objects.equals(
            this.strategy, experimentsPublicProtocolResponseDataAttributesExposureSchedule.strategy)
        && Objects.equals(
            this.additionalProperties,
            experimentsPublicProtocolResponseDataAttributesExposureSchedule.additionalProperties);
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
    sb.append("class ExperimentsPublicProtocolResponseDataAttributesExposureSchedule {\n");
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
