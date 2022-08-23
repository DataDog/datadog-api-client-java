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
   * <p>Object describing the logs filter.</p>
 */
@JsonPropertyOrder({
  LogsCategoryProcessorCategory.JSON_PROPERTY_FILTER,
  LogsCategoryProcessorCategory.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsCategoryProcessorCategory {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILTER = "filter";
  private LogsFilter filter;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public LogsCategoryProcessorCategory filter(LogsFilter filter) {
    this.filter = filter;
    this.unparsed |= filter.unparsed;
    return this;
  }

  /**
   * <p>Filter for logs.</p>
   * @return filter
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FILTER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Value to assign to the target attribute.</p>
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
    return Objects.equals(this.filter, logsCategoryProcessorCategory.filter) && Objects.equals(this.name, logsCategoryProcessorCategory.name);
  }


  @Override
  public int hashCode() {
    return Objects.hash(filter,name);
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
