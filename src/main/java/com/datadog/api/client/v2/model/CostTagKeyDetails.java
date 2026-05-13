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

/**
 * Additional details for a Cloud Cost Management tag key, including its description and example tag
 * values.
 */
@JsonPropertyOrder({
  CostTagKeyDetails.JSON_PROPERTY_DESCRIPTION,
  CostTagKeyDetails.JSON_PROPERTY_TAG_VALUES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CostTagKeyDetails {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_TAG_VALUES = "tag_values";
  private List<String> tagValues = new ArrayList<>();

  public CostTagKeyDetails() {}

  @JsonCreator
  public CostTagKeyDetails(
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAG_VALUES) List<String> tagValues) {
    this.description = description;
    this.tagValues = tagValues;
  }

  public CostTagKeyDetails description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the tag key.
   *
   * @return description
   */
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CostTagKeyDetails tagValues(List<String> tagValues) {
    this.tagValues = tagValues;
    return this;
  }

  public CostTagKeyDetails addTagValuesItem(String tagValuesItem) {
    this.tagValues.add(tagValuesItem);
    return this;
  }

  /**
   * Example tag values observed for this tag key.
   *
   * @return tagValues
   */
  @JsonProperty(JSON_PROPERTY_TAG_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getTagValues() {
    return tagValues;
  }

  public void setTagValues(List<String> tagValues) {
    this.tagValues = tagValues;
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
   * @return CostTagKeyDetails
   */
  @JsonAnySetter
  public CostTagKeyDetails putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CostTagKeyDetails object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CostTagKeyDetails costTagKeyDetails = (CostTagKeyDetails) o;
    return Objects.equals(this.description, costTagKeyDetails.description)
        && Objects.equals(this.tagValues, costTagKeyDetails.tagValues)
        && Objects.equals(this.additionalProperties, costTagKeyDetails.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, tagValues, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostTagKeyDetails {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tagValues: ").append(toIndentedString(tagValues)).append("\n");
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
