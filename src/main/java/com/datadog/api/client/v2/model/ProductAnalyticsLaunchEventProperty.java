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

/** A reference from an event to a property of the tracking plan. */
@JsonPropertyOrder({
  ProductAnalyticsLaunchEventProperty.JSON_PROPERTY_ID,
  ProductAnalyticsLaunchEventProperty.JSON_PROPERTY_REQUIRED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsLaunchEventProperty {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_REQUIRED = "required";
  private Boolean required;

  public ProductAnalyticsLaunchEventProperty() {}

  @JsonCreator
  public ProductAnalyticsLaunchEventProperty(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id) {
    this.id = id;
  }

  public ProductAnalyticsLaunchEventProperty id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of a property in the tracking plan <code>properties</code>.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProductAnalyticsLaunchEventProperty required(Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * Whether the event must always include the property.
   *
   * @return required
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
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
   * @return ProductAnalyticsLaunchEventProperty
   */
  @JsonAnySetter
  public ProductAnalyticsLaunchEventProperty putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductAnalyticsLaunchEventProperty object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsLaunchEventProperty productAnalyticsLaunchEventProperty =
        (ProductAnalyticsLaunchEventProperty) o;
    return Objects.equals(this.id, productAnalyticsLaunchEventProperty.id)
        && Objects.equals(this.required, productAnalyticsLaunchEventProperty.required)
        && Objects.equals(
            this.additionalProperties, productAnalyticsLaunchEventProperty.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, required, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsLaunchEventProperty {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
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
