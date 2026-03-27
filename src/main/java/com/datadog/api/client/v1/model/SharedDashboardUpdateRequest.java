/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Update a shared dashboard's settings.</p>
 */
@JsonPropertyOrder({
  SharedDashboardUpdateRequest.JSON_PROPERTY_EMBEDDABLE_DOMAINS,
  SharedDashboardUpdateRequest.JSON_PROPERTY_EXPIRATION,
  SharedDashboardUpdateRequest.JSON_PROPERTY_GLOBAL_TIME,
  SharedDashboardUpdateRequest.JSON_PROPERTY_GLOBAL_TIME_SELECTABLE_ENABLED,
  SharedDashboardUpdateRequest.JSON_PROPERTY_INVITEES,
  SharedDashboardUpdateRequest.JSON_PROPERTY_SELECTABLE_TEMPLATE_VARS,
  SharedDashboardUpdateRequest.JSON_PROPERTY_SHARE_LIST,
  SharedDashboardUpdateRequest.JSON_PROPERTY_SHARE_TYPE,
  SharedDashboardUpdateRequest.JSON_PROPERTY_STATUS,
  SharedDashboardUpdateRequest.JSON_PROPERTY_TITLE,
  SharedDashboardUpdateRequest.JSON_PROPERTY_VIEWING_PREFERENCES
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SharedDashboardUpdateRequest {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_EMBEDDABLE_DOMAINS = "embeddable_domains";
  private List<String> embeddableDomains = null;

  public static final String JSON_PROPERTY_EXPIRATION = "expiration";
  private JsonNullable<OffsetDateTime> expiration = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_GLOBAL_TIME = "global_time";
  private JsonNullable<SharedDashboardUpdateRequestGlobalTime> globalTime = JsonNullable.<SharedDashboardUpdateRequestGlobalTime>undefined();

  public static final String JSON_PROPERTY_GLOBAL_TIME_SELECTABLE_ENABLED = "global_time_selectable_enabled";
  private JsonNullable<Boolean> globalTimeSelectableEnabled = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_INVITEES = "invitees";
  private List<SharedDashboardInviteesItems> invitees = null;

  public static final String JSON_PROPERTY_SELECTABLE_TEMPLATE_VARS = "selectable_template_vars";
  private JsonNullable<List<SelectableTemplateVariableItems>> selectableTemplateVars = JsonNullable.<List<SelectableTemplateVariableItems>>undefined();

  public static final String JSON_PROPERTY_SHARE_LIST = "share_list";
  private JsonNullable<List<String>> shareList = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_SHARE_TYPE = "share_type";
  private JsonNullable<DashboardShareType> shareType = JsonNullable.<DashboardShareType>undefined();

  public static final String JSON_PROPERTY_STATUS = "status";
  private SharedDashboardStatus status;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_VIEWING_PREFERENCES = "viewing_preferences";
  private ViewingPreferences viewingPreferences;

  public SharedDashboardUpdateRequest embeddableDomains(List<String> embeddableDomains) {
    this.embeddableDomains = embeddableDomains;
    return this;
  }
  public SharedDashboardUpdateRequest addEmbeddableDomainsItem(String embeddableDomainsItem) {
    if (this.embeddableDomains == null) {
      this.embeddableDomains = new ArrayList<>();
    }
    this.embeddableDomains.add(embeddableDomainsItem);
    return this;
  }

  /**
   * <p>The <code>SharedDashboard</code> <code>embeddable_domains</code>.</p>
   * @return embeddableDomains
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EMBEDDABLE_DOMAINS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getEmbeddableDomains() {
        return embeddableDomains;
      }
  public void setEmbeddableDomains(List<String> embeddableDomains) {
    this.embeddableDomains = embeddableDomains;
  }
  public SharedDashboardUpdateRequest expiration(OffsetDateTime expiration) {
    this.expiration = JsonNullable.<OffsetDateTime>of(expiration);
    return this;
  }

  /**
   * <p>The time when an OPEN shared dashboard becomes publicly unavailable.</p>
   * @return expiration
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public OffsetDateTime getExpiration() {
        return expiration.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_EXPIRATION)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getExpiration_JsonNullable() {
    return expiration;
  }
  @JsonProperty(JSON_PROPERTY_EXPIRATION)public void setExpiration_JsonNullable(JsonNullable<OffsetDateTime> expiration) {
    this.expiration = expiration;
  }
  public void setExpiration(OffsetDateTime expiration) {
    this.expiration = JsonNullable.<OffsetDateTime>of(expiration);
  }
  public SharedDashboardUpdateRequest globalTime(SharedDashboardUpdateRequestGlobalTime globalTime) {
    this.globalTime = JsonNullable.<SharedDashboardUpdateRequestGlobalTime>of(globalTime);
    return this;
  }

  /**
   * <p>Timeframe setting for the shared dashboard.</p>
   * @return globalTime
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public SharedDashboardUpdateRequestGlobalTime getGlobalTime() {
        return globalTime.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_GLOBAL_TIME)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<SharedDashboardUpdateRequestGlobalTime> getGlobalTime_JsonNullable() {
    return globalTime;
  }
  @JsonProperty(JSON_PROPERTY_GLOBAL_TIME)public void setGlobalTime_JsonNullable(JsonNullable<SharedDashboardUpdateRequestGlobalTime> globalTime) {
    this.globalTime = globalTime;
  }
  public void setGlobalTime(SharedDashboardUpdateRequestGlobalTime globalTime) {
    this.globalTime = JsonNullable.<SharedDashboardUpdateRequestGlobalTime>of(globalTime);
  }
  public SharedDashboardUpdateRequest globalTimeSelectableEnabled(Boolean globalTimeSelectableEnabled) {
    this.globalTimeSelectableEnabled = JsonNullable.<Boolean>of(globalTimeSelectableEnabled);
    return this;
  }

  /**
   * <p>Whether to allow viewers to select a different global time setting for the shared dashboard.</p>
   * @return globalTimeSelectableEnabled
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Boolean getGlobalTimeSelectableEnabled() {
        return globalTimeSelectableEnabled.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_GLOBAL_TIME_SELECTABLE_ENABLED)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getGlobalTimeSelectableEnabled_JsonNullable() {
    return globalTimeSelectableEnabled;
  }
  @JsonProperty(JSON_PROPERTY_GLOBAL_TIME_SELECTABLE_ENABLED)public void setGlobalTimeSelectableEnabled_JsonNullable(JsonNullable<Boolean> globalTimeSelectableEnabled) {
    this.globalTimeSelectableEnabled = globalTimeSelectableEnabled;
  }
  public void setGlobalTimeSelectableEnabled(Boolean globalTimeSelectableEnabled) {
    this.globalTimeSelectableEnabled = JsonNullable.<Boolean>of(globalTimeSelectableEnabled);
  }
  public SharedDashboardUpdateRequest invitees(List<SharedDashboardInviteesItems> invitees) {
    this.invitees = invitees;
    for (SharedDashboardInviteesItems item : invitees) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SharedDashboardUpdateRequest addInviteesItem(SharedDashboardInviteesItems inviteesItem) {
    if (this.invitees == null) {
      this.invitees = new ArrayList<>();
    }
    this.invitees.add(inviteesItem);
    this.unparsed |= inviteesItem.unparsed;
    return this;
  }

  /**
   * <p>The <code>SharedDashboard</code> <code>invitees</code>.</p>
   * @return invitees
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INVITEES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<SharedDashboardInviteesItems> getInvitees() {
        return invitees;
      }
  public void setInvitees(List<SharedDashboardInviteesItems> invitees) {
    this.invitees = invitees;
  }
  public SharedDashboardUpdateRequest selectableTemplateVars(List<SelectableTemplateVariableItems> selectableTemplateVars) {
    this.selectableTemplateVars = JsonNullable.<List<SelectableTemplateVariableItems>>of(selectableTemplateVars);
    return this;
  }
  public SharedDashboardUpdateRequest addSelectableTemplateVarsItem(SelectableTemplateVariableItems selectableTemplateVarsItem) {
    if (this.selectableTemplateVars == null || !this.selectableTemplateVars.isPresent()) {
      this.selectableTemplateVars = JsonNullable.<List<SelectableTemplateVariableItems>>of(new ArrayList<>());
    }
    try {
      this.selectableTemplateVars.get().add(selectableTemplateVarsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * <p>List of objects representing template variables on the shared dashboard which can have selectable values.</p>
   * @return selectableTemplateVars
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public List<SelectableTemplateVariableItems> getSelectableTemplateVars() {
        return selectableTemplateVars.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_SELECTABLE_TEMPLATE_VARS)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<SelectableTemplateVariableItems>> getSelectableTemplateVars_JsonNullable() {
    return selectableTemplateVars;
  }
  @JsonProperty(JSON_PROPERTY_SELECTABLE_TEMPLATE_VARS)public void setSelectableTemplateVars_JsonNullable(JsonNullable<List<SelectableTemplateVariableItems>> selectableTemplateVars) {
    this.selectableTemplateVars = selectableTemplateVars;
  }
  public void setSelectableTemplateVars(List<SelectableTemplateVariableItems> selectableTemplateVars) {
    this.selectableTemplateVars = JsonNullable.<List<SelectableTemplateVariableItems>>of(selectableTemplateVars);
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
   * <p>List of email addresses that can be given access to the shared dashboard.</p>
   * @return shareList
   * @deprecated
  **/
      @Deprecated
      @jakarta.annotation.Nullable
      @JsonIgnore
      public List<String> getShareList() {
        return shareList.orElse(null);
      }
  @Deprecated
  @JsonProperty(JSON_PROPERTY_SHARE_LIST)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getShareList_JsonNullable() {
    return shareList;
  }
  @JsonProperty(JSON_PROPERTY_SHARE_LIST)public void setShareList_JsonNullable(JsonNullable<List<String>> shareList) {
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
   * <p>Type of sharing access (either open to anyone who has the public URL or invite-only).</p>
   * @return shareType
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public DashboardShareType getShareType() {
        return shareType.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_SHARE_TYPE)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<DashboardShareType> getShareType_JsonNullable() {
    return shareType;
  }
  @JsonProperty(JSON_PROPERTY_SHARE_TYPE)public void setShareType_JsonNullable(JsonNullable<DashboardShareType> shareType) {
    this.shareType = shareType;
  }
  public void setShareType(DashboardShareType shareType) {
    if (!shareType.isValid()) {
        this.unparsed = true;
    }
    this.shareType = JsonNullable.<DashboardShareType>of(shareType);
  }
  public SharedDashboardUpdateRequest status(SharedDashboardStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * <p>Active means the dashboard is publicly available. Paused means the dashboard is not publicly available.</p>
   * @return status
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STATUS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SharedDashboardStatus getStatus() {
        return status;
      }
  public void setStatus(SharedDashboardStatus status) {
    if (!status.isValid()) {
        this.unparsed = true;
    }
    this.status = status;
  }
  public SharedDashboardUpdateRequest title(String title) {
    this.title = title;
    return this;
  }

  /**
   * <p>Title of the shared dashboard.</p>
   * @return title
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TITLE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTitle() {
        return title;
      }
  public void setTitle(String title) {
    this.title = title;
  }
  public SharedDashboardUpdateRequest viewingPreferences(ViewingPreferences viewingPreferences) {
    this.viewingPreferences = viewingPreferences;
    this.unparsed |= viewingPreferences.unparsed;
    return this;
  }

  /**
   * <p>The viewing preferences for a shared dashboard.</p>
   * @return viewingPreferences
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VIEWING_PREFERENCES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ViewingPreferences getViewingPreferences() {
        return viewingPreferences;
      }
  public void setViewingPreferences(ViewingPreferences viewingPreferences) {
    this.viewingPreferences = viewingPreferences;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
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

  /**
   * Return true if this SharedDashboardUpdateRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedDashboardUpdateRequest sharedDashboardUpdateRequest = (SharedDashboardUpdateRequest) o;
    return Objects.equals(this.embeddableDomains, sharedDashboardUpdateRequest.embeddableDomains) && Objects.equals(this.expiration, sharedDashboardUpdateRequest.expiration) && Objects.equals(this.globalTime, sharedDashboardUpdateRequest.globalTime) && Objects.equals(this.globalTimeSelectableEnabled, sharedDashboardUpdateRequest.globalTimeSelectableEnabled) && Objects.equals(this.invitees, sharedDashboardUpdateRequest.invitees) && Objects.equals(this.selectableTemplateVars, sharedDashboardUpdateRequest.selectableTemplateVars) && Objects.equals(this.shareList, sharedDashboardUpdateRequest.shareList) && Objects.equals(this.shareType, sharedDashboardUpdateRequest.shareType) && Objects.equals(this.status, sharedDashboardUpdateRequest.status) && Objects.equals(this.title, sharedDashboardUpdateRequest.title) && Objects.equals(this.viewingPreferences, sharedDashboardUpdateRequest.viewingPreferences) && Objects.equals(this.additionalProperties, sharedDashboardUpdateRequest.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(embeddableDomains,expiration,globalTime,globalTimeSelectableEnabled,invitees,selectableTemplateVars,shareList,shareType,status,title,viewingPreferences, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedDashboardUpdateRequest {\n");
    sb.append("    embeddableDomains: ").append(toIndentedString(embeddableDomains)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    globalTime: ").append(toIndentedString(globalTime)).append("\n");
    sb.append("    globalTimeSelectableEnabled: ").append(toIndentedString(globalTimeSelectableEnabled)).append("\n");
    sb.append("    invitees: ").append(toIndentedString(invitees)).append("\n");
    sb.append("    selectableTemplateVars: ").append(toIndentedString(selectableTemplateVars)).append("\n");
    sb.append("    shareList: ").append(toIndentedString(shareList)).append("\n");
    sb.append("    shareType: ").append(toIndentedString(shareType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    viewingPreferences: ").append(toIndentedString(viewingPreferences)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
