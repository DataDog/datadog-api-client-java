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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.datadog.api.v1.client.JSON;


/**
 * The object containing the aggregates.
 */
@ApiModel(description = "The object containing the aggregates.")
@JsonPropertyOrder({
  UsageAttributionAggregatesBody.JSON_PROPERTY_AGG_TYPE,
  UsageAttributionAggregatesBody.JSON_PROPERTY_FIELD,
  UsageAttributionAggregatesBody.JSON_PROPERTY_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class UsageAttributionAggregatesBody {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGG_TYPE = "agg_type";
  private String aggType;

  public static final String JSON_PROPERTY_FIELD = "field";
  private String field;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Double value;


  public UsageAttributionAggregatesBody aggType(String aggType) {
    this.aggType = aggType;
    return this;
  }

   /**
   * The aggregate type.
   * @return aggType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "sum", value = "The aggregate type.")
  @JsonProperty(JSON_PROPERTY_AGG_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAggType() {
    return aggType;
  }


  public void setAggType(String aggType) {
    this.aggType = aggType;
  }


  public UsageAttributionAggregatesBody field(String field) {
    this.field = field;
    return this;
  }

   /**
   * The field.
   * @return field
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "custom_timeseries_usage", value = "The field.")
  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getField() {
    return field;
  }


  public void setField(String field) {
    this.field = field;
  }


  public UsageAttributionAggregatesBody value(Double value) {
    this.value = value;
    return this;
  }

   /**
   * The value for a given field.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value for a given field.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getValue() {
    return value;
  }


  public void setValue(Double value) {
    this.value = value;
  }


  /**
   * Return true if this UsageAttributionAggregatesBody object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageAttributionAggregatesBody usageAttributionAggregatesBody = (UsageAttributionAggregatesBody) o;
    return Objects.equals(this.aggType, usageAttributionAggregatesBody.aggType) &&
        Objects.equals(this.field, usageAttributionAggregatesBody.field) &&
        Objects.equals(this.value, usageAttributionAggregatesBody.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggType, field, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageAttributionAggregatesBody {\n");
    sb.append("    aggType: ").append(toIndentedString(aggType)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

