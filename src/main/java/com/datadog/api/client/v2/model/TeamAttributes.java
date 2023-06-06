/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.time.OffsetDateTime;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Team attributes */
@JsonPropertyOrder({
  TeamAttributes.JSON_PROPERTY_CREATED_AT,
  TeamAttributes.JSON_PROPERTY_DESCRIPTION,
  TeamAttributes.JSON_PROPERTY_HANDLE,
  TeamAttributes.JSON_PROPERTY_LINK_COUNT,
  TeamAttributes.JSON_PROPERTY_MODIFIED_AT,
  TeamAttributes.JSON_PROPERTY_NAME,
  TeamAttributes.JSON_PROPERTY_SUMMARY,
  TeamAttributes.JSON_PROPERTY_USER_COUNT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TeamAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_HANDLE = "handle";
  private String handle;

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

  public TeamAttributes() {}

  @JsonCreator
  public TeamAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_HANDLE) String handle,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.handle = handle;
    this.name = name;
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
    return Objects.equals(this.createdAt, teamAttributes.createdAt)
        && Objects.equals(this.description, teamAttributes.description)
        && Objects.equals(this.handle, teamAttributes.handle)
        && Objects.equals(this.linkCount, teamAttributes.linkCount)
        && Objects.equals(this.modifiedAt, teamAttributes.modifiedAt)
        && Objects.equals(this.name, teamAttributes.name)
        && Objects.equals(this.summary, teamAttributes.summary)
        && Objects.equals(this.userCount, teamAttributes.userCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt, description, handle, linkCount, modifiedAt, name, summary, userCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    handle: ").append(toIndentedString(handle)).append("\n");
    sb.append("    linkCount: ").append(toIndentedString(linkCount)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
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
