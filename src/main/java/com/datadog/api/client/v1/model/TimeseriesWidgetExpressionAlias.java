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
   * <p>Define an expression alias.</p>
 */
@JsonPropertyOrder({
  TimeseriesWidgetExpressionAlias.JSON_PROPERTY_ALIAS_NAME,
  TimeseriesWidgetExpressionAlias.JSON_PROPERTY_EXPRESSION
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TimeseriesWidgetExpressionAlias {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALIAS_NAME = "alias_name";
  private String aliasName;

  public static final String JSON_PROPERTY_EXPRESSION = "expression";
  private String expression;

  public TimeseriesWidgetExpressionAlias() {}

  @JsonCreator
  public TimeseriesWidgetExpressionAlias(
            @JsonProperty(required=true, value=JSON_PROPERTY_EXPRESSION)String expression) {
        this.expression = expression;
  }
  public TimeseriesWidgetExpressionAlias aliasName(String aliasName) {
    this.aliasName = aliasName;
    return this;
  }

  /**
   * <p>Expression alias.</p>
   * @return aliasName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ALIAS_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getAliasName() {
        return aliasName;
      }
  public void setAliasName(String aliasName) {
    this.aliasName = aliasName;
  }
  public TimeseriesWidgetExpressionAlias expression(String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * <p>Expression name.</p>
   * @return expression
  **/
      @JsonProperty(JSON_PROPERTY_EXPRESSION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getExpression() {
        return expression;
      }
  public void setExpression(String expression) {
    this.expression = expression;
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
   * @return TimeseriesWidgetExpressionAlias
   */
  @JsonAnySetter
  public TimeseriesWidgetExpressionAlias putAdditionalProperty(String key, Object value) {
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
   * Return true if this TimeseriesWidgetExpressionAlias object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeseriesWidgetExpressionAlias timeseriesWidgetExpressionAlias = (TimeseriesWidgetExpressionAlias) o;
    return Objects.equals(this.aliasName, timeseriesWidgetExpressionAlias.aliasName) && Objects.equals(this.expression, timeseriesWidgetExpressionAlias.expression) && Objects.equals(this.additionalProperties, timeseriesWidgetExpressionAlias.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(aliasName,expression, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeseriesWidgetExpressionAlias {\n");
    sb.append("    aliasName: ").append(toIndentedString(aliasName)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
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
