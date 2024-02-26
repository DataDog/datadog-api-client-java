/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Update a shared dashboard's settings. */
@JsonPropertyOrder({
  SharedDashboardUpdateRequest.JSON_PROPERTY_GLOBAL_TIME,
  SharedDashboardUpdateRequest.JSON_PROPERTY_GLOBAL_TIME_SELECTABLE_ENABLED,
  SharedDashboardUpdateRequest.JSON_PROPERTY_SELECTABLE_TEMPLATE_VARS,
  SharedDashboardUpdateRequest.JSON_PROPERTY_SHARE_LIST,
  SharedDashboardUpdateRequest.JSON_PROPERTY_SHARE_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SharedDashboardUpdateRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_GLOBAL_TIME = "global_time";
  private SharedDashboardUpdateRequestGlobalTime globalTime;

  public static final String JSON_PROPERTY_GLOBAL_TIME_SELECTABLE_ENABLED =
      "global_time_selectable_enabled";
  private JsonNullable<Boolean> globalTimeSelectableEnabled = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_SELECTABLE_TEMPLATE_VARS = "selectable_template_vars";
  private JsonNullable<List<SelectableTemplateVariableItems>> selectableTemplateVars =
      JsonNullable.<List<SelectableTemplateVariableItems>>undefined();

  public static final String JSON_PROPERTY_SHARE_LIST = "share_list";
  private JsonNullable<List<String>> shareList = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_SHARE_TYPE = "share_type";
  private JsonNullable<DashboardShareType> shareType = JsonNullable.<DashboardShareType>undefined();

  public SharedDashboardUpdateRequest() {}

  @JsonCreator
  public SharedDashboardUpdateRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_GLOBAL_TIME)
          SharedDashboardUpdateRequestGlobalTime globalTime) {
    this.globalTime = globalTime;
    if (globalTime != null) {
      this.unparsed |= globalTime.unparsed;
    }
  }

  public SharedDashboardUpdateRequest globalTime(
      SharedDashboardUpdateRequestGlobalTime globalTime) {
    this.globalTime = globalTime;
    if (globalTime != null) {
      this.unparsed |= globalTime.unparsed;
    }
    return this;
  }

  /**
   * Timeframe setting for the shared dashboard.
   *
   * @return globalTime
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GLOBAL_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SharedDashboardUpdateRequestGlobalTime getGlobalTime() {
    return globalTime;
  }

  public void setGlobalTime(SharedDashboardUpdateRequestGlobalTime globalTime) {
    this.globalTime = globalTime;
  }

  public SharedDashboardUpdateRequest globalTimeSelectableEnabled(
      Boolean globalTimeSelectableEnabled) {
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

  public SharedDashboardUpdateRequest selectableTemplateVars(
      List<SelectableTemplateVariableItems> selectableTemplateVars) {
    this.selectableTemplateVars =
        JsonNullable.<List<SelectableTemplateVariableItems>>of(selectableTemplateVars);
    return this;
  }

  public SharedDashboardUpdateRequest addSelectableTemplateVarsItem(
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

  public SharedDashboardUpdateRequest shareList(List<String> shareList) {
    this.shareList = JsonNullable.<List<String>>of(shareList);
    return this;
  }

  public SharedDashboardUpdateRequest addShareListItem(String shareListItem) {
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
   * List of email addresses that can be given access to the shared dashboard.
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

  public SharedDashboardUpdateRequest shareType(DashboardShareType shareType) {
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
   * @return SharedDashboardUpdateRequest
   */
  @JsonAnySetter
  public SharedDashboardUpdateRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SharedDashboardUpdateRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedDashboardUpdateRequest sharedDashboardUpdateRequest = (SharedDashboardUpdateRequest) o;
    return Objects.equals(this.globalTime, sharedDashboardUpdateRequest.globalTime)
        && Objects.equals(
            this.globalTimeSelectableEnabled,
            sharedDashboardUpdateRequest.globalTimeSelectableEnabled)
        && Objects.equals(
            this.selectableTemplateVars, sharedDashboardUpdateRequest.selectableTemplateVars)
        && Objects.equals(this.shareList, sharedDashboardUpdateRequest.shareList)
        && Objects.equals(this.shareType, sharedDashboardUpdateRequest.shareType)
        && Objects.equals(
            this.additionalProperties, sharedDashboardUpdateRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        globalTime,
        globalTimeSelectableEnabled,
        selectableTemplateVars,
        shareList,
        shareType,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedDashboardUpdateRequest {\n");
    sb.append("    globalTime: ").append(toIndentedString(globalTime)).append("\n");
    sb.append("    globalTimeSelectableEnabled: ")
        .append(toIndentedString(globalTimeSelectableEnabled))
        .append("\n");
    sb.append("    selectableTemplateVars: ")
        .append(toIndentedString(selectableTemplateVars))
        .append("\n");
    sb.append("    shareList: ").append(toIndentedString(shareList)).append("\n");
    sb.append("    shareType: ").append(toIndentedString(shareType)).append("\n");
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
