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

/** Metadata about the dashboard. */
@JsonPropertyOrder({
  DashboardSearchMetadata.JSON_PROPERTY_AUTHOR,
  DashboardSearchMetadata.JSON_PROPERTY_CREATED_AT,
  DashboardSearchMetadata.JSON_PROPERTY_DELETED_AT,
  DashboardSearchMetadata.JSON_PROPERTY_EMBEDDABLE_DOMAINS,
  DashboardSearchMetadata.JSON_PROPERTY_EXPERIENCE_TYPE,
  DashboardSearchMetadata.JSON_PROPERTY_EXPIRATION,
  DashboardSearchMetadata.JSON_PROPERTY_HAS_MONITORS,
  DashboardSearchMetadata.JSON_PROPERTY_IS_FAVORITED,
  DashboardSearchMetadata.JSON_PROPERTY_IS_PUBLIC_DASHBOARD_OWNERLESS,
  DashboardSearchMetadata.JSON_PROPERTY_IS_SHARED,
  DashboardSearchMetadata.JSON_PROPERTY_LAST_ACCESSED,
  DashboardSearchMetadata.JSON_PROPERTY_MODIFIED_AT,
  DashboardSearchMetadata.JSON_PROPERTY_POPULARITY,
  DashboardSearchMetadata.JSON_PROPERTY_PUBLIC_TITLE,
  DashboardSearchMetadata.JSON_PROPERTY_QUALITY_SCORE,
  DashboardSearchMetadata.JSON_PROPERTY_SHARE_LIST,
  DashboardSearchMetadata.JSON_PROPERTY_SHARE_TYPE,
  DashboardSearchMetadata.JSON_PROPERTY_SHARED_BY,
  DashboardSearchMetadata.JSON_PROPERTY_STATUS,
  DashboardSearchMetadata.JSON_PROPERTY_TOKEN,
  DashboardSearchMetadata.JSON_PROPERTY_TYPE,
  DashboardSearchMetadata.JSON_PROPERTY_URL,
  DashboardSearchMetadata.JSON_PROPERTY_WIDGET_COUNT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DashboardSearchMetadata {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHOR = "author";
  private DashboardSearchUser author;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DELETED_AT = "deleted_at";
  private OffsetDateTime deletedAt;

  public static final String JSON_PROPERTY_EMBEDDABLE_DOMAINS = "embeddable_domains";
  private List<String> embeddableDomains = new ArrayList<>();

  public static final String JSON_PROPERTY_EXPERIENCE_TYPE = "experience_type";
  private String experienceType;

  public static final String JSON_PROPERTY_EXPIRATION = "expiration";
  private OffsetDateTime expiration;

  public static final String JSON_PROPERTY_HAS_MONITORS = "has_monitors";
  private Boolean hasMonitors;

  public static final String JSON_PROPERTY_IS_FAVORITED = "is_favorited";
  private Boolean isFavorited;

  public static final String JSON_PROPERTY_IS_PUBLIC_DASHBOARD_OWNERLESS =
      "is_public_dashboard_ownerless";
  private Boolean isPublicDashboardOwnerless;

  public static final String JSON_PROPERTY_IS_SHARED = "is_shared";
  private Boolean isShared;

  public static final String JSON_PROPERTY_LAST_ACCESSED = "last_accessed";
  private OffsetDateTime lastAccessed;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_POPULARITY = "popularity";
  private Double popularity;

  public static final String JSON_PROPERTY_PUBLIC_TITLE = "public_title";
  private String publicTitle;

  public static final String JSON_PROPERTY_QUALITY_SCORE = "quality_score";
  private Double qualityScore;

  public static final String JSON_PROPERTY_SHARE_LIST = "share_list";
  private List<String> shareList = new ArrayList<>();

  public static final String JSON_PROPERTY_SHARE_TYPE = "share_type";
  private String shareType;

  public static final String JSON_PROPERTY_SHARED_BY = "shared_by";
  private DashboardSearchUser sharedBy;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TOKEN = "token";
  private String token;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_WIDGET_COUNT = "widget_count";
  private Long widgetCount;

  public DashboardSearchMetadata() {}

  @JsonCreator
  public DashboardSearchMetadata(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTHOR) DashboardSearchUser author,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_DELETED_AT) OffsetDateTime deletedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_EMBEDDABLE_DOMAINS)
          List<String> embeddableDomains,
      @JsonProperty(required = true, value = JSON_PROPERTY_EXPERIENCE_TYPE) String experienceType,
      @JsonProperty(required = true, value = JSON_PROPERTY_EXPIRATION) OffsetDateTime expiration,
      @JsonProperty(required = true, value = JSON_PROPERTY_HAS_MONITORS) Boolean hasMonitors,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_FAVORITED) Boolean isFavorited,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_PUBLIC_DASHBOARD_OWNERLESS)
          Boolean isPublicDashboardOwnerless,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_SHARED) Boolean isShared,
      @JsonProperty(required = true, value = JSON_PROPERTY_LAST_ACCESSED)
          OffsetDateTime lastAccessed,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED_AT) OffsetDateTime modifiedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_POPULARITY) Double popularity,
      @JsonProperty(required = true, value = JSON_PROPERTY_PUBLIC_TITLE) String publicTitle,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUALITY_SCORE) Double qualityScore,
      @JsonProperty(required = true, value = JSON_PROPERTY_SHARE_LIST) List<String> shareList,
      @JsonProperty(required = true, value = JSON_PROPERTY_SHARE_TYPE) String shareType,
      @JsonProperty(required = true, value = JSON_PROPERTY_SHARED_BY) DashboardSearchUser sharedBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS) String status,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOKEN) String token,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) String type,
      @JsonProperty(required = true, value = JSON_PROPERTY_URL) String url,
      @JsonProperty(required = true, value = JSON_PROPERTY_WIDGET_COUNT) Long widgetCount) {
    this.author = author;
    this.unparsed |= author.unparsed;
    this.createdAt = createdAt;
    this.deletedAt = deletedAt;
    if (deletedAt != null) {}
    this.embeddableDomains = embeddableDomains;
    if (embeddableDomains != null) {}
    this.experienceType = experienceType;
    this.expiration = expiration;
    if (expiration != null) {}
    this.hasMonitors = hasMonitors;
    if (hasMonitors != null) {}
    this.isFavorited = isFavorited;
    this.isPublicDashboardOwnerless = isPublicDashboardOwnerless;
    this.isShared = isShared;
    this.lastAccessed = lastAccessed;
    if (lastAccessed != null) {}
    this.modifiedAt = modifiedAt;
    this.popularity = popularity;
    this.publicTitle = publicTitle;
    this.qualityScore = qualityScore;
    if (qualityScore != null) {}
    this.shareList = shareList;
    if (shareList != null) {}
    this.shareType = shareType;
    this.sharedBy = sharedBy;
    this.unparsed |= sharedBy.unparsed;
    this.status = status;
    this.token = token;
    this.type = type;
    this.url = url;
    this.widgetCount = widgetCount;
  }

  public DashboardSearchMetadata author(DashboardSearchUser author) {
    this.author = author;
    this.unparsed |= author.unparsed;
    return this;
  }

  /**
   * User information.
   *
   * @return author
   */
  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DashboardSearchUser getAuthor() {
    return author;
  }

  public void setAuthor(DashboardSearchUser author) {
    this.author = author;
  }

  public DashboardSearchMetadata createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Time at which the dashboard was created.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public DashboardSearchMetadata deletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = deletedAt;
    if (deletedAt != null) {}
    return this;
  }

  /**
   * Time at which the dashboard was deleted, or null if not deleted.
   *
   * @return deletedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getDeletedAt() {
    return deletedAt;
  }

  public void setDeletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = deletedAt;
  }

  public DashboardSearchMetadata embeddableDomains(List<String> embeddableDomains) {
    this.embeddableDomains = embeddableDomains;
    return this;
  }

  public DashboardSearchMetadata addEmbeddableDomainsItem(String embeddableDomainsItem) {
    this.embeddableDomains.add(embeddableDomainsItem);
    return this;
  }

  /**
   * List of domains the dashboard is allowed to be embedded in.
   *
   * @return embeddableDomains
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMBEDDABLE_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getEmbeddableDomains() {
    return embeddableDomains;
  }

  public void setEmbeddableDomains(List<String> embeddableDomains) {
    this.embeddableDomains = embeddableDomains;
  }

  public DashboardSearchMetadata experienceType(String experienceType) {
    this.experienceType = experienceType;
    return this;
  }

  /**
   * Dashboard experience type.
   *
   * @return experienceType
   */
  @JsonProperty(JSON_PROPERTY_EXPERIENCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getExperienceType() {
    return experienceType;
  }

  public void setExperienceType(String experienceType) {
    this.experienceType = experienceType;
  }

  public DashboardSearchMetadata expiration(OffsetDateTime expiration) {
    this.expiration = expiration;
    if (expiration != null) {}
    return this;
  }

  /**
   * When the public dashboard link will expire.
   *
   * @return expiration
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getExpiration() {
    return expiration;
  }

  public void setExpiration(OffsetDateTime expiration) {
    this.expiration = expiration;
  }

  public DashboardSearchMetadata hasMonitors(Boolean hasMonitors) {
    this.hasMonitors = hasMonitors;
    if (hasMonitors != null) {}
    return this;
  }

  /**
   * Whether the dashboard has monitors.
   *
   * @return hasMonitors
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_MONITORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getHasMonitors() {
    return hasMonitors;
  }

  public void setHasMonitors(Boolean hasMonitors) {
    this.hasMonitors = hasMonitors;
  }

  public DashboardSearchMetadata isFavorited(Boolean isFavorited) {
    this.isFavorited = isFavorited;
    return this;
  }

  /**
   * Whether the dashboard is favorited by the user.
   *
   * @return isFavorited
   */
  @JsonProperty(JSON_PROPERTY_IS_FAVORITED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsFavorited() {
    return isFavorited;
  }

  public void setIsFavorited(Boolean isFavorited) {
    this.isFavorited = isFavorited;
  }

  public DashboardSearchMetadata isPublicDashboardOwnerless(Boolean isPublicDashboardOwnerless) {
    this.isPublicDashboardOwnerless = isPublicDashboardOwnerless;
    return this;
  }

  /**
   * Whether the public dashboard owner is deactivated.
   *
   * @return isPublicDashboardOwnerless
   */
  @JsonProperty(JSON_PROPERTY_IS_PUBLIC_DASHBOARD_OWNERLESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsPublicDashboardOwnerless() {
    return isPublicDashboardOwnerless;
  }

  public void setIsPublicDashboardOwnerless(Boolean isPublicDashboardOwnerless) {
    this.isPublicDashboardOwnerless = isPublicDashboardOwnerless;
  }

  public DashboardSearchMetadata isShared(Boolean isShared) {
    this.isShared = isShared;
    return this;
  }

  /**
   * Whether the dashboard is shared publicly.
   *
   * @return isShared
   */
  @JsonProperty(JSON_PROPERTY_IS_SHARED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsShared() {
    return isShared;
  }

  public void setIsShared(Boolean isShared) {
    this.isShared = isShared;
  }

  public DashboardSearchMetadata lastAccessed(OffsetDateTime lastAccessed) {
    this.lastAccessed = lastAccessed;
    if (lastAccessed != null) {}
    return this;
  }

  /**
   * Last time the dashboard was accessed.
   *
   * @return lastAccessed
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_ACCESSED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getLastAccessed() {
    return lastAccessed;
  }

  public void setLastAccessed(OffsetDateTime lastAccessed) {
    this.lastAccessed = lastAccessed;
  }

  public DashboardSearchMetadata modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * Time at which the dashboard was last updated.
   *
   * @return modifiedAt
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public DashboardSearchMetadata popularity(Double popularity) {
    this.popularity = popularity;
    return this;
  }

  /**
   * Relative measure of dashboard popularity.
   *
   * @return popularity
   */
  @JsonProperty(JSON_PROPERTY_POPULARITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getPopularity() {
    return popularity;
  }

  public void setPopularity(Double popularity) {
    this.popularity = popularity;
  }

  public DashboardSearchMetadata publicTitle(String publicTitle) {
    this.publicTitle = publicTitle;
    return this;
  }

  /**
   * Published title of the public dashboard.
   *
   * @return publicTitle
   */
  @JsonProperty(JSON_PROPERTY_PUBLIC_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPublicTitle() {
    return publicTitle;
  }

  public void setPublicTitle(String publicTitle) {
    this.publicTitle = publicTitle;
  }

  public DashboardSearchMetadata qualityScore(Double qualityScore) {
    this.qualityScore = qualityScore;
    if (qualityScore != null) {}
    return this;
  }

  /**
   * Quality score of the dashboard.
   *
   * @return qualityScore
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUALITY_SCORE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getQualityScore() {
    return qualityScore;
  }

  public void setQualityScore(Double qualityScore) {
    this.qualityScore = qualityScore;
  }

  public DashboardSearchMetadata shareList(List<String> shareList) {
    this.shareList = shareList;
    return this;
  }

  public DashboardSearchMetadata addShareListItem(String shareListItem) {
    this.shareList.add(shareListItem);
    return this;
  }

  /**
   * List of email addresses for invite-only public dashboards.
   *
   * @return shareList
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHARE_LIST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getShareList() {
    return shareList;
  }

  public void setShareList(List<String> shareList) {
    this.shareList = shareList;
  }

  public DashboardSearchMetadata shareType(String shareType) {
    this.shareType = shareType;
    return this;
  }

  /**
   * Share type of the public dashboard.
   *
   * @return shareType
   */
  @JsonProperty(JSON_PROPERTY_SHARE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getShareType() {
    return shareType;
  }

  public void setShareType(String shareType) {
    this.shareType = shareType;
  }

  public DashboardSearchMetadata sharedBy(DashboardSearchUser sharedBy) {
    this.sharedBy = sharedBy;
    this.unparsed |= sharedBy.unparsed;
    return this;
  }

  /**
   * User information.
   *
   * @return sharedBy
   */
  @JsonProperty(JSON_PROPERTY_SHARED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DashboardSearchUser getSharedBy() {
    return sharedBy;
  }

  public void setSharedBy(DashboardSearchUser sharedBy) {
    this.sharedBy = sharedBy;
  }

  public DashboardSearchMetadata status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the public dashboard.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public DashboardSearchMetadata token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Unique public dashboard token.
   *
   * @return token
   */
  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public DashboardSearchMetadata type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Dashboard type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DashboardSearchMetadata url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL path to the dashboard.
   *
   * @return url
   */
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public DashboardSearchMetadata widgetCount(Long widgetCount) {
    this.widgetCount = widgetCount;
    return this;
  }

  /**
   * Number of widgets in the dashboard.
   *
   * @return widgetCount
   */
  @JsonProperty(JSON_PROPERTY_WIDGET_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getWidgetCount() {
    return widgetCount;
  }

  public void setWidgetCount(Long widgetCount) {
    this.widgetCount = widgetCount;
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
   * @return DashboardSearchMetadata
   */
  @JsonAnySetter
  public DashboardSearchMetadata putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DashboardSearchMetadata object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardSearchMetadata dashboardSearchMetadata = (DashboardSearchMetadata) o;
    return Objects.equals(this.author, dashboardSearchMetadata.author)
        && Objects.equals(this.createdAt, dashboardSearchMetadata.createdAt)
        && Objects.equals(this.deletedAt, dashboardSearchMetadata.deletedAt)
        && Objects.equals(this.embeddableDomains, dashboardSearchMetadata.embeddableDomains)
        && Objects.equals(this.experienceType, dashboardSearchMetadata.experienceType)
        && Objects.equals(this.expiration, dashboardSearchMetadata.expiration)
        && Objects.equals(this.hasMonitors, dashboardSearchMetadata.hasMonitors)
        && Objects.equals(this.isFavorited, dashboardSearchMetadata.isFavorited)
        && Objects.equals(
            this.isPublicDashboardOwnerless, dashboardSearchMetadata.isPublicDashboardOwnerless)
        && Objects.equals(this.isShared, dashboardSearchMetadata.isShared)
        && Objects.equals(this.lastAccessed, dashboardSearchMetadata.lastAccessed)
        && Objects.equals(this.modifiedAt, dashboardSearchMetadata.modifiedAt)
        && Objects.equals(this.popularity, dashboardSearchMetadata.popularity)
        && Objects.equals(this.publicTitle, dashboardSearchMetadata.publicTitle)
        && Objects.equals(this.qualityScore, dashboardSearchMetadata.qualityScore)
        && Objects.equals(this.shareList, dashboardSearchMetadata.shareList)
        && Objects.equals(this.shareType, dashboardSearchMetadata.shareType)
        && Objects.equals(this.sharedBy, dashboardSearchMetadata.sharedBy)
        && Objects.equals(this.status, dashboardSearchMetadata.status)
        && Objects.equals(this.token, dashboardSearchMetadata.token)
        && Objects.equals(this.type, dashboardSearchMetadata.type)
        && Objects.equals(this.url, dashboardSearchMetadata.url)
        && Objects.equals(this.widgetCount, dashboardSearchMetadata.widgetCount)
        && Objects.equals(this.additionalProperties, dashboardSearchMetadata.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        author,
        createdAt,
        deletedAt,
        embeddableDomains,
        experienceType,
        expiration,
        hasMonitors,
        isFavorited,
        isPublicDashboardOwnerless,
        isShared,
        lastAccessed,
        modifiedAt,
        popularity,
        publicTitle,
        qualityScore,
        shareList,
        shareType,
        sharedBy,
        status,
        token,
        type,
        url,
        widgetCount,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardSearchMetadata {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    embeddableDomains: ").append(toIndentedString(embeddableDomains)).append("\n");
    sb.append("    experienceType: ").append(toIndentedString(experienceType)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    hasMonitors: ").append(toIndentedString(hasMonitors)).append("\n");
    sb.append("    isFavorited: ").append(toIndentedString(isFavorited)).append("\n");
    sb.append("    isPublicDashboardOwnerless: ")
        .append(toIndentedString(isPublicDashboardOwnerless))
        .append("\n");
    sb.append("    isShared: ").append(toIndentedString(isShared)).append("\n");
    sb.append("    lastAccessed: ").append(toIndentedString(lastAccessed)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    popularity: ").append(toIndentedString(popularity)).append("\n");
    sb.append("    publicTitle: ").append(toIndentedString(publicTitle)).append("\n");
    sb.append("    qualityScore: ").append(toIndentedString(qualityScore)).append("\n");
    sb.append("    shareList: ").append(toIndentedString(shareList)).append("\n");
    sb.append("    shareType: ").append(toIndentedString(shareType)).append("\n");
    sb.append("    sharedBy: ").append(toIndentedString(sharedBy)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    widgetCount: ").append(toIndentedString(widgetCount)).append("\n");
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
