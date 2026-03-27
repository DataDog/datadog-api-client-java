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
   * <p>Schema for a Notebook-based trigger.</p>
 */
@JsonPropertyOrder({
  NotebookTriggerWrapper.JSON_PROPERTY_NOTEBOOK_TRIGGER,
  NotebookTriggerWrapper.JSON_PROPERTY_START_STEP_NAMES
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NotebookTriggerWrapper {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_NOTEBOOK_TRIGGER = "notebookTrigger";
  private Object notebookTrigger;

  public static final String JSON_PROPERTY_START_STEP_NAMES = "startStepNames";
  private List<String> startStepNames = null;

  public NotebookTriggerWrapper() {}

  @JsonCreator
  public NotebookTriggerWrapper(
            @JsonProperty(required=true, value=JSON_PROPERTY_NOTEBOOK_TRIGGER)Object notebookTrigger) {
        this.notebookTrigger = notebookTrigger;
  }
  public NotebookTriggerWrapper notebookTrigger(Object notebookTrigger) {
    this.notebookTrigger = notebookTrigger;
    return this;
  }

  /**
   * <p>Trigger a workflow from a Notebook.</p>
   * @return notebookTrigger
  **/
      @JsonProperty(JSON_PROPERTY_NOTEBOOK_TRIGGER)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Object getNotebookTrigger() {
        return notebookTrigger;
      }
  public void setNotebookTrigger(Object notebookTrigger) {
    this.notebookTrigger = notebookTrigger;
  }
  public NotebookTriggerWrapper startStepNames(List<String> startStepNames) {
    this.startStepNames = startStepNames;
    return this;
  }
  public NotebookTriggerWrapper addStartStepNamesItem(String startStepNamesItem) {
    if (this.startStepNames == null) {
      this.startStepNames = new ArrayList<>();
    }
    this.startStepNames.add(startStepNamesItem);
    return this;
  }

  /**
   * <p>A list of steps that run first after a trigger fires.</p>
   * @return startStepNames
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_START_STEP_NAMES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getStartStepNames() {
        return startStepNames;
      }
  public void setStartStepNames(List<String> startStepNames) {
    this.startStepNames = startStepNames;
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
   * @return NotebookTriggerWrapper
   */
  @JsonAnySetter
  public NotebookTriggerWrapper putAdditionalProperty(String key, Object value) {
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
   * Return true if this NotebookTriggerWrapper object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotebookTriggerWrapper notebookTriggerWrapper = (NotebookTriggerWrapper) o;
    return Objects.equals(this.notebookTrigger, notebookTriggerWrapper.notebookTrigger) && Objects.equals(this.startStepNames, notebookTriggerWrapper.startStepNames) && Objects.equals(this.additionalProperties, notebookTriggerWrapper.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(notebookTrigger,startStepNames, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotebookTriggerWrapper {\n");
    sb.append("    notebookTrigger: ").append(toIndentedString(notebookTrigger)).append("\n");
    sb.append("    startStepNames: ").append(toIndentedString(startStepNames)).append("\n");
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
