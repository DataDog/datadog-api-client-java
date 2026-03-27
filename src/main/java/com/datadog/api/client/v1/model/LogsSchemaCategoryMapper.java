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
   * <p>Use the Schema Category Mapper to categorize log event into enum fields.
   * In the case of OCSF, they can be used to map sibling fields which are composed of an ID and a name.</p>
   * <p><strong>Notes</strong>:</p>
   * <ul>
   * <li>The syntax of the query is the one of Logs Explorer search bar.
   *   The query can be done on any log attribute or tag, whether it is a facet or not.
   *   Wildcards can also be used inside your query.</li>
   * <li>Categories are executed in order and processing stops at the first match.
   *   Make sure categories are properly ordered in case a log could match multiple queries.</li>
   * <li>Sibling fields always have a numerical ID field and a human-readable string name.</li>
   * <li>A fallback section handles cases where the name or ID value matches a specific value.
   *   If the name matches "Other" or the ID matches 99, the value of the sibling name field will be pulled from a source field from the original log.</li>
   * </ul>
 */
@JsonPropertyOrder({
  LogsSchemaCategoryMapper.JSON_PROPERTY_CATEGORIES,
  LogsSchemaCategoryMapper.JSON_PROPERTY_FALLBACK,
  LogsSchemaCategoryMapper.JSON_PROPERTY_NAME,
  LogsSchemaCategoryMapper.JSON_PROPERTY_TARGETS,
  LogsSchemaCategoryMapper.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsSchemaCategoryMapper {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CATEGORIES = "categories";
  private List<LogsSchemaCategoryMapperCategory> categories = new ArrayList<>();

  public static final String JSON_PROPERTY_FALLBACK = "fallback";
  private LogsSchemaCategoryMapperFallback fallback;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TARGETS = "targets";
  private LogsSchemaCategoryMapperTargets targets;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LogsSchemaCategoryMapperType type;

  public LogsSchemaCategoryMapper() {}

  @JsonCreator
  public LogsSchemaCategoryMapper(
            @JsonProperty(required=true, value=JSON_PROPERTY_CATEGORIES)List<LogsSchemaCategoryMapperCategory> categories,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_TARGETS)LogsSchemaCategoryMapperTargets targets,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)LogsSchemaCategoryMapperType type) {
        this.categories = categories;
        this.name = name;
        this.targets = targets;
        this.unparsed |= targets.unparsed;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public LogsSchemaCategoryMapper categories(List<LogsSchemaCategoryMapperCategory> categories) {
    this.categories = categories;
    for (LogsSchemaCategoryMapperCategory item : categories) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public LogsSchemaCategoryMapper addCategoriesItem(LogsSchemaCategoryMapperCategory categoriesItem) {
    this.categories.add(categoriesItem);
    this.unparsed |= categoriesItem.unparsed;
    return this;
  }

  /**
   * <p>Array of filters to match or not a log and their
   * corresponding <code>name</code> to assign a custom value to the log.</p>
   * @return categories
  **/
      @JsonProperty(JSON_PROPERTY_CATEGORIES)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<LogsSchemaCategoryMapperCategory> getCategories() {
        return categories;
      }
  public void setCategories(List<LogsSchemaCategoryMapperCategory> categories) {
    this.categories = categories;
  }
  public LogsSchemaCategoryMapper fallback(LogsSchemaCategoryMapperFallback fallback) {
    this.fallback = fallback;
    this.unparsed |= fallback.unparsed;
    return this;
  }

  /**
   * <p>Used to override hardcoded category values with a value pulled from a source attribute on the log.</p>
   * @return fallback
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FALLBACK)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public LogsSchemaCategoryMapperFallback getFallback() {
        return fallback;
      }
  public void setFallback(LogsSchemaCategoryMapperFallback fallback) {
    this.fallback = fallback;
  }
  public LogsSchemaCategoryMapper name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name of the logs schema category mapper.</p>
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
  public LogsSchemaCategoryMapper targets(LogsSchemaCategoryMapperTargets targets) {
    this.targets = targets;
    this.unparsed |= targets.unparsed;
    return this;
  }

  /**
   * <p>Name of the target attributes which value is defined by the matching category.</p>
   * @return targets
  **/
      @JsonProperty(JSON_PROPERTY_TARGETS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public LogsSchemaCategoryMapperTargets getTargets() {
        return targets;
      }
  public void setTargets(LogsSchemaCategoryMapperTargets targets) {
    this.targets = targets;
  }
  public LogsSchemaCategoryMapper type(LogsSchemaCategoryMapperType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Type of logs schema category mapper.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public LogsSchemaCategoryMapperType getType() {
        return type;
      }
  public void setType(LogsSchemaCategoryMapperType type) {
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
   * @return LogsSchemaCategoryMapper
   */
  @JsonAnySetter
  public LogsSchemaCategoryMapper putAdditionalProperty(String key, Object value) {
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
   * Return true if this LogsSchemaCategoryMapper object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsSchemaCategoryMapper logsSchemaCategoryMapper = (LogsSchemaCategoryMapper) o;
    return Objects.equals(this.categories, logsSchemaCategoryMapper.categories) && Objects.equals(this.fallback, logsSchemaCategoryMapper.fallback) && Objects.equals(this.name, logsSchemaCategoryMapper.name) && Objects.equals(this.targets, logsSchemaCategoryMapper.targets) && Objects.equals(this.type, logsSchemaCategoryMapper.type) && Objects.equals(this.additionalProperties, logsSchemaCategoryMapper.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(categories,fallback,name,targets,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsSchemaCategoryMapper {\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    fallback: ").append(toIndentedString(fallback)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
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
