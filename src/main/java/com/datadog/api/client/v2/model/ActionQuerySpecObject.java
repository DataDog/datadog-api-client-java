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

/** The action query spec object. */
@JsonPropertyOrder({
  ActionQuerySpecObject.JSON_PROPERTY_CONNECTION_GROUP,
  ActionQuerySpecObject.JSON_PROPERTY_CONNECTION_ID,
  ActionQuerySpecObject.JSON_PROPERTY_FQN,
  ActionQuerySpecObject.JSON_PROPERTY_INPUTS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ActionQuerySpecObject {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONNECTION_GROUP = "connectionGroup";
  private ActionQuerySpecConnectionGroup connectionGroup;

  public static final String JSON_PROPERTY_CONNECTION_ID = "connectionId";
  private String connectionId;

  public static final String JSON_PROPERTY_FQN = "fqn";
  private String fqn;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private ActionQuerySpecInputs inputs;

  public ActionQuerySpecObject() {}

  @JsonCreator
  public ActionQuerySpecObject(
      @JsonProperty(required = true, value = JSON_PROPERTY_FQN) String fqn) {
    this.fqn = fqn;
  }

  public ActionQuerySpecObject connectionGroup(ActionQuerySpecConnectionGroup connectionGroup) {
    this.connectionGroup = connectionGroup;
    this.unparsed |= connectionGroup.unparsed;
    return this;
  }

  /**
   * The connection group to use for an action query.
   *
   * @return connectionGroup
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONNECTION_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ActionQuerySpecConnectionGroup getConnectionGroup() {
    return connectionGroup;
  }

  public void setConnectionGroup(ActionQuerySpecConnectionGroup connectionGroup) {
    this.connectionGroup = connectionGroup;
  }

  public ActionQuerySpecObject connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

  /**
   * The ID of the custom connection to use for this action query.
   *
   * @return connectionId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getConnectionId() {
    return connectionId;
  }

  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }

  public ActionQuerySpecObject fqn(String fqn) {
    this.fqn = fqn;
    return this;
  }

  /**
   * The fully qualified name of the action type.
   *
   * @return fqn
   */
  @JsonProperty(JSON_PROPERTY_FQN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFqn() {
    return fqn;
  }

  public void setFqn(String fqn) {
    this.fqn = fqn;
  }

  public ActionQuerySpecObject inputs(ActionQuerySpecInputs inputs) {
    this.inputs = inputs;
    this.unparsed |= inputs.unparsed;
    return this;
  }

  /**
   * The inputs to the action query. These are the values that are passed to the action when it is
   * triggered.
   *
   * @return inputs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INPUTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ActionQuerySpecInputs getInputs() {
    return inputs;
  }

  public void setInputs(ActionQuerySpecInputs inputs) {
    this.inputs = inputs;
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
   * @return ActionQuerySpecObject
   */
  @JsonAnySetter
  public ActionQuerySpecObject putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ActionQuerySpecObject object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionQuerySpecObject actionQuerySpecObject = (ActionQuerySpecObject) o;
    return Objects.equals(this.connectionGroup, actionQuerySpecObject.connectionGroup)
        && Objects.equals(this.connectionId, actionQuerySpecObject.connectionId)
        && Objects.equals(this.fqn, actionQuerySpecObject.fqn)
        && Objects.equals(this.inputs, actionQuerySpecObject.inputs)
        && Objects.equals(this.additionalProperties, actionQuerySpecObject.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionGroup, connectionId, fqn, inputs, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionQuerySpecObject {\n");
    sb.append("    connectionGroup: ").append(toIndentedString(connectionGroup)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    fqn: ").append(toIndentedString(fqn)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
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
