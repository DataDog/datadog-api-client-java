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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * TODO.
 */
@ApiModel(description = "TODO.")
@JsonPropertyOrder({
  LogQueryDefinitionSearch.JSON_PROPERTY_QUERY
})

public class LogQueryDefinitionSearch {
  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;


  public LogQueryDefinitionSearch query(String query) {
    
    this.query = query;
    return this;
  }

   /**
   * TODO.
   * @return query
  **/
  @ApiModelProperty(required = true, value = "TODO.")
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getQuery() {
    return query;
  }


  public void setQuery(String query) {
    this.query = query;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogQueryDefinitionSearch logQueryDefinitionSearch = (LogQueryDefinitionSearch) o;
    return Objects.equals(this.query, logQueryDefinitionSearch.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogQueryDefinitionSearch {\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

