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
   * <p>Pipelines and processors operate on incoming logs,
   * parsing and transforming them into structured attributes for easier querying.</p>
   * <p><strong>Note</strong>: These endpoints are only available for admin users.
   * Make sure to use an application key created by an admin.</p>
 */
@JsonPropertyOrder({
  LogsPipeline.JSON_PROPERTY_DESCRIPTION,
  LogsPipeline.JSON_PROPERTY_FILTER,
  LogsPipeline.JSON_PROPERTY_ID,
  LogsPipeline.JSON_PROPERTY_IS_ENABLED,
  LogsPipeline.JSON_PROPERTY_IS_READ_ONLY,
  LogsPipeline.JSON_PROPERTY_NAME,
  LogsPipeline.JSON_PROPERTY_PROCESSORS,
  LogsPipeline.JSON_PROPERTY_TAGS,
  LogsPipeline.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsPipeline {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_FILTER = "filter";
  private LogsFilter filter;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
  private Boolean isEnabled;

  public static final String JSON_PROPERTY_IS_READ_ONLY = "is_read_only";
  private Boolean isReadOnly;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PROCESSORS = "processors";
  private List<LogsProcessor> processors = null;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public LogsPipeline() {}

  @JsonCreator
  public LogsPipeline(
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name) {
        this.name = name;
  }
  public LogsPipeline description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <p>A description of the pipeline.</p>
   * @return description
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DESCRIPTION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getDescription() {
        return description;
      }
  public void setDescription(String description) {
    this.description = description;
  }
  public LogsPipeline filter(LogsFilter filter) {
    this.filter = filter;
    this.unparsed |= filter.unparsed;
    return this;
  }

  /**
   * <p>Filter for logs.</p>
   * @return filter
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FILTER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public LogsFilter getFilter() {
        return filter;
      }
  public void setFilter(LogsFilter filter) {
    this.filter = filter;
  }

  /**
   * <p>ID of the pipeline.</p>
   * @return id
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getId() {
        return id;
      }
  public LogsPipeline isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * <p>Whether or not the pipeline is enabled.</p>
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

  /**
   * <p>Whether or not the pipeline can be edited.</p>
   * @return isReadOnly
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IS_READ_ONLY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getIsReadOnly() {
        return isReadOnly;
      }
  public LogsPipeline name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name of the pipeline.</p>
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
  public LogsPipeline processors(List<LogsProcessor> processors) {
    this.processors = processors;
    for (LogsProcessor item : processors) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public LogsPipeline addProcessorsItem(LogsProcessor processorsItem) {
    if (this.processors == null) {
      this.processors = new ArrayList<>();
    }
    this.processors.add(processorsItem);
    this.unparsed |= processorsItem.unparsed;
    return this;
  }

  /**
   * <p>Ordered list of processors in this pipeline.</p>
   * @return processors
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PROCESSORS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<LogsProcessor> getProcessors() {
        return processors;
      }
  public void setProcessors(List<LogsProcessor> processors) {
    this.processors = processors;
  }
  public LogsPipeline tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  public LogsPipeline addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * <p>A list of tags associated with the pipeline.</p>
   * @return tags
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getTags() {
        return tags;
      }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   * <p>Type of pipeline.</p>
   * @return type
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getType() {
        return type;
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
   * @return LogsPipeline
   */
  @JsonAnySetter
  public LogsPipeline putAdditionalProperty(String key, Object value) {
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
   * Return true if this LogsPipeline object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsPipeline logsPipeline = (LogsPipeline) o;
    return Objects.equals(this.description, logsPipeline.description) && Objects.equals(this.filter, logsPipeline.filter) && Objects.equals(this.id, logsPipeline.id) && Objects.equals(this.isEnabled, logsPipeline.isEnabled) && Objects.equals(this.isReadOnly, logsPipeline.isReadOnly) && Objects.equals(this.name, logsPipeline.name) && Objects.equals(this.processors, logsPipeline.processors) && Objects.equals(this.tags, logsPipeline.tags) && Objects.equals(this.type, logsPipeline.type) && Objects.equals(this.additionalProperties, logsPipeline.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(description,filter,id,isEnabled,isReadOnly,name,processors,tags,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsPipeline {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    isReadOnly: ").append(toIndentedString(isReadOnly)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    processors: ").append(toIndentedString(processors)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
