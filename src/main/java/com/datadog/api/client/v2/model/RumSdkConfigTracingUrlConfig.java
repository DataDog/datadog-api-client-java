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

/** Configuration for a URL that should have distributed tracing enabled. */
@JsonPropertyOrder({
  RumSdkConfigTracingUrlConfig.JSON_PROPERTY_MATCH,
  RumSdkConfigTracingUrlConfig.JSON_PROPERTY_PROPAGATOR_TYPES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumSdkConfigTracingUrlConfig {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MATCH = "match";
  private RumSdkConfigMatchOption match;

  public static final String JSON_PROPERTY_PROPAGATOR_TYPES = "propagator_types";
  private List<RumSdkConfigTracingUrlPropagatorType> propagatorTypes = new ArrayList<>();

  public RumSdkConfigTracingUrlConfig() {}

  @JsonCreator
  public RumSdkConfigTracingUrlConfig(
      @JsonProperty(required = true, value = JSON_PROPERTY_MATCH) RumSdkConfigMatchOption match,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROPAGATOR_TYPES)
          List<RumSdkConfigTracingUrlPropagatorType> propagatorTypes) {
    this.match = match;
    this.unparsed |= match.unparsed;
    this.propagatorTypes = propagatorTypes;
  }

  public RumSdkConfigTracingUrlConfig match(RumSdkConfigMatchOption match) {
    this.match = match;
    this.unparsed |= match.unparsed;
    return this;
  }

  /**
   * A match option used for URL or origin pattern matching.
   *
   * @return match
   */
  @JsonProperty(JSON_PROPERTY_MATCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RumSdkConfigMatchOption getMatch() {
    return match;
  }

  public void setMatch(RumSdkConfigMatchOption match) {
    this.match = match;
    if (match != null) {
      this.unparsed |= match.unparsed;
    }
  }

  public RumSdkConfigTracingUrlConfig propagatorTypes(
      List<RumSdkConfigTracingUrlPropagatorType> propagatorTypes) {
    this.propagatorTypes = propagatorTypes;
    return this;
  }

  public RumSdkConfigTracingUrlConfig addPropagatorTypesItem(
      RumSdkConfigTracingUrlPropagatorType propagatorTypesItem) {
    this.propagatorTypes.add(propagatorTypesItem);
    this.unparsed |= !propagatorTypesItem.isValid();
    return this;
  }

  /**
   * The list of trace propagator types to use for this URL.
   *
   * @return propagatorTypes
   */
  @JsonProperty(JSON_PROPERTY_PROPAGATOR_TYPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<RumSdkConfigTracingUrlPropagatorType> getPropagatorTypes() {
    return propagatorTypes;
  }

  public void setPropagatorTypes(List<RumSdkConfigTracingUrlPropagatorType> propagatorTypes) {
    this.propagatorTypes = propagatorTypes;
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
   * @return RumSdkConfigTracingUrlConfig
   */
  @JsonAnySetter
  public RumSdkConfigTracingUrlConfig putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RumSdkConfigTracingUrlConfig object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RumSdkConfigTracingUrlConfig rumSdkConfigTracingUrlConfig = (RumSdkConfigTracingUrlConfig) o;
    return Objects.equals(this.match, rumSdkConfigTracingUrlConfig.match)
        && Objects.equals(this.propagatorTypes, rumSdkConfigTracingUrlConfig.propagatorTypes)
        && Objects.equals(
            this.additionalProperties, rumSdkConfigTracingUrlConfig.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(match, propagatorTypes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RumSdkConfigTracingUrlConfig {\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    propagatorTypes: ").append(toIndentedString(propagatorTypes)).append("\n");
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
