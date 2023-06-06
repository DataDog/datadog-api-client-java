/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** The metadata object associated with how a dashboard has been/will be shared. */
@JsonPropertyOrder({
  SharedDashboard.JSON_PROPERTY_AUTHOR,
  SharedDashboard.JSON_PROPERTY_CREATED_AT,
  SharedDashboard.JSON_PROPERTY_DASHBOARD_ID,
  SharedDashboard.JSON_PROPERTY_DASHBOARD_TYPE,
  SharedDashboard.JSON_PROPERTY_GLOBAL_TIME,
  SharedDashboard.JSON_PROPERTY_GLOBAL_TIME_SELECTABLE_ENABLED,
  SharedDashboard.JSON_PROPERTY_PUBLIC_URL,
  SharedDashboard.JSON_PROPERTY_SELECTABLE_TEMPLATE_VARS,
  SharedDashboard.JSON_PROPERTY_SHARE_LIST,
  SharedDashboard.JSON_PROPERTY_SHARE_TYPE,
  SharedDashboard.JSON_PROPERTY_TOKEN
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SharedDashboard {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHOR = "author";
  private SharedDashboardAuthor author;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DASHBOARD_ID = "dashboard_id";
  private String dashboardId;

  public static final String JSON_PROPERTY_DASHBOARD_TYPE = "dashboard_type";
  private DashboardType dashboardType;

  public static final String JSON_PROPERTY_GLOBAL_TIME = "global_time";
  private DashboardGlobalTime globalTime;

  public static final String JSON_PROPERTY_GLOBAL_TIME_SELECTABLE_ENABLED =
      "global_time_selectable_enabled";
  private JsonNullable<Boolean> globalTimeSelectableEnabled = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_PUBLIC_URL = "public_url";
  private String publicUrl;

  public static final String JSON_PROPERTY_SELECTABLE_TEMPLATE_VARS = "selectable_template_vars";
  private JsonNullable<List<SelectableTemplateVariableItems>> selectableTemplateVars =
      JsonNullable.<List<SelectableTemplateVariableItems>>undefined();

  public static final String JSON_PROPERTY_SHARE_LIST = "share_list";
  private JsonNullable<List<String>> shareList = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_SHARE_TYPE = "share_type";
  private JsonNullable<DashboardShareType> shareType = JsonNullable.<DashboardShareType>undefined();

  public static final String JSON_PROPERTY_TOKEN = "token";
  private String token;

  public SharedDashboard() {}

  @JsonCreator
  public SharedDashboard(
      @JsonProperty(required = true, value = JSON_PROPERTY_DASHBOARD_ID) String dashboardId,
      @JsonProperty(required = true, value = JSON_PROPERTY_DASHBOARD_TYPE)
          DashboardType dashboardType) {
    this.dashboardId = dashboardId;
    this.dashboardType = dashboardType;
    this.unparsed |= !dashboardType.isValid();
  }

  /**
   * User who shared the dashboard.
   *
   * @return author
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SharedDashboardAuthor getAuthor() {
    return author;
  }

  /**
   * Date the dashboard was shared.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public SharedDashboard dashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  /**
   * ID of the dashboard to share.
   *
   * @return dashboardId
   */
  @JsonProperty(JSON_PROPERTY_DASHBOARD_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDashboardId() {
    return dashboardId;
  }

  public void setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
  }

  public SharedDashboard dashboardType(DashboardType dashboardType) {
    this.dashboardType = dashboardType;
    this.unparsed |= !dashboardType.isValid();
    return this;
  }

  /**
   * The type of the associated private dashboard.
   *
   * @return dashboardType
   */
  @JsonProperty(JSON_PROPERTY_DASHBOARD_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DashboardType getDashboardType() {
    return dashboardType;
  }

  public void setDashboardType(DashboardType dashboardType) {
    if (!dashboardType.isValid()) {
      this.unparsed = true;
    }
    this.dashboardType = dashboardType;
  }

  public SharedDashboard globalTime(DashboardGlobalTime globalTime) {
    this.globalTime = globalTime;
    this.unparsed |= globalTime.unparsed;
    return this;
  }

  /**
   * Object containing the live span selection for the dashboard.
   *
   * @return globalTime
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GLOBAL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DashboardGlobalTime getGlobalTime() {
    return globalTime;
  }

  public void setGlobalTime(DashboardGlobalTime globalTime) {
    this.globalTime = globalTime;
  }

  public SharedDashboard globalTimeSelectableEnabled(Boolean globalTimeSelectableEnabled) {
    this.globalTimeSelectableEnabled = JsonNullable.<Boolean>of(globalTimeSelectableEnabled);
    return this;
  }

  /**
   * Whether to allow viewers to select a different global time setting for the shared dashboard.
   *
   * @return globalTimeSelectableEnabled
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Boolean getGlobalTimeSelectableEnabled() {
    return globalTimeSelectableEnabled.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GLOBAL_TIME_SELECTABLE_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getGlobalTimeSelectableEnabled_JsonNullable() {
    return globalTimeSelectableEnabled;
  }

  @JsonProperty(JSON_PROPERTY_GLOBAL_TIME_SELECTABLE_ENABLED)
  public void setGlobalTimeSelectableEnabled_JsonNullable(
      JsonNullable<Boolean> globalTimeSelectableEnabled) {
    this.globalTimeSelectableEnabled = globalTimeSelectableEnabled;
  }

  public void setGlobalTimeSelectableEnabled(Boolean globalTimeSelectableEnabled) {
    this.globalTimeSelectableEnabled = JsonNullable.<Boolean>of(globalTimeSelectableEnabled);
  }

  /**
   * URL of the shared dashboard.
   *
   * @return publicUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublicUrl() {
    return publicUrl;
  }

  public SharedDashboard selectableTemplateVars(
      List<SelectableTemplateVariableItems> selectableTemplateVars) {
    this.selectableTemplateVars =
        JsonNullable.<List<SelectableTemplateVariableItems>>of(selectableTemplateVars);
    return this;
  }

  public SharedDashboard addSelectableTemplateVarsItem(
      SelectableTemplateVariableItems selectableTemplateVarsItem) {
    if (this.selectableTemplateVars == null || !this.selectableTemplateVars.isPresent()) {
      this.selectableTemplateVars =
          JsonNullable.<List<SelectableTemplateVariableItems>>of(new ArrayList<>());
    }
    try {
      this.selectableTemplateVars.get().add(selectableTemplateVarsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * List of objects representing template variables on the shared dashboard which can have
   * selectable values.
   *
   * @return selectableTemplateVars
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<SelectableTemplateVariableItems> getSelectableTemplateVars() {
    return selectableTemplateVars.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SELECTABLE_TEMPLATE_VARS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<SelectableTemplateVariableItems>>
      getSelectableTemplateVars_JsonNullable() {
    return selectableTemplateVars;
  }

  @JsonProperty(JSON_PROPERTY_SELECTABLE_TEMPLATE_VARS)
  public void setSelectableTemplateVars_JsonNullable(
      JsonNullable<List<SelectableTemplateVariableItems>> selectableTemplateVars) {
    this.selectableTemplateVars = selectableTemplateVars;
  }

  public void setSelectableTemplateVars(
      List<SelectableTemplateVariableItems> selectableTemplateVars) {
    this.selectableTemplateVars =
        JsonNullable.<List<SelectableTemplateVariableItems>>of(selectableTemplateVars);
  }

  public SharedDashboard shareList(List<String> shareList) {
    this.shareList = JsonNullable.<List<String>>of(shareList);
    return this;
  }

  public SharedDashboard addShareListItem(String shareListItem) {
    if (this.shareList == null || !this.shareList.isPresent()) {
      this.shareList = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.shareList.get().add(shareListItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * List of email addresses that can receive an invitation to access to the shared dashboard.
   *
   * @return shareList
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<String> getShareList() {
    return shareList.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SHARE_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getShareList_JsonNullable() {
    return shareList;
  }

  @JsonProperty(JSON_PROPERTY_SHARE_LIST)
  public void setShareList_JsonNullable(JsonNullable<List<String>> shareList) {
    this.shareList = shareList;
  }

  public void setShareList(List<String> shareList) {
    this.shareList = JsonNullable.<List<String>>of(shareList);
  }

  public SharedDashboard shareType(DashboardShareType shareType) {
    this.shareType = JsonNullable.<DashboardShareType>of(shareType);
    return this;
  }

  /**
   * Type of sharing access (either open to anyone who has the public URL or invite-only).
   *
   * @return shareType
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public DashboardShareType getShareType() {
    return shareType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SHARE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<DashboardShareType> getShareType_JsonNullable() {
    return shareType;
  }

  @JsonProperty(JSON_PROPERTY_SHARE_TYPE)
  public void setShareType_JsonNullable(JsonNullable<DashboardShareType> shareType) {
    this.shareType = shareType;
  }

  public void setShareType(DashboardShareType shareType) {
    if (!shareType.isValid()) {
      this.unparsed = true;
    }
    this.shareType = JsonNullable.<DashboardShareType>of(shareType);
  }

  /**
   * A unique token assigned to the shared dashboard.
   *
   * @return token
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getToken() {
    return token;
  }

  /** Return true if this SharedDashboard object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedDashboard sharedDashboard = (SharedDashboard) o;
    return Objects.equals(this.author, sharedDashboard.author)
        && Objects.equals(this.createdAt, sharedDashboard.createdAt)
        && Objects.equals(this.dashboardId, sharedDashboard.dashboardId)
        && Objects.equals(this.dashboardType, sharedDashboard.dashboardType)
        && Objects.equals(this.globalTime, sharedDashboard.globalTime)
        && Objects.equals(
            this.globalTimeSelectableEnabled, sharedDashboard.globalTimeSelectableEnabled)
        && Objects.equals(this.publicUrl, sharedDashboard.publicUrl)
        && Objects.equals(this.selectableTemplateVars, sharedDashboard.selectableTemplateVars)
        && Objects.equals(this.shareList, sharedDashboard.shareList)
        && Objects.equals(this.shareType, sharedDashboard.shareType)
        && Objects.equals(this.token, sharedDashboard.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        author,
        createdAt,
        dashboardId,
        dashboardType,
        globalTime,
        globalTimeSelectableEnabled,
        publicUrl,
        selectableTemplateVars,
        shareList,
        shareType,
        token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedDashboard {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    dashboardId: ").append(toIndentedString(dashboardId)).append("\n");
    sb.append("    dashboardType: ").append(toIndentedString(dashboardType)).append("\n");
    sb.append("    globalTime: ").append(toIndentedString(globalTime)).append("\n");
    sb.append("    globalTimeSelectableEnabled: ")
        .append(toIndentedString(globalTimeSelectableEnabled))
        .append("\n");
    sb.append("    publicUrl: ").append(toIndentedString(publicUrl)).append("\n");
    sb.append("    selectableTemplateVars: ")
        .append(toIndentedString(selectableTemplateVars))
        .append("\n");
    sb.append("    shareList: ").append(toIndentedString(shareList)).append("\n");
    sb.append("    shareType: ").append(toIndentedString(shareType)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
