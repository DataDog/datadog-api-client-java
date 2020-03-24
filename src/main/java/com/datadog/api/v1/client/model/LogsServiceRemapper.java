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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.datadog.api.v1.client.model.LogsProcessor;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Use this processor if you want to assign one or more attributes as the official service.  **Note:** If multiple service remapper processors can be applied to a given log, only the first one (according to the pipeline order) is taken into account.
 */
@ApiModel(description = "Use this processor if you want to assign one or more attributes as the official service.  **Note:** If multiple service remapper processors can be applied to a given log, only the first one (according to the pipeline order) is taken into account.")
@JsonPropertyOrder({
  LogsServiceRemapper.JSON_PROPERTY_SOURCES,
  LogsServiceRemapper.JSON_PROPERTY_TYPE,
  LogsServiceRemapper.JSON_PROPERTY_IS_ENABLED,
  LogsServiceRemapper.JSON_PROPERTY_NAME
})

public class LogsServiceRemapper implements LogsProcessor {
  public static final String JSON_PROPERTY_SOURCES = "sources";
  private List<String> sources = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "service-remapper";

  public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
  private Boolean isEnabled = false;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;


  public LogsServiceRemapper sources(List<String> sources) {
    
    this.sources = sources;
    return this;
  }

  public LogsServiceRemapper addSourcesItem(String sourcesItem) {
    this.sources.add(sourcesItem);
    return this;
  }

   /**
   * Array of source attributes.
   * @return sources
  **/
  @ApiModelProperty(required = true, value = "Array of source attributes.")
  @JsonProperty(JSON_PROPERTY_SOURCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getSources() {
    return sources;
  }


  public void setSources(List<String> sources) {
    this.sources = sources;
  }


   /**
   * Type of processor.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of processor.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }




  public LogsServiceRemapper isEnabled(Boolean isEnabled) {
    
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Whether or not the processor is enabled.
   * @return isEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the processor is enabled.")
  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsEnabled() {
    return isEnabled;
  }


  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  public LogsServiceRemapper name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the processor.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the processor.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsServiceRemapper logsServiceRemapper = (LogsServiceRemapper) o;
    return Objects.equals(this.sources, logsServiceRemapper.sources) &&
        Objects.equals(this.type, logsServiceRemapper.type) &&
        Objects.equals(this.isEnabled, logsServiceRemapper.isEnabled) &&
        Objects.equals(this.name, logsServiceRemapper.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sources, type, isEnabled, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsServiceRemapper {\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

