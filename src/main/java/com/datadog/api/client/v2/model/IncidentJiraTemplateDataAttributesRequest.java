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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes for creating or updating an incident Jira template. */
@JsonPropertyOrder({
  IncidentJiraTemplateDataAttributesRequest.JSON_PROPERTY_ACCOUNT_ID,
  IncidentJiraTemplateDataAttributesRequest.JSON_PROPERTY_FIELD_CONFIGURATIONS,
  IncidentJiraTemplateDataAttributesRequest.JSON_PROPERTY_FIELDS,
  IncidentJiraTemplateDataAttributesRequest.JSON_PROPERTY_IS_DEFAULT,
  IncidentJiraTemplateDataAttributesRequest.JSON_PROPERTY_ISSUE_ID,
  IncidentJiraTemplateDataAttributesRequest.JSON_PROPERTY_MAPPINGS,
  IncidentJiraTemplateDataAttributesRequest.JSON_PROPERTY_META,
  IncidentJiraTemplateDataAttributesRequest.JSON_PROPERTY_NAME,
  IncidentJiraTemplateDataAttributesRequest.JSON_PROPERTY_PROJECT_ID,
  IncidentJiraTemplateDataAttributesRequest.JSON_PROPERTY_PROJECT_KEY,
  IncidentJiraTemplateDataAttributesRequest.JSON_PROPERTY_SYNC_ENABLED,
  IncidentJiraTemplateDataAttributesRequest.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentJiraTemplateDataAttributesRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_FIELD_CONFIGURATIONS = "field_configurations";
  private List<IncidentJiraTemplateFieldConfiguration> fieldConfigurations = null;

  public static final String JSON_PROPERTY_FIELDS = "fields";
  private Map<String, Object> fields = null;

  public static final String JSON_PROPERTY_IS_DEFAULT = "is_default";
  private Boolean isDefault;

  public static final String JSON_PROPERTY_ISSUE_ID = "issue_id";
  private String issueId;

  public static final String JSON_PROPERTY_MAPPINGS = "mappings";
  private Map<String, Object> mappings = null;

  public static final String JSON_PROPERTY_META = "meta";
  private Map<String, Object> meta = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PROJECT_ID = "project_id";
  private String projectId;

  public static final String JSON_PROPERTY_PROJECT_KEY = "project_key";
  private String projectKey;

  public static final String JSON_PROPERTY_SYNC_ENABLED = "sync_enabled";
  private Boolean syncEnabled;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public IncidentJiraTemplateDataAttributesRequest() {}

  @JsonCreator
  public IncidentJiraTemplateDataAttributesRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACCOUNT_ID) String accountId,
      @JsonProperty(required = true, value = JSON_PROPERTY_ISSUE_ID) String issueId,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROJECT_ID) String projectId,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROJECT_KEY) String projectKey) {
    this.accountId = accountId;
    this.issueId = issueId;
    this.projectId = projectId;
    this.projectKey = projectKey;
  }

  public IncidentJiraTemplateDataAttributesRequest accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The Jira account identifier.
   *
   * @return accountId
   */
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public IncidentJiraTemplateDataAttributesRequest fieldConfigurations(
      List<IncidentJiraTemplateFieldConfiguration> fieldConfigurations) {
    this.fieldConfigurations = fieldConfigurations;
    for (IncidentJiraTemplateFieldConfiguration item : fieldConfigurations) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public IncidentJiraTemplateDataAttributesRequest addFieldConfigurationsItem(
      IncidentJiraTemplateFieldConfiguration fieldConfigurationsItem) {
    if (this.fieldConfigurations == null) {
      this.fieldConfigurations = new ArrayList<>();
    }
    this.fieldConfigurations.add(fieldConfigurationsItem);
    this.unparsed |= fieldConfigurationsItem.unparsed;
    return this;
  }

  /**
   * Field configuration mappings.
   *
   * @return fieldConfigurations
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIELD_CONFIGURATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<IncidentJiraTemplateFieldConfiguration> getFieldConfigurations() {
    return fieldConfigurations;
  }

  public void setFieldConfigurations(
      List<IncidentJiraTemplateFieldConfiguration> fieldConfigurations) {
    this.fieldConfigurations = fieldConfigurations;
  }

  public IncidentJiraTemplateDataAttributesRequest fields(Map<String, Object> fields) {
    this.fields = fields;
    return this;
  }

  public IncidentJiraTemplateDataAttributesRequest putFieldsItem(String key, Object fieldsItem) {
    if (this.fields == null) {
      this.fields = new HashMap<>();
    }
    this.fields.put(key, fieldsItem);
    return this;
  }

  /**
   * The Jira fields configuration.
   *
   * @return fields
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getFields() {
    return fields;
  }

  public void setFields(Map<String, Object> fields) {
    this.fields = fields;
  }

  public IncidentJiraTemplateDataAttributesRequest isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Whether this is the default template.
   *
   * @return isDefault
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public IncidentJiraTemplateDataAttributesRequest issueId(String issueId) {
    this.issueId = issueId;
    return this;
  }

  /**
   * The Jira issue type identifier.
   *
   * @return issueId
   */
  @JsonProperty(JSON_PROPERTY_ISSUE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getIssueId() {
    return issueId;
  }

  public void setIssueId(String issueId) {
    this.issueId = issueId;
  }

  public IncidentJiraTemplateDataAttributesRequest mappings(Map<String, Object> mappings) {
    this.mappings = mappings;
    return this;
  }

  public IncidentJiraTemplateDataAttributesRequest putMappingsItem(
      String key, Object mappingsItem) {
    if (this.mappings == null) {
      this.mappings = new HashMap<>();
    }
    this.mappings.put(key, mappingsItem);
    return this;
  }

  /**
   * The field mappings configuration.
   *
   * @return mappings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAPPINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getMappings() {
    return mappings;
  }

  public void setMappings(Map<String, Object> mappings) {
    this.mappings = mappings;
  }

  public IncidentJiraTemplateDataAttributesRequest meta(Map<String, Object> meta) {
    this.meta = meta;
    return this;
  }

  public IncidentJiraTemplateDataAttributesRequest putMetaItem(String key, Object metaItem) {
    if (this.meta == null) {
      this.meta = new HashMap<>();
    }
    this.meta.put(key, metaItem);
    return this;
  }

  /**
   * Additional metadata for the template.
   *
   * @return meta
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getMeta() {
    return meta;
  }

  public void setMeta(Map<String, Object> meta) {
    this.meta = meta;
  }

  public IncidentJiraTemplateDataAttributesRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the template.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IncidentJiraTemplateDataAttributesRequest projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * The Jira project identifier.
   *
   * @return projectId
   */
  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public IncidentJiraTemplateDataAttributesRequest projectKey(String projectKey) {
    this.projectKey = projectKey;
    return this;
  }

  /**
   * The Jira project key.
   *
   * @return projectKey
   */
  @JsonProperty(JSON_PROPERTY_PROJECT_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getProjectKey() {
    return projectKey;
  }

  public void setProjectKey(String projectKey) {
    this.projectKey = projectKey;
  }

  public IncidentJiraTemplateDataAttributesRequest syncEnabled(Boolean syncEnabled) {
    this.syncEnabled = syncEnabled;
    return this;
  }

  /**
   * Whether synchronization is enabled.
   *
   * @return syncEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYNC_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSyncEnabled() {
    return syncEnabled;
  }

  public void setSyncEnabled(Boolean syncEnabled) {
    this.syncEnabled = syncEnabled;
  }

  public IncidentJiraTemplateDataAttributesRequest type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the template.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
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
   * @return IncidentJiraTemplateDataAttributesRequest
   */
  @JsonAnySetter
  public IncidentJiraTemplateDataAttributesRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentJiraTemplateDataAttributesRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentJiraTemplateDataAttributesRequest incidentJiraTemplateDataAttributesRequest =
        (IncidentJiraTemplateDataAttributesRequest) o;
    return Objects.equals(this.accountId, incidentJiraTemplateDataAttributesRequest.accountId)
        && Objects.equals(
            this.fieldConfigurations, incidentJiraTemplateDataAttributesRequest.fieldConfigurations)
        && Objects.equals(this.fields, incidentJiraTemplateDataAttributesRequest.fields)
        && Objects.equals(this.isDefault, incidentJiraTemplateDataAttributesRequest.isDefault)
        && Objects.equals(this.issueId, incidentJiraTemplateDataAttributesRequest.issueId)
        && Objects.equals(this.mappings, incidentJiraTemplateDataAttributesRequest.mappings)
        && Objects.equals(this.meta, incidentJiraTemplateDataAttributesRequest.meta)
        && Objects.equals(this.name, incidentJiraTemplateDataAttributesRequest.name)
        && Objects.equals(this.projectId, incidentJiraTemplateDataAttributesRequest.projectId)
        && Objects.equals(this.projectKey, incidentJiraTemplateDataAttributesRequest.projectKey)
        && Objects.equals(this.syncEnabled, incidentJiraTemplateDataAttributesRequest.syncEnabled)
        && Objects.equals(this.type, incidentJiraTemplateDataAttributesRequest.type)
        && Objects.equals(
            this.additionalProperties,
            incidentJiraTemplateDataAttributesRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        fieldConfigurations,
        fields,
        isDefault,
        issueId,
        mappings,
        meta,
        name,
        projectId,
        projectKey,
        syncEnabled,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentJiraTemplateDataAttributesRequest {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    fieldConfigurations: ")
        .append(toIndentedString(fieldConfigurations))
        .append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
    sb.append("    mappings: ").append(toIndentedString(mappings)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    projectKey: ").append(toIndentedString(projectKey)).append("\n");
    sb.append("    syncEnabled: ").append(toIndentedString(syncEnabled)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
