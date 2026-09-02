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

/** A template variable definition for snapshot rendering. */
@JsonPropertyOrder({
  CreateSnapshotTemplateVariable.JSON_PROPERTY_NAME,
  CreateSnapshotTemplateVariable.JSON_PROPERTY_PREFIX,
  CreateSnapshotTemplateVariable.JSON_PROPERTY_VALUES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateSnapshotTemplateVariable {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PREFIX = "prefix";
  private String prefix;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<String> values = new ArrayList<>();

  public CreateSnapshotTemplateVariable() {}

  @JsonCreator
  public CreateSnapshotTemplateVariable(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_PREFIX) String prefix,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUES) List<String> values) {
    this.name = name;
    this.prefix = prefix;
    this.values = values;
  }

  public CreateSnapshotTemplateVariable name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The template variable name.
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

  public CreateSnapshotTemplateVariable prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

  /**
   * The tag prefix associated with the template variable. For example, a prefix of <code>host
   * </code> with a value of <code>web-server-1</code> scopes the snapshot to <code>
   * host:web-server-1</code>.
   *
   * @return prefix
   */
  @JsonProperty(JSON_PROPERTY_PREFIX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public CreateSnapshotTemplateVariable values(List<String> values) {
    this.values = values;
    return this;
  }

  public CreateSnapshotTemplateVariable addValuesItem(String valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

  /**
   * The list of scoped values for this template variable.
   *
   * @return values
   */
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
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
   * @return CreateSnapshotTemplateVariable
   */
  @JsonAnySetter
  public CreateSnapshotTemplateVariable putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CreateSnapshotTemplateVariable object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSnapshotTemplateVariable createSnapshotTemplateVariable =
        (CreateSnapshotTemplateVariable) o;
    return Objects.equals(this.name, createSnapshotTemplateVariable.name)
        && Objects.equals(this.prefix, createSnapshotTemplateVariable.prefix)
        && Objects.equals(this.values, createSnapshotTemplateVariable.values)
        && Objects.equals(
            this.additionalProperties, createSnapshotTemplateVariable.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, prefix, values, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSnapshotTemplateVariable {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
