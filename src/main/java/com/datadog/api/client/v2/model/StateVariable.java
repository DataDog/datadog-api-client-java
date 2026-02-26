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
   * <p>A variable, which can be set and read by other components in the app.</p>
 */
@JsonPropertyOrder({
  StateVariable.JSON_PROPERTY_ID,
  StateVariable.JSON_PROPERTY_NAME,
  StateVariable.JSON_PROPERTY_PROPERTIES,
  StateVariable.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class StateVariable {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private StateVariableProperties properties;

  public static final String JSON_PROPERTY_TYPE = "type";
  private StateVariableType type = StateVariableType.STATEVARIABLE;

  public StateVariable() {}

  @JsonCreator
  public StateVariable(
            @JsonProperty(required=true, value=JSON_PROPERTY_ID)UUID id,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_PROPERTIES)StateVariableProperties properties,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)StateVariableType type) {
        this.id = id;
        this.name = name;
        this.properties = properties;
        this.unparsed |= properties.unparsed;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public StateVariable id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * <p>The ID of the state variable.</p>
   * @return id
  **/
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public UUID getId() {
        return id;
      }
  public void setId(UUID id) {
    this.id = id;
  }
  public StateVariable name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>A unique identifier for this state variable. This name is also used to access the variable's value throughout the app.</p>
   * @return name
  **/
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public StateVariable properties(StateVariableProperties properties) {
    this.properties = properties;
    this.unparsed |= properties.unparsed;
    return this;
  }

  /**
   * <p>The properties of the state variable.</p>
   * @return properties
  **/
      @JsonProperty(JSON_PROPERTY_PROPERTIES)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public StateVariableProperties getProperties() {
        return properties;
      }
  public void setProperties(StateVariableProperties properties) {
    this.properties = properties;
  }
  public StateVariable type(StateVariableType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The state variable type.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public StateVariableType getType() {
        return type;
      }
  public void setType(StateVariableType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
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
   * @return StateVariable
   */
  @JsonAnySetter
  public StateVariable putAdditionalProperty(String key, Object value) {
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
   * Return true if this StateVariable object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StateVariable stateVariable = (StateVariable) o;
    return Objects.equals(this.id, stateVariable.id) && Objects.equals(this.name, stateVariable.name) && Objects.equals(this.properties, stateVariable.properties) && Objects.equals(this.type, stateVariable.type) && Objects.equals(this.additionalProperties, stateVariable.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(id,name,properties,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StateVariable {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
