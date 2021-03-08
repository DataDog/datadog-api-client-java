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
import com.datadog.api.v1.client.model.LogsUserAgentParserType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * The User-Agent parser takes a User-Agent attribute and extracts the OS, browser, device, and other user data. It recognizes major bots like the Google Bot, Yahoo Slurp, and Bing.
 */
@ApiModel(description = "The User-Agent parser takes a User-Agent attribute and extracts the OS, browser, device, and other user data. It recognizes major bots like the Google Bot, Yahoo Slurp, and Bing.")
@JsonPropertyOrder({
  LogsUserAgentParser.JSON_PROPERTY_IS_ENABLED,
  LogsUserAgentParser.JSON_PROPERTY_IS_ENCODED,
  LogsUserAgentParser.JSON_PROPERTY_NAME,
  LogsUserAgentParser.JSON_PROPERTY_SOURCES,
  LogsUserAgentParser.JSON_PROPERTY_TARGET,
  LogsUserAgentParser.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LogsUserAgentParser {
  public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
  private Boolean isEnabled = false;

  public static final String JSON_PROPERTY_IS_ENCODED = "is_encoded";
  private Boolean isEncoded = false;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SOURCES = "sources";
  private List<String> sources = new ArrayList<>();

  public static final String JSON_PROPERTY_TARGET = "target";
  private String target = "http.useragent_details";

  public static final String JSON_PROPERTY_TYPE = "type";
  private LogsUserAgentParserType type = LogsUserAgentParserType.USER_AGENT_PARSER;


  public LogsUserAgentParser isEnabled(Boolean isEnabled) {
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


  public LogsUserAgentParser isEncoded(Boolean isEncoded) {
    this.isEncoded = isEncoded;
    return this;
  }

   /**
   * Define if the source attribute is URL encoded or not.
   * @return isEncoded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Define if the source attribute is URL encoded or not.")
  @JsonProperty(JSON_PROPERTY_IS_ENCODED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsEncoded() {
    return isEncoded;
  }


  public void setIsEncoded(Boolean isEncoded) {
    this.isEncoded = isEncoded;
  }


  public LogsUserAgentParser name(String name) {
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


  public LogsUserAgentParser sources(List<String> sources) {
    this.sources = sources;
    return this;
  }

  public LogsUserAgentParser addSourcesItem(String sourcesItem) {
    this.sources.add(sourcesItem);
    return this;
  }

   /**
   * Array of source attributes.
   * @return sources
  **/
  @ApiModelProperty(example = "[\"http.useragent\"]", required = true, value = "Array of source attributes.")
  @JsonProperty(JSON_PROPERTY_SOURCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getSources() {
    return sources;
  }


  public void setSources(List<String> sources) {
    this.sources = sources;
  }


  public LogsUserAgentParser target(String target) {
    this.target = target;
    return this;
  }

   /**
   * Name of the parent attribute that contains all the extracted details from the &#x60;sources&#x60;.
   * @return target
  **/
  @ApiModelProperty(example = "http.useragent_details", required = true, value = "Name of the parent attribute that contains all the extracted details from the `sources`.")
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTarget() {
    return target;
  }


  public void setTarget(String target) {
    this.target = target;
  }


  public LogsUserAgentParser type(LogsUserAgentParserType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LogsUserAgentParserType getType() {
    return type;
  }


  public void setType(LogsUserAgentParserType type) {
    this.type = type;
  }


  /**
   * Return true if this LogsUserAgentParser object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsUserAgentParser logsUserAgentParser = (LogsUserAgentParser) o;
    return Objects.equals(this.isEnabled, logsUserAgentParser.isEnabled) &&
        Objects.equals(this.isEncoded, logsUserAgentParser.isEncoded) &&
        Objects.equals(this.name, logsUserAgentParser.name) &&
        Objects.equals(this.sources, logsUserAgentParser.sources) &&
        Objects.equals(this.target, logsUserAgentParser.target) &&
        Objects.equals(this.type, logsUserAgentParser.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEnabled, isEncoded, name, sources, target, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsUserAgentParser {\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    isEncoded: ").append(toIndentedString(isEncoded)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

