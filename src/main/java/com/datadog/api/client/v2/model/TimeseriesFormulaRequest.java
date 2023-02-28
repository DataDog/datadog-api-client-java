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
   * <p>A single timeseries query to be executed.</p>
 */
@JsonPropertyOrder({
  TimeseriesFormulaRequest.JSON_PROPERTY_ATTRIBUTES,
  TimeseriesFormulaRequest.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TimeseriesFormulaRequest {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private TimeseriesFormulaRequestAttributes attributes;

  public static final String JSON_PROPERTY_TYPE = "type";
  private TimeseriesFormulaRequestType type = TimeseriesFormulaRequestType.TIMESERIES_REQUEST;

  public TimeseriesFormulaRequest() {}

  @JsonCreator
  public TimeseriesFormulaRequest(
            @JsonProperty(required=true, value=JSON_PROPERTY_ATTRIBUTES)TimeseriesFormulaRequestAttributes attributes,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)TimeseriesFormulaRequestType type) {
        this.attributes = attributes;
        this.unparsed |= attributes.unparsed;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public TimeseriesFormulaRequest attributes(TimeseriesFormulaRequestAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * <p>The object describing a timeseries formula request.</p>
   * @return attributes
  **/
      @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public TimeseriesFormulaRequestAttributes getAttributes() {
        return attributes;
      }
  public void setAttributes(TimeseriesFormulaRequestAttributes attributes) {
    this.attributes = attributes;
  }
  public TimeseriesFormulaRequest type(TimeseriesFormulaRequestType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The type of the resource. The value should always be timeseries_request.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public TimeseriesFormulaRequestType getType() {
        return type;
      }
  public void setType(TimeseriesFormulaRequestType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * Return true if this TimeseriesFormulaRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeseriesFormulaRequest timeseriesFormulaRequest = (TimeseriesFormulaRequest) o;
    return Objects.equals(this.attributes, timeseriesFormulaRequest.attributes) && Objects.equals(this.type, timeseriesFormulaRequest.type);
  }


  @Override
  public int hashCode() {
    return Objects.hash(attributes,type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeseriesFormulaRequest {\n");
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
