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

/** Team attributes */
@JsonPropertyOrder({
  TeamAttributes.JSON_PROPERTY_AVATAR,
  TeamAttributes.JSON_PROPERTY_BANNER,
  TeamAttributes.JSON_PROPERTY_CREATED_AT,
  TeamAttributes.JSON_PROPERTY_DESCRIPTION,
  TeamAttributes.JSON_PROPERTY_HANDLE,
  TeamAttributes.JSON_PROPERTY_HIDDEN_MODULES,
  TeamAttributes.JSON_PROPERTY_LINK_COUNT,
  TeamAttributes.JSON_PROPERTY_MODIFIED_AT,
  TeamAttributes.JSON_PROPERTY_NAME,
  TeamAttributes.JSON_PROPERTY_SUMMARY,
  TeamAttributes.JSON_PROPERTY_USER_COUNT,
  TeamAttributes.JSON_PROPERTY_VISIBLE_MODULES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TeamAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AVATAR = "avatar";
  private JsonNullable<String> avatar = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BANNER = "banner";
  private JsonNullable<Long> banner = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_HANDLE = "handle";
  private String handle;

  public static final String JSON_PROPERTY_HIDDEN_MODULES = "hidden_modules";
  private List<String> hiddenModules = null;

  public static final String JSON_PROPERTY_LINK_COUNT = "link_count";
  private Integer linkCount;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SUMMARY = "summary";
  private JsonNullable<String> summary = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_USER_COUNT = "user_count";
  private Integer userCount;

  public static final String JSON_PROPERTY_VISIBLE_MODULES = "visible_modules";
  private List<String> visibleModules = null;

  public TeamAttributes() {}

  @JsonCreator
  public TeamAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_HANDLE) String handle,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.handle = handle;
    this.name = name;
  }

  public TeamAttributes avatar(String avatar) {
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

  public TeamAttributes banner(Long banner) {
    this.banner = JsonNullable.<Long>of(banner);
    return this;
  }

  /**
   * Banner selection for the team
   *
   * @return banner
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getBanner() {
    return banner.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BANNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getBanner_JsonNullable() {
    return banner;
  }

  @JsonProperty(JSON_PROPERTY_BANNER)
  public void setBanner_JsonNullable(JsonNullable<Long> banner) {
    this.banner = banner;
  }

  public void setBanner(Long banner) {
    this.banner = JsonNullable.<Long>of(banner);
  }

  public TeamAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Creation date of the team
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public TeamAttributes description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

  /**
   * Free-form markdown description/content for the team's homepage
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getDescription() {
    return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }

  public TeamAttributes handle(String handle) {
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

  public TeamAttributes hiddenModules(List<String> hiddenModules) {
    this.hiddenModules = hiddenModules;
    return this;
  }

  public TeamAttributes addHiddenModulesItem(String hiddenModulesItem) {
    if (this.hiddenModules == null) {
      this.hiddenModules = new ArrayList<>();
    }
    this.hiddenModules.add(hiddenModulesItem);
    return this;
  }

  /**
   * Collection of hidden modules for the team
   *
   * @return hiddenModules
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HIDDEN_MODULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getHiddenModules() {
    return hiddenModules;
  }

  public void setHiddenModules(List<String> hiddenModules) {
    this.hiddenModules = hiddenModules;
  }

  /**
   * The number of links belonging to the team maximum: 2147483647
   *
   * @return linkCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINK_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getLinkCount() {
    return linkCount;
  }

  public TeamAttributes modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * Modification date of the team
   *
   * @return modifiedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public TeamAttributes name(String name) {
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

  public TeamAttributes summary(String summary) {
    this.summary = JsonNullable.<String>of(summary);
    return this;
  }

  /**
   * A brief summary of the team, derived from the <code>description</code>
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

  /**
   * The number of users belonging to the team maximum: 2147483647
   *
   * @return userCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getUserCount() {
    return userCount;
  }

  public TeamAttributes visibleModules(List<String> visibleModules) {
    this.visibleModules = visibleModules;
    return this;
  }

  public TeamAttributes addVisibleModulesItem(String visibleModulesItem) {
    if (this.visibleModules == null) {
      this.visibleModules = new ArrayList<>();
    }
    this.visibleModules.add(visibleModulesItem);
    return this;
  }

  /**
   * Collection of visible modules for the team
   *
   * @return visibleModules
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VISIBLE_MODULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getVisibleModules() {
    return visibleModules;
  }

  public void setVisibleModules(List<String> visibleModules) {
    this.visibleModules = visibleModules;
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
   * @return TeamAttributes
   */
  @JsonAnySetter
  public TeamAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TeamAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamAttributes teamAttributes = (TeamAttributes) o;
    return Objects.equals(this.avatar, teamAttributes.avatar)
        && Objects.equals(this.banner, teamAttributes.banner)
        && Objects.equals(this.createdAt, teamAttributes.createdAt)
        && Objects.equals(this.description, teamAttributes.description)
        && Objects.equals(this.handle, teamAttributes.handle)
        && Objects.equals(this.hiddenModules, teamAttributes.hiddenModules)
        && Objects.equals(this.linkCount, teamAttributes.linkCount)
        && Objects.equals(this.modifiedAt, teamAttributes.modifiedAt)
        && Objects.equals(this.name, teamAttributes.name)
        && Objects.equals(this.summary, teamAttributes.summary)
        && Objects.equals(this.userCount, teamAttributes.userCount)
        && Objects.equals(this.visibleModules, teamAttributes.visibleModules)
        && Objects.equals(this.additionalProperties, teamAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        avatar,
        banner,
        createdAt,
        description,
        handle,
        hiddenModules,
        linkCount,
        modifiedAt,
        name,
        summary,
        userCount,
        visibleModules,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamAttributes {\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    banner: ").append(toIndentedString(banner)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    handle: ").append(toIndentedString(handle)).append("\n");
    sb.append("    hiddenModules: ").append(toIndentedString(hiddenModules)).append("\n");
    sb.append("    linkCount: ").append(toIndentedString(linkCount)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
    sb.append("    visibleModules: ").append(toIndentedString(visibleModules)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append("}");
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
