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
   * <p>Object describing the logs filter with corresponding category ID and name assignment.</p>
 */
@JsonPropertyOrder({
  LogsSchemaCategoryMapperCategory.JSON_PROPERTY_FILTER,
  LogsSchemaCategoryMapperCategory.JSON_PROPERTY_ID,
  LogsSchemaCategoryMapperCategory.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsSchemaCategoryMapperCategory {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILTER = "filter";
  private LogsFilter filter;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public LogsSchemaCategoryMapperCategory() {}

  @JsonCreator
  public LogsSchemaCategoryMapperCategory(
            @JsonProperty(required=true, value=JSON_PROPERTY_FILTER)LogsFilter filter,
            @JsonProperty(required=true, value=JSON_PROPERTY_ID)Long id,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name) {
        this.filter = filter;
        this.unparsed |= filter.unparsed;
        this.id = id;
        this.name = name;
  }
  public LogsSchemaCategoryMapperCategory filter(LogsFilter filter) {
    this.filter = filter;
    this.unparsed |= filter.unparsed;
    return this;
  }

  /**
   * <p>Filter for logs.</p>
   * @return filter
  **/
      @JsonProperty(JSON_PROPERTY_FILTER)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public LogsFilter getFilter() {
        return filter;
      }
  public void setFilter(LogsFilter filter) {
    this.filter = filter;
  }
  public LogsSchemaCategoryMapperCategory id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * <p>ID to inject into the category.</p>
   * @return id
  **/
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getId() {
        return id;
      }
  public void setId(Long id) {
    this.id = id;
  }
  public LogsSchemaCategoryMapperCategory name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Value to assign to target schema field.</p>
   * @return name
  **/
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return LogsSchemaCategoryMapperCategory
   */
  @JsonAnySetter
  public LogsSchemaCategoryMapperCategory putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }

  /**
   * Return true if this LogsSchemaCategoryMapperCategory object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsSchemaCategoryMapperCategory logsSchemaCategoryMapperCategory = (LogsSchemaCategoryMapperCategory) o;
    return Objects.equals(this.filter, logsSchemaCategoryMapperCategory.filter) && Objects.equals(this.id, logsSchemaCategoryMapperCategory.id) && Objects.equals(this.name, logsSchemaCategoryMapperCategory.name) && Objects.equals(this.additionalProperties, logsSchemaCategoryMapperCategory.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(filter,id,name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsSchemaCategoryMapperCategory {\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
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
