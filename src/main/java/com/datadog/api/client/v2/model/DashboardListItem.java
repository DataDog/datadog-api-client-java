/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.datadog.api.client.JsonTimeSerializer;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;
import java.util.Objects;

/** A dashboard within a list. */
@JsonPropertyOrder({
  DashboardListItem.JSON_PROPERTY_AUTHOR,
  DashboardListItem.JSON_PROPERTY_CREATED,
  DashboardListItem.JSON_PROPERTY_ICON,
  DashboardListItem.JSON_PROPERTY_ID,
  DashboardListItem.JSON_PROPERTY_IS_FAVORITE,
  DashboardListItem.JSON_PROPERTY_IS_READ_ONLY,
  DashboardListItem.JSON_PROPERTY_IS_SHARED,
  DashboardListItem.JSON_PROPERTY_MODIFIED,
  DashboardListItem.JSON_PROPERTY_POPULARITY,
  DashboardListItem.JSON_PROPERTY_TITLE,
  DashboardListItem.JSON_PROPERTY_TYPE,
  DashboardListItem.JSON_PROPERTY_URL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DashboardListItem {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHOR = "author";
  private Creator author;

  public static final String JSON_PROPERTY_CREATED = "created";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_ICON = "icon";
  private String icon;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_IS_FAVORITE = "is_favorite";
  private Boolean isFavorite;

  public static final String JSON_PROPERTY_IS_READ_ONLY = "is_read_only";
  private Boolean isReadOnly;

  public static final String JSON_PROPERTY_IS_SHARED = "is_shared";
  private Boolean isShared;

  public static final String JSON_PROPERTY_MODIFIED = "modified";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime modified;

  public static final String JSON_PROPERTY_POPULARITY = "popularity";
  private Integer popularity;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TYPE = "type";
  private DashboardType type;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public DashboardListItem() {}

  @JsonCreator
  public DashboardListItem(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) DashboardType type) {
    this.id = id;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public DashboardListItem author(Creator author) {
    this.author = author;
    this.unparsed |= author.unparsed;
    return this;
  }

  /**
   * Creator of the object.
   *
   * @return author
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Creator getAuthor() {
    return author;
  }

  public void setAuthor(Creator author) {
    this.author = author;
  }

  /**
   * Date of creation of the dashboard.
   *
   * @return created
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreated() {
    return created;
  }

  /**
   * URL to the icon of the dashboard.
   *
   * @return icon
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ICON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIcon() {
    return icon;
  }

  public DashboardListItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the dashboard.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Whether or not the dashboard is in the favorites.
   *
   * @return isFavorite
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_FAVORITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsFavorite() {
    return isFavorite;
  }

  /**
   * Whether or not the dashboard is read only.
   *
   * @return isReadOnly
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_READ_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsReadOnly() {
    return isReadOnly;
  }

  /**
   * Whether the dashboard is publicly shared or not.
   *
   * @return isShared
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_SHARED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsShared() {
    return isShared;
  }

  /**
   * Date of last edition of the dashboard.
   *
   * @return modified
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getModified() {
    return modified;
  }

  /**
   * Popularity of the dashboard. maximum: 5
   *
   * @return popularity
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POPULARITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getPopularity() {
    return popularity;
  }

  /**
   * Title of the dashboard.
   *
   * @return title
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }

  public DashboardListItem type(DashboardType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of the dashboard.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DashboardType getType() {
    return type;
  }

  public void setType(DashboardType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * URL path to the dashboard.
   *
   * @return url
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUrl() {
    return url;
  }

  /** Return true if this DashboardListItem object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardListItem dashboardListItem = (DashboardListItem) o;
    return Objects.equals(this.author, dashboardListItem.author)
        && Objects.equals(this.created, dashboardListItem.created)
        && Objects.equals(this.icon, dashboardListItem.icon)
        && Objects.equals(this.id, dashboardListItem.id)
        && Objects.equals(this.isFavorite, dashboardListItem.isFavorite)
        && Objects.equals(this.isReadOnly, dashboardListItem.isReadOnly)
        && Objects.equals(this.isShared, dashboardListItem.isShared)
        && Objects.equals(this.modified, dashboardListItem.modified)
        && Objects.equals(this.popularity, dashboardListItem.popularity)
        && Objects.equals(this.title, dashboardListItem.title)
        && Objects.equals(this.type, dashboardListItem.type)
        && Objects.equals(this.url, dashboardListItem.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        author,
        created,
        icon,
        id,
        isFavorite,
        isReadOnly,
        isShared,
        modified,
        popularity,
        title,
        type,
        url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardListItem {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isFavorite: ").append(toIndentedString(isFavorite)).append("\n");
    sb.append("    isReadOnly: ").append(toIndentedString(isReadOnly)).append("\n");
    sb.append("    isShared: ").append(toIndentedString(isShared)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    popularity: ").append(toIndentedString(popularity)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
