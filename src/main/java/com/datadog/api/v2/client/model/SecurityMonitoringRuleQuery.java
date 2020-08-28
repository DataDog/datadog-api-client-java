/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v2.client.model;

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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v2.client.JSON;


/**
 * Query for matching rule.
 */
@ApiModel(description = "Query for matching rule.")
@JsonPropertyOrder({
  SecurityMonitoringRuleQuery.JSON_PROPERTY_DISTINCT_FIELDS,
  SecurityMonitoringRuleQuery.JSON_PROPERTY_GROUP_BY_FIELDS,
  SecurityMonitoringRuleQuery.JSON_PROPERTY_NAME,
  SecurityMonitoringRuleQuery.JSON_PROPERTY_QUERY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SecurityMonitoringRuleQuery {
  public static final String JSON_PROPERTY_DISTINCT_FIELDS = "distinctFields";
  private List<String> distinctFields = null;

  public static final String JSON_PROPERTY_GROUP_BY_FIELDS = "groupByFields";
  private List<String> groupByFields = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;


  public SecurityMonitoringRuleQuery distinctFields(List<String> distinctFields) {
    this.distinctFields = distinctFields;
    return this;
  }

  public SecurityMonitoringRuleQuery addDistinctFieldsItem(String distinctFieldsItem) {
    if (this.distinctFields == null) {
      this.distinctFields = new ArrayList<>();
    }
    this.distinctFields.add(distinctFieldsItem);
    return this;
  }

   /**
   * Field for which the cardinality is measured. Sent as an array.
   * @return distinctFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Field for which the cardinality is measured. Sent as an array.")
  @JsonProperty(JSON_PROPERTY_DISTINCT_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getDistinctFields() {
    return distinctFields;
  }


  public void setDistinctFields(List<String> distinctFields) {
    this.distinctFields = distinctFields;
  }


  public SecurityMonitoringRuleQuery groupByFields(List<String> groupByFields) {
    this.groupByFields = groupByFields;
    return this;
  }

  public SecurityMonitoringRuleQuery addGroupByFieldsItem(String groupByFieldsItem) {
    if (this.groupByFields == null) {
      this.groupByFields = new ArrayList<>();
    }
    this.groupByFields.add(groupByFieldsItem);
    return this;
  }

   /**
   * Fields to group by.
   * @return groupByFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fields to group by.")
  @JsonProperty(JSON_PROPERTY_GROUP_BY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getGroupByFields() {
    return groupByFields;
  }


  public void setGroupByFields(List<String> groupByFields) {
    this.groupByFields = groupByFields;
  }


  public SecurityMonitoringRuleQuery name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the query.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the query.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SecurityMonitoringRuleQuery query(String query) {
    this.query = query;
    return this;
  }

   /**
   * Query to run on logs.
   * @return query
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Query to run on logs.")
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getQuery() {
    return query;
  }


  public void setQuery(String query) {
    this.query = query;
  }


  /**
   * Return true if this SecurityMonitoringRuleQuery object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringRuleQuery securityMonitoringRuleQuery = (SecurityMonitoringRuleQuery) o;
    return Objects.equals(this.distinctFields, securityMonitoringRuleQuery.distinctFields) &&
        Objects.equals(this.groupByFields, securityMonitoringRuleQuery.groupByFields) &&
        Objects.equals(this.name, securityMonitoringRuleQuery.name) &&
        Objects.equals(this.query, securityMonitoringRuleQuery.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distinctFields, groupByFields, name, query);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringRuleQuery {\n");
    sb.append("    distinctFields: ").append(toIndentedString(distinctFields)).append("\n");
    sb.append("    groupByFields: ").append(toIndentedString(groupByFields)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

