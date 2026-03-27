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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Mapping of billing dimensions to endpoint keys. */
@JsonPropertyOrder({
  BillingDimensionsMappingBodyItemAttributes.JSON_PROPERTY_ENDPOINTS,
  BillingDimensionsMappingBodyItemAttributes.JSON_PROPERTY_IN_APP_LABEL,
  BillingDimensionsMappingBodyItemAttributes.JSON_PROPERTY_TIMESTAMP
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class BillingDimensionsMappingBodyItemAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENDPOINTS = "endpoints";
  private List<BillingDimensionsMappingBodyItemAttributesEndpointsItems> endpoints = null;

  public static final String JSON_PROPERTY_IN_APP_LABEL = "in_app_label";
  private String inAppLabel;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private OffsetDateTime timestamp;

  public BillingDimensionsMappingBodyItemAttributes endpoints(
      List<BillingDimensionsMappingBodyItemAttributesEndpointsItems> endpoints) {
    this.endpoints = endpoints;
    for (BillingDimensionsMappingBodyItemAttributesEndpointsItems item : endpoints) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public BillingDimensionsMappingBodyItemAttributes addEndpointsItem(
      BillingDimensionsMappingBodyItemAttributesEndpointsItems endpointsItem) {
    if (this.endpoints == null) {
      this.endpoints = new ArrayList<>();
    }
    this.endpoints.add(endpointsItem);
    this.unparsed |= endpointsItem.unparsed;
    return this;
  }

  /**
   * List of supported endpoints with their keys mapped to the billing_dimension.
   *
   * @return endpoints
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENDPOINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<BillingDimensionsMappingBodyItemAttributesEndpointsItems> getEndpoints() {
    return endpoints;
  }

  public void setEndpoints(
      List<BillingDimensionsMappingBodyItemAttributesEndpointsItems> endpoints) {
    this.endpoints = endpoints;
  }

  public BillingDimensionsMappingBodyItemAttributes inAppLabel(String inAppLabel) {
    this.inAppLabel = inAppLabel;
    return this;
  }

  /**
   * Label used for the billing dimension in the Plan &amp; Usage charts.
   *
   * @return inAppLabel
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IN_APP_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getInAppLabel() {
    return inAppLabel;
  }

  public void setInAppLabel(String inAppLabel) {
    this.inAppLabel = inAppLabel;
  }

  public BillingDimensionsMappingBodyItemAttributes timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Month in ISO-8601 format, UTC, and precise to the second: <code>[YYYY-MM-DDThh:mm:ss]</code>.
   *
   * @return timestamp
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
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
   * @return BillingDimensionsMappingBodyItemAttributes
   */
  @JsonAnySetter
  public BillingDimensionsMappingBodyItemAttributes putAdditionalProperty(
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

  /** Return true if this BillingDimensionsMappingBodyItemAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingDimensionsMappingBodyItemAttributes billingDimensionsMappingBodyItemAttributes =
        (BillingDimensionsMappingBodyItemAttributes) o;
    return Objects.equals(this.endpoints, billingDimensionsMappingBodyItemAttributes.endpoints)
        && Objects.equals(this.inAppLabel, billingDimensionsMappingBodyItemAttributes.inAppLabel)
        && Objects.equals(this.timestamp, billingDimensionsMappingBodyItemAttributes.timestamp)
        && Objects.equals(
            this.additionalProperties,
            billingDimensionsMappingBodyItemAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpoints, inAppLabel, timestamp, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingDimensionsMappingBodyItemAttributes {\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
    sb.append("    inAppLabel: ").append(toIndentedString(inAppLabel)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
