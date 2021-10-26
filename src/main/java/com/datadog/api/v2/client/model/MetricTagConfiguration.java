/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v2.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.datadog.api.v2.client.model.MetricTagConfigurationAttributes;
import com.datadog.api.v2.client.model.MetricTagConfigurationType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.datadog.api.v2.client.JSON;


/**
 * Object for a single metric tag configuration.
 */
@ApiModel(description = "Object for a single metric tag configuration.")
@JsonPropertyOrder({
  MetricTagConfiguration.JSON_PROPERTY_ATTRIBUTES,
  MetricTagConfiguration.JSON_PROPERTY_ID,
  MetricTagConfiguration.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class MetricTagConfiguration {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private MetricTagConfigurationAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private MetricTagConfigurationType type = MetricTagConfigurationType.MANAGE_TAGS;


  public MetricTagConfiguration attributes(MetricTagConfigurationAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MetricTagConfigurationAttributes getAttributes() {
    return attributes;
  }


  public void setAttributes(MetricTagConfigurationAttributes attributes) {
    this.attributes = attributes;
  }


  public MetricTagConfiguration id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The metric name for this resource.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "test.metric.latency", value = "The metric name for this resource.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public MetricTagConfiguration type(MetricTagConfigurationType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MetricTagConfigurationType getType() {
    return type;
  }


  public void setType(MetricTagConfigurationType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }


  /**
   * Return true if this MetricTagConfiguration object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricTagConfiguration metricTagConfiguration = (MetricTagConfiguration) o;
    return Objects.equals(this.attributes, metricTagConfiguration.attributes) &&
        Objects.equals(this.id, metricTagConfiguration.id) &&
        Objects.equals(this.type, metricTagConfiguration.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricTagConfiguration {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
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

