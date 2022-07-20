/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.datadog.api.client.JsonTimeSerializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Dashboard definition. */
@JsonPropertyOrder({
  DashboardSummaryDefinition.JSON_PROPERTY_AUTHOR_HANDLE,
  DashboardSummaryDefinition.JSON_PROPERTY_CREATED_AT,
  DashboardSummaryDefinition.JSON_PROPERTY_DESCRIPTION,
  DashboardSummaryDefinition.JSON_PROPERTY_ID,
  DashboardSummaryDefinition.JSON_PROPERTY_IS_READ_ONLY,
  DashboardSummaryDefinition.JSON_PROPERTY_LAYOUT_TYPE,
  DashboardSummaryDefinition.JSON_PROPERTY_MODIFIED_AT,
  DashboardSummaryDefinition.JSON_PROPERTY_TITLE,
  DashboardSummaryDefinition.JSON_PROPERTY_URL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DashboardSummaryDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHOR_HANDLE = "author_handle";
  private String authorHandle;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_IS_READ_ONLY = "is_read_only";
  private Boolean isReadOnly;

  public static final String JSON_PROPERTY_LAYOUT_TYPE = "layout_type";
  private DashboardLayoutType layoutType;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public DashboardSummaryDefinition authorHandle(String authorHandle) {
    this.authorHandle = authorHandle;
    return this;
  }

  /**
   * Identifier of the dashboard author.
   *
   * @return authorHandle
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHOR_HANDLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAuthorHandle() {
    return authorHandle;
  }

  public void setAuthorHandle(String authorHandle) {
    this.authorHandle = authorHandle;
  }

  public DashboardSummaryDefinition createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Creation date of the dashboard.
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

  public DashboardSummaryDefinition description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

  /**
   * Description of the dashboard.
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

  public DashboardSummaryDefinition id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Dashboard identifier.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DashboardSummaryDefinition isReadOnly(Boolean isReadOnly) {
    this.isReadOnly = isReadOnly;
    return this;
  }

  /**
   * Whether this dashboard is read-only. If True, only the author and admins can make changes to
   * it.
   *
   * @return isReadOnly
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_READ_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsReadOnly() {
    return isReadOnly;
  }

  public void setIsReadOnly(Boolean isReadOnly) {
    this.isReadOnly = isReadOnly;
  }

  public DashboardSummaryDefinition layoutType(DashboardLayoutType layoutType) {
    this.layoutType = layoutType;
    this.unparsed |= !layoutType.isValid();
    return this;
  }

  /**
   * Layout type of the dashboard.
   *
   * @return layoutType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAYOUT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DashboardLayoutType getLayoutType() {
    return layoutType;
  }

  public void setLayoutType(DashboardLayoutType layoutType) {
    if (!layoutType.isValid()) {
      this.unparsed = true;
    }
    this.layoutType = layoutType;
  }

  public DashboardSummaryDefinition modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * Modification date of the dashboard.
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

  public DashboardSummaryDefinition title(String title) {
    this.title = title;
    return this;
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

  public void setTitle(String title) {
    this.title = title;
  }

  public DashboardSummaryDefinition url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL of the dashboard.
   *
   * @return url
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  /** Return true if this DashboardSummaryDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardSummaryDefinition dashboardSummaryDefinition = (DashboardSummaryDefinition) o;
    return Objects.equals(this.authorHandle, dashboardSummaryDefinition.authorHandle)
        && Objects.equals(this.createdAt, dashboardSummaryDefinition.createdAt)
        && Objects.equals(this.description, dashboardSummaryDefinition.description)
        && Objects.equals(this.id, dashboardSummaryDefinition.id)
        && Objects.equals(this.isReadOnly, dashboardSummaryDefinition.isReadOnly)
        && Objects.equals(this.layoutType, dashboardSummaryDefinition.layoutType)
        && Objects.equals(this.modifiedAt, dashboardSummaryDefinition.modifiedAt)
        && Objects.equals(this.title, dashboardSummaryDefinition.title)
        && Objects.equals(this.url, dashboardSummaryDefinition.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        authorHandle, createdAt, description, id, isReadOnly, layoutType, modifiedAt, title, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardSummaryDefinition {\n");
    sb.append("    authorHandle: ").append(toIndentedString(authorHandle)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isReadOnly: ").append(toIndentedString(isReadOnly)).append("\n");
    sb.append("    layoutType: ").append(toIndentedString(layoutType)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
