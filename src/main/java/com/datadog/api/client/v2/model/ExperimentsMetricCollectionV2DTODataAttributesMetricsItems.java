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

/** A metric included in the collection. */
@JsonPropertyOrder({
  ExperimentsMetricCollectionV2DTODataAttributesMetricsItems.JSON_PROPERTY_METRIC_ID,
  ExperimentsMetricCollectionV2DTODataAttributesMetricsItems.JSON_PROPERTY_METRIC_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsMetricCollectionV2DTODataAttributesMetricsItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_METRIC_ID = "metric_id";
  private String metricId;

  public static final String JSON_PROPERTY_METRIC_NAME = "metric_name";
  private String metricName;

  public ExperimentsMetricCollectionV2DTODataAttributesMetricsItems metricId(String metricId) {
    this.metricId = metricId;
    return this;
  }

  /**
   * ID of the metric represented by this entry.
   *
   * @return metricId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMetricId() {
    return metricId;
  }

  public void setMetricId(String metricId) {
    this.metricId = metricId;
  }

  public ExperimentsMetricCollectionV2DTODataAttributesMetricsItems metricName(String metricName) {
    this.metricName = metricName;
    return this;
  }

  /**
   * Display name of the metric represented by this entry.
   *
   * @return metricName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMetricName() {
    return metricName;
  }

  public void setMetricName(String metricName) {
    this.metricName = metricName;
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
   * @return ExperimentsMetricCollectionV2DTODataAttributesMetricsItems
   */
  @JsonAnySetter
  public ExperimentsMetricCollectionV2DTODataAttributesMetricsItems putAdditionalProperty(
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

  /**
   * Return true if this ExperimentsMetricCollectionV2DTODataAttributesMetricsItems object is equal
   * to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsMetricCollectionV2DTODataAttributesMetricsItems
        experimentsMetricCollectionV2DtoDataAttributesMetricsItems =
            (ExperimentsMetricCollectionV2DTODataAttributesMetricsItems) o;
    return Objects.equals(
            this.metricId, experimentsMetricCollectionV2DtoDataAttributesMetricsItems.metricId)
        && Objects.equals(
            this.metricName, experimentsMetricCollectionV2DtoDataAttributesMetricsItems.metricName)
        && Objects.equals(
            this.additionalProperties,
            experimentsMetricCollectionV2DtoDataAttributesMetricsItems.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metricId, metricName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsMetricCollectionV2DTODataAttributesMetricsItems {\n");
    sb.append("    metricId: ").append(toIndentedString(metricId)).append("\n");
    sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
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
