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
   * <p>The event query.</p>
 */
@JsonPropertyOrder({
  EventQueryDefinition.JSON_PROPERTY_SEARCH,
  EventQueryDefinition.JSON_PROPERTY_TAGS_EXECUTION
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EventQueryDefinition {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_SEARCH = "search";
  private String search;

  public static final String JSON_PROPERTY_TAGS_EXECUTION = "tags_execution";
  private String tagsExecution;

  public EventQueryDefinition() {}

  @JsonCreator
  public EventQueryDefinition(
            @JsonProperty(required=true, value=JSON_PROPERTY_SEARCH)String search,
            @JsonProperty(required=true, value=JSON_PROPERTY_TAGS_EXECUTION)String tagsExecution) {
        this.search = search;
        this.tagsExecution = tagsExecution;
  }
  public EventQueryDefinition search(String search) {
    this.search = search;
    return this;
  }

  /**
   * <p>The query being made on the event.</p>
   * @return search
  **/
      @JsonProperty(JSON_PROPERTY_SEARCH)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getSearch() {
        return search;
      }
  public void setSearch(String search) {
    this.search = search;
  }
  public EventQueryDefinition tagsExecution(String tagsExecution) {
    this.tagsExecution = tagsExecution;
    return this;
  }

  /**
   * <p>The execution method for multi-value filters. Can be either and or or.</p>
   * @return tagsExecution
  **/
      @JsonProperty(JSON_PROPERTY_TAGS_EXECUTION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getTagsExecution() {
        return tagsExecution;
      }
  public void setTagsExecution(String tagsExecution) {
    this.tagsExecution = tagsExecution;
  }

  /**
   * Return true if this EventQueryDefinition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventQueryDefinition eventQueryDefinition = (EventQueryDefinition) o;
    return Objects.equals(this.search, eventQueryDefinition.search) && Objects.equals(this.tagsExecution, eventQueryDefinition.tagsExecution);
  }


  @Override
  public int hashCode() {
    return Objects.hash(search,tagsExecution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventQueryDefinition {\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    tagsExecution: ").append(toIndentedString(tagsExecution)).append("\n");
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
