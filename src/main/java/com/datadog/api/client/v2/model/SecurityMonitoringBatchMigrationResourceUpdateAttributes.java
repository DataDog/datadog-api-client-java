/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Attributes of the batch migration resource to update. At least one attribute is required. */
@JsonPropertyOrder({
  SecurityMonitoringBatchMigrationResourceUpdateAttributes.JSON_PROPERTY_DESCRIPTION,
  SecurityMonitoringBatchMigrationResourceUpdateAttributes.JSON_PROPERTY_INPUT,
  SecurityMonitoringBatchMigrationResourceUpdateAttributes.JSON_PROPERTY_INPUT_TYPE,
  SecurityMonitoringBatchMigrationResourceUpdateAttributes.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringBatchMigrationResourceUpdateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_INPUT = "input";
  private String input;

  public static final String JSON_PROPERTY_INPUT_TYPE = "inputType";
  private SecurityMonitoringBatchMigrationResourceInputType inputType;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public SecurityMonitoringBatchMigrationResourceUpdateAttributes description(String description) {
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

  public SecurityMonitoringBatchMigrationResourceUpdateAttributes input(String input) {
    this.input = input;
    return this;
  }

  /**
   * The source query or natural language description to translate. Must not be blank.
   *
   * @return input
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getInput() {
    return input;
  }

  public void setInput(String input) {
    this.input = input;
  }

  public SecurityMonitoringBatchMigrationResourceUpdateAttributes inputType(
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INPUT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringBatchMigrationResourceInputType getInputType() {
    return inputType;
  }

  public void setInputType(SecurityMonitoringBatchMigrationResourceInputType inputType) {
    if (!inputType.isValid()) {
      this.unparsed = true;
    }
    this.inputType = inputType;
  }

  public SecurityMonitoringBatchMigrationResourceUpdateAttributes name(String name) {
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
   * Return true if this SecurityMonitoringBatchMigrationResourceUpdateAttributes object is equal to
   * o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringBatchMigrationResourceUpdateAttributes
        securityMonitoringBatchMigrationResourceUpdateAttributes =
            (SecurityMonitoringBatchMigrationResourceUpdateAttributes) o;
    return Objects.equals(
            this.description, securityMonitoringBatchMigrationResourceUpdateAttributes.description)
        && Objects.equals(
            this.input, securityMonitoringBatchMigrationResourceUpdateAttributes.input)
        && Objects.equals(
            this.inputType, securityMonitoringBatchMigrationResourceUpdateAttributes.inputType)
        && Objects.equals(this.name, securityMonitoringBatchMigrationResourceUpdateAttributes.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, input, inputType, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringBatchMigrationResourceUpdateAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    inputType: ").append(toIndentedString(inputType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
