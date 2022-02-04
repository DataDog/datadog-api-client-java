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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** Search options. */
@ApiModel(description = "Search options.")
@JsonPropertyOrder({MonitorFormulaAndFunctionEventQueryDefinitionSearch.JSON_PROPERTY_QUERY})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MonitorFormulaAndFunctionEventQueryDefinitionSearch {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public MonitorFormulaAndFunctionEventQueryDefinitionSearch() {}

  @JsonCreator
  public MonitorFormulaAndFunctionEventQueryDefinitionSearch(
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) String query) {
    this.query = query;
  }

  public MonitorFormulaAndFunctionEventQueryDefinitionSearch query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Events search string.
   *
   * @return query
   */
  @ApiModelProperty(example = "service:query", required = true, value = "Events search string.")
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  /**
   * Return true if this MonitorFormulaAndFunctionEventQueryDefinitionSearch object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorFormulaAndFunctionEventQueryDefinitionSearch
        monitorFormulaAndFunctionEventQueryDefinitionSearch =
            (MonitorFormulaAndFunctionEventQueryDefinitionSearch) o;
    return Objects.equals(this.query, monitorFormulaAndFunctionEventQueryDefinitionSearch.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorFormulaAndFunctionEventQueryDefinitionSearch {\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
