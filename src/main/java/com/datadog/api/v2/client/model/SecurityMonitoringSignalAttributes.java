/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v2.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** The object containing all signal attributes and their associated values. */
@ApiModel(description = "The object containing all signal attributes and their associated values.")
@JsonPropertyOrder({
  SecurityMonitoringSignalAttributes.JSON_PROPERTY_ATTRIBUTES,
  SecurityMonitoringSignalAttributes.JSON_PROPERTY_MESSAGE,
  SecurityMonitoringSignalAttributes.JSON_PROPERTY_TAGS,
  SecurityMonitoringSignalAttributes.JSON_PROPERTY_TIMESTAMP
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SecurityMonitoringSignalAttributes {
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private Map<String, Object> attributes = null;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<Object> tags = null;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private OffsetDateTime timestamp;

  public SecurityMonitoringSignalAttributes attributes(Map<String, Object> attributes) {
    this.attributes = attributes;
    return this;
  }

  public SecurityMonitoringSignalAttributes putAttributesItem(String key, Object attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

  /**
   * A JSON object of attributes in the security signal.
   *
   * @return attributes
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      example =
          "{\"workflow\":{\"first_seen\":\"2020-06-23T14:46:01.000Z\",\"last_seen\":\"2020-06-23T14:46:49.000Z\",\"rule\":{\"id\":\"0f5-e0c-805\",\"name\":\"Brute"
              + " Force Attack Grouped By User \",\"version\":12}}}",
      value = "A JSON object of attributes in the security signal.")
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }

  public SecurityMonitoringSignalAttributes message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The message in the security signal defined by the rule that generated the signal.
   *
   * @return message
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      example = "Detect Account Take Over (ATO) through brute force attempts",
      value = "The message in the security signal defined by the rule that generated the signal.")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public SecurityMonitoringSignalAttributes tags(List<Object> tags) {
    this.tags = tags;
    return this;
  }

  public SecurityMonitoringSignalAttributes addTagsItem(Object tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * An array of tags associated with the security signal.
   *
   * @return tags
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      example = "[\"security:attack\",\"technique:T1110-brute-force\"]",
      value = "An array of tags associated with the security signal.")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Object> getTags() {
    return tags;
  }

  public void setTags(List<Object> tags) {
    this.tags = tags;
  }

  public SecurityMonitoringSignalAttributes timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * The timestamp of the security signal.
   *
   * @return timestamp
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      example = "2019-01-02T09:42:36.320Z",
      value = "The timestamp of the security signal.")
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  /** Return true if this SecurityMonitoringSignal_attributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringSignalAttributes securityMonitoringSignalAttributes =
        (SecurityMonitoringSignalAttributes) o;
    return Objects.equals(this.attributes, securityMonitoringSignalAttributes.attributes)
        && Objects.equals(this.message, securityMonitoringSignalAttributes.message)
        && Objects.equals(this.tags, securityMonitoringSignalAttributes.tags)
        && Objects.equals(this.timestamp, securityMonitoringSignalAttributes.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, message, tags, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringSignalAttributes {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
