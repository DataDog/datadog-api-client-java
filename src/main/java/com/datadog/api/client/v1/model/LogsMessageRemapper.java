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
   * <p>The message is a key attribute in Datadog.
   * It is displayed in the message column of the Log Explorer and you can do full string search on it.
   * Use this Processor to define one or more attributes as the official log message.</p>
   * <p><strong>Note:</strong> If multiple log message remapper processors can be applied to a given log,
   * only the first one (according to the pipeline order) is taken into account.</p>
 */
@JsonPropertyOrder({
  LogsMessageRemapper.JSON_PROPERTY_IS_ENABLED,
  LogsMessageRemapper.JSON_PROPERTY_NAME,
  LogsMessageRemapper.JSON_PROPERTY_SOURCES,
  LogsMessageRemapper.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsMessageRemapper {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
  private Boolean isEnabled = false;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SOURCES = "sources";
  private List<String> sources = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private LogsMessageRemapperType type = LogsMessageRemapperType.MESSAGE_REMAPPER;

  public LogsMessageRemapper() {}

  @JsonCreator
  public LogsMessageRemapper(
            @JsonProperty(required=true, value=JSON_PROPERTY_SOURCES)List<String> sources,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)LogsMessageRemapperType type) {
        this.sources = sources;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public LogsMessageRemapper isEnabled(Boolean isEnabled) {
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
  public LogsMessageRemapper name(String name) {
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
  public LogsMessageRemapper sources(List<String> sources) {
    this.sources = sources;
    return this;
  }
  public LogsMessageRemapper addSourcesItem(String sourcesItem) {
    this.sources.add(sourcesItem);
    return this;
  }

  /**
   * <p>Array of source attributes.</p>
   * @return sources
  **/
      @JsonProperty(JSON_PROPERTY_SOURCES)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<String> getSources() {
        return sources;
      }
  public void setSources(List<String> sources) {
    this.sources = sources;
  }
  public LogsMessageRemapper type(LogsMessageRemapperType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Type of logs message remapper.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public LogsMessageRemapperType getType() {
        return type;
      }
  public void setType(LogsMessageRemapperType type) {
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
   * @return LogsMessageRemapper
   */
  @JsonAnySetter
  public LogsMessageRemapper putAdditionalProperty(String key, Object value) {
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
   * Return true if this LogsMessageRemapper object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsMessageRemapper logsMessageRemapper = (LogsMessageRemapper) o;
    return Objects.equals(this.isEnabled, logsMessageRemapper.isEnabled) && Objects.equals(this.name, logsMessageRemapper.name) && Objects.equals(this.sources, logsMessageRemapper.sources) && Objects.equals(this.type, logsMessageRemapper.type) && Objects.equals(this.additionalProperties, logsMessageRemapper.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(isEnabled,name,sources,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsMessageRemapper {\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
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
