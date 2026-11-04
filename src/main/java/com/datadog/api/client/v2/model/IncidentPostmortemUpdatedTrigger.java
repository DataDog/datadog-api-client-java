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

/** Trigger a workflow when a postmortem is updated for an incident. */
@JsonPropertyOrder({
  IncidentPostmortemUpdatedTrigger.JSON_PROPERTY_EXECUTION_LIMIT,
  IncidentPostmortemUpdatedTrigger.JSON_PROPERTY_INCIDENT_TYPE,
  IncidentPostmortemUpdatedTrigger.JSON_PROPERTY_INCIDENT_TYPES,
  IncidentPostmortemUpdatedTrigger.JSON_PROPERTY_TAG_CONDITION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentPostmortemUpdatedTrigger {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EXECUTION_LIMIT = "executionLimit";
  private ExecutionLimit executionLimit;

  public static final String JSON_PROPERTY_INCIDENT_TYPE = "incidentType";
  private String incidentType;

  public static final String JSON_PROPERTY_INCIDENT_TYPES = "incidentTypes";
  private List<String> incidentTypes = null;

  public static final String JSON_PROPERTY_TAG_CONDITION = "tagCondition";
  private IncidentCondition tagCondition;

  public IncidentPostmortemUpdatedTrigger executionLimit(ExecutionLimit executionLimit) {
    this.executionLimit = executionLimit;
    this.unparsed |= executionLimit.unparsed;
    return this;
  }

  /**
   * The maximum number of times to execute a workflow for an incident.
   *
   * @return executionLimit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXECUTION_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExecutionLimit getExecutionLimit() {
    return executionLimit;
  }

  public void setExecutionLimit(ExecutionLimit executionLimit) {
    this.executionLimit = executionLimit;
    if (executionLimit != null) {
      this.unparsed |= executionLimit.unparsed;
    }
  }

  public IncidentPostmortemUpdatedTrigger incidentType(String incidentType) {
    this.incidentType = incidentType;
    return this;
  }

  /**
   * The type of incident that triggers the workflow. Deprecated. Use <code>incidentTypes</code>
   * instead.
   *
   * @return incidentType
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCIDENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIncidentType() {
    return incidentType;
  }

  @Deprecated
  public void setIncidentType(String incidentType) {
    this.incidentType = incidentType;
  }

  public IncidentPostmortemUpdatedTrigger incidentTypes(List<String> incidentTypes) {
    this.incidentTypes = incidentTypes;
    return this;
  }

  public IncidentPostmortemUpdatedTrigger addIncidentTypesItem(String incidentTypesItem) {
    if (this.incidentTypes == null) {
      this.incidentTypes = new ArrayList<>();
    }
    this.incidentTypes.add(incidentTypesItem);
    return this;
  }

  /**
   * The types of incidents that trigger the workflow.
   *
   * @return incidentTypes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCIDENT_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getIncidentTypes() {
    return incidentTypes;
  }

  public void setIncidentTypes(List<String> incidentTypes) {
    this.incidentTypes = incidentTypes;
  }

  public IncidentPostmortemUpdatedTrigger tagCondition(IncidentCondition tagCondition) {
    this.tagCondition = tagCondition;
    this.unparsed |= tagCondition.unparsed;
    return this;
  }

  /**
   * Conditions that determine which incidents trigger the workflow.
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
    if (tagCondition != null) {
      this.unparsed |= tagCondition.unparsed;
    }
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
   * @return IncidentPostmortemUpdatedTrigger
   */
  @JsonAnySetter
  public IncidentPostmortemUpdatedTrigger putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentPostmortemUpdatedTrigger object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentPostmortemUpdatedTrigger incidentPostmortemUpdatedTrigger =
        (IncidentPostmortemUpdatedTrigger) o;
    return Objects.equals(this.executionLimit, incidentPostmortemUpdatedTrigger.executionLimit)
        && Objects.equals(this.incidentType, incidentPostmortemUpdatedTrigger.incidentType)
        && Objects.equals(this.incidentTypes, incidentPostmortemUpdatedTrigger.incidentTypes)
        && Objects.equals(this.tagCondition, incidentPostmortemUpdatedTrigger.tagCondition)
        && Objects.equals(
            this.additionalProperties, incidentPostmortemUpdatedTrigger.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        executionLimit, incidentType, incidentTypes, tagCondition, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentPostmortemUpdatedTrigger {\n");
    sb.append("    executionLimit: ").append(toIndentedString(executionLimit)).append("\n");
    sb.append("    incidentType: ").append(toIndentedString(incidentType)).append("\n");
    sb.append("    incidentTypes: ").append(toIndentedString(incidentTypes)).append("\n");
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
