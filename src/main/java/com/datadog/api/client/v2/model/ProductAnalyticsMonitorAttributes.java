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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes of a Product Analytics monitor. */
@JsonPropertyOrder({
  ProductAnalyticsMonitorAttributes.JSON_PROPERTY_CREATED_TIME,
  ProductAnalyticsMonitorAttributes.JSON_PROPERTY_CREATOR,
  ProductAnalyticsMonitorAttributes.JSON_PROPERTY_MESSAGE,
  ProductAnalyticsMonitorAttributes.JSON_PROPERTY_MODIFIED_TIME,
  ProductAnalyticsMonitorAttributes.JSON_PROPERTY_NAME,
  ProductAnalyticsMonitorAttributes.JSON_PROPERTY_OPTIONS,
  ProductAnalyticsMonitorAttributes.JSON_PROPERTY_ORG_ID,
  ProductAnalyticsMonitorAttributes.JSON_PROPERTY_PRIORITY,
  ProductAnalyticsMonitorAttributes.JSON_PROPERTY_QUERY,
  ProductAnalyticsMonitorAttributes.JSON_PROPERTY_STATUS,
  ProductAnalyticsMonitorAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsMonitorAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_TIME = "created_time";
  private OffsetDateTime createdTime;

  public static final String JSON_PROPERTY_CREATOR = "creator";
  private ProductAnalyticsMonitorCreator creator;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_MODIFIED_TIME = "modified_time";
  private OffsetDateTime modifiedTime;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private ProductAnalyticsMonitorOptions options;

  public static final String JSON_PROPERTY_ORG_ID = "org_id";
  private Long orgId;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private Integer priority;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_STATUS = "status";
  private ProductAnalyticsMonitorStatus status;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private JsonNullable<List<String>> tags = JsonNullable.<List<String>>undefined();

  public ProductAnalyticsMonitorAttributes() {}

  @JsonCreator
  public ProductAnalyticsMonitorAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_MESSAGE) String message,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_OPTIONS)
          ProductAnalyticsMonitorOptions options,
      @JsonProperty(required = true, value = JSON_PROPERTY_ORG_ID) Long orgId,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) String query,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS)
          ProductAnalyticsMonitorStatus status) {
    this.message = message;
    this.name = name;
    this.options = options;
    this.unparsed |= options.unparsed;
    this.orgId = orgId;
    this.query = query;
    this.status = status;
    this.unparsed |= !status.isValid();
  }

  public ProductAnalyticsMonitorAttributes createdTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Time the monitor was created.
   *
   * @return createdTime
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
  }

  public ProductAnalyticsMonitorAttributes creator(ProductAnalyticsMonitorCreator creator) {
    this.creator = creator;
    this.unparsed |= creator.unparsed;
    return this;
  }

  /**
   * The user who created the monitor.
   *
   * @return creator
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProductAnalyticsMonitorCreator getCreator() {
    return creator;
  }

  public void setCreator(ProductAnalyticsMonitorCreator creator) {
    this.creator = creator;
    if (creator != null) {
      this.unparsed |= creator.unparsed;
    }
  }

  public ProductAnalyticsMonitorAttributes message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Notification message sent when the monitor alerts.
   *
   * @return message
   */
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ProductAnalyticsMonitorAttributes modifiedTime(OffsetDateTime modifiedTime) {
    this.modifiedTime = modifiedTime;
    return this;
  }

  /**
   * Time the monitor was last modified.
   *
   * @return modifiedTime
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getModifiedTime() {
    return modifiedTime;
  }

  public void setModifiedTime(OffsetDateTime modifiedTime) {
    this.modifiedTime = modifiedTime;
  }

  public ProductAnalyticsMonitorAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the monitor.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductAnalyticsMonitorAttributes options(ProductAnalyticsMonitorOptions options) {
    this.options = options;
    this.unparsed |= options.unparsed;
    return this;
  }

  /**
   * Options of a Product Analytics monitor.
   *
   * @return options
   */
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsMonitorOptions getOptions() {
    return options;
  }

  public void setOptions(ProductAnalyticsMonitorOptions options) {
    this.options = options;
    if (options != null) {
      this.unparsed |= options.unparsed;
    }
  }

  public ProductAnalyticsMonitorAttributes orgId(Long orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * ID of the organization that owns the monitor.
   *
   * @return orgId
   */
  @JsonProperty(JSON_PROPERTY_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getOrgId() {
    return orgId;
  }

  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }

  public ProductAnalyticsMonitorAttributes priority(Integer priority) {
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

  public ProductAnalyticsMonitorAttributes query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Monitor query.
   *
   * @return query
   */
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public ProductAnalyticsMonitorAttributes status(ProductAnalyticsMonitorStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * Current alert status of the monitor. <code>No Data</code> is returned when the monitor has not
   * been evaluated yet.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsMonitorStatus getStatus() {
    return status;
  }

  public void setStatus(ProductAnalyticsMonitorStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public ProductAnalyticsMonitorAttributes tags(List<String> tags) {
    this.tags = JsonNullable.<List<String>>of(tags);
    return this;
  }

  public ProductAnalyticsMonitorAttributes addTagsItem(String tagsItem) {
    if (this.tags == null || !this.tags.isPresent()) {
      this.tags = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.tags.get().add(tagsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Monitor tags, as <code>key:value</code> strings.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<String> getTags() {
    return tags.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getTags_JsonNullable() {
    return tags;
  }

  @JsonProperty(JSON_PROPERTY_TAGS)
  public void setTags_JsonNullable(JsonNullable<List<String>> tags) {
    this.tags = tags;
  }

  public void setTags(List<String> tags) {
    this.tags = JsonNullable.<List<String>>of(tags);
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
   * @return ProductAnalyticsMonitorAttributes
   */
  @JsonAnySetter
  public ProductAnalyticsMonitorAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductAnalyticsMonitorAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsMonitorAttributes productAnalyticsMonitorAttributes =
        (ProductAnalyticsMonitorAttributes) o;
    return Objects.equals(this.createdTime, productAnalyticsMonitorAttributes.createdTime)
        && Objects.equals(this.creator, productAnalyticsMonitorAttributes.creator)
        && Objects.equals(this.message, productAnalyticsMonitorAttributes.message)
        && Objects.equals(this.modifiedTime, productAnalyticsMonitorAttributes.modifiedTime)
        && Objects.equals(this.name, productAnalyticsMonitorAttributes.name)
        && Objects.equals(this.options, productAnalyticsMonitorAttributes.options)
        && Objects.equals(this.orgId, productAnalyticsMonitorAttributes.orgId)
        && Objects.equals(this.priority, productAnalyticsMonitorAttributes.priority)
        && Objects.equals(this.query, productAnalyticsMonitorAttributes.query)
        && Objects.equals(this.status, productAnalyticsMonitorAttributes.status)
        && Objects.equals(this.tags, productAnalyticsMonitorAttributes.tags)
        && Objects.equals(
            this.additionalProperties, productAnalyticsMonitorAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdTime,
        creator,
        message,
        modifiedTime,
        name,
        options,
        orgId,
        priority,
        query,
        status,
        tags,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsMonitorAttributes {\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    modifiedTime: ").append(toIndentedString(modifiedTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
