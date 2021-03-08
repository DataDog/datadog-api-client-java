/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.datadog.api.v1.client.model.LogsFilter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * Object describing the logs filter.
 */
@ApiModel(description = "Object describing the logs filter.")
@JsonPropertyOrder({
  LogsCategoryProcessorCategory.JSON_PROPERTY_FILTER,
  LogsCategoryProcessorCategory.JSON_PROPERTY_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LogsCategoryProcessorCategory {
  public static final String JSON_PROPERTY_FILTER = "filter";
  private LogsFilter filter;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;


  public LogsCategoryProcessorCategory filter(LogsFilter filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LogsFilter getFilter() {
    return filter;
  }


  public void setFilter(LogsFilter filter) {
    this.filter = filter;
  }


  public LogsCategoryProcessorCategory name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Value to assign to the target attribute.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Value to assign to the target attribute.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  /**
   * Return true if this LogsCategoryProcessorCategory object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsCategoryProcessorCategory logsCategoryProcessorCategory = (LogsCategoryProcessorCategory) o;
    return Objects.equals(this.filter, logsCategoryProcessorCategory.filter) &&
        Objects.equals(this.name, logsCategoryProcessorCategory.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsCategoryProcessorCategory {\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

