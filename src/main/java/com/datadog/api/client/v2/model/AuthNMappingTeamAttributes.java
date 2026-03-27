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
   * <p>Team attributes.</p>
 */
@JsonPropertyOrder({
  AuthNMappingTeamAttributes.JSON_PROPERTY_AVATAR,
  AuthNMappingTeamAttributes.JSON_PROPERTY_BANNER,
  AuthNMappingTeamAttributes.JSON_PROPERTY_HANDLE,
  AuthNMappingTeamAttributes.JSON_PROPERTY_LINK_COUNT,
  AuthNMappingTeamAttributes.JSON_PROPERTY_NAME,
  AuthNMappingTeamAttributes.JSON_PROPERTY_SUMMARY,
  AuthNMappingTeamAttributes.JSON_PROPERTY_USER_COUNT
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AuthNMappingTeamAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AVATAR = "avatar";
  private JsonNullable<String> avatar = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BANNER = "banner";
  private JsonNullable<Long> banner = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_HANDLE = "handle";
  private String handle;

  public static final String JSON_PROPERTY_LINK_COUNT = "link_count";
  private Integer linkCount;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SUMMARY = "summary";
  private JsonNullable<String> summary = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_USER_COUNT = "user_count";
  private Integer userCount;

  public AuthNMappingTeamAttributes avatar(String avatar) {
    this.avatar = JsonNullable.<String>of(avatar);
    return this;
  }

  /**
   * <p>Unicode representation of the avatar for the team, limited to a single grapheme</p>
   * @return avatar
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getAvatar() {
        return avatar.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_AVATAR)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getAvatar_JsonNullable() {
    return avatar;
  }
  @JsonProperty(JSON_PROPERTY_AVATAR)public void setAvatar_JsonNullable(JsonNullable<String> avatar) {
    this.avatar = avatar;
  }
  public void setAvatar(String avatar) {
    this.avatar = JsonNullable.<String>of(avatar);
  }
  public AuthNMappingTeamAttributes banner(Long banner) {
    this.banner = JsonNullable.<Long>of(banner);
    return this;
  }

  /**
   * <p>Banner selection for the team</p>
   * @return banner
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Long getBanner() {
        return banner.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_BANNER)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getBanner_JsonNullable() {
    return banner;
  }
  @JsonProperty(JSON_PROPERTY_BANNER)public void setBanner_JsonNullable(JsonNullable<Long> banner) {
    this.banner = banner;
  }
  public void setBanner(Long banner) {
    this.banner = JsonNullable.<Long>of(banner);
  }
  public AuthNMappingTeamAttributes handle(String handle) {
    this.handle = handle;
    return this;
  }

  /**
   * <p>The team's identifier</p>
   * @return handle
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HANDLE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getHandle() {
        return handle;
      }
  public void setHandle(String handle) {
    this.handle = handle;
  }

  /**
   * <p>The number of links belonging to the team</p>
   * maximum: 2147483647
   * @return linkCount
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LINK_COUNT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Integer getLinkCount() {
        return linkCount;
      }
  public AuthNMappingTeamAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The name of the team</p>
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
  public AuthNMappingTeamAttributes summary(String summary) {
    this.summary = JsonNullable.<String>of(summary);
    return this;
  }

  /**
   * <p>A brief summary of the team, derived from the <code>description</code></p>
   * @return summary
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getSummary() {
        return summary.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_SUMMARY)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSummary_JsonNullable() {
    return summary;
  }
  @JsonProperty(JSON_PROPERTY_SUMMARY)public void setSummary_JsonNullable(JsonNullable<String> summary) {
    this.summary = summary;
  }
  public void setSummary(String summary) {
    this.summary = JsonNullable.<String>of(summary);
  }

  /**
   * <p>The number of users belonging to the team</p>
   * maximum: 2147483647
   * @return userCount
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_USER_COUNT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Integer getUserCount() {
        return userCount;
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
   * @return AuthNMappingTeamAttributes
   */
  @JsonAnySetter
  public AuthNMappingTeamAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this AuthNMappingTeamAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthNMappingTeamAttributes authNMappingTeamAttributes = (AuthNMappingTeamAttributes) o;
    return Objects.equals(this.avatar, authNMappingTeamAttributes.avatar) && Objects.equals(this.banner, authNMappingTeamAttributes.banner) && Objects.equals(this.handle, authNMappingTeamAttributes.handle) && Objects.equals(this.linkCount, authNMappingTeamAttributes.linkCount) && Objects.equals(this.name, authNMappingTeamAttributes.name) && Objects.equals(this.summary, authNMappingTeamAttributes.summary) && Objects.equals(this.userCount, authNMappingTeamAttributes.userCount) && Objects.equals(this.additionalProperties, authNMappingTeamAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(avatar,banner,handle,linkCount,name,summary,userCount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthNMappingTeamAttributes {\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    banner: ").append(toIndentedString(banner)).append("\n");
    sb.append("    handle: ").append(toIndentedString(handle)).append("\n");
    sb.append("    linkCount: ").append(toIndentedString(linkCount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
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
