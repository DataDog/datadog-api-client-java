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
import com.datadog.api.v2.client.model.MetricTagConfigurationType;
import com.datadog.api.v2.client.model.MetricTagConfigurationUpdateAttributes;
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
 * Object for a single tag configuration to be edited.
 */
@ApiModel(description = "Object for a single tag configuration to be edited.")
@JsonPropertyOrder({
  MetricTagConfigurationUpdateData.JSON_PROPERTY_ATTRIBUTES,
  MetricTagConfigurationUpdateData.JSON_PROPERTY_ID,
  MetricTagConfigurationUpdateData.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class MetricTagConfigurationUpdateData {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private MetricTagConfigurationUpdateAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private MetricTagConfigurationType type = MetricTagConfigurationType.MANAGE_TAGS;

  public MetricTagConfigurationUpdateData() {}

  @JsonCreator
  public MetricTagConfigurationUpdateData(
            @JsonProperty(required=true, value=JSON_PROPERTY_ID) String id,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE) MetricTagConfigurationType type
            ) {
        this.id = id;
        this.type = type;
        this.unparsed |= !type.isValid();
  }

  public MetricTagConfigurationUpdateData attributes(MetricTagConfigurationUpdateAttributes attributes) {
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

  public MetricTagConfigurationUpdateAttributes getAttributes() {
    return attributes;
  }


  public void setAttributes(MetricTagConfigurationUpdateAttributes attributes) {
    this.attributes = attributes;
  }


  public MetricTagConfigurationUpdateData id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The metric name for this resource.
   * @return id
  **/
  @ApiModelProperty(example = "test.metric.latency", required = true, value = "The metric name for this resource.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public MetricTagConfigurationUpdateData type(MetricTagConfigurationType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

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
   * Return true if this MetricTagConfigurationUpdateData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricTagConfigurationUpdateData metricTagConfigurationUpdateData = (MetricTagConfigurationUpdateData) o;
    return Objects.equals(this.attributes, metricTagConfigurationUpdateData.attributes) &&
        Objects.equals(this.id, metricTagConfigurationUpdateData.id) &&
        Objects.equals(this.type, metricTagConfigurationUpdateData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricTagConfigurationUpdateData {\n");
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

