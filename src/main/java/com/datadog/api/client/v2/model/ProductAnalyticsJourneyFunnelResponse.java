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

/** Response for a journey funnel analysis. */
@JsonPropertyOrder({ProductAnalyticsJourneyFunnelResponse.JSON_PROPERTY_DATA})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsJourneyFunnelResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private ProductAnalyticsJourneyFunnelResponseData data;

  public ProductAnalyticsJourneyFunnelResponse() {}

  @JsonCreator
  public ProductAnalyticsJourneyFunnelResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA)
          ProductAnalyticsJourneyFunnelResponseData data) {
    this.data = data;
    this.unparsed |= data.unparsed;
  }

  public ProductAnalyticsJourneyFunnelResponse data(
      ProductAnalyticsJourneyFunnelResponseData data) {
    this.data = data;
    this.unparsed |= data.unparsed;
    return this;
  }

  /**
   * The single JSON:API resource holding a computed funnel. Its attributes contain the number of
   * entities that entered, the end-to-end conversion, and one entry per funnel step.
   *
   * @return data
   */
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsJourneyFunnelResponseData getData() {
    return data;
  }

  public void setData(ProductAnalyticsJourneyFunnelResponseData data) {
    this.data = data;
    if (data != null) {
      this.unparsed |= data.unparsed;
    }
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
   * @return ProductAnalyticsJourneyFunnelResponse
   */
  @JsonAnySetter
  public ProductAnalyticsJourneyFunnelResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductAnalyticsJourneyFunnelResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsJourneyFunnelResponse productAnalyticsJourneyFunnelResponse =
        (ProductAnalyticsJourneyFunnelResponse) o;
    return Objects.equals(this.data, productAnalyticsJourneyFunnelResponse.data)
        && Objects.equals(
            this.additionalProperties, productAnalyticsJourneyFunnelResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsJourneyFunnelResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
