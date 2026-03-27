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
   * <p>Attributes from the monitor that triggered the event.</p>
 */
@JsonPropertyOrder({
  MonitorType.JSON_PROPERTY_CREATED_AT,
  MonitorType.JSON_PROPERTY_GROUP_STATUS,
  MonitorType.JSON_PROPERTY_GROUPS,
  MonitorType.JSON_PROPERTY_ID,
  MonitorType.JSON_PROPERTY_MESSAGE,
  MonitorType.JSON_PROPERTY_MODIFIED,
  MonitorType.JSON_PROPERTY_NAME,
  MonitorType.JSON_PROPERTY_QUERY,
  MonitorType.JSON_PROPERTY_TAGS,
  MonitorType.JSON_PROPERTY_TEMPLATED_NAME,
  MonitorType.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorType {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Long createdAt;

  public static final String JSON_PROPERTY_GROUP_STATUS = "group_status";
  private Integer groupStatus;

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private List<String> groups = null;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  private Long modified;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TEMPLATED_NAME = "templated_name";
  private String templatedName;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public MonitorType createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * <p>The POSIX timestamp of the monitor's creation in nanoseconds.</p>
   * @return createdAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getCreatedAt() {
        return createdAt;
      }
  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }
  public MonitorType groupStatus(Integer groupStatus) {
    this.groupStatus = groupStatus;
    return this;
  }

  /**
   * <p>Monitor group status used when there is no <code>result_groups</code>.</p>
   * maximum: 2147483647
   * @return groupStatus
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_GROUP_STATUS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Integer getGroupStatus() {
        return groupStatus;
      }
  public void setGroupStatus(Integer groupStatus) {
    this.groupStatus = groupStatus;
  }
  public MonitorType groups(List<String> groups) {
    this.groups = groups;
    return this;
  }
  public MonitorType addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * <p>Groups to which the monitor belongs.</p>
   * @return groups
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_GROUPS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getGroups() {
        return groups;
      }
  public void setGroups(List<String> groups) {
    this.groups = groups;
  }
  public MonitorType id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * <p>The monitor ID.</p>
   * @return id
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getId() {
        return id;
      }
  public void setId(Long id) {
    this.id = id;
  }
  public MonitorType message(String message) {
    this.message = message;
    return this;
  }

  /**
   * <p>The monitor message.</p>
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
  public MonitorType modified(Long modified) {
    this.modified = modified;
    return this;
  }

  /**
   * <p>The monitor's last-modified timestamp.</p>
   * @return modified
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MODIFIED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getModified() {
        return modified;
      }
  public void setModified(Long modified) {
    this.modified = modified;
  }
  public MonitorType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The monitor name.</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public MonitorType query(String query) {
    this.query = query;
    return this;
  }

  /**
   * <p>The query that triggers the alert.</p>
   * @return query
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getQuery() {
        return query;
      }
  public void setQuery(String query) {
    this.query = query;
  }
  public MonitorType tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  public MonitorType addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * <p>A list of tags attached to the monitor.</p>
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
  public MonitorType templatedName(String templatedName) {
    this.templatedName = templatedName;
    return this;
  }

  /**
   * <p>The templated name of the monitor before resolving any template variables.</p>
   * @return templatedName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TEMPLATED_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTemplatedName() {
        return templatedName;
      }
  public void setTemplatedName(String templatedName) {
    this.templatedName = templatedName;
  }
  public MonitorType type(String type) {
    this.type = type;
    return this;
  }

  /**
   * <p>The monitor type.</p>
   * @return type
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getType() {
        return type;
      }
  public void setType(String type) {
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
   * @return MonitorType
   */
  @JsonAnySetter
  public MonitorType putAdditionalProperty(String key, Object value) {
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
   * Return true if this MonitorType object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorType monitorType = (MonitorType) o;
    return Objects.equals(this.createdAt, monitorType.createdAt) && Objects.equals(this.groupStatus, monitorType.groupStatus) && Objects.equals(this.groups, monitorType.groups) && Objects.equals(this.id, monitorType.id) && Objects.equals(this.message, monitorType.message) && Objects.equals(this.modified, monitorType.modified) && Objects.equals(this.name, monitorType.name) && Objects.equals(this.query, monitorType.query) && Objects.equals(this.tags, monitorType.tags) && Objects.equals(this.templatedName, monitorType.templatedName) && Objects.equals(this.type, monitorType.type) && Objects.equals(this.additionalProperties, monitorType.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(createdAt,groupStatus,groups,id,message,modified,name,query,tags,templatedName,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorType {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    groupStatus: ").append(toIndentedString(groupStatus)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    templatedName: ").append(toIndentedString(templatedName)).append("\n");
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
