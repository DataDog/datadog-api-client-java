/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Attributes to update on a Product Analytics monitor. Fields that are not set are left unchanged.
 * When set, <code>options</code> or <code>tags</code> replaces the stored value.
 */
@JsonPropertyOrder({
  ProductAnalyticsMonitorUpdateAttributes.JSON_PROPERTY_MESSAGE,
  ProductAnalyticsMonitorUpdateAttributes.JSON_PROPERTY_NAME,
  ProductAnalyticsMonitorUpdateAttributes.JSON_PROPERTY_OPTIONS,
  ProductAnalyticsMonitorUpdateAttributes.JSON_PROPERTY_PRIORITY,
  ProductAnalyticsMonitorUpdateAttributes.JSON_PROPERTY_QUERY,
  ProductAnalyticsMonitorUpdateAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsMonitorUpdateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private ProductAnalyticsMonitorOptions options;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private Integer priority;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Map<String, String> tags = null;

  public ProductAnalyticsMonitorUpdateAttributes message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Notification message sent when the monitor alerts.
   *
   * @return message
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ProductAnalyticsMonitorUpdateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the monitor.
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

  public ProductAnalyticsMonitorUpdateAttributes options(ProductAnalyticsMonitorOptions options) {
    this.options = options;
    this.unparsed |= options.unparsed;
    return this;
  }

  /**
   * Options of a Product Analytics monitor.
   *
   * @return options
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProductAnalyticsMonitorOptions getOptions() {
    return options;
  }

  public void setOptions(ProductAnalyticsMonitorOptions options) {
    this.options = options;
    if (options != null) {
      this.unparsed |= options.unparsed;
    }
  }

  public ProductAnalyticsMonitorUpdateAttributes priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Priority of the monitor, from 1 (highest) to 5 (lowest). minimum: 1 maximum: 5
   *
   * @return priority
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public ProductAnalyticsMonitorUpdateAttributes query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Monitor query.
   *
   * @return query
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public ProductAnalyticsMonitorUpdateAttributes tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public ProductAnalyticsMonitorUpdateAttributes putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

  /**
   * Monitor tags as key and value pairs. Each pair is stored as a <code>key:value</code> tag.
   * <code>chart_id</code> and <code>dashboard_id</code> link the monitor to the chart it was
   * created from. <code>dashboard_id</code> requires <code>chart_id</code>.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getTags() {
    return tags;
  }

  public void setTags(Map<String, String> tags) {
    this.tags = tags;
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
   * @return ProductAnalyticsMonitorUpdateAttributes
   */
  @JsonAnySetter
  public ProductAnalyticsMonitorUpdateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductAnalyticsMonitorUpdateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsMonitorUpdateAttributes productAnalyticsMonitorUpdateAttributes =
        (ProductAnalyticsMonitorUpdateAttributes) o;
    return Objects.equals(this.message, productAnalyticsMonitorUpdateAttributes.message)
        && Objects.equals(this.name, productAnalyticsMonitorUpdateAttributes.name)
        && Objects.equals(this.options, productAnalyticsMonitorUpdateAttributes.options)
        && Objects.equals(this.priority, productAnalyticsMonitorUpdateAttributes.priority)
        && Objects.equals(this.query, productAnalyticsMonitorUpdateAttributes.query)
        && Objects.equals(this.tags, productAnalyticsMonitorUpdateAttributes.tags)
        && Objects.equals(
            this.additionalProperties,
            productAnalyticsMonitorUpdateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, name, options, priority, query, tags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsMonitorUpdateAttributes {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
