/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.datadog.api.v1.client.model.DashboardLayoutType;
import com.datadog.api.v1.client.model.DashboardTemplateVariablePreset;
import com.datadog.api.v1.client.model.DashboardTemplateVariables;
import com.datadog.api.v1.client.model.Widget;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Dashboard
 */
@JsonPropertyOrder({
  Dashboard.JSON_PROPERTY_AUTHOR_HANDLE,
  Dashboard.JSON_PROPERTY_CREATED_AT,
  Dashboard.JSON_PROPERTY_DESCRIPTION,
  Dashboard.JSON_PROPERTY_ID,
  Dashboard.JSON_PROPERTY_IS_READ_ONLY,
  Dashboard.JSON_PROPERTY_LAYOUT_TYPE,
  Dashboard.JSON_PROPERTY_MODIFIED_AT,
  Dashboard.JSON_PROPERTY_NOTIFY_LIST,
  Dashboard.JSON_PROPERTY_TEMPLATE_VARIABLE_PRESETS,
  Dashboard.JSON_PROPERTY_TEMPLATE_VARIABLES,
  Dashboard.JSON_PROPERTY_TITLE,
  Dashboard.JSON_PROPERTY_URL,
  Dashboard.JSON_PROPERTY_WIDGETS
})

public class Dashboard {
  public static final String JSON_PROPERTY_AUTHOR_HANDLE = "author_handle";
  private String authorHandle;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_IS_READ_ONLY = "is_read_only";
  private Boolean isReadOnly = false;

  public static final String JSON_PROPERTY_LAYOUT_TYPE = "layout_type";
  private DashboardLayoutType layoutType;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_NOTIFY_LIST = "notify_list";
  private JsonNullable<List<String>> notifyList = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_TEMPLATE_VARIABLE_PRESETS = "template_variable_presets";
  private JsonNullable<List<DashboardTemplateVariablePreset>> templateVariablePresets = JsonNullable.<List<DashboardTemplateVariablePreset>>undefined();

  public static final String JSON_PROPERTY_TEMPLATE_VARIABLES = "template_variables";
  private JsonNullable<List<DashboardTemplateVariables>> templateVariables = JsonNullable.<List<DashboardTemplateVariables>>undefined();

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_WIDGETS = "widgets";
  private List<Widget> widgets = new ArrayList<>();


   /**
   * Get authorHandle
   * @return authorHandle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "test@datadoghq.com", value = "")
  @JsonProperty(JSON_PROPERTY_AUTHOR_HANDLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthorHandle() {
    return authorHandle;
  }




   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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
   * Description of the dashboard
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the dashboard")
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
   * ID of the dashboard
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123-abc-456", value = "ID of the dashboard")
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
   * Whether this dashboard is read-only. If True, only the author and admins can make changes to it.
   * @return isReadOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether this dashboard is read-only. If True, only the author and admins can make changes to it.")
  @JsonProperty(JSON_PROPERTY_IS_READ_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsReadOnly() {
    return isReadOnly;
  }


  public void setIsReadOnly(Boolean isReadOnly) {
    this.isReadOnly = isReadOnly;
  }


  public Dashboard layoutType(DashboardLayoutType layoutType) {
    
    this.layoutType = layoutType;
    return this;
  }

   /**
   * Get layoutType
   * @return layoutType
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LAYOUT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DashboardLayoutType getLayoutType() {
    return layoutType;
  }


  public void setLayoutType(DashboardLayoutType layoutType) {
    this.layoutType = layoutType;
  }


   /**
   * Get modifiedAt
   * @return modifiedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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
   * @return notifyList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of handles of users to notify when changes are made to this dashboard.")
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


  public Dashboard templateVariablePresets(List<DashboardTemplateVariablePreset> templateVariablePresets) {
    this.templateVariablePresets = JsonNullable.<List<DashboardTemplateVariablePreset>>of(templateVariablePresets);
    
    return this;
  }

  public Dashboard addTemplateVariablePresetsItem(DashboardTemplateVariablePreset templateVariablePresetsItem) {
    if (this.templateVariablePresets == null || !this.templateVariablePresets.isPresent()) {
      this.templateVariablePresets = JsonNullable.<List<DashboardTemplateVariablePreset>>of(new ArrayList<>());
    }
    try {
      this.templateVariablePresets.get().add(templateVariablePresetsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get templateVariablePresets
   * @return templateVariablePresets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<DashboardTemplateVariablePreset> getTemplateVariablePresets() {
        return templateVariablePresets.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEMPLATE_VARIABLE_PRESETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<DashboardTemplateVariablePreset>> getTemplateVariablePresets_JsonNullable() {
    return templateVariablePresets;
  }
  
  @JsonProperty(JSON_PROPERTY_TEMPLATE_VARIABLE_PRESETS)
  public void setTemplateVariablePresets_JsonNullable(JsonNullable<List<DashboardTemplateVariablePreset>> templateVariablePresets) {
    this.templateVariablePresets = templateVariablePresets;
  }

  public void setTemplateVariablePresets(List<DashboardTemplateVariablePreset> templateVariablePresets) {
    this.templateVariablePresets = JsonNullable.<List<DashboardTemplateVariablePreset>>of(templateVariablePresets);
  }


  public Dashboard templateVariables(List<DashboardTemplateVariables> templateVariables) {
    this.templateVariables = JsonNullable.<List<DashboardTemplateVariables>>of(templateVariables);
    
    return this;
  }

  public Dashboard addTemplateVariablesItem(DashboardTemplateVariables templateVariablesItem) {
    if (this.templateVariables == null || !this.templateVariables.isPresent()) {
      this.templateVariables = JsonNullable.<List<DashboardTemplateVariables>>of(new ArrayList<>());
    }
    try {
      this.templateVariables.get().add(templateVariablesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get templateVariables
   * @return templateVariables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<DashboardTemplateVariables> getTemplateVariables() {
        return templateVariables.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEMPLATE_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<DashboardTemplateVariables>> getTemplateVariables_JsonNullable() {
    return templateVariables;
  }
  
  @JsonProperty(JSON_PROPERTY_TEMPLATE_VARIABLES)
  public void setTemplateVariables_JsonNullable(JsonNullable<List<DashboardTemplateVariables>> templateVariables) {
    this.templateVariables = templateVariables;
  }

  public void setTemplateVariables(List<DashboardTemplateVariables> templateVariables) {
    this.templateVariables = JsonNullable.<List<DashboardTemplateVariables>>of(templateVariables);
  }


  public Dashboard title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Title of the dashboard
   * @return title
  **/
  @ApiModelProperty(required = true, value = "Title of the dashboard")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "/dashboard/123-abc-456/example-dashboard-title", value = "")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }




  public Dashboard widgets(List<Widget> widgets) {
    
    this.widgets = widgets;
    return this;
  }

  public Dashboard addWidgetsItem(Widget widgetsItem) {
    this.widgets.add(widgetsItem);
    return this;
  }

   /**
   * List of widgets to display on the dashboard
   * @return widgets
  **/
  @ApiModelProperty(required = true, value = "List of widgets to display on the dashboard")
  @JsonProperty(JSON_PROPERTY_WIDGETS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Widget> getWidgets() {
    return widgets;
  }


  public void setWidgets(List<Widget> widgets) {
    this.widgets = widgets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dashboard dashboard = (Dashboard) o;
    return Objects.equals(this.authorHandle, dashboard.authorHandle) &&
        Objects.equals(this.createdAt, dashboard.createdAt) &&
        Objects.equals(this.description, dashboard.description) &&
        Objects.equals(this.id, dashboard.id) &&
        Objects.equals(this.isReadOnly, dashboard.isReadOnly) &&
        Objects.equals(this.layoutType, dashboard.layoutType) &&
        Objects.equals(this.modifiedAt, dashboard.modifiedAt) &&
        Objects.equals(this.notifyList, dashboard.notifyList) &&
        Objects.equals(this.templateVariablePresets, dashboard.templateVariablePresets) &&
        Objects.equals(this.templateVariables, dashboard.templateVariables) &&
        Objects.equals(this.title, dashboard.title) &&
        Objects.equals(this.url, dashboard.url) &&
        Objects.equals(this.widgets, dashboard.widgets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorHandle, createdAt, description, id, isReadOnly, layoutType, modifiedAt, notifyList, templateVariablePresets, templateVariables, title, url, widgets);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dashboard {\n");
    sb.append("    authorHandle: ").append(toIndentedString(authorHandle)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isReadOnly: ").append(toIndentedString(isReadOnly)).append("\n");
    sb.append("    layoutType: ").append(toIndentedString(layoutType)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    notifyList: ").append(toIndentedString(notifyList)).append("\n");
    sb.append("    templateVariablePresets: ").append(toIndentedString(templateVariablePresets)).append("\n");
    sb.append("    templateVariables: ").append(toIndentedString(templateVariables)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    widgets: ").append(toIndentedString(widgets)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

