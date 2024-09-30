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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** The definition of <code>AbbreviatedTeamAttributes</code> object. */
@JsonPropertyOrder({
  AbbreviatedTeamAttributes.JSON_PROPERTY_AVATAR,
  AbbreviatedTeamAttributes.JSON_PROPERTY_BANNER,
  AbbreviatedTeamAttributes.JSON_PROPERTY_HANDLE,
  AbbreviatedTeamAttributes.JSON_PROPERTY_HANDLES,
  AbbreviatedTeamAttributes.JSON_PROPERTY_IS_OPEN_MEMBERSHIP,
  AbbreviatedTeamAttributes.JSON_PROPERTY_NAME,
  AbbreviatedTeamAttributes.JSON_PROPERTY_SUMMARY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AbbreviatedTeamAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AVATAR = "avatar";
  private JsonNullable<String> avatar = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BANNER = "banner";
  private Long banner;

  public static final String JSON_PROPERTY_HANDLE = "handle";
  private String handle;

  public static final String JSON_PROPERTY_HANDLES = "handles";
  private String handles;

  public static final String JSON_PROPERTY_IS_OPEN_MEMBERSHIP = "is_open_membership";
  private Boolean isOpenMembership;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SUMMARY = "summary";
  private String summary;

  public AbbreviatedTeamAttributes() {}

  @JsonCreator
  public AbbreviatedTeamAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_HANDLE) String handle,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.handle = handle;
    this.name = name;
  }

  public AbbreviatedTeamAttributes avatar(String avatar) {
    this.avatar = JsonNullable.<String>of(avatar);
    return this;
  }

  /**
   * Unicode representation of the avatar for the team, limited to a single grapheme
   *
   * @return avatar
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getAvatar() {
    return avatar.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AVATAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getAvatar_JsonNullable() {
    return avatar;
  }

  @JsonProperty(JSON_PROPERTY_AVATAR)
  public void setAvatar_JsonNullable(JsonNullable<String> avatar) {
    this.avatar = avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = JsonNullable.<String>of(avatar);
  }

  public AbbreviatedTeamAttributes banner(Long banner) {
    this.banner = banner;
    return this;
  }

  /**
   * Banner selection for the team
   *
   * @return banner
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BANNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getBanner() {
    return banner;
  }

  public void setBanner(Long banner) {
    this.banner = banner;
  }

  public AbbreviatedTeamAttributes handle(String handle) {
    this.handle = handle;
    return this;
  }

  /**
   * The team's identifier
   *
   * @return handle
   */
  @JsonProperty(JSON_PROPERTY_HANDLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  public AbbreviatedTeamAttributes handles(String handles) {
    this.handles = handles;
    return this;
  }

  /**
   * The <code>AbbreviatedTeamAttributes</code> <code>handles</code>.
   *
   * @return handles
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HANDLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHandles() {
    return handles;
  }

  public void setHandles(String handles) {
    this.handles = handles;
  }

  /**
   * The <code>AbbreviatedTeamAttributes</code> <code>is_open_membership</code>.
   *
   * @return isOpenMembership
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_OPEN_MEMBERSHIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsOpenMembership() {
    return isOpenMembership;
  }

  public AbbreviatedTeamAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the team
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

  /**
   * A brief summary of the team
   *
   * @return summary
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSummary() {
    return summary;
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
   * @return AbbreviatedTeamAttributes
   */
  @JsonAnySetter
  public AbbreviatedTeamAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AbbreviatedTeamAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbbreviatedTeamAttributes abbreviatedTeamAttributes = (AbbreviatedTeamAttributes) o;
    return Objects.equals(this.avatar, abbreviatedTeamAttributes.avatar)
        && Objects.equals(this.banner, abbreviatedTeamAttributes.banner)
        && Objects.equals(this.handle, abbreviatedTeamAttributes.handle)
        && Objects.equals(this.handles, abbreviatedTeamAttributes.handles)
        && Objects.equals(this.isOpenMembership, abbreviatedTeamAttributes.isOpenMembership)
        && Objects.equals(this.name, abbreviatedTeamAttributes.name)
        && Objects.equals(this.summary, abbreviatedTeamAttributes.summary)
        && Objects.equals(
            this.additionalProperties, abbreviatedTeamAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        avatar, banner, handle, handles, isOpenMembership, name, summary, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbbreviatedTeamAttributes {\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    banner: ").append(toIndentedString(banner)).append("\n");
    sb.append("    handle: ").append(toIndentedString(handle)).append("\n");
    sb.append("    handles: ").append(toIndentedString(handles)).append("\n");
    sb.append("    isOpenMembership: ").append(toIndentedString(isOpenMembership)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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
