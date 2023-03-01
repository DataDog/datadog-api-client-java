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
   * <p>JSON object containing all event attributes and their associated values.</p>
 */
@JsonPropertyOrder({
  CIAppEventAttributes.JSON_PROPERTY_ATTRIBUTES,
  CIAppEventAttributes.JSON_PROPERTY_SERVICE,
  CIAppEventAttributes.JSON_PROPERTY_TAGS,
  CIAppEventAttributes.JSON_PROPERTY_TIMESTAMP
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CIAppEventAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private Map<String, Object> attributes = null;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime timestamp;

  public CIAppEventAttributes attributes(Map<String, Object> attributes) {
    this.attributes = attributes;
    return this;
  }
  public CIAppEventAttributes putAttributesItem(String key, Object attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

  /**
   * <p>JSON object of attributes from CI Visibility events.</p>
   * @return attributes
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Map<String, Object> getAttributes() {
        return attributes;
      }
  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }
  public CIAppEventAttributes service(String service) {
    this.service = service;
    return this;
  }

  /**
   * <p>The name of the application or service generating CI Visibility events.
   * It is used to switch from CI Visibility to APM, so make sure you define the same
   * value when you use both products.</p>
   * @return service
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SERVICE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getService() {
        return service;
      }
  public void setService(String service) {
    this.service = service;
  }
  public CIAppEventAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  public CIAppEventAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * <p>Array of tags associated with your event.</p>
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
  public CIAppEventAttributes timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * <p>Timestamp of your event.</p>
   * @return timestamp
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TIMESTAMP)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getTimestamp() {
        return timestamp;
      }
  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * Return true if this CIAppEventAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CIAppEventAttributes ciAppEventAttributes = (CIAppEventAttributes) o;
    return Objects.equals(this.attributes, ciAppEventAttributes.attributes) && Objects.equals(this.service, ciAppEventAttributes.service) && Objects.equals(this.tags, ciAppEventAttributes.tags) && Objects.equals(this.timestamp, ciAppEventAttributes.timestamp);
  }


  @Override
  public int hashCode() {
    return Objects.hash(attributes,service,tags,timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CIAppEventAttributes {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("}");
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
