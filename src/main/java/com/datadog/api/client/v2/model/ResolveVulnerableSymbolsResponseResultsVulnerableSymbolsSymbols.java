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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** */
@JsonPropertyOrder({
  ResolveVulnerableSymbolsResponseResultsVulnerableSymbolsSymbols.JSON_PROPERTY_NAME,
  ResolveVulnerableSymbolsResponseResultsVulnerableSymbolsSymbols.JSON_PROPERTY_TYPE,
  ResolveVulnerableSymbolsResponseResultsVulnerableSymbolsSymbols.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ResolveVulnerableSymbolsResponseResultsVulnerableSymbolsSymbols {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public ResolveVulnerableSymbolsResponseResultsVulnerableSymbolsSymbols name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Getname
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

  public ResolveVulnerableSymbolsResponseResultsVulnerableSymbolsSymbols type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Gettype
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ResolveVulnerableSymbolsResponseResultsVulnerableSymbolsSymbols value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Getvalue
   *
   * @return value
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
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
   * @return ResolveVulnerableSymbolsResponseResultsVulnerableSymbolsSymbols
   */
  @JsonAnySetter
  public ResolveVulnerableSymbolsResponseResultsVulnerableSymbolsSymbols putAdditionalProperty(
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
   * Return true if this ResolveVulnerableSymbolsResponseResultsVulnerableSymbolsSymbols object is
   * equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResolveVulnerableSymbolsResponseResultsVulnerableSymbolsSymbols
        resolveVulnerableSymbolsResponseResultsVulnerableSymbolsSymbols =
            (ResolveVulnerableSymbolsResponseResultsVulnerableSymbolsSymbols) o;
    return Objects.equals(
            this.name, resolveVulnerableSymbolsResponseResultsVulnerableSymbolsSymbols.name)
        && Objects.equals(
            this.type, resolveVulnerableSymbolsResponseResultsVulnerableSymbolsSymbols.type)
        && Objects.equals(
            this.value, resolveVulnerableSymbolsResponseResultsVulnerableSymbolsSymbols.value)
        && Objects.equals(
            this.additionalProperties,
            resolveVulnerableSymbolsResponseResultsVulnerableSymbolsSymbols.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResolveVulnerableSymbolsResponseResultsVulnerableSymbolsSymbols {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
