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
import java.util.UUID;

/** A condition that uses a saved filter. Inline fields must be omitted or null. */
@JsonPropertyOrder({ExperimentsSavedFilterCondition.JSON_PROPERTY_SAVED_FILTER_ID})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsSavedFilterCondition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SAVED_FILTER_ID = "saved_filter_id";
  private UUID savedFilterId;

  public ExperimentsSavedFilterCondition() {}

  @JsonCreator
  public ExperimentsSavedFilterCondition(
      @JsonProperty(required = true, value = JSON_PROPERTY_SAVED_FILTER_ID) UUID savedFilterId) {
    this.savedFilterId = savedFilterId;
  }

  public ExperimentsSavedFilterCondition savedFilterId(UUID savedFilterId) {
    this.savedFilterId = savedFilterId;
    return this;
  }

  /**
   * Saved-filter UUID.
   *
   * @return savedFilterId
   */
  @JsonProperty(JSON_PROPERTY_SAVED_FILTER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getSavedFilterId() {
    return savedFilterId;
  }

  public void setSavedFilterId(UUID savedFilterId) {
    this.savedFilterId = savedFilterId;
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
   * @return ExperimentsSavedFilterCondition
   */
  @JsonAnySetter
  public ExperimentsSavedFilterCondition putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExperimentsSavedFilterCondition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsSavedFilterCondition experimentsSavedFilterCondition =
        (ExperimentsSavedFilterCondition) o;
    return Objects.equals(this.savedFilterId, experimentsSavedFilterCondition.savedFilterId)
        && Objects.equals(
            this.additionalProperties, experimentsSavedFilterCondition.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(savedFilterId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsSavedFilterCondition {\n");
    sb.append("    savedFilterId: ").append(toIndentedString(savedFilterId)).append("\n");
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
