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

/** A configuration file specification for an integration. */
@JsonPropertyOrder({
  FleetIntegrationSchemaFileSpecV2.JSON_PROPERTY_EXAMPLE_NAME,
  FleetIntegrationSchemaFileSpecV2.JSON_PROPERTY_NAME,
  FleetIntegrationSchemaFileSpecV2.JSON_PROPERTY_OPTIONS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetIntegrationSchemaFileSpecV2 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EXAMPLE_NAME = "example_name";
  private String exampleName;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private List<FleetIntegrationSchemaSpecOptionV2> options = new ArrayList<>();

  public FleetIntegrationSchemaFileSpecV2() {}

  @JsonCreator
  public FleetIntegrationSchemaFileSpecV2(
      @JsonProperty(required = true, value = JSON_PROPERTY_EXAMPLE_NAME) String exampleName,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_OPTIONS)
          List<FleetIntegrationSchemaSpecOptionV2> options) {
    this.exampleName = exampleName;
    this.name = name;
    this.options = options;
    for (FleetIntegrationSchemaSpecOptionV2 item : options) {
      this.unparsed |= item.unparsed;
    }
  }

  public FleetIntegrationSchemaFileSpecV2 exampleName(String exampleName) {
    this.exampleName = exampleName;
    return this;
  }

  /**
   * The name of the example configuration file.
   *
   * @return exampleName
   */
  @JsonProperty(JSON_PROPERTY_EXAMPLE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getExampleName() {
    return exampleName;
  }

  public void setExampleName(String exampleName) {
    this.exampleName = exampleName;
  }

  public FleetIntegrationSchemaFileSpecV2 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the configuration file.
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

  public FleetIntegrationSchemaFileSpecV2 options(
      List<FleetIntegrationSchemaSpecOptionV2> options) {
    this.options = options;
    for (FleetIntegrationSchemaSpecOptionV2 item : options) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public FleetIntegrationSchemaFileSpecV2 addOptionsItem(
      FleetIntegrationSchemaSpecOptionV2 optionsItem) {
    this.options.add(optionsItem);
    this.unparsed |= optionsItem.unparsed;
    return this;
  }

  /**
   * The configuration options declared in the file.
   *
   * @return options
   */
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<FleetIntegrationSchemaSpecOptionV2> getOptions() {
    return options;
  }

  public void setOptions(List<FleetIntegrationSchemaSpecOptionV2> options) {
    this.options = options;
    if (options != null) {
      for (FleetIntegrationSchemaSpecOptionV2 item : options) {
        this.unparsed |= item.unparsed;
      }
    }
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
   * @return FleetIntegrationSchemaFileSpecV2
   */
  @JsonAnySetter
  public FleetIntegrationSchemaFileSpecV2 putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FleetIntegrationSchemaFileSpecV2 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetIntegrationSchemaFileSpecV2 fleetIntegrationSchemaFileSpecV2 =
        (FleetIntegrationSchemaFileSpecV2) o;
    return Objects.equals(this.exampleName, fleetIntegrationSchemaFileSpecV2.exampleName)
        && Objects.equals(this.name, fleetIntegrationSchemaFileSpecV2.name)
        && Objects.equals(this.options, fleetIntegrationSchemaFileSpecV2.options)
        && Objects.equals(
            this.additionalProperties, fleetIntegrationSchemaFileSpecV2.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exampleName, name, options, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetIntegrationSchemaFileSpecV2 {\n");
    sb.append("    exampleName: ").append(toIndentedString(exampleName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
