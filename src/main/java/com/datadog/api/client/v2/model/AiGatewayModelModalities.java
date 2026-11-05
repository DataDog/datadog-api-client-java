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

/** Supported model input and output modalities. */
@JsonPropertyOrder({
  AiGatewayModelModalities.JSON_PROPERTY_INPUT,
  AiGatewayModelModalities.JSON_PROPERTY_OUTPUT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayModelModalities {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INPUT = "input";
  private List<String> input = null;

  public static final String JSON_PROPERTY_OUTPUT = "output";
  private List<String> output = null;

  public AiGatewayModelModalities input(List<String> input) {
    this.input = input;
    return this;
  }

  public AiGatewayModelModalities addInputItem(String inputItem) {
    if (this.input == null) {
      this.input = new ArrayList<>();
    }
    this.input.add(inputItem);
    return this;
  }

  /**
   * Getinput
   *
   * @return input
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getInput() {
    return input;
  }

  public void setInput(List<String> input) {
    this.input = input;
  }

  public AiGatewayModelModalities output(List<String> output) {
    this.output = output;
    return this;
  }

  public AiGatewayModelModalities addOutputItem(String outputItem) {
    if (this.output == null) {
      this.output = new ArrayList<>();
    }
    this.output.add(outputItem);
    return this;
  }

  /**
   * Getoutput
   *
   * @return output
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getOutput() {
    return output;
  }

  public void setOutput(List<String> output) {
    this.output = output;
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
   * @return AiGatewayModelModalities
   */
  @JsonAnySetter
  public AiGatewayModelModalities putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayModelModalities object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayModelModalities aiGatewayModelModalities = (AiGatewayModelModalities) o;
    return Objects.equals(this.input, aiGatewayModelModalities.input)
        && Objects.equals(this.output, aiGatewayModelModalities.output)
        && Objects.equals(this.additionalProperties, aiGatewayModelModalities.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input, output, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayModelModalities {\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
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
