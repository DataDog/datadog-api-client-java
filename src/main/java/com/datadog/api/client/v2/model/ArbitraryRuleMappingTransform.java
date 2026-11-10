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

/**
 * Only supported for <code>proportional_timeseries</code> and <code>even_timeseries</code> rules.
 * Creates a synthetic tag from timeseries input rows before <code>tag_transforms</code> are
 * applied.
 */
@JsonPropertyOrder({
  ArbitraryRuleMappingTransform.JSON_PROPERTY_MAPPING,
  ArbitraryRuleMappingTransform.JSON_PROPERTY_SYNTHETIC_TAG
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ArbitraryRuleMappingTransform {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MAPPING = "mapping";
  private Map<String, Object> mapping = new HashMap<String, Object>();

  public static final String JSON_PROPERTY_SYNTHETIC_TAG = "synthetic_tag";
  private String syntheticTag;

  public ArbitraryRuleMappingTransform() {}

  @JsonCreator
  public ArbitraryRuleMappingTransform(
      @JsonProperty(required = true, value = JSON_PROPERTY_MAPPING) Map<String, Object> mapping,
      @JsonProperty(required = true, value = JSON_PROPERTY_SYNTHETIC_TAG) String syntheticTag) {
    this.mapping = mapping;
    this.syntheticTag = syntheticTag;
  }

  public ArbitraryRuleMappingTransform mapping(Map<String, Object> mapping) {
    this.mapping = mapping;
    return this;
  }

  public ArbitraryRuleMappingTransform putMappingItem(String key, Object mappingItem) {
    this.mapping.put(key, mappingItem);
    return this;
  }

  /**
   * Recursive mapping node. Each <code>match_on_values</code> branch contains a value and a nested
   * node.
   *
   * @return mapping
   */
  @JsonProperty(JSON_PROPERTY_MAPPING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, Object> getMapping() {
    return mapping;
  }

  public void setMapping(Map<String, Object> mapping) {
    this.mapping = mapping;
  }

  public ArbitraryRuleMappingTransform syntheticTag(String syntheticTag) {
    this.syntheticTag = syntheticTag;
    return this;
  }

  /**
   * The name of the synthetic tag created by the mapping.
   *
   * @return syntheticTag
   */
  @JsonProperty(JSON_PROPERTY_SYNTHETIC_TAG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSyntheticTag() {
    return syntheticTag;
  }

  public void setSyntheticTag(String syntheticTag) {
    this.syntheticTag = syntheticTag;
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
   * @return ArbitraryRuleMappingTransform
   */
  @JsonAnySetter
  public ArbitraryRuleMappingTransform putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ArbitraryRuleMappingTransform object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArbitraryRuleMappingTransform arbitraryRuleMappingTransform = (ArbitraryRuleMappingTransform) o;
    return Objects.equals(this.mapping, arbitraryRuleMappingTransform.mapping)
        && Objects.equals(this.syntheticTag, arbitraryRuleMappingTransform.syntheticTag)
        && Objects.equals(
            this.additionalProperties, arbitraryRuleMappingTransform.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mapping, syntheticTag, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArbitraryRuleMappingTransform {\n");
    sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
    sb.append("    syntheticTag: ").append(toIndentedString(syntheticTag)).append("\n");
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
