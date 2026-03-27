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

/**
 * Team hierarchy links connect different teams. This represents attributes from teams that are
 * connected by the team hierarchy link.
 */
@JsonPropertyOrder({
  TeamHierarchyLinkTeamAttributes.JSON_PROPERTY_AVATAR,
  TeamHierarchyLinkTeamAttributes.JSON_PROPERTY_BANNER,
  TeamHierarchyLinkTeamAttributes.JSON_PROPERTY_HANDLE,
  TeamHierarchyLinkTeamAttributes.JSON_PROPERTY_IS_MANAGED,
  TeamHierarchyLinkTeamAttributes.JSON_PROPERTY_IS_OPEN_MEMBERSHIP,
  TeamHierarchyLinkTeamAttributes.JSON_PROPERTY_LINK_COUNT,
  TeamHierarchyLinkTeamAttributes.JSON_PROPERTY_NAME,
  TeamHierarchyLinkTeamAttributes.JSON_PROPERTY_SUMMARY,
  TeamHierarchyLinkTeamAttributes.JSON_PROPERTY_USER_COUNT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TeamHierarchyLinkTeamAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AVATAR = "avatar";
  private JsonNullable<String> avatar = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BANNER = "banner";
  private Long banner;

  public static final String JSON_PROPERTY_HANDLE = "handle";
  private String handle;

  public static final String JSON_PROPERTY_IS_MANAGED = "is_managed";
  private Boolean isManaged;

  public static final String JSON_PROPERTY_IS_OPEN_MEMBERSHIP = "is_open_membership";
  private Boolean isOpenMembership;

  public static final String JSON_PROPERTY_LINK_COUNT = "link_count";
  private Long linkCount;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SUMMARY = "summary";
  private JsonNullable<String> summary = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_USER_COUNT = "user_count";
  private Long userCount;

  public TeamHierarchyLinkTeamAttributes() {}

  @JsonCreator
  public TeamHierarchyLinkTeamAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_HANDLE) String handle,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.handle = handle;
    this.name = name;
  }

  public TeamHierarchyLinkTeamAttributes avatar(String avatar) {
    this.avatar = JsonNullable.<String>of(avatar);
    return this;
  }

  /**
   * The team's avatar
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

  public TeamHierarchyLinkTeamAttributes banner(Long banner) {
    this.banner = banner;
    return this;
  }

  /**
   * The team's banner
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

  public TeamHierarchyLinkTeamAttributes handle(String handle) {
    this.handle = handle;
    return this;
  }

  /**
   * The team's handle
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

  public TeamHierarchyLinkTeamAttributes isManaged(Boolean isManaged) {
    this.isManaged = isManaged;
    return this;
  }

  /**
   * Whether the team is managed
   *
   * @return isManaged
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_MANAGED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsManaged() {
    return isManaged;
  }

  public void setIsManaged(Boolean isManaged) {
    this.isManaged = isManaged;
  }

  public TeamHierarchyLinkTeamAttributes isOpenMembership(Boolean isOpenMembership) {
    this.isOpenMembership = isOpenMembership;
    return this;
  }

  /**
   * Whether the team has open membership
   *
   * @return isOpenMembership
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_OPEN_MEMBERSHIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsOpenMembership() {
    return isOpenMembership;
  }

  public void setIsOpenMembership(Boolean isOpenMembership) {
    this.isOpenMembership = isOpenMembership;
  }

  public TeamHierarchyLinkTeamAttributes linkCount(Long linkCount) {
    this.linkCount = linkCount;
    return this;
  }

  /**
   * The number of links for the team
   *
   * @return linkCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINK_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLinkCount() {
    return linkCount;
  }

  public void setLinkCount(Long linkCount) {
    this.linkCount = linkCount;
  }

  public TeamHierarchyLinkTeamAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The team's name
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

  public TeamHierarchyLinkTeamAttributes summary(String summary) {
    this.summary = JsonNullable.<String>of(summary);
    return this;
  }

  /**
   * The team's summary
   *
   * @return summary
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getSummary() {
    return summary.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSummary_JsonNullable() {
    return summary;
  }

  @JsonProperty(JSON_PROPERTY_SUMMARY)
  public void setSummary_JsonNullable(JsonNullable<String> summary) {
    this.summary = summary;
  }

  public void setSummary(String summary) {
    this.summary = JsonNullable.<String>of(summary);
  }

  public TeamHierarchyLinkTeamAttributes userCount(Long userCount) {
    this.userCount = userCount;
    return this;
  }

  /**
   * The number of users in the team
   *
   * @return userCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getUserCount() {
    return userCount;
  }

  public void setUserCount(Long userCount) {
    this.userCount = userCount;
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
   * @return TeamHierarchyLinkTeamAttributes
   */
  @JsonAnySetter
  public TeamHierarchyLinkTeamAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TeamHierarchyLinkTeamAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamHierarchyLinkTeamAttributes teamHierarchyLinkTeamAttributes =
        (TeamHierarchyLinkTeamAttributes) o;
    return Objects.equals(this.avatar, teamHierarchyLinkTeamAttributes.avatar)
        && Objects.equals(this.banner, teamHierarchyLinkTeamAttributes.banner)
        && Objects.equals(this.handle, teamHierarchyLinkTeamAttributes.handle)
        && Objects.equals(this.isManaged, teamHierarchyLinkTeamAttributes.isManaged)
        && Objects.equals(this.isOpenMembership, teamHierarchyLinkTeamAttributes.isOpenMembership)
        && Objects.equals(this.linkCount, teamHierarchyLinkTeamAttributes.linkCount)
        && Objects.equals(this.name, teamHierarchyLinkTeamAttributes.name)
        && Objects.equals(this.summary, teamHierarchyLinkTeamAttributes.summary)
        && Objects.equals(this.userCount, teamHierarchyLinkTeamAttributes.userCount)
        && Objects.equals(
            this.additionalProperties, teamHierarchyLinkTeamAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        avatar,
        banner,
        handle,
        isManaged,
        isOpenMembership,
        linkCount,
        name,
        summary,
        userCount,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamHierarchyLinkTeamAttributes {\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    banner: ").append(toIndentedString(banner)).append("\n");
    sb.append("    handle: ").append(toIndentedString(handle)).append("\n");
    sb.append("    isManaged: ").append(toIndentedString(isManaged)).append("\n");
    sb.append("    isOpenMembership: ").append(toIndentedString(isOpenMembership)).append("\n");
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
