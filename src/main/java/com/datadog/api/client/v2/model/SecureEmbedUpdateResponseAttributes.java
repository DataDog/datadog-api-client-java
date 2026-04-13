/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes of an updated secure embed shared dashboard. */
@JsonPropertyOrder({
  SecureEmbedUpdateResponseAttributes.JSON_PROPERTY_CREATED_AT,
  SecureEmbedUpdateResponseAttributes.JSON_PROPERTY_CREDENTIAL_SUFFIX,
  SecureEmbedUpdateResponseAttributes.JSON_PROPERTY_DASHBOARD_ID,
  SecureEmbedUpdateResponseAttributes.JSON_PROPERTY_GLOBAL_TIME,
  SecureEmbedUpdateResponseAttributes.JSON_PROPERTY_GLOBAL_TIME_SELECTABLE,
  SecureEmbedUpdateResponseAttributes.JSON_PROPERTY_ID,
  SecureEmbedUpdateResponseAttributes.JSON_PROPERTY_SELECTABLE_TEMPLATE_VARS,
  SecureEmbedUpdateResponseAttributes.JSON_PROPERTY_SHARE_TYPE,
  SecureEmbedUpdateResponseAttributes.JSON_PROPERTY_STATUS,
  SecureEmbedUpdateResponseAttributes.JSON_PROPERTY_TITLE,
  SecureEmbedUpdateResponseAttributes.JSON_PROPERTY_TOKEN,
  SecureEmbedUpdateResponseAttributes.JSON_PROPERTY_URL,
  SecureEmbedUpdateResponseAttributes.JSON_PROPERTY_VIEWING_PREFERENCES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecureEmbedUpdateResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_CREDENTIAL_SUFFIX = "credential_suffix";
  private String credentialSuffix;

  public static final String JSON_PROPERTY_DASHBOARD_ID = "dashboard_id";
  private String dashboardId;

  public static final String JSON_PROPERTY_GLOBAL_TIME = "global_time";
  private SecureEmbedGlobalTime globalTime;

  public static final String JSON_PROPERTY_GLOBAL_TIME_SELECTABLE = "global_time_selectable";
  private Boolean globalTimeSelectable;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_SELECTABLE_TEMPLATE_VARS = "selectable_template_vars";
  private List<SecureEmbedSelectableTemplateVariable> selectableTemplateVars = null;

  public static final String JSON_PROPERTY_SHARE_TYPE = "share_type";
  private SecureEmbedShareType shareType;

  public static final String JSON_PROPERTY_STATUS = "status";
  private SecureEmbedStatus status;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TOKEN = "token";
  private String token;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_VIEWING_PREFERENCES = "viewing_preferences";
  private SecureEmbedViewingPreferences viewingPreferences;

  /**
   * Creation timestamp.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * Last 4 characters of the credential. Defaults to <code>0000</code> if unavailable.
   *
   * @return credentialSuffix
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREDENTIAL_SUFFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCredentialSuffix() {
    return credentialSuffix;
  }

  /**
   * The source dashboard ID.
   *
   * @return dashboardId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DASHBOARD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDashboardId() {
    return dashboardId;
  }

  public SecureEmbedUpdateResponseAttributes globalTime(SecureEmbedGlobalTime globalTime) {
    this.globalTime = globalTime;
    this.unparsed |= globalTime.unparsed;
    return this;
  }

  /**
   * Default time range configuration for the secure embed.
   *
   * @return globalTime
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GLOBAL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecureEmbedGlobalTime getGlobalTime() {
    return globalTime;
  }

  public void setGlobalTime(SecureEmbedGlobalTime globalTime) {
    this.globalTime = globalTime;
  }

  public SecureEmbedUpdateResponseAttributes globalTimeSelectable(Boolean globalTimeSelectable) {
    this.globalTimeSelectable = globalTimeSelectable;
    return this;
  }

  /**
   * Whether time range is viewer-selectable.
   *
   * @return globalTimeSelectable
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GLOBAL_TIME_SELECTABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getGlobalTimeSelectable() {
    return globalTimeSelectable;
  }

  public void setGlobalTimeSelectable(Boolean globalTimeSelectable) {
    this.globalTimeSelectable = globalTimeSelectable;
  }

  /**
   * Internal share ID.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public SecureEmbedUpdateResponseAttributes selectableTemplateVars(
      List<SecureEmbedSelectableTemplateVariable> selectableTemplateVars) {
    this.selectableTemplateVars = selectableTemplateVars;
    for (SecureEmbedSelectableTemplateVariable item : selectableTemplateVars) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SecureEmbedUpdateResponseAttributes addSelectableTemplateVarsItem(
      SecureEmbedSelectableTemplateVariable selectableTemplateVarsItem) {
    if (this.selectableTemplateVars == null) {
      this.selectableTemplateVars = new ArrayList<>();
    }
    this.selectableTemplateVars.add(selectableTemplateVarsItem);
    this.unparsed |= selectableTemplateVarsItem.unparsed;
    return this;
  }

  /**
   * Template variables with their configuration.
   *
   * @return selectableTemplateVars
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SELECTABLE_TEMPLATE_VARS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SecureEmbedSelectableTemplateVariable> getSelectableTemplateVars() {
    return selectableTemplateVars;
  }

  public void setSelectableTemplateVars(
      List<SecureEmbedSelectableTemplateVariable> selectableTemplateVars) {
    this.selectableTemplateVars = selectableTemplateVars;
  }

  public SecureEmbedUpdateResponseAttributes shareType(SecureEmbedShareType shareType) {
    this.shareType = shareType;
    this.unparsed |= !shareType.isValid();
    return this;
  }

  /**
   * The type of share. Always <code>secure_embed</code>.
   *
   * @return shareType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHARE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecureEmbedShareType getShareType() {
    return shareType;
  }

  public void setShareType(SecureEmbedShareType shareType) {
    if (!shareType.isValid()) {
      this.unparsed = true;
    }
    this.shareType = shareType;
  }

  public SecureEmbedUpdateResponseAttributes status(SecureEmbedStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * The status of the secure embed share. Active means the shared dashboard is available. Paused
   * means it is not.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecureEmbedStatus getStatus() {
    return status;
  }

  public void setStatus(SecureEmbedStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public SecureEmbedUpdateResponseAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Display title.
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

  /**
   * Public share token.
   *
   * @return token
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getToken() {
    return token;
  }

  /**
   * CDN URL for the shared dashboard.
   *
   * @return url
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUrl() {
    return url;
  }

  public SecureEmbedUpdateResponseAttributes viewingPreferences(
      SecureEmbedViewingPreferences viewingPreferences) {
    this.viewingPreferences = viewingPreferences;
    this.unparsed |= viewingPreferences.unparsed;
    return this;
  }

  /**
   * Display settings for the secure embed shared dashboard.
   *
   * @return viewingPreferences
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIEWING_PREFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecureEmbedViewingPreferences getViewingPreferences() {
    return viewingPreferences;
  }

  public void setViewingPreferences(SecureEmbedViewingPreferences viewingPreferences) {
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
   * @return SecureEmbedUpdateResponseAttributes
   */
  @JsonAnySetter
  public SecureEmbedUpdateResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SecureEmbedUpdateResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecureEmbedUpdateResponseAttributes secureEmbedUpdateResponseAttributes =
        (SecureEmbedUpdateResponseAttributes) o;
    return Objects.equals(this.createdAt, secureEmbedUpdateResponseAttributes.createdAt)
        && Objects.equals(
            this.credentialSuffix, secureEmbedUpdateResponseAttributes.credentialSuffix)
        && Objects.equals(this.dashboardId, secureEmbedUpdateResponseAttributes.dashboardId)
        && Objects.equals(this.globalTime, secureEmbedUpdateResponseAttributes.globalTime)
        && Objects.equals(
            this.globalTimeSelectable, secureEmbedUpdateResponseAttributes.globalTimeSelectable)
        && Objects.equals(this.id, secureEmbedUpdateResponseAttributes.id)
        && Objects.equals(
            this.selectableTemplateVars, secureEmbedUpdateResponseAttributes.selectableTemplateVars)
        && Objects.equals(this.shareType, secureEmbedUpdateResponseAttributes.shareType)
        && Objects.equals(this.status, secureEmbedUpdateResponseAttributes.status)
        && Objects.equals(this.title, secureEmbedUpdateResponseAttributes.title)
        && Objects.equals(this.token, secureEmbedUpdateResponseAttributes.token)
        && Objects.equals(this.url, secureEmbedUpdateResponseAttributes.url)
        && Objects.equals(
            this.viewingPreferences, secureEmbedUpdateResponseAttributes.viewingPreferences)
        && Objects.equals(
            this.additionalProperties, secureEmbedUpdateResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        credentialSuffix,
        dashboardId,
        globalTime,
        globalTimeSelectable,
        id,
        selectableTemplateVars,
        shareType,
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
    sb.append("class SecureEmbedUpdateResponseAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    credentialSuffix: ").append(toIndentedString(credentialSuffix)).append("\n");
    sb.append("    dashboardId: ").append(toIndentedString(dashboardId)).append("\n");
    sb.append("    globalTime: ").append(toIndentedString(globalTime)).append("\n");
    sb.append("    globalTimeSelectable: ")
        .append(toIndentedString(globalTimeSelectable))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    selectableTemplateVars: ")
        .append(toIndentedString(selectableTemplateVars))
        .append("\n");
    sb.append("    shareType: ").append(toIndentedString(shareType)).append("\n");
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
