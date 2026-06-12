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

/** Attributes of a shared dashboard response. */
@JsonPropertyOrder({
  SharedDashboardResponseAttributes.JSON_PROPERTY_CREATED_AT,
  SharedDashboardResponseAttributes.JSON_PROPERTY_EMBEDDABLE_DOMAINS,
  SharedDashboardResponseAttributes.JSON_PROPERTY_EXPIRATION,
  SharedDashboardResponseAttributes.JSON_PROPERTY_GLOBAL_TIME,
  SharedDashboardResponseAttributes.JSON_PROPERTY_GLOBAL_TIME_SELECTABLE,
  SharedDashboardResponseAttributes.JSON_PROPERTY_INVITEES,
  SharedDashboardResponseAttributes.JSON_PROPERTY_LAST_ACCESSED,
  SharedDashboardResponseAttributes.JSON_PROPERTY_SELECTABLE_TEMPLATE_VARS,
  SharedDashboardResponseAttributes.JSON_PROPERTY_SHARE_TYPE,
  SharedDashboardResponseAttributes.JSON_PROPERTY_SHARER_DISABLED,
  SharedDashboardResponseAttributes.JSON_PROPERTY_STATUS,
  SharedDashboardResponseAttributes.JSON_PROPERTY_TITLE,
  SharedDashboardResponseAttributes.JSON_PROPERTY_TOKEN,
  SharedDashboardResponseAttributes.JSON_PROPERTY_URL,
  SharedDashboardResponseAttributes.JSON_PROPERTY_VIEWING_PREFERENCES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SharedDashboardResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_EMBEDDABLE_DOMAINS = "embeddable_domains";
  private List<String> embeddableDomains = new ArrayList<>();

  public static final String JSON_PROPERTY_EXPIRATION = "expiration";
  private OffsetDateTime expiration;

  public static final String JSON_PROPERTY_GLOBAL_TIME = "global_time";
  private Map<String, Object> globalTime = new HashMap<String, Object>();

  public static final String JSON_PROPERTY_GLOBAL_TIME_SELECTABLE = "global_time_selectable";
  private Boolean globalTimeSelectable;

  public static final String JSON_PROPERTY_INVITEES = "invitees";
  private List<SharedDashboardInvitee> invitees = new ArrayList<>();

  public static final String JSON_PROPERTY_LAST_ACCESSED = "last_accessed";
  private OffsetDateTime lastAccessed;

  public static final String JSON_PROPERTY_SELECTABLE_TEMPLATE_VARS = "selectable_template_vars";
  private List<SharedDashboardSelectableTemplateVariable> selectableTemplateVars =
      new ArrayList<>();

  public static final String JSON_PROPERTY_SHARE_TYPE = "share_type";
  private SharedDashboardShareType shareType;

  public static final String JSON_PROPERTY_SHARER_DISABLED = "sharer_disabled";
  private Boolean sharerDisabled;

  public static final String JSON_PROPERTY_STATUS = "status";
  private SharedDashboardStatus status;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TOKEN = "token";
  private String token;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_VIEWING_PREFERENCES = "viewing_preferences";
  private SharedDashboardViewingPreferences viewingPreferences;

  public SharedDashboardResponseAttributes() {}

  @JsonCreator
  public SharedDashboardResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_EMBEDDABLE_DOMAINS)
          List<String> embeddableDomains,
      @JsonProperty(required = true, value = JSON_PROPERTY_EXPIRATION) OffsetDateTime expiration,
      @JsonProperty(required = true, value = JSON_PROPERTY_GLOBAL_TIME)
          Map<String, Object> globalTime,
      @JsonProperty(required = true, value = JSON_PROPERTY_GLOBAL_TIME_SELECTABLE)
          Boolean globalTimeSelectable,
      @JsonProperty(required = true, value = JSON_PROPERTY_INVITEES)
          List<SharedDashboardInvitee> invitees,
      @JsonProperty(required = true, value = JSON_PROPERTY_LAST_ACCESSED)
          OffsetDateTime lastAccessed,
      @JsonProperty(required = true, value = JSON_PROPERTY_SELECTABLE_TEMPLATE_VARS)
          List<SharedDashboardSelectableTemplateVariable> selectableTemplateVars,
      @JsonProperty(required = true, value = JSON_PROPERTY_SHARE_TYPE)
          SharedDashboardShareType shareType,
      @JsonProperty(required = true, value = JSON_PROPERTY_SHARER_DISABLED) Boolean sharerDisabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS) SharedDashboardStatus status,
      @JsonProperty(required = true, value = JSON_PROPERTY_TITLE) String title,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOKEN) String token,
      @JsonProperty(required = true, value = JSON_PROPERTY_URL) String url,
      @JsonProperty(required = true, value = JSON_PROPERTY_VIEWING_PREFERENCES)
          SharedDashboardViewingPreferences viewingPreferences) {
    this.createdAt = createdAt;
    this.embeddableDomains = embeddableDomains;
    this.expiration = expiration;
    if (expiration != null) {}
    this.globalTime = globalTime;
    if (globalTime != null) {}
    this.globalTimeSelectable = globalTimeSelectable;
    this.invitees = invitees;
    this.lastAccessed = lastAccessed;
    if (lastAccessed != null) {}
    this.selectableTemplateVars = selectableTemplateVars;
    this.shareType = shareType;
    this.unparsed |= !shareType.isValid();
    this.sharerDisabled = sharerDisabled;
    this.status = status;
    this.unparsed |= !status.isValid();
    this.title = title;
    this.token = token;
    this.url = url;
    this.viewingPreferences = viewingPreferences;
    this.unparsed |= viewingPreferences.unparsed;
  }

  public SharedDashboardResponseAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Time when the shared dashboard was created.
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

  public SharedDashboardResponseAttributes embeddableDomains(List<String> embeddableDomains) {
    this.embeddableDomains = embeddableDomains;
    return this;
  }

  public SharedDashboardResponseAttributes addEmbeddableDomainsItem(String embeddableDomainsItem) {
    this.embeddableDomains.add(embeddableDomainsItem);
    return this;
  }

  /**
   * Domains where embed-type shared dashboards can be embedded.
   *
   * @return embeddableDomains
   */
  @JsonProperty(JSON_PROPERTY_EMBEDDABLE_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getEmbeddableDomains() {
    return embeddableDomains;
  }

  public void setEmbeddableDomains(List<String> embeddableDomains) {
    this.embeddableDomains = embeddableDomains;
  }

  public SharedDashboardResponseAttributes expiration(OffsetDateTime expiration) {
    this.expiration = expiration;
    if (expiration != null) {}
    return this;
  }

  /**
   * Time when the shared dashboard expires.
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

  public SharedDashboardResponseAttributes globalTime(Map<String, Object> globalTime) {
    this.globalTime = globalTime;
    if (globalTime != null) {}
    return this;
  }

  public SharedDashboardResponseAttributes putGlobalTimeItem(String key, Object globalTimeItem) {
    this.globalTime.put(key, globalTimeItem);
    return this;
  }

  /**
   * Default time range configuration for the shared dashboard.
   *
   * @return globalTime
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GLOBAL_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, Object> getGlobalTime() {
    return globalTime;
  }

  public void setGlobalTime(Map<String, Object> globalTime) {
    this.globalTime = globalTime;
  }

  public SharedDashboardResponseAttributes globalTimeSelectable(Boolean globalTimeSelectable) {
    this.globalTimeSelectable = globalTimeSelectable;
    return this;
  }

  /**
   * Whether viewers can select a different global time setting.
   *
   * @return globalTimeSelectable
   */
  @JsonProperty(JSON_PROPERTY_GLOBAL_TIME_SELECTABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getGlobalTimeSelectable() {
    return globalTimeSelectable;
  }

  public void setGlobalTimeSelectable(Boolean globalTimeSelectable) {
    this.globalTimeSelectable = globalTimeSelectable;
  }

  public SharedDashboardResponseAttributes invitees(List<SharedDashboardInvitee> invitees) {
    this.invitees = invitees;
    for (SharedDashboardInvitee item : invitees) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SharedDashboardResponseAttributes addInviteesItem(SharedDashboardInvitee inviteesItem) {
    this.invitees.add(inviteesItem);
    this.unparsed |= inviteesItem.unparsed;
    return this;
  }

  /**
   * Invitees for invite-only shared dashboards.
   *
   * @return invitees
   */
  @JsonProperty(JSON_PROPERTY_INVITEES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SharedDashboardInvitee> getInvitees() {
    return invitees;
  }

  public void setInvitees(List<SharedDashboardInvitee> invitees) {
    this.invitees = invitees;
  }

  public SharedDashboardResponseAttributes lastAccessed(OffsetDateTime lastAccessed) {
    this.lastAccessed = lastAccessed;
    if (lastAccessed != null) {}
    return this;
  }

  /**
   * Time when the shared dashboard was last accessed.
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

  public SharedDashboardResponseAttributes selectableTemplateVars(
      List<SharedDashboardSelectableTemplateVariable> selectableTemplateVars) {
    this.selectableTemplateVars = selectableTemplateVars;
    for (SharedDashboardSelectableTemplateVariable item : selectableTemplateVars) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SharedDashboardResponseAttributes addSelectableTemplateVarsItem(
      SharedDashboardSelectableTemplateVariable selectableTemplateVarsItem) {
    this.selectableTemplateVars.add(selectableTemplateVarsItem);
    this.unparsed |= selectableTemplateVarsItem.unparsed;
    return this;
  }

  /**
   * Template variables that viewers can modify.
   *
   * @return selectableTemplateVars
   */
  @JsonProperty(JSON_PROPERTY_SELECTABLE_TEMPLATE_VARS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SharedDashboardSelectableTemplateVariable> getSelectableTemplateVars() {
    return selectableTemplateVars;
  }

  public void setSelectableTemplateVars(
      List<SharedDashboardSelectableTemplateVariable> selectableTemplateVars) {
    this.selectableTemplateVars = selectableTemplateVars;
  }

  public SharedDashboardResponseAttributes shareType(SharedDashboardShareType shareType) {
    this.shareType = shareType;
    this.unparsed |= !shareType.isValid();
    return this;
  }

  /**
   * Type of dashboard sharing.
   *
   * @return shareType
   */
  @JsonProperty(JSON_PROPERTY_SHARE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SharedDashboardShareType getShareType() {
    return shareType;
  }

  public void setShareType(SharedDashboardShareType shareType) {
    if (!shareType.isValid()) {
      this.unparsed = true;
    }
    this.shareType = shareType;
  }

  public SharedDashboardResponseAttributes sharerDisabled(Boolean sharerDisabled) {
    this.sharerDisabled = sharerDisabled;
    return this;
  }

  /**
   * Whether the user who shared the dashboard is disabled.
   *
   * @return sharerDisabled
   */
  @JsonProperty(JSON_PROPERTY_SHARER_DISABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getSharerDisabled() {
    return sharerDisabled;
  }

  public void setSharerDisabled(Boolean sharerDisabled) {
    this.sharerDisabled = sharerDisabled;
  }

  public SharedDashboardResponseAttributes status(SharedDashboardStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * Status of the shared dashboard.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SharedDashboardStatus getStatus() {
    return status;
  }

  public void setStatus(SharedDashboardStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public SharedDashboardResponseAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Display title for the shared dashboard.
   *
   * @return title
   */
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public SharedDashboardResponseAttributes token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Token assigned to the shared dashboard.
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

  public SharedDashboardResponseAttributes url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL for the shared dashboard.
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

  public SharedDashboardResponseAttributes viewingPreferences(
      SharedDashboardViewingPreferences viewingPreferences) {
    this.viewingPreferences = viewingPreferences;
    this.unparsed |= viewingPreferences.unparsed;
    return this;
  }

  /**
   * Display settings for the shared dashboard.
   *
   * @return viewingPreferences
   */
  @JsonProperty(JSON_PROPERTY_VIEWING_PREFERENCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SharedDashboardViewingPreferences getViewingPreferences() {
    return viewingPreferences;
  }

  public void setViewingPreferences(SharedDashboardViewingPreferences viewingPreferences) {
    this.viewingPreferences = viewingPreferences;
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
   * @return SharedDashboardResponseAttributes
   */
  @JsonAnySetter
  public SharedDashboardResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SharedDashboardResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedDashboardResponseAttributes sharedDashboardResponseAttributes =
        (SharedDashboardResponseAttributes) o;
    return Objects.equals(this.createdAt, sharedDashboardResponseAttributes.createdAt)
        && Objects.equals(
            this.embeddableDomains, sharedDashboardResponseAttributes.embeddableDomains)
        && Objects.equals(this.expiration, sharedDashboardResponseAttributes.expiration)
        && Objects.equals(this.globalTime, sharedDashboardResponseAttributes.globalTime)
        && Objects.equals(
            this.globalTimeSelectable, sharedDashboardResponseAttributes.globalTimeSelectable)
        && Objects.equals(this.invitees, sharedDashboardResponseAttributes.invitees)
        && Objects.equals(this.lastAccessed, sharedDashboardResponseAttributes.lastAccessed)
        && Objects.equals(
            this.selectableTemplateVars, sharedDashboardResponseAttributes.selectableTemplateVars)
        && Objects.equals(this.shareType, sharedDashboardResponseAttributes.shareType)
        && Objects.equals(this.sharerDisabled, sharedDashboardResponseAttributes.sharerDisabled)
        && Objects.equals(this.status, sharedDashboardResponseAttributes.status)
        && Objects.equals(this.title, sharedDashboardResponseAttributes.title)
        && Objects.equals(this.token, sharedDashboardResponseAttributes.token)
        && Objects.equals(this.url, sharedDashboardResponseAttributes.url)
        && Objects.equals(
            this.viewingPreferences, sharedDashboardResponseAttributes.viewingPreferences)
        && Objects.equals(
            this.additionalProperties, sharedDashboardResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        embeddableDomains,
        expiration,
        globalTime,
        globalTimeSelectable,
        invitees,
        lastAccessed,
        selectableTemplateVars,
        shareType,
        sharerDisabled,
        status,
        title,
        token,
        url,
        viewingPreferences,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedDashboardResponseAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    embeddableDomains: ").append(toIndentedString(embeddableDomains)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    globalTime: ").append(toIndentedString(globalTime)).append("\n");
    sb.append("    globalTimeSelectable: ")
        .append(toIndentedString(globalTimeSelectable))
        .append("\n");
    sb.append("    invitees: ").append(toIndentedString(invitees)).append("\n");
    sb.append("    lastAccessed: ").append(toIndentedString(lastAccessed)).append("\n");
    sb.append("    selectableTemplateVars: ")
        .append(toIndentedString(selectableTemplateVars))
        .append("\n");
    sb.append("    shareType: ").append(toIndentedString(shareType)).append("\n");
    sb.append("    sharerDisabled: ").append(toIndentedString(sharerDisabled)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    viewingPreferences: ").append(toIndentedString(viewingPreferences)).append("\n");
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
