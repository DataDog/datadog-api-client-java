/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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
   * <p>The definition of <code>CompletionCondition</code> object.</p>
 */
@JsonPropertyOrder({
  CompletionCondition.JSON_PROPERTY_OPERAND1,
  CompletionCondition.JSON_PROPERTY_OPERAND2,
  CompletionCondition.JSON_PROPERTY_OPERATOR
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CompletionCondition {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_OPERAND1 = "operand1";
  private Object operand1 = new Object();

  public static final String JSON_PROPERTY_OPERAND2 = "operand2";
  private Object operand2 = null;

  public static final String JSON_PROPERTY_OPERATOR = "operator";
  private CompletionConditionOperator operator;

  public CompletionCondition() {}

  @JsonCreator
  public CompletionCondition(
            @JsonProperty(required=true, value=JSON_PROPERTY_OPERAND1)Object operand1,
            @JsonProperty(required=true, value=JSON_PROPERTY_OPERATOR)CompletionConditionOperator operator) {
        this.operand1 = operand1;
        this.operator = operator;
        this.unparsed |= !operator.isValid();
  }
  public CompletionCondition operand1(Object operand1) {
    this.operand1 = operand1;
    return this;
  }

  /**
   * <p>The <code>CompletionCondition</code> <code>operand1</code>.</p>
   * @return operand1
  **/
      @JsonProperty(JSON_PROPERTY_OPERAND1)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Object getOperand1() {
        return operand1;
      }
  public void setOperand1(Object operand1) {
    this.operand1 = operand1;
  }
  public CompletionCondition operand2(Object operand2) {
    this.operand2 = operand2;
    return this;
  }

  /**
   * <p>The <code>CompletionCondition</code> <code>operand2</code>.</p>
   * @return operand2
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_OPERAND2)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Object getOperand2() {
        return operand2;
      }
  public void setOperand2(Object operand2) {
    this.operand2 = operand2;
  }
  public CompletionCondition operator(CompletionConditionOperator operator) {
    this.operator = operator;
    this.unparsed |= !operator.isValid();
    return this;
  }

  /**
   * <p>The definition of <code>CompletionConditionOperator</code> object.</p>
   * @return operator
  **/
      @JsonProperty(JSON_PROPERTY_OPERATOR)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public CompletionConditionOperator getOperator() {
        return operator;
      }
  public void setOperator(CompletionConditionOperator operator) {
    if (!operator.isValid()) {
        this.unparsed = true;
    }
    this.operator = operator;
  }

  /**
   * Return true if this CompletionCondition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompletionCondition completionCondition = (CompletionCondition) o;
    return Objects.equals(this.operand1, completionCondition.operand1) && Objects.equals(this.operand2, completionCondition.operand2) && Objects.equals(this.operator, completionCondition.operator);
  }


  @Override
  public int hashCode() {
    return Objects.hash(operand1,operand2,operator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompletionCondition {\n");
    sb.append("    operand1: ").append(toIndentedString(operand1)).append("\n");
    sb.append("    operand2: ").append(toIndentedString(operand2)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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
