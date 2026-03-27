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
   * <p>Composed target for <code>validatesXPath</code> operator.</p>
 */
@JsonPropertyOrder({
  SyntheticsAssertionXPathTargetTarget.JSON_PROPERTY_OPERATOR,
  SyntheticsAssertionXPathTargetTarget.JSON_PROPERTY_TARGET_VALUE,
  SyntheticsAssertionXPathTargetTarget.JSON_PROPERTY_X_PATH
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsAssertionXPathTargetTarget {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_OPERATOR = "operator";
  private String operator;

  public static final String JSON_PROPERTY_TARGET_VALUE = "targetValue";
  private SyntheticsAssertionTargetValue targetValue;

  public static final String JSON_PROPERTY_X_PATH = "xPath";
  private String xPath;

  public SyntheticsAssertionXPathTargetTarget operator(String operator) {
    this.operator = operator;
    return this;
  }

  /**
   * <p>The specific operator to use on the path.</p>
   * @return operator
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_OPERATOR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getOperator() {
        return operator;
      }
  public void setOperator(String operator) {
    this.operator = operator;
  }
  public SyntheticsAssertionXPathTargetTarget targetValue(SyntheticsAssertionTargetValue targetValue) {
    this.targetValue = targetValue;
    this.unparsed |= targetValue.unparsed;
    return this;
  }

  /**
   * <p>Value used by the operator in assertions. Can be either a number or string.</p>
   * @return targetValue
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TARGET_VALUE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsAssertionTargetValue getTargetValue() {
        return targetValue;
      }
  public void setTargetValue(SyntheticsAssertionTargetValue targetValue) {
    this.targetValue = targetValue;
  }
  public SyntheticsAssertionXPathTargetTarget xPath(String xPath) {
    this.xPath = xPath;
    return this;
  }

  /**
   * <p>The X path to assert.</p>
   * @return xPath
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_X_PATH)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getXPath() {
        return xPath;
      }
  public void setXPath(String xPath) {
    this.xPath = xPath;
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
   * @return SyntheticsAssertionXPathTargetTarget
   */
  @JsonAnySetter
  public SyntheticsAssertionXPathTargetTarget putAdditionalProperty(String key, Object value) {
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
   * Return true if this SyntheticsAssertionXPathTargetTarget object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsAssertionXPathTargetTarget syntheticsAssertionXPathTargetTarget = (SyntheticsAssertionXPathTargetTarget) o;
    return Objects.equals(this.operator, syntheticsAssertionXPathTargetTarget.operator) && Objects.equals(this.targetValue, syntheticsAssertionXPathTargetTarget.targetValue) && Objects.equals(this.xPath, syntheticsAssertionXPathTargetTarget.xPath) && Objects.equals(this.additionalProperties, syntheticsAssertionXPathTargetTarget.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(operator,targetValue,xPath, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsAssertionXPathTargetTarget {\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    targetValue: ").append(toIndentedString(targetValue)).append("\n");
    sb.append("    xPath: ").append(toIndentedString(xPath)).append("\n");
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
