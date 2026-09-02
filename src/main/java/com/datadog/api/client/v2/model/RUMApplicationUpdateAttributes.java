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

/** RUM application update attributes. */
@JsonPropertyOrder({
  RUMApplicationUpdateAttributes.JSON_PROPERTY_NAME,
  RUMApplicationUpdateAttributes.JSON_PROPERTY_PRODUCT_ANALYTICS_RETENTION_STATE,
  RUMApplicationUpdateAttributes.JSON_PROPERTY_RUM_EVENT_PROCESSING_STATE,
  RUMApplicationUpdateAttributes.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RUMApplicationUpdateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PRODUCT_ANALYTICS_RETENTION_STATE =
      "product_analytics_retention_state";
  private RUMProductAnalyticsRetentionState productAnalyticsRetentionState;

  public static final String JSON_PROPERTY_RUM_EVENT_PROCESSING_STATE =
      "rum_event_processing_state";
  private RUMEventProcessingState rumEventProcessingState;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public RUMApplicationUpdateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the RUM application.
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

  public RUMApplicationUpdateAttributes productAnalyticsRetentionState(
      RUMProductAnalyticsRetentionState productAnalyticsRetentionState) {
    this.productAnalyticsRetentionState = productAnalyticsRetentionState;
    this.unparsed |= !productAnalyticsRetentionState.isValid();
    return this;
  }

  /**
   * Controls the retention policy for Product Analytics data derived from RUM events.
   *
   * @return productAnalyticsRetentionState
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCT_ANALYTICS_RETENTION_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RUMProductAnalyticsRetentionState getProductAnalyticsRetentionState() {
    return productAnalyticsRetentionState;
  }

  public void setProductAnalyticsRetentionState(
      RUMProductAnalyticsRetentionState productAnalyticsRetentionState) {
    if (!productAnalyticsRetentionState.isValid()) {
      this.unparsed = true;
    }
    this.productAnalyticsRetentionState = productAnalyticsRetentionState;
  }

  public RUMApplicationUpdateAttributes rumEventProcessingState(
      RUMEventProcessingState rumEventProcessingState) {
    this.rumEventProcessingState = rumEventProcessingState;
    this.unparsed |= !rumEventProcessingState.isValid();
    return this;
  }

  /**
   * Configures which RUM events are processed and stored for the application.
   *
   * @return rumEventProcessingState
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_EVENT_PROCESSING_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RUMEventProcessingState getRumEventProcessingState() {
    return rumEventProcessingState;
  }

  public void setRumEventProcessingState(RUMEventProcessingState rumEventProcessingState) {
    if (!rumEventProcessingState.isValid()) {
      this.unparsed = true;
    }
    this.rumEventProcessingState = rumEventProcessingState;
  }

  public RUMApplicationUpdateAttributes type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the RUM application. Supported values are <code>browser</code>, <code>ios</code>,
   * <code>android</code>, <code>react-native</code>, <code>flutter</code>, <code>roku</code>,
   * <code>electron</code>, <code>unity</code>, <code>kotlin-multiplatform</code>.
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
   * @return RUMApplicationUpdateAttributes
   */
  @JsonAnySetter
  public RUMApplicationUpdateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RUMApplicationUpdateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RUMApplicationUpdateAttributes rumApplicationUpdateAttributes =
        (RUMApplicationUpdateAttributes) o;
    return Objects.equals(this.name, rumApplicationUpdateAttributes.name)
        && Objects.equals(
            this.productAnalyticsRetentionState,
            rumApplicationUpdateAttributes.productAnalyticsRetentionState)
        && Objects.equals(
            this.rumEventProcessingState, rumApplicationUpdateAttributes.rumEventProcessingState)
        && Objects.equals(this.type, rumApplicationUpdateAttributes.type)
        && Objects.equals(
            this.additionalProperties, rumApplicationUpdateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        name, productAnalyticsRetentionState, rumEventProcessingState, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RUMApplicationUpdateAttributes {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    productAnalyticsRetentionState: ")
        .append(toIndentedString(productAnalyticsRetentionState))
        .append("\n");
    sb.append("    rumEventProcessingState: ")
        .append(toIndentedString(rumEventProcessingState))
        .append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
