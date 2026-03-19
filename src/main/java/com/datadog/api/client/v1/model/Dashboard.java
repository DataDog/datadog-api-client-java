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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * A dashboard is Datadog’s tool for visually tracking, analyzing, and displaying key performance
 * metrics, which enable you to monitor the health of your infrastructure.
 */
@JsonPropertyOrder({
  Dashboard.JSON_PROPERTY_AUTHOR_HANDLE,
  Dashboard.JSON_PROPERTY_AUTHOR_NAME,
  Dashboard.JSON_PROPERTY_CREATED_AT,
  Dashboard.JSON_PROPERTY_DESCRIPTION,
  Dashboard.JSON_PROPERTY_ID,
  Dashboard.JSON_PROPERTY_IS_READ_ONLY,
  Dashboard.JSON_PROPERTY_LAYOUT_TYPE,
  Dashboard.JSON_PROPERTY_MODIFIED_AT,
  Dashboard.JSON_PROPERTY_NOTIFY_LIST,
  Dashboard.JSON_PROPERTY_REFLOW_TYPE,
  Dashboard.JSON_PROPERTY_RESTRICTED_ROLES,
  Dashboard.JSON_PROPERTY_TAGS,
  Dashboard.JSON_PROPERTY_TEMPLATE_VARIABLE_PRESETS,
  Dashboard.JSON_PROPERTY_TEMPLATE_VARIABLES,
  Dashboard.JSON_PROPERTY_TITLE,
  Dashboard.JSON_PROPERTY_URL,
  Dashboard.JSON_PROPERTY_WIDGETS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class Dashboard {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHOR_HANDLE = "author_handle";
  private String authorHandle;

  public static final String JSON_PROPERTY_AUTHOR_NAME = "author_name";
  private JsonNullable<String> authorName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
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
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_NOTIFY_LIST = "notify_list";
  private JsonNullable<List<String>> notifyList = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_REFLOW_TYPE = "reflow_type";
  private DashboardReflowType reflowType;

  public static final String JSON_PROPERTY_RESTRICTED_ROLES = "restricted_roles";
  private List<String> restrictedRoles = null;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private JsonNullable<List<String>> tags = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_TEMPLATE_VARIABLE_PRESETS = "template_variable_presets";
  private JsonNullable<List<DashboardTemplateVariablePreset>> templateVariablePresets =
      JsonNullable.<List<DashboardTemplateVariablePreset>>undefined();

  public static final String JSON_PROPERTY_TEMPLATE_VARIABLES = "template_variables";
  private JsonNullable<List<DashboardTemplateVariable>> templateVariables =
      JsonNullable.<List<DashboardTemplateVariable>>undefined();

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_WIDGETS = "widgets";
  private List<Widget> widgets = new ArrayList<>();

  public Dashboard() {}

  @JsonCreator
  public Dashboard(
      @JsonProperty(required = true, value = JSON_PROPERTY_LAYOUT_TYPE)
          DashboardLayoutType layoutType,
      @JsonProperty(required = true, value = JSON_PROPERTY_TITLE) String title,
      @JsonProperty(required = true, value = JSON_PROPERTY_WIDGETS) List<Widget> widgets) {
    this.layoutType = layoutType;
    this.unparsed |= !layoutType.isValid();
    this.title = title;
    this.widgets = widgets;
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

  /**
   * Name of the dashboard author.
   *
   * @return authorName
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getAuthorName() {

    if (authorName == null) {
      authorName = JsonNullable.<String>undefined();
    }
    return authorName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AUTHOR_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getAuthorName_JsonNullable() {
    return authorName;
  }

  @JsonProperty(JSON_PROPERTY_AUTHOR_NAME)
  private void setAuthorName_JsonNullable(JsonNullable<String> authorName) {
    this.authorName = authorName;
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

  public Dashboard description(String description) {
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

  /**
   * ID of the dashboard.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public Dashboard isReadOnly(Boolean isReadOnly) {
    this.isReadOnly = isReadOnly;
    return this;
  }

  /**
   * Whether this dashboard is read-only. If True, only the author and admins can make changes to
   * it.
   *
   * <p>This property is deprecated; please use the <a
   * href="https://docs.datadoghq.com/api/latest/restriction-policies/">Restriction Policies API</a>
   * instead to manage write authorization for individual dashboards.
   *
   * @return isReadOnly
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_READ_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsReadOnly() {
    return isReadOnly;
  }

  @Deprecated
  public void setIsReadOnly(Boolean isReadOnly) {
    this.isReadOnly = isReadOnly;
  }

  public Dashboard layoutType(DashboardLayoutType layoutType) {
    this.layoutType = layoutType;
    this.unparsed |= !layoutType.isValid();
    return this;
  }

  /**
   * Layout type of the dashboard.
   *
   * @return layoutType
   */
  @JsonProperty(JSON_PROPERTY_LAYOUT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DashboardLayoutType getLayoutType() {
    return layoutType;
  }

  public void setLayoutType(DashboardLayoutType layoutType) {
    if (!layoutType.isValid()) {
      this.unparsed = true;
    }
    this.layoutType = layoutType;
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

  public Dashboard notifyList(List<String> notifyList) {
    this.notifyList = JsonNullable.<List<String>>of(notifyList);
    return this;
  }

  public Dashboard addNotifyListItem(String notifyListItem) {
    if (this.notifyList == null || !this.notifyList.isPresent()) {
      this.notifyList = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.notifyList.get().add(notifyListItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * List of handles of users to notify when changes are made to this dashboard.
   *
   * @return notifyList
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<String> getNotifyList() {
    return notifyList.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NOTIFY_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getNotifyList_JsonNullable() {
    return notifyList;
  }

  @JsonProperty(JSON_PROPERTY_NOTIFY_LIST)
  public void setNotifyList_JsonNullable(JsonNullable<List<String>> notifyList) {
    this.notifyList = notifyList;
  }

  public void setNotifyList(List<String> notifyList) {
    this.notifyList = JsonNullable.<List<String>>of(notifyList);
  }

  public Dashboard reflowType(DashboardReflowType reflowType) {
    this.reflowType = reflowType;
    this.unparsed |= !reflowType.isValid();
    return this;
  }

  /**
   * Reflow type for a <strong>new dashboard layout</strong> dashboard. Set this only when layout
   * type is 'ordered'. If set to 'fixed', the dashboard expects all widgets to have a layout, and
   * if it's set to 'auto', widgets should not have layouts.
   *
   * @return reflowType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFLOW_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DashboardReflowType getReflowType() {
    return reflowType;
  }

  public void setReflowType(DashboardReflowType reflowType) {
    if (!reflowType.isValid()) {
      this.unparsed = true;
    }
    this.reflowType = reflowType;
  }

  public Dashboard restrictedRoles(List<String> restrictedRoles) {
    this.restrictedRoles = restrictedRoles;
    return this;
  }

  public Dashboard addRestrictedRolesItem(String restrictedRolesItem) {
    if (this.restrictedRoles == null) {
      this.restrictedRoles = new ArrayList<>();
    }
    this.restrictedRoles.add(restrictedRolesItem);
    return this;
  }

  /**
   * A list of role identifiers. Only the author and users associated with at least one of these
   * roles can edit this dashboard.
   *
   * @return restrictedRoles
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESTRICTED_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getRestrictedRoles() {
    return restrictedRoles;
  }

  public void setRestrictedRoles(List<String> restrictedRoles) {
    this.restrictedRoles = restrictedRoles;
  }

  public Dashboard tags(List<String> tags) {
    this.tags = JsonNullable.<List<String>>of(tags);
    return this;
  }

  public Dashboard addTagsItem(String tagsItem) {
    if (this.tags == null || !this.tags.isPresent()) {
      this.tags = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.tags.get().add(tagsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * List of team names representing ownership of a dashboard.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<String> getTags() {
    return tags.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getTags_JsonNullable() {
    return tags;
  }

  @JsonProperty(JSON_PROPERTY_TAGS)
  public void setTags_JsonNullable(JsonNullable<List<String>> tags) {
    this.tags = tags;
  }

  public void setTags(List<String> tags) {
    this.tags = JsonNullable.<List<String>>of(tags);
  }

  public Dashboard templateVariablePresets(
      List<DashboardTemplateVariablePreset> templateVariablePresets) {
    this.templateVariablePresets =
        JsonNullable.<List<DashboardTemplateVariablePreset>>of(templateVariablePresets);
    return this;
  }

  public Dashboard addTemplateVariablePresetsItem(
      DashboardTemplateVariablePreset templateVariablePresetsItem) {
    if (this.templateVariablePresets == null || !this.templateVariablePresets.isPresent()) {
      this.templateVariablePresets =
          JsonNullable.<List<DashboardTemplateVariablePreset>>of(new ArrayList<>());
    }
    try {
      this.templateVariablePresets.get().add(templateVariablePresetsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Array of template variables saved views.
   *
   * @return templateVariablePresets
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<DashboardTemplateVariablePreset> getTemplateVariablePresets() {
    return templateVariablePresets.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEMPLATE_VARIABLE_PRESETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<DashboardTemplateVariablePreset>>
      getTemplateVariablePresets_JsonNullable() {
    return templateVariablePresets;
  }

  @JsonProperty(JSON_PROPERTY_TEMPLATE_VARIABLE_PRESETS)
  public void setTemplateVariablePresets_JsonNullable(
      JsonNullable<List<DashboardTemplateVariablePreset>> templateVariablePresets) {
    this.templateVariablePresets = templateVariablePresets;
  }

  public void setTemplateVariablePresets(
      List<DashboardTemplateVariablePreset> templateVariablePresets) {
    this.templateVariablePresets =
        JsonNullable.<List<DashboardTemplateVariablePreset>>of(templateVariablePresets);
  }

  public Dashboard templateVariables(List<DashboardTemplateVariable> templateVariables) {
    this.templateVariables = JsonNullable.<List<DashboardTemplateVariable>>of(templateVariables);
    return this;
  }

  public Dashboard addTemplateVariablesItem(DashboardTemplateVariable templateVariablesItem) {
    if (this.templateVariables == null || !this.templateVariables.isPresent()) {
      this.templateVariables = JsonNullable.<List<DashboardTemplateVariable>>of(new ArrayList<>());
    }
    try {
      this.templateVariables.get().add(templateVariablesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * List of template variables for this dashboard.
   *
   * @return templateVariables
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<DashboardTemplateVariable> getTemplateVariables() {
    return templateVariables.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEMPLATE_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<DashboardTemplateVariable>> getTemplateVariables_JsonNullable() {
    return templateVariables;
  }

  @JsonProperty(JSON_PROPERTY_TEMPLATE_VARIABLES)
  public void setTemplateVariables_JsonNullable(
      JsonNullable<List<DashboardTemplateVariable>> templateVariables) {
    this.templateVariables = templateVariables;
  }

  public void setTemplateVariables(List<DashboardTemplateVariable> templateVariables) {
    this.templateVariables = JsonNullable.<List<DashboardTemplateVariable>>of(templateVariables);
  }

  public Dashboard title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the dashboard.
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

  /**
   * The URL of the dashboard.
   *
   * @return url
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUrl() {
    return url;
  }

  public Dashboard widgets(List<Widget> widgets) {
    this.widgets = widgets;
    for (Widget item : widgets) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public Dashboard addWidgetsItem(Widget widgetsItem) {
    this.widgets.add(widgetsItem);
    this.unparsed |= widgetsItem.unparsed;
    return this;
  }

  /**
   * List of widgets to display on the dashboard.
   *
   * @return widgets
   */
  @JsonProperty(JSON_PROPERTY_WIDGETS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<Widget> getWidgets() {
    return widgets;
  }

  public void setWidgets(List<Widget> widgets) {
    this.widgets = widgets;
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
   * @return Dashboard
   */
  @JsonAnySetter
  public Dashboard putAdditionalProperty(String key, Object value) {
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

  /** Return true if this Dashboard object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dashboard dashboard = (Dashboard) o;
    return Objects.equals(this.authorHandle, dashboard.authorHandle)
        && Objects.equals(this.authorName, dashboard.authorName)
        && Objects.equals(this.createdAt, dashboard.createdAt)
        && Objects.equals(this.description, dashboard.description)
        && Objects.equals(this.id, dashboard.id)
        && Objects.equals(this.isReadOnly, dashboard.isReadOnly)
        && Objects.equals(this.layoutType, dashboard.layoutType)
        && Objects.equals(this.modifiedAt, dashboard.modifiedAt)
        && Objects.equals(this.notifyList, dashboard.notifyList)
        && Objects.equals(this.reflowType, dashboard.reflowType)
        && Objects.equals(this.restrictedRoles, dashboard.restrictedRoles)
        && Objects.equals(this.tags, dashboard.tags)
        && Objects.equals(this.templateVariablePresets, dashboard.templateVariablePresets)
        && Objects.equals(this.templateVariables, dashboard.templateVariables)
        && Objects.equals(this.title, dashboard.title)
        && Objects.equals(this.url, dashboard.url)
        && Objects.equals(this.widgets, dashboard.widgets)
        && Objects.equals(this.additionalProperties, dashboard.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        authorHandle,
        authorName,
        createdAt,
        description,
        id,
        isReadOnly,
        layoutType,
        modifiedAt,
        notifyList,
        reflowType,
        restrictedRoles,
        tags,
        templateVariablePresets,
        templateVariables,
        title,
        url,
        widgets,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dashboard {\n");
    sb.append("    authorHandle: ").append(toIndentedString(authorHandle)).append("\n");
    sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isReadOnly: ").append(toIndentedString(isReadOnly)).append("\n");
    sb.append("    layoutType: ").append(toIndentedString(layoutType)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    notifyList: ").append(toIndentedString(notifyList)).append("\n");
    sb.append("    reflowType: ").append(toIndentedString(reflowType)).append("\n");
    sb.append("    restrictedRoles: ").append(toIndentedString(restrictedRoles)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    templateVariablePresets: ")
        .append(toIndentedString(templateVariablePresets))
        .append("\n");
    sb.append("    templateVariables: ").append(toIndentedString(templateVariables)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    widgets: ").append(toIndentedString(widgets)).append("\n");
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
