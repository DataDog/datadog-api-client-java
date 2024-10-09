/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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

/** Object representing a change event. */
@JsonPropertyOrder({
  ChangeEvent.JSON_PROPERTY_AGGREGATION_KEY,
  ChangeEvent.JSON_PROPERTY_ATTRIBUTES,
  ChangeEvent.JSON_PROPERTY_CATEGORY,
  ChangeEvent.JSON_PROPERTY_MESSAGE,
  ChangeEvent.JSON_PROPERTY_TAGS,
  ChangeEvent.JSON_PROPERTY_TIMESTAMP,
  ChangeEvent.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ChangeEvent {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION_KEY = "aggregation_key";
  private String aggregationKey;

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private ChangeEventCustomAttributes attributes;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private ChangeEventCategory category;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private String timestamp;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public ChangeEvent() {}

  @JsonCreator
  public ChangeEvent(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          ChangeEventCustomAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_CATEGORY) ChangeEventCategory category,
      @JsonProperty(required = true, value = JSON_PROPERTY_TITLE) String title) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.category = category;
    this.unparsed |= !category.isValid();
    this.title = title;
  }

  public ChangeEvent aggregationKey(String aggregationKey) {
    this.aggregationKey = aggregationKey;
    return this;
  }

  /**
   * An arbitrary string to use for aggregation. Limited to 100 characters. If you specify a key,
   * all events using that key are grouped together in the Event Stream.
   *
   * @return aggregationKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGGREGATION_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAggregationKey() {
    return aggregationKey;
  }

  public void setAggregationKey(String aggregationKey) {
    this.aggregationKey = aggregationKey;
  }

  public ChangeEvent attributes(ChangeEventCustomAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Object representing custom event attributes required for Change events. The overall object
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ChangeEventCustomAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(ChangeEventCustomAttributes attributes) {
    this.attributes = attributes;
  }

  public ChangeEvent category(ChangeEventCategory category) {
    this.category = category;
    this.unparsed |= !category.isValid();
    return this;
  }

  /**
   * Event category to identify the type of event. Currently only <code>change</code> value is
   * supported.
   *
   * @return category
   */
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ChangeEventCategory getCategory() {
    return category;
  }

  public void setCategory(ChangeEventCategory category) {
    if (!category.isValid()) {
      this.unparsed = true;
    }
    this.category = category;
  }

  public ChangeEvent message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The body of the event. Limited to 4000 characters. The text supports markdown.
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

  public ChangeEvent tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ChangeEvent addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * A list of tags to apply to the event.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public ChangeEvent timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Timestamp in which the event occurred. Must follow <a
   * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format. Defaults to
   * now. Limited to events no older than 18 hours.
   *
   * @return timestamp
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public ChangeEvent title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The event title. Limited to 500 characters.
   *
   * @return title
   */
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
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
   * @return ChangeEvent
   */
  @JsonAnySetter
  public ChangeEvent putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ChangeEvent object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeEvent changeEvent = (ChangeEvent) o;
    return Objects.equals(this.aggregationKey, changeEvent.aggregationKey)
        && Objects.equals(this.attributes, changeEvent.attributes)
        && Objects.equals(this.category, changeEvent.category)
        && Objects.equals(this.message, changeEvent.message)
        && Objects.equals(this.tags, changeEvent.tags)
        && Objects.equals(this.timestamp, changeEvent.timestamp)
        && Objects.equals(this.title, changeEvent.title)
        && Objects.equals(this.additionalProperties, changeEvent.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        aggregationKey,
        attributes,
        category,
        message,
        tags,
        timestamp,
        title,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeEvent {\n");
    sb.append("    aggregationKey: ").append(toIndentedString(aggregationKey)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
