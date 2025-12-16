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
  FunnelRequestDataAttributesSearchStepsItems.JSON_PROPERTY_FACET,
  FunnelRequestDataAttributesSearchStepsItems.JSON_PROPERTY_STEP_FILTER,
  FunnelRequestDataAttributesSearchStepsItems.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FunnelRequestDataAttributesSearchStepsItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FACET = "facet";
  private String facet;

  public static final String JSON_PROPERTY_STEP_FILTER = "step_filter";
  private String stepFilter;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public FunnelRequestDataAttributesSearchStepsItems facet(String facet) {
    this.facet = facet;
    return this;
  }

  /**
   * Getfacet
   *
   * @return facet
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FACET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFacet() {
    return facet;
  }

  public void setFacet(String facet) {
    this.facet = facet;
  }

  public FunnelRequestDataAttributesSearchStepsItems stepFilter(String stepFilter) {
    this.stepFilter = stepFilter;
    return this;
  }

  /**
   * GetstepFilter
   *
   * @return stepFilter
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STEP_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStepFilter() {
    return stepFilter;
  }

  public void setStepFilter(String stepFilter) {
    this.stepFilter = stepFilter;
  }

  public FunnelRequestDataAttributesSearchStepsItems value(String value) {
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
   * @return FunnelRequestDataAttributesSearchStepsItems
   */
  @JsonAnySetter
  public FunnelRequestDataAttributesSearchStepsItems putAdditionalProperty(
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

  /** Return true if this FunnelRequestDataAttributesSearchStepsItems object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FunnelRequestDataAttributesSearchStepsItems funnelRequestDataAttributesSearchStepsItems =
        (FunnelRequestDataAttributesSearchStepsItems) o;
    return Objects.equals(this.facet, funnelRequestDataAttributesSearchStepsItems.facet)
        && Objects.equals(this.stepFilter, funnelRequestDataAttributesSearchStepsItems.stepFilter)
        && Objects.equals(this.value, funnelRequestDataAttributesSearchStepsItems.value)
        && Objects.equals(
            this.additionalProperties,
            funnelRequestDataAttributesSearchStepsItems.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(facet, stepFilter, value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FunnelRequestDataAttributesSearchStepsItems {\n");
    sb.append("    facet: ").append(toIndentedString(facet)).append("\n");
    sb.append("    stepFilter: ").append(toIndentedString(stepFilter)).append("\n");
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
