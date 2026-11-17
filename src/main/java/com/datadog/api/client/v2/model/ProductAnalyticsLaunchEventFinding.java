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

/** Code analysis result for an event of the tracking plan. */
@JsonPropertyOrder({
  ProductAnalyticsLaunchEventFinding.JSON_PROPERTY_NAME,
  ProductAnalyticsLaunchEventFinding.JSON_PROPERTY_PROPERTIES,
  ProductAnalyticsLaunchEventFinding.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsLaunchEventFinding {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private List<ProductAnalyticsLaunchPropertyFinding> properties = null;

  public static final String JSON_PROPERTY_STATUS = "status";
  private ProductAnalyticsLaunchCodeStatus status;

  public ProductAnalyticsLaunchEventFinding() {}

  @JsonCreator
  public ProductAnalyticsLaunchEventFinding(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS)
          ProductAnalyticsLaunchCodeStatus status) {
    this.name = name;
    this.status = status;
    this.unparsed |= !status.isValid();
  }

  public ProductAnalyticsLaunchEventFinding name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the event in the tracking plan.
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

  public ProductAnalyticsLaunchEventFinding properties(
      List<ProductAnalyticsLaunchPropertyFinding> properties) {
    this.properties = properties;
    if (properties != null) {
      for (ProductAnalyticsLaunchPropertyFinding item : properties) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ProductAnalyticsLaunchEventFinding addPropertiesItem(
      ProductAnalyticsLaunchPropertyFinding propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<>();
    }
    this.properties.add(propertiesItem);
    this.unparsed |= propertiesItem.unparsed;
    return this;
  }

  /**
   * Results for the properties of the event. Only allowed when the event is <code>found</code>.
   *
   * @return properties
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ProductAnalyticsLaunchPropertyFinding> getProperties() {
    return properties;
  }

  public void setProperties(List<ProductAnalyticsLaunchPropertyFinding> properties) {
    this.properties = properties;
    if (properties != null) {
      for (ProductAnalyticsLaunchPropertyFinding item : properties) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ProductAnalyticsLaunchEventFinding status(ProductAnalyticsLaunchCodeStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * Whether the inspected code sends the event, or attaches the property to the event.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsLaunchCodeStatus getStatus() {
    return status;
  }

  public void setStatus(ProductAnalyticsLaunchCodeStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
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
   * @return ProductAnalyticsLaunchEventFinding
   */
  @JsonAnySetter
  public ProductAnalyticsLaunchEventFinding putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductAnalyticsLaunchEventFinding object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsLaunchEventFinding productAnalyticsLaunchEventFinding =
        (ProductAnalyticsLaunchEventFinding) o;
    return Objects.equals(this.name, productAnalyticsLaunchEventFinding.name)
        && Objects.equals(this.properties, productAnalyticsLaunchEventFinding.properties)
        && Objects.equals(this.status, productAnalyticsLaunchEventFinding.status)
        && Objects.equals(
            this.additionalProperties, productAnalyticsLaunchEventFinding.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, properties, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsLaunchEventFinding {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
