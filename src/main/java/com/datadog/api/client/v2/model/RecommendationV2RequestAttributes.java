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

/**
 * Attributes for requesting SPA recommendations by forwarding a Spark job's raw arguments instead
 * of a precomputed shard.
 */
@JsonPropertyOrder({RecommendationV2RequestAttributes.JSON_PROPERTY_ARGUMENTS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RecommendationV2RequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ARGUMENTS = "arguments";
  private List<String> arguments = new ArrayList<>();

  public RecommendationV2RequestAttributes() {}

  @JsonCreator
  public RecommendationV2RequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ARGUMENTS) List<String> arguments) {
    this.arguments = arguments;
  }

  public RecommendationV2RequestAttributes arguments(List<String> arguments) {
    this.arguments = arguments;
    return this;
  }

  public RecommendationV2RequestAttributes addArgumentsItem(String argumentsItem) {
    this.arguments.add(argumentsItem);
    return this;
  }

  /**
   * Raw, unfiltered Spark job arguments as submitted (for example, <code>--org_id=2</code>). SPA
   * determines which arguments are relevant for the given service.
   *
   * @return arguments
   */
  @JsonProperty(JSON_PROPERTY_ARGUMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getArguments() {
    return arguments;
  }

  public void setArguments(List<String> arguments) {
    this.arguments = arguments;
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
   * @return RecommendationV2RequestAttributes
   */
  @JsonAnySetter
  public RecommendationV2RequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RecommendationV2RequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationV2RequestAttributes recommendationV2RequestAttributes =
        (RecommendationV2RequestAttributes) o;
    return Objects.equals(this.arguments, recommendationV2RequestAttributes.arguments)
        && Objects.equals(
            this.additionalProperties, recommendationV2RequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arguments, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationV2RequestAttributes {\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
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
