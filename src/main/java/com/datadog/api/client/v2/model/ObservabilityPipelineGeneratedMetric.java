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
   * <p>Defines a log-based custom metric, including its name, type, filter, value computation strategy,
   * and optional grouping fields.</p>
 */
@JsonPropertyOrder({
  ObservabilityPipelineGeneratedMetric.JSON_PROPERTY_GROUP_BY,
  ObservabilityPipelineGeneratedMetric.JSON_PROPERTY_INCLUDE,
  ObservabilityPipelineGeneratedMetric.JSON_PROPERTY_METRIC_TYPE,
  ObservabilityPipelineGeneratedMetric.JSON_PROPERTY_NAME,
  ObservabilityPipelineGeneratedMetric.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineGeneratedMetric {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<String> groupBy = null;

  public static final String JSON_PROPERTY_INCLUDE = "include";
  private String include;

  public static final String JSON_PROPERTY_METRIC_TYPE = "metric_type";
  private ObservabilityPipelineGeneratedMetricMetricType metricType;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_VALUE = "value";
  private ObservabilityPipelineMetricValue value;

  public ObservabilityPipelineGeneratedMetric() {}

  @JsonCreator
  public ObservabilityPipelineGeneratedMetric(
            @JsonProperty(required=true, value=JSON_PROPERTY_INCLUDE)String include,
            @JsonProperty(required=true, value=JSON_PROPERTY_METRIC_TYPE)ObservabilityPipelineGeneratedMetricMetricType metricType,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_VALUE)ObservabilityPipelineMetricValue value) {
        this.include = include;
        this.metricType = metricType;
        this.unparsed |= !metricType.isValid();
        this.name = name;
        this.value = value;
        this.unparsed |= value.unparsed;
  }
  public ObservabilityPipelineGeneratedMetric groupBy(List<String> groupBy) {
    this.groupBy = groupBy;
    return this;
  }
  public ObservabilityPipelineGeneratedMetric addGroupByItem(String groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    return this;
  }

  /**
   * <p>Optional fields used to group the metric series.</p>
   * @return groupBy
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_GROUP_BY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getGroupBy() {
        return groupBy;
      }
  public void setGroupBy(List<String> groupBy) {
    this.groupBy = groupBy;
  }
  public ObservabilityPipelineGeneratedMetric include(String include) {
    this.include = include;
    return this;
  }

  /**
   * <p>Datadog filter query to match logs for metric generation.</p>
   * @return include
  **/
      @JsonProperty(JSON_PROPERTY_INCLUDE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getInclude() {
        return include;
      }
  public void setInclude(String include) {
    this.include = include;
  }
  public ObservabilityPipelineGeneratedMetric metricType(ObservabilityPipelineGeneratedMetricMetricType metricType) {
    this.metricType = metricType;
    this.unparsed |= !metricType.isValid();
    return this;
  }

  /**
   * <p>Type of metric to create.</p>
   * @return metricType
  **/
      @JsonProperty(JSON_PROPERTY_METRIC_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ObservabilityPipelineGeneratedMetricMetricType getMetricType() {
        return metricType;
      }
  public void setMetricType(ObservabilityPipelineGeneratedMetricMetricType metricType) {
    if (!metricType.isValid()) {
        this.unparsed = true;
    }
    this.metricType = metricType;
  }
  public ObservabilityPipelineGeneratedMetric name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name of the custom metric to be created.</p>
   * @return name
  **/
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public ObservabilityPipelineGeneratedMetric value(ObservabilityPipelineMetricValue value) {
    this.value = value;
    this.unparsed |= value.unparsed;
    return this;
  }

  /**
   * <p>Specifies how the value of the generated metric is computed.</p>
   * @return value
  **/
      @JsonProperty(JSON_PROPERTY_VALUE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ObservabilityPipelineMetricValue getValue() {
        return value;
      }
  public void setValue(ObservabilityPipelineMetricValue value) {
    this.value = value;
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
   * @return ObservabilityPipelineGeneratedMetric
   */
  @JsonAnySetter
  public ObservabilityPipelineGeneratedMetric putAdditionalProperty(String key, Object value) {
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
   * Return true if this ObservabilityPipelineGeneratedMetric object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineGeneratedMetric observabilityPipelineGeneratedMetric = (ObservabilityPipelineGeneratedMetric) o;
    return Objects.equals(this.groupBy, observabilityPipelineGeneratedMetric.groupBy) && Objects.equals(this.include, observabilityPipelineGeneratedMetric.include) && Objects.equals(this.metricType, observabilityPipelineGeneratedMetric.metricType) && Objects.equals(this.name, observabilityPipelineGeneratedMetric.name) && Objects.equals(this.value, observabilityPipelineGeneratedMetric.value) && Objects.equals(this.additionalProperties, observabilityPipelineGeneratedMetric.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(groupBy,include,metricType,name,value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineGeneratedMetric {\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    metricType: ").append(toIndentedString(metricType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
