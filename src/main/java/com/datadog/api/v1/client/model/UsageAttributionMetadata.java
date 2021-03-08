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
import com.datadog.api.v1.client.model.UsageAttributionAggregatesBody;
import com.datadog.api.v1.client.model.UsageAttributionPagination;
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
import com.datadog.api.v1.client.JSON;


/**
 * The object containing document metadata.
 */
@ApiModel(description = "The object containing document metadata.")
@JsonPropertyOrder({
  UsageAttributionMetadata.JSON_PROPERTY_AGGREGATES,
  UsageAttributionMetadata.JSON_PROPERTY_PAGINATION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UsageAttributionMetadata {
  public static final String JSON_PROPERTY_AGGREGATES = "aggregates";
  private List<UsageAttributionAggregatesBody> aggregates = null;

  public static final String JSON_PROPERTY_PAGINATION = "pagination";
  private UsageAttributionPagination pagination;


  public UsageAttributionMetadata aggregates(List<UsageAttributionAggregatesBody> aggregates) {
    this.aggregates = aggregates;
    return this;
  }

  public UsageAttributionMetadata addAggregatesItem(UsageAttributionAggregatesBody aggregatesItem) {
    if (this.aggregates == null) {
      this.aggregates = new ArrayList<>();
    }
    this.aggregates.add(aggregatesItem);
    return this;
  }

   /**
   * An array of available aggregates.
   * @return aggregates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of available aggregates.")
  @JsonProperty(JSON_PROPERTY_AGGREGATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UsageAttributionAggregatesBody> getAggregates() {
    return aggregates;
  }


  public void setAggregates(List<UsageAttributionAggregatesBody> aggregates) {
    this.aggregates = aggregates;
  }


  public UsageAttributionMetadata pagination(UsageAttributionPagination pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UsageAttributionPagination getPagination() {
    return pagination;
  }


  public void setPagination(UsageAttributionPagination pagination) {
    this.pagination = pagination;
  }


  /**
   * Return true if this UsageAttributionMetadata object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageAttributionMetadata usageAttributionMetadata = (UsageAttributionMetadata) o;
    return Objects.equals(this.aggregates, usageAttributionMetadata.aggregates) &&
        Objects.equals(this.pagination, usageAttributionMetadata.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregates, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageAttributionMetadata {\n");
    sb.append("    aggregates: ").append(toIndentedString(aggregates)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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

