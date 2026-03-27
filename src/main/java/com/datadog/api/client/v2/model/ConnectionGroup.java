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
   * <p>The definition of <code>ConnectionGroup</code> object.</p>
 */
@JsonPropertyOrder({
  ConnectionGroup.JSON_PROPERTY_CONNECTION_GROUP_ID,
  ConnectionGroup.JSON_PROPERTY_LABEL,
  ConnectionGroup.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ConnectionGroup {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONNECTION_GROUP_ID = "connectionGroupId";
  private String connectionGroupId;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = new ArrayList<>();

  public ConnectionGroup() {}

  @JsonCreator
  public ConnectionGroup(
            @JsonProperty(required=true, value=JSON_PROPERTY_CONNECTION_GROUP_ID)String connectionGroupId,
            @JsonProperty(required=true, value=JSON_PROPERTY_LABEL)String label,
            @JsonProperty(required=true, value=JSON_PROPERTY_TAGS)List<String> tags) {
        this.connectionGroupId = connectionGroupId;
        this.label = label;
        this.tags = tags;
  }
  public ConnectionGroup connectionGroupId(String connectionGroupId) {
    this.connectionGroupId = connectionGroupId;
    return this;
  }

  /**
   * <p>The <code>ConnectionGroup</code> <code>connectionGroupId</code>.</p>
   * @return connectionGroupId
  **/
      @JsonProperty(JSON_PROPERTY_CONNECTION_GROUP_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getConnectionGroupId() {
        return connectionGroupId;
      }
  public void setConnectionGroupId(String connectionGroupId) {
    this.connectionGroupId = connectionGroupId;
  }
  public ConnectionGroup label(String label) {
    this.label = label;
    return this;
  }

  /**
   * <p>The <code>ConnectionGroup</code> <code>label</code>.</p>
   * @return label
  **/
      @JsonProperty(JSON_PROPERTY_LABEL)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getLabel() {
        return label;
      }
  public void setLabel(String label) {
    this.label = label;
  }
  public ConnectionGroup tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  public ConnectionGroup addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * <p>The <code>ConnectionGroup</code> <code>tags</code>.</p>
   * @return tags
  **/
      @JsonProperty(JSON_PROPERTY_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<String> getTags() {
        return tags;
      }
  public void setTags(List<String> tags) {
    this.tags = tags;
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
   * @return ConnectionGroup
   */
  @JsonAnySetter
  public ConnectionGroup putAdditionalProperty(String key, Object value) {
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
   * Return true if this ConnectionGroup object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionGroup connectionGroup = (ConnectionGroup) o;
    return Objects.equals(this.connectionGroupId, connectionGroup.connectionGroupId) && Objects.equals(this.label, connectionGroup.label) && Objects.equals(this.tags, connectionGroup.tags) && Objects.equals(this.additionalProperties, connectionGroup.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(connectionGroupId,label,tags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionGroup {\n");
    sb.append("    connectionGroupId: ").append(toIndentedString(connectionGroupId)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
