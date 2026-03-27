/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Metric origin information.</p>
 */
@JsonPropertyOrder({
  MetricOrigin.JSON_PROPERTY_METRIC_TYPE,
  MetricOrigin.JSON_PROPERTY_PRODUCT,
  MetricOrigin.JSON_PROPERTY_SERVICE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MetricOrigin {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_METRIC_TYPE = "metric_type";
  private Integer metricType = 0;

  public static final String JSON_PROPERTY_PRODUCT = "product";
  private Integer product = 0;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private Integer service = 0;

  public MetricOrigin metricType(Integer metricType) {
    this.metricType = metricType;
    return this;
  }

  /**
   * <p>The origin metric type code</p>
   * maximum: 1000
   * @return metricType
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_METRIC_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Integer getMetricType() {
        return metricType;
      }
  public void setMetricType(Integer metricType) {
    this.metricType = metricType;
  }
  public MetricOrigin product(Integer product) {
    this.product = product;
    return this;
  }

  /**
   * <p>The origin product code</p>
   * maximum: 1000
   * @return product
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PRODUCT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Integer getProduct() {
        return product;
      }
  public void setProduct(Integer product) {
    this.product = product;
  }
  public MetricOrigin service(Integer service) {
    this.service = service;
    return this;
  }

  /**
   * <p>The origin service code</p>
   * maximum: 1000
   * @return service
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SERVICE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Integer getService() {
        return service;
      }
  public void setService(Integer service) {
    this.service = service;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return MetricOrigin
   */
  @JsonAnySetter
  public MetricOrigin putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this MetricOrigin object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricOrigin metricOrigin = (MetricOrigin) o;
    return Objects.equals(this.metricType, metricOrigin.metricType) && Objects.equals(this.product, metricOrigin.product) && Objects.equals(this.service, metricOrigin.service) && Objects.equals(this.additionalProperties, metricOrigin.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(metricType,product,service, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricOrigin {\n");
    sb.append("    metricType: ").append(toIndentedString(metricType)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
