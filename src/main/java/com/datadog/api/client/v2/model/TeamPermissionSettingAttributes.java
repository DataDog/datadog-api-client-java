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
   * <p>Team permission setting attributes</p>
 */
@JsonPropertyOrder({
  TeamPermissionSettingAttributes.JSON_PROPERTY_ACTION,
  TeamPermissionSettingAttributes.JSON_PROPERTY_EDITABLE,
  TeamPermissionSettingAttributes.JSON_PROPERTY_OPTIONS,
  TeamPermissionSettingAttributes.JSON_PROPERTY_TITLE,
  TeamPermissionSettingAttributes.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TeamPermissionSettingAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTION = "action";
  private TeamPermissionSettingSerializerAction action;

  public static final String JSON_PROPERTY_EDITABLE = "editable";
  private Boolean editable;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private List<TeamPermissionSettingValue> options = null;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_VALUE = "value";
  private TeamPermissionSettingValue value;


  /**
   * <p>The identifier for the action</p>
   * @return action
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ACTION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public TeamPermissionSettingSerializerAction getAction() {
        return action;
      }

  /**
   * <p>Whether or not the permission setting is editable by the current user</p>
   * @return editable
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EDITABLE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getEditable() {
        return editable;
      }

  /**
   * <p>Possible values for action</p>
   * @return options
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_OPTIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<TeamPermissionSettingValue> getOptions() {
        return options;
      }

  /**
   * <p>The team permission name</p>
   * @return title
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TITLE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTitle() {
        return title;
      }
  public TeamPermissionSettingAttributes value(TeamPermissionSettingValue value) {
    this.value = value;
    this.unparsed |= !value.isValid();
    return this;
  }

  /**
   * <p>What type of user is allowed to perform the specified action</p>
   * @return value
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VALUE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public TeamPermissionSettingValue getValue() {
        return value;
      }
  public void setValue(TeamPermissionSettingValue value) {
    if (!value.isValid()) {
        this.unparsed = true;
    }
    this.value = value;
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
   * @return TeamPermissionSettingAttributes
   */
  @JsonAnySetter
  public TeamPermissionSettingAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this TeamPermissionSettingAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamPermissionSettingAttributes teamPermissionSettingAttributes = (TeamPermissionSettingAttributes) o;
    return Objects.equals(this.action, teamPermissionSettingAttributes.action) && Objects.equals(this.editable, teamPermissionSettingAttributes.editable) && Objects.equals(this.options, teamPermissionSettingAttributes.options) && Objects.equals(this.title, teamPermissionSettingAttributes.title) && Objects.equals(this.value, teamPermissionSettingAttributes.value) && Objects.equals(this.additionalProperties, teamPermissionSettingAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(action,editable,options,title,value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamPermissionSettingAttributes {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
