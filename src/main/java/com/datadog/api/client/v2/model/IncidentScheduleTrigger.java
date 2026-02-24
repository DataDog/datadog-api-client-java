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

/** Trigger a workflow from an Incident Schedule. The workflow must be published. */
@JsonPropertyOrder({
  IncidentScheduleTrigger.JSON_PROPERTY_INCIDENT_TYPE,
  IncidentScheduleTrigger.JSON_PROPERTY_RRULE,
  IncidentScheduleTrigger.JSON_PROPERTY_TAG_CONDITION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentScheduleTrigger {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INCIDENT_TYPE = "incidentType";
  private String incidentType;

  public static final String JSON_PROPERTY_RRULE = "rrule";
  private String rrule;

  public static final String JSON_PROPERTY_TAG_CONDITION = "tagCondition";
  private IncidentCondition tagCondition;

  public IncidentScheduleTrigger() {}

  @JsonCreator
  public IncidentScheduleTrigger(
      @JsonProperty(required = true, value = JSON_PROPERTY_RRULE) String rrule) {
    this.rrule = rrule;
  }

  public IncidentScheduleTrigger incidentType(String incidentType) {
    this.incidentType = incidentType;
    return this;
  }

  /**
   * Incident type filter for the schedule.
   *
   * @return incidentType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCIDENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIncidentType() {
    return incidentType;
  }

  public void setIncidentType(String incidentType) {
    this.incidentType = incidentType;
  }

  public IncidentScheduleTrigger rrule(String rrule) {
    this.rrule = rrule;
    return this;
  }

  /**
   * Recurrence rule expression for scheduling.
   *
   * @return rrule
   */
  @JsonProperty(JSON_PROPERTY_RRULE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRrule() {
    return rrule;
  }

  public void setRrule(String rrule) {
    this.rrule = rrule;
  }

  public IncidentScheduleTrigger tagCondition(IncidentCondition tagCondition) {
    this.tagCondition = tagCondition;
    this.unparsed |= tagCondition.unparsed;
    return this;
  }

  /**
   * A condition evaluated against incident tags.
   *
   * @return tagCondition
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAG_CONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncidentCondition getTagCondition() {
    return tagCondition;
  }

  public void setTagCondition(IncidentCondition tagCondition) {
    this.tagCondition = tagCondition;
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
   * @return IncidentScheduleTrigger
   */
  @JsonAnySetter
  public IncidentScheduleTrigger putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentScheduleTrigger object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentScheduleTrigger incidentScheduleTrigger = (IncidentScheduleTrigger) o;
    return Objects.equals(this.incidentType, incidentScheduleTrigger.incidentType)
        && Objects.equals(this.rrule, incidentScheduleTrigger.rrule)
        && Objects.equals(this.tagCondition, incidentScheduleTrigger.tagCondition)
        && Objects.equals(this.additionalProperties, incidentScheduleTrigger.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(incidentType, rrule, tagCondition, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentScheduleTrigger {\n");
    sb.append("    incidentType: ").append(toIndentedString(incidentType)).append("\n");
    sb.append("    rrule: ").append(toIndentedString(rrule)).append("\n");
    sb.append("    tagCondition: ").append(toIndentedString(tagCondition)).append("\n");
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
