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
   * <p>Use the Arithmetic Processor to add a new attribute (without spaces or special characters
   * in the new attribute name) to a log with the result of the provided formula.
   * This enables you to remap different time attributes with different units into a single attribute,
   * or to compute operations on attributes within the same log.</p>
   * <p>The formula can use parentheses and the basic arithmetic operators <code>-</code>, <code>+</code>, <code>*</code>, <code>/</code>.</p>
   * <p>By default, the calculation is skipped if an attribute is missing.
   * Select “Replace missing attribute by 0” to automatically populate
   * missing attribute values with 0 to ensure that the calculation is done.
   * An attribute is missing if it is not found in the log attributes,
   * or if it cannot be converted to a number.</p>
   * <p><em>Notes</em>:</p>
   * <ul>
   * <li>The operator <code>-</code> needs to be space split in the formula as it can also be contained in attribute names.</li>
   * <li>If the target attribute already exists, it is overwritten by the result of the formula.</li>
   * <li>Results are rounded up to the 9th decimal. For example, if the result of the formula is <code>0.1234567891</code>,
   *   the actual value stored for the attribute is <code>0.123456789</code>.</li>
   * <li>If you need to scale a unit of measure,
   *   see <a href="https://docs.datadoghq.com/logs/log_configuration/parsing/?tab=filter#matcher-and-filter">Scale Filter</a>.</li>
   * </ul>
 */
@JsonPropertyOrder({
  LogsArithmeticProcessor.JSON_PROPERTY_EXPRESSION,
  LogsArithmeticProcessor.JSON_PROPERTY_IS_ENABLED,
  LogsArithmeticProcessor.JSON_PROPERTY_IS_REPLACE_MISSING,
  LogsArithmeticProcessor.JSON_PROPERTY_NAME,
  LogsArithmeticProcessor.JSON_PROPERTY_TARGET,
  LogsArithmeticProcessor.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsArithmeticProcessor {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_EXPRESSION = "expression";
  private String expression;

  public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
  private Boolean isEnabled = false;

  public static final String JSON_PROPERTY_IS_REPLACE_MISSING = "is_replace_missing";
  private Boolean isReplaceMissing = false;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TARGET = "target";
  private String target;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LogsArithmeticProcessorType type = LogsArithmeticProcessorType.ARITHMETIC_PROCESSOR;

  public LogsArithmeticProcessor() {}

  @JsonCreator
  public LogsArithmeticProcessor(
            @JsonProperty(required=true, value=JSON_PROPERTY_EXPRESSION)String expression,
            @JsonProperty(required=true, value=JSON_PROPERTY_TARGET)String target,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)LogsArithmeticProcessorType type) {
        this.expression = expression;
        this.target = target;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public LogsArithmeticProcessor expression(String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * <p>Arithmetic operation between one or more log attributes.</p>
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
  public LogsArithmeticProcessor isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * <p>Whether or not the processor is enabled.</p>
   * @return isEnabled
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IS_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getIsEnabled() {
        return isEnabled;
      }
  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }
  public LogsArithmeticProcessor isReplaceMissing(Boolean isReplaceMissing) {
    this.isReplaceMissing = isReplaceMissing;
    return this;
  }

  /**
   * <p>If <code>true</code>, it replaces all missing attributes of expression by <code>0</code>, <code>false</code>
   * skip the operation if an attribute is missing.</p>
   * @return isReplaceMissing
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IS_REPLACE_MISSING)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getIsReplaceMissing() {
        return isReplaceMissing;
      }
  public void setIsReplaceMissing(Boolean isReplaceMissing) {
    this.isReplaceMissing = isReplaceMissing;
  }
  public LogsArithmeticProcessor name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name of the processor.</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public LogsArithmeticProcessor target(String target) {
    this.target = target;
    return this;
  }

  /**
   * <p>Name of the attribute that contains the result of the arithmetic operation.</p>
   * @return target
  **/
      @JsonProperty(JSON_PROPERTY_TARGET)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getTarget() {
        return target;
      }
  public void setTarget(String target) {
    this.target = target;
  }
  public LogsArithmeticProcessor type(LogsArithmeticProcessorType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Type of logs arithmetic processor.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
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
   * @return LogsArithmeticProcessor
   */
  @JsonAnySetter
  public LogsArithmeticProcessor putAdditionalProperty(String key, Object value) {
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
   * Return true if this LogsArithmeticProcessor object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsArithmeticProcessor logsArithmeticProcessor = (LogsArithmeticProcessor) o;
    return Objects.equals(this.expression, logsArithmeticProcessor.expression) && Objects.equals(this.isEnabled, logsArithmeticProcessor.isEnabled) && Objects.equals(this.isReplaceMissing, logsArithmeticProcessor.isReplaceMissing) && Objects.equals(this.name, logsArithmeticProcessor.name) && Objects.equals(this.target, logsArithmeticProcessor.target) && Objects.equals(this.type, logsArithmeticProcessor.type) && Objects.equals(this.additionalProperties, logsArithmeticProcessor.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(expression,isEnabled,isReplaceMissing,name,target,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsArithmeticProcessor {\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
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
