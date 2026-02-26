/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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
   * <p>Event attributes.</p>
 */
@JsonPropertyOrder({
  EventPayload.JSON_PROPERTY_AGGREGATION_KEY,
  EventPayload.JSON_PROPERTY_ATTRIBUTES,
  EventPayload.JSON_PROPERTY_CATEGORY,
  EventPayload.JSON_PROPERTY_HOST,
  EventPayload.JSON_PROPERTY_INTEGRATION_ID,
  EventPayload.JSON_PROPERTY_MESSAGE,
  EventPayload.JSON_PROPERTY_TAGS,
  EventPayload.JSON_PROPERTY_TIMESTAMP,
  EventPayload.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EventPayload {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION_KEY = "aggregation_key";
  private String aggregationKey;

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private EventPayloadAttributes attributes;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private EventCategory category;

  public static final String JSON_PROPERTY_HOST = "host";
  private String host;

  public static final String JSON_PROPERTY_INTEGRATION_ID = "integration_id";
  private EventPayloadIntegrationId integrationId;

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
            @JsonProperty(required=true, value=JSON_PROPERTY_ATTRIBUTES)EventPayloadAttributes attributes,
            @JsonProperty(required=true, value=JSON_PROPERTY_CATEGORY)EventCategory category,
            @JsonProperty(required=true, value=JSON_PROPERTY_TITLE)String title) {
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
   * <p>A string used for aggregation when <a href="https://docs.datadoghq.com/service_management/events/correlation/">correlating</a> events. If you specify a key, events are deduplicated to alerts based on this key. Limited to 100 characters.</p>
   * @return aggregationKey
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AGGREGATION_KEY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>JSON object for category-specific attributes. Schema is different per event category.</p>
   * @return attributes
  **/
      @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
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
   * <p>Event category identifying the type of event.</p>
   * @return category
  **/
      @JsonProperty(JSON_PROPERTY_CATEGORY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public EventCategory getCategory() {
        return category;
      }
  public void setCategory(EventCategory category) {
    if (!category.isValid()) {
        this.unparsed = true;
    }
    this.category = category;
  }
  public EventPayload host(String host) {
    this.host = host;
    return this;
  }

  /**
   * <p>Host name to associate with the event. Any tags associated with the host are also applied to this event. Limited to 255 characters.</p>
   * @return host
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HOST)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getHost() {
        return host;
      }
  public void setHost(String host) {
    this.host = host;
  }
  public EventPayload integrationId(EventPayloadIntegrationId integrationId) {
    this.integrationId = integrationId;
    this.unparsed |= !integrationId.isValid();
    return this;
  }

  /**
   * <p>Integration ID sourced from integration manifests.</p>
   * @return integrationId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INTEGRATION_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public EventPayloadIntegrationId getIntegrationId() {
        return integrationId;
      }
  public void setIntegrationId(EventPayloadIntegrationId integrationId) {
    if (!integrationId.isValid()) {
        this.unparsed = true;
    }
    this.integrationId = integrationId;
  }
  public EventPayload message(String message) {
    this.message = message;
    return this;
  }

  /**
   * <p>Free formed text associated with the event. It's suggested to use <code>data.attributes.attributes.custom</code> for well-structured attributes. Limited to 4000 characters.</p>
   * @return message
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MESSAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>A list of tags associated with the event. Maximum of 100 tags allowed.
   * Refer to <a href="https://docs.datadoghq.com/getting_started/tagging/">Tags docs</a>.</p>
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
  public EventPayload timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * <p>Timestamp when the event occurred. Must follow <a href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format.
   * For example <code>"2017-01-15T01:30:15.010000Z"</code>.
   * Defaults to the timestamp of receipt. Limited to values no older than 18 hours.</p>
   * @return timestamp
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TIMESTAMP)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>The title of the event. Limited to 500 characters.</p>
   * @return title
  **/
      @JsonProperty(JSON_PROPERTY_TITLE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getTitle() {
        return title;
      }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Return true if this EventPayload object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventPayload eventPayload = (EventPayload) o;
    return Objects.equals(this.aggregationKey, eventPayload.aggregationKey) && Objects.equals(this.attributes, eventPayload.attributes) && Objects.equals(this.category, eventPayload.category) && Objects.equals(this.host, eventPayload.host) && Objects.equals(this.integrationId, eventPayload.integrationId) && Objects.equals(this.message, eventPayload.message) && Objects.equals(this.tags, eventPayload.tags) && Objects.equals(this.timestamp, eventPayload.timestamp) && Objects.equals(this.title, eventPayload.title);
  }


  @Override
  public int hashCode() {
    return Objects.hash(aggregationKey,attributes,category,host,integrationId,message,tags,timestamp,title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventPayload {\n");
    sb.append("    aggregationKey: ").append(toIndentedString(aggregationKey)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
