/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * The event query.
 */
@ApiModel(description = "The event query.")
@JsonPropertyOrder({
  EventQueryDefinition.JSON_PROPERTY_SEARCH,
  EventQueryDefinition.JSON_PROPERTY_TAGS_EXECUTION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EventQueryDefinition {
  public static final String JSON_PROPERTY_SEARCH = "search";
  private String search;

  public static final String JSON_PROPERTY_TAGS_EXECUTION = "tags_execution";
  private String tagsExecution;


  public EventQueryDefinition search(String search) {
    this.search = search;
    return this;
  }

   /**
   * The query being made on the event.
   * @return search
  **/
  @ApiModelProperty(example = "", required = true, value = "The query being made on the event.")
  @JsonProperty(JSON_PROPERTY_SEARCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

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
   * The execution method for multi-value filters. Can be either and or or.
   * @return tagsExecution
  **/
  @ApiModelProperty(example = "", required = true, value = "The execution method for multi-value filters. Can be either and or or.")
  @JsonProperty(JSON_PROPERTY_TAGS_EXECUTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

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
    return Objects.equals(this.search, eventQueryDefinition.search) &&
        Objects.equals(this.tagsExecution, eventQueryDefinition.tagsExecution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(search, tagsExecution);
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

