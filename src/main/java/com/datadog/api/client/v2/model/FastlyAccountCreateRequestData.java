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
   * <p>Data object for creating a Fastly account.</p>
 */
@JsonPropertyOrder({
  FastlyAccountCreateRequestData.JSON_PROPERTY_ATTRIBUTES,
  FastlyAccountCreateRequestData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FastlyAccountCreateRequestData {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private FastlyAccountCreateRequestAttributes attributes;

  public static final String JSON_PROPERTY_TYPE = "type";
  private FastlyAccountType type = FastlyAccountType.FASTLY_ACCOUNTS;

  public FastlyAccountCreateRequestData() {}

  @JsonCreator
  public FastlyAccountCreateRequestData(
            @JsonProperty(required=true, value=JSON_PROPERTY_ATTRIBUTES)FastlyAccountCreateRequestAttributes attributes,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)FastlyAccountType type) {
        this.attributes = attributes;
        this.unparsed |= attributes.unparsed;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public FastlyAccountCreateRequestData attributes(FastlyAccountCreateRequestAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * <p>Attributes object for creating a Fastly account.</p>
   * @return attributes
  **/
      @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public FastlyAccountCreateRequestAttributes getAttributes() {
        return attributes;
      }
  public void setAttributes(FastlyAccountCreateRequestAttributes attributes) {
    this.attributes = attributes;
  }
  public FastlyAccountCreateRequestData type(FastlyAccountType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The JSON:API type for this API. Should always be <code>fastly-accounts</code>.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public FastlyAccountType getType() {
        return type;
      }
  public void setType(FastlyAccountType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * Return true if this FastlyAccountCreateRequestData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FastlyAccountCreateRequestData fastlyAccountCreateRequestData = (FastlyAccountCreateRequestData) o;
    return Objects.equals(this.attributes, fastlyAccountCreateRequestData.attributes) && Objects.equals(this.type, fastlyAccountCreateRequestData.type);
  }


  @Override
  public int hashCode() {
    return Objects.hash(attributes,type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FastlyAccountCreateRequestData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
