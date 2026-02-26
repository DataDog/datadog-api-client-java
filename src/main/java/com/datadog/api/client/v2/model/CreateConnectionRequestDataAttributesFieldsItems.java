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

 */
@JsonPropertyOrder({
  CreateConnectionRequestDataAttributesFieldsItems.JSON_PROPERTY_DESCRIPTION,
  CreateConnectionRequestDataAttributesFieldsItems.JSON_PROPERTY_DISPLAY_NAME,
  CreateConnectionRequestDataAttributesFieldsItems.JSON_PROPERTY_GROUPS,
  CreateConnectionRequestDataAttributesFieldsItems.JSON_PROPERTY_ID,
  CreateConnectionRequestDataAttributesFieldsItems.JSON_PROPERTY_SOURCE_NAME,
  CreateConnectionRequestDataAttributesFieldsItems.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateConnectionRequestDataAttributesFieldsItems {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private List<String> groups = null;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_SOURCE_NAME = "source_name";
  private String sourceName;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public CreateConnectionRequestDataAttributesFieldsItems() {}

  @JsonCreator
  public CreateConnectionRequestDataAttributesFieldsItems(
            @JsonProperty(required=true, value=JSON_PROPERTY_ID)String id,
            @JsonProperty(required=true, value=JSON_PROPERTY_SOURCE_NAME)String sourceName,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)String type) {
        this.id = id;
        this.sourceName = sourceName;
        this.type = type;
  }
  public CreateConnectionRequestDataAttributesFieldsItems description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <p>Getdescription</p>
   * @return description
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DESCRIPTION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getDescription() {
        return description;
      }
  public void setDescription(String description) {
    this.description = description;
  }
  public CreateConnectionRequestDataAttributesFieldsItems displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * <p>GetdisplayName</p>
   * @return displayName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getDisplayName() {
        return displayName;
      }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }
  public CreateConnectionRequestDataAttributesFieldsItems groups(List<String> groups) {
    this.groups = groups;
    return this;
  }
  public CreateConnectionRequestDataAttributesFieldsItems addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * <p>Getgroups</p>
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
  public CreateConnectionRequestDataAttributesFieldsItems id(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>Getid</p>
   * @return id
  **/
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getId() {
        return id;
      }
  public void setId(String id) {
    this.id = id;
  }
  public CreateConnectionRequestDataAttributesFieldsItems sourceName(String sourceName) {
    this.sourceName = sourceName;
    return this;
  }

  /**
   * <p>GetsourceName</p>
   * @return sourceName
  **/
      @JsonProperty(JSON_PROPERTY_SOURCE_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getSourceName() {
        return sourceName;
      }
  public void setSourceName(String sourceName) {
    this.sourceName = sourceName;
  }
  public CreateConnectionRequestDataAttributesFieldsItems type(String type) {
    this.type = type;
    return this;
  }

  /**
   * <p>Gettype</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
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
   * @return CreateConnectionRequestDataAttributesFieldsItems
   */
  @JsonAnySetter
  public CreateConnectionRequestDataAttributesFieldsItems putAdditionalProperty(String key, Object value) {
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
   * Return true if this CreateConnectionRequestDataAttributesFieldsItems object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateConnectionRequestDataAttributesFieldsItems createConnectionRequestDataAttributesFieldsItems = (CreateConnectionRequestDataAttributesFieldsItems) o;
    return Objects.equals(this.description, createConnectionRequestDataAttributesFieldsItems.description) && Objects.equals(this.displayName, createConnectionRequestDataAttributesFieldsItems.displayName) && Objects.equals(this.groups, createConnectionRequestDataAttributesFieldsItems.groups) && Objects.equals(this.id, createConnectionRequestDataAttributesFieldsItems.id) && Objects.equals(this.sourceName, createConnectionRequestDataAttributesFieldsItems.sourceName) && Objects.equals(this.type, createConnectionRequestDataAttributesFieldsItems.type) && Objects.equals(this.additionalProperties, createConnectionRequestDataAttributesFieldsItems.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(description,displayName,groups,id,sourceName,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateConnectionRequestDataAttributesFieldsItems {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sourceName: ").append(toIndentedString(sourceName)).append("\n");
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
