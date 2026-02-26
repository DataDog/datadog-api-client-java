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
  GetMappingResponseDataAttributesAttributesItems.JSON_PROPERTY_ATTRIBUTE,
  GetMappingResponseDataAttributesAttributesItems.JSON_PROPERTY_DESCRIPTION,
  GetMappingResponseDataAttributesAttributesItems.JSON_PROPERTY_DISPLAY_NAME,
  GetMappingResponseDataAttributesAttributesItems.JSON_PROPERTY_GROUPS,
  GetMappingResponseDataAttributesAttributesItems.JSON_PROPERTY_IS_CUSTOM,
  GetMappingResponseDataAttributesAttributesItems.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GetMappingResponseDataAttributesAttributesItems {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTE = "attribute";
  private String attribute;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private List<String> groups = null;

  public static final String JSON_PROPERTY_IS_CUSTOM = "is_custom";
  private Boolean isCustom;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public GetMappingResponseDataAttributesAttributesItems attribute(String attribute) {
    this.attribute = attribute;
    return this;
  }

  /**
   * <p>Getattribute</p>
   * @return attribute
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ATTRIBUTE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getAttribute() {
        return attribute;
      }
  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }
  public GetMappingResponseDataAttributesAttributesItems description(String description) {
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
  public GetMappingResponseDataAttributesAttributesItems displayName(String displayName) {
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
  public GetMappingResponseDataAttributesAttributesItems groups(List<String> groups) {
    this.groups = groups;
    return this;
  }
  public GetMappingResponseDataAttributesAttributesItems addGroupsItem(String groupsItem) {
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
  public GetMappingResponseDataAttributesAttributesItems isCustom(Boolean isCustom) {
    this.isCustom = isCustom;
    return this;
  }

  /**
   * <p>GetisCustom</p>
   * @return isCustom
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IS_CUSTOM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getIsCustom() {
        return isCustom;
      }
  public void setIsCustom(Boolean isCustom) {
    this.isCustom = isCustom;
  }
  public GetMappingResponseDataAttributesAttributesItems type(String type) {
    this.type = type;
    return this;
  }

  /**
   * <p>Gettype</p>
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
   * @return GetMappingResponseDataAttributesAttributesItems
   */
  @JsonAnySetter
  public GetMappingResponseDataAttributesAttributesItems putAdditionalProperty(String key, Object value) {
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
   * Return true if this GetMappingResponseDataAttributesAttributesItems object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMappingResponseDataAttributesAttributesItems getMappingResponseDataAttributesAttributesItems = (GetMappingResponseDataAttributesAttributesItems) o;
    return Objects.equals(this.attribute, getMappingResponseDataAttributesAttributesItems.attribute) && Objects.equals(this.description, getMappingResponseDataAttributesAttributesItems.description) && Objects.equals(this.displayName, getMappingResponseDataAttributesAttributesItems.displayName) && Objects.equals(this.groups, getMappingResponseDataAttributesAttributesItems.groups) && Objects.equals(this.isCustom, getMappingResponseDataAttributesAttributesItems.isCustom) && Objects.equals(this.type, getMappingResponseDataAttributesAttributesItems.type) && Objects.equals(this.additionalProperties, getMappingResponseDataAttributesAttributesItems.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(attribute,description,displayName,groups,isCustom,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMappingResponseDataAttributesAttributesItems {\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    isCustom: ").append(toIndentedString(isCustom)).append("\n");
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
