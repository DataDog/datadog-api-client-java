/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Variable object for <code>extractVariable</code> step type. */
@JsonPropertyOrder({
  SyntheticsMobileStepParamsVariable.JSON_PROPERTY_EXAMPLE,
  SyntheticsMobileStepParamsVariable.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsMobileStepParamsVariable {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EXAMPLE = "example";
  private String example;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public SyntheticsMobileStepParamsVariable() {}

  @JsonCreator
  public SyntheticsMobileStepParamsVariable(
      @JsonProperty(required = true, value = JSON_PROPERTY_EXAMPLE) String example,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.example = example;
    this.name = name;
  }

  public SyntheticsMobileStepParamsVariable example(String example) {
    this.example = example;
    return this;
  }

  /**
   * An example for the variable.
   *
   * @return example
   */
  @JsonProperty(JSON_PROPERTY_EXAMPLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getExample() {
    return example;
  }

  public void setExample(String example) {
    this.example = example;
  }

  public SyntheticsMobileStepParamsVariable name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The variable name.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
   * @return SyntheticsMobileStepParamsVariable
   */
  @JsonAnySetter
  public SyntheticsMobileStepParamsVariable putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsMobileStepParamsVariable object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsMobileStepParamsVariable syntheticsMobileStepParamsVariable =
        (SyntheticsMobileStepParamsVariable) o;
    return Objects.equals(this.example, syntheticsMobileStepParamsVariable.example)
        && Objects.equals(this.name, syntheticsMobileStepParamsVariable.name)
        && Objects.equals(
            this.additionalProperties, syntheticsMobileStepParamsVariable.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(example, name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsMobileStepParamsVariable {\n");
    sb.append("    example: ").append(toIndentedString(example)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
