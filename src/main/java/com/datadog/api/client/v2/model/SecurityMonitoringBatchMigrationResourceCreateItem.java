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

/** A source rule to translate into a Cloud SIEM detection rule. */
@JsonPropertyOrder({
  SecurityMonitoringBatchMigrationResourceCreateItem.JSON_PROPERTY_DESCRIPTION,
  SecurityMonitoringBatchMigrationResourceCreateItem.JSON_PROPERTY_INPUT,
  SecurityMonitoringBatchMigrationResourceCreateItem.JSON_PROPERTY_INPUT_TYPE,
  SecurityMonitoringBatchMigrationResourceCreateItem.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringBatchMigrationResourceCreateItem {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_INPUT = "input";
  private String input;

  public static final String JSON_PROPERTY_INPUT_TYPE = "inputType";
  private SecurityMonitoringBatchMigrationResourceInputType inputType;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public SecurityMonitoringBatchMigrationResourceCreateItem() {}

  @JsonCreator
  public SecurityMonitoringBatchMigrationResourceCreateItem(
      @JsonProperty(required = true, value = JSON_PROPERTY_INPUT) String input,
      @JsonProperty(required = true, value = JSON_PROPERTY_INPUT_TYPE)
          SecurityMonitoringBatchMigrationResourceInputType inputType) {
    this.input = input;
    this.inputType = inputType;
    this.unparsed |= !inputType.isValid();
  }

  public SecurityMonitoringBatchMigrationResourceCreateItem description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the resource.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SecurityMonitoringBatchMigrationResourceCreateItem input(String input) {
    this.input = input;
    return this;
  }

  /**
   * The source query or natural language description to translate. Must not be blank.
   *
   * @return input
   */
  @JsonProperty(JSON_PROPERTY_INPUT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getInput() {
    return input;
  }

  public void setInput(String input) {
    this.input = input;
  }

  public SecurityMonitoringBatchMigrationResourceCreateItem inputType(
      SecurityMonitoringBatchMigrationResourceInputType inputType) {
    this.inputType = inputType;
    this.unparsed |= !inputType.isValid();
    return this;
  }

  /**
   * The type of the source rule: <code>spl</code> for a Splunk SPL search or saved search
   * definition, <code>natural_language</code> for a plain-English description of the behavior to
   * detect, or <code>kql</code> for a Microsoft KQL query. SPL inputs must be self-contained, with
   * search macros expanded.
   *
   * @return inputType
   */
  @JsonProperty(JSON_PROPERTY_INPUT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityMonitoringBatchMigrationResourceInputType getInputType() {
    return inputType;
  }

  public void setInputType(SecurityMonitoringBatchMigrationResourceInputType inputType) {
    if (!inputType.isValid()) {
      this.unparsed = true;
    }
    this.inputType = inputType;
  }

  public SecurityMonitoringBatchMigrationResourceCreateItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the resource.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * @return SecurityMonitoringBatchMigrationResourceCreateItem
   */
  @JsonAnySetter
  public SecurityMonitoringBatchMigrationResourceCreateItem putAdditionalProperty(
      String key, Object value) {
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
   * Return true if this SecurityMonitoringBatchMigrationResourceCreateItem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringBatchMigrationResourceCreateItem
        securityMonitoringBatchMigrationResourceCreateItem =
            (SecurityMonitoringBatchMigrationResourceCreateItem) o;
    return Objects.equals(
            this.description, securityMonitoringBatchMigrationResourceCreateItem.description)
        && Objects.equals(this.input, securityMonitoringBatchMigrationResourceCreateItem.input)
        && Objects.equals(
            this.inputType, securityMonitoringBatchMigrationResourceCreateItem.inputType)
        && Objects.equals(this.name, securityMonitoringBatchMigrationResourceCreateItem.name)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringBatchMigrationResourceCreateItem.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, input, inputType, name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringBatchMigrationResourceCreateItem {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    inputType: ").append(toIndentedString(inputType)).append("\n");
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
