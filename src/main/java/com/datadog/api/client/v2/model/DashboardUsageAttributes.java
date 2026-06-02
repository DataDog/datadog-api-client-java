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

/**
 * Usage statistics for a dashboard. The <code>viewer</code> field and all view-count fields (<code>
 * total_views</code>, <code>viewed_at</code>, <code>total_views_by_type</code>) are populated only
 * when Real User Monitoring (RUM) is active for the org.
 */
@JsonPropertyOrder({
  DashboardUsageAttributes.JSON_PROPERTY_AUTHOR,
  DashboardUsageAttributes.JSON_PROPERTY_CREATED_AT,
  DashboardUsageAttributes.JSON_PROPERTY_DASHBOARD_QUALITY_SCORE,
  DashboardUsageAttributes.JSON_PROPERTY_EDITED_AT,
  DashboardUsageAttributes.JSON_PROPERTY_ORG_ID,
  DashboardUsageAttributes.JSON_PROPERTY_TEAMS,
  DashboardUsageAttributes.JSON_PROPERTY_TITLE,
  DashboardUsageAttributes.JSON_PROPERTY_TOTAL_VIEWS,
  DashboardUsageAttributes.JSON_PROPERTY_TOTAL_VIEWS_BY_TYPE,
  DashboardUsageAttributes.JSON_PROPERTY_VIEWED_AT,
  DashboardUsageAttributes.JSON_PROPERTY_VIEWER,
  DashboardUsageAttributes.JSON_PROPERTY_WIDGET_COUNT,
  DashboardUsageAttributes.JSON_PROPERTY_WIDGET_COUNT_BY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DashboardUsageAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHOR = "author";
  private JsonNullable<DashboardUsageUser> author = JsonNullable.<DashboardUsageUser>undefined();

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private JsonNullable<OffsetDateTime> createdAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_DASHBOARD_QUALITY_SCORE = "dashboard_quality_score";
  private JsonNullable<Double> dashboardQualityScore = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_EDITED_AT = "edited_at";
  private JsonNullable<OffsetDateTime> editedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_ORG_ID = "org_id";
  private Long orgId;

  public static final String JSON_PROPERTY_TEAMS = "teams";
  private JsonNullable<List<String>> teams = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TOTAL_VIEWS = "total_views";
  private Long totalViews;

  public static final String JSON_PROPERTY_TOTAL_VIEWS_BY_TYPE = "total_views_by_type";
  private JsonNullable<Map<String, Long>> totalViewsByType =
      JsonNullable.<Map<String, Long>>undefined();

  public static final String JSON_PROPERTY_VIEWED_AT = "viewed_at";
  private JsonNullable<OffsetDateTime> viewedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_VIEWER = "viewer";
  private JsonNullable<DashboardUsageUser> viewer = JsonNullable.<DashboardUsageUser>undefined();

  public static final String JSON_PROPERTY_WIDGET_COUNT = "widget_count";
  private JsonNullable<Long> widgetCount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_WIDGET_COUNT_BY_TYPE = "widget_count_by_type";
  private JsonNullable<Map<String, Long>> widgetCountByType =
      JsonNullable.<Map<String, Long>>undefined();

  public DashboardUsageAttributes() {}

  @JsonCreator
  public DashboardUsageAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ORG_ID) Long orgId) {
    this.orgId = orgId;
  }

  public DashboardUsageAttributes author(DashboardUsageUser author) {
    this.author = JsonNullable.<DashboardUsageUser>of(author);
    return this;
  }

  /**
   * A user referenced from a dashboard usage record (author or viewer).
   *
   * @return author
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public DashboardUsageUser getAuthor() {
    return author.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<DashboardUsageUser> getAuthor_JsonNullable() {
    return author;
  }

  @JsonProperty(JSON_PROPERTY_AUTHOR)
  public void setAuthor_JsonNullable(JsonNullable<DashboardUsageUser> author) {
    this.author = author;
  }

  public void setAuthor(DashboardUsageUser author) {
    this.author = JsonNullable.<DashboardUsageUser>of(author);
  }

  public DashboardUsageAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = JsonNullable.<OffsetDateTime>of(createdAt);
    return this;
  }

  /**
   * When the dashboard was created.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getCreatedAt() {
    return createdAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getCreatedAt_JsonNullable() {
    return createdAt;
  }

  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  public void setCreatedAt_JsonNullable(JsonNullable<OffsetDateTime> createdAt) {
    this.createdAt = createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = JsonNullable.<OffsetDateTime>of(createdAt);
  }

  public DashboardUsageAttributes dashboardQualityScore(Double dashboardQualityScore) {
    this.dashboardQualityScore = JsonNullable.<Double>of(dashboardQualityScore);
    return this;
  }

  /**
   * The dashboard quality score, or <code>null</code> when no score is available.
   *
   * @return dashboardQualityScore
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getDashboardQualityScore() {
    return dashboardQualityScore.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DASHBOARD_QUALITY_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getDashboardQualityScore_JsonNullable() {
    return dashboardQualityScore;
  }

  @JsonProperty(JSON_PROPERTY_DASHBOARD_QUALITY_SCORE)
  public void setDashboardQualityScore_JsonNullable(JsonNullable<Double> dashboardQualityScore) {
    this.dashboardQualityScore = dashboardQualityScore;
  }

  public void setDashboardQualityScore(Double dashboardQualityScore) {
    this.dashboardQualityScore = JsonNullable.<Double>of(dashboardQualityScore);
  }

  public DashboardUsageAttributes editedAt(OffsetDateTime editedAt) {
    this.editedAt = JsonNullable.<OffsetDateTime>of(editedAt);
    return this;
  }

  /**
   * When the dashboard was most recently edited.
   *
   * @return editedAt
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getEditedAt() {
    return editedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EDITED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getEditedAt_JsonNullable() {
    return editedAt;
  }

  @JsonProperty(JSON_PROPERTY_EDITED_AT)
  public void setEditedAt_JsonNullable(JsonNullable<OffsetDateTime> editedAt) {
    this.editedAt = editedAt;
  }

  public void setEditedAt(OffsetDateTime editedAt) {
    this.editedAt = JsonNullable.<OffsetDateTime>of(editedAt);
  }

  public DashboardUsageAttributes orgId(Long orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * The Datadog organization that owns the dashboard.
   *
   * @return orgId
   */
  @JsonProperty(JSON_PROPERTY_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getOrgId() {
    return orgId;
  }

  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }

  public DashboardUsageAttributes teams(List<String> teams) {
    this.teams = JsonNullable.<List<String>>of(teams);
    return this;
  }

  public DashboardUsageAttributes addTeamsItem(String teamsItem) {
    if (this.teams == null || !this.teams.isPresent()) {
      this.teams = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.teams.get().add(teamsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Teams the dashboard is tagged with.
   *
   * @return teams
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<String> getTeams() {
    return teams.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getTeams_JsonNullable() {
    return teams;
  }

  @JsonProperty(JSON_PROPERTY_TEAMS)
  public void setTeams_JsonNullable(JsonNullable<List<String>> teams) {
    this.teams = teams;
  }

  public void setTeams(List<String> teams) {
    this.teams = JsonNullable.<List<String>>of(teams);
  }

  public DashboardUsageAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The dashboard title.
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

  public DashboardUsageAttributes totalViews(Long totalViews) {
    this.totalViews = totalViews;
    return this;
  }

  /**
   * Total view count for the dashboard. Counts only views captured by Real User Monitoring (RUM);
   * <code>0</code> in orgs without RUM.
   *
   * @return totalViews
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_VIEWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotalViews() {
    return totalViews;
  }

  public void setTotalViews(Long totalViews) {
    this.totalViews = totalViews;
  }

  public DashboardUsageAttributes totalViewsByType(Map<String, Long> totalViewsByType) {
    this.totalViewsByType = JsonNullable.<Map<String, Long>>of(totalViewsByType);
    return this;
  }

  public DashboardUsageAttributes putTotalViewsByTypeItem(String key, Long totalViewsByTypeItem) {
    if (this.totalViewsByType == null || !this.totalViewsByType.isPresent()) {
      this.totalViewsByType = JsonNullable.<Map<String, Long>>of(new HashMap<>());
    }
    try {
      this.totalViewsByType.get().put(key, totalViewsByTypeItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * View counts keyed by view type (<code>in_app</code>, <code>embed</code>, <code>public</code>,
   * <code>shared</code>, <code>api</code>, <code>unknown</code>). Counts only views captured by
   * Real User Monitoring (RUM); empty in orgs without RUM.
   *
   * @return totalViewsByType
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Map<String, Long> getTotalViewsByType() {
    return totalViewsByType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TOTAL_VIEWS_BY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Map<String, Long>> getTotalViewsByType_JsonNullable() {
    return totalViewsByType;
  }

  @JsonProperty(JSON_PROPERTY_TOTAL_VIEWS_BY_TYPE)
  public void setTotalViewsByType_JsonNullable(JsonNullable<Map<String, Long>> totalViewsByType) {
    this.totalViewsByType = totalViewsByType;
  }

  public void setTotalViewsByType(Map<String, Long> totalViewsByType) {
    this.totalViewsByType = JsonNullable.<Map<String, Long>>of(totalViewsByType);
  }

  public DashboardUsageAttributes viewedAt(OffsetDateTime viewedAt) {
    this.viewedAt = JsonNullable.<OffsetDateTime>of(viewedAt);
    return this;
  }

  /**
   * When the dashboard was most recently viewed. Populated only when Real User Monitoring (RUM) is
   * active for the org; <code>null</code> in orgs without RUM.
   *
   * @return viewedAt
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getViewedAt() {
    return viewedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VIEWED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getViewedAt_JsonNullable() {
    return viewedAt;
  }

  @JsonProperty(JSON_PROPERTY_VIEWED_AT)
  public void setViewedAt_JsonNullable(JsonNullable<OffsetDateTime> viewedAt) {
    this.viewedAt = viewedAt;
  }

  public void setViewedAt(OffsetDateTime viewedAt) {
    this.viewedAt = JsonNullable.<OffsetDateTime>of(viewedAt);
  }

  public DashboardUsageAttributes viewer(DashboardUsageUser viewer) {
    this.viewer = JsonNullable.<DashboardUsageUser>of(viewer);
    return this;
  }

  /**
   * A user referenced from a dashboard usage record (author or viewer).
   *
   * @return viewer
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public DashboardUsageUser getViewer() {
    return viewer.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VIEWER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<DashboardUsageUser> getViewer_JsonNullable() {
    return viewer;
  }

  @JsonProperty(JSON_PROPERTY_VIEWER)
  public void setViewer_JsonNullable(JsonNullable<DashboardUsageUser> viewer) {
    this.viewer = viewer;
  }

  public void setViewer(DashboardUsageUser viewer) {
    this.viewer = JsonNullable.<DashboardUsageUser>of(viewer);
  }

  public DashboardUsageAttributes widgetCount(Long widgetCount) {
    this.widgetCount = JsonNullable.<Long>of(widgetCount);
    return this;
  }

  /**
   * The total number of widgets on the dashboard.
   *
   * @return widgetCount
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getWidgetCount() {
    return widgetCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WIDGET_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getWidgetCount_JsonNullable() {
    return widgetCount;
  }

  @JsonProperty(JSON_PROPERTY_WIDGET_COUNT)
  public void setWidgetCount_JsonNullable(JsonNullable<Long> widgetCount) {
    this.widgetCount = widgetCount;
  }

  public void setWidgetCount(Long widgetCount) {
    this.widgetCount = JsonNullable.<Long>of(widgetCount);
  }

  public DashboardUsageAttributes widgetCountByType(Map<String, Long> widgetCountByType) {
    this.widgetCountByType = JsonNullable.<Map<String, Long>>of(widgetCountByType);
    return this;
  }

  public DashboardUsageAttributes putWidgetCountByTypeItem(String key, Long widgetCountByTypeItem) {
    if (this.widgetCountByType == null || !this.widgetCountByType.isPresent()) {
      this.widgetCountByType = JsonNullable.<Map<String, Long>>of(new HashMap<>());
    }
    try {
      this.widgetCountByType.get().put(key, widgetCountByTypeItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Widget counts keyed by widget type. The map includes group widgets and widgets without
   * requests.
   *
   * @return widgetCountByType
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Map<String, Long> getWidgetCountByType() {
    return widgetCountByType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WIDGET_COUNT_BY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Map<String, Long>> getWidgetCountByType_JsonNullable() {
    return widgetCountByType;
  }

  @JsonProperty(JSON_PROPERTY_WIDGET_COUNT_BY_TYPE)
  public void setWidgetCountByType_JsonNullable(JsonNullable<Map<String, Long>> widgetCountByType) {
    this.widgetCountByType = widgetCountByType;
  }

  public void setWidgetCountByType(Map<String, Long> widgetCountByType) {
    this.widgetCountByType = JsonNullable.<Map<String, Long>>of(widgetCountByType);
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
   * @return DashboardUsageAttributes
   */
  @JsonAnySetter
  public DashboardUsageAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DashboardUsageAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardUsageAttributes dashboardUsageAttributes = (DashboardUsageAttributes) o;
    return Objects.equals(this.author, dashboardUsageAttributes.author)
        && Objects.equals(this.createdAt, dashboardUsageAttributes.createdAt)
        && Objects.equals(
            this.dashboardQualityScore, dashboardUsageAttributes.dashboardQualityScore)
        && Objects.equals(this.editedAt, dashboardUsageAttributes.editedAt)
        && Objects.equals(this.orgId, dashboardUsageAttributes.orgId)
        && Objects.equals(this.teams, dashboardUsageAttributes.teams)
        && Objects.equals(this.title, dashboardUsageAttributes.title)
        && Objects.equals(this.totalViews, dashboardUsageAttributes.totalViews)
        && Objects.equals(this.totalViewsByType, dashboardUsageAttributes.totalViewsByType)
        && Objects.equals(this.viewedAt, dashboardUsageAttributes.viewedAt)
        && Objects.equals(this.viewer, dashboardUsageAttributes.viewer)
        && Objects.equals(this.widgetCount, dashboardUsageAttributes.widgetCount)
        && Objects.equals(this.widgetCountByType, dashboardUsageAttributes.widgetCountByType)
        && Objects.equals(this.additionalProperties, dashboardUsageAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        author,
        createdAt,
        dashboardQualityScore,
        editedAt,
        orgId,
        teams,
        title,
        totalViews,
        totalViewsByType,
        viewedAt,
        viewer,
        widgetCount,
        widgetCountByType,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardUsageAttributes {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    dashboardQualityScore: ")
        .append(toIndentedString(dashboardQualityScore))
        .append("\n");
    sb.append("    editedAt: ").append(toIndentedString(editedAt)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    totalViews: ").append(toIndentedString(totalViews)).append("\n");
    sb.append("    totalViewsByType: ").append(toIndentedString(totalViewsByType)).append("\n");
    sb.append("    viewedAt: ").append(toIndentedString(viewedAt)).append("\n");
    sb.append("    viewer: ").append(toIndentedString(viewer)).append("\n");
    sb.append("    widgetCount: ").append(toIndentedString(widgetCount)).append("\n");
    sb.append("    widgetCountByType: ").append(toIndentedString(widgetCountByType)).append("\n");
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
