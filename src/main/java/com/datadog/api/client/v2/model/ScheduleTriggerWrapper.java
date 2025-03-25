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

/** Schema for a Schedule-based trigger. */
@JsonPropertyOrder({
  ScheduleTriggerWrapper.JSON_PROPERTY_SCHEDULE_TRIGGER,
  ScheduleTriggerWrapper.JSON_PROPERTY_START_STEP_NAMES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScheduleTriggerWrapper {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SCHEDULE_TRIGGER = "scheduleTrigger";
  private ScheduleTrigger scheduleTrigger;

  public static final String JSON_PROPERTY_START_STEP_NAMES = "startStepNames";
  private List<String> startStepNames = null;

  public ScheduleTriggerWrapper() {}

  @JsonCreator
  public ScheduleTriggerWrapper(
      @JsonProperty(required = true, value = JSON_PROPERTY_SCHEDULE_TRIGGER)
          ScheduleTrigger scheduleTrigger) {
    this.scheduleTrigger = scheduleTrigger;
    this.unparsed |= scheduleTrigger.unparsed;
  }

  public ScheduleTriggerWrapper scheduleTrigger(ScheduleTrigger scheduleTrigger) {
    this.scheduleTrigger = scheduleTrigger;
    this.unparsed |= scheduleTrigger.unparsed;
    return this;
  }

  /**
   * Trigger a workflow from a Schedule. The workflow must be published.
   *
   * @return scheduleTrigger
   */
  @JsonProperty(JSON_PROPERTY_SCHEDULE_TRIGGER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ScheduleTrigger getScheduleTrigger() {
    return scheduleTrigger;
  }

  public void setScheduleTrigger(ScheduleTrigger scheduleTrigger) {
    this.scheduleTrigger = scheduleTrigger;
  }

  public ScheduleTriggerWrapper startStepNames(List<String> startStepNames) {
    this.startStepNames = startStepNames;
    return this;
  }

  public ScheduleTriggerWrapper addStartStepNamesItem(String startStepNamesItem) {
    if (this.startStepNames == null) {
      this.startStepNames = new ArrayList<>();
    }
    this.startStepNames.add(startStepNamesItem);
    return this;
  }

  /**
   * A list of steps that run first after a trigger fires.
   *
   * @return startStepNames
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_STEP_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getStartStepNames() {
    return startStepNames;
  }

  public void setStartStepNames(List<String> startStepNames) {
    this.startStepNames = startStepNames;
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
   * @return ScheduleTriggerWrapper
   */
  @JsonAnySetter
  public ScheduleTriggerWrapper putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ScheduleTriggerWrapper object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleTriggerWrapper scheduleTriggerWrapper = (ScheduleTriggerWrapper) o;
    return Objects.equals(this.scheduleTrigger, scheduleTriggerWrapper.scheduleTrigger)
        && Objects.equals(this.startStepNames, scheduleTriggerWrapper.startStepNames)
        && Objects.equals(this.additionalProperties, scheduleTriggerWrapper.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduleTrigger, startStepNames, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleTriggerWrapper {\n");
    sb.append("    scheduleTrigger: ").append(toIndentedString(scheduleTrigger)).append("\n");
    sb.append("    startStepNames: ").append(toIndentedString(startStepNames)).append("\n");
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
