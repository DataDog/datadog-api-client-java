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
   * <p>RUM application update attributes.</p>
 */
@JsonPropertyOrder({
  RUMApplicationUpdateAttributes.JSON_PROPERTY_NAME,
  RUMApplicationUpdateAttributes.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RUMApplicationUpdateAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public RUMApplicationUpdateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name of the RUM application.</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public RUMApplicationUpdateAttributes type(String type) {
    this.type = type;
    return this;
  }

  /**
   * <p>Type of the RUM application. Supported values are <code>browser</code>, <code>ios</code>, <code>android</code>, <code>react-native</code>, <code>flutter</code>.</p>
   * @return type
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getType() {
        return type;
      }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Return true if this RUMApplicationUpdateAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RUMApplicationUpdateAttributes rumApplicationUpdateAttributes = (RUMApplicationUpdateAttributes) o;
    return Objects.equals(this.name, rumApplicationUpdateAttributes.name) && Objects.equals(this.type, rumApplicationUpdateAttributes.type);
  }


  @Override
  public int hashCode() {
    return Objects.hash(name,type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RUMApplicationUpdateAttributes {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
