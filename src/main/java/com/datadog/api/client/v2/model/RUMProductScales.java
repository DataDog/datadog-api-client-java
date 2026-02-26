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

/** Product Scales configuration for the RUM application. */
@JsonPropertyOrder({
  RUMProductScales.JSON_PROPERTY_PRODUCT_ANALYTICS_RETENTION_SCALE,
  RUMProductScales.JSON_PROPERTY_RUM_EVENT_PROCESSING_SCALE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RUMProductScales {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PRODUCT_ANALYTICS_RETENTION_SCALE =
      "product_analytics_retention_scale";
  private RUMProductAnalyticsRetentionScale productAnalyticsRetentionScale;

  public static final String JSON_PROPERTY_RUM_EVENT_PROCESSING_SCALE =
      "rum_event_processing_scale";
  private RUMEventProcessingScale rumEventProcessingScale;

  public RUMProductScales productAnalyticsRetentionScale(
      RUMProductAnalyticsRetentionScale productAnalyticsRetentionScale) {
    this.productAnalyticsRetentionScale = productAnalyticsRetentionScale;
    this.unparsed |= productAnalyticsRetentionScale.unparsed;
    return this;
  }

  /**
   * Product Analytics retention scale configuration.
   *
   * @return productAnalyticsRetentionScale
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCT_ANALYTICS_RETENTION_SCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RUMProductAnalyticsRetentionScale getProductAnalyticsRetentionScale() {
    return productAnalyticsRetentionScale;
  }

  public void setProductAnalyticsRetentionScale(
      RUMProductAnalyticsRetentionScale productAnalyticsRetentionScale) {
    this.productAnalyticsRetentionScale = productAnalyticsRetentionScale;
  }

  public RUMProductScales rumEventProcessingScale(RUMEventProcessingScale rumEventProcessingScale) {
    this.rumEventProcessingScale = rumEventProcessingScale;
    this.unparsed |= rumEventProcessingScale.unparsed;
    return this;
  }

  /**
   * RUM event processing scale configuration.
   *
   * @return rumEventProcessingScale
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_EVENT_PROCESSING_SCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RUMEventProcessingScale getRumEventProcessingScale() {
    return rumEventProcessingScale;
  }

  public void setRumEventProcessingScale(RUMEventProcessingScale rumEventProcessingScale) {
    this.rumEventProcessingScale = rumEventProcessingScale;
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
   * @return RUMProductScales
   */
  @JsonAnySetter
  public RUMProductScales putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RUMProductScales object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RUMProductScales rumProductScales = (RUMProductScales) o;
    return Objects.equals(
            this.productAnalyticsRetentionScale, rumProductScales.productAnalyticsRetentionScale)
        && Objects.equals(this.rumEventProcessingScale, rumProductScales.rumEventProcessingScale)
        && Objects.equals(this.additionalProperties, rumProductScales.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        productAnalyticsRetentionScale, rumEventProcessingScale, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RUMProductScales {\n");
    sb.append("    productAnalyticsRetentionScale: ")
        .append(toIndentedString(productAnalyticsRetentionScale))
        .append("\n");
    sb.append("    rumEventProcessingScale: ")
        .append(toIndentedString(rumEventProcessingScale))
        .append("\n");
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
