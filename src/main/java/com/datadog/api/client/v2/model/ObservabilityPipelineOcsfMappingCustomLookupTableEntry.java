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

/** A single entry in a lookup table for value transformation. */
@JsonPropertyOrder({
  ObservabilityPipelineOcsfMappingCustomLookupTableEntry.JSON_PROPERTY_CONTAINS,
  ObservabilityPipelineOcsfMappingCustomLookupTableEntry.JSON_PROPERTY_EQUALS,
  ObservabilityPipelineOcsfMappingCustomLookupTableEntry.JSON_PROPERTY_EQUALS_SOURCE,
  ObservabilityPipelineOcsfMappingCustomLookupTableEntry.JSON_PROPERTY_MATCHES,
  ObservabilityPipelineOcsfMappingCustomLookupTableEntry.JSON_PROPERTY_NOT_MATCHES,
  ObservabilityPipelineOcsfMappingCustomLookupTableEntry.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineOcsfMappingCustomLookupTableEntry {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONTAINS = "contains";
  private String contains;

  public static final String JSON_PROPERTY_EQUALS = "equals";
  private Object _equals = null;

  public static final String JSON_PROPERTY_EQUALS_SOURCE = "equals_source";
  private String equalsSource;

  public static final String JSON_PROPERTY_MATCHES = "matches";
  private String matches;

  public static final String JSON_PROPERTY_NOT_MATCHES = "not_matches";
  private String notMatches;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Object value = null;

  public ObservabilityPipelineOcsfMappingCustomLookupTableEntry contains(String contains) {
    this.contains = contains;
    return this;
  }

  /**
   * The substring to match in the source value.
   *
   * @return contains
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getContains() {
    return contains;
  }

  public void setContains(String contains) {
    this.contains = contains;
  }

  public ObservabilityPipelineOcsfMappingCustomLookupTableEntry _equals(Object _equals) {
    this._equals = _equals;
    return this;
  }

  /**
   * The exact value to match in the source.
   *
   * @return _equals
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EQUALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getEquals() {
    return _equals;
  }

  public void setEquals(Object _equals) {
    this._equals = _equals;
  }

  public ObservabilityPipelineOcsfMappingCustomLookupTableEntry equalsSource(String equalsSource) {
    this.equalsSource = equalsSource;
    return this;
  }

  /**
   * The source field to match against.
   *
   * @return equalsSource
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EQUALS_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEqualsSource() {
    return equalsSource;
  }

  public void setEqualsSource(String equalsSource) {
    this.equalsSource = equalsSource;
  }

  public ObservabilityPipelineOcsfMappingCustomLookupTableEntry matches(String matches) {
    this.matches = matches;
    return this;
  }

  /**
   * A regex pattern to match in the source value.
   *
   * @return matches
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MATCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMatches() {
    return matches;
  }

  public void setMatches(String matches) {
    this.matches = matches;
  }

  public ObservabilityPipelineOcsfMappingCustomLookupTableEntry notMatches(String notMatches) {
    this.notMatches = notMatches;
    return this;
  }

  /**
   * A regex pattern that must not match the source value.
   *
   * @return notMatches
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOT_MATCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNotMatches() {
    return notMatches;
  }

  public void setNotMatches(String notMatches) {
    this.notMatches = notMatches;
  }

  public ObservabilityPipelineOcsfMappingCustomLookupTableEntry value(Object value) {
    this.value = value;
    return this;
  }

  /**
   * The value to use when a match is found.
   *
   * @return value
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
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
   * @return ObservabilityPipelineOcsfMappingCustomLookupTableEntry
   */
  @JsonAnySetter
  public ObservabilityPipelineOcsfMappingCustomLookupTableEntry putAdditionalProperty(
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
   * Return true if this ObservabilityPipelineOcsfMappingCustomLookupTableEntry object is equal to
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
    ObservabilityPipelineOcsfMappingCustomLookupTableEntry
        observabilityPipelineOcsfMappingCustomLookupTableEntry =
            (ObservabilityPipelineOcsfMappingCustomLookupTableEntry) o;
    return Objects.equals(
            this.contains, observabilityPipelineOcsfMappingCustomLookupTableEntry.contains)
        && Objects.equals(
            this._equals, observabilityPipelineOcsfMappingCustomLookupTableEntry._equals)
        && Objects.equals(
            this.equalsSource, observabilityPipelineOcsfMappingCustomLookupTableEntry.equalsSource)
        && Objects.equals(
            this.matches, observabilityPipelineOcsfMappingCustomLookupTableEntry.matches)
        && Objects.equals(
            this.notMatches, observabilityPipelineOcsfMappingCustomLookupTableEntry.notMatches)
        && Objects.equals(this.value, observabilityPipelineOcsfMappingCustomLookupTableEntry.value)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineOcsfMappingCustomLookupTableEntry.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        contains, _equals, equalsSource, matches, notMatches, value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineOcsfMappingCustomLookupTableEntry {\n");
    sb.append("    contains: ").append(toIndentedString(contains)).append("\n");
    sb.append("    _equals: ").append(toIndentedString(_equals)).append("\n");
    sb.append("    equalsSource: ").append(toIndentedString(equalsSource)).append("\n");
    sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
    sb.append("    notMatches: ").append(toIndentedString(notMatches)).append("\n");
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
