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
   * <p>Time interval for return criteria.</p>
 */
@JsonPropertyOrder({
  RetentionReturnCriteriaTimeInterval.JSON_PROPERTY_TYPE,
  RetentionReturnCriteriaTimeInterval.JSON_PROPERTY_UNIT,
  RetentionReturnCriteriaTimeInterval.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RetentionReturnCriteriaTimeInterval {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_TYPE = "type";
  private RetentionReturnCriteriaTimeIntervalType type;

  public static final String JSON_PROPERTY_UNIT = "unit";
  private RetentionReturnCriteriaTimeIntervalUnit unit;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Double value;

  public RetentionReturnCriteriaTimeInterval() {}

  @JsonCreator
  public RetentionReturnCriteriaTimeInterval(
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)RetentionReturnCriteriaTimeIntervalType type,
            @JsonProperty(required=true, value=JSON_PROPERTY_UNIT)RetentionReturnCriteriaTimeIntervalUnit unit,
            @JsonProperty(required=true, value=JSON_PROPERTY_VALUE)Double value) {
        this.type = type;
        this.unparsed |= !type.isValid();
        this.unit = unit;
        this.unparsed |= !unit.isValid();
        this.value = value;
  }
  public RetentionReturnCriteriaTimeInterval type(RetentionReturnCriteriaTimeIntervalType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Type of time interval for return criteria.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public RetentionReturnCriteriaTimeIntervalType getType() {
        return type;
      }
  public void setType(RetentionReturnCriteriaTimeIntervalType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }
  public RetentionReturnCriteriaTimeInterval unit(RetentionReturnCriteriaTimeIntervalUnit unit) {
    this.unit = unit;
    this.unparsed |= !unit.isValid();
    return this;
  }

  /**
   * <p>Unit of time for retention return criteria interval.</p>
   * @return unit
  **/
      @JsonProperty(JSON_PROPERTY_UNIT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public RetentionReturnCriteriaTimeIntervalUnit getUnit() {
        return unit;
      }
  public void setUnit(RetentionReturnCriteriaTimeIntervalUnit unit) {
    if (!unit.isValid()) {
        this.unparsed = true;
    }
    this.unit = unit;
  }
  public RetentionReturnCriteriaTimeInterval value(Double value) {
    this.value = value;
    return this;
  }

  /**
   * <p>Value of the time interval.</p>
   * @return value
  **/
      @JsonProperty(JSON_PROPERTY_VALUE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Double getValue() {
        return value;
      }
  public void setValue(Double value) {
    this.value = value;
  }

  /**
   * Return true if this RetentionReturnCriteriaTimeInterval object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetentionReturnCriteriaTimeInterval retentionReturnCriteriaTimeInterval = (RetentionReturnCriteriaTimeInterval) o;
    return Objects.equals(this.type, retentionReturnCriteriaTimeInterval.type) && Objects.equals(this.unit, retentionReturnCriteriaTimeInterval.unit) && Objects.equals(this.value, retentionReturnCriteriaTimeInterval.value);
  }


  @Override
  public int hashCode() {
    return Objects.hash(type,unit,value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetentionReturnCriteriaTimeInterval {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
