/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
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
   * <p>The iframe widget allows you to embed a portion of any other web page on your dashboard. Only available on FREE layout dashboards.</p>
 */
@JsonPropertyOrder({
  IFrameWidgetDefinition.JSON_PROPERTY_TYPE,
  IFrameWidgetDefinition.JSON_PROPERTY_URL
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IFrameWidgetDefinition {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_TYPE = "type";
  private IFrameWidgetDefinitionType type = IFrameWidgetDefinitionType.IFRAME;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public IFrameWidgetDefinition() {}

  @JsonCreator
  public IFrameWidgetDefinition(
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)IFrameWidgetDefinitionType type,
            @JsonProperty(required=true, value=JSON_PROPERTY_URL)String url) {
        this.type = type;
        this.unparsed |= !type.isValid();
        this.url = url;
  }
  public IFrameWidgetDefinition type(IFrameWidgetDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Type of the iframe widget.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public IFrameWidgetDefinitionType getType() {
        return type;
      }
  public void setType(IFrameWidgetDefinitionType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }
  public IFrameWidgetDefinition url(String url) {
    this.url = url;
    return this;
  }

  /**
   * <p>URL of the iframe.</p>
   * @return url
  **/
      @JsonProperty(JSON_PROPERTY_URL)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getUrl() {
        return url;
      }
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Return true if this IFrameWidgetDefinition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IFrameWidgetDefinition iFrameWidgetDefinition = (IFrameWidgetDefinition) o;
    return Objects.equals(this.type, iFrameWidgetDefinition.type) && Objects.equals(this.url, iFrameWidgetDefinition.url);
  }


  @Override
  public int hashCode() {
    return Objects.hash(type,url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IFrameWidgetDefinition {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
