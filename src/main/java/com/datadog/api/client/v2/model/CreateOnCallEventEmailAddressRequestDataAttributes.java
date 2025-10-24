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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** */
@JsonPropertyOrder({
  CreateOnCallEventEmailAddressRequestDataAttributes.JSON_PROPERTY_ALERT_TYPE,
  CreateOnCallEventEmailAddressRequestDataAttributes.JSON_PROPERTY_DESCRIPTION,
  CreateOnCallEventEmailAddressRequestDataAttributes.JSON_PROPERTY_FORMAT,
  CreateOnCallEventEmailAddressRequestDataAttributes.JSON_PROPERTY_TAGS,
  CreateOnCallEventEmailAddressRequestDataAttributes.JSON_PROPERTY_TEAM_HANDLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateOnCallEventEmailAddressRequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALERT_TYPE = "alert_type";
  private String alertType;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_FORMAT = "format";
  private String format;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = new ArrayList<>();

  public static final String JSON_PROPERTY_TEAM_HANDLE = "team_handle";
  private String teamHandle;

  public CreateOnCallEventEmailAddressRequestDataAttributes() {}

  @JsonCreator
  public CreateOnCallEventEmailAddressRequestDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_FORMAT) String format,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAGS) List<String> tags) {
    this.format = format;
    this.tags = tags;
  }

  public CreateOnCallEventEmailAddressRequestDataAttributes alertType(String alertType) {
    this.alertType = alertType;
    return this;
  }

  /**
   * GetalertType
   *
   * @return alertType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALERT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAlertType() {
    return alertType;
  }

  public void setAlertType(String alertType) {
    this.alertType = alertType;
  }

  public CreateOnCallEventEmailAddressRequestDataAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Getdescription
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateOnCallEventEmailAddressRequestDataAttributes format(String format) {
    this.format = format;
    return this;
  }

  /**
   * Getformat
   *
   * @return format
   */
  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public CreateOnCallEventEmailAddressRequestDataAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public CreateOnCallEventEmailAddressRequestDataAttributes addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Gettags
   *
   * @return tags
   */
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public CreateOnCallEventEmailAddressRequestDataAttributes teamHandle(String teamHandle) {
    this.teamHandle = teamHandle;
    return this;
  }

  /**
   * GetteamHandle
   *
   * @return teamHandle
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAM_HANDLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTeamHandle() {
    return teamHandle;
  }

  public void setTeamHandle(String teamHandle) {
    this.teamHandle = teamHandle;
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
   * @return CreateOnCallEventEmailAddressRequestDataAttributes
   */
  @JsonAnySetter
  public CreateOnCallEventEmailAddressRequestDataAttributes putAdditionalProperty(
      String key, Object value) {
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
   * Return true if this CreateOnCallEventEmailAddressRequestDataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOnCallEventEmailAddressRequestDataAttributes
        createOnCallEventEmailAddressRequestDataAttributes =
            (CreateOnCallEventEmailAddressRequestDataAttributes) o;
    return Objects.equals(
            this.alertType, createOnCallEventEmailAddressRequestDataAttributes.alertType)
        && Objects.equals(
            this.description, createOnCallEventEmailAddressRequestDataAttributes.description)
        && Objects.equals(this.format, createOnCallEventEmailAddressRequestDataAttributes.format)
        && Objects.equals(this.tags, createOnCallEventEmailAddressRequestDataAttributes.tags)
        && Objects.equals(
            this.teamHandle, createOnCallEventEmailAddressRequestDataAttributes.teamHandle)
        && Objects.equals(
            this.additionalProperties,
            createOnCallEventEmailAddressRequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertType, description, format, tags, teamHandle, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOnCallEventEmailAddressRequestDataAttributes {\n");
    sb.append("    alertType: ").append(toIndentedString(alertType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    teamHandle: ").append(toIndentedString(teamHandle)).append("\n");
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
