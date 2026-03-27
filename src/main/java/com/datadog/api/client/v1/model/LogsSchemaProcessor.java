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
   * <p>A processor that has additional validations and checks for a given schema. Currently supported schema types include OCSF.</p>
 */
@JsonPropertyOrder({
  LogsSchemaProcessor.JSON_PROPERTY_IS_ENABLED,
  LogsSchemaProcessor.JSON_PROPERTY_MAPPERS,
  LogsSchemaProcessor.JSON_PROPERTY_NAME,
  LogsSchemaProcessor.JSON_PROPERTY_SCHEMA,
  LogsSchemaProcessor.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsSchemaProcessor {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
  private Boolean isEnabled = false;

  public static final String JSON_PROPERTY_MAPPERS = "mappers";
  private List<LogsSchemaMapper> mappers = new ArrayList<>();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SCHEMA = "schema";
  private LogsSchemaData schema;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LogsSchemaProcessorType type = LogsSchemaProcessorType.SCHEMA_PROCESSOR;

  public LogsSchemaProcessor() {}

  @JsonCreator
  public LogsSchemaProcessor(
            @JsonProperty(required=true, value=JSON_PROPERTY_MAPPERS)List<LogsSchemaMapper> mappers,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_SCHEMA)LogsSchemaData schema,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)LogsSchemaProcessorType type) {
        this.mappers = mappers;
        this.name = name;
        this.schema = schema;
        this.unparsed |= schema.unparsed;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public LogsSchemaProcessor isEnabled(Boolean isEnabled) {
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
  public LogsSchemaProcessor mappers(List<LogsSchemaMapper> mappers) {
    this.mappers = mappers;
    for (LogsSchemaMapper item : mappers) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public LogsSchemaProcessor addMappersItem(LogsSchemaMapper mappersItem) {
    this.mappers.add(mappersItem);
    this.unparsed |= mappersItem.unparsed;
    return this;
  }

  /**
   * <p>The <code>LogsSchemaProcessor</code> <code>mappers</code>.</p>
   * @return mappers
  **/
      @JsonProperty(JSON_PROPERTY_MAPPERS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<LogsSchemaMapper> getMappers() {
        return mappers;
      }
  public void setMappers(List<LogsSchemaMapper> mappers) {
    this.mappers = mappers;
  }
  public LogsSchemaProcessor name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name of the processor.</p>
   * @return name
  **/
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public LogsSchemaProcessor schema(LogsSchemaData schema) {
    this.schema = schema;
    this.unparsed |= schema.unparsed;
    return this;
  }

  /**
   * <p>Configuration of the schema data to use.</p>
   * @return schema
  **/
      @JsonProperty(JSON_PROPERTY_SCHEMA)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public LogsSchemaData getSchema() {
        return schema;
      }
  public void setSchema(LogsSchemaData schema) {
    this.schema = schema;
  }
  public LogsSchemaProcessor type(LogsSchemaProcessorType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Type of logs schema processor.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public LogsSchemaProcessorType getType() {
        return type;
      }
  public void setType(LogsSchemaProcessorType type) {
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
   * @return LogsSchemaProcessor
   */
  @JsonAnySetter
  public LogsSchemaProcessor putAdditionalProperty(String key, Object value) {
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
   * Return true if this LogsSchemaProcessor object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsSchemaProcessor logsSchemaProcessor = (LogsSchemaProcessor) o;
    return Objects.equals(this.isEnabled, logsSchemaProcessor.isEnabled) && Objects.equals(this.mappers, logsSchemaProcessor.mappers) && Objects.equals(this.name, logsSchemaProcessor.name) && Objects.equals(this.schema, logsSchemaProcessor.schema) && Objects.equals(this.type, logsSchemaProcessor.type) && Objects.equals(this.additionalProperties, logsSchemaProcessor.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(isEnabled,mappers,name,schema,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsSchemaProcessor {\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    mappers: ").append(toIndentedString(mappers)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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
