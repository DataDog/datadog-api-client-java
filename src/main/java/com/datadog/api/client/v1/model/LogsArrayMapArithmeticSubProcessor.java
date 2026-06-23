/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * An arithmetic sub-processor for use inside an array-map processor. Unlike the top-level
 * arithmetic processor, <code>is_enabled</code> is not supported.
 */
@JsonPropertyOrder({
  LogsArrayMapArithmeticSubProcessor.JSON_PROPERTY_EXPRESSION,
  LogsArrayMapArithmeticSubProcessor.JSON_PROPERTY_IS_REPLACE_MISSING,
  LogsArrayMapArithmeticSubProcessor.JSON_PROPERTY_NAME,
  LogsArrayMapArithmeticSubProcessor.JSON_PROPERTY_TARGET,
  LogsArrayMapArithmeticSubProcessor.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsArrayMapArithmeticSubProcessor {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EXPRESSION = "expression";
  private String expression;

  public static final String JSON_PROPERTY_IS_REPLACE_MISSING = "is_replace_missing";
  private Boolean isReplaceMissing = false;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TARGET = "target";
  private String target;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LogsArithmeticProcessorType type = LogsArithmeticProcessorType.ARITHMETIC_PROCESSOR;

  public LogsArrayMapArithmeticSubProcessor() {}

  @JsonCreator
  public LogsArrayMapArithmeticSubProcessor(
      @JsonProperty(required = true, value = JSON_PROPERTY_EXPRESSION) String expression,
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGET) String target,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) LogsArithmeticProcessorType type) {
    this.expression = expression;
    this.target = target;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public LogsArrayMapArithmeticSubProcessor expression(String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * Arithmetic operation to perform.
   *
   * @return expression
   */
  @JsonProperty(JSON_PROPERTY_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  public LogsArrayMapArithmeticSubProcessor isReplaceMissing(Boolean isReplaceMissing) {
    this.isReplaceMissing = isReplaceMissing;
    return this;
  }

  /**
   * Replace missing attribute values with 0.
   *
   * @return isReplaceMissing
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_REPLACE_MISSING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsReplaceMissing() {
    return isReplaceMissing;
  }

  public void setIsReplaceMissing(Boolean isReplaceMissing) {
    this.isReplaceMissing = isReplaceMissing;
  }

  public LogsArrayMapArithmeticSubProcessor name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the sub-processor.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LogsArrayMapArithmeticSubProcessor target(String target) {
    this.target = target;
    return this;
  }

  /**
   * Target attribute path for the result.
   *
   * @return target
   */
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public LogsArrayMapArithmeticSubProcessor type(LogsArithmeticProcessorType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of logs arithmetic processor.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogsArithmeticProcessorType getType() {
    return type;
  }

  public void setType(LogsArithmeticProcessorType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return LogsArrayMapArithmeticSubProcessor
   */
  @JsonAnySetter
  public LogsArrayMapArithmeticSubProcessor putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LogsArrayMapArithmeticSubProcessor object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsArrayMapArithmeticSubProcessor logsArrayMapArithmeticSubProcessor =
        (LogsArrayMapArithmeticSubProcessor) o;
    return Objects.equals(this.expression, logsArrayMapArithmeticSubProcessor.expression)
        && Objects.equals(
            this.isReplaceMissing, logsArrayMapArithmeticSubProcessor.isReplaceMissing)
        && Objects.equals(this.name, logsArrayMapArithmeticSubProcessor.name)
        && Objects.equals(this.target, logsArrayMapArithmeticSubProcessor.target)
        && Objects.equals(this.type, logsArrayMapArithmeticSubProcessor.type)
        && Objects.equals(
            this.additionalProperties, logsArrayMapArithmeticSubProcessor.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expression, isReplaceMissing, name, target, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsArrayMapArithmeticSubProcessor {\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    isReplaceMissing: ").append(toIndentedString(isReplaceMissing)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
