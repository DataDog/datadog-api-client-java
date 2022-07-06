/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.datadog.api.client.JsonTimeSerializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** JSON object containing all log attributes and their associated values. */
@JsonPropertyOrder({
  LogContent.JSON_PROPERTY_ATTRIBUTES,
  LogContent.JSON_PROPERTY_HOST,
  LogContent.JSON_PROPERTY_MESSAGE,
  LogContent.JSON_PROPERTY_SERVICE,
  LogContent.JSON_PROPERTY_TAGS,
  LogContent.JSON_PROPERTY_TIMESTAMP
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogContent {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private Map<String, Object> attributes = null;

  public static final String JSON_PROPERTY_HOST = "host";
  private String host;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime timestamp;

  public LogContent attributes(Map<String, Object> attributes) {
    this.attributes = attributes;
    return this;
  }

  public LogContent putAttributesItem(String key, Object attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

  /**
   * JSON object of attributes from your log.
   *
   * @return attributes
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }

  public LogContent host(String host) {
    this.host = host;
    return this;
  }

  /**
   * Name of the machine from where the logs are being sent.
   *
   * @return host
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public LogContent message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The message <a
   * href="https://docs.datadoghq.com/logs/log_collection/#reserved-attributes">reserved
   * attribute</a> of your log. By default, Datadog ingests the value of the message attribute as
   * the body of the log entry. That value is then highlighted and displayed in the Logstream, where
   * it is indexed for full text search.
   *
   * @return message
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public LogContent service(String service) {
    this.service = service;
    return this;
  }

  /**
   * The name of the application or service generating the log events. It is used to switch from
   * Logs to APM, so make sure you define the same value when you use both products.
   *
   * @return service
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public LogContent tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public LogContent addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Array of tags associated with your log.
   *
   * @return tags
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public LogContent timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Timestamp of your log.
   *
   * @return timestamp
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  /** Return true if this LogContent object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogContent logContent = (LogContent) o;
    return Objects.equals(this.attributes, logContent.attributes)
        && Objects.equals(this.host, logContent.host)
        && Objects.equals(this.message, logContent.message)
        && Objects.equals(this.service, logContent.service)
        && Objects.equals(this.tags, logContent.tags)
        && Objects.equals(this.timestamp, logContent.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, host, message, service, tags, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogContent {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("}");
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
