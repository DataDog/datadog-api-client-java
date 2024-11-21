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

/** Event attributes. */
@JsonPropertyOrder({
  EventPayload.JSON_PROPERTY_AGGREGATION_KEY,
  EventPayload.JSON_PROPERTY_ATTRIBUTES,
  EventPayload.JSON_PROPERTY_CATEGORY,
  EventPayload.JSON_PROPERTY_MESSAGE,
  EventPayload.JSON_PROPERTY_TAGS,
  EventPayload.JSON_PROPERTY_TIMESTAMP,
  EventPayload.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EventPayload {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION_KEY = "aggregation_key";
  private String aggregationKey;

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private EventPayloadAttributes attributes;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private EventCategory category;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private String timestamp;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public EventPayload() {}

  @JsonCreator
  public EventPayload(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          EventPayloadAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_CATEGORY) EventCategory category,
      @JsonProperty(required = true, value = JSON_PROPERTY_TITLE) String title) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.category = category;
    this.unparsed |= !category.isValid();
    this.title = title;
  }

  public EventPayload aggregationKey(String aggregationKey) {
    this.aggregationKey = aggregationKey;
    return this;
  }

  /**
   * An arbitrary string to use for aggregation when correlating events. Limited to 100 characters.
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

  public EventPayload attributes(EventPayloadAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * JSON object for custom attributes. Schema are different per each event category.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public EventPayloadAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(EventPayloadAttributes attributes) {
    this.attributes = attributes;
  }

  public EventPayload category(EventCategory category) {
    this.category = category;
    this.unparsed |= !category.isValid();
    return this;
  }

  /**
   * Event category to identify the type of event. Only the value <code>change</code> is supported.
   * Support for other categories are coming. please reach out to datadog support if you're
   * interested.
   *
   * @return category
   */
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public EventCategory getCategory() {
    return category;
  }

  public void setCategory(EventCategory category) {
    if (!category.isValid()) {
      this.unparsed = true;
    }
    this.category = category;
  }

  public EventPayload message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The body of the event. Limited to 4000 characters.
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

  public EventPayload tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public EventPayload addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * A list of tags to apply to the event. Refer to <a
   * href="https://docs.datadoghq.com/getting_started/tagging/">Tags docs</a>.
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

  public EventPayload timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Timestamp when the event occurred. Must follow <a
   * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format. For example
   * <code>"2017-01-15T01:30:15.010000Z"</code>. Defaults to the timestamp of receipt. Limited to
   * values no older than 18 hours.
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

  public EventPayload title(String title) {
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
   * @return EventPayload
   */
  @JsonAnySetter
  public EventPayload putAdditionalProperty(String key, Object value) {
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

  /** Return true if this EventPayload object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventPayload eventPayload = (EventPayload) o;
    return Objects.equals(this.aggregationKey, eventPayload.aggregationKey)
        && Objects.equals(this.attributes, eventPayload.attributes)
        && Objects.equals(this.category, eventPayload.category)
        && Objects.equals(this.message, eventPayload.message)
        && Objects.equals(this.tags, eventPayload.tags)
        && Objects.equals(this.timestamp, eventPayload.timestamp)
        && Objects.equals(this.title, eventPayload.title)
        && Objects.equals(this.additionalProperties, eventPayload.additionalProperties);
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
    sb.append("class EventPayload {\n");
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
