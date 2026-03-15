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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** A function to apply when computing a column's value. */
@JsonPropertyOrder({
  GuidedTableColumnFunction.JSON_PROPERTY_ARGS,
  GuidedTableColumnFunction.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GuidedTableColumnFunction {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ARGS = "args";
  private List<Object> args = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public GuidedTableColumnFunction() {}

  @JsonCreator
  public GuidedTableColumnFunction(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.name = name;
  }

  public GuidedTableColumnFunction args(List<Object> args) {
    this.args = args;
    for (Object item : args) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public GuidedTableColumnFunction addArgsItem(Object argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<>();
    }
    this.args.add(argsItem);
    this.unparsed |= argsItem.unparsed;
    return this;
  }

  /**
   * Arguments passed to the function in order.
   *
   * @return args
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Object> getArgs() {
    return args;
  }

  public void setArgs(List<Object> args) {
    this.args = args;
  }

  public GuidedTableColumnFunction name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Function name (e.g. <code>clamp_min</code>, <code>abs</code>, <code>round</code>). Not
   * restricted to a fixed set.
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
   * @return GuidedTableColumnFunction
   */
  @JsonAnySetter
  public GuidedTableColumnFunction putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GuidedTableColumnFunction object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuidedTableColumnFunction guidedTableColumnFunction = (GuidedTableColumnFunction) o;
    return Objects.equals(this.args, guidedTableColumnFunction.args)
        && Objects.equals(this.name, guidedTableColumnFunction.name)
        && Objects.equals(
            this.additionalProperties, guidedTableColumnFunction.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(args, name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuidedTableColumnFunction {\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
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
