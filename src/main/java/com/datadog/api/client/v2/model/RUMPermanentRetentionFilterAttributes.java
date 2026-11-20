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

/** The attributes of a permanent RUM retention filter. */
@JsonPropertyOrder({
  RUMPermanentRetentionFilterAttributes.JSON_PROPERTY_CROSS_PRODUCT_SAMPLING,
  RUMPermanentRetentionFilterAttributes.JSON_PROPERTY_DESCRIPTION,
  RUMPermanentRetentionFilterAttributes.JSON_PROPERTY_EDITABILITY,
  RUMPermanentRetentionFilterAttributes.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RUMPermanentRetentionFilterAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CROSS_PRODUCT_SAMPLING = "cross_product_sampling";
  private RUMCrossProductSampling crossProductSampling;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_EDITABILITY = "editability";
  private RUMPermanentRetentionFilterEditability editability;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public RUMPermanentRetentionFilterAttributes crossProductSampling(
      RUMCrossProductSampling crossProductSampling) {
    this.crossProductSampling = crossProductSampling;
    this.unparsed |= crossProductSampling.unparsed;
    return this;
  }

  /**
   * The configuration for cross-product retention filters.
   *
   * @return crossProductSampling
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CROSS_PRODUCT_SAMPLING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RUMCrossProductSampling getCrossProductSampling() {
    return crossProductSampling;
  }

  public void setCrossProductSampling(RUMCrossProductSampling crossProductSampling) {
    this.crossProductSampling = crossProductSampling;
    if (crossProductSampling != null) {
      this.unparsed |= crossProductSampling.unparsed;
    }
  }

  public RUMPermanentRetentionFilterAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of what the filter retains.
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

  public RUMPermanentRetentionFilterAttributes editability(
      RUMPermanentRetentionFilterEditability editability) {
    this.editability = editability;
    this.unparsed |= editability.unparsed;
    return this;
  }

  /**
   * Indicates which cross-product fields of a permanent RUM retention filter can be updated.
   *
   * @return editability
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EDITABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RUMPermanentRetentionFilterEditability getEditability() {
    return editability;
  }

  public void setEditability(RUMPermanentRetentionFilterEditability editability) {
    this.editability = editability;
    if (editability != null) {
      this.unparsed |= editability.unparsed;
    }
  }

  public RUMPermanentRetentionFilterAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The display name of the permanent retention filter.
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
   * @return RUMPermanentRetentionFilterAttributes
   */
  @JsonAnySetter
  public RUMPermanentRetentionFilterAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RUMPermanentRetentionFilterAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RUMPermanentRetentionFilterAttributes rumPermanentRetentionFilterAttributes =
        (RUMPermanentRetentionFilterAttributes) o;
    return Objects.equals(
            this.crossProductSampling, rumPermanentRetentionFilterAttributes.crossProductSampling)
        && Objects.equals(this.description, rumPermanentRetentionFilterAttributes.description)
        && Objects.equals(this.editability, rumPermanentRetentionFilterAttributes.editability)
        && Objects.equals(this.name, rumPermanentRetentionFilterAttributes.name)
        && Objects.equals(
            this.additionalProperties, rumPermanentRetentionFilterAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crossProductSampling, description, editability, name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RUMPermanentRetentionFilterAttributes {\n");
    sb.append("    crossProductSampling: ")
        .append(toIndentedString(crossProductSampling))
        .append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    editability: ").append(toIndentedString(editability)).append("\n");
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
