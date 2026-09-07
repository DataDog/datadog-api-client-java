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
   * <p>A string builder sub-processor for use inside an array-map processor.
   * Unlike the top-level string builder processor, <code>is_enabled</code> is not supported.</p>
 */
@JsonPropertyOrder({
  LogsArrayMapStringBuilderSubProcessor.JSON_PROPERTY_IS_REPLACE_MISSING,
  LogsArrayMapStringBuilderSubProcessor.JSON_PROPERTY_NAME,
  LogsArrayMapStringBuilderSubProcessor.JSON_PROPERTY_TARGET,
  LogsArrayMapStringBuilderSubProcessor.JSON_PROPERTY_TEMPLATE,
  LogsArrayMapStringBuilderSubProcessor.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsArrayMapStringBuilderSubProcessor {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_IS_REPLACE_MISSING = "is_replace_missing";
  private Boolean isReplaceMissing = false;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TARGET = "target";
  private String target;

  public static final String JSON_PROPERTY_TEMPLATE = "template";
  private String template;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LogsStringBuilderProcessorType type = LogsStringBuilderProcessorType.STRING_BUILDER_PROCESSOR;

  public LogsArrayMapStringBuilderSubProcessor() {}

  @JsonCreator
  public LogsArrayMapStringBuilderSubProcessor(
            @JsonProperty(required=true, value=JSON_PROPERTY_TARGET)String target,
            @JsonProperty(required=true, value=JSON_PROPERTY_TEMPLATE)String template,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)LogsStringBuilderProcessorType type) {
        this.target = target;
        this.template = template;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public LogsArrayMapStringBuilderSubProcessor isReplaceMissing(Boolean isReplaceMissing) {
    this.isReplaceMissing = isReplaceMissing;
    return this;
  }

  /**
   * <p>Replace missing attribute values with an empty string.</p>
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
  public LogsArrayMapStringBuilderSubProcessor name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name of the sub-processor.</p>
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
  public LogsArrayMapStringBuilderSubProcessor target(String target) {
    this.target = target;
    return this;
  }

  /**
   * <p>Target attribute path for the result.</p>
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
  public LogsArrayMapStringBuilderSubProcessor template(String template) {
    this.template = template;
    return this;
  }

  /**
   * <p>Formula with one or more attributes and raw text.</p>
   * @return template
  **/
      @JsonProperty(JSON_PROPERTY_TEMPLATE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getTemplate() {
        return template;
      }
  public void setTemplate(String template) {
    this.template = template;
  }
  public LogsArrayMapStringBuilderSubProcessor type(LogsStringBuilderProcessorType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Type of logs string builder processor.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public LogsStringBuilderProcessorType getType() {
        return type;
      }
  public void setType(LogsStringBuilderProcessorType type) {
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
   * @return LogsArrayMapStringBuilderSubProcessor
   */
  @JsonAnySetter
  public LogsArrayMapStringBuilderSubProcessor putAdditionalProperty(String key, Object value) {
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
   * Return true if this LogsArrayMapStringBuilderSubProcessor object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsArrayMapStringBuilderSubProcessor logsArrayMapStringBuilderSubProcessor = (LogsArrayMapStringBuilderSubProcessor) o;
    return Objects.equals(this.isReplaceMissing, logsArrayMapStringBuilderSubProcessor.isReplaceMissing) && Objects.equals(this.name, logsArrayMapStringBuilderSubProcessor.name) && Objects.equals(this.target, logsArrayMapStringBuilderSubProcessor.target) && Objects.equals(this.template, logsArrayMapStringBuilderSubProcessor.template) && Objects.equals(this.type, logsArrayMapStringBuilderSubProcessor.type) && Objects.equals(this.additionalProperties, logsArrayMapStringBuilderSubProcessor.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(isReplaceMissing,name,target,template,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsArrayMapStringBuilderSubProcessor {\n");
    sb.append("    isReplaceMissing: ").append(toIndentedString(isReplaceMissing)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
