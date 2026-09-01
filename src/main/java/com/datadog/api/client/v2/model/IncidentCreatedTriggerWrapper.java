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

/** Schema for an incident declared trigger. */
@JsonPropertyOrder({
  IncidentCreatedTriggerWrapper.JSON_PROPERTY_INCIDENT_CREATED_TRIGGER,
  IncidentCreatedTriggerWrapper.JSON_PROPERTY_START_STEP_NAMES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentCreatedTriggerWrapper {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INCIDENT_CREATED_TRIGGER = "incidentCreatedTrigger";
  private IncidentCreatedTrigger incidentCreatedTrigger;

  public static final String JSON_PROPERTY_START_STEP_NAMES = "startStepNames";
  private List<String> startStepNames = null;

  public IncidentCreatedTriggerWrapper() {}

  @JsonCreator
  public IncidentCreatedTriggerWrapper(
      @JsonProperty(required = true, value = JSON_PROPERTY_INCIDENT_CREATED_TRIGGER)
          IncidentCreatedTrigger incidentCreatedTrigger) {
    this.incidentCreatedTrigger = incidentCreatedTrigger;
    this.unparsed |= incidentCreatedTrigger.unparsed;
  }

  public IncidentCreatedTriggerWrapper incidentCreatedTrigger(
      IncidentCreatedTrigger incidentCreatedTrigger) {
    this.incidentCreatedTrigger = incidentCreatedTrigger;
    this.unparsed |= incidentCreatedTrigger.unparsed;
    return this;
  }

  /**
   * Trigger a workflow when an incident is declared.
   *
   * @return incidentCreatedTrigger
   */
  @JsonProperty(JSON_PROPERTY_INCIDENT_CREATED_TRIGGER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentCreatedTrigger getIncidentCreatedTrigger() {
    return incidentCreatedTrigger;
  }

  public void setIncidentCreatedTrigger(IncidentCreatedTrigger incidentCreatedTrigger) {
    this.incidentCreatedTrigger = incidentCreatedTrigger;
    if (incidentCreatedTrigger != null) {
      this.unparsed |= incidentCreatedTrigger.unparsed;
    }
  }

  public IncidentCreatedTriggerWrapper startStepNames(List<String> startStepNames) {
    this.startStepNames = startStepNames;
    return this;
  }

  public IncidentCreatedTriggerWrapper addStartStepNamesItem(String startStepNamesItem) {
    if (this.startStepNames == null) {
      this.startStepNames = new ArrayList<>();
    }
    this.startStepNames.add(startStepNamesItem);
    return this;
  }

  /**
   * Names of existing workflow steps that run first after a trigger fires.
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
   * @return IncidentCreatedTriggerWrapper
   */
  @JsonAnySetter
  public IncidentCreatedTriggerWrapper putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentCreatedTriggerWrapper object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentCreatedTriggerWrapper incidentCreatedTriggerWrapper = (IncidentCreatedTriggerWrapper) o;
    return Objects.equals(
            this.incidentCreatedTrigger, incidentCreatedTriggerWrapper.incidentCreatedTrigger)
        && Objects.equals(this.startStepNames, incidentCreatedTriggerWrapper.startStepNames)
        && Objects.equals(
            this.additionalProperties, incidentCreatedTriggerWrapper.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(incidentCreatedTrigger, startStepNames, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentCreatedTriggerWrapper {\n");
    sb.append("    incidentCreatedTrigger: ")
        .append(toIndentedString(incidentCreatedTrigger))
        .append("\n");
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
