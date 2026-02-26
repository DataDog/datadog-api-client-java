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
   * @return EventQueryDefinition
   */
  @JsonAnySetter
  public EventQueryDefinition putAdditionalProperty(String key, Object value) {
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
    return Objects.equals(this.search, eventQueryDefinition.search) && Objects.equals(this.tagsExecution, eventQueryDefinition.tagsExecution) && Objects.equals(this.additionalProperties, eventQueryDefinition.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(search,tagsExecution, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventQueryDefinition {\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    tagsExecution: ").append(toIndentedString(tagsExecution)).append("\n");
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
