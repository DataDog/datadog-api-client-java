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
   * <p>Time interval for cohort criteria.</p>
 */
@JsonPropertyOrder({
  RetentionCohortCriteriaTimeInterval.JSON_PROPERTY_TYPE,
  RetentionCohortCriteriaTimeInterval.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RetentionCohortCriteriaTimeInterval {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_TYPE = "type";
  private RetentionCohortCriteriaTimeIntervalType type;

  public static final String JSON_PROPERTY_VALUE = "value";
  private CalendarInterval value;

  public RetentionCohortCriteriaTimeInterval() {}

  @JsonCreator
  public RetentionCohortCriteriaTimeInterval(
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)RetentionCohortCriteriaTimeIntervalType type,
            @JsonProperty(required=true, value=JSON_PROPERTY_VALUE)CalendarInterval value) {
        this.type = type;
        this.unparsed |= !type.isValid();
        this.value = value;
        this.unparsed |= value.unparsed;
  }
  public RetentionCohortCriteriaTimeInterval type(RetentionCohortCriteriaTimeIntervalType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Type of time interval for cohort criteria.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public RetentionCohortCriteriaTimeIntervalType getType() {
        return type;
      }
  public void setType(RetentionCohortCriteriaTimeIntervalType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }
  public RetentionCohortCriteriaTimeInterval value(CalendarInterval value) {
    this.value = value;
    this.unparsed |= value.unparsed;
    return this;
  }

  /**
   * <p>Calendar interval definition.</p>
   * @return value
  **/
      @JsonProperty(JSON_PROPERTY_VALUE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public CalendarInterval getValue() {
        return value;
      }
  public void setValue(CalendarInterval value) {
    this.value = value;
    if (value != null) {
      this.unparsed |= value.unparsed;
    }
  }

  /**
   * Return true if this RetentionCohortCriteriaTimeInterval object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetentionCohortCriteriaTimeInterval retentionCohortCriteriaTimeInterval = (RetentionCohortCriteriaTimeInterval) o;
    return Objects.equals(this.type, retentionCohortCriteriaTimeInterval.type) && Objects.equals(this.value, retentionCohortCriteriaTimeInterval.value);
  }


  @Override
  public int hashCode() {
    return Objects.hash(type,value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetentionCohortCriteriaTimeInterval {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
