/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Trigger a workflow when a responder is created for an incident.</p>
 */
@JsonPropertyOrder({
  IncidentResponderCreatedTrigger.JSON_PROPERTY_EXECUTION_LIMIT,
  IncidentResponderCreatedTrigger.JSON_PROPERTY_INCIDENT_TYPE,
  IncidentResponderCreatedTrigger.JSON_PROPERTY_TAG_CONDITION
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentResponderCreatedTrigger {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_EXECUTION_LIMIT = "executionLimit";
  private ExecutionLimit executionLimit;

  public static final String JSON_PROPERTY_INCIDENT_TYPE = "incidentType";
  private String incidentType;

  public static final String JSON_PROPERTY_TAG_CONDITION = "tagCondition";
  private IncidentCondition tagCondition;

  public IncidentResponderCreatedTrigger executionLimit(ExecutionLimit executionLimit) {
    this.executionLimit = executionLimit;
    this.unparsed |= executionLimit.unparsed;
    return this;
  }

  /**
   * <p>The maximum number of times to execute a workflow for an incident.</p>
   * @return executionLimit
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EXECUTION_LIMIT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ExecutionLimit getExecutionLimit() {
        return executionLimit;
      }
  public void setExecutionLimit(ExecutionLimit executionLimit) {
    this.executionLimit = executionLimit;
    if (executionLimit != null) {
      this.unparsed |= executionLimit.unparsed;
    }
  }
  public IncidentResponderCreatedTrigger incidentType(String incidentType) {
    this.incidentType = incidentType;
    return this;
  }

  /**
   * <p>The type of incident that triggers the workflow.</p>
   * @return incidentType
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INCIDENT_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getIncidentType() {
        return incidentType;
      }
  public void setIncidentType(String incidentType) {
    this.incidentType = incidentType;
  }
  public IncidentResponderCreatedTrigger tagCondition(IncidentCondition tagCondition) {
    this.tagCondition = tagCondition;
    this.unparsed |= tagCondition.unparsed;
    return this;
  }

  /**
   * <p>Conditions that determine which incidents trigger the workflow.</p>
   * @return tagCondition
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TAG_CONDITION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return IncidentResponderCreatedTrigger
   */
  @JsonAnySetter
  public IncidentResponderCreatedTrigger putAdditionalProperty(String key, Object value) {
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
   * Return true if this IncidentResponderCreatedTrigger object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentResponderCreatedTrigger incidentResponderCreatedTrigger = (IncidentResponderCreatedTrigger) o;
    return Objects.equals(this.executionLimit, incidentResponderCreatedTrigger.executionLimit) && Objects.equals(this.incidentType, incidentResponderCreatedTrigger.incidentType) && Objects.equals(this.tagCondition, incidentResponderCreatedTrigger.tagCondition) && Objects.equals(this.additionalProperties, incidentResponderCreatedTrigger.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(executionLimit,incidentType,tagCondition, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentResponderCreatedTrigger {\n");
    sb.append("    executionLimit: ").append(toIndentedString(executionLimit)).append("\n");
    sb.append("    incidentType: ").append(toIndentedString(incidentType)).append("\n");
    sb.append("    tagCondition: ").append(toIndentedString(tagCondition)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
