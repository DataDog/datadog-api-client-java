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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Use the Category Processor to add a new attribute (without spaces or special characters in the
 * new attribute name) to a log matching a provided search query. Use categories to create groups
 * for an analytical view. For example, URL groups, machine groups, environments, and response time
 * buckets.
 *
 * <p><strong>Notes</strong>:
 *
 * <ul>
 *   <li>The syntax of the query is the one of Logs Explorer search bar. The query can be done on
 *       any log attribute or tag, whether it is a facet or not. Wildcards can also be used inside
 *       your query.
 *   <li>Once the log has matched one of the Processor queries, it stops. Make sure they are
 *       properly ordered in case a log could match several queries.
 *   <li>The names of the categories must be unique.
 *   <li>Once defined in the Category Processor, you can map categories to log status using the Log
 *       Status Remapper.
 * </ul>
 */
@JsonPropertyOrder({
  LogsCategoryProcessor.JSON_PROPERTY_CATEGORIES,
  LogsCategoryProcessor.JSON_PROPERTY_IS_ENABLED,
  LogsCategoryProcessor.JSON_PROPERTY_NAME,
  LogsCategoryProcessor.JSON_PROPERTY_TARGET,
  LogsCategoryProcessor.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsCategoryProcessor {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CATEGORIES = "categories";
  private List<LogsCategoryProcessorCategory> categories = new ArrayList<>();

  public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
  private Boolean isEnabled = false;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TARGET = "target";
  private String target;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LogsCategoryProcessorType type = LogsCategoryProcessorType.CATEGORY_PROCESSOR;

  public LogsCategoryProcessor() {}

  @JsonCreator
  public LogsCategoryProcessor(
      @JsonProperty(required = true, value = JSON_PROPERTY_CATEGORIES)
          List<LogsCategoryProcessorCategory> categories,
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGET) String target,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) LogsCategoryProcessorType type) {
    this.categories = categories;
    this.target = target;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public LogsCategoryProcessor categories(List<LogsCategoryProcessorCategory> categories) {
    this.categories = categories;
    for (LogsCategoryProcessorCategory item : categories) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LogsCategoryProcessor addCategoriesItem(LogsCategoryProcessorCategory categoriesItem) {
    this.categories.add(categoriesItem);
    this.unparsed |= categoriesItem.unparsed;
    return this;
  }

  /**
   * Array of filters to match or not a log and their corresponding <code>name</code> to assign a
   * custom value to the log.
   *
   * @return categories
   */
  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<LogsCategoryProcessorCategory> getCategories() {
    return categories;
  }

  public void setCategories(List<LogsCategoryProcessorCategory> categories) {
    this.categories = categories;
  }

  public LogsCategoryProcessor isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * Whether or not the processor is enabled.
   *
   * @return isEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public LogsCategoryProcessor name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the processor.
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

  public LogsCategoryProcessor target(String target) {
    this.target = target;
    return this;
  }

  /**
   * Name of the target attribute which value is defined by the matching category.
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

  public LogsCategoryProcessor type(LogsCategoryProcessorType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of logs category processor.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogsCategoryProcessorType getType() {
    return type;
  }

  public void setType(LogsCategoryProcessorType type) {
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
   * @return LogsCategoryProcessor
   */
  @JsonAnySetter
  public LogsCategoryProcessor putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LogsCategoryProcessor object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsCategoryProcessor logsCategoryProcessor = (LogsCategoryProcessor) o;
    return Objects.equals(this.categories, logsCategoryProcessor.categories)
        && Objects.equals(this.isEnabled, logsCategoryProcessor.isEnabled)
        && Objects.equals(this.name, logsCategoryProcessor.name)
        && Objects.equals(this.target, logsCategoryProcessor.target)
        && Objects.equals(this.type, logsCategoryProcessor.type)
        && Objects.equals(this.additionalProperties, logsCategoryProcessor.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categories, isEnabled, name, target, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsCategoryProcessor {\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
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
